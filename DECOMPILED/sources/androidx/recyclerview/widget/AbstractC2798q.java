package androidx.recyclerview.widget;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;

/* JADX INFO: renamed from: androidx.recyclerview.widget.q */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2798q extends RecyclerView.AbstractC2768s {

    /* JADX INFO: renamed from: a */
    RecyclerView f11244a;

    /* JADX INFO: renamed from: b */
    private Scroller f11245b;

    /* JADX INFO: renamed from: c */
    private final RecyclerView.AbstractC2770u f11246c = new a();

    /* JADX INFO: renamed from: androidx.recyclerview.widget.q$a */
    class a extends RecyclerView.AbstractC2770u {

        /* JADX INFO: renamed from: a */
        boolean f11247a = false;

        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2770u
        /* JADX INFO: renamed from: a */
        public void mo13488a(RecyclerView recyclerView, int i7) {
            super.mo13488a(recyclerView, i7);
            if (i7 == 0 && this.f11247a) {
                this.f11247a = false;
                AbstractC2798q.this.m13898j();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2770u
        /* JADX INFO: renamed from: b */
        public void mo13489b(RecyclerView recyclerView, int i7, int i8) {
            if (i7 == 0 && i8 == 0) {
                return;
            }
            this.f11247a = true;
        }
    }

    /* JADX INFO: renamed from: e */
    private void m13894e() {
        this.f11244a.m13167b1(this.f11246c);
        this.f11244a.setOnFlingListener(null);
    }

    /* JADX INFO: renamed from: h */
    private void m13895h() {
        if (this.f11244a.getOnFlingListener() != null) {
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
        this.f11244a.m13182l(this.f11246c);
        this.f11244a.setOnFlingListener(this);
    }

    /* JADX INFO: renamed from: i */
    private boolean m13896i(RecyclerView.AbstractC2765p abstractC2765p, int i7, int i8) {
        RecyclerView.AbstractC2745A abstractC2745AMo13868d;
        int iMo13870g;
        if (!(abstractC2765p instanceof RecyclerView.AbstractC2745A.b) || (abstractC2745AMo13868d = mo13868d(abstractC2765p)) == null || (iMo13870g = mo13870g(abstractC2765p, i7, i8)) == -1) {
            return false;
        }
        abstractC2745AMo13868d.m13230p(iMo13870g);
        abstractC2765p.m13406O1(abstractC2745AMo13868d);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2768s
    /* JADX INFO: renamed from: a */
    public boolean mo13484a(int i7, int i8) {
        RecyclerView.AbstractC2765p layoutManager = this.f11244a.getLayoutManager();
        if (layoutManager == null || this.f11244a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f11244a.getMinFlingVelocity();
        return (Math.abs(i8) > minFlingVelocity || Math.abs(i7) > minFlingVelocity) && m13896i(layoutManager, i7, i8);
    }

    /* JADX INFO: renamed from: b */
    public void m13897b(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f11244a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            m13894e();
        }
        this.f11244a = recyclerView;
        if (recyclerView != null) {
            m13895h();
            this.f11245b = new Scroller(this.f11244a.getContext(), new DecelerateInterpolator());
            m13898j();
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract int[] mo13867c(RecyclerView.AbstractC2765p abstractC2765p, View view);

    /* JADX INFO: renamed from: d */
    protected abstract RecyclerView.AbstractC2745A mo13868d(RecyclerView.AbstractC2765p abstractC2765p);

    /* JADX INFO: renamed from: f */
    public abstract View mo13869f(RecyclerView.AbstractC2765p abstractC2765p);

    /* JADX INFO: renamed from: g */
    public abstract int mo13870g(RecyclerView.AbstractC2765p abstractC2765p, int i7, int i8);

    /* JADX INFO: renamed from: j */
    void m13898j() {
        RecyclerView.AbstractC2765p layoutManager;
        View viewMo13869f;
        RecyclerView recyclerView = this.f11244a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewMo13869f = mo13869f(layoutManager)) == null) {
            return;
        }
        int[] iArrMo13867c = mo13867c(layoutManager, viewMo13869f);
        int i7 = iArrMo13867c[0];
        if (i7 == 0 && iArrMo13867c[1] == 0) {
            return;
        }
        this.f11244a.m13189o1(i7, iArrMo13867c[1]);
    }
}
