package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgzj implements zzgzn {
    private final String zza;
    private final zzhgg zzb;
    private final zzhhb zzc;
    private final zzhds zzd;
    private final zzhep zze;
    private final Integer zzf;

    private zzgzj(String str, zzhgg zzhggVar, zzhhb zzhhbVar, zzhds zzhdsVar, zzhep zzhepVar, Integer num) {
        this.zza = str;
        this.zzb = zzhggVar;
        this.zzc = zzhhbVar;
        this.zzd = zzhdsVar;
        this.zze = zzhepVar;
        this.zzf = num;
    }

    public static zzgzj zza(String str, zzhhb zzhhbVar, zzhds zzhdsVar, zzhep zzhepVar, Integer num) throws GeneralSecurityException {
        if (zzhepVar == zzhep.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new zzgzj(str, zzgzu.zzb(str), zzhhbVar, zzhdsVar, zzhepVar, num);
    }

    public final zzhhb zzb() {
        return this.zzc;
    }

    public final zzhds zzc() {
        return this.zzd;
    }

    public final zzhep zzd() {
        return this.zze;
    }

    public final Integer zze() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzgzn
    public final zzhgg zzf() {
        return this.zzb;
    }

    public final String zzg() {
        return this.zza;
    }
}
