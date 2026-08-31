package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzalk implements Comparable {
    public final int zza;
    public final zzalf zzb;

    public zzalk(int i7, zzalf zzalfVar) {
        this.zza = i7;
        this.zzb = zzalfVar;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Integer.compare(this.zza, ((zzalk) obj).zza);
    }
}
