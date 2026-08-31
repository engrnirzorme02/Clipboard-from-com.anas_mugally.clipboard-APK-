package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzglj implements Comparator {
    protected zzglj() {
    }

    public static zzglj zzb() {
        return zzglh.zza;
    }

    public static zzglj zzc(Comparator comparator) {
        return new zzgjm(comparator);
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);

    public zzglj zza() {
        return new zzgls(this);
    }

    public final zzglj zzd(zzggr zzggrVar) {
        return new zzgiy(zzggrVar, this);
    }
}
