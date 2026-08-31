package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzoo {
    final Unsafe zza;

    zzoo(Unsafe unsafe) {
        this.zza = unsafe;
    }

    public abstract void zza(Object obj, long j7, byte b7);

    public abstract boolean zzb(Object obj, long j7);

    public abstract void zzc(Object obj, long j7, boolean z7);

    public abstract float zzd(Object obj, long j7);

    public abstract void zze(Object obj, long j7, float f7);

    public abstract double zzf(Object obj, long j7);

    public abstract void zzg(Object obj, long j7, double d7);
}
