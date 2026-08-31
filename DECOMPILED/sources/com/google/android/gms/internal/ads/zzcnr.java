package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.InterfaceC3750e;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcnr implements zzazc {
    private final ScheduledExecutorService zza;
    private final InterfaceC3750e zzb;
    private ScheduledFuture zzc;
    private long zzd = -1;
    private long zze = -1;
    private Runnable zzf = null;
    private boolean zzg = false;

    public zzcnr(ScheduledExecutorService scheduledExecutorService, InterfaceC3750e interfaceC3750e) {
        this.zza = scheduledExecutorService;
        this.zzb = interfaceC3750e;
        C7351t.m32353k().zzb(this);
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final void zza(boolean z7) {
        if (z7) {
            zzd();
        } else {
            zzc();
        }
    }

    public final synchronized void zzb(int i7, Runnable runnable) {
        this.zzf = runnable;
        long j7 = i7;
        this.zzd = this.zzb.mo18161c() + j7;
        this.zzc = this.zza.schedule(runnable, j7, TimeUnit.MILLISECONDS);
    }

    final synchronized void zzc() {
        try {
            if (this.zzg) {
                return;
            }
            ScheduledFuture scheduledFuture = this.zzc;
            if (scheduledFuture == null || scheduledFuture.isDone()) {
                this.zze = -1L;
            } else {
                this.zzc.cancel(true);
                this.zze = this.zzd - this.zzb.mo18161c();
            }
            this.zzg = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    final synchronized void zzd() {
        ScheduledFuture scheduledFuture;
        try {
            if (this.zzg) {
                if (this.zze > 0 && (scheduledFuture = this.zzc) != null && scheduledFuture.isCancelled()) {
                    this.zzc = this.zza.schedule(this.zzf, this.zze, TimeUnit.MILLISECONDS);
                }
                this.zzg = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
