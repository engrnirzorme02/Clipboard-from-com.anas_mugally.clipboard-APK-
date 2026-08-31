package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.common.util.InterfaceC3750e;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcyt extends zzdbq {
    private final ScheduledExecutorService zzb;
    private final InterfaceC3750e zzc;
    private final zzdsm zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private boolean zzi;
    private ScheduledFuture zzj;
    private ScheduledFuture zzk;

    public zzcyt(ScheduledExecutorService scheduledExecutorService, InterfaceC3750e interfaceC3750e, zzdsm zzdsmVar) {
        super(Collections.EMPTY_SET);
        this.zze = -1L;
        this.zzf = -1L;
        this.zzg = -1L;
        this.zzh = -1L;
        this.zzi = false;
        this.zzb = scheduledExecutorService;
        this.zzc = interfaceC3750e;
        this.zzd = zzdsmVar;
    }

    private final synchronized void zzf(long j7) {
        try {
            ScheduledFuture scheduledFuture = this.zzj;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.zzj.cancel(false);
            }
            this.zze = this.zzc.mo18161c() + j7;
            this.zzj = this.zzb.schedule(new zzcyr(this, null), j7, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void zzg(long j7) {
        try {
            ScheduledFuture scheduledFuture = this.zzk;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.zzk.cancel(false);
            }
            this.zzf = this.zzc.mo18161c() + j7;
            this.zzk = this.zzb.schedule(new zzcys(this, null), j7, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zza() {
        try {
            if (this.zzi) {
                return;
            }
            ScheduledFuture scheduledFuture = this.zzj;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                this.zzg = -1L;
            } else {
                this.zzj.cancel(false);
                this.zzg = this.zze - this.zzc.mo18161c();
            }
            ScheduledFuture scheduledFuture2 = this.zzk;
            if (scheduledFuture2 == null || scheduledFuture2.isCancelled()) {
                this.zzh = -1L;
            } else {
                this.zzk.cancel(false);
                this.zzh = this.zzf - this.zzc.mo18161c();
            }
            this.zzi = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzb() {
        ScheduledFuture scheduledFuture;
        ScheduledFuture scheduledFuture2;
        try {
            if (this.zzi) {
                if (this.zzg > 0 && (scheduledFuture2 = this.zzj) != null && scheduledFuture2.isCancelled()) {
                    zzf(this.zzg);
                }
                if (this.zzh > 0 && (scheduledFuture = this.zzk) != null && scheduledFuture.isCancelled()) {
                    zzg(this.zzh);
                }
                this.zzi = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzc() {
        this.zzi = false;
        zzf(0L);
    }

    public final synchronized void zzd(int i7) {
        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 20);
        sb.append("In scheduleRefresh: ");
        sb.append(i7);
        AbstractC3490o0.m17545k(sb.toString());
        if (i7 > 0) {
            long millis = TimeUnit.SECONDS.toMillis(i7);
            if (this.zzi) {
                long j7 = this.zzg;
                if (j7 <= 0 || millis >= j7) {
                    millis = j7;
                }
                this.zzg = millis;
                return;
            }
            long jMo18161c = this.zzc.mo18161c();
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzob)).booleanValue()) {
                long j8 = this.zze;
                if (jMo18161c >= j8 || j8 - jMo18161c > millis) {
                    zzf(millis);
                    if (((Boolean) C3250D.m17200c().zzd(zzbci.zzor)).booleanValue()) {
                        zzdsl zzdslVarZza = this.zzd.zza();
                        zzdslVarZza.zzc("action", "rtnc");
                        zzdslVarZza.zzf();
                    }
                }
            } else {
                long j9 = this.zze;
                if (jMo18161c > j9 || j9 - jMo18161c > millis) {
                    zzf(millis);
                }
            }
        }
    }

    public final synchronized void zze(int i7) {
        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 28);
        sb.append("In scheduleShowRefreshedAd: ");
        sb.append(i7);
        AbstractC3490o0.m17545k(sb.toString());
        if (i7 > 0) {
            long millis = TimeUnit.SECONDS.toMillis(i7);
            if (this.zzi) {
                long j7 = this.zzh;
                if (j7 <= 0 || millis >= j7) {
                    millis = j7;
                }
                this.zzh = millis;
                return;
            }
            long jMo18161c = this.zzc.mo18161c();
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzob)).booleanValue()) {
                if (jMo18161c == this.zzf) {
                    AbstractC3490o0.m17545k("In scheduleShowRefreshedAd: currentTimeMs = scheduledShowTimeMs");
                }
                long j8 = this.zzf;
                if (jMo18161c >= j8 || j8 - jMo18161c > millis) {
                    zzg(millis);
                }
            } else {
                long j9 = this.zzf;
                if (jMo18161c > j9 || j9 - jMo18161c > millis) {
                    zzg(millis);
                }
            }
        }
    }
}
