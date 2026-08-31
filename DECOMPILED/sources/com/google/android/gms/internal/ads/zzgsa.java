package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgsa {
    private Integer zza = null;
    private Integer zzb = null;
    private Integer zzc = null;
    private zzgsb zzd = zzgsb.zzc;

    private zzgsa() {
    }

    public final zzgsa zza(int i7) throws InvalidAlgorithmParameterException {
        if (i7 != 16 && i7 != 24 && i7 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i7)));
        }
        this.zza = Integer.valueOf(i7);
        return this;
    }

    public final zzgsa zzb(int i7) throws GeneralSecurityException {
        if (i7 != 12 && i7 != 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i7)));
        }
        this.zzb = Integer.valueOf(i7);
        return this;
    }

    public final zzgsa zzc(int i7) {
        this.zzc = 16;
        return this;
    }

    public final zzgsa zzd(zzgsb zzgsbVar) {
        this.zzd = zzgsbVar;
        return this;
    }

    public final zzgsc zze() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (this.zzd == null) {
            throw new GeneralSecurityException("Variant is not set");
        }
        if (this.zzc == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        int iIntValue = num.intValue();
        int iIntValue2 = this.zzb.intValue();
        this.zzc.getClass();
        return new zzgsc(iIntValue, iIntValue2, 16, this.zzd, null);
    }

    /* synthetic */ zzgsa(byte[] bArr) {
    }
}
