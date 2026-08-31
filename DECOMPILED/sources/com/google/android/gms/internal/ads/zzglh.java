package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
final class zzglh extends zzglj implements Serializable {
    static final zzglh zza = new zzglh();

    private zzglh() {
    }

    @Override // com.google.android.gms.internal.ads.zzglj, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }

    @Override // com.google.android.gms.internal.ads.zzglj
    public final zzglj zza() {
        return zzglr.zza;
    }
}
