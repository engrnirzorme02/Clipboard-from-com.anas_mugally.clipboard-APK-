package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzafg {
    protected final zzaeb zza;

    protected zzafg(zzaeb zzaebVar) {
        this.zza = zzaebVar;
    }

    protected abstract boolean zza(zzef zzefVar);

    protected abstract boolean zzb(zzef zzefVar, long j7);

    public final boolean zzf(zzef zzefVar, long j7) {
        return zza(zzefVar) && zzb(zzefVar, j7);
    }
}
