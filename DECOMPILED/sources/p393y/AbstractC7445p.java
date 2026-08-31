package p393y;

import p385x.C7369d;
import p385x.C7370e;

/* JADX INFO: renamed from: y.p */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7445p implements InterfaceC7433d {

    /* JADX INFO: renamed from: a */
    public int f29835a;

    /* JADX INFO: renamed from: b */
    C7370e f29836b;

    /* JADX INFO: renamed from: c */
    C7442m f29837c;

    /* JADX INFO: renamed from: d */
    protected C7370e.b f29838d;

    /* JADX INFO: renamed from: e */
    C7436g f29839e = new C7436g(this);

    /* JADX INFO: renamed from: f */
    public int f29840f = 0;

    /* JADX INFO: renamed from: g */
    boolean f29841g = false;

    /* JADX INFO: renamed from: h */
    public C7435f f29842h = new C7435f(this);

    /* JADX INFO: renamed from: i */
    public C7435f f29843i = new C7435f(this);

    /* JADX INFO: renamed from: j */
    protected b f29844j = b.NONE;

    /* JADX INFO: renamed from: y.p$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f29845a;

        static {
            int[] iArr = new int[C7369d.a.values().length];
            f29845a = iArr;
            try {
                iArr[C7369d.a.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29845a[C7369d.a.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29845a[C7369d.a.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29845a[C7369d.a.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f29845a[C7369d.a.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: y.p$b */
    enum b {
        NONE,
        START,
        END,
        CENTER
    }

    public AbstractC7445p(C7370e c7370e) {
        this.f29836b = c7370e;
    }

    /* JADX INFO: renamed from: l */
    private void m32970l(int i7, int i8) {
        int i9 = this.f29835a;
        if (i9 == 0) {
            this.f29839e.mo32936d(m32973g(i8, i7));
            return;
        }
        if (i9 == 1) {
            this.f29839e.mo32936d(Math.min(m32973g(this.f29839e.f29804m, i7), i8));
            return;
        }
        if (i9 == 2) {
            C7370e c7370eM32486K = this.f29836b.m32486K();
            if (c7370eM32486K != null) {
                C7436g c7436g = (i7 == 0 ? c7370eM32486K.f29432e : c7370eM32486K.f29434f).f29839e;
                if (c7436g.f29792j) {
                    this.f29839e.mo32936d(m32973g((int) ((c7436g.f29789g * (i7 == 0 ? this.f29836b.f29390B : this.f29836b.f29396E)) + 0.5f), i7));
                    return;
                }
                return;
            }
            return;
        }
        if (i9 != 3) {
            return;
        }
        C7370e c7370e = this.f29836b;
        AbstractC7445p abstractC7445p = c7370e.f29432e;
        C7370e.b bVar = abstractC7445p.f29838d;
        C7370e.b bVar2 = C7370e.b.MATCH_CONSTRAINT;
        if (bVar == bVar2 && abstractC7445p.f29835a == 3) {
            C7443n c7443n = c7370e.f29434f;
            if (c7443n.f29838d == bVar2 && c7443n.f29835a == 3) {
                return;
            }
        }
        if (i7 == 0) {
            abstractC7445p = c7370e.f29434f;
        }
        if (abstractC7445p.f29839e.f29792j) {
            float fM32566v = c7370e.m32566v();
            this.f29839e.mo32936d(i7 == 1 ? (int) ((abstractC7445p.f29839e.f29789g / fM32566v) + 0.5f) : (int) ((fM32566v * abstractC7445p.f29839e.f29789g) + 0.5f));
        }
    }

    @Override // p393y.InterfaceC7433d
    /* JADX INFO: renamed from: a */
    public abstract void mo32914a(InterfaceC7433d interfaceC7433d);

    /* JADX INFO: renamed from: b */
    protected final void m32971b(C7435f c7435f, C7435f c7435f2, int i7) {
        c7435f.f29794l.add(c7435f2);
        c7435f.f29788f = i7;
        c7435f2.f29793k.add(c7435f);
    }

    /* JADX INFO: renamed from: c */
    protected final void m32972c(C7435f c7435f, C7435f c7435f2, int i7, C7436g c7436g) {
        c7435f.f29794l.add(c7435f2);
        c7435f.f29794l.add(this.f29839e);
        c7435f.f29790h = i7;
        c7435f.f29791i = c7436g;
        c7435f2.f29793k.add(c7435f);
        c7436g.f29793k.add(c7435f);
    }

    /* JADX INFO: renamed from: d */
    abstract void mo32915d();

    /* JADX INFO: renamed from: e */
    abstract void mo32916e();

    /* JADX INFO: renamed from: f */
    abstract void mo32917f();

    /* JADX INFO: renamed from: g */
    protected final int m32973g(int i7, int i8) {
        if (i8 == 0) {
            C7370e c7370e = this.f29836b;
            int i9 = c7370e.f29388A;
            int iMax = Math.max(c7370e.f29474z, i7);
            if (i9 > 0) {
                iMax = Math.min(i9, i7);
            }
            if (iMax != i7) {
                return iMax;
            }
        } else {
            C7370e c7370e2 = this.f29836b;
            int i10 = c7370e2.f29394D;
            int iMax2 = Math.max(c7370e2.f29392C, i7);
            if (i10 > 0) {
                iMax2 = Math.min(i10, i7);
            }
            if (iMax2 != i7) {
                return iMax2;
            }
        }
        return i7;
    }

    /* JADX INFO: renamed from: h */
    protected final C7435f m32974h(C7369d c7369d) {
        C7369d c7369d2 = c7369d.f29373f;
        if (c7369d2 == null) {
            return null;
        }
        C7370e c7370e = c7369d2.f29371d;
        int i7 = a.f29845a[c7369d2.f29372e.ordinal()];
        if (i7 == 1) {
            return c7370e.f29432e.f29842h;
        }
        if (i7 == 2) {
            return c7370e.f29432e.f29843i;
        }
        if (i7 == 3) {
            return c7370e.f29434f.f29842h;
        }
        if (i7 == 4) {
            return c7370e.f29434f.f29818k;
        }
        if (i7 != 5) {
            return null;
        }
        return c7370e.f29434f.f29843i;
    }

    /* JADX INFO: renamed from: i */
    protected final C7435f m32975i(C7369d c7369d, int i7) {
        C7369d c7369d2 = c7369d.f29373f;
        if (c7369d2 == null) {
            return null;
        }
        C7370e c7370e = c7369d2.f29371d;
        AbstractC7445p abstractC7445p = i7 == 0 ? c7370e.f29432e : c7370e.f29434f;
        int i8 = a.f29845a[c7369d2.f29372e.ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 != 3) {
                    if (i8 != 5) {
                        return null;
                    }
                }
            }
            return abstractC7445p.f29843i;
        }
        return abstractC7445p.f29842h;
    }

    /* JADX INFO: renamed from: j */
    public long mo32918j() {
        C7436g c7436g = this.f29839e;
        if (c7436g.f29792j) {
            return c7436g.f29789g;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: k */
    public boolean m32976k() {
        return this.f29841g;
    }

    /* JADX INFO: renamed from: m */
    abstract boolean mo32919m();

    /* JADX INFO: renamed from: n */
    protected void m32977n(InterfaceC7433d interfaceC7433d, C7369d c7369d, C7369d c7369d2, int i7) {
        C7435f c7435fM32974h = m32974h(c7369d);
        C7435f c7435fM32974h2 = m32974h(c7369d2);
        if (c7435fM32974h.f29792j && c7435fM32974h2.f29792j) {
            int iM32441f = c7435fM32974h.f29789g + c7369d.m32441f();
            int iM32441f2 = c7435fM32974h2.f29789g - c7369d2.m32441f();
            int i8 = iM32441f2 - iM32441f;
            if (!this.f29839e.f29792j && this.f29838d == C7370e.b.MATCH_CONSTRAINT) {
                m32970l(i7, i8);
            }
            C7436g c7436g = this.f29839e;
            if (c7436g.f29792j) {
                if (c7436g.f29789g == i8) {
                    this.f29842h.mo32936d(iM32441f);
                    this.f29843i.mo32936d(iM32441f2);
                    return;
                }
                float fM32571y = i7 == 0 ? this.f29836b.m32571y() : this.f29836b.m32498R();
                if (c7435fM32974h == c7435fM32974h2) {
                    iM32441f = c7435fM32974h.f29789g;
                    iM32441f2 = c7435fM32974h2.f29789g;
                    fM32571y = 0.5f;
                }
                this.f29842h.mo32936d((int) (iM32441f + 0.5f + (((iM32441f2 - iM32441f) - this.f29839e.f29789g) * fM32571y)));
                this.f29843i.mo32936d(this.f29842h.f29789g + this.f29839e.f29789g);
            }
        }
    }

    /* JADX INFO: renamed from: o */
    protected void m32978o(InterfaceC7433d interfaceC7433d) {
    }

    /* JADX INFO: renamed from: p */
    protected void m32979p(InterfaceC7433d interfaceC7433d) {
    }
}
