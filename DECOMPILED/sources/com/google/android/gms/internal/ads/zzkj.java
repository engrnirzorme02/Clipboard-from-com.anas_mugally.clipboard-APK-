package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public interface zzkj {
    default void zza(zzox zzoxVar) {
        throw new IllegalStateException("onPrepared not implemented");
    }

    default void zzb(zzki zzkiVar, zzwq zzwqVar, zzyf[] zzyfVarArr) {
        throw new IllegalStateException("onTracksSelected not implemented");
    }

    default void zzc(zzox zzoxVar) {
        throw new IllegalStateException("onStopped not implemented");
    }

    default void zzd(zzox zzoxVar) {
        throw new IllegalStateException("onReleased not implemented");
    }

    default long zze(zzox zzoxVar) {
        throw new IllegalStateException("getBackBufferDurationUs not implemented");
    }

    default boolean zzf(zzox zzoxVar) {
        throw new IllegalStateException("retainBackBufferFromKeyframe not implemented");
    }

    default boolean zzg(zzki zzkiVar) {
        long j7 = zzkiVar.zzd;
        throw null;
    }

    default boolean zzh(zzki zzkiVar) {
        zzbe zzbeVar = zzkiVar.zzb;
        throw null;
    }

    default boolean zzi(zzbe zzbeVar, zzup zzupVar, long j7) {
        zzds.zzc("LoadControl", "shouldContinuePreloading needs to be implemented when playlist preloading is enabled");
        return false;
    }

    zzyv zzk();
}
