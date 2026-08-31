package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhfj implements zzgpx {
    private final zzhfy zza;
    private final zzgqr zzb;
    private final int zzc;
    private final byte[] zzd;

    private zzhfj(zzhfy zzhfyVar, zzgqr zzgqrVar, int i7, byte[] bArr) {
        this.zza = zzhfyVar;
        this.zzb = zzgqrVar;
        this.zzc = i7;
        this.zzd = bArr;
    }

    public static zzgpx zzb(zzgrm zzgrmVar) {
        zzhfd zzhfdVar = new zzhfd(zzgrmVar.zzd().zzc(zzgqc.zza()), zzgrmVar.zzf().zzf());
        String strValueOf = String.valueOf(zzgrmVar.zzf().zzh());
        return new zzhfj(zzhfdVar, new zzhgd(new zzhgc("HMAC".concat(strValueOf), new SecretKeySpec(zzgrmVar.zze().zzc(zzgqc.zza()), "HMAC")), zzgrmVar.zzf().zze()), zzgrmVar.zzf().zze(), zzgrmVar.zzb().zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzgpx
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzd;
        int length = bArr.length;
        int i7 = this.zzc;
        int length2 = bArr3.length;
        if (length < i7 + length2) {
            throw new GeneralSecurityException("Decryption failed (ciphertext too short).");
        }
        if (!zzgzu.zzc(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        int i8 = length - i7;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, length2, i8);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, i8, length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArrCopyOf = Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8);
        if (MessageDigest.isEqual(((zzhgd) this.zzb).zzc(zzhfh.zza(bArr2, bArrCopyOfRange, bArrCopyOf)), bArrCopyOfRange2)) {
            return this.zza.zza(bArrCopyOfRange);
        }
        throw new GeneralSecurityException("invalid MAC");
    }
}
