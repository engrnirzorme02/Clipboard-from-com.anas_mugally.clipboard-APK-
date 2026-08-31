package com.google.android.gms.internal.ads;

import android.os.Handler;

/* JADX INFO: loaded from: classes2.dex */
final class zzyr {
    private final Handler zza;
    private final zzyt zzb;
    private boolean zzc;

    public zzyr(Handler handler, zzyt zzytVar) {
        this.zza = handler;
        this.zzb = zzytVar;
    }

    public final void zza() {
        this.zzc = true;
    }

    final /* synthetic */ Handler zzb() {
        return this.zza;
    }

    final /* synthetic */ zzyt zzc() {
        return this.zzb;
    }

    final /* synthetic */ boolean zzd() {
        return this.zzc;
    }
}
