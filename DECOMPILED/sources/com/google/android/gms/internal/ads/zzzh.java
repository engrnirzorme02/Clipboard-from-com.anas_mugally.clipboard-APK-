package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzzh {
    public static final zzzb zza = new zzzb(2, -9223372036854775807L, null);
    public static final zzzb zzb = new zzzb(3, -9223372036854775807L, null);
    private final zzzn zzc = zzzn.zzb(zzeo.zzf("ExoPlayer:Loader:ProgressiveMediaPeriod"), zzza.zza);
    private zzzc zzd;
    private IOException zze;

    public zzzh(String str) {
    }

    public static zzzb zza(boolean z7, long j7) {
        return new zzzb(z7 ? 1 : 0, j7, null);
    }

    public final boolean zzb() {
        return this.zze != null;
    }

    public final void zzc() {
        this.zze = null;
    }

    public final long zzd(zzzd zzzdVar, zzyz zzyzVar, int i7) {
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        this.zze = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new zzzc(this, looperMyLooper, zzzdVar, zzyzVar, i7, jElapsedRealtime).zzb(0L);
        return jElapsedRealtime;
    }

    public final boolean zze() {
        return this.zzd != null;
    }

    public final void zzf() {
        zzzc zzzcVar = this.zzd;
        zzzcVar.getClass();
        zzzcVar.zzc(false);
    }

    public final void zzg(zzze zzzeVar) {
        zzzc zzzcVar = this.zzd;
        if (zzzcVar != null) {
            zzzcVar.zzc(true);
        }
        zzzn zzznVar = this.zzc;
        zzznVar.execute(new zzzf(zzzeVar));
        zzznVar.zza();
    }

    public final void zzh(int i7) throws IOException {
        IOException iOException = this.zze;
        if (iOException != null) {
            throw iOException;
        }
        zzzc zzzcVar = this.zzd;
        if (zzzcVar != null) {
            zzzcVar.zza(i7);
        }
    }

    final /* synthetic */ zzzn zzi() {
        return this.zzc;
    }

    final /* synthetic */ zzzc zzj() {
        return this.zzd;
    }

    final /* synthetic */ void zzk(zzzc zzzcVar) {
        this.zzd = zzzcVar;
    }

    final /* synthetic */ void zzl(IOException iOException) {
        this.zze = iOException;
    }
}
