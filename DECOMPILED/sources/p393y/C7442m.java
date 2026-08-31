package p393y;

import java.util.ArrayList;
import p385x.C7371f;

/* JADX INFO: renamed from: y.m */
/* JADX INFO: loaded from: classes.dex */
class C7442m {

    /* JADX INFO: renamed from: h */
    public static int f29810h;

    /* JADX INFO: renamed from: c */
    AbstractC7445p f29813c;

    /* JADX INFO: renamed from: d */
    AbstractC7445p f29814d;

    /* JADX INFO: renamed from: f */
    int f29816f;

    /* JADX INFO: renamed from: g */
    int f29817g;

    /* JADX INFO: renamed from: a */
    public int f29811a = 0;

    /* JADX INFO: renamed from: b */
    public boolean f29812b = false;

    /* JADX INFO: renamed from: e */
    ArrayList f29815e = new ArrayList();

    C7442m(AbstractC7445p abstractC7445p, int i7) {
        this.f29813c = null;
        this.f29814d = null;
        int i8 = f29810h;
        this.f29816f = i8;
        f29810h = i8 + 1;
        this.f29813c = abstractC7445p;
        this.f29814d = abstractC7445p;
        this.f29817g = i7;
    }

    /* JADX INFO: renamed from: c */
    private long m32955c(C7435f c7435f, long j7) {
        AbstractC7445p abstractC7445p = c7435f.f29786d;
        if (abstractC7445p instanceof C7440k) {
            return j7;
        }
        int size = c7435f.f29793k.size();
        long jMin = j7;
        for (int i7 = 0; i7 < size; i7++) {
            InterfaceC7433d interfaceC7433d = (InterfaceC7433d) c7435f.f29793k.get(i7);
            if (interfaceC7433d instanceof C7435f) {
                C7435f c7435f2 = (C7435f) interfaceC7433d;
                if (c7435f2.f29786d != abstractC7445p) {
                    jMin = Math.min(jMin, m32955c(c7435f2, ((long) c7435f2.f29788f) + j7));
                }
            }
        }
        if (c7435f != abstractC7445p.f29843i) {
            return jMin;
        }
        long jMo32918j = j7 - abstractC7445p.mo32918j();
        return Math.min(Math.min(jMin, m32955c(abstractC7445p.f29842h, jMo32918j)), jMo32918j - ((long) abstractC7445p.f29842h.f29788f));
    }

    /* JADX INFO: renamed from: d */
    private long m32956d(C7435f c7435f, long j7) {
        AbstractC7445p abstractC7445p = c7435f.f29786d;
        if (abstractC7445p instanceof C7440k) {
            return j7;
        }
        int size = c7435f.f29793k.size();
        long jMax = j7;
        for (int i7 = 0; i7 < size; i7++) {
            InterfaceC7433d interfaceC7433d = (InterfaceC7433d) c7435f.f29793k.get(i7);
            if (interfaceC7433d instanceof C7435f) {
                C7435f c7435f2 = (C7435f) interfaceC7433d;
                if (c7435f2.f29786d != abstractC7445p) {
                    jMax = Math.max(jMax, m32956d(c7435f2, ((long) c7435f2.f29788f) + j7));
                }
            }
        }
        if (c7435f != abstractC7445p.f29842h) {
            return jMax;
        }
        long jMo32918j = j7 + abstractC7445p.mo32918j();
        return Math.max(Math.max(jMax, m32956d(abstractC7445p.f29843i, jMo32918j)), jMo32918j - ((long) abstractC7445p.f29843i.f29788f));
    }

    /* JADX INFO: renamed from: a */
    public void m32957a(AbstractC7445p abstractC7445p) {
        this.f29815e.add(abstractC7445p);
        this.f29814d = abstractC7445p;
    }

    /* JADX INFO: renamed from: b */
    public long m32958b(C7371f c7371f, int i7) {
        long jMo32918j;
        int i8;
        AbstractC7445p abstractC7445p = this.f29813c;
        if (abstractC7445p instanceof C7432c) {
            if (((C7432c) abstractC7445p).f29840f != i7) {
                return 0L;
            }
        } else if (i7 == 0) {
            if (!(abstractC7445p instanceof C7441l)) {
                return 0L;
            }
        } else if (!(abstractC7445p instanceof C7443n)) {
            return 0L;
        }
        C7435f c7435f = (i7 == 0 ? c7371f.f29432e : c7371f.f29434f).f29842h;
        C7435f c7435f2 = (i7 == 0 ? c7371f.f29432e : c7371f.f29434f).f29843i;
        boolean zContains = abstractC7445p.f29842h.f29794l.contains(c7435f);
        boolean zContains2 = this.f29813c.f29843i.f29794l.contains(c7435f2);
        long jMo32918j2 = this.f29813c.mo32918j();
        if (zContains && zContains2) {
            long jM32956d = m32956d(this.f29813c.f29842h, 0L);
            long jM32955c = m32955c(this.f29813c.f29843i, 0L);
            long j7 = jM32956d - jMo32918j2;
            AbstractC7445p abstractC7445p2 = this.f29813c;
            int i9 = abstractC7445p2.f29843i.f29788f;
            if (j7 >= (-i9)) {
                j7 += (long) i9;
            }
            int i10 = abstractC7445p2.f29842h.f29788f;
            long j8 = ((-jM32955c) - jMo32918j2) - ((long) i10);
            if (j8 >= i10) {
                j8 -= (long) i10;
            }
            float fM32554q = abstractC7445p2.f29836b.m32554q(i7);
            float f7 = fM32554q > 0.0f ? (long) ((j8 / fM32554q) + (j7 / (1.0f - fM32554q))) : 0L;
            long j9 = ((long) ((f7 * fM32554q) + 0.5f)) + jMo32918j2 + ((long) ((f7 * (1.0f - fM32554q)) + 0.5f));
            AbstractC7445p abstractC7445p3 = this.f29813c;
            jMo32918j = ((long) abstractC7445p3.f29842h.f29788f) + j9;
            i8 = abstractC7445p3.f29843i.f29788f;
        } else {
            if (zContains) {
                C7435f c7435f3 = this.f29813c.f29842h;
                return Math.max(m32956d(c7435f3, c7435f3.f29788f), ((long) this.f29813c.f29842h.f29788f) + jMo32918j2);
            }
            if (zContains2) {
                C7435f c7435f4 = this.f29813c.f29843i;
                return Math.max(-m32955c(c7435f4, c7435f4.f29788f), ((long) (-this.f29813c.f29843i.f29788f)) + jMo32918j2);
            }
            AbstractC7445p abstractC7445p4 = this.f29813c;
            jMo32918j = ((long) abstractC7445p4.f29842h.f29788f) + abstractC7445p4.mo32918j();
            i8 = this.f29813c.f29843i.f29788f;
        }
        return jMo32918j - ((long) i8);
    }
}
