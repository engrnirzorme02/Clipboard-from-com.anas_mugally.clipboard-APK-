package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgvp implements zzgpx {
    private static final byte[] zza = zzhfx.zza("7a806c");
    private static final byte[] zzb = zzhfx.zza("46bb91c3c5");
    private static final byte[] zzc = zzhfx.zza("36864200e0eaf5284d884a0e77d31646");
    private static final byte[] zzd = zzhfx.zza("bae8e37fc83441b16034566b");
    private static final byte[] zze = zzhfx.zza("af60eb711bd85bc1e4d3e0a462e074eea428a8");
    private final zzgvo zzf;
    private final SecretKey zzg;
    private final byte[] zzh;

    private zzgvp(byte[] bArr, byte[] bArr2, zzgvo zzgvoVar) throws InvalidAlgorithmParameterException {
        this.zzh = bArr2;
        zzhge.zza(bArr.length);
        this.zzg = new SecretKeySpec(bArr, "AES");
        this.zzf = zzgvoVar;
    }

    public static boolean zzb(Cipher cipher) {
        try {
            byte[] bArr = zzd;
            cipher.init(2, new SecretKeySpec(zzc, "AES"), new GCMParameterSpec(128, bArr, 0, bArr.length));
            cipher.updateAAD(zzb);
            byte[] bArr2 = zze;
            return MessageDigest.isEqual(cipher.doFinal(bArr2, 0, bArr2.length), zza);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    public static zzgpx zzc(zzgsn zzgsnVar, zzgvo zzgvoVar) {
        if (zzb((Cipher) zzgvoVar.zza())) {
            return new zzgvp(zzgsnVar.zzd().zzc(zzgqc.zza()), zzgsnVar.zzb().zzc(), zzgvoVar);
        }
        throw new IllegalStateException("Cipher does not implement AES GCM SIV.");
    }

    @Override // com.google.android.gms.internal.ads.zzgpx
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.zzh;
        int length2 = bArr3.length;
        if (length < length2 + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!zzgzu.zzc(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        Cipher cipher = (Cipher) this.zzf.zza();
        cipher.init(2, this.zzg, new GCMParameterSpec(128, bArr, length2, 12));
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        return cipher.doFinal(bArr, length2 + 12, (length - length2) - 12);
    }
}
