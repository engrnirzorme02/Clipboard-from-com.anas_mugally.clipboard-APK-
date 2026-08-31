package com.google.android.gms.internal.p411firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes2.dex */
public final class zzyy implements zzba {
    private static final zziv.zza zza = zziv.zza.zzb;
    private final SecretKey zzb;
    private final byte[] zzc;

    private zzyy(byte[] bArr, zzaaj zzaajVar) throws GeneralSecurityException {
        if (!zza.zza()) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.zzb = zzgr.zzb(bArr);
        this.zzc = zzaajVar.zzb();
    }

    public static zzba zza(zzds zzdsVar) throws GeneralSecurityException {
        if (((zzdx) ((zzcy) zzdsVar.zza())).zzb() != 12) {
            throw new GeneralSecurityException("Expected IV Size 12, got " + ((zzdx) ((zzcy) zzdsVar.zza())).zzb());
        }
        if (((zzdx) ((zzcy) zzdsVar.zza())).zzd() == 16) {
            return new zzyy(zzdsVar.zzf().zza(zzbf.zza()), zzdsVar.zzd());
        }
        throw new GeneralSecurityException("Expected tag Size 16, got " + ((zzdx) ((zzcy) zzdsVar.zza())).zzd());
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzba
    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("plaintext is null");
        }
        byte[] bArrZza = zzqd.zza(12);
        AlgorithmParameterSpec algorithmParameterSpecZza = zzgr.zza(bArrZza);
        Cipher cipherZza = zzgr.zza();
        cipherZza.init(1, this.zzb, algorithmParameterSpecZza);
        if (bArr2 != null && bArr2.length != 0) {
            cipherZza.updateAAD(bArr2);
        }
        int outputSize = cipherZza.getOutputSize(bArr.length);
        byte[] bArr3 = this.zzc;
        if (outputSize > 2147483635 - bArr3.length) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length + 12 + outputSize);
        System.arraycopy(bArrZza, 0, bArrCopyOf, this.zzc.length, 12);
        if (cipherZza.doFinal(bArr, 0, bArr.length, bArrCopyOf, this.zzc.length + 12) == outputSize) {
            return bArrCopyOf;
        }
        throw new GeneralSecurityException("not enough data written");
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzba
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr != null) {
            int length = bArr.length;
            byte[] bArr3 = this.zzc;
            if (length >= bArr3.length + 28) {
                if (zzqn.zza(bArr3, bArr)) {
                    AlgorithmParameterSpec algorithmParameterSpecZza = zzgr.zza(bArr, this.zzc.length, 12);
                    Cipher cipherZza = zzgr.zza();
                    cipherZza.init(2, this.zzb, algorithmParameterSpecZza);
                    if (bArr2 != null && bArr2.length != 0) {
                        cipherZza.updateAAD(bArr2);
                    }
                    byte[] bArr4 = this.zzc;
                    return cipherZza.doFinal(bArr, bArr4.length + 12, (bArr.length - bArr4.length) - 12);
                }
                throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
            }
            throw new GeneralSecurityException("ciphertext too short");
        }
        throw new NullPointerException("ciphertext is null");
    }
}
