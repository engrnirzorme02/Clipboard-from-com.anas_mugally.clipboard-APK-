package p155U1;

/* JADX INFO: renamed from: U1.i */
/* JADX INFO: loaded from: classes.dex */
public class C1666i implements InterfaceC1661d, InterfaceC1660c {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1661d f5547a;

    /* JADX INFO: renamed from: b */
    private final Object f5548b;

    /* JADX INFO: renamed from: c */
    private volatile InterfaceC1660c f5549c;

    /* JADX INFO: renamed from: d */
    private volatile InterfaceC1660c f5550d;

    /* JADX INFO: renamed from: e */
    private InterfaceC1661d.a f5551e;

    /* JADX INFO: renamed from: f */
    private InterfaceC1661d.a f5552f;

    /* JADX INFO: renamed from: g */
    private boolean f5553g;

    public C1666i(Object obj, InterfaceC1661d interfaceC1661d) {
        InterfaceC1661d.a aVar = InterfaceC1661d.a.CLEARED;
        this.f5551e = aVar;
        this.f5552f = aVar;
        this.f5548b = obj;
        this.f5547a = interfaceC1661d;
    }

    /* JADX INFO: renamed from: l */
    private boolean m7025l() {
        InterfaceC1661d interfaceC1661d = this.f5547a;
        return interfaceC1661d == null || interfaceC1661d.mo6984a(this);
    }

    /* JADX INFO: renamed from: m */
    private boolean m7026m() {
        InterfaceC1661d interfaceC1661d = this.f5547a;
        return interfaceC1661d == null || interfaceC1661d.mo6987d(this);
    }

    /* JADX INFO: renamed from: n */
    private boolean m7027n() {
        InterfaceC1661d interfaceC1661d = this.f5547a;
        return interfaceC1661d == null || interfaceC1661d.mo6989f(this);
    }

    @Override // p155U1.InterfaceC1661d
    /* JADX INFO: renamed from: a */
    public boolean mo6984a(InterfaceC1660c interfaceC1660c) {
        boolean z7;
        synchronized (this.f5548b) {
            try {
                z7 = m7025l() && interfaceC1660c.equals(this.f5549c) && this.f5551e != InterfaceC1661d.a.PAUSED;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z7;
    }

    @Override // p155U1.InterfaceC1661d, p155U1.InterfaceC1660c
    /* JADX INFO: renamed from: b */
    public boolean mo6985b() {
        boolean z7;
        synchronized (this.f5548b) {
            try {
                z7 = this.f5550d.mo6985b() || this.f5549c.mo6985b();
            } catch (Throwable th) {
                throw th;
            }
        }
        return z7;
    }

    @Override // p155U1.InterfaceC1661d
    /* JADX INFO: renamed from: c */
    public InterfaceC1661d mo6986c() {
        InterfaceC1661d interfaceC1661dMo6986c;
        synchronized (this.f5548b) {
            try {
                InterfaceC1661d interfaceC1661d = this.f5547a;
                interfaceC1661dMo6986c = interfaceC1661d != null ? interfaceC1661d.mo6986c() : this;
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC1661dMo6986c;
    }

    @Override // p155U1.InterfaceC1660c
    public void clear() {
        synchronized (this.f5548b) {
            this.f5553g = false;
            InterfaceC1661d.a aVar = InterfaceC1661d.a.CLEARED;
            this.f5551e = aVar;
            this.f5552f = aVar;
            this.f5550d.clear();
            this.f5549c.clear();
        }
    }

    @Override // p155U1.InterfaceC1661d
    /* JADX INFO: renamed from: d */
    public boolean mo6987d(InterfaceC1660c interfaceC1660c) {
        boolean z7;
        synchronized (this.f5548b) {
            try {
                z7 = m7026m() && interfaceC1660c.equals(this.f5549c) && !mo6985b();
            } catch (Throwable th) {
                throw th;
            }
        }
        return z7;
    }

    @Override // p155U1.InterfaceC1661d
    /* JADX INFO: renamed from: e */
    public void mo6988e(InterfaceC1660c interfaceC1660c) {
        synchronized (this.f5548b) {
            try {
                if (!interfaceC1660c.equals(this.f5549c)) {
                    this.f5552f = InterfaceC1661d.a.FAILED;
                    return;
                }
                this.f5551e = InterfaceC1661d.a.FAILED;
                InterfaceC1661d interfaceC1661d = this.f5547a;
                if (interfaceC1661d != null) {
                    interfaceC1661d.mo6988e(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p155U1.InterfaceC1661d
    /* JADX INFO: renamed from: f */
    public boolean mo6989f(InterfaceC1660c interfaceC1660c) {
        boolean z7;
        synchronized (this.f5548b) {
            try {
                z7 = m7027n() && (interfaceC1660c.equals(this.f5549c) || this.f5551e != InterfaceC1661d.a.SUCCESS);
            } catch (Throwable th) {
                throw th;
            }
        }
        return z7;
    }

    @Override // p155U1.InterfaceC1660c
    /* JADX INFO: renamed from: g */
    public boolean mo6990g() {
        boolean z7;
        synchronized (this.f5548b) {
            z7 = this.f5551e == InterfaceC1661d.a.CLEARED;
        }
        return z7;
    }

    @Override // p155U1.InterfaceC1660c
    /* JADX INFO: renamed from: h */
    public void mo6991h() {
        synchronized (this.f5548b) {
            try {
                this.f5553g = true;
                try {
                    if (this.f5551e != InterfaceC1661d.a.SUCCESS) {
                        InterfaceC1661d.a aVar = this.f5552f;
                        InterfaceC1661d.a aVar2 = InterfaceC1661d.a.RUNNING;
                        if (aVar != aVar2) {
                            this.f5552f = aVar2;
                            this.f5550d.mo6991h();
                        }
                    }
                    if (this.f5553g) {
                        InterfaceC1661d.a aVar3 = this.f5551e;
                        InterfaceC1661d.a aVar4 = InterfaceC1661d.a.RUNNING;
                        if (aVar3 != aVar4) {
                            this.f5551e = aVar4;
                            this.f5549c.mo6991h();
                        }
                    }
                    this.f5553g = false;
                } catch (Throwable th) {
                    this.f5553g = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p155U1.InterfaceC1660c
    /* JADX INFO: renamed from: i */
    public boolean mo6992i(InterfaceC1660c interfaceC1660c) {
        if (interfaceC1660c instanceof C1666i) {
            C1666i c1666i = (C1666i) interfaceC1660c;
            if (this.f5549c != null ? this.f5549c.mo6992i(c1666i.f5549c) : c1666i.f5549c == null) {
                if (this.f5550d == null) {
                    if (c1666i.f5550d == null) {
                        return true;
                    }
                } else if (this.f5550d.mo6992i(c1666i.f5550d)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p155U1.InterfaceC1660c
    public boolean isRunning() {
        boolean z7;
        synchronized (this.f5548b) {
            z7 = this.f5551e == InterfaceC1661d.a.RUNNING;
        }
        return z7;
    }

    @Override // p155U1.InterfaceC1661d
    /* JADX INFO: renamed from: j */
    public void mo6993j(InterfaceC1660c interfaceC1660c) {
        synchronized (this.f5548b) {
            try {
                if (interfaceC1660c.equals(this.f5550d)) {
                    this.f5552f = InterfaceC1661d.a.SUCCESS;
                    return;
                }
                this.f5551e = InterfaceC1661d.a.SUCCESS;
                InterfaceC1661d interfaceC1661d = this.f5547a;
                if (interfaceC1661d != null) {
                    interfaceC1661d.mo6993j(this);
                }
                if (!this.f5552f.m6997d()) {
                    this.f5550d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p155U1.InterfaceC1660c
    /* JADX INFO: renamed from: k */
    public boolean mo6994k() {
        boolean z7;
        synchronized (this.f5548b) {
            z7 = this.f5551e == InterfaceC1661d.a.SUCCESS;
        }
        return z7;
    }

    /* JADX INFO: renamed from: o */
    public void m7028o(InterfaceC1660c interfaceC1660c, InterfaceC1660c interfaceC1660c2) {
        this.f5549c = interfaceC1660c;
        this.f5550d = interfaceC1660c2;
    }

    @Override // p155U1.InterfaceC1660c
    public void pause() {
        synchronized (this.f5548b) {
            try {
                if (!this.f5552f.m6997d()) {
                    this.f5552f = InterfaceC1661d.a.PAUSED;
                    this.f5550d.pause();
                }
                if (!this.f5551e.m6997d()) {
                    this.f5551e = InterfaceC1661d.a.PAUSED;
                    this.f5549c.pause();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
