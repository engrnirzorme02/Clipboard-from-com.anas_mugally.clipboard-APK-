package p155U1;

/* JADX INFO: renamed from: U1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1659b implements InterfaceC1661d, InterfaceC1660c {

    /* JADX INFO: renamed from: a */
    private final Object f5497a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC1661d f5498b;

    /* JADX INFO: renamed from: c */
    private volatile InterfaceC1660c f5499c;

    /* JADX INFO: renamed from: d */
    private volatile InterfaceC1660c f5500d;

    /* JADX INFO: renamed from: e */
    private InterfaceC1661d.a f5501e;

    /* JADX INFO: renamed from: f */
    private InterfaceC1661d.a f5502f;

    public C1659b(Object obj, InterfaceC1661d interfaceC1661d) {
        InterfaceC1661d.a aVar = InterfaceC1661d.a.CLEARED;
        this.f5501e = aVar;
        this.f5502f = aVar;
        this.f5497a = obj;
        this.f5498b = interfaceC1661d;
    }

    /* JADX INFO: renamed from: l */
    private boolean m6980l(InterfaceC1660c interfaceC1660c) {
        InterfaceC1661d.a aVar = this.f5501e;
        InterfaceC1661d.a aVar2 = InterfaceC1661d.a.FAILED;
        if (aVar != aVar2) {
            return interfaceC1660c.equals(this.f5499c);
        }
        if (!interfaceC1660c.equals(this.f5500d)) {
            return false;
        }
        InterfaceC1661d.a aVar3 = this.f5502f;
        return aVar3 == InterfaceC1661d.a.SUCCESS || aVar3 == aVar2;
    }

    /* JADX INFO: renamed from: m */
    private boolean m6981m() {
        InterfaceC1661d interfaceC1661d = this.f5498b;
        return interfaceC1661d == null || interfaceC1661d.mo6984a(this);
    }

    /* JADX INFO: renamed from: n */
    private boolean m6982n() {
        InterfaceC1661d interfaceC1661d = this.f5498b;
        return interfaceC1661d == null || interfaceC1661d.mo6987d(this);
    }

    /* JADX INFO: renamed from: o */
    private boolean m6983o() {
        InterfaceC1661d interfaceC1661d = this.f5498b;
        return interfaceC1661d == null || interfaceC1661d.mo6989f(this);
    }

    @Override // p155U1.InterfaceC1661d
    /* JADX INFO: renamed from: a */
    public boolean mo6984a(InterfaceC1660c interfaceC1660c) {
        boolean z7;
        synchronized (this.f5497a) {
            try {
                z7 = m6981m() && interfaceC1660c.equals(this.f5499c);
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
        synchronized (this.f5497a) {
            try {
                z7 = this.f5499c.mo6985b() || this.f5500d.mo6985b();
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
        synchronized (this.f5497a) {
            try {
                InterfaceC1661d interfaceC1661d = this.f5498b;
                interfaceC1661dMo6986c = interfaceC1661d != null ? interfaceC1661d.mo6986c() : this;
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC1661dMo6986c;
    }

    @Override // p155U1.InterfaceC1660c
    public void clear() {
        synchronized (this.f5497a) {
            try {
                InterfaceC1661d.a aVar = InterfaceC1661d.a.CLEARED;
                this.f5501e = aVar;
                this.f5499c.clear();
                if (this.f5502f != aVar) {
                    this.f5502f = aVar;
                    this.f5500d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p155U1.InterfaceC1661d
    /* JADX INFO: renamed from: d */
    public boolean mo6987d(InterfaceC1660c interfaceC1660c) {
        boolean z7;
        synchronized (this.f5497a) {
            try {
                z7 = m6982n() && m6980l(interfaceC1660c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return z7;
    }

    @Override // p155U1.InterfaceC1661d
    /* JADX INFO: renamed from: e */
    public void mo6988e(InterfaceC1660c interfaceC1660c) {
        synchronized (this.f5497a) {
            try {
                if (interfaceC1660c.equals(this.f5500d)) {
                    this.f5502f = InterfaceC1661d.a.FAILED;
                    InterfaceC1661d interfaceC1661d = this.f5498b;
                    if (interfaceC1661d != null) {
                        interfaceC1661d.mo6988e(this);
                    }
                    return;
                }
                this.f5501e = InterfaceC1661d.a.FAILED;
                InterfaceC1661d.a aVar = this.f5502f;
                InterfaceC1661d.a aVar2 = InterfaceC1661d.a.RUNNING;
                if (aVar != aVar2) {
                    this.f5502f = aVar2;
                    this.f5500d.mo6991h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p155U1.InterfaceC1661d
    /* JADX INFO: renamed from: f */
    public boolean mo6989f(InterfaceC1660c interfaceC1660c) {
        boolean zM6983o;
        synchronized (this.f5497a) {
            zM6983o = m6983o();
        }
        return zM6983o;
    }

    @Override // p155U1.InterfaceC1660c
    /* JADX INFO: renamed from: g */
    public boolean mo6990g() {
        boolean z7;
        synchronized (this.f5497a) {
            try {
                InterfaceC1661d.a aVar = this.f5501e;
                InterfaceC1661d.a aVar2 = InterfaceC1661d.a.CLEARED;
                z7 = aVar == aVar2 && this.f5502f == aVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z7;
    }

    @Override // p155U1.InterfaceC1660c
    /* JADX INFO: renamed from: h */
    public void mo6991h() {
        synchronized (this.f5497a) {
            try {
                InterfaceC1661d.a aVar = this.f5501e;
                InterfaceC1661d.a aVar2 = InterfaceC1661d.a.RUNNING;
                if (aVar != aVar2) {
                    this.f5501e = aVar2;
                    this.f5499c.mo6991h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p155U1.InterfaceC1660c
    /* JADX INFO: renamed from: i */
    public boolean mo6992i(InterfaceC1660c interfaceC1660c) {
        if (interfaceC1660c instanceof C1659b) {
            C1659b c1659b = (C1659b) interfaceC1660c;
            if (this.f5499c.mo6992i(c1659b.f5499c) && this.f5500d.mo6992i(c1659b.f5500d)) {
                return true;
            }
        }
        return false;
    }

    @Override // p155U1.InterfaceC1660c
    public boolean isRunning() {
        boolean z7;
        synchronized (this.f5497a) {
            try {
                InterfaceC1661d.a aVar = this.f5501e;
                InterfaceC1661d.a aVar2 = InterfaceC1661d.a.RUNNING;
                z7 = aVar == aVar2 || this.f5502f == aVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z7;
    }

    @Override // p155U1.InterfaceC1661d
    /* JADX INFO: renamed from: j */
    public void mo6993j(InterfaceC1660c interfaceC1660c) {
        synchronized (this.f5497a) {
            try {
                if (interfaceC1660c.equals(this.f5499c)) {
                    this.f5501e = InterfaceC1661d.a.SUCCESS;
                } else if (interfaceC1660c.equals(this.f5500d)) {
                    this.f5502f = InterfaceC1661d.a.SUCCESS;
                }
                InterfaceC1661d interfaceC1661d = this.f5498b;
                if (interfaceC1661d != null) {
                    interfaceC1661d.mo6993j(this);
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
        synchronized (this.f5497a) {
            try {
                InterfaceC1661d.a aVar = this.f5501e;
                InterfaceC1661d.a aVar2 = InterfaceC1661d.a.SUCCESS;
                z7 = aVar == aVar2 || this.f5502f == aVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z7;
    }

    /* JADX INFO: renamed from: p */
    public void m6995p(InterfaceC1660c interfaceC1660c, InterfaceC1660c interfaceC1660c2) {
        this.f5499c = interfaceC1660c;
        this.f5500d = interfaceC1660c2;
    }

    @Override // p155U1.InterfaceC1660c
    public void pause() {
        synchronized (this.f5497a) {
            try {
                InterfaceC1661d.a aVar = this.f5501e;
                InterfaceC1661d.a aVar2 = InterfaceC1661d.a.RUNNING;
                if (aVar == aVar2) {
                    this.f5501e = InterfaceC1661d.a.PAUSED;
                    this.f5499c.pause();
                }
                if (this.f5502f == aVar2) {
                    this.f5502f = InterfaceC1661d.a.PAUSED;
                    this.f5500d.pause();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
