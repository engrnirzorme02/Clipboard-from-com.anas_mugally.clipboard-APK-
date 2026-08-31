package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzxb implements Comparator {
    static final /* synthetic */ zzxb zza = new zzxb();

    private /* synthetic */ zzxb() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return ((zzxa) Collections.max((List) obj)).compareTo((zzxa) Collections.max((List) obj2));
    }
}
