package p063H5;

import java.util.concurrent.TimeoutException;
import p122P3.AbstractC1209m;

/* JADX INFO: renamed from: H5.s */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0567s {
    /* JADX INFO: renamed from: a */
    public static C0554l0 m2514a(C0565r c0565r) {
        AbstractC1209m.m5303o(c0565r, "context must not be null");
        if (!c0565r.m2511h()) {
            return null;
        }
        Throwable thM2508c = c0565r.m2508c();
        if (thM2508c == null) {
            return C0554l0.f2099f.m2462q("io.grpc.Context was cancelled without error");
        }
        if (thM2508c instanceof TimeoutException) {
            return C0554l0.f2102i.m2462q(thM2508c.getMessage()).m2461p(thM2508c);
        }
        C0554l0 c0554l0M2453k = C0554l0.m2453k(thM2508c);
        return (C0554l0.b.UNKNOWN.equals(c0554l0M2453k.m2458m()) && c0554l0M2453k.m2457l() == thM2508c) ? C0554l0.f2099f.m2462q("Context cancelled").m2461p(thM2508c) : c0554l0M2453k.m2461p(thM2508c);
    }
}
