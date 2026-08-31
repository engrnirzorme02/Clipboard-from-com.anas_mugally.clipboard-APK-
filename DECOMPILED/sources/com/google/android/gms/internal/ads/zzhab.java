package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhab {
    private Integer zza = null;
    private Integer zzb = null;
    private zzhac zzc = zzhac.zzd;

    private zzhab() {
    }

    public final zzhab zza(int i7) throws InvalidAlgorithmParameterException {
        if (i7 != 16 && i7 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i7 * 8)));
        }
        this.zza = Integer.valueOf(i7);
        return this;
    }

    public final zzhab zzb(int i7) throws GeneralSecurityException {
        if (i7 >= 10 && i7 <= 16) {
            this.zzb = Integer.valueOf(i7);
            return this;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 40);
        sb.append("Invalid tag size for AesCmacParameters: ");
        sb.append(i7);
        throw new GeneralSecurityException(sb.toString());
    }

    public final zzhab zzc(zzhac zzhacVar) {
        this.zzc = zzhacVar;
        return this;
    }

    public final zzhad zzd() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("key size not set");
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("tag size not set");
        }
        if (this.zzc != null) {
            return new zzhad(num.intValue(), this.zzb.intValue(), this.zzc, null);
        }
        throw new GeneralSecurityException("variant not set");
    }

    /* synthetic */ zzhab(byte[] bArr) {
    }
}
