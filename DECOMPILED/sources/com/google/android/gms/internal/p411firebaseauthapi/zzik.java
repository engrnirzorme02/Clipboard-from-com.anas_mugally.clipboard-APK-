package com.google.android.gms.internal.p411firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class zzik implements zzba {
    private static final zziv.zza zza = zziv.zza.zza;
    private final byte[] zzb;
    private final byte[] zzc;

    private zzik(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!zza.zza()) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        if (!zza()) {
            throw new GeneralSecurityException("JCE does not support algorithm: ChaCha20-Poly1305");
        }
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.zzb = bArr;
        this.zzc = bArr2;
    }

    public static zzba zza(zzgb zzgbVar) {
        return new zzik(zzgbVar.zze().zza(zzbf.zza()), zzgbVar.zzd().zzb());
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzba
    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("plaintext is null");
        }
        byte[] bArrZza = zzqd.zza(24);
        SecretKeySpec secretKeySpec = new SecretKeySpec(zzhp.zza(this.zzb, bArrZza), "ChaCha20");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(zza(bArrZza));
        Cipher cipherZza = zzhh.zza();
        cipherZza.init(1, secretKeySpec, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipherZza.updateAAD(bArr2);
        }
        int outputSize = cipherZza.getOutputSize(bArr.length);
        byte[] bArr3 = this.zzc;
        if (outputSize > 2147483623 - bArr3.length) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length + 24 + outputSize);
        System.arraycopy(bArrZza, 0, bArrCopyOf, this.zzc.length, 24);
        if (cipherZza.doFinal(bArr, 0, bArr.length, bArrCopyOf, this.zzc.length + 24) == outputSize) {
            return bArrCopyOf;
        }
        throw new GeneralSecurityException("not enough data written");
    }

    public static boolean zza() {
        return zzhh.zza() != null;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzba
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr != null) {
            int length = bArr.length;
            byte[] bArr3 = this.zzc;
            if (length >= bArr3.length + 40) {
                if (zzqn.zza(bArr3, bArr)) {
                    byte[] bArr4 = new byte[24];
                    System.arraycopy(bArr, this.zzc.length, bArr4, 0, 24);
                    SecretKeySpec secretKeySpec = new SecretKeySpec(zzhp.zza(this.zzb, bArr4), "ChaCha20");
                    IvParameterSpec ivParameterSpec = new IvParameterSpec(zza(bArr4));
                    Cipher cipherZza = zzhh.zza();
                    cipherZza.init(2, secretKeySpec, ivParameterSpec);
                    if (bArr2 != null && bArr2.length != 0) {
                        cipherZza.updateAAD(bArr2);
                    }
                    byte[] bArr5 = this.zzc;
                    return cipherZza.doFinal(bArr, bArr5.length + 24, (bArr.length - bArr5.length) - 24);
                }
                throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
            }
            throw new GeneralSecurityException("ciphertext too short");
        }
        throw new NullPointerException("ciphertext is null");
    }

    private static byte[] zza(byte[] bArr) {
        byte[] bArr2 = new byte[12];
        System.arraycopy(bArr, 16, bArr2, 4, 8);
        return bArr2;
    }
}
