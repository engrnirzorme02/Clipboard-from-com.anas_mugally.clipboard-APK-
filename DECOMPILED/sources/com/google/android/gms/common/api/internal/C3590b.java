package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C3553a;
import com.google.android.gms.common.internal.AbstractC3714q;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.b */
/* JADX INFO: loaded from: classes.dex */
public final class C3590b {

    /* JADX INFO: renamed from: a */
    private final int f14619a;

    /* JADX INFO: renamed from: b */
    private final C3553a f14620b;

    /* JADX INFO: renamed from: c */
    private final C3553a.d f14621c;

    /* JADX INFO: renamed from: d */
    private final String f14622d;

    private C3590b(C3553a c3553a, C3553a.d dVar, String str) {
        this.f14620b = c3553a;
        this.f14621c = dVar;
        this.f14622d = str;
        this.f14619a = AbstractC3714q.m18054c(c3553a, dVar, str);
    }

    /* JADX INFO: renamed from: a */
    public static C3590b m17855a(C3553a c3553a, C3553a.d dVar, String str) {
        return new C3590b(c3553a, dVar, str);
    }

    /* JADX INFO: renamed from: b */
    public final String m17856b() {
        return this.f14620b.m17750c();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3590b)) {
            return false;
        }
        C3590b c3590b = (C3590b) obj;
        return AbstractC3714q.m18053b(this.f14620b, c3590b.f14620b) && AbstractC3714q.m18053b(this.f14621c, c3590b.f14621c) && AbstractC3714q.m18053b(this.f14622d, c3590b.f14622d);
    }

    public final int hashCode() {
        return this.f14619a;
    }
}
