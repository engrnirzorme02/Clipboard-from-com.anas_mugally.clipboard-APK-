package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhff implements zzgpx {
    private static final ThreadLocal zza = new zzhfe();
    private final byte[] zzb;
    private final zzhbw zzc;
    private final SecretKeySpec zzd;
    private final int zze;

    private zzhff(byte[] bArr, int i7, byte[] bArr2) throws GeneralSecurityException {
        if (!zzgxd.zza(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i7 != 12 && i7 != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.zze = i7;
        int length = bArr.length;
        zzhge.zza(length);
        this.zzd = new SecretKeySpec(bArr, "AES");
        this.zzc = zzhga.zzb(zzhbu.zzb(zzhbv.zzb(length), zzhgh.zza(bArr, zzgqc.zza())));
        this.zzb = bArr2;
    }

    public static zzgpx zzb(zzgrw zzgrwVar) throws GeneralSecurityException {
        if (!zzgxd.zza(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        zzgrwVar.zze();
        return new zzhff(zzgrwVar.zzd().zzc(zzgqc.zza()), zzgrwVar.zze().zzd(), zzgrwVar.zzb().zzc());
    }

    private final byte[] zzc(int i7, byte[] bArr, int i8, int i9) {
        byte[] bArr2 = new byte[i9 + 16];
        bArr2[15] = (byte) i7;
        System.arraycopy(bArr, i8, bArr2, 16, i9);
        return this.zzc.zza(bArr2, 16);
    }

    @Override // com.google.android.gms.internal.ads.zzgpx
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzb;
        int length = bArr.length;
        int length2 = bArr3.length;
        int i7 = this.zze;
        int i8 = ((length - length2) - i7) - 16;
        if (i8 < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!zzgzu.zzc(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArrZzc = zzc(0, bArr, length2, i7);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArrZzc2 = zzc(1, bArr2, 0, bArr2.length);
        byte[] bArrZzc3 = zzc(2, bArr, length2 + i7, i8);
        int i9 = length - 16;
        byte b7 = 0;
        for (int i10 = 0; i10 < 16; i10++) {
            b7 = (byte) (b7 | (((bArr[i9 + i10] ^ bArrZzc2[i10]) ^ bArrZzc[i10]) ^ bArrZzc3[i10]));
        }
        if (b7 != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher = (Cipher) zza.get();
        cipher.init(1, this.zzd, new IvParameterSpec(bArrZzc));
        return cipher.doFinal(bArr, bArr3.length + i7, i8);
    }
}
