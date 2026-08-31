package com.google.protobuf;

import androidx.appcompat.app.AbstractC2263x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.u */
/* JADX INFO: loaded from: classes.dex */
final class C5128u {

    /* JADX INFO: renamed from: d */
    private static final C5128u f19534d = new C5128u(true);

    /* JADX INFO: renamed from: a */
    private final AbstractC5119p0 f19535a;

    /* JADX INFO: renamed from: b */
    private boolean f19536b;

    /* JADX INFO: renamed from: c */
    private boolean f19537c;

    /* JADX INFO: renamed from: com.google.protobuf.u$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f19538a;

        /* JADX INFO: renamed from: b */
        static final /* synthetic */ int[] f19539b;

        static {
            int[] iArr = new int[AbstractC5062A0.b.values().length];
            f19539b = iArr;
            try {
                iArr[AbstractC5062A0.b.f19267c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19539b[AbstractC5062A0.b.f19268d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19539b[AbstractC5062A0.b.f19269e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19539b[AbstractC5062A0.b.f19270f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19539b[AbstractC5062A0.b.f19271r.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19539b[AbstractC5062A0.b.f19272s.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19539b[AbstractC5062A0.b.f19273t.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f19539b[AbstractC5062A0.b.f19274u.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f19539b[AbstractC5062A0.b.f19276w.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f19539b[AbstractC5062A0.b.f19277x.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f19539b[AbstractC5062A0.b.f19275v.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f19539b[AbstractC5062A0.b.f19278y.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f19539b[AbstractC5062A0.b.f19279z.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f19539b[AbstractC5062A0.b.f19262B.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f19539b[AbstractC5062A0.b.f19263C.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f19539b[AbstractC5062A0.b.f19264D.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f19539b[AbstractC5062A0.b.f19265E.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f19539b[AbstractC5062A0.b.f19261A.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[AbstractC5062A0.c.values().length];
            f19538a = iArr2;
            try {
                iArr2[AbstractC5062A0.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f19538a[AbstractC5062A0.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f19538a[AbstractC5062A0.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f19538a[AbstractC5062A0.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f19538a[AbstractC5062A0.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f19538a[AbstractC5062A0.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f19538a[AbstractC5062A0.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f19538a[AbstractC5062A0.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f19538a[AbstractC5062A0.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.u$b */
    public interface b extends Comparable {
        /* JADX INFO: renamed from: a */
        int m23615a();

        /* JADX INFO: renamed from: b */
        boolean m23616b();

        /* JADX INFO: renamed from: e */
        AbstractC5062A0.b m23617e();

        /* JADX INFO: renamed from: g */
        boolean m23618g();
    }

    private C5128u() {
        this.f19535a = AbstractC5119p0.m23542r(16);
    }

    /* JADX INFO: renamed from: b */
    static int m23593b(AbstractC5062A0.b bVar, int i7, Object obj) {
        int iM23353Q = AbstractC5110l.m23353Q(i7);
        if (bVar == AbstractC5062A0.b.f19276w) {
            iM23353Q *= 2;
        }
        return iM23353Q + m23594c(bVar, obj);
    }

    /* JADX INFO: renamed from: c */
    static int m23594c(AbstractC5062A0.b bVar, Object obj) {
        switch (a.f19539b[bVar.ordinal()]) {
            case 1:
                return AbstractC5110l.m23370k(((Double) obj).doubleValue());
            case 2:
                return AbstractC5110l.m23378s(((Float) obj).floatValue());
            case 3:
                return AbstractC5110l.m23385z(((Long) obj).longValue());
            case 4:
                return AbstractC5110l.m23357U(((Long) obj).longValue());
            case 5:
                return AbstractC5110l.m23383x(((Integer) obj).intValue());
            case 6:
                return AbstractC5110l.m23376q(((Long) obj).longValue());
            case 7:
                return AbstractC5110l.m23374o(((Integer) obj).intValue());
            case 8:
                return AbstractC5110l.m23365f(((Boolean) obj).booleanValue());
            case 9:
                return AbstractC5110l.m23380u((InterfaceC5082U) obj);
            case 10:
                return AbstractC5110l.m23339C((InterfaceC5082U) obj);
            case 11:
                return obj instanceof AbstractC5104i ? AbstractC5110l.m23368i((AbstractC5104i) obj) : AbstractC5110l.m23352P((String) obj);
            case 12:
                return obj instanceof AbstractC5104i ? AbstractC5110l.m23368i((AbstractC5104i) obj) : AbstractC5110l.m23366g((byte[]) obj);
            case 13:
                return AbstractC5110l.m23355S(((Integer) obj).intValue());
            case 14:
                return AbstractC5110l.m23344H(((Integer) obj).intValue());
            case 15:
                return AbstractC5110l.m23346J(((Long) obj).longValue());
            case 16:
                return AbstractC5110l.m23348L(((Integer) obj).intValue());
            case 17:
                return AbstractC5110l.m23350N(((Long) obj).longValue());
            case 18:
                return obj instanceof AbstractC5063B.a ? AbstractC5110l.m23372m(((AbstractC5063B.a) obj).mo22846a()) : AbstractC5110l.m23372m(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX INFO: renamed from: d */
    public static int m23595d(b bVar, Object obj) {
        AbstractC5062A0.b bVarM23617e = bVar.m23617e();
        int iM23615a = bVar.m23615a();
        if (!bVar.m23616b()) {
            return m23593b(bVarM23617e, iM23615a, obj);
        }
        List list = (List) obj;
        int iM23593b = 0;
        if (!bVar.m23618g()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                iM23593b += m23593b(bVarM23617e, iM23615a, it.next());
            }
            return iM23593b;
        }
        if (list.isEmpty()) {
            return 0;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            iM23593b += m23594c(bVarM23617e, it2.next());
        }
        return AbstractC5110l.m23353Q(iM23615a) + iM23593b + AbstractC5110l.m23355S(iM23593b);
    }

    /* JADX INFO: renamed from: g */
    private int m23596g(Map.Entry entry) {
        AbstractC2263x.m9328a(entry.getKey());
        entry.getValue();
        throw null;
    }

    /* JADX INFO: renamed from: i */
    static int m23597i(AbstractC5062A0.b bVar, boolean z7) {
        if (z7) {
            return 2;
        }
        return bVar.m22836d();
    }

    /* JADX INFO: renamed from: l */
    private static boolean m23598l(Map.Entry entry) {
        AbstractC2263x.m9328a(entry.getKey());
        throw null;
    }

    /* JADX INFO: renamed from: m */
    private static boolean m23599m(AbstractC5062A0.b bVar, Object obj) {
        AbstractC5063B.m22837a(obj);
        switch (a.f19538a[bVar.m22835c().ordinal()]) {
            case 1:
                return obj instanceof Integer;
            case 2:
                return obj instanceof Long;
            case 3:
                return obj instanceof Float;
            case 4:
                return obj instanceof Double;
            case 5:
                return obj instanceof Boolean;
            case 6:
                return obj instanceof String;
            case 7:
                return (obj instanceof AbstractC5104i) || (obj instanceof byte[]);
            case 8:
                return (obj instanceof Integer) || (obj instanceof AbstractC5063B.a);
            case 9:
                return obj instanceof InterfaceC5082U;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: q */
    private void m23600q(Map.Entry entry) {
        AbstractC2263x.m9328a(entry.getKey());
        entry.getValue();
        throw null;
    }

    /* JADX INFO: renamed from: r */
    public static C5128u m23601r() {
        return new C5128u();
    }

    /* JADX INFO: renamed from: t */
    private void m23602t(b bVar, Object obj) {
        if (!m23599m(bVar.m23617e(), obj)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(bVar.m23615a()), bVar.m23617e().m22835c(), obj.getClass().getName()));
        }
    }

    /* JADX INFO: renamed from: u */
    static void m23603u(AbstractC5110l abstractC5110l, AbstractC5062A0.b bVar, int i7, Object obj) {
        if (bVar == AbstractC5062A0.b.f19276w) {
            abstractC5110l.m23430v0(i7, (InterfaceC5082U) obj);
        } else {
            abstractC5110l.mo23403R0(i7, m23597i(bVar, false));
            m23604v(abstractC5110l, bVar, obj);
        }
    }

    /* JADX INFO: renamed from: v */
    static void m23604v(AbstractC5110l abstractC5110l, AbstractC5062A0.b bVar, Object obj) {
        switch (a.f19539b[bVar.ordinal()]) {
            case 1:
                abstractC5110l.m23421m0(((Double) obj).doubleValue());
                break;
            case 2:
                abstractC5110l.m23429u0(((Float) obj).floatValue());
                break;
            case 3:
                abstractC5110l.m23388C0(((Long) obj).longValue());
                break;
            case 4:
                abstractC5110l.mo23407V0(((Long) obj).longValue());
                break;
            case 5:
                abstractC5110l.mo23386A0(((Integer) obj).intValue());
                break;
            case 6:
                abstractC5110l.mo23427s0(((Long) obj).longValue());
                break;
            case 7:
                abstractC5110l.mo23425q0(((Integer) obj).intValue());
                break;
            case 8:
                abstractC5110l.m23415g0(((Boolean) obj).booleanValue());
                break;
            case 9:
                abstractC5110l.m23432x0((InterfaceC5082U) obj);
                break;
            case 10:
                abstractC5110l.mo23390E0((InterfaceC5082U) obj);
                break;
            case 11:
                if (!(obj instanceof AbstractC5104i)) {
                    abstractC5110l.mo23402Q0((String) obj);
                } else {
                    abstractC5110l.mo23419k0((AbstractC5104i) obj);
                }
                break;
            case 12:
                if (!(obj instanceof AbstractC5104i)) {
                    abstractC5110l.m23416h0((byte[]) obj);
                } else {
                    abstractC5110l.mo23419k0((AbstractC5104i) obj);
                }
                break;
            case 13:
                abstractC5110l.mo23405T0(((Integer) obj).intValue());
                break;
            case 14:
                abstractC5110l.m23394I0(((Integer) obj).intValue());
                break;
            case 15:
                abstractC5110l.m23396K0(((Long) obj).longValue());
                break;
            case 16:
                abstractC5110l.m23398M0(((Integer) obj).intValue());
                break;
            case 17:
                abstractC5110l.m23400O0(((Long) obj).longValue());
                break;
            case 18:
                if (!(obj instanceof AbstractC5063B.a)) {
                    abstractC5110l.m23423o0(((Integer) obj).intValue());
                } else {
                    abstractC5110l.m23423o0(((AbstractC5063B.a) obj).mo22846a());
                }
                break;
        }
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C5128u clone() {
        C5128u c5128uM23601r = m23601r();
        for (int i7 = 0; i7 < this.f19535a.m23546l(); i7++) {
            Map.Entry entryM23545k = this.f19535a.m23545k(i7);
            AbstractC2263x.m9328a(entryM23545k.getKey());
            c5128uM23601r.m23614s(null, entryM23545k.getValue());
        }
        for (Map.Entry entry : this.f19535a.m23548n()) {
            AbstractC2263x.m9328a(entry.getKey());
            c5128uM23601r.m23614s(null, entry.getValue());
        }
        c5128uM23601r.f19537c = this.f19537c;
        return c5128uM23601r;
    }

    /* JADX INFO: renamed from: e */
    Iterator m23606e() {
        return this.f19537c ? new C5069G(this.f19535a.m23544h().iterator()) : this.f19535a.m23544h().iterator();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5128u) {
            return this.f19535a.equals(((C5128u) obj).f19535a);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public int m23607f() {
        int iM23596g = 0;
        for (int i7 = 0; i7 < this.f19535a.m23546l(); i7++) {
            iM23596g += m23596g(this.f19535a.m23545k(i7));
        }
        Iterator it = this.f19535a.m23548n().iterator();
        while (it.hasNext()) {
            iM23596g += m23596g((Map.Entry) it.next());
        }
        return iM23596g;
    }

    /* JADX INFO: renamed from: h */
    public int m23608h() {
        int iM23595d = 0;
        for (int i7 = 0; i7 < this.f19535a.m23546l(); i7++) {
            Map.Entry entryM23545k = this.f19535a.m23545k(i7);
            AbstractC2263x.m9328a(entryM23545k.getKey());
            iM23595d += m23595d(null, entryM23545k.getValue());
        }
        for (Map.Entry entry : this.f19535a.m23548n()) {
            AbstractC2263x.m9328a(entry.getKey());
            iM23595d += m23595d(null, entry.getValue());
        }
        return iM23595d;
    }

    public int hashCode() {
        return this.f19535a.hashCode();
    }

    /* JADX INFO: renamed from: j */
    boolean m23609j() {
        return this.f19535a.isEmpty();
    }

    /* JADX INFO: renamed from: k */
    public boolean m23610k() {
        for (int i7 = 0; i7 < this.f19535a.m23546l(); i7++) {
            if (!m23598l(this.f19535a.m23545k(i7))) {
                return false;
            }
        }
        Iterator it = this.f19535a.m23548n().iterator();
        while (it.hasNext()) {
            if (!m23598l((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: n */
    public Iterator m23611n() {
        return this.f19537c ? new C5069G(this.f19535a.entrySet().iterator()) : this.f19535a.entrySet().iterator();
    }

    /* JADX INFO: renamed from: o */
    public void m23612o() {
        if (this.f19536b) {
            return;
        }
        for (int i7 = 0; i7 < this.f19535a.m23546l(); i7++) {
            Map.Entry entryM23545k = this.f19535a.m23545k(i7);
            if (entryM23545k.getValue() instanceof AbstractC5136y) {
                ((AbstractC5136y) entryM23545k.getValue()).m23704J();
            }
        }
        this.f19535a.mo23550q();
        this.f19536b = true;
    }

    /* JADX INFO: renamed from: p */
    public void m23613p(C5128u c5128u) {
        for (int i7 = 0; i7 < c5128u.f19535a.m23546l(); i7++) {
            m23600q(c5128u.f19535a.m23545k(i7));
        }
        Iterator it = c5128u.f19535a.m23548n().iterator();
        while (it.hasNext()) {
            m23600q((Map.Entry) it.next());
        }
    }

    /* JADX INFO: renamed from: s */
    public void m23614s(b bVar, Object obj) {
        if (!bVar.m23616b()) {
            m23602t(bVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m23602t(bVar, it.next());
            }
            obj = arrayList;
        }
        this.f19535a.m23551s(bVar, obj);
    }

    private C5128u(boolean z7) {
        this(AbstractC5119p0.m23542r(0));
        m23612o();
    }

    private C5128u(AbstractC5119p0 abstractC5119p0) {
        this.f19535a = abstractC5119p0;
        m23612o();
    }
}
