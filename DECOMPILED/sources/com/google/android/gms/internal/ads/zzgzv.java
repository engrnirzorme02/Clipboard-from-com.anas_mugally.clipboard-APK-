package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgzv {
    private zzhad zza = null;
    private zzhgh zzb = null;
    private Integer zzc = null;

    private zzgzv() {
    }

    public final zzgzv zza(zzhad zzhadVar) {
        this.zza = zzhadVar;
        return this;
    }

    public final zzgzv zzb(zzhgh zzhghVar) {
        this.zzb = zzhghVar;
        return this;
    }

    public final zzgzv zzc(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgzw zzd() throws GeneralSecurityException {
        zzhgh zzhghVar;
        zzhgg zzhggVarZza;
        zzhad zzhadVar = this.zza;
        if (zzhadVar == null || (zzhghVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzhadVar.zzc() != zzhghVar.zzd()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzhadVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzf() == zzhac.zzd) {
            zzhggVarZza = zzgyp.zza;
        } else if (this.zza.zzf() == zzhac.zzc || this.zza.zzf() == zzhac.zzb) {
            zzhggVarZza = zzgyp.zza(this.zzc.intValue());
        } else {
            if (this.zza.zzf() != zzhac.zza) {
                throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(this.zza.zzf())));
            }
            zzhggVarZza = zzgyp.zzb(this.zzc.intValue());
        }
        return new zzgzw(this.zza, this.zzb, zzhggVarZza, this.zzc, null);
    }

    /* synthetic */ zzgzv(byte[] bArr) {
    }
}
