package p158U4;

import com.google.android.gms.common.api.C3553a;
import com.google.protobuf.AbstractC5104i;
import com.google.protobuf.C5125s0;
import com.google.protobuf.EnumC5095d0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import p186Y4.AbstractC2032B;
import p186Y4.AbstractC2034b;
import p351s5.C7019a;
import p351s5.C7034p;
import p351s5.C7039u;
import p351s5.InterfaceC7020b;
import p407z5.C7614a;

/* JADX INFO: renamed from: U4.y */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1701y {

    /* JADX INFO: renamed from: a */
    public static final C7039u f5642a = (C7039u) C7039u.m31032y0().m31047B(Double.NaN).m23721o();

    /* JADX INFO: renamed from: b */
    public static final C7039u f5643b;

    /* JADX INFO: renamed from: c */
    public static final C7039u f5644c;

    /* JADX INFO: renamed from: d */
    public static final C7039u f5645d;

    /* JADX INFO: renamed from: e */
    public static final C7039u f5646e;

    /* JADX INFO: renamed from: f */
    public static final C7039u f5647f;

    /* JADX INFO: renamed from: g */
    private static final C7039u f5648g;

    /* JADX INFO: renamed from: h */
    public static C7039u f5649h;

    /* JADX INFO: renamed from: i */
    public static C7039u f5650i;

    /* JADX INFO: renamed from: j */
    public static C7039u f5651j;

    /* JADX INFO: renamed from: k */
    public static C7039u f5652k;

    /* JADX INFO: renamed from: l */
    public static C7039u f5653l;

    /* JADX INFO: renamed from: m */
    public static C7039u f5654m;

    /* JADX INFO: renamed from: n */
    public static C7039u f5655n;

    /* JADX INFO: renamed from: o */
    public static C7039u f5656o;

    /* JADX INFO: renamed from: p */
    public static C7039u f5657p;

    /* JADX INFO: renamed from: U4.y$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f5658a;

        static {
            int[] iArr = new int[C7039u.c.values().length];
            f5658a = iArr;
            try {
                iArr[C7039u.c.NULL_VALUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5658a[C7039u.c.BOOLEAN_VALUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5658a[C7039u.c.INTEGER_VALUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5658a[C7039u.c.DOUBLE_VALUE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5658a[C7039u.c.TIMESTAMP_VALUE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5658a[C7039u.c.STRING_VALUE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f5658a[C7039u.c.BYTES_VALUE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f5658a[C7039u.c.REFERENCE_VALUE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f5658a[C7039u.c.GEO_POINT_VALUE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f5658a[C7039u.c.ARRAY_VALUE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f5658a[C7039u.c.MAP_VALUE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    static {
        C7039u c7039u = (C7039u) C7039u.m31032y0().m31052G(EnumC5095d0.NULL_VALUE).m23721o();
        f5643b = c7039u;
        f5644c = c7039u;
        C7039u c7039u2 = (C7039u) C7039u.m31032y0().m31054I("__max__").m23721o();
        f5645d = c7039u2;
        f5646e = (C7039u) C7039u.m31032y0().m31050E(C7034p.m30809j0().m30817z("__type__", c7039u2)).m23721o();
        C7039u c7039u3 = (C7039u) C7039u.m31032y0().m31054I("__vector__").m23721o();
        f5647f = c7039u3;
        f5648g = (C7039u) C7039u.m31032y0().m31050E(C7034p.m30809j0().m30817z("__type__", c7039u3).m30817z("value", (C7039u) C7039u.m31032y0().m31056x(C7019a.m30666j0()).m23721o())).m23721o();
        f5649h = (C7039u) C7039u.m31032y0().m31058z(false).m23721o();
        f5650i = (C7039u) C7039u.m31032y0().m31047B(Double.NaN).m23721o();
        f5651j = (C7039u) C7039u.m31032y0().m31055J(C5125s0.m23582f0().m23588y(Long.MIN_VALUE)).m23721o();
        f5652k = (C7039u) C7039u.m31032y0().m31054I("").m23721o();
        f5653l = (C7039u) C7039u.m31032y0().m31046A(AbstractC5104i.f19401b).m23721o();
        f5654m = m7170H(C1682f.f5597c, C1687k.m7085h());
        f5655n = (C7039u) C7039u.m31032y0().m31048C(C7614a.m33389f0().m33394x(-90.0d).m33395y(-180.0d)).m23721o();
        f5656o = (C7039u) C7039u.m31032y0().m31057y(C7019a.m30665g0()).m23721o();
        f5657p = (C7039u) C7039u.m31032y0().m31051F(C7034p.m30805b0()).m23721o();
    }

    /* JADX INFO: renamed from: A */
    public static boolean m7163A(C7039u c7039u) {
        return c7039u != null && c7039u.m31044w0() == C7039u.c.NULL_VALUE;
    }

    /* JADX INFO: renamed from: B */
    public static boolean m7164B(C7039u c7039u) {
        return m7195w(c7039u) || m7194v(c7039u);
    }

    /* JADX INFO: renamed from: C */
    public static boolean m7165C(C7039u c7039u) {
        return c7039u != null && c7039u.m31044w0() == C7039u.c.REFERENCE_VALUE;
    }

    /* JADX INFO: renamed from: D */
    public static boolean m7166D(C7039u c7039u) {
        return f5647f.equals(c7039u.m31040s0().m30811d0().get("__type__"));
    }

    /* JADX INFO: renamed from: E */
    public static int m7167E(C7039u c7039u, boolean z7, C7039u c7039u2, boolean z8) {
        int iM7181i = m7181i(c7039u, c7039u2);
        if (iM7181i != 0) {
            return iM7181i;
        }
        if (!z7 || z8) {
            return (z7 || !z8) ? 0 : 1;
        }
        return -1;
    }

    /* JADX INFO: renamed from: F */
    private static boolean m7168F(C7039u c7039u, C7039u c7039u2) {
        C7039u.c cVarM31044w0 = c7039u.m31044w0();
        C7039u.c cVar = C7039u.c.INTEGER_VALUE;
        if (cVarM31044w0 == cVar && c7039u2.m31044w0() == cVar) {
            return c7039u.m31039r0() == c7039u2.m31039r0();
        }
        C7039u.c cVarM31044w1 = c7039u.m31044w0();
        C7039u.c cVar2 = C7039u.c.DOUBLE_VALUE;
        return cVarM31044w1 == cVar2 && c7039u2.m31044w0() == cVar2 && Double.doubleToLongBits(c7039u.m31037p0()) == Double.doubleToLongBits(c7039u2.m31037p0());
    }

    /* JADX INFO: renamed from: G */
    private static boolean m7169G(C7039u c7039u, C7039u c7039u2) {
        C7034p c7034pM31040s0 = c7039u.m31040s0();
        C7034p c7034pM31040s1 = c7039u2.m31040s0();
        if (c7034pM31040s0.m30810c0() != c7034pM31040s1.m30810c0()) {
            return false;
        }
        for (Map.Entry entry : c7034pM31040s0.m30811d0().entrySet()) {
            if (!m7190r((C7039u) entry.getValue(), (C7039u) c7034pM31040s1.m30811d0().get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: H */
    public static C7039u m7170H(C1682f c1682f, C1687k c1687k) {
        return (C7039u) C7039u.m31032y0().m31053H(String.format("projects/%s/databases/%s/documents/%s", c1682f.m7070k(), c1682f.m7069j(), c1687k.toString())).m23721o();
    }

    /* JADX INFO: renamed from: I */
    public static int m7171I(C7039u c7039u) {
        switch (a.f5658a[c7039u.m31044w0().ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
            case 4:
                return 2;
            case 5:
                return 3;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case 9:
                return 8;
            case 10:
                return 9;
            case 11:
                if (AbstractC1697u.m7152c(c7039u)) {
                    return 4;
                }
                if (m7197y(c7039u)) {
                    return C3553a.e.API_PRIORITY_OTHER;
                }
                return m7166D(c7039u) ? 10 : 11;
            default:
                throw AbstractC2034b.m8457a("Invalid value type: " + c7039u.m31044w0(), new Object[0]);
        }
    }

    /* JADX INFO: renamed from: J */
    public static int m7172J(C7039u c7039u, boolean z7, C7039u c7039u2, boolean z8) {
        int iM7181i = m7181i(c7039u, c7039u2);
        if (iM7181i != 0) {
            return iM7181i;
        }
        if (!z7 || z8) {
            return (z7 || !z8) ? 0 : -1;
        }
        return 1;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m7173a(C7039u c7039u, C7039u c7039u2) {
        C7019a c7019aM31034l0 = c7039u.m31034l0();
        C7019a c7019aM31034l1 = c7039u2.m31034l0();
        if (c7019aM31034l0.m30670i0() != c7019aM31034l1.m30670i0()) {
            return false;
        }
        for (int i7 = 0; i7 < c7019aM31034l0.m30670i0(); i7++) {
            if (!m7190r(c7019aM31034l0.m30669h0(i7), c7019aM31034l1.m30669h0(i7))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static String m7174b(C7039u c7039u) {
        StringBuilder sb = new StringBuilder();
        m7180h(sb, c7039u);
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    private static void m7175c(StringBuilder sb, C7019a c7019a) {
        sb.append("[");
        for (int i7 = 0; i7 < c7019a.m30670i0(); i7++) {
            m7180h(sb, c7019a.m30669h0(i7));
            if (i7 != c7019a.m30670i0() - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
    }

    /* JADX INFO: renamed from: d */
    private static void m7176d(StringBuilder sb, C7614a c7614a) {
        sb.append(String.format("geo(%s,%s)", Double.valueOf(c7614a.m33392d0()), Double.valueOf(c7614a.m33393e0())));
    }

    /* JADX INFO: renamed from: e */
    private static void m7177e(StringBuilder sb, C7034p c7034p) {
        ArrayList<String> arrayList = new ArrayList(c7034p.m30811d0().keySet());
        Collections.sort(arrayList);
        sb.append("{");
        boolean z7 = true;
        for (String str : arrayList) {
            if (z7) {
                z7 = false;
            } else {
                sb.append(",");
            }
            sb.append(str);
            sb.append(":");
            m7180h(sb, c7034p.m30813f0(str));
        }
        sb.append("}");
    }

    /* JADX INFO: renamed from: f */
    private static void m7178f(StringBuilder sb, C7039u c7039u) {
        AbstractC2034b.m8460d(m7165C(c7039u), "Value should be a ReferenceValue", new Object[0]);
        sb.append(C1687k.m7087k(c7039u.m31041t0()));
    }

    /* JADX INFO: renamed from: g */
    private static void m7179g(StringBuilder sb, C5125s0 c5125s0) {
        sb.append(String.format("time(%s,%s)", Long.valueOf(c5125s0.m23586e0()), Integer.valueOf(c5125s0.m23585d0())));
    }

    /* JADX INFO: renamed from: h */
    private static void m7180h(StringBuilder sb, C7039u c7039u) {
        switch (a.f5658a[c7039u.m31044w0().ordinal()]) {
            case 1:
                sb.append("null");
                return;
            case 2:
                sb.append(c7039u.m31035m0());
                return;
            case 3:
                sb.append(c7039u.m31039r0());
                return;
            case 4:
                sb.append(c7039u.m31037p0());
                return;
            case 5:
                m7179g(sb, c7039u.m31043v0());
                return;
            case 6:
                sb.append(c7039u.m31042u0());
                return;
            case 7:
                sb.append(AbstractC2032B.m8455t(c7039u.m31036n0()));
                return;
            case 8:
                m7178f(sb, c7039u);
                return;
            case 9:
                m7176d(sb, c7039u.m31038q0());
                return;
            case 10:
                m7175c(sb, c7039u.m31034l0());
                return;
            case 11:
                m7177e(sb, c7039u.m31040s0());
                return;
            default:
                throw AbstractC2034b.m8457a("Invalid value type: " + c7039u.m31044w0(), new Object[0]);
        }
    }

    /* JADX INFO: renamed from: i */
    public static int m7181i(C7039u c7039u, C7039u c7039u2) {
        int iM7171I = m7171I(c7039u);
        int iM7171I2 = m7171I(c7039u2);
        if (iM7171I != iM7171I2) {
            return Integer.compare(iM7171I, iM7171I2);
        }
        if (iM7171I != Integer.MAX_VALUE) {
            switch (iM7171I) {
                case 0:
                    break;
                case 1:
                    return AbstractC2032B.m8442g(c7039u.m31035m0(), c7039u2.m31035m0());
                case 2:
                    return m7185m(c7039u, c7039u2);
                case 3:
                    return m7187o(c7039u.m31043v0(), c7039u2.m31043v0());
                case 4:
                    return m7187o(AbstractC1697u.m7150a(c7039u), AbstractC1697u.m7150a(c7039u2));
                case 5:
                    return AbstractC2032B.m8447l(c7039u.m31042u0(), c7039u2.m31042u0());
                case 6:
                    return AbstractC2032B.m8444i(c7039u.m31036n0(), c7039u2.m31036n0());
                case 7:
                    return m7186n(c7039u.m31041t0(), c7039u2.m31041t0());
                case 8:
                    return m7183k(c7039u.m31038q0(), c7039u2.m31038q0());
                case 9:
                    return m7182j(c7039u.m31034l0(), c7039u2.m31034l0());
                case 10:
                    return m7188p(c7039u.m31040s0(), c7039u2.m31040s0());
                case 11:
                    return m7184l(c7039u.m31040s0(), c7039u2.m31040s0());
                default:
                    throw AbstractC2034b.m8457a("Invalid value type: " + iM7171I, new Object[0]);
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: j */
    private static int m7182j(C7019a c7019a, C7019a c7019a2) {
        int iMin = Math.min(c7019a.m30670i0(), c7019a2.m30670i0());
        for (int i7 = 0; i7 < iMin; i7++) {
            int iM7181i = m7181i(c7019a.m30669h0(i7), c7019a2.m30669h0(i7));
            if (iM7181i != 0) {
                return iM7181i;
            }
        }
        return Integer.compare(c7019a.m30670i0(), c7019a2.m30670i0());
    }

    /* JADX INFO: renamed from: k */
    private static int m7183k(C7614a c7614a, C7614a c7614a2) {
        int iM8445j = AbstractC2032B.m8445j(c7614a.m33392d0(), c7614a2.m33392d0());
        return iM8445j == 0 ? AbstractC2032B.m8445j(c7614a.m33393e0(), c7614a2.m33393e0()) : iM8445j;
    }

    /* JADX INFO: renamed from: l */
    private static int m7184l(C7034p c7034p, C7034p c7034p2) {
        Iterator it = new TreeMap(c7034p.m30811d0()).entrySet().iterator();
        Iterator it2 = new TreeMap(c7034p2.m30811d0()).entrySet().iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Map.Entry entry2 = (Map.Entry) it2.next();
            int iM8447l = AbstractC2032B.m8447l((String) entry.getKey(), (String) entry2.getKey());
            if (iM8447l != 0) {
                return iM8447l;
            }
            int iM7181i = m7181i((C7039u) entry.getValue(), (C7039u) entry2.getValue());
            if (iM7181i != 0) {
                return iM7181i;
            }
        }
        return AbstractC2032B.m8442g(it.hasNext(), it2.hasNext());
    }

    /* JADX INFO: renamed from: m */
    private static int m7185m(C7039u c7039u, C7039u c7039u2) {
        C7039u.c cVarM31044w0 = c7039u.m31044w0();
        C7039u.c cVar = C7039u.c.DOUBLE_VALUE;
        if (cVarM31044w0 == cVar) {
            double dM31037p0 = c7039u.m31037p0();
            if (c7039u2.m31044w0() == cVar) {
                return AbstractC2032B.m8445j(dM31037p0, c7039u2.m31037p0());
            }
            if (c7039u2.m31044w0() == C7039u.c.INTEGER_VALUE) {
                return AbstractC2032B.m8446k(dM31037p0, c7039u2.m31039r0());
            }
        } else {
            C7039u.c cVarM31044w1 = c7039u.m31044w0();
            C7039u.c cVar2 = C7039u.c.INTEGER_VALUE;
            if (cVarM31044w1 == cVar2) {
                long jM31039r0 = c7039u.m31039r0();
                if (c7039u2.m31044w0() == cVar2) {
                    return Long.compare(jM31039r0, c7039u2.m31039r0());
                }
                if (c7039u2.m31044w0() == cVar) {
                    return AbstractC2032B.m8446k(c7039u2.m31037p0(), jM31039r0) * (-1);
                }
            }
        }
        throw AbstractC2034b.m8457a("Unexpected values: %s vs %s", c7039u, c7039u2);
    }

    /* JADX INFO: renamed from: n */
    private static int m7186n(String str, String str2) {
        String[] strArrSplit = str.split("/", -1);
        String[] strArrSplit2 = str2.split("/", -1);
        int iMin = Math.min(strArrSplit.length, strArrSplit2.length);
        for (int i7 = 0; i7 < iMin; i7++) {
            int iCompareTo = strArrSplit[i7].compareTo(strArrSplit2[i7]);
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return Integer.compare(strArrSplit.length, strArrSplit2.length);
    }

    /* JADX INFO: renamed from: o */
    private static int m7187o(C5125s0 c5125s0, C5125s0 c5125s1) {
        int iCompare = Long.compare(c5125s0.m23586e0(), c5125s1.m23586e0());
        return iCompare != 0 ? iCompare : Integer.compare(c5125s0.m23585d0(), c5125s1.m23585d0());
    }

    /* JADX INFO: renamed from: p */
    private static int m7188p(C7034p c7034p, C7034p c7034p2) {
        Map mapM30811d0 = c7034p.m30811d0();
        Map mapM30811d1 = c7034p2.m30811d0();
        C7019a c7019aM31034l0 = ((C7039u) mapM30811d0.get("value")).m31034l0();
        C7019a c7019aM31034l1 = ((C7039u) mapM30811d1.get("value")).m31034l0();
        int iCompare = Integer.compare(c7019aM31034l0.m30670i0(), c7019aM31034l1.m30670i0());
        return iCompare != 0 ? iCompare : m7182j(c7019aM31034l0, c7019aM31034l1);
    }

    /* JADX INFO: renamed from: q */
    public static boolean m7189q(InterfaceC7020b interfaceC7020b, C7039u c7039u) {
        Iterator it = interfaceC7020b.mo30668g().iterator();
        while (it.hasNext()) {
            if (m7190r((C7039u) it.next(), c7039u)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: r */
    public static boolean m7190r(C7039u c7039u, C7039u c7039u2) {
        int iM7171I;
        if (c7039u == c7039u2) {
            return true;
        }
        if (c7039u == null || c7039u2 == null || (iM7171I = m7171I(c7039u)) != m7171I(c7039u2)) {
            return false;
        }
        if (iM7171I == 2) {
            return m7168F(c7039u, c7039u2);
        }
        if (iM7171I == 4) {
            return AbstractC1697u.m7150a(c7039u).equals(AbstractC1697u.m7150a(c7039u2));
        }
        if (iM7171I == Integer.MAX_VALUE) {
            return true;
        }
        switch (iM7171I) {
            case 9:
                return m7173a(c7039u, c7039u2);
            case 10:
            case 11:
                return m7169G(c7039u, c7039u2);
            default:
                return c7039u.equals(c7039u2);
        }
    }

    /* JADX INFO: renamed from: s */
    public static C7039u m7191s(C7039u c7039u) {
        switch (a.f5658a[c7039u.m31044w0().ordinal()]) {
            case 1:
                return f5643b;
            case 2:
                return f5649h;
            case 3:
            case 4:
                return f5650i;
            case 5:
                return f5651j;
            case 6:
                return f5652k;
            case 7:
                return f5653l;
            case 8:
                return f5654m;
            case 9:
                return f5655n;
            case 10:
                return f5656o;
            case 11:
                return m7166D(c7039u) ? f5648g : f5657p;
            default:
                throw new IllegalArgumentException("Unknown value type: " + c7039u.m31044w0());
        }
    }

    /* JADX INFO: renamed from: t */
    public static C7039u m7192t(C7039u c7039u) {
        switch (a.f5658a[c7039u.m31044w0().ordinal()]) {
            case 1:
                return f5649h;
            case 2:
                return f5650i;
            case 3:
            case 4:
                return f5651j;
            case 5:
                return f5652k;
            case 6:
                return f5653l;
            case 7:
                return f5654m;
            case 8:
                return f5655n;
            case 9:
                return f5656o;
            case 10:
                return f5648g;
            case 11:
                return m7166D(c7039u) ? f5657p : f5646e;
            default:
                throw new IllegalArgumentException("Unknown value type: " + c7039u.m31044w0());
        }
    }

    /* JADX INFO: renamed from: u */
    public static boolean m7193u(C7039u c7039u) {
        return c7039u != null && c7039u.m31044w0() == C7039u.c.ARRAY_VALUE;
    }

    /* JADX INFO: renamed from: v */
    public static boolean m7194v(C7039u c7039u) {
        return c7039u != null && c7039u.m31044w0() == C7039u.c.DOUBLE_VALUE;
    }

    /* JADX INFO: renamed from: w */
    public static boolean m7195w(C7039u c7039u) {
        return c7039u != null && c7039u.m31044w0() == C7039u.c.INTEGER_VALUE;
    }

    /* JADX INFO: renamed from: x */
    public static boolean m7196x(C7039u c7039u) {
        return c7039u != null && c7039u.m31044w0() == C7039u.c.MAP_VALUE;
    }

    /* JADX INFO: renamed from: y */
    public static boolean m7197y(C7039u c7039u) {
        return f5645d.equals(c7039u.m31040s0().m30811d0().get("__type__"));
    }

    /* JADX INFO: renamed from: z */
    public static boolean m7198z(C7039u c7039u) {
        return c7039u != null && Double.isNaN(c7039u.m31037p0());
    }
}
