package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcot implements zzhpx {
    private final zzcor zza;

    private zzcot(zzcor zzcorVar) {
        this.zza = zzcorVar;
    }

    public static zzcot zzc(zzcor zzcorVar) {
        return new zzcot(zzcorVar);
    }

    public static View zzd(zzcor zzcorVar) {
        View viewZzb = zzcorVar.zzb();
        zzhqf.zzb(viewZzb);
        return viewZzb;
    }

    public final View zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
