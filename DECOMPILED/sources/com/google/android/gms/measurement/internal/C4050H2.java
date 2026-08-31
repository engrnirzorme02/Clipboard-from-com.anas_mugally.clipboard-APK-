package com.google.android.gms.measurement.internal;

import p227d3.C5227c;
import p227d3.C5228d;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.H2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4050H2 {

    /* JADX INFO: renamed from: a */
    final C4164X2 f15243a;

    C4050H2(C4317q6 c4317q6) {
        this.f15243a = c4317q6.m18921g0();
    }

    /* JADX INFO: renamed from: a */
    final boolean m18523a() {
        try {
            C4164X2 c4164x2 = this.f15243a;
            C5227c c5227cM24155a = C5228d.m24155a(c4164x2.mo18424e());
            if (c5227cM24155a != null) {
                return c5227cM24155a.m24152f("com.android.vending", 128).versionCode >= 80837300;
            }
            c4164x2.mo18421a().m18859w().m18834a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e7) {
            this.f15243a.mo18421a().m18859w().m18835b("Failed to retrieve Play Store version for Install Referrer", e7);
            return false;
        }
    }
}
