package com.google.android.material.carousel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p333q3.AbstractC6826a;

/* JADX INFO: renamed from: com.google.android.material.carousel.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C4451e {

    /* JADX INFO: renamed from: a */
    private final float f16700a;

    /* JADX INFO: renamed from: b */
    private int f16701b;

    /* JADX INFO: renamed from: c */
    private final List f16702c;

    /* JADX INFO: renamed from: d */
    private final int f16703d;

    /* JADX INFO: renamed from: e */
    private final int f16704e;

    /* JADX INFO: renamed from: f */
    private final int f16705f;

    /* JADX INFO: renamed from: com.google.android.material.carousel.e$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        private final float f16706a;

        /* JADX INFO: renamed from: b */
        private final int f16707b;

        /* JADX INFO: renamed from: d */
        private c f16709d;

        /* JADX INFO: renamed from: e */
        private c f16710e;

        /* JADX INFO: renamed from: c */
        private final List f16708c = new ArrayList();

        /* JADX INFO: renamed from: f */
        private int f16711f = -1;

        /* JADX INFO: renamed from: g */
        private int f16712g = -1;

        /* JADX INFO: renamed from: h */
        private float f16713h = 0.0f;

        /* JADX INFO: renamed from: i */
        private int f16714i = -1;

        public b(float f7, int i7) {
            this.f16706a = f7;
            this.f16707b = i7;
        }

        /* JADX INFO: renamed from: j */
        private static float m19994j(float f7, float f8, int i7, int i8) {
            return (f7 - (i7 * f8)) + (i8 * f8);
        }

        /* JADX INFO: renamed from: a */
        public b m19995a(float f7, float f8, float f9) {
            return m19998d(f7, f8, f9, false, true);
        }

        /* JADX INFO: renamed from: b */
        public b m19996b(float f7, float f8, float f9) {
            return m19997c(f7, f8, f9, false);
        }

        /* JADX INFO: renamed from: c */
        public b m19997c(float f7, float f8, float f9, boolean z7) {
            return m19998d(f7, f8, f9, z7, false);
        }

        /* JADX INFO: renamed from: d */
        public b m19998d(float f7, float f8, float f9, boolean z7, boolean z8) {
            float fAbs;
            float f10 = f9 / 2.0f;
            float f11 = f7 - f10;
            float f12 = f10 + f7;
            int i7 = this.f16707b;
            if (f12 > i7) {
                fAbs = Math.abs(f12 - Math.max(f12 - f9, i7));
            } else {
                fAbs = 0.0f;
                if (f11 < 0.0f) {
                    fAbs = Math.abs(f11 - Math.min(f11 + f9, 0.0f));
                }
            }
            return m19999e(f7, f8, f9, z7, z8, fAbs);
        }

        /* JADX INFO: renamed from: e */
        public b m19999e(float f7, float f8, float f9, boolean z7, boolean z8, float f10) {
            return m20000f(f7, f8, f9, z7, z8, f10, 0.0f, 0.0f);
        }

        /* JADX INFO: renamed from: f */
        public b m20000f(float f7, float f8, float f9, boolean z7, boolean z8, float f10, float f11, float f12) {
            if (f9 <= 0.0f) {
                return this;
            }
            if (z8) {
                if (z7) {
                    throw new IllegalArgumentException("Anchor keylines cannot be focal.");
                }
                int i7 = this.f16714i;
                if (i7 != -1 && i7 != 0) {
                    throw new IllegalArgumentException("Anchor keylines must be either the first or last keyline.");
                }
                this.f16714i = this.f16708c.size();
            }
            c cVar = new c(Float.MIN_VALUE, f7, f8, f9, z8, f10, f11, f12);
            if (z7) {
                if (this.f16709d == null) {
                    this.f16709d = cVar;
                    this.f16711f = this.f16708c.size();
                }
                if (this.f16712g != -1 && this.f16708c.size() - this.f16712g > 1) {
                    throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                }
                if (f9 != this.f16709d.f16718d) {
                    throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
                }
                this.f16710e = cVar;
                this.f16712g = this.f16708c.size();
            } else {
                if (this.f16709d == null && cVar.f16718d < this.f16713h) {
                    throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
                }
                if (this.f16710e != null && cVar.f16718d > this.f16713h) {
                    throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
                }
            }
            this.f16713h = cVar.f16718d;
            this.f16708c.add(cVar);
            return this;
        }

        /* JADX INFO: renamed from: g */
        public b m20001g(float f7, float f8, float f9, int i7) {
            return m20002h(f7, f8, f9, i7, false);
        }

        /* JADX INFO: renamed from: h */
        public b m20002h(float f7, float f8, float f9, int i7, boolean z7) {
            if (i7 > 0 && f9 > 0.0f) {
                for (int i8 = 0; i8 < i7; i8++) {
                    m19997c((i8 * f9) + f7, f8, f9, z7);
                }
            }
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C4451e m20003i() {
            if (this.f16709d == null) {
                throw new IllegalStateException("There must be a keyline marked as focal.");
            }
            ArrayList arrayList = new ArrayList();
            for (int i7 = 0; i7 < this.f16708c.size(); i7++) {
                c cVar = (c) this.f16708c.get(i7);
                arrayList.add(new c(m19994j(this.f16709d.f16716b, this.f16706a, this.f16711f, i7), cVar.f16716b, cVar.f16717c, cVar.f16718d, cVar.f16719e, cVar.f16720f, cVar.f16721g, cVar.f16722h));
            }
            return new C4451e(this.f16706a, arrayList, this.f16711f, this.f16712g, this.f16707b);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.carousel.e$c */
    static final class c {

        /* JADX INFO: renamed from: a */
        final float f16715a;

        /* JADX INFO: renamed from: b */
        final float f16716b;

        /* JADX INFO: renamed from: c */
        final float f16717c;

        /* JADX INFO: renamed from: d */
        final float f16718d;

        /* JADX INFO: renamed from: e */
        final boolean f16719e;

        /* JADX INFO: renamed from: f */
        final float f16720f;

        /* JADX INFO: renamed from: g */
        final float f16721g;

        /* JADX INFO: renamed from: h */
        final float f16722h;

        c(float f7, float f8, float f9, float f10) {
            this(f7, f8, f9, f10, false, 0.0f, 0.0f, 0.0f);
        }

        /* JADX INFO: renamed from: a */
        static c m20004a(c cVar, c cVar2, float f7) {
            return new c(AbstractC6826a.m29843a(cVar.f16715a, cVar2.f16715a, f7), AbstractC6826a.m29843a(cVar.f16716b, cVar2.f16716b, f7), AbstractC6826a.m29843a(cVar.f16717c, cVar2.f16717c, f7), AbstractC6826a.m29843a(cVar.f16718d, cVar2.f16718d, f7));
        }

        c(float f7, float f8, float f9, float f10, boolean z7, float f11, float f12, float f13) {
            this.f16715a = f7;
            this.f16716b = f8;
            this.f16717c = f9;
            this.f16718d = f10;
            this.f16719e = z7;
            this.f16720f = f11;
            this.f16721g = f12;
            this.f16722h = f13;
        }
    }

    /* JADX INFO: renamed from: o */
    static C4451e m19978o(C4451e c4451e, C4451e c4451e2, float f7) {
        if (c4451e.m19986g() != c4451e2.m19986g()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
        }
        List listM19987h = c4451e.m19987h();
        List listM19987h2 = c4451e2.m19987h();
        if (listM19987h.size() != listM19987h2.size()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
        }
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < c4451e.m19987h().size(); i7++) {
            arrayList.add(c.m20004a((c) listM19987h.get(i7), (c) listM19987h2.get(i7), f7));
        }
        return new C4451e(c4451e.m19986g(), arrayList, AbstractC6826a.m29845c(c4451e.m19982c(), c4451e2.m19982c(), f7), AbstractC6826a.m29845c(c4451e.m19989j(), c4451e2.m19989j(), f7), c4451e.f16705f);
    }

    /* JADX INFO: renamed from: p */
    static C4451e m19979p(C4451e c4451e, int i7) {
        b bVar = new b(c4451e.m19986g(), i7);
        float f7 = (i7 - c4451e.m19990k().f16716b) - (c4451e.m19990k().f16718d / 2.0f);
        int size = c4451e.m19987h().size() - 1;
        while (size >= 0) {
            c cVar = (c) c4451e.m19987h().get(size);
            bVar.m19998d((cVar.f16718d / 2.0f) + f7, cVar.f16717c, cVar.f16718d, size >= c4451e.m19982c() && size <= c4451e.m19989j(), cVar.f16719e);
            f7 += cVar.f16718d;
            size--;
        }
        return bVar.m20003i();
    }

    /* JADX INFO: renamed from: a */
    int m19980a() {
        return this.f16705f;
    }

    /* JADX INFO: renamed from: b */
    c m19981b() {
        return (c) this.f16702c.get(this.f16703d);
    }

    /* JADX INFO: renamed from: c */
    int m19982c() {
        return this.f16703d;
    }

    /* JADX INFO: renamed from: d */
    c m19983d() {
        return (c) this.f16702c.get(0);
    }

    /* JADX INFO: renamed from: e */
    c m19984e() {
        for (int i7 = 0; i7 < this.f16702c.size(); i7++) {
            c cVar = (c) this.f16702c.get(i7);
            if (!cVar.f16719e) {
                return cVar;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    List m19985f() {
        return this.f16702c.subList(this.f16703d, this.f16704e + 1);
    }

    /* JADX INFO: renamed from: g */
    float m19986g() {
        return this.f16700a;
    }

    /* JADX INFO: renamed from: h */
    List m19987h() {
        return this.f16702c;
    }

    /* JADX INFO: renamed from: i */
    c m19988i() {
        return (c) this.f16702c.get(this.f16704e);
    }

    /* JADX INFO: renamed from: j */
    int m19989j() {
        return this.f16704e;
    }

    /* JADX INFO: renamed from: k */
    c m19990k() {
        List list = this.f16702c;
        return (c) list.get(list.size() - 1);
    }

    /* JADX INFO: renamed from: l */
    c m19991l() {
        for (int size = this.f16702c.size() - 1; size >= 0; size--) {
            c cVar = (c) this.f16702c.get(size);
            if (!cVar.f16719e) {
                return cVar;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    int m19992m() {
        Iterator it = this.f16702c.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            if (((c) it.next()).f16719e) {
                i7++;
            }
        }
        return this.f16702c.size() - i7;
    }

    /* JADX INFO: renamed from: n */
    int m19993n() {
        return this.f16701b;
    }

    private C4451e(float f7, List list, int i7, int i8, int i9) {
        this.f16700a = f7;
        this.f16702c = Collections.unmodifiableList(list);
        this.f16703d = i7;
        this.f16704e = i8;
        while (i7 <= i8) {
            if (((c) list.get(i7)).f16720f == 0.0f) {
                this.f16701b++;
            }
            i7++;
        }
        this.f16705f = i9;
    }
}
