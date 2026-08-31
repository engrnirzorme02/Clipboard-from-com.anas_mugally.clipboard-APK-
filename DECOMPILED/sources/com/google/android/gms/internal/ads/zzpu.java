package com.google.android.gms.internal.ads;

import android.os.Handler;

/* JADX INFO: loaded from: classes2.dex */
public final class zzpu {
    private final Handler zza;
    private final zzpv zzb;

    public zzpu(Handler handler, zzpv zzpvVar) {
        this.zza = zzpvVar == null ? null : handler;
        this.zzb = zzpvVar;
    }

    public final void zza(final zzhr zzhrVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpt
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzn(zzhrVar);
                }
            });
        }
    }

    public final void zzb(final String str, final long j7, final long j8) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzph
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzo(str, j7, j8);
                }
            });
        }
    }

    public final void zzc(final zzu zzuVar, final zzhs zzhsVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpk
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzp(zzuVar, zzhsVar);
                }
            });
        }
    }

    public final void zzd(final long j7) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpl
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzq(j7);
                }
            });
        }
    }

    public final void zze(final int i7, final long j7, final long j8) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpm
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzr(i7, j7, j8);
                }
            });
        }
    }

    public final void zzf(final String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpn
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzs(str);
                }
            });
        }
    }

    public final void zzg(final zzhr zzhrVar) {
        zzhrVar.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpo
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzt(zzhrVar);
                }
            });
        }
    }

    public final void zzh(final boolean z7) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpp
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzu(z7);
                }
            });
        }
    }

    public final void zzi(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpq
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzv(exc);
                }
            });
        }
    }

    public final void zzj(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpr
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzw(exc);
                }
            });
        }
    }

    public final void zzk(final zzpw zzpwVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzps
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzx(zzpwVar);
                }
            });
        }
    }

    public final void zzl(final zzpw zzpwVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpi
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzy(zzpwVar);
                }
            });
        }
    }

    public final void zzm(final int i7) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpj
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzz(i7);
                }
            });
        }
    }

    final /* synthetic */ void zzn(zzhr zzhrVar) {
        String str = zzeo.zza;
        this.zzb.zzk(zzhrVar);
    }

    final /* synthetic */ void zzo(String str, long j7, long j8) {
        String str2 = zzeo.zza;
        this.zzb.zzl(str, j7, j8);
    }

    final /* synthetic */ void zzp(zzu zzuVar, zzhs zzhsVar) {
        String str = zzeo.zza;
        this.zzb.zzm(zzuVar, zzhsVar);
    }

    final /* synthetic */ void zzq(long j7) {
        String str = zzeo.zza;
        this.zzb.zzn(j7);
    }

    final /* synthetic */ void zzr(int i7, long j7, long j8) {
        String str = zzeo.zza;
        this.zzb.zzo(i7, j7, j8);
    }

    final /* synthetic */ void zzs(String str) {
        String str2 = zzeo.zza;
        this.zzb.zzp(str);
    }

    final /* synthetic */ void zzt(zzhr zzhrVar) {
        zzhrVar.zza();
        String str = zzeo.zza;
        this.zzb.zzq(zzhrVar);
    }

    final /* synthetic */ void zzu(boolean z7) {
        String str = zzeo.zza;
        this.zzb.zzr(z7);
    }

    final /* synthetic */ void zzv(Exception exc) {
        String str = zzeo.zza;
        this.zzb.zzs(exc);
    }

    final /* synthetic */ void zzw(Exception exc) {
        String str = zzeo.zza;
        this.zzb.zzt(exc);
    }

    final /* synthetic */ void zzx(zzpw zzpwVar) {
        String str = zzeo.zza;
        this.zzb.zzu(zzpwVar);
    }

    final /* synthetic */ void zzy(zzpw zzpwVar) {
        String str = zzeo.zza;
        this.zzb.zzv(zzpwVar);
    }

    final /* synthetic */ void zzz(int i7) {
        String str = zzeo.zza;
        this.zzb.zzw(i7);
    }
}
