package p030D4;

import com.google.android.gms.common.internal.AbstractC3714q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import p350s4.C7011e;

/* JADX INFO: renamed from: D4.i */
/* JADX INFO: loaded from: classes.dex */
public class C0205i implements Iterable {

    /* JADX INFO: renamed from: d */
    private static final C7011e f902d = new C7011e(Collections.EMPTY_LIST, null);

    /* JADX INFO: renamed from: a */
    private final InterfaceC0210n f903a;

    /* JADX INFO: renamed from: b */
    private C7011e f904b;

    /* JADX INFO: renamed from: c */
    private final AbstractC0204h f905c;

    private C0205i(InterfaceC0210n interfaceC0210n, AbstractC0204h abstractC0204h) {
        this.f905c = abstractC0204h;
        this.f903a = interfaceC0210n;
        this.f904b = null;
    }

    /* JADX INFO: renamed from: a */
    private void m1060a() {
        if (this.f904b == null) {
            if (this.f905c.equals(C0206j.m1071j())) {
                this.f904b = f902d;
                return;
            }
            ArrayList arrayList = new ArrayList();
            boolean z7 = false;
            for (C0209m c0209m : this.f903a) {
                z7 = z7 || this.f905c.mo1056e(c0209m.m1083d());
                arrayList.add(new C0209m(c0209m.m1082c(), c0209m.m1083d()));
            }
            if (z7) {
                this.f904b = new C7011e(arrayList, this.f905c);
            } else {
                this.f904b = f902d;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static C0205i m1061b(InterfaceC0210n interfaceC0210n) {
        return new C0205i(interfaceC0210n, C0213q.m1089j());
    }

    /* JADX INFO: renamed from: e */
    public static C0205i m1062e(InterfaceC0210n interfaceC0210n, AbstractC0204h abstractC0204h) {
        return new C0205i(interfaceC0210n, abstractC0204h);
    }

    /* JADX INFO: renamed from: Q */
    public Iterator m1063Q() {
        m1060a();
        return AbstractC3714q.m18053b(this.f904b, f902d) ? this.f903a.mo1002Q() : this.f904b.m30616Q();
    }

    /* JADX INFO: renamed from: g */
    public C0209m m1064g() {
        if (!(this.f903a instanceof C0199c)) {
            return null;
        }
        m1060a();
        if (!AbstractC3714q.m18053b(this.f904b, f902d)) {
            return (C0209m) this.f904b.m30618b();
        }
        C0198b c0198bM1011p = ((C0199c) this.f903a).m1011p();
        return new C0209m(c0198bM1011p, this.f903a.mo1008l(c0198bM1011p));
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        m1060a();
        return AbstractC3714q.m18053b(this.f904b, f902d) ? this.f903a.iterator() : this.f904b.iterator();
    }

    /* JADX INFO: renamed from: j */
    public C0209m m1065j() {
        if (!(this.f903a instanceof C0199c)) {
            return null;
        }
        m1060a();
        if (!AbstractC3714q.m18053b(this.f904b, f902d)) {
            return (C0209m) this.f904b.m30617a();
        }
        C0198b c0198bM1012q = ((C0199c) this.f903a).m1012q();
        return new C0209m(c0198bM1012q, this.f903a.mo1008l(c0198bM1012q));
    }

    /* JADX INFO: renamed from: k */
    public InterfaceC0210n m1066k() {
        return this.f903a;
    }

    /* JADX INFO: renamed from: m */
    public C0198b m1067m(C0198b c0198b, InterfaceC0210n interfaceC0210n, AbstractC0204h abstractC0204h) {
        if (!this.f905c.equals(C0206j.m1071j()) && !this.f905c.equals(abstractC0204h)) {
            throw new IllegalArgumentException("Index not available in IndexedNode!");
        }
        m1060a();
        if (AbstractC3714q.m18053b(this.f904b, f902d)) {
            return this.f903a.mo1014s(c0198b);
        }
        C0209m c0209m = (C0209m) this.f904b.m30619e(new C0209m(c0198b, interfaceC0210n));
        if (c0209m != null) {
            return c0209m.m1082c();
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public boolean m1068n(AbstractC0204h abstractC0204h) {
        return this.f905c == abstractC0204h;
    }

    /* JADX INFO: renamed from: p */
    public C0205i m1069p(C0198b c0198b, InterfaceC0210n interfaceC0210n) {
        InterfaceC0210n interfaceC0210nMo999E = this.f903a.mo999E(c0198b, interfaceC0210n);
        C7011e c7011e = this.f904b;
        C7011e c7011e2 = f902d;
        if (AbstractC3714q.m18053b(c7011e, c7011e2) && !this.f905c.mo1056e(interfaceC0210n)) {
            return new C0205i(interfaceC0210nMo999E, this.f905c, c7011e2);
        }
        C7011e c7011e3 = this.f904b;
        if (c7011e3 == null || AbstractC3714q.m18053b(c7011e3, c7011e2)) {
            return new C0205i(interfaceC0210nMo999E, this.f905c, null);
        }
        C7011e c7011eM30622k = this.f904b.m30622k(new C0209m(c0198b, this.f903a.mo1008l(c0198b)));
        if (!interfaceC0210n.isEmpty()) {
            c7011eM30622k = c7011eM30622k.m30620g(new C0209m(c0198b, interfaceC0210n));
        }
        return new C0205i(interfaceC0210nMo999E, this.f905c, c7011eM30622k);
    }

    /* JADX INFO: renamed from: q */
    public C0205i m1070q(InterfaceC0210n interfaceC0210n) {
        return new C0205i(this.f903a.mo981G(interfaceC0210n), this.f905c, this.f904b);
    }

    private C0205i(InterfaceC0210n interfaceC0210n, AbstractC0204h abstractC0204h, C7011e c7011e) {
        this.f905c = abstractC0204h;
        this.f903a = interfaceC0210n;
        this.f904b = c7011e;
    }
}
