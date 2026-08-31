package p014B4;

import p006A4.C0018c;
import p030D4.AbstractC0204h;
import p030D4.C0198b;
import p030D4.C0205i;
import p030D4.C0209m;
import p030D4.InterfaceC0210n;
import p374v4.C7245j;
import p398y4.AbstractC7551l;

/* JADX INFO: renamed from: B4.b */
/* JADX INFO: loaded from: classes.dex */
public class C0087b implements InterfaceC0089d {

    /* JADX INFO: renamed from: a */
    private final AbstractC0204h f471a;

    public C0087b(AbstractC0204h abstractC0204h) {
        this.f471a = abstractC0204h;
    }

    @Override // p014B4.InterfaceC0089d
    /* JADX INFO: renamed from: c */
    public AbstractC0204h mo300c() {
        return this.f471a;
    }

    @Override // p014B4.InterfaceC0089d
    /* JADX INFO: renamed from: d */
    public InterfaceC0089d mo301d() {
        return this;
    }

    @Override // p014B4.InterfaceC0089d
    /* JADX INFO: renamed from: e */
    public boolean mo302e() {
        return false;
    }

    @Override // p014B4.InterfaceC0089d
    /* JADX INFO: renamed from: f */
    public C0205i mo303f(C0205i c0205i, InterfaceC0210n interfaceC0210n) {
        return c0205i.m1066k().isEmpty() ? c0205i : c0205i.m1070q(interfaceC0210n);
    }

    @Override // p014B4.InterfaceC0089d
    /* JADX INFO: renamed from: g */
    public C0205i mo304g(C0205i c0205i, C0205i c0205i2, C0086a c0086a) {
        AbstractC7551l.m33234g(c0205i2.m1068n(this.f471a), "Can't use IndexedNode that doesn't have filter's index");
        if (c0086a != null) {
            for (C0209m c0209m : c0205i.m1066k()) {
                if (!c0205i2.m1066k().mo1003R(c0209m.m1082c())) {
                    c0086a.m299b(C0018c.m98h(c0209m.m1082c(), c0209m.m1083d()));
                }
            }
            if (!c0205i2.m1066k().mo1000H()) {
                for (C0209m c0209m2 : c0205i2.m1066k()) {
                    if (c0205i.m1066k().mo1003R(c0209m2.m1082c())) {
                        InterfaceC0210n interfaceC0210nMo1008l = c0205i.m1066k().mo1008l(c0209m2.m1082c());
                        if (!interfaceC0210nMo1008l.equals(c0209m2.m1083d())) {
                            c0086a.m299b(C0018c.m95e(c0209m2.m1082c(), c0209m2.m1083d(), interfaceC0210nMo1008l));
                        }
                    } else {
                        c0086a.m299b(C0018c.m93c(c0209m2.m1082c(), c0209m2.m1083d()));
                    }
                }
            }
        }
        return c0205i2;
    }

    @Override // p014B4.InterfaceC0089d
    /* JADX INFO: renamed from: h */
    public C0205i mo305h(C0205i c0205i, C0198b c0198b, InterfaceC0210n interfaceC0210n, C7245j c7245j, InterfaceC0089d.a aVar, C0086a c0086a) {
        AbstractC7551l.m33234g(c0205i.m1068n(this.f471a), "The index must match the filter");
        InterfaceC0210n interfaceC0210nM1066k = c0205i.m1066k();
        InterfaceC0210n interfaceC0210nMo1008l = interfaceC0210nM1066k.mo1008l(c0198b);
        if (!interfaceC0210nMo1008l.mo1013r(c7245j).equals(interfaceC0210n.mo1013r(c7245j)) || interfaceC0210nMo1008l.isEmpty() != interfaceC0210n.isEmpty()) {
            if (c0086a != null) {
                if (interfaceC0210n.isEmpty()) {
                    if (interfaceC0210nM1066k.mo1003R(c0198b)) {
                        c0086a.m299b(C0018c.m98h(c0198b, interfaceC0210nMo1008l));
                    } else {
                        AbstractC7551l.m33234g(interfaceC0210nM1066k.mo1000H(), "A child remove without an old child only makes sense on a leaf node");
                    }
                } else if (interfaceC0210nMo1008l.isEmpty()) {
                    c0086a.m299b(C0018c.m93c(c0198b, interfaceC0210n));
                } else {
                    c0086a.m299b(C0018c.m95e(c0198b, interfaceC0210n, interfaceC0210nMo1008l));
                }
            }
            if (!interfaceC0210nM1066k.mo1000H() || !interfaceC0210n.isEmpty()) {
                return c0205i.m1069p(c0198b, interfaceC0210n);
            }
        }
        return c0205i;
    }
}
