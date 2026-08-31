package p014B4;

import java.util.Iterator;
import p006A4.C0023h;
import p030D4.AbstractC0204h;
import p030D4.AbstractC0214r;
import p030D4.C0198b;
import p030D4.C0203g;
import p030D4.C0205i;
import p030D4.C0209m;
import p030D4.InterfaceC0210n;
import p374v4.C7245j;

/* JADX INFO: renamed from: B4.e */
/* JADX INFO: loaded from: classes.dex */
public class C0090e implements InterfaceC0089d {

    /* JADX INFO: renamed from: a */
    private final C0087b f476a;

    /* JADX INFO: renamed from: b */
    private final AbstractC0204h f477b;

    /* JADX INFO: renamed from: c */
    private final C0209m f478c;

    /* JADX INFO: renamed from: d */
    private final C0209m f479d;

    public C0090e(C0023h c0023h) {
        this.f476a = new C0087b(c0023h.m118b());
        this.f477b = c0023h.m118b();
        this.f478c = m308j(c0023h);
        this.f479d = m307b(c0023h);
    }

    /* JADX INFO: renamed from: b */
    private static C0209m m307b(C0023h c0023h) {
        if (!c0023h.m126j()) {
            return c0023h.m118b().mo1058g();
        }
        return c0023h.m118b().mo1057f(c0023h.m119c(), c0023h.m120d());
    }

    /* JADX INFO: renamed from: j */
    private static C0209m m308j(C0023h c0023h) {
        if (!c0023h.m128l()) {
            return c0023h.m118b().m1059h();
        }
        return c0023h.m118b().mo1057f(c0023h.m121e(), c0023h.m122f());
    }

    /* JADX INFO: renamed from: a */
    public C0209m m309a() {
        return this.f479d;
    }

    @Override // p014B4.InterfaceC0089d
    /* JADX INFO: renamed from: c */
    public AbstractC0204h mo300c() {
        return this.f477b;
    }

    @Override // p014B4.InterfaceC0089d
    /* JADX INFO: renamed from: d */
    public InterfaceC0089d mo301d() {
        return this.f476a;
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
        if (c0205i2.m1066k().mo1000H()) {
            c0205iM1062e = C0205i.m1062e(C0203g.m1050w(), this.f477b);
        } else {
            C0205i c0205iM1070q = c0205i2.m1070q(AbstractC0214r.m1091a());
            Iterator it = c0205i2.iterator();
            while (it.hasNext()) {
                C0209m c0209m = (C0209m) it.next();
                if (!m311k(c0209m)) {
                    c0205iM1070q = c0205iM1070q.m1069p(c0209m.m1082c(), C0203g.m1050w());
                }
            }
            c0205iM1062e = c0205iM1070q;
        }
        return this.f476a.mo304g(c0205i, c0205iM1062e, c0086a);
    }

    @Override // p014B4.InterfaceC0089d
    /* JADX INFO: renamed from: h */
    public C0205i mo305h(C0205i c0205i, C0198b c0198b, InterfaceC0210n interfaceC0210n, C7245j c7245j, InterfaceC0089d.a aVar, C0086a c0086a) {
        if (!m311k(new C0209m(c0198b, interfaceC0210n))) {
            interfaceC0210n = C0203g.m1050w();
        }
        return this.f476a.mo305h(c0205i, c0198b, interfaceC0210n, c7245j, aVar, c0086a);
    }

    /* JADX INFO: renamed from: i */
    public C0209m m310i() {
        return this.f478c;
    }

    /* JADX INFO: renamed from: k */
    public boolean m311k(C0209m c0209m) {
        return this.f477b.compare(m310i(), c0209m) <= 0 && this.f477b.compare(c0209m, m309a()) <= 0;
    }
}
