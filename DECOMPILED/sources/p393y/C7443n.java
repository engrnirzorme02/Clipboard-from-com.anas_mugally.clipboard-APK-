package p393y;

import p385x.C7369d;
import p385x.C7370e;
import p385x.InterfaceC7374i;

/* JADX INFO: renamed from: y.n */
/* JADX INFO: loaded from: classes.dex */
public class C7443n extends AbstractC7445p {

    /* JADX INFO: renamed from: k */
    public C7435f f29818k;

    /* JADX INFO: renamed from: l */
    C7436g f29819l;

    /* JADX INFO: renamed from: y.n$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f29820a;

        static {
            int[] iArr = new int[AbstractC7445p.b.values().length];
            f29820a = iArr;
            try {
                iArr[AbstractC7445p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29820a[AbstractC7445p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29820a[AbstractC7445p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C7443n(C7370e c7370e) {
        super(c7370e);
        C7435f c7435f = new C7435f(this);
        this.f29818k = c7435f;
        this.f29819l = null;
        this.f29842h.f29787e = C7435f.a.TOP;
        this.f29843i.f29787e = C7435f.a.BOTTOM;
        c7435f.f29787e = C7435f.a.BASELINE;
        this.f29840f = 1;
    }

    @Override // p393y.AbstractC7445p, p393y.InterfaceC7433d
    /* JADX INFO: renamed from: a */
    public void mo32914a(InterfaceC7433d interfaceC7433d) {
        float f7;
        float fM32566v;
        float fM32566v2;
        int i7;
        int i8 = a.f29820a[this.f29844j.ordinal()];
        if (i8 == 1) {
            m32979p(interfaceC7433d);
        } else if (i8 == 2) {
            m32978o(interfaceC7433d);
        } else if (i8 == 3) {
            C7370e c7370e = this.f29836b;
            m32977n(interfaceC7433d, c7370e.f29413P, c7370e.f29415R, 1);
            return;
        }
        C7436g c7436g = this.f29839e;
        if (c7436g.f29785c && !c7436g.f29792j && this.f29838d == C7370e.b.MATCH_CONSTRAINT) {
            C7370e c7370e2 = this.f29836b;
            int i9 = c7370e2.f29470x;
            if (i9 == 2) {
                C7370e c7370eM32486K = c7370e2.m32486K();
                if (c7370eM32486K != null) {
                    C7436g c7436g2 = c7370eM32486K.f29434f.f29839e;
                    if (c7436g2.f29792j) {
                        this.f29839e.mo32936d((int) ((c7436g2.f29789g * this.f29836b.f29396E) + 0.5f));
                    }
                }
            } else if (i9 == 3 && c7370e2.f29432e.f29839e.f29792j) {
                int iM32568w = c7370e2.m32568w();
                if (iM32568w != -1) {
                    if (iM32568w == 0) {
                        C7370e c7370e3 = this.f29836b;
                        fM32566v2 = c7370e3.f29432e.f29839e.f29789g * c7370e3.m32566v();
                        i7 = (int) (fM32566v2 + 0.5f);
                    } else if (iM32568w != 1) {
                        i7 = 0;
                    } else {
                        C7370e c7370e4 = this.f29836b;
                        f7 = c7370e4.f29432e.f29839e.f29789g;
                        fM32566v = c7370e4.m32566v();
                    }
                    this.f29839e.mo32936d(i7);
                } else {
                    C7370e c7370e5 = this.f29836b;
                    f7 = c7370e5.f29432e.f29839e.f29789g;
                    fM32566v = c7370e5.m32566v();
                }
                fM32566v2 = f7 / fM32566v;
                i7 = (int) (fM32566v2 + 0.5f);
                this.f29839e.mo32936d(i7);
            }
        }
        C7435f c7435f = this.f29842h;
        if (c7435f.f29785c) {
            C7435f c7435f2 = this.f29843i;
            if (c7435f2.f29785c) {
                if (c7435f.f29792j && c7435f2.f29792j && this.f29839e.f29792j) {
                    return;
                }
                if (!this.f29839e.f29792j && this.f29838d == C7370e.b.MATCH_CONSTRAINT) {
                    C7370e c7370e6 = this.f29836b;
                    if (c7370e6.f29468w == 0 && !c7370e6.m32539k0()) {
                        C7435f c7435f3 = (C7435f) this.f29842h.f29794l.get(0);
                        C7435f c7435f4 = (C7435f) this.f29843i.f29794l.get(0);
                        int i10 = c7435f3.f29789g;
                        C7435f c7435f5 = this.f29842h;
                        int i11 = i10 + c7435f5.f29788f;
                        int i12 = c7435f4.f29789g + this.f29843i.f29788f;
                        c7435f5.mo32936d(i11);
                        this.f29843i.mo32936d(i12);
                        this.f29839e.mo32936d(i12 - i11);
                        return;
                    }
                }
                if (!this.f29839e.f29792j && this.f29838d == C7370e.b.MATCH_CONSTRAINT && this.f29835a == 1 && this.f29842h.f29794l.size() > 0 && this.f29843i.f29794l.size() > 0) {
                    C7435f c7435f6 = (C7435f) this.f29842h.f29794l.get(0);
                    int i13 = (((C7435f) this.f29843i.f29794l.get(0)).f29789g + this.f29843i.f29788f) - (c7435f6.f29789g + this.f29842h.f29788f);
                    C7436g c7436g3 = this.f29839e;
                    int i14 = c7436g3.f29804m;
                    if (i13 < i14) {
                        c7436g3.mo32936d(i13);
                    } else {
                        c7436g3.mo32936d(i14);
                    }
                }
                if (this.f29839e.f29792j && this.f29842h.f29794l.size() > 0 && this.f29843i.f29794l.size() > 0) {
                    C7435f c7435f7 = (C7435f) this.f29842h.f29794l.get(0);
                    C7435f c7435f8 = (C7435f) this.f29843i.f29794l.get(0);
                    int i15 = c7435f7.f29789g + this.f29842h.f29788f;
                    int i16 = c7435f8.f29789g + this.f29843i.f29788f;
                    float fM32498R = this.f29836b.m32498R();
                    if (c7435f7 == c7435f8) {
                        i15 = c7435f7.f29789g;
                        i16 = c7435f8.f29789g;
                        fM32498R = 0.5f;
                    }
                    this.f29842h.mo32936d((int) (i15 + 0.5f + (((i16 - i15) - this.f29839e.f29789g) * fM32498R)));
                    this.f29843i.mo32936d(this.f29842h.f29789g + this.f29839e.f29789g);
                }
            }
        }
    }

    @Override // p393y.AbstractC7445p
    /* JADX INFO: renamed from: d */
    void mo32915d() {
        C7370e c7370eM32486K;
        C7370e c7370eM32486K2;
        C7370e c7370e = this.f29836b;
        if (c7370e.f29424a) {
            this.f29839e.mo32936d(c7370e.m32570x());
        }
        if (!this.f29839e.f29792j) {
            this.f29838d = this.f29836b.m32502T();
            if (this.f29836b.m32514Z()) {
                this.f29819l = new C7430a(this);
            }
            C7370e.b bVar = this.f29838d;
            if (bVar != C7370e.b.MATCH_CONSTRAINT) {
                if (bVar == C7370e.b.MATCH_PARENT && (c7370eM32486K2 = this.f29836b.m32486K()) != null && c7370eM32486K2.m32502T() == C7370e.b.FIXED) {
                    int iM32570x = (c7370eM32486K2.m32570x() - this.f29836b.f29413P.m32441f()) - this.f29836b.f29415R.m32441f();
                    m32971b(this.f29842h, c7370eM32486K2.f29434f.f29842h, this.f29836b.f29413P.m32441f());
                    m32971b(this.f29843i, c7370eM32486K2.f29434f.f29843i, -this.f29836b.f29415R.m32441f());
                    this.f29839e.mo32936d(iM32570x);
                    return;
                }
                if (this.f29838d == C7370e.b.FIXED) {
                    this.f29839e.mo32936d(this.f29836b.m32570x());
                }
            }
        } else if (this.f29838d == C7370e.b.MATCH_PARENT && (c7370eM32486K = this.f29836b.m32486K()) != null && c7370eM32486K.m32502T() == C7370e.b.FIXED) {
            m32971b(this.f29842h, c7370eM32486K.f29434f.f29842h, this.f29836b.f29413P.m32441f());
            m32971b(this.f29843i, c7370eM32486K.f29434f.f29843i, -this.f29836b.f29415R.m32441f());
            return;
        }
        C7436g c7436g = this.f29839e;
        boolean z7 = c7436g.f29792j;
        if (z7) {
            C7370e c7370e2 = this.f29836b;
            if (c7370e2.f29424a) {
                C7369d[] c7369dArr = c7370e2.f29420W;
                C7369d c7369d = c7369dArr[2];
                C7369d c7369d2 = c7369d.f29373f;
                if (c7369d2 != null && c7369dArr[3].f29373f != null) {
                    if (c7370e2.m32539k0()) {
                        this.f29842h.f29788f = this.f29836b.f29420W[2].m32441f();
                        this.f29843i.f29788f = -this.f29836b.f29420W[3].m32441f();
                    } else {
                        C7435f c7435fM32974h = m32974h(this.f29836b.f29420W[2]);
                        if (c7435fM32974h != null) {
                            m32971b(this.f29842h, c7435fM32974h, this.f29836b.f29420W[2].m32441f());
                        }
                        C7435f c7435fM32974h2 = m32974h(this.f29836b.f29420W[3]);
                        if (c7435fM32974h2 != null) {
                            m32971b(this.f29843i, c7435fM32974h2, -this.f29836b.f29420W[3].m32441f());
                        }
                        this.f29842h.f29784b = true;
                        this.f29843i.f29784b = true;
                    }
                    if (this.f29836b.m32514Z()) {
                        m32971b(this.f29818k, this.f29842h, this.f29836b.m32551p());
                        return;
                    }
                    return;
                }
                if (c7369d2 != null) {
                    C7435f c7435fM32974h3 = m32974h(c7369d);
                    if (c7435fM32974h3 != null) {
                        m32971b(this.f29842h, c7435fM32974h3, this.f29836b.f29420W[2].m32441f());
                        m32971b(this.f29843i, this.f29842h, this.f29839e.f29789g);
                        if (this.f29836b.m32514Z()) {
                            m32971b(this.f29818k, this.f29842h, this.f29836b.m32551p());
                            return;
                        }
                        return;
                    }
                    return;
                }
                C7369d c7369d3 = c7369dArr[3];
                if (c7369d3.f29373f != null) {
                    C7435f c7435fM32974h4 = m32974h(c7369d3);
                    if (c7435fM32974h4 != null) {
                        m32971b(this.f29843i, c7435fM32974h4, -this.f29836b.f29420W[3].m32441f());
                        m32971b(this.f29842h, this.f29843i, -this.f29839e.f29789g);
                    }
                    if (this.f29836b.m32514Z()) {
                        m32971b(this.f29818k, this.f29842h, this.f29836b.m32551p());
                        return;
                    }
                    return;
                }
                C7369d c7369d4 = c7369dArr[4];
                if (c7369d4.f29373f != null) {
                    C7435f c7435fM32974h5 = m32974h(c7369d4);
                    if (c7435fM32974h5 != null) {
                        m32971b(this.f29818k, c7435fM32974h5, 0);
                        m32971b(this.f29842h, this.f29818k, -this.f29836b.m32551p());
                        m32971b(this.f29843i, this.f29842h, this.f29839e.f29789g);
                        return;
                    }
                    return;
                }
                if ((c7370e2 instanceof InterfaceC7374i) || c7370e2.m32486K() == null || this.f29836b.mo32549o(C7369d.a.CENTER).f29373f != null) {
                    return;
                }
                m32971b(this.f29842h, this.f29836b.m32486K().f29434f.f29842h, this.f29836b.m32512Y());
                m32971b(this.f29843i, this.f29842h, this.f29839e.f29789g);
                if (this.f29836b.m32514Z()) {
                    m32971b(this.f29818k, this.f29842h, this.f29836b.m32551p());
                    return;
                }
                return;
            }
        }
        if (z7 || this.f29838d != C7370e.b.MATCH_CONSTRAINT) {
            c7436g.m32934b(this);
        } else {
            C7370e c7370e3 = this.f29836b;
            int i7 = c7370e3.f29470x;
            if (i7 == 2) {
                C7370e c7370eM32486K3 = c7370e3.m32486K();
                if (c7370eM32486K3 != null) {
                    C7436g c7436g2 = c7370eM32486K3.f29434f.f29839e;
                    this.f29839e.f29794l.add(c7436g2);
                    c7436g2.f29793k.add(this.f29839e);
                    C7436g c7436g3 = this.f29839e;
                    c7436g3.f29784b = true;
                    c7436g3.f29793k.add(this.f29842h);
                    this.f29839e.f29793k.add(this.f29843i);
                }
            } else if (i7 == 3 && !c7370e3.m32539k0()) {
                C7370e c7370e4 = this.f29836b;
                if (c7370e4.f29468w != 3) {
                    C7436g c7436g4 = c7370e4.f29432e.f29839e;
                    this.f29839e.f29794l.add(c7436g4);
                    c7436g4.f29793k.add(this.f29839e);
                    C7436g c7436g5 = this.f29839e;
                    c7436g5.f29784b = true;
                    c7436g5.f29793k.add(this.f29842h);
                    this.f29839e.f29793k.add(this.f29843i);
                }
            }
        }
        C7370e c7370e5 = this.f29836b;
        C7369d[] c7369dArr2 = c7370e5.f29420W;
        C7369d c7369d5 = c7369dArr2[2];
        C7369d c7369d6 = c7369d5.f29373f;
        if (c7369d6 != null && c7369dArr2[3].f29373f != null) {
            if (c7370e5.m32539k0()) {
                this.f29842h.f29788f = this.f29836b.f29420W[2].m32441f();
                this.f29843i.f29788f = -this.f29836b.f29420W[3].m32441f();
            } else {
                C7435f c7435fM32974h6 = m32974h(this.f29836b.f29420W[2]);
                C7435f c7435fM32974h7 = m32974h(this.f29836b.f29420W[3]);
                if (c7435fM32974h6 != null) {
                    c7435fM32974h6.m32934b(this);
                }
                if (c7435fM32974h7 != null) {
                    c7435fM32974h7.m32934b(this);
                }
                this.f29844j = AbstractC7445p.b.CENTER;
            }
            if (this.f29836b.m32514Z()) {
                m32972c(this.f29818k, this.f29842h, 1, this.f29819l);
            }
        } else if (c7369d6 != null) {
            C7435f c7435fM32974h8 = m32974h(c7369d5);
            if (c7435fM32974h8 != null) {
                m32971b(this.f29842h, c7435fM32974h8, this.f29836b.f29420W[2].m32441f());
                m32972c(this.f29843i, this.f29842h, 1, this.f29839e);
                if (this.f29836b.m32514Z()) {
                    m32972c(this.f29818k, this.f29842h, 1, this.f29819l);
                }
                C7370e.b bVar2 = this.f29838d;
                C7370e.b bVar3 = C7370e.b.MATCH_CONSTRAINT;
                if (bVar2 == bVar3 && this.f29836b.m32566v() > 0.0f) {
                    C7441l c7441l = this.f29836b.f29432e;
                    if (c7441l.f29838d == bVar3) {
                        c7441l.f29839e.f29793k.add(this.f29839e);
                        this.f29839e.f29794l.add(this.f29836b.f29432e.f29839e);
                        this.f29839e.f29783a = this;
                    }
                }
            }
        } else {
            C7369d c7369d7 = c7369dArr2[3];
            if (c7369d7.f29373f != null) {
                C7435f c7435fM32974h9 = m32974h(c7369d7);
                if (c7435fM32974h9 != null) {
                    m32971b(this.f29843i, c7435fM32974h9, -this.f29836b.f29420W[3].m32441f());
                    m32972c(this.f29842h, this.f29843i, -1, this.f29839e);
                    if (this.f29836b.m32514Z()) {
                        m32972c(this.f29818k, this.f29842h, 1, this.f29819l);
                    }
                }
            } else {
                C7369d c7369d8 = c7369dArr2[4];
                if (c7369d8.f29373f != null) {
                    C7435f c7435fM32974h10 = m32974h(c7369d8);
                    if (c7435fM32974h10 != null) {
                        m32971b(this.f29818k, c7435fM32974h10, 0);
                        m32972c(this.f29842h, this.f29818k, -1, this.f29819l);
                        m32972c(this.f29843i, this.f29842h, 1, this.f29839e);
                    }
                } else if (!(c7370e5 instanceof InterfaceC7374i) && c7370e5.m32486K() != null) {
                    m32971b(this.f29842h, this.f29836b.m32486K().f29434f.f29842h, this.f29836b.m32512Y());
                    m32972c(this.f29843i, this.f29842h, 1, this.f29839e);
                    if (this.f29836b.m32514Z()) {
                        m32972c(this.f29818k, this.f29842h, 1, this.f29819l);
                    }
                    C7370e.b bVar4 = this.f29838d;
                    C7370e.b bVar5 = C7370e.b.MATCH_CONSTRAINT;
                    if (bVar4 == bVar5 && this.f29836b.m32566v() > 0.0f) {
                        C7441l c7441l2 = this.f29836b.f29432e;
                        if (c7441l2.f29838d == bVar5) {
                            c7441l2.f29839e.f29793k.add(this.f29839e);
                            this.f29839e.f29794l.add(this.f29836b.f29432e.f29839e);
                            this.f29839e.f29783a = this;
                        }
                    }
                }
            }
        }
        if (this.f29839e.f29794l.size() == 0) {
            this.f29839e.f29785c = true;
        }
    }

    @Override // p393y.AbstractC7445p
    /* JADX INFO: renamed from: e */
    public void mo32916e() {
        C7435f c7435f = this.f29842h;
        if (c7435f.f29792j) {
            this.f29836b.m32550o1(c7435f.f29789g);
        }
    }

    @Override // p393y.AbstractC7445p
    /* JADX INFO: renamed from: f */
    void mo32917f() {
        this.f29837c = null;
        this.f29842h.m32935c();
        this.f29843i.m32935c();
        this.f29818k.m32935c();
        this.f29839e.m32935c();
        this.f29841g = false;
    }

    @Override // p393y.AbstractC7445p
    /* JADX INFO: renamed from: m */
    boolean mo32919m() {
        return this.f29838d != C7370e.b.MATCH_CONSTRAINT || this.f29836b.f29470x == 0;
    }

    /* JADX INFO: renamed from: q */
    void m32959q() {
        this.f29841g = false;
        this.f29842h.m32935c();
        this.f29842h.f29792j = false;
        this.f29843i.m32935c();
        this.f29843i.f29792j = false;
        this.f29818k.m32935c();
        this.f29818k.f29792j = false;
        this.f29839e.f29792j = false;
    }

    public String toString() {
        return "VerticalRun " + this.f29836b.m32562t();
    }
}
