package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhah {
    private zzhar zza = null;
    private zzhgh zzb = null;
    private Integer zzc = null;

    private zzhah() {
    }

    public final zzhah zza(zzhar zzharVar) {
        this.zza = zzharVar;
        return this;
    }

    public final zzhah zzb(zzhgh zzhghVar) {
        this.zzb = zzhghVar;
        return this;
    }

    public final zzhah zzc(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzhai zzd() throws GeneralSecurityException {
        zzhgh zzhghVar;
        zzhgg zzhggVarZza;
        zzhar zzharVar = this.zza;
        if (zzharVar == null || (zzhghVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzharVar.zzc() != zzhghVar.zzd()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzharVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzf() == zzhaq.zzd) {
            zzhggVarZza = zzgyp.zza;
        } else if (this.zza.zzf() == zzhaq.zzc || this.zza.zzf() == zzhaq.zzb) {
            zzhggVarZza = zzgyp.zza(this.zzc.intValue());
        } else {
            if (this.zza.zzf() != zzhaq.zza) {
                throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(String.valueOf(this.zza.zzf())));
            }
            zzhggVarZza = zzgyp.zzb(this.zzc.intValue());
        }
        return new zzhai(this.zza, this.zzb, zzhggVarZza, this.zzc, null);
    }

    /* synthetic */ zzhah(byte[] bArr) {
    }
}
