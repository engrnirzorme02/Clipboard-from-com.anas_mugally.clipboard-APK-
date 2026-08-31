package p014B4;

import java.util.Iterator;
import p006A4.C0018c;
import p006A4.C0023h;
import p030D4.AbstractC0204h;
import p030D4.AbstractC0214r;
import p030D4.C0198b;
import p030D4.C0203g;
import p030D4.C0205i;
import p030D4.C0209m;
import p030D4.InterfaceC0210n;
import p374v4.C7245j;
import p398y4.AbstractC7551l;

/* JADX INFO: renamed from: B4.c */
/* JADX INFO: loaded from: classes.dex */
public class C0088c implements InterfaceC0089d {

    /* JADX INFO: renamed from: a */
    private final C0090e f472a;

    /* JADX INFO: renamed from: b */
    private final AbstractC0204h f473b;

    /* JADX INFO: renamed from: c */
    private final int f474c;

    /* JADX INFO: renamed from: d */
    private final boolean f475d;

    public C0088c(C0023h c0023h) {
        this.f472a = new C0090e(c0023h);
        this.f473b = c0023h.m118b();
        this.f474c = c0023h.m123g();
        this.f475d = !c0023h.m130n();
    }

    /* JADX INFO: renamed from: a */
    private C0205i m306a(C0205i c0205i, C0198b c0198b, InterfaceC0210n interfaceC0210n, InterfaceC0089d.a aVar, C0086a c0086a) {
        AbstractC7551l.m33233f(c0205i.m1066k().mo1005f() == this.f474c);
        C0209m c0209m = new C0209m(c0198b, interfaceC0210n);
        C0209m c0209mM1064g = this.f475d ? c0205i.m1064g() : c0205i.m1065j();
        boolean zM311k = this.f472a.m311k(c0209m);
        if (!c0205i.m1066k().mo1003R(c0198b)) {
            if (interfaceC0210n.isEmpty() || !zM311k || this.f473b.m1053a(c0209mM1064g, c0209m, this.f475d) < 0) {
                return c0205i;
            }
            if (c0086a != null) {
                c0086a.m299b(C0018c.m98h(c0209mM1064g.m1082c(), c0209mM1064g.m1083d()));
                c0086a.m299b(C0018c.m93c(c0198b, interfaceC0210n));
            }
            return c0205i.m1069p(c0198b, interfaceC0210n).m1069p(c0209mM1064g.m1082c(), C0203g.m1050w());
        }
        InterfaceC0210n interfaceC0210nMo1008l = c0205i.m1066k().mo1008l(c0198b);
        C0209m c0209mMo169a = aVar.mo169a(this.f473b, c0209mM1064g, this.f475d);
        while (c0209mMo169a != null && (c0209mMo169a.m1082c().equals(c0198b) || c0205i.m1066k().mo1003R(c0209mMo169a.m1082c()))) {
            c0209mMo169a = aVar.mo169a(this.f473b, c0209mMo169a, this.f475d);
        }
        int iM1053a = c0209mMo169a != null ? this.f473b.m1053a(c0209mMo169a, c0209m, this.f475d) : 1;
        if (zM311k && !interfaceC0210n.isEmpty() && iM1053a >= 0) {
            if (c0086a != null) {
                c0086a.m299b(C0018c.m95e(c0198b, interfaceC0210n, interfaceC0210nMo1008l));
            }
            return c0205i.m1069p(c0198b, interfaceC0210n);
        }
        if (c0086a != null) {
            c0086a.m299b(C0018c.m98h(c0198b, interfaceC0210nMo1008l));
        }
        C0205i c0205iM1069p = c0205i.m1069p(c0198b, C0203g.m1050w());
        if (c0209mMo169a == null || !this.f472a.m311k(c0209mMo169a)) {
            return c0205iM1069p;
        }
        if (c0086a != null) {
            c0086a.m299b(C0018c.m93c(c0209mMo169a.m1082c(), c0209mMo169a.m1083d()));
        }
        return c0205iM1069p.m1069p(c0209mMo169a.m1082c(), c0209mMo169a.m1083d());
    }

    @Override // p014B4.InterfaceC0089d
    /* JADX INFO: renamed from: c */
    public AbstractC0204h mo300c() {
        return this.f473b;
    }

    @Override // p014B4.InterfaceC0089d
    /* JADX INFO: renamed from: d */
    public InterfaceC0089d mo301d() {
        return this.f472a.mo301d();
    }

    @Override // p014B4.InterfaceC0089d
    /* JADX INFO: renamed from: e */
    public boolean mo302e() {
        return true;
    }

    @Override // p014B4.InterfaceC0089d
    /* JADX INFO: renamed from: f */
    public C0205i mo303f(C0205i c0205i, InterfaceC0210n interfaceC0210n) {
        return c0205i;
    }

    @Override // p014B4.InterfaceC0089d
    /* JADX INFO: renamed from: g */
    public C0205i mo304g(C0205i c0205i, C0205i c0205i2, C0086a c0086a) {
        C0205i c0205iM1062e;
        Iterator it;
        C0209m c0209mM310i;
        C0209m c0209mM309a;
        int i7;
        if (c0205i2.m1066k().mo1000H() || c0205i2.m1066k().isEmpty()) {
            c0205iM1062e = C0205i.m1062e(C0203g.m1050w(), this.f473b);
        } else {
            c0205iM1062e = c0205i2.m1070q(AbstractC0214r.m1091a());
            if (this.f475d) {
                it = c0205i2.m1063Q();
                c0209mM310i = this.f472a.m309a();
                c0209mM309a = this.f472a.m310i();
                i7 = -1;
            } else {
                it = c0205i2.iterator();
                c0209mM310i = this.f472a.m310i();
                c0209mM309a = this.f472a.m309a();
                i7 = 1;
            }
            boolean z7 = false;
            int i8 = 0;
            while (it.hasNext()) {
                C0209m c0209m = (C0209m) it.next();
                if (!z7 && this.f473b.compare(c0209mM310i, c0209m) * i7 <= 0) {
                    z7 = true;
                }
                if (!z7 || i8 >= this.f474c || this.f473b.compare(c0209m, c0209mM309a) * i7 > 0) {
                    c0205iM1062e = c0205iM1062e.m1069p(c0209m.m1082c(), C0203g.m1050w());
                } else {
                    i8++;
                }
            }
        }
        return this.f472a.mo301d().mo304g(c0205i, c0205iM1062e, c0086a);
    }

    @Override // p014B4.InterfaceC0089d
    /* JADX INFO: renamed from: h */
    public C0205i mo305h(C0205i c0205i, C0198b c0198b, InterfaceC0210n interfaceC0210n, C7245j c7245j, InterfaceC0089d.a aVar, C0086a c0086a) {
        if (!this.f472a.m311k(new C0209m(c0198b, interfaceC0210n))) {
            interfaceC0210n = C0203g.m1050w();
        }
        InterfaceC0210n interfaceC0210n2 = interfaceC0210n;
        if (c0205i.m1066k().mo1008l(c0198b).equals(interfaceC0210n2)) {
            return c0205i;
        }
        return c0205i.m1066k().mo1005f() < this.f474c ? this.f472a.mo301d().mo305h(c0205i, c0198b, interfaceC0210n2, c7245j, aVar, c0086a) : m306a(c0205i, c0198b, interfaceC0210n2, aVar, c0086a);
    }
}
