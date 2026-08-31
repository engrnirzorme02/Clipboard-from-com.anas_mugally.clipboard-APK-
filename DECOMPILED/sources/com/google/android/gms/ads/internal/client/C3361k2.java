package com.google.android.gms.ads.internal.client;

import java.util.Comparator;
import java.util.List;
import p314o2.C6570v;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.k2 */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class C3361k2 implements Comparator {

    /* JADX INFO: renamed from: a */
    static final /* synthetic */ C3361k2 f13982a = new C3361k2();

    private /* synthetic */ C3361k2() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        List list = C6570v.f24768f;
        return list.indexOf((String) obj) - list.indexOf((String) obj2);
    }
}
