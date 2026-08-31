package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzaox implements Runnable {
    private final zzaph zza;
    private final zzapn zzb;
    private final Runnable zzc;

    public zzaox(zzaph zzaphVar, zzapn zzapnVar, Runnable runnable) {
        this.zza = zzaphVar;
        this.zzb = zzapnVar;
        this.zzc = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzaph zzaphVar = this.zza;
        zzaphVar.zzl();
        zzapn zzapnVar = this.zzb;
        if (zzapnVar.zzc()) {
            zzaphVar.zzs(zzapnVar.zza);
        } else {
            zzaphVar.zzt(zzapnVar.zzc);
        }
        if (zzapnVar.zzd) {
            zzaphVar.zzc("intermediate-response");
        } else {
            zzaphVar.zzd("done");
        }
        Runnable runnable = this.zzc;
        if (runnable != null) {
            runnable.run();
        }
    }
}
