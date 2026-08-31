package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcwg implements zzhpx {
    private final zzhqg zza;

    private zzcwg(zzhqg zzhqgVar) {
        this.zza = zzhqgVar;
    }

    public static zzcwg zzc(zzhqg zzhqgVar) {
        return new zzcwg(zzhqgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcwb zzb() {
        return new zzcwb(((zzhqj) this.zza).zzb());
    }
}
