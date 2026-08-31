package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.DisplayMetrics;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfxs implements zzhpx {
    private final zzhqg zza;

    private zzfxs(zzhqg zzhqgVar) {
        this.zza = zzhqgVar;
    }

    public static zzfxs zza(zzhqg zzhqgVar) {
        return new zzfxs(zzhqgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        DisplayMetrics displayMetrics = ((Context) this.zza.zzb()).getResources().getDisplayMetrics();
        zzhqf.zzb(displayMetrics);
        return displayMetrics;
    }
}
