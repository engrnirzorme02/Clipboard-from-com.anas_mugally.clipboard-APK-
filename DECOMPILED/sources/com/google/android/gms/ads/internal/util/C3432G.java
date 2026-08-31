package com.google.android.gms.ads.internal.util;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.util.G */
/* JADX INFO: loaded from: classes.dex */
public final class C3432G {

    /* JADX INFO: renamed from: a */
    private final List f14192a = new ArrayList();

    /* JADX INFO: renamed from: b */
    private final List f14193b = new ArrayList();

    /* JADX INFO: renamed from: c */
    private final List f14194c = new ArrayList();

    /* JADX INFO: renamed from: a */
    public final C3432G m17447a(String str, double d7, double d8) {
        List list;
        int i7 = 0;
        while (true) {
            list = this.f14192a;
            if (i7 >= list.size()) {
                break;
            }
            double dDoubleValue = ((Double) this.f14194c.get(i7)).doubleValue();
            double dDoubleValue2 = ((Double) this.f14193b.get(i7)).doubleValue();
            if (d7 < dDoubleValue || (dDoubleValue == d7 && d8 < dDoubleValue2)) {
                break;
            }
            i7++;
        }
        list.add(i7, str);
        this.f14194c.add(i7, Double.valueOf(d7));
        this.f14193b.add(i7, Double.valueOf(d8));
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final C3434H m17448b() {
        return new C3434H(this, null);
    }

    /* JADX INFO: renamed from: c */
    final /* synthetic */ List m17449c() {
        return this.f14192a;
    }

    /* JADX INFO: renamed from: d */
    final /* synthetic */ List m17450d() {
        return this.f14193b;
    }

    /* JADX INFO: renamed from: e */
    final /* synthetic */ List m17451e() {
        return this.f14194c;
    }
}
