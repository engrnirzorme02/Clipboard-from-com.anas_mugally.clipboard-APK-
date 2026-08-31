package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcou implements zzhpx {
    private final zzcor zza;

    private zzcou(zzcor zzcorVar) {
        this.zza = zzcorVar;
    }

    public static zzcou zzc(zzcor zzcorVar) {
        return new zzcou(zzcorVar);
    }

    public static zzfck zzd(zzcor zzcorVar) {
        zzfck zzfckVarZzd = zzcorVar.zzd();
        zzhqf.zzb(zzfckVarZzd);
        return zzfckVarZzd;
    }

    public final zzfck zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
