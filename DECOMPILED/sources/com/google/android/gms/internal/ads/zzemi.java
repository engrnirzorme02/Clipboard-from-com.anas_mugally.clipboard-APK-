package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzemi implements zzhpx {
    private final zzhqg zza;

    private zzemi(zzhqg zzhqgVar) {
        this.zza = zzhqgVar;
    }

    public static zzemi zzc(zzhqg zzhqgVar) {
        return new zzemi(zzhqgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzemg zzb() {
        return new zzemg(((zzchd) this.zza).zza());
    }
}
