package io.grpc.internal;

import java.util.Map;
import p063H5.AbstractC0536c0;
import p063H5.C0554l0;
import p122P3.AbstractC1209m;

/* JADX INFO: renamed from: io.grpc.internal.H0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5737H0 extends AbstractC0536c0.f {

    /* JADX INFO: renamed from: a */
    private final boolean f22185a;

    /* JADX INFO: renamed from: b */
    private final int f22186b;

    /* JADX INFO: renamed from: c */
    private final int f22187c;

    /* JADX INFO: renamed from: d */
    private final C5786i f22188d;

    public C5737H0(boolean z7, int i7, int i8, C5786i c5786i) {
        this.f22185a = z7;
        this.f22186b = i7;
        this.f22187c = i8;
        this.f22188d = (C5786i) AbstractC1209m.m5303o(c5786i, "autoLoadBalancerFactory");
    }

    @Override // p063H5.AbstractC0536c0.f
    /* JADX INFO: renamed from: a */
    public AbstractC0536c0.b mo2403a(Map map) {
        Object objM2388c;
        try {
            AbstractC0536c0.b bVarM26033f = this.f22188d.m26033f(map);
            if (bVarM26033f == null) {
                objM2388c = null;
            } else {
                if (bVarM26033f.m2389d() != null) {
                    return AbstractC0536c0.b.m2387b(bVarM26033f.m2389d());
                }
                objM2388c = bVarM26033f.m2388c();
            }
            return AbstractC0536c0.b.m2386a(C5791k0.m26048b(map, this.f22185a, this.f22186b, this.f22187c, objM2388c));
        } catch (RuntimeException e7) {
            return AbstractC0536c0.b.m2387b(C0554l0.f2100g.m2462q("failed to parse service config").m2461p(e7));
        }
    }
}
