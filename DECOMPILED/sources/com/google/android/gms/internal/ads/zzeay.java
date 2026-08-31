package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeay implements zzhpx {
    private final zzhqg zza;

    private zzeay(zzhqg zzhqgVar) {
        this.zza = zzhqgVar;
    }

    public static zzeay zzc(zzhqg zzhqgVar) {
        return new zzeay(zzhqgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeax zzb() {
        return new zzeax(((zzcia) this.zza).zzb());
    }
}
