package com.google.android.gms.internal.ads;

import android.view.MotionEvent;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfxg {
    public long zza;
    public long zzb;
    public long zzc;
    public long zzd;
    public double zze;
    public float zzf;
    public float zzg;
    public float zzh;
    public float zzi;
    private double zzj;
    private double zzk;

    private static double zzb(MotionEvent motionEvent, double d7, double d8, double d9) {
        return d9 + Math.hypot(((double) motionEvent.getRawX()) - d7, ((double) motionEvent.getRawY()) - d8);
    }

    final /* synthetic */ void zza(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.zza++;
            this.zze = 0.0d;
            this.zzj = motionEvent.getRawX();
            this.zzk = motionEvent.getRawY();
            this.zzf = motionEvent.getX();
            this.zzg = motionEvent.getY();
            this.zzh = motionEvent.getRawX();
            this.zzi = motionEvent.getRawY();
            return;
        }
        if (action == 1) {
            this.zzc++;
            this.zze = zzb(motionEvent, this.zzj, this.zzk, this.zze);
            this.zzj = motionEvent.getRawX();
            this.zzk = motionEvent.getRawY();
            return;
        }
        if (action != 2) {
            if (action != 3) {
                return;
            }
            this.zzd++;
        } else {
            this.zzb += (long) (motionEvent.getHistorySize() + 1);
            this.zze = zzb(motionEvent, this.zzj, this.zzk, this.zze);
            this.zzj = motionEvent.getRawX();
            this.zzk = motionEvent.getRawY();
        }
    }
}
