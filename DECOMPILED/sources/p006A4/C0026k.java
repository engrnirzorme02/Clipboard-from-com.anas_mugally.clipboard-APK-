package p006A4;

import p030D4.C0205i;
import p030D4.InterfaceC0210n;

/* JADX INFO: renamed from: A4.k */
/* JADX INFO: loaded from: classes.dex */
public class C0026k {

    /* JADX INFO: renamed from: a */
    private final C0016a f141a;

    /* JADX INFO: renamed from: b */
    private final C0016a f142b;

    public C0026k(C0016a c0016a, C0016a c0016a2) {
        this.f141a = c0016a;
        this.f142b = c0016a2;
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC0210n m152a() {
        if (this.f141a.m89f()) {
            return this.f141a.m85b();
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public InterfaceC0210n m153b() {
        if (this.f142b.m89f()) {
            return this.f142b.m85b();
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public C0016a m154c() {
        return this.f141a;
    }

    /* JADX INFO: renamed from: d */
    public C0016a m155d() {
        return this.f142b;
    }

    /* JADX INFO: renamed from: e */
    public C0026k m156e(C0205i c0205i, boolean z7, boolean z8) {
        return new C0026k(new C0016a(c0205i, z7, z8), this.f142b);
    }

    /* JADX INFO: renamed from: f */
    public C0026k m157f(C0205i c0205i, boolean z7, boolean z8) {
        return new C0026k(this.f141a, new C0016a(c0205i, z7, z8));
    }
}
