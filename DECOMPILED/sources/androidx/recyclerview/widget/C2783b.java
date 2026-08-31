package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: androidx.recyclerview.widget.b */
/* JADX INFO: loaded from: classes.dex */
class C2783b {

    /* JADX INFO: renamed from: a */
    final b f11049a;

    /* JADX INFO: renamed from: b */
    final a f11050b = new a();

    /* JADX INFO: renamed from: c */
    final List f11051c = new ArrayList();

    /* JADX INFO: renamed from: androidx.recyclerview.widget.b$a */
    static class a {

        /* JADX INFO: renamed from: a */
        long f11052a = 0;

        /* JADX INFO: renamed from: b */
        a f11053b;

        a() {
        }

        /* JADX INFO: renamed from: c */
        private void m13698c() {
            if (this.f11053b == null) {
                this.f11053b = new a();
            }
        }

        /* JADX INFO: renamed from: a */
        void m13699a(int i7) {
            if (i7 < 64) {
                this.f11052a &= ~(1 << i7);
                return;
            }
            a aVar = this.f11053b;
            if (aVar != null) {
                aVar.m13699a(i7 - 64);
            }
        }

        /* JADX INFO: renamed from: b */
        int m13700b(int i7) {
            a aVar = this.f11053b;
            if (aVar == null) {
                return i7 >= 64 ? Long.bitCount(this.f11052a) : Long.bitCount(this.f11052a & ((1 << i7) - 1));
            }
            return i7 < 64 ? Long.bitCount(this.f11052a & ((1 << i7) - 1)) : aVar.m13700b(i7 - 64) + Long.bitCount(this.f11052a);
        }

        /* JADX INFO: renamed from: d */
        boolean m13701d(int i7) {
            if (i7 < 64) {
                return (this.f11052a & (1 << i7)) != 0;
            }
            m13698c();
            return this.f11053b.m13701d(i7 - 64);
        }

        /* JADX INFO: renamed from: e */
        void m13702e(int i7, boolean z7) {
            if (i7 >= 64) {
                m13698c();
                this.f11053b.m13702e(i7 - 64, z7);
                return;
            }
            long j7 = this.f11052a;
            boolean z8 = (Long.MIN_VALUE & j7) != 0;
            long j8 = (1 << i7) - 1;
            this.f11052a = ((j7 & (~j8)) << 1) | (j7 & j8);
            if (z7) {
                m13705h(i7);
            } else {
                m13699a(i7);
            }
            if (z8 || this.f11053b != null) {
                m13698c();
                this.f11053b.m13702e(0, z8);
            }
        }

        /* JADX INFO: renamed from: f */
        boolean m13703f(int i7) {
            if (i7 >= 64) {
                m13698c();
                return this.f11053b.m13703f(i7 - 64);
            }
            long j7 = 1 << i7;
            long j8 = this.f11052a;
            boolean z7 = (j8 & j7) != 0;
            long j9 = j8 & (~j7);
            this.f11052a = j9;
            long j10 = j7 - 1;
            this.f11052a = (j9 & j10) | Long.rotateRight((~j10) & j9, 1);
            a aVar = this.f11053b;
            if (aVar != null) {
                if (aVar.m13701d(0)) {
                    m13705h(63);
                }
                this.f11053b.m13703f(0);
            }
            return z7;
        }

        /* JADX INFO: renamed from: g */
        void m13704g() {
            this.f11052a = 0L;
            a aVar = this.f11053b;
            if (aVar != null) {
                aVar.m13704g();
            }
        }

        /* JADX INFO: renamed from: h */
        void m13705h(int i7) {
            if (i7 < 64) {
                this.f11052a |= 1 << i7;
            } else {
                m13698c();
                this.f11053b.m13705h(i7 - 64);
            }
        }

        public String toString() {
            if (this.f11053b == null) {
                return Long.toBinaryString(this.f11052a);
            }
            return this.f11053b.toString() + "xx" + Long.toBinaryString(this.f11052a);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.b$b */
    interface b {
        /* JADX INFO: renamed from: a */
        View mo13295a(int i7);

        /* JADX INFO: renamed from: b */
        void mo13296b(View view);

        /* JADX INFO: renamed from: c */
        void mo13297c();

        /* JADX INFO: renamed from: d */
        int mo13298d(View view);

        /* JADX INFO: renamed from: e */
        RecyclerView.AbstractC2749E mo13299e(View view);

        /* JADX INFO: renamed from: f */
        int mo13300f();

        /* JADX INFO: renamed from: g */
        void mo13301g(int i7);

        /* JADX INFO: renamed from: h */
        void mo13302h(View view);

        /* JADX INFO: renamed from: i */
        void mo13303i(View view, int i7);

        /* JADX INFO: renamed from: j */
        void mo13304j(int i7);

        /* JADX INFO: renamed from: k */
        void mo13305k(View view, int i7, ViewGroup.LayoutParams layoutParams);
    }

    C2783b(b bVar) {
        this.f11049a = bVar;
    }

    /* JADX INFO: renamed from: h */
    private int m13678h(int i7) {
        if (i7 < 0) {
            return -1;
        }
        int iMo13300f = this.f11049a.mo13300f();
        int i8 = i7;
        while (i8 < iMo13300f) {
            int iM13700b = i7 - (i8 - this.f11050b.m13700b(i8));
            if (iM13700b == 0) {
                while (this.f11050b.m13701d(i8)) {
                    i8++;
                }
                return i8;
            }
            i8 += iM13700b;
        }
        return -1;
    }

    /* JADX INFO: renamed from: l */
    private void m13679l(View view) {
        this.f11051c.add(view);
        this.f11049a.mo13296b(view);
    }

    /* JADX INFO: renamed from: t */
    private boolean m13680t(View view) {
        if (!this.f11051c.remove(view)) {
            return false;
        }
        this.f11049a.mo13302h(view);
        return true;
    }

    /* JADX INFO: renamed from: a */
    void m13681a(View view, int i7, boolean z7) {
        int iMo13300f = i7 < 0 ? this.f11049a.mo13300f() : m13678h(i7);
        this.f11050b.m13702e(iMo13300f, z7);
        if (z7) {
            m13679l(view);
        }
        this.f11049a.mo13303i(view, iMo13300f);
    }

    /* JADX INFO: renamed from: b */
    void m13682b(View view, boolean z7) {
        m13681a(view, -1, z7);
    }

    /* JADX INFO: renamed from: c */
    void m13683c(View view, int i7, ViewGroup.LayoutParams layoutParams, boolean z7) {
        int iMo13300f = i7 < 0 ? this.f11049a.mo13300f() : m13678h(i7);
        this.f11050b.m13702e(iMo13300f, z7);
        if (z7) {
            m13679l(view);
        }
        this.f11049a.mo13305k(view, iMo13300f, layoutParams);
    }

    /* JADX INFO: renamed from: d */
    void m13684d(int i7) {
        int iM13678h = m13678h(i7);
        this.f11050b.m13703f(iM13678h);
        this.f11049a.mo13301g(iM13678h);
    }

    /* JADX INFO: renamed from: e */
    View m13685e(int i7) {
        int size = this.f11051c.size();
        for (int i8 = 0; i8 < size; i8++) {
            View view = (View) this.f11051c.get(i8);
            RecyclerView.AbstractC2749E abstractC2749EMo13299e = this.f11049a.mo13299e(view);
            if (abstractC2749EMo13299e.m13281q() == i7 && !abstractC2749EMo13299e.m13288x() && !abstractC2749EMo13299e.m13290z()) {
                return view;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    View m13686f(int i7) {
        return this.f11049a.mo13295a(m13678h(i7));
    }

    /* JADX INFO: renamed from: g */
    int m13687g() {
        return this.f11049a.mo13300f() - this.f11051c.size();
    }

    /* JADX INFO: renamed from: i */
    View m13688i(int i7) {
        return this.f11049a.mo13295a(i7);
    }

    /* JADX INFO: renamed from: j */
    int m13689j() {
        return this.f11049a.mo13300f();
    }

    /* JADX INFO: renamed from: k */
    void m13690k(View view) {
        int iMo13298d = this.f11049a.mo13298d(view);
        if (iMo13298d >= 0) {
            this.f11050b.m13705h(iMo13298d);
            m13679l(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    /* JADX INFO: renamed from: m */
    int m13691m(View view) {
        int iMo13298d = this.f11049a.mo13298d(view);
        if (iMo13298d == -1 || this.f11050b.m13701d(iMo13298d)) {
            return -1;
        }
        return iMo13298d - this.f11050b.m13700b(iMo13298d);
    }

    /* JADX INFO: renamed from: n */
    boolean m13692n(View view) {
        return this.f11051c.contains(view);
    }

    /* JADX INFO: renamed from: o */
    void m13693o() {
        this.f11050b.m13704g();
        for (int size = this.f11051c.size() - 1; size >= 0; size--) {
            this.f11049a.mo13302h((View) this.f11051c.get(size));
            this.f11051c.remove(size);
        }
        this.f11049a.mo13297c();
    }

    /* JADX INFO: renamed from: p */
    void m13694p(View view) {
        int iMo13298d = this.f11049a.mo13298d(view);
        if (iMo13298d < 0) {
            return;
        }
        if (this.f11050b.m13703f(iMo13298d)) {
            m13680t(view);
        }
        this.f11049a.mo13304j(iMo13298d);
    }

    /* JADX INFO: renamed from: q */
    void m13695q(int i7) {
        int iM13678h = m13678h(i7);
        View viewMo13295a = this.f11049a.mo13295a(iM13678h);
        if (viewMo13295a == null) {
            return;
        }
        if (this.f11050b.m13703f(iM13678h)) {
            m13680t(viewMo13295a);
        }
        this.f11049a.mo13304j(iM13678h);
    }

    /* JADX INFO: renamed from: r */
    boolean m13696r(View view) {
        int iMo13298d = this.f11049a.mo13298d(view);
        if (iMo13298d == -1) {
            m13680t(view);
            return true;
        }
        if (!this.f11050b.m13701d(iMo13298d)) {
            return false;
        }
        this.f11050b.m13703f(iMo13298d);
        m13680t(view);
        this.f11049a.mo13304j(iMo13298d);
        return true;
    }

    /* JADX INFO: renamed from: s */
    void m13697s(View view) {
        int iMo13298d = this.f11049a.mo13298d(view);
        if (iMo13298d < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        if (this.f11050b.m13701d(iMo13298d)) {
            this.f11050b.m13699a(iMo13298d);
            m13680t(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public String toString() {
        return this.f11050b.toString() + ", hidden list:" + this.f11051c.size();
    }
}
