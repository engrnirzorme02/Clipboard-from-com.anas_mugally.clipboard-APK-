package androidx.recyclerview.widget;

import java.util.ArrayList;
import java.util.List;
import p104N.C0908e;
import p104N.InterfaceC0907d;

/* JADX INFO: renamed from: androidx.recyclerview.widget.a */
/* JADX INFO: loaded from: classes.dex */
final class C2782a implements C2792k.a {

    /* JADX INFO: renamed from: a */
    private InterfaceC0907d f11037a;

    /* JADX INFO: renamed from: b */
    final ArrayList f11038b;

    /* JADX INFO: renamed from: c */
    final ArrayList f11039c;

    /* JADX INFO: renamed from: d */
    final a f11040d;

    /* JADX INFO: renamed from: e */
    Runnable f11041e;

    /* JADX INFO: renamed from: f */
    final boolean f11042f;

    /* JADX INFO: renamed from: g */
    final C2792k f11043g;

    /* JADX INFO: renamed from: h */
    private int f11044h;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.a$a */
    interface a {
        /* JADX INFO: renamed from: a */
        void mo13306a(int i7, int i8);

        /* JADX INFO: renamed from: b */
        void mo13307b(b bVar);

        /* JADX INFO: renamed from: c */
        void mo13308c(int i7, int i8, Object obj);

        /* JADX INFO: renamed from: d */
        void mo13309d(b bVar);

        /* JADX INFO: renamed from: e */
        RecyclerView.AbstractC2749E mo13310e(int i7);

        /* JADX INFO: renamed from: f */
        void mo13311f(int i7, int i8);

        /* JADX INFO: renamed from: g */
        void mo13312g(int i7, int i8);

        /* JADX INFO: renamed from: h */
        void mo13313h(int i7, int i8);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.a$b */
    static final class b {

        /* JADX INFO: renamed from: a */
        int f11045a;

        /* JADX INFO: renamed from: b */
        int f11046b;

        /* JADX INFO: renamed from: c */
        Object f11047c;

        /* JADX INFO: renamed from: d */
        int f11048d;

        b(int i7, int i8, int i9, Object obj) {
            this.f11045a = i7;
            this.f11046b = i8;
            this.f11048d = i9;
            this.f11047c = obj;
        }

        /* JADX INFO: renamed from: a */
        String m13677a() {
            int i7 = this.f11045a;
            if (i7 == 1) {
                return "add";
            }
            if (i7 == 2) {
                return "rm";
            }
            if (i7 != 4) {
                return i7 != 8 ? "??" : "mv";
            }
            return "up";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            int i7 = this.f11045a;
            if (i7 != bVar.f11045a) {
                return false;
            }
            if (i7 == 8 && Math.abs(this.f11048d - this.f11046b) == 1 && this.f11048d == bVar.f11046b && this.f11046b == bVar.f11048d) {
                return true;
            }
            if (this.f11048d != bVar.f11048d || this.f11046b != bVar.f11046b) {
                return false;
            }
            Object obj2 = this.f11047c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f11047c)) {
                    return false;
                }
            } else if (bVar.f11047c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f11045a * 31) + this.f11046b) * 31) + this.f11048d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + m13677a() + ",s:" + this.f11046b + "c:" + this.f11048d + ",p:" + this.f11047c + "]";
        }
    }

    C2782a(a aVar) {
        this(aVar, false);
    }

    /* JADX INFO: renamed from: c */
    private void m13653c(b bVar) {
        m13659t(bVar);
    }

    /* JADX INFO: renamed from: d */
    private void m13654d(b bVar) {
        m13659t(bVar);
    }

    /* JADX INFO: renamed from: f */
    private void m13655f(b bVar) {
        boolean z7;
        byte b7;
        int i7 = bVar.f11046b;
        int i8 = bVar.f11048d + i7;
        byte b8 = -1;
        int i9 = i7;
        int i10 = 0;
        while (i9 < i8) {
            if (this.f11040d.mo13310e(i9) != null || m13657h(i9)) {
                if (b8 == 0) {
                    m13658k(mo13662b(2, i7, i10, null));
                    z7 = true;
                } else {
                    z7 = false;
                }
                b7 = 1;
            } else {
                if (b8 == 1) {
                    m13659t(mo13662b(2, i7, i10, null));
                    z7 = true;
                } else {
                    z7 = false;
                }
                b7 = 0;
            }
            if (z7) {
                i9 -= i10;
                i8 -= i10;
                i10 = 1;
            } else {
                i10++;
            }
            i9++;
            b8 = b7;
        }
        if (i10 != bVar.f11048d) {
            mo13661a(bVar);
            bVar = mo13662b(2, i7, i10, null);
        }
        if (b8 == 0) {
            m13658k(bVar);
        } else {
            m13659t(bVar);
        }
    }

    /* JADX INFO: renamed from: g */
    private void m13656g(b bVar) {
        int i7 = bVar.f11046b;
        int i8 = bVar.f11048d + i7;
        int i9 = 0;
        byte b7 = -1;
        int i10 = i7;
        while (i7 < i8) {
            if (this.f11040d.mo13310e(i7) != null || m13657h(i7)) {
                if (b7 == 0) {
                    m13658k(mo13662b(4, i10, i9, bVar.f11047c));
                    i10 = i7;
                    i9 = 0;
                }
                b7 = 1;
            } else {
                if (b7 == 1) {
                    m13659t(mo13662b(4, i10, i9, bVar.f11047c));
                    i10 = i7;
                    i9 = 0;
                }
                b7 = 0;
            }
            i9++;
            i7++;
        }
        if (i9 != bVar.f11048d) {
            Object obj = bVar.f11047c;
            mo13661a(bVar);
            bVar = mo13662b(4, i10, i9, obj);
        }
        if (b7 == 0) {
            m13658k(bVar);
        } else {
            m13659t(bVar);
        }
    }

    /* JADX INFO: renamed from: h */
    private boolean m13657h(int i7) {
        int size = this.f11039c.size();
        for (int i8 = 0; i8 < size; i8++) {
            b bVar = (b) this.f11039c.get(i8);
            int i9 = bVar.f11045a;
            if (i9 == 8) {
                if (m13668n(bVar.f11048d, i8 + 1) == i7) {
                    return true;
                }
            } else if (i9 == 1) {
                int i10 = bVar.f11046b;
                int i11 = bVar.f11048d + i10;
                while (i10 < i11) {
                    if (m13668n(i10, i8 + 1) == i7) {
                        return true;
                    }
                    i10++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    private void m13658k(b bVar) {
        int i7;
        int i8 = bVar.f11045a;
        if (i8 == 1 || i8 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iM13660x = m13660x(bVar.f11046b, i8);
        int i9 = bVar.f11046b;
        int i10 = bVar.f11045a;
        if (i10 == 2) {
            i7 = 0;
        } else {
            if (i10 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + bVar);
            }
            i7 = 1;
        }
        int i11 = 1;
        for (int i12 = 1; i12 < bVar.f11048d; i12++) {
            int iM13660x2 = m13660x(bVar.f11046b + (i7 * i12), bVar.f11045a);
            int i13 = bVar.f11045a;
            if (i13 == 2 ? iM13660x2 != iM13660x : !(i13 == 4 && iM13660x2 == iM13660x + 1)) {
                b bVarMo13662b = mo13662b(i13, iM13660x, i11, bVar.f11047c);
                m13666l(bVarMo13662b, i9);
                mo13661a(bVarMo13662b);
                if (bVar.f11045a == 4) {
                    i9 += i11;
                }
                i11 = 1;
                iM13660x = iM13660x2;
            } else {
                i11++;
            }
        }
        Object obj = bVar.f11047c;
        mo13661a(bVar);
        if (i11 > 0) {
            b bVarMo13662b2 = mo13662b(bVar.f11045a, iM13660x, i11, obj);
            m13666l(bVarMo13662b2, i9);
            mo13661a(bVarMo13662b2);
        }
    }

    /* JADX INFO: renamed from: t */
    private void m13659t(b bVar) {
        this.f11039c.add(bVar);
        int i7 = bVar.f11045a;
        if (i7 == 1) {
            this.f11040d.mo13312g(bVar.f11046b, bVar.f11048d);
            return;
        }
        if (i7 == 2) {
            this.f11040d.mo13311f(bVar.f11046b, bVar.f11048d);
            return;
        }
        if (i7 == 4) {
            this.f11040d.mo13308c(bVar.f11046b, bVar.f11048d, bVar.f11047c);
        } else {
            if (i7 == 8) {
                this.f11040d.mo13306a(bVar.f11046b, bVar.f11048d);
                return;
            }
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    /* JADX INFO: renamed from: x */
    private int m13660x(int i7, int i8) {
        int i9;
        int i10;
        for (int size = this.f11039c.size() - 1; size >= 0; size--) {
            b bVar = (b) this.f11039c.get(size);
            int i11 = bVar.f11045a;
            if (i11 == 8) {
                int i12 = bVar.f11046b;
                int i13 = bVar.f11048d;
                if (i12 < i13) {
                    i10 = i12;
                    i9 = i13;
                } else {
                    i9 = i12;
                    i10 = i13;
                }
                if (i7 < i10 || i7 > i9) {
                    if (i7 < i12) {
                        if (i8 == 1) {
                            bVar.f11046b = i12 + 1;
                            bVar.f11048d = i13 + 1;
                        } else if (i8 == 2) {
                            bVar.f11046b = i12 - 1;
                            bVar.f11048d = i13 - 1;
                        }
                    }
                } else if (i10 == i12) {
                    if (i8 == 1) {
                        bVar.f11048d = i13 + 1;
                    } else if (i8 == 2) {
                        bVar.f11048d = i13 - 1;
                    }
                    i7++;
                } else {
                    if (i8 == 1) {
                        bVar.f11046b = i12 + 1;
                    } else if (i8 == 2) {
                        bVar.f11046b = i12 - 1;
                    }
                    i7--;
                }
            } else {
                int i14 = bVar.f11046b;
                if (i14 <= i7) {
                    if (i11 == 1) {
                        i7 -= bVar.f11048d;
                    } else if (i11 == 2) {
                        i7 += bVar.f11048d;
                    }
                } else if (i8 == 1) {
                    bVar.f11046b = i14 + 1;
                } else if (i8 == 2) {
                    bVar.f11046b = i14 - 1;
                }
            }
        }
        for (int size2 = this.f11039c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = (b) this.f11039c.get(size2);
            if (bVar2.f11045a == 8) {
                int i15 = bVar2.f11048d;
                if (i15 == bVar2.f11046b || i15 < 0) {
                    this.f11039c.remove(size2);
                    mo13661a(bVar2);
                }
            } else if (bVar2.f11048d <= 0) {
                this.f11039c.remove(size2);
                mo13661a(bVar2);
            }
        }
        return i7;
    }

    @Override // androidx.recyclerview.widget.C2792k.a
    /* JADX INFO: renamed from: a */
    public void mo13661a(b bVar) {
        if (this.f11042f) {
            return;
        }
        bVar.f11047c = null;
        this.f11037a.mo4130a(bVar);
    }

    @Override // androidx.recyclerview.widget.C2792k.a
    /* JADX INFO: renamed from: b */
    public b mo13662b(int i7, int i8, int i9, Object obj) {
        b bVar = (b) this.f11037a.mo4131b();
        if (bVar == null) {
            return new b(i7, i8, i9, obj);
        }
        bVar.f11045a = i7;
        bVar.f11046b = i8;
        bVar.f11048d = i9;
        bVar.f11047c = obj;
        return bVar;
    }

    /* JADX INFO: renamed from: e */
    public int m13663e(int i7) {
        int size = this.f11038b.size();
        for (int i8 = 0; i8 < size; i8++) {
            b bVar = (b) this.f11038b.get(i8);
            int i9 = bVar.f11045a;
            if (i9 != 1) {
                if (i9 == 2) {
                    int i10 = bVar.f11046b;
                    if (i10 <= i7) {
                        int i11 = bVar.f11048d;
                        if (i10 + i11 > i7) {
                            return -1;
                        }
                        i7 -= i11;
                    } else {
                        continue;
                    }
                } else if (i9 == 8) {
                    int i12 = bVar.f11046b;
                    if (i12 == i7) {
                        i7 = bVar.f11048d;
                    } else {
                        if (i12 < i7) {
                            i7--;
                        }
                        if (bVar.f11048d <= i7) {
                            i7++;
                        }
                    }
                }
            } else if (bVar.f11046b <= i7) {
                i7 += bVar.f11048d;
            }
        }
        return i7;
    }

    /* JADX INFO: renamed from: i */
    void m13664i() {
        int size = this.f11039c.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.f11040d.mo13309d((b) this.f11039c.get(i7));
        }
        m13675v(this.f11039c);
        this.f11044h = 0;
    }

    /* JADX INFO: renamed from: j */
    void m13665j() {
        m13664i();
        int size = this.f11038b.size();
        for (int i7 = 0; i7 < size; i7++) {
            b bVar = (b) this.f11038b.get(i7);
            int i8 = bVar.f11045a;
            if (i8 == 1) {
                this.f11040d.mo13309d(bVar);
                this.f11040d.mo13312g(bVar.f11046b, bVar.f11048d);
            } else if (i8 == 2) {
                this.f11040d.mo13309d(bVar);
                this.f11040d.mo13313h(bVar.f11046b, bVar.f11048d);
            } else if (i8 == 4) {
                this.f11040d.mo13309d(bVar);
                this.f11040d.mo13308c(bVar.f11046b, bVar.f11048d, bVar.f11047c);
            } else if (i8 == 8) {
                this.f11040d.mo13309d(bVar);
                this.f11040d.mo13306a(bVar.f11046b, bVar.f11048d);
            }
            Runnable runnable = this.f11041e;
            if (runnable != null) {
                runnable.run();
            }
        }
        m13675v(this.f11038b);
        this.f11044h = 0;
    }

    /* JADX INFO: renamed from: l */
    void m13666l(b bVar, int i7) {
        this.f11040d.mo13307b(bVar);
        int i8 = bVar.f11045a;
        if (i8 == 2) {
            this.f11040d.mo13313h(i7, bVar.f11048d);
        } else {
            if (i8 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            this.f11040d.mo13308c(i7, bVar.f11048d, bVar.f11047c);
        }
    }

    /* JADX INFO: renamed from: m */
    int m13667m(int i7) {
        return m13668n(i7, 0);
    }

    /* JADX INFO: renamed from: n */
    int m13668n(int i7, int i8) {
        int size = this.f11039c.size();
        while (i8 < size) {
            b bVar = (b) this.f11039c.get(i8);
            int i9 = bVar.f11045a;
            if (i9 == 8) {
                int i10 = bVar.f11046b;
                if (i10 == i7) {
                    i7 = bVar.f11048d;
                } else {
                    if (i10 < i7) {
                        i7--;
                    }
                    if (bVar.f11048d <= i7) {
                        i7++;
                    }
                }
            } else {
                int i11 = bVar.f11046b;
                if (i11 > i7) {
                    continue;
                } else if (i9 == 2) {
                    int i12 = bVar.f11048d;
                    if (i7 < i11 + i12) {
                        return -1;
                    }
                    i7 -= i12;
                } else if (i9 == 1) {
                    i7 += bVar.f11048d;
                }
            }
            i8++;
        }
        return i7;
    }

    /* JADX INFO: renamed from: o */
    boolean m13669o(int i7) {
        return (i7 & this.f11044h) != 0;
    }

    /* JADX INFO: renamed from: p */
    boolean m13670p() {
        return this.f11038b.size() > 0;
    }

    /* JADX INFO: renamed from: q */
    boolean m13671q() {
        return (this.f11039c.isEmpty() || this.f11038b.isEmpty()) ? false : true;
    }

    /* JADX INFO: renamed from: r */
    boolean m13672r(int i7, int i8, Object obj) {
        if (i8 < 1) {
            return false;
        }
        this.f11038b.add(mo13662b(4, i7, i8, obj));
        this.f11044h |= 4;
        return this.f11038b.size() == 1;
    }

    /* JADX INFO: renamed from: s */
    boolean m13673s(int i7, int i8, int i9) {
        if (i7 == i8) {
            return false;
        }
        if (i9 != 1) {
            throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
        }
        this.f11038b.add(mo13662b(8, i7, i8, null));
        this.f11044h |= 8;
        return this.f11038b.size() == 1;
    }

    /* JADX INFO: renamed from: u */
    void m13674u() {
        this.f11043g.m13838b(this.f11038b);
        int size = this.f11038b.size();
        for (int i7 = 0; i7 < size; i7++) {
            b bVar = (b) this.f11038b.get(i7);
            int i8 = bVar.f11045a;
            if (i8 == 1) {
                m13653c(bVar);
            } else if (i8 == 2) {
                m13655f(bVar);
            } else if (i8 == 4) {
                m13656g(bVar);
            } else if (i8 == 8) {
                m13654d(bVar);
            }
            Runnable runnable = this.f11041e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f11038b.clear();
    }

    /* JADX INFO: renamed from: v */
    void m13675v(List list) {
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            mo13661a((b) list.get(i7));
        }
        list.clear();
    }

    /* JADX INFO: renamed from: w */
    void m13676w() {
        m13675v(this.f11038b);
        m13675v(this.f11039c);
        this.f11044h = 0;
    }

    C2782a(a aVar, boolean z7) {
        this.f11037a = new C0908e(30);
        this.f11038b = new ArrayList();
        this.f11039c = new ArrayList();
        this.f11044h = 0;
        this.f11040d = aVar;
        this.f11042f = z7;
        this.f11043g = new C2792k(this);
    }
}
