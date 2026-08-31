package androidx.datastore.preferences.protobuf;

import androidx.appcompat.app.AbstractC2263x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.q */
/* JADX INFO: loaded from: classes.dex */
final class C2530q {

    /* JADX INFO: renamed from: d */
    private static final C2530q f9638d = new C2530q(true);

    /* JADX INFO: renamed from: a */
    private final AbstractC2505b0 f9639a;

    /* JADX INFO: renamed from: b */
    private boolean f9640b;

    /* JADX INFO: renamed from: c */
    private boolean f9641c;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.q$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f9642a;

        /* JADX INFO: renamed from: b */
        static final /* synthetic */ int[] f9643b;

        static {
            int[] iArr = new int[AbstractC2523k0.b.values().length];
            f9643b = iArr;
            try {
                iArr[AbstractC2523k0.b.f9601c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9643b[AbstractC2523k0.b.f9602d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9643b[AbstractC2523k0.b.f9603e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9643b[AbstractC2523k0.b.f9604f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9643b[AbstractC2523k0.b.f9605r.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9643b[AbstractC2523k0.b.f9606s.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9643b[AbstractC2523k0.b.f9607t.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f9643b[AbstractC2523k0.b.f9608u.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f9643b[AbstractC2523k0.b.f9610w.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f9643b[AbstractC2523k0.b.f9611x.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f9643b[AbstractC2523k0.b.f9609v.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f9643b[AbstractC2523k0.b.f9612y.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f9643b[AbstractC2523k0.b.f9613z.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f9643b[AbstractC2523k0.b.f9596B.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f9643b[AbstractC2523k0.b.f9597C.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f9643b[AbstractC2523k0.b.f9598D.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f9643b[AbstractC2523k0.b.f9599E.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f9643b[AbstractC2523k0.b.f9595A.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[AbstractC2523k0.c.values().length];
            f9642a = iArr2;
            try {
                iArr2[AbstractC2523k0.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f9642a[AbstractC2523k0.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f9642a[AbstractC2523k0.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f9642a[AbstractC2523k0.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f9642a[AbstractC2523k0.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f9642a[AbstractC2523k0.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f9642a[AbstractC2523k0.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f9642a[AbstractC2523k0.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f9642a[AbstractC2523k0.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.q$b */
    public interface b extends Comparable {
        /* JADX INFO: renamed from: a */
        int m11593a();

        /* JADX INFO: renamed from: b */
        boolean m11594b();

        /* JADX INFO: renamed from: e */
        AbstractC2523k0.b m11595e();

        /* JADX INFO: renamed from: g */
        boolean m11596g();
    }

    private C2530q() {
        this.f9639a = AbstractC2505b0.m11107r();
    }

    /* JADX INFO: renamed from: b */
    static int m11571b(AbstractC2523k0.b bVar, int i7, Object obj) {
        int iM11308O = AbstractC2518i.m11308O(i7);
        if (bVar == AbstractC2523k0.b.f9610w) {
            iM11308O *= 2;
        }
        return iM11308O + m11572c(bVar, obj);
    }

    /* JADX INFO: renamed from: c */
    static int m11572c(AbstractC2523k0.b bVar, Object obj) {
        switch (a.f9643b[bVar.ordinal()]) {
            case 1:
                return AbstractC2518i.m11323i(((Double) obj).doubleValue());
            case 2:
                return AbstractC2518i.m11331q(((Float) obj).floatValue());
            case 3:
                return AbstractC2518i.m11338x(((Long) obj).longValue());
            case 4:
                return AbstractC2518i.m11312S(((Long) obj).longValue());
            case 5:
                return AbstractC2518i.m11336v(((Integer) obj).intValue());
            case 6:
                return AbstractC2518i.m11329o(((Long) obj).longValue());
            case 7:
                return AbstractC2518i.m11327m(((Integer) obj).intValue());
            case 8:
                return AbstractC2518i.m11318d(((Boolean) obj).booleanValue());
            case 9:
                return AbstractC2518i.m11333s((InterfaceC2486J) obj);
            case 10:
                return AbstractC2518i.m11294A((InterfaceC2486J) obj);
            case 11:
                return obj instanceof AbstractC2512f ? AbstractC2518i.m11321g((AbstractC2512f) obj) : AbstractC2518i.m11307N((String) obj);
            case 12:
                return obj instanceof AbstractC2512f ? AbstractC2518i.m11321g((AbstractC2512f) obj) : AbstractC2518i.m11319e((byte[]) obj);
            case 13:
                return AbstractC2518i.m11310Q(((Integer) obj).intValue());
            case 14:
                return AbstractC2518i.m11299F(((Integer) obj).intValue());
            case 15:
                return AbstractC2518i.m11301H(((Long) obj).longValue());
            case 16:
                return AbstractC2518i.m11303J(((Integer) obj).intValue());
            case 17:
                return AbstractC2518i.m11305L(((Long) obj).longValue());
            case 18:
                return AbstractC2518i.m11325k(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX INFO: renamed from: d */
    public static int m11573d(b bVar, Object obj) {
        AbstractC2523k0.b bVarM11595e = bVar.m11595e();
        int iM11593a = bVar.m11593a();
        if (!bVar.m11594b()) {
            return m11571b(bVarM11595e, iM11593a, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i7 = 0;
        if (!bVar.m11596g()) {
            int iM11571b = 0;
            while (i7 < size) {
                iM11571b += m11571b(bVarM11595e, iM11593a, list.get(i7));
                i7++;
            }
            return iM11571b;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int iM11572c = 0;
        while (i7 < size) {
            iM11572c += m11572c(bVarM11595e, list.get(i7));
            i7++;
        }
        return AbstractC2518i.m11308O(iM11593a) + iM11572c + AbstractC2518i.m11310Q(iM11572c);
    }

    /* JADX INFO: renamed from: g */
    private int m11574g(Map.Entry entry) {
        AbstractC2263x.m9328a(entry.getKey());
        entry.getValue();
        throw null;
    }

    /* JADX INFO: renamed from: i */
    static int m11575i(AbstractC2523k0.b bVar, boolean z7) {
        if (z7) {
            return 2;
        }
        return bVar.m11552d();
    }

    /* JADX INFO: renamed from: l */
    private static boolean m11576l(Map.Entry entry) {
        AbstractC2263x.m9328a(entry.getKey());
        throw null;
    }

    /* JADX INFO: renamed from: m */
    private static boolean m11577m(AbstractC2523k0.b bVar, Object obj) {
        AbstractC2534u.m11637a(obj);
        switch (a.f9642a[bVar.m11551c().ordinal()]) {
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
                return (obj instanceof AbstractC2512f) || (obj instanceof byte[]);
            case 8:
                return obj instanceof Integer;
            case 9:
                return obj instanceof InterfaceC2486J;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: q */
    private void m11578q(Map.Entry entry) {
        AbstractC2263x.m9328a(entry.getKey());
        entry.getValue();
        throw null;
    }

    /* JADX INFO: renamed from: r */
    public static C2530q m11579r() {
        return new C2530q();
    }

    /* JADX INFO: renamed from: t */
    private void m11580t(b bVar, Object obj) {
        if (!m11577m(bVar.m11595e(), obj)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(bVar.m11593a()), bVar.m11595e().m11551c(), obj.getClass().getName()));
        }
    }

    /* JADX INFO: renamed from: u */
    static void m11581u(AbstractC2518i abstractC2518i, AbstractC2523k0.b bVar, int i7, Object obj) {
        if (bVar == AbstractC2523k0.b.f9610w) {
            abstractC2518i.m11378q0(i7, (InterfaceC2486J) obj);
        } else {
            abstractC2518i.mo11353M0(i7, m11575i(bVar, false));
            m11582v(abstractC2518i, bVar, obj);
        }
    }

    /* JADX INFO: renamed from: v */
    static void m11582v(AbstractC2518i abstractC2518i, AbstractC2523k0.b bVar, Object obj) {
        switch (a.f9643b[bVar.ordinal()]) {
            case 1:
                abstractC2518i.m11369h0(((Double) obj).doubleValue());
                break;
            case 2:
                abstractC2518i.m11377p0(((Float) obj).floatValue());
                break;
            case 3:
                abstractC2518i.m11385x0(((Long) obj).longValue());
                break;
            case 4:
                abstractC2518i.mo11357Q0(((Long) obj).longValue());
                break;
            case 5:
                abstractC2518i.mo11383v0(((Integer) obj).intValue());
                break;
            case 6:
                abstractC2518i.mo11375n0(((Long) obj).longValue());
                break;
            case 7:
                abstractC2518i.mo11373l0(((Integer) obj).intValue());
                break;
            case 8:
                abstractC2518i.m11363b0(((Boolean) obj).booleanValue());
                break;
            case 9:
                abstractC2518i.m11380s0((InterfaceC2486J) obj);
                break;
            case 10:
                abstractC2518i.mo11387z0((InterfaceC2486J) obj);
                break;
            case 11:
                if (!(obj instanceof AbstractC2512f)) {
                    abstractC2518i.mo11352L0((String) obj);
                } else {
                    abstractC2518i.mo11367f0((AbstractC2512f) obj);
                }
                break;
            case 12:
                if (!(obj instanceof AbstractC2512f)) {
                    abstractC2518i.m11364c0((byte[]) obj);
                } else {
                    abstractC2518i.mo11367f0((AbstractC2512f) obj);
                }
                break;
            case 13:
                abstractC2518i.mo11355O0(((Integer) obj).intValue());
                break;
            case 14:
                abstractC2518i.m11344D0(((Integer) obj).intValue());
                break;
            case 15:
                abstractC2518i.m11346F0(((Long) obj).longValue());
                break;
            case 16:
                abstractC2518i.m11348H0(((Integer) obj).intValue());
                break;
            case 17:
                abstractC2518i.m11350J0(((Long) obj).longValue());
                break;
            case 18:
                abstractC2518i.m11371j0(((Integer) obj).intValue());
                break;
        }
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C2530q clone() {
        C2530q c2530qM11579r = m11579r();
        int iM11111l = this.f9639a.m11111l();
        for (int i7 = 0; i7 < iM11111l; i7++) {
            Map.Entry entryM11110k = this.f9639a.m11110k(i7);
            AbstractC2263x.m9328a(entryM11110k.getKey());
            c2530qM11579r.m11592s(null, entryM11110k.getValue());
        }
        for (Map.Entry entry : this.f9639a.m11113n()) {
            AbstractC2263x.m9328a(entry.getKey());
            c2530qM11579r.m11592s(null, entry.getValue());
        }
        c2530qM11579r.f9641c = this.f9641c;
        return c2530qM11579r;
    }

    /* JADX INFO: renamed from: e */
    Iterator m11584e() {
        if (m11587j()) {
            return Collections.emptyIterator();
        }
        return this.f9641c ? new C2537x(this.f9639a.m11109h().iterator()) : this.f9639a.m11109h().iterator();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2530q) {
            return this.f9639a.equals(((C2530q) obj).f9639a);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public int m11585f() {
        int iM11111l = this.f9639a.m11111l();
        int iM11574g = 0;
        for (int i7 = 0; i7 < iM11111l; i7++) {
            iM11574g += m11574g(this.f9639a.m11110k(i7));
        }
        Iterator it = this.f9639a.m11113n().iterator();
        while (it.hasNext()) {
            iM11574g += m11574g((Map.Entry) it.next());
        }
        return iM11574g;
    }

    /* JADX INFO: renamed from: h */
    public int m11586h() {
        int iM11111l = this.f9639a.m11111l();
        int iM11573d = 0;
        for (int i7 = 0; i7 < iM11111l; i7++) {
            Map.Entry entryM11110k = this.f9639a.m11110k(i7);
            AbstractC2263x.m9328a(entryM11110k.getKey());
            iM11573d += m11573d(null, entryM11110k.getValue());
        }
        for (Map.Entry entry : this.f9639a.m11113n()) {
            AbstractC2263x.m9328a(entry.getKey());
            iM11573d += m11573d(null, entry.getValue());
        }
        return iM11573d;
    }

    public int hashCode() {
        return this.f9639a.hashCode();
    }

    /* JADX INFO: renamed from: j */
    boolean m11587j() {
        return this.f9639a.isEmpty();
    }

    /* JADX INFO: renamed from: k */
    public boolean m11588k() {
        int iM11111l = this.f9639a.m11111l();
        for (int i7 = 0; i7 < iM11111l; i7++) {
            if (!m11576l(this.f9639a.m11110k(i7))) {
                return false;
            }
        }
        Iterator it = this.f9639a.m11113n().iterator();
        while (it.hasNext()) {
            if (!m11576l((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: n */
    public Iterator m11589n() {
        if (m11587j()) {
            return Collections.emptyIterator();
        }
        return this.f9641c ? new C2537x(this.f9639a.entrySet().iterator()) : this.f9639a.entrySet().iterator();
    }

    /* JADX INFO: renamed from: o */
    public void m11590o() {
        if (this.f9640b) {
            return;
        }
        int iM11111l = this.f9639a.m11111l();
        for (int i7 = 0; i7 < iM11111l; i7++) {
            Map.Entry entryM11110k = this.f9639a.m11110k(i7);
            if (entryM11110k.getValue() instanceof AbstractC2533t) {
                ((AbstractC2533t) entryM11110k.getValue()).m11612D();
            }
        }
        this.f9639a.mo11115q();
        this.f9640b = true;
    }

    /* JADX INFO: renamed from: p */
    public void m11591p(C2530q c2530q) {
        int iM11111l = c2530q.f9639a.m11111l();
        for (int i7 = 0; i7 < iM11111l; i7++) {
            m11578q(c2530q.f9639a.m11110k(i7));
        }
        Iterator it = c2530q.f9639a.m11113n().iterator();
        while (it.hasNext()) {
            m11578q((Map.Entry) it.next());
        }
    }

    /* JADX INFO: renamed from: s */
    public void m11592s(b bVar, Object obj) {
        if (!bVar.m11594b()) {
            m11580t(bVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m11580t(bVar, it.next());
            }
            obj = arrayList;
        }
        this.f9639a.m11116s(bVar, obj);
    }

    private C2530q(boolean z7) {
        this(AbstractC2505b0.m11107r());
        m11590o();
    }

    private C2530q(AbstractC2505b0 abstractC2505b0) {
        this.f9639a = abstractC2505b0;
        m11590o();
    }
}
