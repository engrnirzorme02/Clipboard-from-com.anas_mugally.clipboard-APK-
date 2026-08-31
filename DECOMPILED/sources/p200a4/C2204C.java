package p200a4;

import p211b5.InterfaceC2971a;
import p211b5.InterfaceC2972b;

/* JADX INFO: renamed from: a4.C */
/* JADX INFO: loaded from: classes.dex */
class C2204C implements InterfaceC2972b, InterfaceC2971a {

    /* JADX INFO: renamed from: c */
    private static final InterfaceC2971a.a f7135c = new InterfaceC2971a.a() { // from class: a4.z
        @Override // p211b5.InterfaceC2971a.a
        /* JADX INFO: renamed from: a */
        public final void mo5341a(InterfaceC2972b interfaceC2972b) {
            C2204C.m8942d(interfaceC2972b);
        }
    };

    /* JADX INFO: renamed from: d */
    private static final InterfaceC2972b f7136d = new InterfaceC2972b() { // from class: a4.A
        @Override // p211b5.InterfaceC2972b
        public final Object get() {
            return C2204C.m8940b();
        }
    };

    /* JADX INFO: renamed from: a */
    private InterfaceC2971a.a f7137a;

    /* JADX INFO: renamed from: b */
    private volatile InterfaceC2972b f7138b;

    private C2204C(InterfaceC2971a.a aVar, InterfaceC2972b interfaceC2972b) {
        this.f7137a = aVar;
        this.f7138b = interfaceC2972b;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Object m8940b() {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m8941c(InterfaceC2971a.a aVar, InterfaceC2971a.a aVar2, InterfaceC2972b interfaceC2972b) {
        aVar.mo5341a(interfaceC2972b);
        aVar2.mo5341a(interfaceC2972b);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m8942d(InterfaceC2972b interfaceC2972b) {
    }

    /* JADX INFO: renamed from: e */
    static C2204C m8943e() {
        return new C2204C(f7135c, f7136d);
    }

    /* JADX INFO: renamed from: f */
    static C2204C m8944f(InterfaceC2972b interfaceC2972b) {
        return new C2204C(null, interfaceC2972b);
    }

    @Override // p211b5.InterfaceC2971a
    /* JADX INFO: renamed from: a */
    public void mo8945a(final InterfaceC2971a.a aVar) {
        InterfaceC2972b interfaceC2972b;
        InterfaceC2972b interfaceC2972b2;
        InterfaceC2972b interfaceC2972b3 = this.f7138b;
        InterfaceC2972b interfaceC2972b4 = f7136d;
        if (interfaceC2972b3 != interfaceC2972b4) {
            aVar.mo5341a(interfaceC2972b3);
            return;
        }
        synchronized (this) {
            interfaceC2972b = this.f7138b;
            if (interfaceC2972b != interfaceC2972b4) {
                interfaceC2972b2 = interfaceC2972b;
            } else {
                final InterfaceC2971a.a aVar2 = this.f7137a;
                this.f7137a = new InterfaceC2971a.a() { // from class: a4.B
                    @Override // p211b5.InterfaceC2971a.a
                    /* JADX INFO: renamed from: a */
                    public final void mo5341a(InterfaceC2972b interfaceC2972b5) {
                        C2204C.m8941c(aVar2, aVar, interfaceC2972b5);
                    }
                };
                interfaceC2972b2 = null;
            }
        }
        if (interfaceC2972b2 != null) {
            aVar.mo5341a(interfaceC2972b);
        }
    }

    /* JADX INFO: renamed from: g */
    void m8946g(InterfaceC2972b interfaceC2972b) {
        InterfaceC2971a.a aVar;
        if (this.f7138b != f7136d) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (this) {
            aVar = this.f7137a;
            this.f7137a = null;
            this.f7138b = interfaceC2972b;
        }
        aVar.mo5341a(interfaceC2972b);
    }

    @Override // p211b5.InterfaceC2972b
    public Object get() {
        return this.f7138b.get();
    }
}
