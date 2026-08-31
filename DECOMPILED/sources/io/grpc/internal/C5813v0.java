package io.grpc.internal;

import java.util.Map;
import p063H5.AbstractC0523S;
import p063H5.AbstractC0524T;
import p063H5.AbstractC0536c0;
import p063H5.C0554l0;
import p122P3.AbstractC1213q;

/* JADX INFO: renamed from: io.grpc.internal.v0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5813v0 extends AbstractC0524T {

    /* JADX INFO: renamed from: b */
    static boolean f22930b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f22931c = 0;

    static {
        f22930b = !AbstractC1213q.m5323a(System.getenv("GRPC_EXPERIMENTAL_ENABLE_NEW_PICK_FIRST")) && Boolean.parseBoolean(System.getenv("GRPC_EXPERIMENTAL_ENABLE_NEW_PICK_FIRST"));
    }

    @Override // p063H5.AbstractC0523S.c
    /* JADX INFO: renamed from: a */
    public AbstractC0523S mo2193a(AbstractC0523S.e eVar) {
        return f22930b ? new C5807s0(eVar) : new C5811u0(eVar);
    }

    @Override // p063H5.AbstractC0524T
    /* JADX INFO: renamed from: b */
    public String mo2232b() {
        return "pick_first";
    }

    @Override // p063H5.AbstractC0524T
    /* JADX INFO: renamed from: c */
    public int mo2233c() {
        return 5;
    }

    @Override // p063H5.AbstractC0524T
    /* JADX INFO: renamed from: d */
    public boolean mo2234d() {
        return true;
    }

    @Override // p063H5.AbstractC0524T
    /* JADX INFO: renamed from: e */
    public AbstractC0536c0.b mo2235e(Map map) {
        try {
            return AbstractC0536c0.b.m2386a(new C5811u0.c(AbstractC5775c0.m25875d(map, "shuffleAddressList")));
        } catch (RuntimeException e7) {
            return AbstractC0536c0.b.m2387b(C0554l0.f2113t.m2461p(e7).m2462q("Failed parsing configuration for " + mo2232b()));
        }
    }
}
