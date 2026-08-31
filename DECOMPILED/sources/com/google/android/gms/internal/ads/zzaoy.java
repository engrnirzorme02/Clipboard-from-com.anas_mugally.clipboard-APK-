package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaoy {
    private final Executor zza;

    public zzaoy(Handler handler) {
        this.zza = new zzaow(this, handler);
    }

    public final void zza(zzaph zzaphVar, zzapn zzapnVar, Runnable runnable) {
        zzaphVar.zzp();
        zzaphVar.zzc("post-response");
        ((zzaow) this.zza).zza.post(new zzaox(zzaphVar, zzapnVar, runnable));
    }

    public final void zzb(zzaph zzaphVar, zzapq zzapqVar) {
        zzaphVar.zzc("post-error");
        ((zzaow) this.zza).zza.post(new zzaox(zzaphVar, zzapn.zzb(zzapqVar), null));
    }
}
