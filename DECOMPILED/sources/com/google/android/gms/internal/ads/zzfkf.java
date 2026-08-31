package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.common.internal.AbstractC3718s;
import java.util.Random;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfkf {
    private final long zza;
    private final long zzb;
    private long zze;
    private long zzd = 5;
    private final Random zzf = new Random();
    private long zzc = 0;

    public zzfkf(long j7, double d7, long j8, double d8) {
        this.zza = j7;
        this.zzb = j8;
        zza();
    }

    public final void zza() {
        this.zze = this.zza;
        this.zzc = 0L;
    }

    public final long zzb() {
        double d7 = this.zze;
        double d8 = 0.2d * d7;
        long j7 = (long) (d7 + d8);
        long j8 = (long) (d7 - d8);
        return j8 + ((long) (this.zzf.nextDouble() * ((j7 - j8) + 1)));
    }

    public final void zzc() {
        double d7 = this.zze;
        this.zze = Math.min((long) (d7 + d7), this.zzb);
        this.zzc++;
    }

    public final boolean zzd() {
        return this.zzc > Math.max(this.zzd, (long) ((Integer) C3250D.m17200c().zzd(zzbci.zzF)).intValue()) && this.zze >= this.zzb;
    }

    public final synchronized void zze(int i7) {
        AbstractC3718s.m18072a(i7 > 0);
        this.zzd = i7;
    }
}
