package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaot extends Thread {
    private static final boolean zza = zzapt.zzb;
    private final BlockingQueue zzb;
    private final BlockingQueue zzc;
    private final zzaor zzd;
    private volatile boolean zze = false;
    private final zzapu zzf;
    private final zzaoy zzg;

    public zzaot(BlockingQueue blockingQueue, BlockingQueue blockingQueue2, zzaor zzaorVar, zzaoy zzaoyVar) {
        this.zzb = blockingQueue;
        this.zzc = blockingQueue2;
        this.zzd = zzaorVar;
        this.zzg = zzaoyVar;
        this.zzf = new zzapu(this, blockingQueue2, zzaoyVar);
    }

    private void zzc() {
        zzaph zzaphVar = (zzaph) this.zzb.take();
        zzaphVar.zzc("cache-queue-take");
        zzaphVar.zze(1);
        try {
            zzaphVar.zzl();
            zzaor zzaorVar = this.zzd;
            zzaoq zzaoqVarZza = zzaorVar.zza(zzaphVar.zzi());
            if (zzaoqVarZza == null) {
                zzaphVar.zzc("cache-miss");
                if (!this.zzf.zzc(zzaphVar)) {
                    this.zzc.put(zzaphVar);
                }
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (zzaoqVarZza.zza(jCurrentTimeMillis)) {
                    zzaphVar.zzc("cache-hit-expired");
                    zzaphVar.zzj(zzaoqVarZza);
                    if (!this.zzf.zzc(zzaphVar)) {
                        this.zzc.put(zzaphVar);
                    }
                } else {
                    zzaphVar.zzc("cache-hit");
                    zzapn zzapnVarZzr = zzaphVar.zzr(new zzapd(zzaoqVarZza.zza, zzaoqVarZza.zzg));
                    zzaphVar.zzc("cache-hit-parsed");
                    if (!zzapnVarZzr.zzc()) {
                        zzaphVar.zzc("cache-parsing-failed");
                        zzaorVar.zzd(zzaphVar.zzi(), true);
                        zzaphVar.zzj(null);
                        if (!this.zzf.zzc(zzaphVar)) {
                            this.zzc.put(zzaphVar);
                        }
                    } else if (zzaoqVarZza.zzf < jCurrentTimeMillis) {
                        zzaphVar.zzc("cache-hit-refresh-needed");
                        zzaphVar.zzj(zzaoqVarZza);
                        zzapnVarZzr.zzd = true;
                        if (this.zzf.zzc(zzaphVar)) {
                            this.zzg.zza(zzaphVar, zzapnVarZzr, null);
                        } else {
                            this.zzg.zza(zzaphVar, zzapnVarZzr, new zzaos(this, zzaphVar));
                        }
                    } else {
                        this.zzg.zza(zzaphVar, zzapnVarZzr, null);
                    }
                }
            }
        } finally {
            zzaphVar.zze(2);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (zza) {
            zzapt.zza("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.zzd.zzc();
        while (true) {
            try {
                zzc();
            } catch (InterruptedException unused) {
                if (this.zze) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzapt.zzc("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public final void zza() {
        this.zze = true;
        interrupt();
    }

    final /* synthetic */ BlockingQueue zzb() {
        return this.zzc;
    }
}
