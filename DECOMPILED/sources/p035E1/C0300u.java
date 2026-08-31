package p035E1;

import p104N.InterfaceC0907d;
import p183Y1.AbstractC2022k;
import p190Z1.AbstractC2083a;
import p190Z1.AbstractC2085c;

/* JADX INFO: renamed from: E1.u */
/* JADX INFO: loaded from: classes.dex */
final class C0300u implements InterfaceC0301v, AbstractC2083a.f {

    /* JADX INFO: renamed from: e */
    private static final InterfaceC0907d f1250e = AbstractC2083a.m8598d(20, new a());

    /* JADX INFO: renamed from: a */
    private final AbstractC2085c f1251a = AbstractC2085c.m8610a();

    /* JADX INFO: renamed from: b */
    private InterfaceC0301v f1252b;

    /* JADX INFO: renamed from: c */
    private boolean f1253c;

    /* JADX INFO: renamed from: d */
    private boolean f1254d;

    /* JADX INFO: renamed from: E1.u$a */
    class a implements AbstractC2083a.d {
        a() {
        }

        @Override // p190Z1.AbstractC2083a.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C0300u mo1408a() {
            return new C0300u();
        }
    }

    C0300u() {
    }

    /* JADX INFO: renamed from: a */
    private void m1461a(InterfaceC0301v interfaceC0301v) {
        this.f1254d = false;
        this.f1253c = true;
        this.f1252b = interfaceC0301v;
    }

    /* JADX INFO: renamed from: e */
    static C0300u m1462e(InterfaceC0301v interfaceC0301v) {
        C0300u c0300u = (C0300u) AbstractC2022k.m8408e((C0300u) f1250e.mo4131b());
        c0300u.m1461a(interfaceC0301v);
        return c0300u;
    }

    /* JADX INFO: renamed from: f */
    private void m1463f() {
        this.f1252b = null;
        f1250e.mo4130a(this);
    }

    @Override // p035E1.InterfaceC0301v
    /* JADX INFO: renamed from: b */
    public synchronized void mo1436b() {
        this.f1251a.mo8612c();
        this.f1254d = true;
        if (!this.f1253c) {
            this.f1252b.mo1436b();
            m1463f();
        }
    }

    @Override // p035E1.InterfaceC0301v
    /* JADX INFO: renamed from: c */
    public int mo1437c() {
        return this.f1252b.mo1437c();
    }

    @Override // p035E1.InterfaceC0301v
    /* JADX INFO: renamed from: d */
    public Class mo1438d() {
        return this.f1252b.mo1438d();
    }

    /* JADX INFO: renamed from: g */
    synchronized void m1464g() {
        this.f1251a.mo8612c();
        if (!this.f1253c) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f1253c = false;
        if (this.f1254d) {
            mo1436b();
        }
    }

    @Override // p035E1.InterfaceC0301v
    public Object get() {
        return this.f1252b.get();
    }

    @Override // p190Z1.AbstractC2083a.f
    /* JADX INFO: renamed from: j */
    public AbstractC2085c mo1368j() {
        return this.f1251a;
    }
}
