package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.client.C3324b1;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcwf extends zzdbq implements zzcvw {
    private final ScheduledExecutorService zzb;
    private ScheduledFuture zzc;
    private boolean zzd;

    public zzcwf(zzcwb zzcwbVar, Set set, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        super(set);
        this.zzd = false;
        this.zzb = scheduledExecutorService;
        super.zzq(zzcwbVar, executor);
    }

    public final synchronized void zza() {
        ScheduledFuture scheduledFuture = this.zzc;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    public final void zzb() {
        this.zzc = this.zzb.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcwd
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzf();
            }
        }, ((Integer) C3250D.m17200c().zzd(zzbci.zzly)).intValue(), TimeUnit.MILLISECONDS);
    }

    @Override // com.google.android.gms.internal.ads.zzcvw
    public final void zzc(final C3324b1 c3324b1) {
        zzs(new zzdbp() { // from class: com.google.android.gms.internal.ads.zzcwe
            @Override // com.google.android.gms.internal.ads.zzdbp
            public final /* synthetic */ void zza(Object obj) {
                ((zzcvw) obj).zzc(c3324b1);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvw
    public final void zzd(final zzdgo zzdgoVar) {
        if (this.zzd) {
            return;
        }
        ScheduledFuture scheduledFuture = this.zzc;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        zzs(new zzdbp() { // from class: com.google.android.gms.internal.ads.zzcwc
            @Override // com.google.android.gms.internal.ads.zzdbp
            public final /* synthetic */ void zza(Object obj) {
                ((zzcvw) obj).zzd(zzdgoVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvw
    public final void zze() {
        zzs(zzcvx.zza);
    }

    final /* synthetic */ void zzf() {
        synchronized (this) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33328c("Timeout waiting for show call succeed to be called.");
            zzd(new zzdgo("Timeout for show call succeed."));
            this.zzd = true;
        }
    }
}
