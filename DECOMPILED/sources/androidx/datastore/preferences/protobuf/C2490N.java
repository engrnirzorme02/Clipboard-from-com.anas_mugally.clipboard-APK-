package androidx.datastore.preferences.protobuf;

import androidx.appcompat.app.AbstractC2263x;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.N */
/* JADX INFO: loaded from: classes.dex */
final class C2490N implements InterfaceC2500Y {

    /* JADX INFO: renamed from: a */
    private final InterfaceC2486J f9461a;

    /* JADX INFO: renamed from: b */
    private final AbstractC2513f0 f9462b;

    /* JADX INFO: renamed from: c */
    private final boolean f9463c;

    /* JADX INFO: renamed from: d */
    private final AbstractC2527n f9464d;

    private C2490N(AbstractC2513f0 abstractC2513f0, AbstractC2527n abstractC2527n, InterfaceC2486J interfaceC2486J) {
        this.f9462b = abstractC2513f0;
        this.f9463c = abstractC2527n.mo11562e(interfaceC2486J);
        this.f9464d = abstractC2527n;
        this.f9461a = interfaceC2486J;
    }

    /* JADX INFO: renamed from: j */
    private int m10975j(AbstractC2513f0 abstractC2513f0, Object obj) {
        return abstractC2513f0.mo11171i(abstractC2513f0.mo11169g(obj));
    }

    /* JADX INFO: renamed from: k */
    private void m10976k(AbstractC2513f0 abstractC2513f0, AbstractC2527n abstractC2527n, Object obj, InterfaceC2499X interfaceC2499X, C2526m c2526m) throws Throwable {
        AbstractC2513f0 abstractC2513f1;
        Object objMo11168f = abstractC2513f0.mo11168f(obj);
        C2530q c2530qMo11561d = abstractC2527n.mo11561d(obj);
        while (interfaceC2499X.mo11032w() != Integer.MAX_VALUE) {
            try {
                abstractC2513f1 = abstractC2513f0;
                AbstractC2527n abstractC2527n2 = abstractC2527n;
                InterfaceC2499X interfaceC2499X2 = interfaceC2499X;
                C2526m c2526m2 = c2526m;
                try {
                    if (!m10978m(interfaceC2499X2, c2526m2, abstractC2527n2, c2530qMo11561d, abstractC2513f1, objMo11168f)) {
                        abstractC2513f1.mo11176o(obj, objMo11168f);
                        return;
                    }
                    interfaceC2499X = interfaceC2499X2;
                    c2526m = c2526m2;
                    abstractC2527n = abstractC2527n2;
                    abstractC2513f0 = abstractC2513f1;
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    abstractC2513f1.mo11176o(obj, objMo11168f);
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                abstractC2513f1 = abstractC2513f0;
            }
        }
        abstractC2513f0.mo11176o(obj, objMo11168f);
    }

    /* JADX INFO: renamed from: l */
    static C2490N m10977l(AbstractC2513f0 abstractC2513f0, AbstractC2527n abstractC2527n, InterfaceC2486J interfaceC2486J) {
        return new C2490N(abstractC2513f0, abstractC2527n, interfaceC2486J);
    }

    /* JADX INFO: renamed from: m */
    private boolean m10978m(InterfaceC2499X interfaceC2499X, C2526m c2526m, AbstractC2527n abstractC2527n, C2530q c2530q, AbstractC2513f0 abstractC2513f0, Object obj) throws C2535v {
        int iMo11010a = interfaceC2499X.mo11010a();
        int iMo11021l = 0;
        if (iMo11010a != AbstractC2523k0.f9591a) {
            if (AbstractC2523k0.m11549b(iMo11010a) != 2) {
                return interfaceC2499X.mo10998C();
            }
            Object objMo11559b = abstractC2527n.mo11559b(c2526m, this.f9461a, AbstractC2523k0.m11548a(iMo11010a));
            if (objMo11559b == null) {
                return abstractC2513f0.m11174m(obj, interfaceC2499X, 0);
            }
            abstractC2527n.mo11565h(interfaceC2499X, objMo11559b, c2526m, c2530q);
            return true;
        }
        Object objMo11559b2 = null;
        AbstractC2512f abstractC2512fMo11035z = null;
        while (interfaceC2499X.mo11032w() != Integer.MAX_VALUE) {
            int iMo11010a2 = interfaceC2499X.mo11010a();
            if (iMo11010a2 == AbstractC2523k0.f9593c) {
                iMo11021l = interfaceC2499X.mo11021l();
                objMo11559b2 = abstractC2527n.mo11559b(c2526m, this.f9461a, iMo11021l);
            } else if (iMo11010a2 == AbstractC2523k0.f9594d) {
                if (objMo11559b2 != null) {
                    abstractC2527n.mo11565h(interfaceC2499X, objMo11559b2, c2526m, c2530q);
                } else {
                    abstractC2512fMo11035z = interfaceC2499X.mo11035z();
                }
            } else if (!interfaceC2499X.mo10998C()) {
                break;
            }
        }
        if (interfaceC2499X.mo11010a() != AbstractC2523k0.f9592b) {
            throw C2535v.m11645b();
        }
        if (abstractC2512fMo11035z != null) {
            if (objMo11559b2 != null) {
                abstractC2527n.mo11566i(abstractC2512fMo11035z, objMo11559b2, c2526m, c2530q);
            } else {
                abstractC2513f0.mo11166d(obj, iMo11021l, abstractC2512fMo11035z);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: n */
    private void m10979n(AbstractC2513f0 abstractC2513f0, Object obj, InterfaceC2525l0 interfaceC2525l0) {
        abstractC2513f0.mo11180s(abstractC2513f0.mo11169g(obj), interfaceC2525l0);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2500Y
    /* JADX INFO: renamed from: a */
    public void mo10966a(Object obj, Object obj2) {
        AbstractC2503a0.m11048F(this.f9462b, obj, obj2);
        if (this.f9463c) {
            AbstractC2503a0.m11046D(this.f9464d, obj, obj2);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2500Y
    /* JADX INFO: renamed from: b */
    public void mo10967b(Object obj) {
        this.f9462b.mo11172j(obj);
        this.f9464d.mo11563f(obj);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2500Y
    /* JADX INFO: renamed from: c */
    public final boolean mo10968c(Object obj) {
        return this.f9464d.mo11560c(obj).m11588k();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2500Y
    /* JADX INFO: renamed from: d */
    public boolean mo10969d(Object obj, Object obj2) {
        if (!this.f9462b.mo11169g(obj).equals(this.f9462b.mo11169g(obj2))) {
            return false;
        }
        if (this.f9463c) {
            return this.f9464d.mo11560c(obj).equals(this.f9464d.mo11560c(obj2));
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2500Y
    /* JADX INFO: renamed from: e */
    public int mo10970e(Object obj) {
        int iM10975j = m10975j(this.f9462b, obj);
        return this.f9463c ? iM10975j + this.f9464d.mo11560c(obj).m11585f() : iM10975j;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2500Y
    /* JADX INFO: renamed from: f */
    public Object mo10971f() {
        InterfaceC2486J interfaceC2486J = this.f9461a;
        return interfaceC2486J instanceof AbstractC2533t ? ((AbstractC2533t) interfaceC2486J).m11615I() : interfaceC2486J.mo10897c().mo10899m();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2500Y
    /* JADX INFO: renamed from: g */
    public int mo10972g(Object obj) {
        int iHashCode = this.f9462b.mo11169g(obj).hashCode();
        return this.f9463c ? (iHashCode * 53) + this.f9464d.mo11560c(obj).hashCode() : iHashCode;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2500Y
    /* JADX INFO: renamed from: h */
    public void mo10973h(Object obj, InterfaceC2499X interfaceC2499X, C2526m c2526m) throws Throwable {
        m10976k(this.f9462b, this.f9464d, obj, interfaceC2499X, c2526m);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2500Y
    /* JADX INFO: renamed from: i */
    public void mo10974i(Object obj, InterfaceC2525l0 interfaceC2525l0) {
        Iterator itM11589n = this.f9464d.mo11560c(obj).m11589n();
        if (itM11589n.hasNext()) {
            AbstractC2263x.m9328a(((Map.Entry) itM11589n.next()).getKey());
            throw null;
        }
        m10979n(this.f9462b, obj, interfaceC2525l0);
    }
}
