package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgwl implements zzgpx {
    private final byte[] zza;
    private final int zzb;
    private final zzhbw zzc;

    private zzgwl(byte[] bArr, zzhgg zzhggVar, int i7) {
        this.zzc = zzhga.zzb(zzhbu.zzb(zzhbv.zzb(bArr.length), zzhgh.zza(bArr, zzgqc.zza())));
        this.zza = zzhggVar.zzc();
        this.zzb = i7;
    }

    public static zzgpx zzb(zzguk zzgukVar) {
        zzgukVar.zze();
        zzgukVar.zze();
        return new zzgwl(zzgukVar.zzd().zzc(zzgqc.zza()), zzgukVar.zzb(), zzgukVar.zze().zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzgpx
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        byte[] bArr3 = this.zza;
        int i7 = this.zzb;
        int length = bArr.length;
        int length2 = bArr3.length;
        int i8 = i7 + length2;
        if (length < i8 + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!zzgzu.zzc(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, length2, i8);
        byte[] bArr4 = {0, 1, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        byte[] bArr5 = {0, 2, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int length3 = bArrCopyOfRange.length;
        if (length3 > 12 || length3 < 8) {
            throw new GeneralSecurityException("invalid salt size");
        }
        System.arraycopy(bArrCopyOfRange, 0, bArr4, 4, length3);
        System.arraycopy(bArrCopyOfRange, 0, bArr5, 4, length3);
        zzhbw zzhbwVar = this.zzc;
        byte[] bArr6 = new byte[32];
        System.arraycopy(zzhbwVar.zza(bArr4, 16), 0, bArr6, 0, 16);
        System.arraycopy(zzhbwVar.zza(bArr5, 16), 0, bArr6, 16, 16);
        if (!zzgxd.zza(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        SecretKey secretKeyZzb = zzgvi.zzb(bArr6);
        int i9 = i8 + 12;
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, i8, i9);
        if (bArrCopyOfRange2.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        if (length < i8 + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        AlgorithmParameterSpec algorithmParameterSpecZzc = zzgvi.zzc(bArrCopyOfRange2, 0, 12);
        Cipher cipherZza = zzgvi.zza();
        cipherZza.init(2, secretKeyZzb, algorithmParameterSpecZzc);
        if (bArr2 != null && bArr2.length != 0) {
            cipherZza.updateAAD(bArr2);
        }
        return cipherZza.doFinal(bArr, i9, length - i9);
    }
}
