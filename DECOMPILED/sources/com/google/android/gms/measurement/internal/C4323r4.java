package com.google.android.gms.measurement.internal;

import java.util.Comparator;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.r4 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class C4323r4 implements Comparator {

    /* JADX INFO: renamed from: a */
    static final /* synthetic */ C4323r4 f16032a = new C4323r4();

    private /* synthetic */ C4323r4() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return Long.compare(((Long) obj).longValue(), ((Long) obj2).longValue());
    }
}
