package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzebk {
    private long zza = 0;
    private int zzb = 0;
    private long zzc = 0;
    private long zzd = 0;
    private long zze = 0;
    private final Object zzf = new Object();
    private final Object zzg = new Object();
    private final Object zzh = new Object();
    private final Object zzi = new Object();
    private final Object zzj = new Object();

    public final synchronized void zza(long j7) {
        synchronized (this.zzf) {
            this.zza = j7;
        }
    }

    public final synchronized long zzb() {
        long j7;
        synchronized (this.zzf) {
            j7 = this.zza;
        }
        return j7;
    }

    public final void zzc(int i7) {
        synchronized (this.zzg) {
            this.zzb = i7;
        }
    }

    public final int zzd() {
        int i7;
        synchronized (this.zzg) {
            i7 = this.zzb;
        }
        return i7;
    }

    public final void zze(long j7) {
        synchronized (this.zzh) {
            this.zzc = j7;
        }
    }

    public final long zzf() {
        long j7;
        synchronized (this.zzh) {
            j7 = this.zzc;
        }
        return j7;
    }

    public final synchronized void zzg(long j7) {
        synchronized (this.zzi) {
            this.zzd = j7;
        }
    }

    public final synchronized long zzh() {
        long j7;
        synchronized (this.zzi) {
            j7 = this.zzd;
        }
        return j7;
    }

    public final synchronized void zzi(long j7) {
        synchronized (this.zzj) {
            this.zze = j7;
        }
    }

    public final synchronized long zzj() {
        long j7;
        synchronized (this.zzj) {
            j7 = this.zze;
        }
        return j7;
    }
}
