package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgsd {
    private zzgsl zza = null;
    private zzhgh zzb = null;
    private Integer zzc = null;

    private zzgsd() {
    }

    public final zzgsd zza(zzgsl zzgslVar) {
        this.zza = zzgslVar;
        return this;
    }

    public final zzgsd zzb(zzhgh zzhghVar) {
        this.zzb = zzhghVar;
        return this;
    }

    public final zzgsd zzc(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgse zzd() throws GeneralSecurityException {
        zzhgh zzhghVar;
        zzhgg zzhggVarZzb;
        zzgsl zzgslVar = this.zza;
        if (zzgslVar == null || (zzhghVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzgslVar.zzc() != zzhghVar.zzd()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzgslVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzd() == zzgsk.zzc) {
            zzhggVarZzb = zzgyp.zza;
        } else if (this.zza.zzd() == zzgsk.zzb) {
            zzhggVarZzb = zzgyp.zza(this.zzc.intValue());
        } else {
            if (this.zza.zzd() != zzgsk.zza) {
                throw new IllegalStateException("Unknown AesGcmParameters.Variant: ".concat(String.valueOf(this.zza.zzd())));
            }
            zzhggVarZzb = zzgyp.zzb(this.zzc.intValue());
        }
        return new zzgse(this.zza, this.zzb, zzhggVarZzb, this.zzc, null);
    }

    /* synthetic */ zzgsd(byte[] bArr) {
    }
}
