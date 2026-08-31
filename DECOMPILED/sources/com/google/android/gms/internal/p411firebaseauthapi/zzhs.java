package com.google.android.gms.internal.p411firebaseauthapi;

import com.google.android.gms.common.api.C3553a;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhs {
    private static final zziv.zza zza = zziv.zza.zzb;
    private final SecretKey zzb;

    public zzhs(byte[] bArr) throws GeneralSecurityException {
        if (!zza.zza()) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.zzb = zzgr.zzb(bArr);
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2, int i7, byte[] bArr3) throws GeneralSecurityException {
        if (bArr.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        if (bArr2.length < i7 + 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        AlgorithmParameterSpec algorithmParameterSpecZza = zzgr.zza(bArr);
        Cipher cipherZza = zzgr.zza();
        cipherZza.init(2, this.zzb, algorithmParameterSpecZza);
        if (bArr3 != null && bArr3.length != 0) {
            cipherZza.updateAAD(bArr3);
        }
        return cipherZza.doFinal(bArr2, i7, bArr2.length - i7);
    }

    public final byte[] zzb(byte[] bArr, byte[] bArr2, int i7, byte[] bArr3) throws GeneralSecurityException {
        if (bArr.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        AlgorithmParameterSpec algorithmParameterSpecZza = zzgr.zza(bArr);
        Cipher cipherZza = zzgr.zza();
        cipherZza.init(1, this.zzb, algorithmParameterSpecZza);
        if (bArr3 != null && bArr3.length != 0) {
            cipherZza.updateAAD(bArr3);
        }
        int outputSize = cipherZza.getOutputSize(bArr2.length);
        if (outputSize > C3553a.e.API_PRIORITY_OTHER - i7) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr4 = new byte[i7 + outputSize];
        if (cipherZza.doFinal(bArr2, 0, bArr2.length, bArr4, i7) == outputSize) {
            return bArr4;
        }
        throw new GeneralSecurityException("not enough data written");
    }
}
