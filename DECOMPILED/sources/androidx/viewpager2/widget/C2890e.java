package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Locale;

/* JADX INFO: renamed from: androidx.viewpager2.widget.e */
/* JADX INFO: loaded from: classes.dex */
final class C2890e extends RecyclerView.AbstractC2770u {

    /* JADX INFO: renamed from: a */
    private ViewPager2.AbstractC2879i f11820a;

    /* JADX INFO: renamed from: b */
    private final ViewPager2 f11821b;

    /* JADX INFO: renamed from: c */
    private final RecyclerView f11822c;

    /* JADX INFO: renamed from: d */
    private final LinearLayoutManager f11823d;

    /* JADX INFO: renamed from: e */
    private int f11824e;

    /* JADX INFO: renamed from: f */
    private int f11825f;

    /* JADX INFO: renamed from: g */
    private a f11826g;

    /* JADX INFO: renamed from: h */
    private int f11827h;

    /* JADX INFO: renamed from: i */
    private int f11828i;

    /* JADX INFO: renamed from: j */
    private boolean f11829j;

    /* JADX INFO: renamed from: k */
    private boolean f11830k;

    /* JADX INFO: renamed from: l */
    private boolean f11831l;

    /* JADX INFO: renamed from: m */
    private boolean f11832m;

    /* JADX INFO: renamed from: androidx.viewpager2.widget.e$a */
    private static final class a {

        /* JADX INFO: renamed from: a */
        int f11833a;

        /* JADX INFO: renamed from: b */
        float f11834b;

        /* JADX INFO: renamed from: c */
        int f11835c;

        a() {
        }

        /* JADX INFO: renamed from: a */
        void m14455a() {
            this.f11833a = -1;
            this.f11834b = 0.0f;
            this.f11835c = 0;
        }
    }

    C2890e(ViewPager2 viewPager2) {
        this.f11821b = viewPager2;
        RecyclerView recyclerView = viewPager2.f11785u;
        this.f11822c = recyclerView;
        this.f11823d = (LinearLayoutManager) recyclerView.getLayoutManager();
        this.f11826g = new a();
        m14445n();
    }

    /* JADX INFO: renamed from: c */
    private void m14440c(int i7, float f7, int i8) {
        ViewPager2.AbstractC2879i abstractC2879i = this.f11820a;
        if (abstractC2879i != null) {
            abstractC2879i.mo14420b(i7, f7, i8);
        }
    }

    /* JADX INFO: renamed from: d */
    private void m14441d(int i7) {
        ViewPager2.AbstractC2879i abstractC2879i = this.f11820a;
        if (abstractC2879i != null) {
            abstractC2879i.mo3697c(i7);
        }
    }

    /* JADX INFO: renamed from: e */
    private void m14442e(int i7) {
        if ((this.f11824e == 3 && this.f11825f == 0) || this.f11825f == i7) {
            return;
        }
        this.f11825f = i7;
        ViewPager2.AbstractC2879i abstractC2879i = this.f11820a;
        if (abstractC2879i != null) {
            abstractC2879i.mo3696a(i7);
        }
    }

    /* JADX INFO: renamed from: f */
    private int m14443f() {
        return this.f11823d.m13052d2();
    }

    /* JADX INFO: renamed from: k */
    private boolean m14444k() {
        int i7 = this.f11824e;
        return i7 == 1 || i7 == 4;
    }

    /* JADX INFO: renamed from: n */
    private void m14445n() {
        this.f11824e = 0;
        this.f11825f = 0;
        this.f11826g.m14455a();
        this.f11827h = -1;
        this.f11828i = -1;
        this.f11829j = false;
        this.f11830k = false;
        this.f11832m = false;
        this.f11831l = false;
    }

    /* JADX INFO: renamed from: p */
    private void m14446p(boolean z7) {
        this.f11832m = z7;
        this.f11824e = z7 ? 4 : 1;
        int i7 = this.f11828i;
        if (i7 != -1) {
            this.f11827h = i7;
            this.f11828i = -1;
        } else if (this.f11827h == -1) {
            this.f11827h = m14443f();
        }
        m14442e(1);
    }

    /* JADX INFO: renamed from: q */
    private void m14447q() {
        int top;
        a aVar = this.f11826g;
        int iM13052d2 = this.f11823d.m13052d2();
        aVar.f11833a = iM13052d2;
        if (iM13052d2 == -1) {
            aVar.m14455a();
            return;
        }
        View viewMo13038I = this.f11823d.mo13038I(iM13052d2);
        if (viewMo13038I == null) {
            aVar.m14455a();
            return;
        }
        int iM13429f0 = this.f11823d.m13429f0(viewMo13038I);
        int iM13450o0 = this.f11823d.m13450o0(viewMo13038I);
        int iM13456r0 = this.f11823d.m13456r0(viewMo13038I);
        int iM13404N = this.f11823d.m13404N(viewMo13038I);
        ViewGroup.LayoutParams layoutParams = viewMo13038I.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            iM13429f0 += marginLayoutParams.leftMargin;
            iM13450o0 += marginLayoutParams.rightMargin;
            iM13456r0 += marginLayoutParams.topMargin;
            iM13404N += marginLayoutParams.bottomMargin;
        }
        int height = viewMo13038I.getHeight() + iM13456r0 + iM13404N;
        int width = viewMo13038I.getWidth() + iM13429f0 + iM13450o0;
        if (this.f11823d.m13061q2() == 0) {
            top = (viewMo13038I.getLeft() - iM13429f0) - this.f11822c.getPaddingLeft();
            if (this.f11821b.m14393d()) {
                top = -top;
            }
            height = width;
        } else {
            top = (viewMo13038I.getTop() - iM13456r0) - this.f11822c.getPaddingTop();
        }
        int i7 = -top;
        aVar.f11835c = i7;
        if (i7 >= 0) {
            aVar.f11834b = height == 0 ? 0.0f : i7 / height;
        } else {
            if (!new C2886a(this.f11823d).m14432d()) {
                throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", Integer.valueOf(aVar.f11835c)));
            }
            throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2770u
    /* JADX INFO: renamed from: a */
    public void mo13488a(RecyclerView recyclerView, int i7) {
        if (!(this.f11824e == 1 && this.f11825f == 1) && i7 == 1) {
            m14446p(false);
            return;
        }
        if (m14444k() && i7 == 2) {
            if (this.f11830k) {
                m14442e(2);
                this.f11829j = true;
                return;
            }
            return;
        }
        if (m14444k() && i7 == 0) {
            m14447q();
            if (this.f11830k) {
                a aVar = this.f11826g;
                if (aVar.f11835c == 0) {
                    int i8 = this.f11827h;
                    int i9 = aVar.f11833a;
                    if (i8 != i9) {
                        m14441d(i9);
                    }
                }
            } else {
                int i10 = this.f11826g.f11833a;
                if (i10 != -1) {
                    m14440c(i10, 0.0f, 0);
                }
            }
            m14442e(0);
            m14445n();
        }
        if (this.f11824e == 2 && i7 == 0 && this.f11831l) {
            m14447q();
            a aVar2 = this.f11826g;
            if (aVar2.f11835c == 0) {
                int i11 = this.f11828i;
                int i12 = aVar2.f11833a;
                if (i11 != i12) {
                    if (i12 == -1) {
                        i12 = 0;
                    }
                    m14441d(i12);
                }
                m14442e(0);
                m14445n();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001f  */
    /* JADX WARN: Code duplicated, block: B:14:0x0025  */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2770u
    /* JADX INFO: renamed from: b */
    public void mo13489b(RecyclerView recyclerView, int i7, int i8) {
        a aVar;
        int i9;
        this.f11830k = true;
        m14447q();
        if (this.f11829j) {
            this.f11829j = false;
            if (i8 > 0) {
                aVar = this.f11826g;
                if (aVar.f11835c != 0) {
                    i9 = aVar.f11833a + 1;
                } else {
                    i9 = this.f11826g.f11833a;
                }
            } else {
                if (i8 == 0) {
                    if ((i7 < 0) == this.f11821b.m14393d()) {
                        aVar = this.f11826g;
                        if (aVar.f11835c != 0) {
                            i9 = aVar.f11833a + 1;
                        }
                    }
                }
                i9 = this.f11826g.f11833a;
            }
            this.f11828i = i9;
            if (this.f11827h != i9) {
                m14441d(i9);
            }
        } else if (this.f11824e == 0) {
            int i10 = this.f11826g.f11833a;
            if (i10 == -1) {
                i10 = 0;
            }
            m14441d(i10);
        }
        a aVar2 = this.f11826g;
        int i11 = aVar2.f11833a;
        if (i11 == -1) {
            i11 = 0;
        }
        m14440c(i11, aVar2.f11834b, aVar2.f11835c);
        a aVar3 = this.f11826g;
        int i12 = aVar3.f11833a;
        int i13 = this.f11828i;
        if ((i12 == i13 || i13 == -1) && aVar3.f11835c == 0 && this.f11825f != 1) {
            m14442e(0);
            m14445n();
        }
    }

    /* JADX INFO: renamed from: g */
    double m14448g() {
        m14447q();
        a aVar = this.f11826g;
        return ((double) aVar.f11833a) + ((double) aVar.f11834b);
    }

    /* JADX INFO: renamed from: h */
    int m14449h() {
        return this.f11825f;
    }

    /* JADX INFO: renamed from: i */
    boolean m14450i() {
        return this.f11832m;
    }

    /* JADX INFO: renamed from: j */
    boolean m14451j() {
        return this.f11825f == 0;
    }

    /* JADX INFO: renamed from: l */
    void m14452l() {
        this.f11831l = true;
    }

    /* JADX INFO: renamed from: m */
    void m14453m(int i7, boolean z7) {
        this.f11824e = z7 ? 2 : 3;
        this.f11832m = false;
        boolean z8 = this.f11828i != i7;
        this.f11828i = i7;
        m14442e(2);
        if (z8) {
            m14441d(i7);
        }
    }

    /* JADX INFO: renamed from: o */
    void m14454o(ViewPager2.AbstractC2879i abstractC2879i) {
        this.f11820a = abstractC2879i;
    }
}
