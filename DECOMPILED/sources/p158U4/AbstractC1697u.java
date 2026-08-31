package p158U4;

import com.google.protobuf.C5125s0;
import p164V3.C1774s;
import p351s5.C7034p;
import p351s5.C7039u;

/* JADX INFO: renamed from: U4.u */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1697u {
    /* JADX INFO: renamed from: a */
    public static C5125s0 m7150a(C7039u c7039u) {
        return c7039u.m31040s0().m30813f0("__local_write_time__").m31043v0();
    }

    /* JADX INFO: renamed from: b */
    public static C7039u m7151b(C7039u c7039u) {
        C7039u c7039uM30812e0 = c7039u.m31040s0().m30812e0("__previous_value__", null);
        return m7152c(c7039uM30812e0) ? m7151b(c7039uM30812e0) : c7039uM30812e0;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m7152c(C7039u c7039u) {
        C7039u c7039uM30812e0 = c7039u != null ? c7039u.m31040s0().m30812e0("__type__", null) : null;
        return c7039uM30812e0 != null && "server_timestamp".equals(c7039uM30812e0.m31042u0());
    }

    /* JADX INFO: renamed from: d */
    public static C7039u m7153d(C1774s c1774s, C7039u c7039u) {
        C7039u c7039u2 = (C7039u) C7039u.m31032y0().m31054I("server_timestamp").m23721o();
        C7034p.b bVarM30817z = C7034p.m30809j0().m30817z("__type__", c7039u2).m30817z("__local_write_time__", (C7039u) C7039u.m31032y0().m31055J(C5125s0.m23582f0().m23588y(c1774s.m7438h()).m23587x(c1774s.m7437d())).m23721o());
        if (m7152c(c7039u)) {
            c7039u = m7151b(c7039u);
        }
        if (c7039u != null) {
            bVarM30817z.m30817z("__previous_value__", c7039u);
        }
        return (C7039u) C7039u.m31032y0().m31050E(bVarM30817z).m23721o();
    }
}
