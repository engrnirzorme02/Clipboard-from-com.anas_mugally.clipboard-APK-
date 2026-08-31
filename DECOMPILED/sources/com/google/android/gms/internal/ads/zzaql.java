package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
final class zzaql implements zzaqc {
    final /* synthetic */ Context zza;
    private File zzb = null;

    zzaql(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzaqc
    public final File zza() {
        if (this.zzb == null) {
            this.zzb = new File(this.zza.getCacheDir(), "volley");
        }
        return this.zzb;
    }
}
