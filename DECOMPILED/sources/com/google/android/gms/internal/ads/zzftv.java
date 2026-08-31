package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class zzftv implements zzhpx {
    private final zzhqg zza;

    private zzftv(zzhqg zzhqgVar) {
        this.zza = zzhqgVar;
    }

    public static zzftv zza(zzhqg zzhqgVar) {
        return new zzftv(zzhqgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        File dir = ((Context) this.zza.zzb()).getDir("yqzdkcache", 0);
        zzhqf.zzb(dir);
        return dir;
    }
}
