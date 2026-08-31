package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
public final class zzabl {
    private final Handler zza;
    private final zzabm zzb;

    public zzabl(Handler handler, zzabm zzabmVar) {
        if (zzabmVar != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.zza = handler;
        this.zzb = zzabmVar;
    }

    public final void zza(final zzhr zzhrVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabk
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzk(zzhrVar);
                }
            });
        }
    }

    public final void zzb(final String str, final long j7, final long j8) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabb
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzl(str, j7, j8);
                }
            });
        }
    }

    public final void zzc(final zzu zzuVar, final zzhs zzhsVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabc
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzm(zzuVar, zzhsVar);
                }
            });
        }
    }

    public final void zzd(final int i7, final long j7) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabd
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzn(i7, j7);
                }
            });
        }
    }

    public final void zze(final long j7, final int i7) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabe
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzo(j7, i7);
                }
            });
        }
    }

    public final void zzf(final zzbu zzbuVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabf
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzp(zzbuVar);
                }
            });
        }
    }

    public final void zzg(final Object obj) {
        Handler handler = this.zza;
        if (handler != null) {
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabg
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzq(obj, jElapsedRealtime);
                }
            });
        }
    }

    public final void zzh(final String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabh
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzr(str);
                }
            });
        }
    }

    public final void zzi(final zzhr zzhrVar) {
        zzhrVar.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabi
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzs(zzhrVar);
                }
            });
        }
    }

    public final void zzj(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabj
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzt(exc);
                }
            });
        }
    }

    final /* synthetic */ void zzk(zzhr zzhrVar) {
        String str = zzeo.zza;
        this.zzb.zza(zzhrVar);
    }

    final /* synthetic */ void zzl(String str, long j7, long j8) {
        String str2 = zzeo.zza;
        this.zzb.zzb(str, j7, j8);
    }

    final /* synthetic */ void zzm(zzu zzuVar, zzhs zzhsVar) {
        String str = zzeo.zza;
        this.zzb.zzc(zzuVar, zzhsVar);
    }

    final /* synthetic */ void zzn(int i7, long j7) {
        String str = zzeo.zza;
        this.zzb.zzd(i7, j7);
    }

    final /* synthetic */ void zzo(long j7, int i7) {
        String str = zzeo.zza;
        this.zzb.zzi(j7, i7);
    }

    final /* synthetic */ void zzp(zzbu zzbuVar) {
        String str = zzeo.zza;
        this.zzb.zze(zzbuVar);
    }

    final /* synthetic */ void zzq(Object obj, long j7) {
        String str = zzeo.zza;
        this.zzb.zzf(obj, j7);
    }

    final /* synthetic */ void zzr(String str) {
        String str2 = zzeo.zza;
        this.zzb.zzg(str);
    }

    final /* synthetic */ void zzs(zzhr zzhrVar) {
        zzhrVar.zza();
        String str = zzeo.zza;
        this.zzb.zzh(zzhrVar);
    }

    final /* synthetic */ void zzt(Exception exc) {
        String str = zzeo.zza;
        this.zzb.zzj(exc);
    }
}
