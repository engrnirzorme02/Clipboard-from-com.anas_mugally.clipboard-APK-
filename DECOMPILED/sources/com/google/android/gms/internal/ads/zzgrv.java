package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgrv {
    private zzgsc zza = null;
    private zzhgh zzb = null;
    private Integer zzc = null;

    private zzgrv() {
    }

    public final zzgrv zza(zzgsc zzgscVar) {
        this.zza = zzgscVar;
        return this;
    }

    public final zzgrv zzb(zzhgh zzhghVar) {
        this.zzb = zzhghVar;
        return this;
    }

    public final zzgrv zzc(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgrw zzd() throws GeneralSecurityException {
        zzhgh zzhghVar;
        zzhgg zzhggVarZzb;
        zzgsc zzgscVar = this.zza;
        if (zzgscVar == null || (zzhghVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzgscVar.zzc() != zzhghVar.zzd()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzgscVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zze() == zzgsb.zzc) {
            zzhggVarZzb = zzgyp.zza;
        } else if (this.zza.zze() == zzgsb.zzb) {
            zzhggVarZzb = zzgyp.zza(this.zzc.intValue());
        } else {
            if (this.zza.zze() != zzgsb.zza) {
                throw new IllegalStateException("Unknown AesEaxParameters.Variant: ".concat(String.valueOf(this.zza.zze())));
            }
            zzhggVarZzb = zzgyp.zzb(this.zzc.intValue());
        }
        return new zzgrw(this.zza, this.zzb, zzhggVarZzb, this.zzc, null);
    }

    /* synthetic */ zzgrv(byte[] bArr) {
    }
}
