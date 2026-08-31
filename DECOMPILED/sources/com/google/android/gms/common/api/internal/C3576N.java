package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.internal.AbstractC3714q;
import p170W2.C1839d;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.N */
/* JADX INFO: loaded from: classes.dex */
final class C3576N {

    /* JADX INFO: renamed from: a */
    private final C3590b f14591a;

    /* JADX INFO: renamed from: b */
    private final C1839d f14592b;

    /* synthetic */ C3576N(C3590b c3590b, C1839d c1839d, AbstractC3575M abstractC3575M) {
        this.f14591a = c3590b;
        this.f14592b = c1839d;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C3576N)) {
            C3576N c3576n = (C3576N) obj;
            if (AbstractC3714q.m18053b(this.f14591a, c3576n.f14591a) && AbstractC3714q.m18053b(this.f14592b, c3576n.f14592b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC3714q.m18054c(this.f14591a, this.f14592b);
    }

    public final String toString() {
        return AbstractC3714q.m18055d(this).m18056a("key", this.f14591a).m18056a("feature", this.f14592b).toString();
    }
}
