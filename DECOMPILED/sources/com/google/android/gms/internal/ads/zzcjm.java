package com.google.android.gms.internal.ads;

import p380w2.C7332a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcjm implements zzhpx {
    private final zzcjl zza;

    private zzcjm(zzcjl zzcjlVar) {
        this.zza = zzcjlVar;
    }

    public static zzcjm zzc(zzcjl zzcjlVar) {
        return new zzcjm(zzcjlVar);
    }

    public static C7332a zzd(zzcjl zzcjlVar) {
        return new C7332a(new zzcca(), new zzcav());
    }

    public final C7332a zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
