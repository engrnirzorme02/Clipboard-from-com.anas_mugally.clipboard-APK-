package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzewy implements zzhpx {
    private final zzewu zza;

    private zzewy(zzewu zzewuVar) {
        this.zza = zzewuVar;
    }

    public static zzewy zzc(zzewu zzewuVar) {
        return new zzewy(zzewuVar);
    }

    public static boolean zzd(zzewu zzewuVar) {
        return zzewuVar.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Boolean zzb() {
        return Boolean.valueOf(this.zza.zzg());
    }
}
