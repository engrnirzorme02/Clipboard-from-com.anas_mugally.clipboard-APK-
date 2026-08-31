package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public interface zzaeb {
    void zzu(zzu zzuVar);

    int zzv(zzi zziVar, int i7, boolean z7, int i8);

    void zzw(zzef zzefVar, int i7, int i8);

    void zzx(long j7, int i7, int i8, int i9, zzaea zzaeaVar);

    default int zzy(zzi zziVar, int i7, boolean z7) {
        return zzv(zziVar, i7, z7, 0);
    }

    default void zzz(zzef zzefVar, int i7) {
        zzw(zzefVar, i7, 0);
    }
}
