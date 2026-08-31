package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.client.C3324b1;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcuj implements zzcvs, zzdde, zzdau, zzcwi, zzayi {
    private final zzcwk zza;
    private final zzcyl zzb;
    private final zzfcj zzc;
    private final ScheduledExecutorService zzd;
    private final Executor zze;
    private ScheduledFuture zzg;
    private final String zzi;
    private final zzgpm zzf = zzgpm.zze();
    private final AtomicBoolean zzh = new AtomicBoolean();

    zzcuj(zzcwk zzcwkVar, zzfcj zzfcjVar, ScheduledExecutorService scheduledExecutorService, Executor executor, String str, zzcyl zzcylVar) {
        this.zza = zzcwkVar;
        this.zzc = zzfcjVar;
        this.zzd = scheduledExecutorService;
        this.zze = executor;
        this.zzi = str;
        this.zzb = zzcylVar;
    }

    private final boolean zzl() {
        return this.zzi.equals("com.google.ads.mediation.admob.AdMobAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zzd(zzbvh zzbvhVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdau
    public final synchronized void zzdL() {
        if (this.zzc.zze == 4) {
            this.zza.zza();
            return;
        }
        zzgpm zzgpmVar = this.zzf;
        if (zzgpmVar.isDone()) {
            return;
        }
        ScheduledFuture scheduledFuture = this.zzg;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        zzgpmVar.zza(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.zzdau
    public final void zzdM() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zzdO() {
    }

    @Override // com.google.android.gms.internal.ads.zzayi
    public final void zzdo(zzayh zzayhVar) {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzmm)).booleanValue() && zzl() && zzayhVar.zzj && this.zzh.compareAndSet(false, true) && this.zzc.zze != 3) {
            AbstractC3490o0.m17545k("Full screen 1px impression occurred");
            this.zza.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zzdx() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zzdy() {
        zzfcj zzfcjVar = this.zzc;
        if (zzfcjVar.zze == 3) {
            return;
        }
        int i7 = zzfcjVar.zzY;
        if (i7 == 0 || i7 == 1) {
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzmm)).booleanValue() && zzl()) {
                return;
            }
            this.zza.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzdde
    public final void zzg() {
        zzfcj zzfcjVar = this.zzc;
        int i7 = zzfcjVar.zze;
        if (i7 == 3) {
            return;
        }
        if (i7 == 4) {
            this.zzb.zza();
            return;
        }
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzbJ)).booleanValue() && zzfcjVar.zzY == 2) {
            int i8 = zzfcjVar.zzq;
            if (i8 == 0) {
                this.zza.zza();
            } else {
                zzgot.zzq(this.zzf, new zzcuh(this), this.zze);
                this.zzg = this.zzd.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcui
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzi();
                    }
                }, i8, TimeUnit.MILLISECONDS);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdde
    public final void zzh() {
    }

    final /* synthetic */ void zzi() {
        synchronized (this) {
            try {
                zzgpm zzgpmVar = this.zzf;
                if (zzgpmVar.isDone()) {
                    return;
                }
                zzgpmVar.zza(Boolean.TRUE);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwi
    public final synchronized void zzj(C3324b1 c3324b1) {
        try {
            zzgpm zzgpmVar = this.zzf;
            if (zzgpmVar.isDone()) {
                return;
            }
            ScheduledFuture scheduledFuture = this.zzg;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            zzgpmVar.zzb(new Exception());
        } catch (Throwable th) {
            throw th;
        }
    }

    final /* synthetic */ zzcwk zzk() {
        return this.zza;
    }
}
