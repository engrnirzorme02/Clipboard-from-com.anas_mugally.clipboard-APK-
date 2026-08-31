package io.grpc.internal;

import p063H5.AbstractC0523S;
import p063H5.C0530Z;
import p063H5.C0532a0;
import p063H5.C0535c;
import p122P3.AbstractC1205i;
import p122P3.AbstractC1209m;

/* JADX INFO: renamed from: io.grpc.internal.w0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5815w0 extends AbstractC0523S.g {

    /* JADX INFO: renamed from: a */
    private final C0535c f22932a;

    /* JADX INFO: renamed from: b */
    private final C0530Z f22933b;

    /* JADX INFO: renamed from: c */
    private final C0532a0 f22934c;

    public C5815w0(C0532a0 c0532a0, C0530Z c0530z, C0535c c0535c) {
        this.f22934c = (C0532a0) AbstractC1209m.m5303o(c0532a0, "method");
        this.f22933b = (C0530Z) AbstractC1209m.m5303o(c0530z, "headers");
        this.f22932a = (C0535c) AbstractC1209m.m5303o(c0535c, "callOptions");
    }

    @Override // p063H5.AbstractC0523S.g
    /* JADX INFO: renamed from: a */
    public C0535c mo2209a() {
        return this.f22932a;
    }

    @Override // p063H5.AbstractC0523S.g
    /* JADX INFO: renamed from: b */
    public C0530Z mo2210b() {
        return this.f22933b;
    }

    @Override // p063H5.AbstractC0523S.g
    /* JADX INFO: renamed from: c */
    public C0532a0 mo2211c() {
        return this.f22934c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5815w0.class == obj.getClass()) {
            C5815w0 c5815w0 = (C5815w0) obj;
            if (AbstractC1205i.m5282a(this.f22932a, c5815w0.f22932a) && AbstractC1205i.m5282a(this.f22933b, c5815w0.f22933b) && AbstractC1205i.m5282a(this.f22934c, c5815w0.f22934c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return AbstractC1205i.m5283b(this.f22932a, this.f22933b, this.f22934c);
    }

    public final String toString() {
        return "[method=" + this.f22934c + " headers=" + this.f22933b + " callOptions=" + this.f22932a + "]";
    }
}
