package p144S4;

import com.google.android.gms.common.api.C3553a;
import com.google.protobuf.C5125s0;
import java.util.Iterator;
import java.util.Map;
import p158U4.AbstractC1701y;
import p158U4.C1696t;
import p351s5.C7019a;
import p351s5.C7034p;
import p351s5.C7039u;
import p407z5.C7614a;

/* JADX INFO: renamed from: S4.c */
/* JADX INFO: loaded from: classes.dex */
public class C1418c {

    /* JADX INFO: renamed from: a */
    public static final C1418c f4932a = new C1418c();

    /* JADX INFO: renamed from: S4.c$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f4933a;

        static {
            int[] iArr = new int[C7039u.c.values().length];
            f4933a = iArr;
            try {
                iArr[C7039u.c.NULL_VALUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4933a[C7039u.c.BOOLEAN_VALUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4933a[C7039u.c.DOUBLE_VALUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4933a[C7039u.c.INTEGER_VALUE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4933a[C7039u.c.TIMESTAMP_VALUE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4933a[C7039u.c.STRING_VALUE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4933a[C7039u.c.BYTES_VALUE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f4933a[C7039u.c.REFERENCE_VALUE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4933a[C7039u.c.GEO_POINT_VALUE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f4933a[C7039u.c.MAP_VALUE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f4933a[C7039u.c.ARRAY_VALUE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    private C1418c() {
    }

    /* JADX INFO: renamed from: a */
    private void m6020a(C7019a c7019a, AbstractC1417b abstractC1417b) {
        m6028j(abstractC1417b, 50);
        Iterator it = c7019a.mo30668g().iterator();
        while (it.hasNext()) {
            m6024f((C7039u) it.next(), abstractC1417b);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m6021b(String str, AbstractC1417b abstractC1417b) {
        m6028j(abstractC1417b, 37);
        C1696t c1696tM7147A = C1696t.m7147A(str);
        int iM7063v = c1696tM7147A.m7063v();
        for (int i7 = 5; i7 < iM7063v; i7++) {
            String strM7061p = c1696tM7147A.m7061p(i7);
            m6028j(abstractC1417b, 60);
            m6027i(strM7061p, abstractC1417b);
        }
    }

    /* JADX INFO: renamed from: c */
    private void m6022c(C7034p c7034p, AbstractC1417b abstractC1417b) {
        m6028j(abstractC1417b, 55);
        for (Map.Entry entry : c7034p.m30811d0().entrySet()) {
            String str = (String) entry.getKey();
            C7039u c7039u = (C7039u) entry.getValue();
            m6023d(str, abstractC1417b);
            m6024f(c7039u, abstractC1417b);
        }
    }

    /* JADX INFO: renamed from: d */
    private void m6023d(String str, AbstractC1417b abstractC1417b) {
        m6028j(abstractC1417b, 25);
        m6027i(str, abstractC1417b);
    }

    /* JADX INFO: renamed from: f */
    private void m6024f(C7039u c7039u, AbstractC1417b abstractC1417b) {
        switch (a.f4933a[c7039u.m31044w0().ordinal()]) {
            case 1:
                m6028j(abstractC1417b, 5);
                return;
            case 2:
                m6028j(abstractC1417b, 10);
                abstractC1417b.mo6018d(c7039u.m31035m0() ? 1L : 0L);
                return;
            case 3:
                double dM31037p0 = c7039u.m31037p0();
                if (Double.isNaN(dM31037p0)) {
                    m6028j(abstractC1417b, 13);
                    return;
                }
                m6028j(abstractC1417b, 15);
                if (dM31037p0 == -0.0d) {
                    abstractC1417b.mo6016b(0.0d);
                    return;
                } else {
                    abstractC1417b.mo6016b(dM31037p0);
                    return;
                }
            case 4:
                m6028j(abstractC1417b, 15);
                abstractC1417b.mo6016b(c7039u.m31039r0());
                return;
            case 5:
                C5125s0 c5125s0M31043v0 = c7039u.m31043v0();
                m6028j(abstractC1417b, 20);
                abstractC1417b.mo6018d(c5125s0M31043v0.m23586e0());
                abstractC1417b.mo6018d(c5125s0M31043v0.m23585d0());
                return;
            case 6:
                m6023d(c7039u.m31042u0(), abstractC1417b);
                m6026h(abstractC1417b);
                return;
            case 7:
                m6028j(abstractC1417b, 30);
                abstractC1417b.mo6015a(c7039u.m31036n0());
                m6026h(abstractC1417b);
                return;
            case 8:
                m6021b(c7039u.m31041t0(), abstractC1417b);
                return;
            case 9:
                C7614a c7614aM31038q0 = c7039u.m31038q0();
                m6028j(abstractC1417b, 45);
                abstractC1417b.mo6016b(c7614aM31038q0.m33392d0());
                abstractC1417b.mo6016b(c7614aM31038q0.m33393e0());
                return;
            case 10:
                if (AbstractC1701y.m7197y(c7039u)) {
                    m6028j(abstractC1417b, C3553a.e.API_PRIORITY_OTHER);
                    return;
                } else if (AbstractC1701y.m7166D(c7039u)) {
                    m6025g(c7039u.m31040s0(), abstractC1417b);
                    return;
                } else {
                    m6022c(c7039u.m31040s0(), abstractC1417b);
                    m6026h(abstractC1417b);
                    return;
                }
            case 11:
                m6020a(c7039u.m31034l0(), abstractC1417b);
                m6026h(abstractC1417b);
                return;
            default:
                throw new IllegalArgumentException("unknown index value type " + c7039u.m31044w0());
        }
    }

    /* JADX INFO: renamed from: g */
    private void m6025g(C7034p c7034p, AbstractC1417b abstractC1417b) {
        Map mapM30811d0 = c7034p.m30811d0();
        m6028j(abstractC1417b, 53);
        int iM30670i0 = ((C7039u) mapM30811d0.get("value")).m31034l0().m30670i0();
        m6028j(abstractC1417b, 15);
        abstractC1417b.mo6018d(iM30670i0);
        m6023d("value", abstractC1417b);
        m6024f((C7039u) mapM30811d0.get("value"), abstractC1417b);
    }

    /* JADX INFO: renamed from: h */
    private void m6026h(AbstractC1417b abstractC1417b) {
        abstractC1417b.mo6018d(2L);
    }

    /* JADX INFO: renamed from: i */
    private void m6027i(String str, AbstractC1417b abstractC1417b) {
        abstractC1417b.mo6019e(str);
    }

    /* JADX INFO: renamed from: j */
    private void m6028j(AbstractC1417b abstractC1417b, int i7) {
        abstractC1417b.mo6018d(i7);
    }

    /* JADX INFO: renamed from: e */
    public void m6029e(C7039u c7039u, AbstractC1417b abstractC1417b) {
        m6024f(c7039u, abstractC1417b);
        abstractC1417b.mo6017c();
    }
}
