package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.C3553a;
import p170W2.C1841f;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.K */
/* JADX INFO: loaded from: classes.dex */
public final class C3667K {

    /* JADX INFO: renamed from: a */
    private final SparseIntArray f14724a = new SparseIntArray();

    /* JADX INFO: renamed from: b */
    private C1841f f14725b;

    public C3667K(C1841f c1841f) {
        AbstractC3718s.m18083l(c1841f);
        this.f14725b = c1841f;
    }

    /* JADX INFO: renamed from: a */
    public final int m17985a(Context context, int i7) {
        return this.f14724a.get(i7, -1);
    }

    /* JADX INFO: renamed from: b */
    public final int m17986b(Context context, C3553a.f fVar) {
        AbstractC3718s.m18083l(context);
        AbstractC3718s.m18083l(fVar);
        int iMo7609h = 0;
        if (!fVar.requiresGooglePlayServices()) {
            return 0;
        }
        int minApkVersion = fVar.getMinApkVersion();
        int iM17985a = m17985a(context, minApkVersion);
        if (iM17985a != -1) {
            return iM17985a;
        }
        int i7 = 0;
        while (true) {
            if (i7 >= this.f14724a.size()) {
                iMo7609h = -1;
                break;
            }
            int iKeyAt = this.f14724a.keyAt(i7);
            if (iKeyAt > minApkVersion && this.f14724a.get(iKeyAt) == 0) {
                break;
            }
            i7++;
        }
        if (iMo7609h == -1) {
            iMo7609h = this.f14725b.mo7609h(context, minApkVersion);
        }
        this.f14724a.put(minApkVersion, iMo7609h);
        return iMo7609h;
    }

    /* JADX INFO: renamed from: c */
    public final void m17987c() {
        this.f14724a.clear();
    }
}
