package com.google.android.gms.internal.p411firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: loaded from: classes2.dex */
final class zzll implements zzly {
    private final int zza;

    zzll(int i7) throws InvalidAlgorithmParameterException {
        if (i7 == 16 || i7 == 32) {
            this.zza = i7;
        } else {
            throw new InvalidAlgorithmParameterException("Unsupported key length: " + i7);
        }
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzly
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzly
    public final int zzb() {
        return 12;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzly
    public final byte[] zzc() throws GeneralSecurityException {
        int i7 = this.zza;
        if (i7 == 16) {
            return zzmk.zzi;
        }
        if (i7 == 32) {
            return zzmk.zzj;
        }
        throw new GeneralSecurityException("Could not determine HPKE AEAD ID");
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzly
    public final byte[] zza(byte[] bArr, byte[] bArr2, byte[] bArr3, int i7, byte[] bArr4) throws InvalidAlgorithmParameterException {
        if (bArr.length == this.zza) {
            return new zzhs(bArr).zza(bArr2, bArr3, i7, bArr4);
        }
        throw new InvalidAlgorithmParameterException("Unexpected key length: " + bArr.length);
    }
}
