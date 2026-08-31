package com.google.android.gms.internal.p411firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzqb implements zzqf {
    private final String zza;
    private final zzaaj zzb;
    private final zzajv zzc;
    private final zzwx.zzb zzd;
    private final zzxz zze;
    private final Integer zzf;

    private zzqb(String str, zzaaj zzaajVar, zzajv zzajvVar, zzwx.zzb zzbVar, zzxz zzxzVar, Integer num) {
        this.zza = str;
        this.zzb = zzaajVar;
        this.zzc = zzajvVar;
        this.zzd = zzbVar;
        this.zze = zzxzVar;
        this.zzf = num;
    }

    public static zzqb zza(String str, zzajv zzajvVar, zzwx.zzb zzbVar, zzxz zzxzVar, Integer num) throws GeneralSecurityException {
        if (zzxzVar == zzxz.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new zzqb(str, zzqn.zza(str), zzajvVar, zzbVar, zzxzVar, num);
    }

    public final zzxz zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzqf
    public final zzaaj zzc() {
        return this.zzb;
    }

    public final zzajv zzd() {
        return this.zzc;
    }

    public final Integer zze() {
        return this.zzf;
    }

    public final String zzf() {
        return this.zza;
    }

    public final zzwx.zzb zza() {
        return this.zzd;
    }
}
