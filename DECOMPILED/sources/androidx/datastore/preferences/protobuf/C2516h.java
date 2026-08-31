package androidx.datastore.preferences.protobuf;

import com.google.android.gms.common.api.C3553a;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.h */
/* JADX INFO: loaded from: classes.dex */
final class C2516h implements InterfaceC2499X {

    /* JADX INFO: renamed from: a */
    private final AbstractC2514g f9550a;

    /* JADX INFO: renamed from: b */
    private int f9551b;

    /* JADX INFO: renamed from: c */
    private int f9552c;

    /* JADX INFO: renamed from: d */
    private int f9553d = 0;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.h$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f9554a;

        static {
            int[] iArr = new int[AbstractC2523k0.b.values().length];
            f9554a = iArr;
            try {
                iArr[AbstractC2523k0.b.f9608u.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9554a[AbstractC2523k0.b.f9612y.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9554a[AbstractC2523k0.b.f9601c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9554a[AbstractC2523k0.b.f9595A.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9554a[AbstractC2523k0.b.f9607t.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9554a[AbstractC2523k0.b.f9606s.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9554a[AbstractC2523k0.b.f9602d.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f9554a[AbstractC2523k0.b.f9605r.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f9554a[AbstractC2523k0.b.f9603e.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f9554a[AbstractC2523k0.b.f9611x.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f9554a[AbstractC2523k0.b.f9596B.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f9554a[AbstractC2523k0.b.f9597C.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f9554a[AbstractC2523k0.b.f9598D.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f9554a[AbstractC2523k0.b.f9599E.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f9554a[AbstractC2523k0.b.f9609v.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f9554a[AbstractC2523k0.b.f9613z.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f9554a[AbstractC2523k0.b.f9604f.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private C2516h(AbstractC2514g abstractC2514g) {
        AbstractC2514g abstractC2514g2 = (AbstractC2514g) AbstractC2534u.m11638b(abstractC2514g, "input");
        this.f9550a = abstractC2514g2;
        abstractC2514g2.f9525d = this;
    }

    /* JADX INFO: renamed from: O */
    public static C2516h m11266O(AbstractC2514g abstractC2514g) {
        C2516h c2516h = abstractC2514g.f9525d;
        return c2516h != null ? c2516h : new C2516h(abstractC2514g);
    }

    /* JADX INFO: renamed from: P */
    private void m11267P(Object obj, InterfaceC2500Y interfaceC2500Y, C2526m c2526m) {
        int i7 = this.f9552c;
        this.f9552c = AbstractC2523k0.m11550c(AbstractC2523k0.m11548a(this.f9551b), 4);
        try {
            interfaceC2500Y.mo10973h(obj, this, c2526m);
            if (this.f9551b != this.f9552c) {
                throw C2535v.m11651h();
            }
            this.f9552c = i7;
        } catch (Throwable th) {
            this.f9552c = i7;
            throw th;
        }
    }

    /* JADX INFO: renamed from: Q */
    private void m11268Q(Object obj, InterfaceC2500Y interfaceC2500Y, C2526m c2526m) throws C2535v {
        int iMo11192D = this.f9550a.mo11192D();
        AbstractC2514g abstractC2514g = this.f9550a;
        if (abstractC2514g.f9522a >= abstractC2514g.f9523b) {
            throw C2535v.m11652i();
        }
        int iMo11201m = abstractC2514g.mo11201m(iMo11192D);
        this.f9550a.f9522a++;
        interfaceC2500Y.mo10973h(obj, this, c2526m);
        this.f9550a.mo11196a(0);
        AbstractC2514g abstractC2514g2 = this.f9550a;
        abstractC2514g2.f9522a--;
        abstractC2514g2.mo11200l(iMo11201m);
    }

    /* JADX INFO: renamed from: R */
    private Object m11269R(AbstractC2523k0.b bVar, Class cls, C2526m c2526m) {
        switch (a.f9554a[bVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(mo11018i());
            case 2:
                return mo11035z();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(mo11026q());
            case 5:
                return Integer.valueOf(mo11017h());
            case 6:
                return Long.valueOf(mo11013d());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(mo10997B());
            case 9:
                return Long.valueOf(mo11002G());
            case 10:
                return m11276U(cls, c2526m);
            case 11:
                return Integer.valueOf(mo10999D());
            case 12:
                return Long.valueOf(mo11019j());
            case 13:
                return Integer.valueOf(mo11028s());
            case 14:
                return Long.valueOf(mo11029t());
            case 15:
                return mo11003H();
            case 16:
                return Integer.valueOf(mo11021l());
            case 17:
                return Long.valueOf(mo11012c());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    /* JADX INFO: renamed from: S */
    private Object m11270S(InterfaceC2500Y interfaceC2500Y, C2526m c2526m) {
        Object objMo10971f = interfaceC2500Y.mo10971f();
        m11267P(objMo10971f, interfaceC2500Y, c2526m);
        interfaceC2500Y.mo10967b(objMo10971f);
        return objMo10971f;
    }

    /* JADX INFO: renamed from: T */
    private Object m11271T(InterfaceC2500Y interfaceC2500Y, C2526m c2526m) throws C2535v {
        Object objMo10971f = interfaceC2500Y.mo10971f();
        m11268Q(objMo10971f, interfaceC2500Y, c2526m);
        interfaceC2500Y.mo10967b(objMo10971f);
        return objMo10971f;
    }

    /* JADX INFO: renamed from: W */
    private void m11272W(int i7) throws C2535v {
        if (this.f9550a.mo11198e() != i7) {
            throw C2535v.m11654m();
        }
    }

    /* JADX INFO: renamed from: X */
    private void m11273X(int i7) throws C2535v.a {
        if (AbstractC2523k0.m11549b(this.f9551b) != i7) {
            throw C2535v.m11648e();
        }
    }

    /* JADX INFO: renamed from: Y */
    private void m11274Y(int i7) throws C2535v {
        if ((i7 & 3) != 0) {
            throw C2535v.m11651h();
        }
    }

    /* JADX INFO: renamed from: Z */
    private void m11275Z(int i7) throws C2535v {
        if ((i7 & 7) != 0) {
            throw C2535v.m11651h();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2499X
    /* JADX INFO: renamed from: A */
    public void mo10996A(List list) throws C2535v {
        int iMo11191C;
        int iM11549b = AbstractC2523k0.m11549b(this.f9551b);
        if (iM11549b == 2) {
            int iMo11192D = this.f9550a.mo11192D();
            m11274Y(iMo11192D);
            int iMo11198e = this.f9550a.mo11198e() + iMo11192D;
            do {
                list.add(Float.valueOf(this.f9550a.mo11208t()));
            } while (this.f9550a.mo11198e() < iMo11198e);
            return;
        }
        if (iM11549b != 5) {
            throw C2535v.m11648e();
        }
        do {
            list.add(Float.valueOf(this.f9550a.mo11208t()));
            if (this.f9550a.mo11199f()) {
                return;
            } else {
                iMo11191C = this.f9550a.mo11191C();
            }
        } while (iMo11191C == this.f9551b);
        this.f9553d = iMo11191C;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2499X
    /* JADX INFO: renamed from: B */
    public int mo10997B() throws C2535v.a {
        m11273X(0);
        return this.f9550a.mo11209u();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2499X
    /* JADX INFO: renamed from: C */
    public boolean mo10998C() {
        int i7;
        if (this.f9550a.mo11199f() || (i7 = this.f9551b) == this.f9552c) {
            return false;
        }
        return this.f9550a.mo11194F(i7);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2499X
    /* JADX INFO: renamed from: D */
    public int mo10999D() throws C2535v.a {
        m11273X(5);
        return this.f9550a.mo11211w();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2499X
    /* JADX INFO: renamed from: E */
    public void mo11000E(List list) throws C2535v.a {
        int iMo11191C;
        if (AbstractC2523k0.m11549b(this.f9551b) != 2) {
            throw C2535v.m11648e();
        }
        do {
            list.add(mo11035z());
            if (this.f9550a.mo11199f()) {
                return;
            } else {
                iMo11191C = this.f9550a.mo11191C();
            }
        } while (iMo11191C == this.f9551b);
        this.f9553d = iMo11191C;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2499X
    /* JADX INFO: renamed from: F */
    public void mo11001F(List list) throws C2535v {
        int iMo11191C;
        int iM11549b = AbstractC2523k0.m11549b(this.f9551b);
        if (iM11549b == 1) {
            do {
                list.add(Double.valueOf(this.f9550a.mo11204p()));
                if (this.f9550a.mo11199f()) {
                    return;
                } else {
                    iMo11191C = this.f9550a.mo11191C();
                }
            } while (iMo11191C == this.f9551b);
            this.f9553d = iMo11191C;
            return;
        }
        if (iM11549b != 2) {
            throw C2535v.m11648e();
        }
        int iMo11192D = this.f9550a.mo11192D();
        m11275Z(iMo11192D);
        int iMo11198e = this.f9550a.mo11198e() + iMo11192D;
        do {
            list.add(Double.valueOf(this.f9550a.mo11204p()));
        } while (this.f9550a.mo11198e() < iMo11198e);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2499X
    /* JADX INFO: renamed from: G */
    public long mo11002G() throws C2535v.a {
        m11273X(0);
        return this.f9550a.mo11210v();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2499X
    /* JADX INFO: renamed from: H */
    public String mo11003H() throws C2535v.a {
        m11273X(2);
        return this.f9550a.mo11190B();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2499X
    /* JADX INFO: renamed from: I */
    public void mo11004I(List list) throws C2535v {
        int iMo11191C;
        int iM11549b = AbstractC2523k0.m11549b(this.f9551b);
        if (iM11549b == 1) {
            do {
                list.add(Long.valueOf(this.f9550a.mo11207s()));
                if (this.f9550a.mo11199f()) {
                    return;
                } else {
                    iMo11191C = this.f9550a.mo11191C();
                }
            } while (iMo11191C == this.f9551b);
            this.f9553d = iMo11191C;
            return;
        }
        if (iM11549b != 2) {
            throw C2535v.m11648e();
        }
        int iMo11192D = this.f9550a.mo11192D();
        m11275Z(iMo11192D);
        int iMo11198e = this.f9550a.mo11198e() + iMo11192D;
        do {
            list.add(Long.valueOf(this.f9550a.mo11207s()));
        } while (this.f9550a.mo11198e() < iMo11198e);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2499X
    /* JADX INFO: renamed from: J */
    public void mo11005J(Object obj, InterfaceC2500Y interfaceC2500Y, C2526m c2526m) throws C2535v {
        m11273X(2);
        m11268Q(obj, interfaceC2500Y, c2526m);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2499X
    /* JADX INFO: renamed from: K */
    public void mo11006K(Map map, C2479C.a aVar, C2526m c2526m) throws C2535v.a {
        m11273X(2);
        int iMo11201m = this.f9550a.mo11201m(this.f9550a.mo11192D());
        Object objM11269R = aVar.f9434b;
        Object objM11269R2 = aVar.f9436d;
        while (true) {
            try {
                int iMo11032w = mo11032w();
                if (iMo11032w == Integer.MAX_VALUE || this.f9550a.mo11199f()) {
                    break;
                }
                if (iMo11032w == 1) {
                    objM11269R = m11269R(aVar.f9433a, null, null);
                } else if (iMo11032w != 2) {
                    try {
                        if (!mo10998C()) {
                            throw new C2535v("Unable to parse map entry.");
                        }
                    } catch (C2535v.a unused) {
                        if (!mo10998C()) {
                            throw new C2535v("Unable to parse map entry.");
                        }
                    }
                } else {
                    objM11269R2 = m11269R(aVar.f9435c, aVar.f9436d.getClass(), c2526m);
                }
            } catch (Throwable th) {
                this.f9550a.mo11200l(iMo11201m);
                throw th;
            }
        }
        map.put(objM11269R, objM11269R2);
        this.f9550a.mo11200l(iMo11201m);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2499X
    /* JADX INFO: renamed from: L */
    public void mo11007L(Object obj, InterfaceC2500Y interfaceC2500Y, C2526m c2526m) throws C2535v.a {
        m11273X(3);
        m11267P(obj, interfaceC2500Y, c2526m);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2499X
    /* JADX INFO: renamed from: M */
    public void mo11008M(List list, InterfaceC2500Y interfaceC2500Y, C2526m c2526m) throws C2535v.a {
        int iMo11191C;
        if (AbstractC2523k0.m11549b(this.f9551b) != 3) {
            throw C2535v.m11648e();
        }
        int i7 = this.f9551b;
        do {
            list.add(m11270S(interfaceC2500Y, c2526m));
            if (this.f9550a.mo11199f() || this.f9553d != 0) {
                return;
            } else {
                iMo11191C = this.f9550a.mo11191C();
            }
        } while (iMo11191C == i7);
        this.f9553d = iMo11191C;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2499X
    /* JADX INFO: renamed from: N */
    public void mo11009N(List list, InterfaceC2500Y interfaceC2500Y, C2526m c2526m) throws C2535v.a {
        int iMo11191C;
        if (AbstractC2523k0.m11549b(this.f9551b) != 2) {
            throw C2535v.m11648e();
        }
        int i7 = this.f9551b;
        do {
            list.add(m11271T(interfaceC2500Y, c2526m));
            if (this.f9550a.mo11199f() || this.f9553d != 0) {
                return;
            } else {
                iMo11191C = this.f9550a.mo11191C();
            }
        } while (iMo11191C == i7);
        this.f9553d = iMo11191C;
    }

    /* JADX INFO: renamed from: U */
    public Object m11276U(Class cls, C2526m c2526m) throws C2535v.a {
        m11273X(2);
        return m11271T(C2496U.m10984a().m10986c(cls), c2526m);
    }

    /* JADX INFO: renamed from: V */
    public void m11277V(List list, boolean z7) throws C2535v.a {
        int iMo11191C;
        if (AbstractC2523k0.m11549b(this.f9551b) != 2) {
            throw C2535v.m11648e();
        }
        do {
            list.add(z7 ? mo11003H() : mo11031v());
            if (this.f9550a.mo11199f()) {
                return;
            } else {
                iMo11191C = this.f9550a.mo11191C();
            }
        } while (iMo11191C == this.f9551b);
        this.f9553d = iMo11191C;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2499X
    /* JADX INFO: renamed from: a */
    public int mo11010a() {
        return this.f9551b;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2499X
    /* JADX INFO: renamed from: b */
    public void mo11011b(List list) throws C2535v {
        int iMo11191C;
        int iM11549b = AbstractC2523k0.m11549b(this.f9551b);
        if (iM11549b == 0) {
            do {
                list.add(Integer.valueOf(this.f9550a.mo11213y()));
                if (this.f9550a.mo11199f()) {
                    return;
                } else {
                    iMo11191C = this.f9550a.mo11191C();
                }
            } while (iMo11191C == this.f9551b);
            this.f9553d = iMo11191C;
            return;
        }
        if (iM11549b != 2) {
            throw C2535v.m11648e();
        }
        int iMo11198e = this.f9550a.mo11198e() + this.f9550a.mo11192D();
        do {
            list.add(Integer.valueOf(this.f9550a.mo11213y()));
        } while (this.f9550a.mo11198e() < iMo11198e);
        m11272W(iMo11198e);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2499X
    /* JADX INFO: renamed from: c */
    public long mo11012c() throws C2535v.a {
        m11273X(0);
        return this.f9550a.mo11193E();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2499X
    /* JADX INFO: renamed from: d */
    public long mo11013d() throws C2535v.a {
        m11273X(1);
        return this.f9550a.mo11207s();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2499X
    /* JADX INFO: renamed from: e */
    public void mo11014e(List list) throws C2535v {
        int iMo11191C;
        int iM11549b = AbstractC2523k0.m11549b(this.f9551b);
        if (iM11549b == 2) {
            int iMo11192D = this.f9550a.mo11192D();
            m11274Y(iMo11192D);
            int iMo11198e = this.f9550a.mo11198e() + iMo11192D;
            do {
                list.add(Integer.valueOf(this.f9550a.mo11211w()));
            } while (this.f9550a.mo11198e() < iMo11198e);
            return;
        }
        if (iM11549b != 5) {
            throw C2535v.m11648e();
        }
        do {
            list.add(Integer.valueOf(this.f9550a.mo11211w()));
            if (this.f9550a.mo11199f()) {
                return;
            } else {
                iMo11191C = this.f9550a.mo11191C();
            }
        } while (iMo11191C == this.f9551b);
        this.f9553d = iMo11191C;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2499X
    /* JADX INFO: renamed from: f */
    public void mo11015f(List list) throws C2535v {
        int iMo11191C;
        int iM11549b = AbstractC2523k0.m11549b(this.f9551b);
        if (iM11549b == 0) {
            do {
                list.add(Long.valueOf(this.f9550a.mo11214z()));
                if (this.f9550a.mo11199f()) {
                    return;
                } else {
                    iMo11191C = this.f9550a.mo11191C();
                }
            } while (iMo11191C == this.f9551b);
            this.f9553d = iMo11191C;
            return;
        }
        if (iM11549b != 2) {
            throw C2535v.m11648e();
        }
        int iMo11198e = this.f9550a.mo11198e() + this.f9550a.mo11192D();
        do {
            list.add(Long.valueOf(this.f9550a.mo11214z()));
        } while (this.f9550a.mo11198e() < iMo11198e);
        m11272W(iMo11198e);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2499X
    /* JADX INFO: renamed from: g */
    public void mo11016g(List list) throws C2535v {
        int iMo11191C;
        int iM11549b = AbstractC2523k0.m11549b(this.f9551b);
        if (iM11549b == 0) {
            do {
                list.add(Integer.valueOf(this.f9550a.mo11192D()));
                if (this.f9550a.mo11199f()) {
                    return;
                } else {
                    iMo11191C = this.f9550a.mo11191C();
                }
            } while (iMo11191C == this.f9551b);
            this.f9553d = iMo11191C;
            return;
        }
        if (iM11549b != 2) {
            throw C2535v.m11648e();
        }
        int iMo11198e = this.f9550a.mo11198e() + this.f9550a.mo11192D();
        do {
            list.add(Integer.valueOf(this.f9550a.mo11192D()));
        } while (this.f9550a.mo11198e() < iMo11198e);
        m11272W(iMo11198e);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2499X
    /* JADX INFO: renamed from: h */
    public int mo11017h() throws C2535v.a {
        m11273X(5);
        return this.f9550a.mo11206r();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2499X
    /* JADX INFO: renamed from: i */
    public boolean mo11018i() throws C2535v.a {
        m11273X(0);
        return this.f9550a.mo11202n();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2499X
    /* JADX INFO: renamed from: j */
    public long mo11019j() throws C2535v.a {
        m11273X(1);
        return this.f9550a.mo11212x();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2499X
    /* JADX INFO: renamed from: k */
    public void mo11020k(List list) throws C2535v {
        int iMo11191C;
        int iM11549b = AbstractC2523k0.m11549b(this.f9551b);
        if (iM11549b == 0) {
            do {
                list.add(Long.valueOf(this.f9550a.mo11193E()));
                if (this.f9550a.mo11199f()) {
                    return;
                } else {
                    iMo11191C = this.f9550a.mo11191C();
                }
            } while (iMo11191C == this.f9551b);
            this.f9553d = iMo11191C;
            return;
        }
        if (iM11549b != 2) {
            throw C2535v.m11648e();
        }
        int iMo11198e = this.f9550a.mo11198e() + this.f9550a.mo11192D();
        do {
            list.add(Long.valueOf(this.f9550a.mo11193E()));
        } while (this.f9550a.mo11198e() < iMo11198e);
        m11272W(iMo11198e);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2499X
    /* JADX INFO: renamed from: l */
    public int mo11021l() throws C2535v.a {
        m11273X(0);
        return this.f9550a.mo11192D();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2499X
    /* JADX INFO: renamed from: m */
    public void mo11022m(List list) throws C2535v {
        int iMo11191C;
        int iM11549b = AbstractC2523k0.m11549b(this.f9551b);
        if (iM11549b == 0) {
            do {
                list.add(Long.valueOf(this.f9550a.mo11210v()));
                if (this.f9550a.mo11199f()) {
                    return;
                } else {
                    iMo11191C = this.f9550a.mo11191C();
                }
            } while (iMo11191C == this.f9551b);
            this.f9553d = iMo11191C;
            return;
        }
        if (iM11549b != 2) {
            throw C2535v.m11648e();
        }
        int iMo11198e = this.f9550a.mo11198e() + this.f9550a.mo11192D();
        do {
            list.add(Long.valueOf(this.f9550a.mo11210v()));
        } while (this.f9550a.mo11198e() < iMo11198e);
        m11272W(iMo11198e);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2499X
    /* JADX INFO: renamed from: n */
    public void mo11023n(List list) throws C2535v {
        int iMo11191C;
        int iM11549b = AbstractC2523k0.m11549b(this.f9551b);
        if (iM11549b == 1) {
            do {
                list.add(Long.valueOf(this.f9550a.mo11212x()));
                if (this.f9550a.mo11199f()) {
                    return;
                } else {
                    iMo11191C = this.f9550a.mo11191C();
                }
            } while (iMo11191C == this.f9551b);
            this.f9553d = iMo11191C;
            return;
        }
        if (iM11549b != 2) {
            throw C2535v.m11648e();
        }
        int iMo11192D = this.f9550a.mo11192D();
        m11275Z(iMo11192D);
        int iMo11198e = this.f9550a.mo11198e() + iMo11192D;
        do {
            list.add(Long.valueOf(this.f9550a.mo11212x()));
        } while (this.f9550a.mo11198e() < iMo11198e);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2499X
    /* JADX INFO: renamed from: o */
    public void mo11024o(List list) throws C2535v {
        int iMo11191C;
        int iM11549b = AbstractC2523k0.m11549b(this.f9551b);
        if (iM11549b == 0) {
            do {
                list.add(Integer.valueOf(this.f9550a.mo11209u()));
                if (this.f9550a.mo11199f()) {
                    return;
                } else {
                    iMo11191C = this.f9550a.mo11191C();
                }
            } while (iMo11191C == this.f9551b);
            this.f9553d = iMo11191C;
            return;
        }
        if (iM11549b != 2) {
            throw C2535v.m11648e();
        }
        int iMo11198e = this.f9550a.mo11198e() + this.f9550a.mo11192D();
        do {
            list.add(Integer.valueOf(this.f9550a.mo11209u()));
        } while (this.f9550a.mo11198e() < iMo11198e);
        m11272W(iMo11198e);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2499X
    /* JADX INFO: renamed from: p */
    public void mo11025p(List list) throws C2535v {
        int iMo11191C;
        int iM11549b = AbstractC2523k0.m11549b(this.f9551b);
        if (iM11549b == 0) {
            do {
                list.add(Integer.valueOf(this.f9550a.mo11205q()));
                if (this.f9550a.mo11199f()) {
                    return;
                } else {
                    iMo11191C = this.f9550a.mo11191C();
                }
            } while (iMo11191C == this.f9551b);
            this.f9553d = iMo11191C;
            return;
        }
        if (iM11549b != 2) {
            throw C2535v.m11648e();
        }
        int iMo11198e = this.f9550a.mo11198e() + this.f9550a.mo11192D();
        do {
            list.add(Integer.valueOf(this.f9550a.mo11205q()));
        } while (this.f9550a.mo11198e() < iMo11198e);
        m11272W(iMo11198e);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2499X
    /* JADX INFO: renamed from: q */
    public int mo11026q() throws C2535v.a {
        m11273X(0);
        return this.f9550a.mo11205q();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2499X
    /* JADX INFO: renamed from: r */
    public void mo11027r(List list) throws C2535v {
        int iMo11191C;
        int iM11549b = AbstractC2523k0.m11549b(this.f9551b);
        if (iM11549b == 2) {
            int iMo11192D = this.f9550a.mo11192D();
            m11274Y(iMo11192D);
            int iMo11198e = this.f9550a.mo11198e() + iMo11192D;
            do {
                list.add(Integer.valueOf(this.f9550a.mo11206r()));
            } while (this.f9550a.mo11198e() < iMo11198e);
            return;
        }
        if (iM11549b != 5) {
            throw C2535v.m11648e();
        }
        do {
            list.add(Integer.valueOf(this.f9550a.mo11206r()));
            if (this.f9550a.mo11199f()) {
                return;
            } else {
                iMo11191C = this.f9550a.mo11191C();
            }
        } while (iMo11191C == this.f9551b);
        this.f9553d = iMo11191C;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2499X
    public double readDouble() throws C2535v.a {
        m11273X(1);
        return this.f9550a.mo11204p();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2499X
    public float readFloat() throws C2535v.a {
        m11273X(5);
        return this.f9550a.mo11208t();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2499X
    /* JADX INFO: renamed from: s */
    public int mo11028s() throws C2535v.a {
        m11273X(0);
        return this.f9550a.mo11213y();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2499X
    /* JADX INFO: renamed from: t */
    public long mo11029t() throws C2535v.a {
        m11273X(0);
        return this.f9550a.mo11214z();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2499X
    /* JADX INFO: renamed from: u */
    public void mo11030u(List list) throws C2535v {
        int iMo11191C;
        int iM11549b = AbstractC2523k0.m11549b(this.f9551b);
        if (iM11549b == 0) {
            do {
                list.add(Boolean.valueOf(this.f9550a.mo11202n()));
                if (this.f9550a.mo11199f()) {
                    return;
                } else {
                    iMo11191C = this.f9550a.mo11191C();
                }
            } while (iMo11191C == this.f9551b);
            this.f9553d = iMo11191C;
            return;
        }
        if (iM11549b != 2) {
            throw C2535v.m11648e();
        }
        int iMo11198e = this.f9550a.mo11198e() + this.f9550a.mo11192D();
        do {
            list.add(Boolean.valueOf(this.f9550a.mo11202n()));
        } while (this.f9550a.mo11198e() < iMo11198e);
        m11272W(iMo11198e);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2499X
    /* JADX INFO: renamed from: v */
    public String mo11031v() throws C2535v.a {
        m11273X(2);
        return this.f9550a.mo11189A();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2499X
    /* JADX INFO: renamed from: w */
    public int mo11032w() {
        int i7 = this.f9553d;
        if (i7 != 0) {
            this.f9551b = i7;
            this.f9553d = 0;
        } else {
            this.f9551b = this.f9550a.mo11191C();
        }
        int i8 = this.f9551b;
        return (i8 == 0 || i8 == this.f9552c) ? C3553a.e.API_PRIORITY_OTHER : AbstractC2523k0.m11548a(i8);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2499X
    /* JADX INFO: renamed from: x */
    public void mo11033x(List list) throws C2535v.a {
        m11277V(list, false);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2499X
    /* JADX INFO: renamed from: y */
    public void mo11034y(List list) throws C2535v.a {
        m11277V(list, true);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2499X
    /* JADX INFO: renamed from: z */
    public AbstractC2512f mo11035z() throws C2535v.a {
        m11273X(2);
        return this.f9550a.mo11203o();
    }
}
