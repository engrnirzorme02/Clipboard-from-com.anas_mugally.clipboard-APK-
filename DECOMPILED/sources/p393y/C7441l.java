package p393y;

import p385x.C7369d;
import p385x.C7370e;
import p385x.InterfaceC7374i;

/* JADX INFO: renamed from: y.l */
/* JADX INFO: loaded from: classes.dex */
public class C7441l extends AbstractC7445p {

    /* JADX INFO: renamed from: k */
    private static int[] f29808k = new int[2];

    /* JADX INFO: renamed from: y.l$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f29809a;

        static {
            int[] iArr = new int[AbstractC7445p.b.values().length];
            f29809a = iArr;
            try {
                iArr[AbstractC7445p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29809a[AbstractC7445p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29809a[AbstractC7445p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C7441l(C7370e c7370e) {
        super(c7370e);
        this.f29842h.f29787e = C7435f.a.LEFT;
        this.f29843i.f29787e = C7435f.a.RIGHT;
        this.f29840f = 0;
    }

    /* JADX INFO: renamed from: q */
    private void m32953q(int[] iArr, int i7, int i8, int i9, int i10, float f7, int i11) {
        int i12 = i8 - i7;
        int i13 = i10 - i9;
        if (i11 != -1) {
            if (i11 == 0) {
                iArr[0] = (int) ((i13 * f7) + 0.5f);
                iArr[1] = i13;
                return;
            } else {
                if (i11 != 1) {
                    return;
                }
                iArr[0] = i12;
                iArr[1] = (int) ((i12 * f7) + 0.5f);
                return;
            }
        }
        int i14 = (int) ((i13 * f7) + 0.5f);
        int i15 = (int) ((i12 / f7) + 0.5f);
        if (i14 <= i12) {
            iArr[0] = i14;
            iArr[1] = i13;
        } else if (i15 <= i13) {
            iArr[0] = i12;
            iArr[1] = i15;
        }
    }

    /* JADX WARN: Code duplicated, block: B:122:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:124:0x02d9  */
    @Override // p393y.AbstractC7445p, p393y.InterfaceC7433d
    /* JADX INFO: renamed from: a */
    public void mo32914a(InterfaceC7433d interfaceC7433d) {
        int iM32973g;
        int i7;
        int iM32973g2;
        float f7;
        float fM32566v;
        float fM32566v2;
        int i8;
        int i9 = a.f29809a[this.f29844j.ordinal()];
        if (i9 == 1) {
            m32979p(interfaceC7433d);
        } else if (i9 == 2) {
            m32978o(interfaceC7433d);
        } else if (i9 == 3) {
            C7370e c7370e = this.f29836b;
            m32977n(interfaceC7433d, c7370e.f29412O, c7370e.f29414Q, 0);
            return;
        }
        if (!this.f29839e.f29792j && this.f29838d == C7370e.b.MATCH_CONSTRAINT) {
            C7370e c7370e2 = this.f29836b;
            int i10 = c7370e2.f29468w;
            if (i10 == 2) {
                C7370e c7370eM32486K = c7370e2.m32486K();
                if (c7370eM32486K != null) {
                    C7436g c7436g = c7370eM32486K.f29432e.f29839e;
                    if (c7436g.f29792j) {
                        this.f29839e.mo32936d((int) ((c7436g.f29789g * this.f29836b.f29390B) + 0.5f));
                    }
                }
            } else if (i10 == 3) {
                int i11 = c7370e2.f29470x;
                if (i11 == 0 || i11 == 3) {
                    C7443n c7443n = c7370e2.f29434f;
                    C7435f c7435f = c7443n.f29842h;
                    C7435f c7435f2 = c7443n.f29843i;
                    boolean z7 = c7370e2.f29412O.f29373f != null;
                    boolean z8 = c7370e2.f29413P.f29373f != null;
                    boolean z9 = c7370e2.f29414Q.f29373f != null;
                    boolean z10 = c7370e2.f29415R.f29373f != null;
                    int iM32568w = c7370e2.m32568w();
                    if (z7 && z8 && z9 && z10) {
                        float fM32566v3 = this.f29836b.m32566v();
                        if (c7435f.f29792j && c7435f2.f29792j) {
                            C7435f c7435f3 = this.f29842h;
                            if (c7435f3.f29785c && this.f29843i.f29785c) {
                                m32953q(f29808k, this.f29842h.f29788f + ((C7435f) c7435f3.f29794l.get(0)).f29789g, ((C7435f) this.f29843i.f29794l.get(0)).f29789g - this.f29843i.f29788f, c7435f.f29788f + c7435f.f29789g, c7435f2.f29789g - c7435f2.f29788f, fM32566v3, iM32568w);
                                this.f29839e.mo32936d(f29808k[0]);
                                this.f29836b.f29434f.f29839e.mo32936d(f29808k[1]);
                                return;
                            }
                            return;
                        }
                        C7435f c7435f4 = this.f29842h;
                        if (c7435f4.f29792j) {
                            C7435f c7435f5 = this.f29843i;
                            if (c7435f5.f29792j) {
                                if (!c7435f.f29785c || !c7435f2.f29785c) {
                                    return;
                                }
                                m32953q(f29808k, c7435f4.f29789g + c7435f4.f29788f, c7435f5.f29789g - c7435f5.f29788f, c7435f.f29788f + ((C7435f) c7435f.f29794l.get(0)).f29789g, ((C7435f) c7435f2.f29794l.get(0)).f29789g - c7435f2.f29788f, fM32566v3, iM32568w);
                                this.f29839e.mo32936d(f29808k[0]);
                                this.f29836b.f29434f.f29839e.mo32936d(f29808k[1]);
                            }
                        }
                        C7435f c7435f6 = this.f29842h;
                        if (!c7435f6.f29785c || !this.f29843i.f29785c || !c7435f.f29785c || !c7435f2.f29785c) {
                            return;
                        }
                        m32953q(f29808k, this.f29842h.f29788f + ((C7435f) c7435f6.f29794l.get(0)).f29789g, ((C7435f) this.f29843i.f29794l.get(0)).f29789g - this.f29843i.f29788f, c7435f.f29788f + ((C7435f) c7435f.f29794l.get(0)).f29789g, ((C7435f) c7435f2.f29794l.get(0)).f29789g - c7435f2.f29788f, fM32566v3, iM32568w);
                        this.f29839e.mo32936d(f29808k[0]);
                        this.f29836b.f29434f.f29839e.mo32936d(f29808k[1]);
                    } else if (z7 && z9) {
                        if (!this.f29842h.f29785c || !this.f29843i.f29785c) {
                            return;
                        }
                        float fM32566v4 = this.f29836b.m32566v();
                        int i12 = ((C7435f) this.f29842h.f29794l.get(0)).f29789g + this.f29842h.f29788f;
                        int i13 = ((C7435f) this.f29843i.f29794l.get(0)).f29789g - this.f29843i.f29788f;
                        if (iM32568w == -1 || iM32568w == 0) {
                            int iM32973g3 = m32973g(i13 - i12, 0);
                            int i14 = (int) ((iM32973g3 * fM32566v4) + 0.5f);
                            int iM32973g4 = m32973g(i14, 1);
                            if (i14 != iM32973g4) {
                                iM32973g3 = (int) ((iM32973g4 / fM32566v4) + 0.5f);
                            }
                            this.f29839e.mo32936d(iM32973g3);
                            this.f29836b.f29434f.f29839e.mo32936d(iM32973g4);
                        } else if (iM32568w == 1) {
                            int iM32973g5 = m32973g(i13 - i12, 0);
                            int i15 = (int) ((iM32973g5 / fM32566v4) + 0.5f);
                            int iM32973g6 = m32973g(i15, 1);
                            if (i15 != iM32973g6) {
                                iM32973g5 = (int) ((iM32973g6 * fM32566v4) + 0.5f);
                            }
                            this.f29839e.mo32936d(iM32973g5);
                            this.f29836b.f29434f.f29839e.mo32936d(iM32973g6);
                        }
                    } else if (z8 && z10) {
                        if (!c7435f.f29785c || !c7435f2.f29785c) {
                            return;
                        }
                        float fM32566v5 = this.f29836b.m32566v();
                        int i16 = ((C7435f) c7435f.f29794l.get(0)).f29789g + c7435f.f29788f;
                        int i17 = ((C7435f) c7435f2.f29794l.get(0)).f29789g - c7435f2.f29788f;
                        if (iM32568w == -1) {
                            iM32973g = m32973g(i17 - i16, 1);
                            i7 = (int) ((iM32973g / fM32566v5) + 0.5f);
                            iM32973g2 = m32973g(i7, 0);
                            if (i7 != iM32973g2) {
                                iM32973g = (int) ((iM32973g2 * fM32566v5) + 0.5f);
                            }
                            this.f29839e.mo32936d(iM32973g2);
                            this.f29836b.f29434f.f29839e.mo32936d(iM32973g);
                        } else if (iM32568w == 0) {
                            int iM32973g7 = m32973g(i17 - i16, 1);
                            int i18 = (int) ((iM32973g7 * fM32566v5) + 0.5f);
                            int iM32973g8 = m32973g(i18, 0);
                            if (i18 != iM32973g8) {
                                iM32973g7 = (int) ((iM32973g8 / fM32566v5) + 0.5f);
                            }
                            this.f29839e.mo32936d(iM32973g8);
                            this.f29836b.f29434f.f29839e.mo32936d(iM32973g7);
                        } else if (iM32568w == 1) {
                            iM32973g = m32973g(i17 - i16, 1);
                            i7 = (int) ((iM32973g / fM32566v5) + 0.5f);
                            iM32973g2 = m32973g(i7, 0);
                            if (i7 != iM32973g2) {
                                iM32973g = (int) ((iM32973g2 * fM32566v5) + 0.5f);
                            }
                            this.f29839e.mo32936d(iM32973g2);
                            this.f29836b.f29434f.f29839e.mo32936d(iM32973g);
                        }
                    }
                } else {
                    int iM32568w2 = c7370e2.m32568w();
                    if (iM32568w2 != -1) {
                        if (iM32568w2 == 0) {
                            C7370e c7370e3 = this.f29836b;
                            fM32566v2 = c7370e3.f29434f.f29839e.f29789g / c7370e3.m32566v();
                            i8 = (int) (fM32566v2 + 0.5f);
                        } else if (iM32568w2 != 1) {
                            i8 = 0;
                        } else {
                            C7370e c7370e4 = this.f29836b;
                            f7 = c7370e4.f29434f.f29839e.f29789g;
                            fM32566v = c7370e4.m32566v();
                        }
                        this.f29839e.mo32936d(i8);
                    } else {
                        C7370e c7370e5 = this.f29836b;
                        f7 = c7370e5.f29434f.f29839e.f29789g;
                        fM32566v = c7370e5.m32566v();
                    }
                    fM32566v2 = f7 * fM32566v;
                    i8 = (int) (fM32566v2 + 0.5f);
                    this.f29839e.mo32936d(i8);
                }
            }
        }
        C7435f c7435f7 = this.f29842h;
        if (c7435f7.f29785c) {
            C7435f c7435f8 = this.f29843i;
            if (c7435f8.f29785c) {
                if (c7435f7.f29792j && c7435f8.f29792j && this.f29839e.f29792j) {
                    return;
                }
                if (!this.f29839e.f29792j && this.f29838d == C7370e.b.MATCH_CONSTRAINT) {
                    C7370e c7370e6 = this.f29836b;
                    if (c7370e6.f29468w == 0 && !c7370e6.m32533i0()) {
                        C7435f c7435f9 = (C7435f) this.f29842h.f29794l.get(0);
                        C7435f c7435f10 = (C7435f) this.f29843i.f29794l.get(0);
                        int i19 = c7435f9.f29789g;
                        C7435f c7435f11 = this.f29842h;
                        int i20 = i19 + c7435f11.f29788f;
                        int i21 = c7435f10.f29789g + this.f29843i.f29788f;
                        c7435f11.mo32936d(i20);
                        this.f29843i.mo32936d(i21);
                        this.f29839e.mo32936d(i21 - i20);
                        return;
                    }
                }
                if (!this.f29839e.f29792j && this.f29838d == C7370e.b.MATCH_CONSTRAINT && this.f29835a == 1 && this.f29842h.f29794l.size() > 0 && this.f29843i.f29794l.size() > 0) {
                    int iMin = Math.min((((C7435f) this.f29843i.f29794l.get(0)).f29789g + this.f29843i.f29788f) - (((C7435f) this.f29842h.f29794l.get(0)).f29789g + this.f29842h.f29788f), this.f29839e.f29804m);
                    C7370e c7370e7 = this.f29836b;
                    int i22 = c7370e7.f29388A;
                    int iMax = Math.max(c7370e7.f29474z, iMin);
                    if (i22 > 0) {
                        iMax = Math.min(i22, iMax);
                    }
                    this.f29839e.mo32936d(iMax);
                }
                if (this.f29839e.f29792j) {
                    C7435f c7435f12 = (C7435f) this.f29842h.f29794l.get(0);
                    C7435f c7435f13 = (C7435f) this.f29843i.f29794l.get(0);
                    int i23 = c7435f12.f29789g + this.f29842h.f29788f;
                    int i24 = c7435f13.f29789g + this.f29843i.f29788f;
                    float fM32571y = this.f29836b.m32571y();
                    if (c7435f12 == c7435f13) {
                        i23 = c7435f12.f29789g;
                        i24 = c7435f13.f29789g;
                        fM32571y = 0.5f;
                    }
                    this.f29842h.mo32936d((int) (i23 + 0.5f + (((i24 - i23) - this.f29839e.f29789g) * fM32571y)));
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
            this.f29839e.mo32936d(c7370e.m32508W());
        }
        if (this.f29839e.f29792j) {
            C7370e.b bVar = this.f29838d;
            C7370e.b bVar2 = C7370e.b.MATCH_PARENT;
            if (bVar == bVar2 && (c7370eM32486K = this.f29836b.m32486K()) != null && (c7370eM32486K.m32467A() == C7370e.b.FIXED || c7370eM32486K.m32467A() == bVar2)) {
                m32971b(this.f29842h, c7370eM32486K.f29432e.f29842h, this.f29836b.f29412O.m32441f());
                m32971b(this.f29843i, c7370eM32486K.f29432e.f29843i, -this.f29836b.f29414Q.m32441f());
                return;
            }
        } else {
            C7370e.b bVarM32467A = this.f29836b.m32467A();
            this.f29838d = bVarM32467A;
            if (bVarM32467A != C7370e.b.MATCH_CONSTRAINT) {
                C7370e.b bVar3 = C7370e.b.MATCH_PARENT;
                if (bVarM32467A == bVar3 && (c7370eM32486K2 = this.f29836b.m32486K()) != null && (c7370eM32486K2.m32467A() == C7370e.b.FIXED || c7370eM32486K2.m32467A() == bVar3)) {
                    int iM32508W = (c7370eM32486K2.m32508W() - this.f29836b.f29412O.m32441f()) - this.f29836b.f29414Q.m32441f();
                    m32971b(this.f29842h, c7370eM32486K2.f29432e.f29842h, this.f29836b.f29412O.m32441f());
                    m32971b(this.f29843i, c7370eM32486K2.f29432e.f29843i, -this.f29836b.f29414Q.m32441f());
                    this.f29839e.mo32936d(iM32508W);
                    return;
                }
                if (this.f29838d == C7370e.b.FIXED) {
                    this.f29839e.mo32936d(this.f29836b.m32508W());
                }
            }
        }
        C7436g c7436g = this.f29839e;
        if (c7436g.f29792j) {
            C7370e c7370e2 = this.f29836b;
            if (c7370e2.f29424a) {
                C7369d[] c7369dArr = c7370e2.f29420W;
                C7369d c7369d = c7369dArr[0];
                C7369d c7369d2 = c7369d.f29373f;
                if (c7369d2 != null && c7369dArr[1].f29373f != null) {
                    if (c7370e2.m32533i0()) {
                        this.f29842h.f29788f = this.f29836b.f29420W[0].m32441f();
                        this.f29843i.f29788f = -this.f29836b.f29420W[1].m32441f();
                        return;
                    }
                    C7435f c7435fM32974h = m32974h(this.f29836b.f29420W[0]);
                    if (c7435fM32974h != null) {
                        m32971b(this.f29842h, c7435fM32974h, this.f29836b.f29420W[0].m32441f());
                    }
                    C7435f c7435fM32974h2 = m32974h(this.f29836b.f29420W[1]);
                    if (c7435fM32974h2 != null) {
                        m32971b(this.f29843i, c7435fM32974h2, -this.f29836b.f29420W[1].m32441f());
                    }
                    this.f29842h.f29784b = true;
                    this.f29843i.f29784b = true;
                    return;
                }
                if (c7369d2 != null) {
                    C7435f c7435fM32974h3 = m32974h(c7369d);
                    if (c7435fM32974h3 != null) {
                        m32971b(this.f29842h, c7435fM32974h3, this.f29836b.f29420W[0].m32441f());
                        m32971b(this.f29843i, this.f29842h, this.f29839e.f29789g);
                        return;
                    }
                    return;
                }
                C7369d c7369d3 = c7369dArr[1];
                if (c7369d3.f29373f != null) {
                    C7435f c7435fM32974h4 = m32974h(c7369d3);
                    if (c7435fM32974h4 != null) {
                        m32971b(this.f29843i, c7435fM32974h4, -this.f29836b.f29420W[1].m32441f());
                        m32971b(this.f29842h, this.f29843i, -this.f29839e.f29789g);
                        return;
                    }
                    return;
                }
                if ((c7370e2 instanceof InterfaceC7374i) || c7370e2.m32486K() == null || this.f29836b.mo32549o(C7369d.a.CENTER).f29373f != null) {
                    return;
                }
                m32971b(this.f29842h, this.f29836b.m32486K().f29432e.f29842h, this.f29836b.m32510X());
                m32971b(this.f29843i, this.f29842h, this.f29839e.f29789g);
                return;
            }
        }
        if (this.f29838d == C7370e.b.MATCH_CONSTRAINT) {
            C7370e c7370e3 = this.f29836b;
            int i7 = c7370e3.f29468w;
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
            } else if (i7 == 3) {
                if (c7370e3.f29470x == 3) {
                    this.f29842h.f29783a = this;
                    this.f29843i.f29783a = this;
                    C7443n c7443n = c7370e3.f29434f;
                    c7443n.f29842h.f29783a = this;
                    c7443n.f29843i.f29783a = this;
                    c7436g.f29783a = this;
                    if (c7370e3.m32539k0()) {
                        this.f29839e.f29794l.add(this.f29836b.f29434f.f29839e);
                        this.f29836b.f29434f.f29839e.f29793k.add(this.f29839e);
                        C7443n c7443n2 = this.f29836b.f29434f;
                        c7443n2.f29839e.f29783a = this;
                        this.f29839e.f29794l.add(c7443n2.f29842h);
                        this.f29839e.f29794l.add(this.f29836b.f29434f.f29843i);
                        this.f29836b.f29434f.f29842h.f29793k.add(this.f29839e);
                        this.f29836b.f29434f.f29843i.f29793k.add(this.f29839e);
                    } else if (this.f29836b.m32533i0()) {
                        this.f29836b.f29434f.f29839e.f29794l.add(this.f29839e);
                        this.f29839e.f29793k.add(this.f29836b.f29434f.f29839e);
                    } else {
                        this.f29836b.f29434f.f29839e.f29794l.add(this.f29839e);
                    }
                } else {
                    C7436g c7436g4 = c7370e3.f29434f.f29839e;
                    c7436g.f29794l.add(c7436g4);
                    c7436g4.f29793k.add(this.f29839e);
                    this.f29836b.f29434f.f29842h.f29793k.add(this.f29839e);
                    this.f29836b.f29434f.f29843i.f29793k.add(this.f29839e);
                    C7436g c7436g5 = this.f29839e;
                    c7436g5.f29784b = true;
                    c7436g5.f29793k.add(this.f29842h);
                    this.f29839e.f29793k.add(this.f29843i);
                    this.f29842h.f29794l.add(this.f29839e);
                    this.f29843i.f29794l.add(this.f29839e);
                }
            }
        }
        C7370e c7370e4 = this.f29836b;
        C7369d[] c7369dArr2 = c7370e4.f29420W;
        C7369d c7369d4 = c7369dArr2[0];
        C7369d c7369d5 = c7369d4.f29373f;
        if (c7369d5 != null && c7369dArr2[1].f29373f != null) {
            if (c7370e4.m32533i0()) {
                this.f29842h.f29788f = this.f29836b.f29420W[0].m32441f();
                this.f29843i.f29788f = -this.f29836b.f29420W[1].m32441f();
                return;
            }
            C7435f c7435fM32974h5 = m32974h(this.f29836b.f29420W[0]);
            C7435f c7435fM32974h6 = m32974h(this.f29836b.f29420W[1]);
            if (c7435fM32974h5 != null) {
                c7435fM32974h5.m32934b(this);
            }
            if (c7435fM32974h6 != null) {
                c7435fM32974h6.m32934b(this);
            }
            this.f29844j = AbstractC7445p.b.CENTER;
            return;
        }
        if (c7369d5 != null) {
            C7435f c7435fM32974h7 = m32974h(c7369d4);
            if (c7435fM32974h7 != null) {
                m32971b(this.f29842h, c7435fM32974h7, this.f29836b.f29420W[0].m32441f());
                m32972c(this.f29843i, this.f29842h, 1, this.f29839e);
                return;
            }
            return;
        }
        C7369d c7369d6 = c7369dArr2[1];
        if (c7369d6.f29373f != null) {
            C7435f c7435fM32974h8 = m32974h(c7369d6);
            if (c7435fM32974h8 != null) {
                m32971b(this.f29843i, c7435fM32974h8, -this.f29836b.f29420W[1].m32441f());
                m32972c(this.f29842h, this.f29843i, -1, this.f29839e);
                return;
            }
            return;
        }
        if ((c7370e4 instanceof InterfaceC7374i) || c7370e4.m32486K() == null) {
            return;
        }
        m32971b(this.f29842h, this.f29836b.m32486K().f29432e.f29842h, this.f29836b.m32510X());
        m32972c(this.f29843i, this.f29842h, 1, this.f29839e);
    }

    @Override // p393y.AbstractC7445p
    /* JADX INFO: renamed from: e */
    public void mo32916e() {
        C7435f c7435f = this.f29842h;
        if (c7435f.f29792j) {
            this.f29836b.m32548n1(c7435f.f29789g);
        }
    }

    @Override // p393y.AbstractC7445p
    /* JADX INFO: renamed from: f */
    void mo32917f() {
        this.f29837c = null;
        this.f29842h.m32935c();
        this.f29843i.m32935c();
        this.f29839e.m32935c();
        this.f29841g = false;
    }

    @Override // p393y.AbstractC7445p
    /* JADX INFO: renamed from: m */
    boolean mo32919m() {
        return this.f29838d != C7370e.b.MATCH_CONSTRAINT || this.f29836b.f29468w == 0;
    }

    /* JADX INFO: renamed from: r */
    void m32954r() {
        this.f29841g = false;
        this.f29842h.m32935c();
        this.f29842h.f29792j = false;
        this.f29843i.m32935c();
        this.f29843i.f29792j = false;
        this.f29839e.f29792j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.f29836b.m32562t();
    }
}
