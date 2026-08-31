package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
public final class zzde {
    private boolean zza;

    public zzde() {
        throw null;
    }

    public final synchronized boolean zza() {
        if (this.zza) {
            return false;
        }
        this.zza = true;
        notifyAll();
        return true;
    }

    public final synchronized boolean zzb() {
        boolean z7;
        z7 = this.zza;
        this.zza = false;
        return z7;
    }

    public final synchronized void zzc() {
        while (!this.zza) {
            wait();
        }
    }

    public final synchronized void zzd() {
        boolean z7 = false;
        while (!this.zza) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z7 = true;
            }
        }
        if (z7) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean zze(long j7) {
        if (j7 > 0) {
            try {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j8 = j7 + jElapsedRealtime;
                if (j8 < jElapsedRealtime) {
                    zzd();
                } else {
                    boolean z7 = false;
                    while (!this.zza && jElapsedRealtime < j8) {
                        try {
                            wait(j8 - jElapsedRealtime);
                        } catch (InterruptedException unused) {
                            z7 = true;
                        }
                        jElapsedRealtime = SystemClock.elapsedRealtime();
                    }
                    if (z7) {
                        Thread.currentThread().interrupt();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.zza;
    }

    public final synchronized boolean zzf() {
        return this.zza;
    }

    public zzde(zzdb zzdbVar) {
    }
}
