package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: androidx.recyclerview.widget.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2793l {

    /* JADX INFO: renamed from: a */
    protected final RecyclerView.AbstractC2765p f11233a;

    /* JADX INFO: renamed from: b */
    private int f11234b;

    /* JADX INFO: renamed from: c */
    final Rect f11235c;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.l$a */
    class a extends AbstractC2793l {
        a(RecyclerView.AbstractC2765p abstractC2765p) {
            super(abstractC2765p, null);
        }

        @Override // androidx.recyclerview.widget.AbstractC2793l
        /* JADX INFO: renamed from: d */
        public int mo13844d(View view) {
            return this.f11233a.m13420Z(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.C2766q) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC2793l
        /* JADX INFO: renamed from: e */
        public int mo13845e(View view) {
            RecyclerView.C2766q c2766q = (RecyclerView.C2766q) view.getLayoutParams();
            return this.f11233a.m13419Y(view) + ((ViewGroup.MarginLayoutParams) c2766q).leftMargin + ((ViewGroup.MarginLayoutParams) c2766q).rightMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC2793l
        /* JADX INFO: renamed from: f */
        public int mo13846f(View view) {
            RecyclerView.C2766q c2766q = (RecyclerView.C2766q) view.getLayoutParams();
            return this.f11233a.m13418X(view) + ((ViewGroup.MarginLayoutParams) c2766q).topMargin + ((ViewGroup.MarginLayoutParams) c2766q).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC2793l
        /* JADX INFO: renamed from: g */
        public int mo13847g(View view) {
            return this.f11233a.m13417W(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.C2766q) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC2793l
        /* JADX INFO: renamed from: h */
        public int mo13848h() {
            return this.f11233a.m13460t0();
        }

        @Override // androidx.recyclerview.widget.AbstractC2793l
        /* JADX INFO: renamed from: i */
        public int mo13849i() {
            return this.f11233a.m13460t0() - this.f11233a.m13441k0();
        }

        @Override // androidx.recyclerview.widget.AbstractC2793l
        /* JADX INFO: renamed from: j */
        public int mo13850j() {
            return this.f11233a.m13441k0();
        }

        @Override // androidx.recyclerview.widget.AbstractC2793l
        /* JADX INFO: renamed from: k */
        public int mo13851k() {
            return this.f11233a.m13462u0();
        }

        @Override // androidx.recyclerview.widget.AbstractC2793l
        /* JADX INFO: renamed from: l */
        public int mo13852l() {
            return this.f11233a.m13425d0();
        }

        @Override // androidx.recyclerview.widget.AbstractC2793l
        /* JADX INFO: renamed from: m */
        public int mo13853m() {
            return this.f11233a.m13438j0();
        }

        @Override // androidx.recyclerview.widget.AbstractC2793l
        /* JADX INFO: renamed from: n */
        public int mo13854n() {
            return (this.f11233a.m13460t0() - this.f11233a.m13438j0()) - this.f11233a.m13441k0();
        }

        @Override // androidx.recyclerview.widget.AbstractC2793l
        /* JADX INFO: renamed from: p */
        public int mo13856p(View view) {
            this.f11233a.m13458s0(view, true, this.f11235c);
            return this.f11235c.right;
        }

        @Override // androidx.recyclerview.widget.AbstractC2793l
        /* JADX INFO: renamed from: q */
        public int mo13857q(View view) {
            this.f11233a.m13458s0(view, true, this.f11235c);
            return this.f11235c.left;
        }

        @Override // androidx.recyclerview.widget.AbstractC2793l
        /* JADX INFO: renamed from: r */
        public void mo13858r(int i7) {
            this.f11233a.mo13393H0(i7);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.l$b */
    class b extends AbstractC2793l {
        b(RecyclerView.AbstractC2765p abstractC2765p) {
            super(abstractC2765p, null);
        }

        @Override // androidx.recyclerview.widget.AbstractC2793l
        /* JADX INFO: renamed from: d */
        public int mo13844d(View view) {
            return this.f11233a.m13414U(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.C2766q) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC2793l
        /* JADX INFO: renamed from: e */
        public int mo13845e(View view) {
            RecyclerView.C2766q c2766q = (RecyclerView.C2766q) view.getLayoutParams();
            return this.f11233a.m13418X(view) + ((ViewGroup.MarginLayoutParams) c2766q).topMargin + ((ViewGroup.MarginLayoutParams) c2766q).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC2793l
        /* JADX INFO: renamed from: f */
        public int mo13846f(View view) {
            RecyclerView.C2766q c2766q = (RecyclerView.C2766q) view.getLayoutParams();
            return this.f11233a.m13419Y(view) + ((ViewGroup.MarginLayoutParams) c2766q).leftMargin + ((ViewGroup.MarginLayoutParams) c2766q).rightMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC2793l
        /* JADX INFO: renamed from: g */
        public int mo13847g(View view) {
            return this.f11233a.m13421a0(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.C2766q) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC2793l
        /* JADX INFO: renamed from: h */
        public int mo13848h() {
            return this.f11233a.m13424c0();
        }

        @Override // androidx.recyclerview.widget.AbstractC2793l
        /* JADX INFO: renamed from: i */
        public int mo13849i() {
            return this.f11233a.m13424c0() - this.f11233a.m13436i0();
        }

        @Override // androidx.recyclerview.widget.AbstractC2793l
        /* JADX INFO: renamed from: j */
        public int mo13850j() {
            return this.f11233a.m13436i0();
        }

        @Override // androidx.recyclerview.widget.AbstractC2793l
        /* JADX INFO: renamed from: k */
        public int mo13851k() {
            return this.f11233a.m13425d0();
        }

        @Override // androidx.recyclerview.widget.AbstractC2793l
        /* JADX INFO: renamed from: l */
        public int mo13852l() {
            return this.f11233a.m13462u0();
        }

        @Override // androidx.recyclerview.widget.AbstractC2793l
        /* JADX INFO: renamed from: m */
        public int mo13853m() {
            return this.f11233a.m13443l0();
        }

        @Override // androidx.recyclerview.widget.AbstractC2793l
        /* JADX INFO: renamed from: n */
        public int mo13854n() {
            return (this.f11233a.m13424c0() - this.f11233a.m13443l0()) - this.f11233a.m13436i0();
        }

        @Override // androidx.recyclerview.widget.AbstractC2793l
        /* JADX INFO: renamed from: p */
        public int mo13856p(View view) {
            this.f11233a.m13458s0(view, true, this.f11235c);
            return this.f11235c.bottom;
        }

        @Override // androidx.recyclerview.widget.AbstractC2793l
        /* JADX INFO: renamed from: q */
        public int mo13857q(View view) {
            this.f11233a.m13458s0(view, true, this.f11235c);
            return this.f11235c.top;
        }

        @Override // androidx.recyclerview.widget.AbstractC2793l
        /* JADX INFO: renamed from: r */
        public void mo13858r(int i7) {
            this.f11233a.mo13394I0(i7);
        }
    }

    /* synthetic */ AbstractC2793l(RecyclerView.AbstractC2765p abstractC2765p, a aVar) {
        this(abstractC2765p);
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC2793l m13841a(RecyclerView.AbstractC2765p abstractC2765p) {
        return new a(abstractC2765p);
    }

    /* JADX INFO: renamed from: b */
    public static AbstractC2793l m13842b(RecyclerView.AbstractC2765p abstractC2765p, int i7) {
        if (i7 == 0) {
            return m13841a(abstractC2765p);
        }
        if (i7 == 1) {
            return m13843c(abstractC2765p);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC2793l m13843c(RecyclerView.AbstractC2765p abstractC2765p) {
        return new b(abstractC2765p);
    }

    /* JADX INFO: renamed from: d */
    public abstract int mo13844d(View view);

    /* JADX INFO: renamed from: e */
    public abstract int mo13845e(View view);

    /* JADX INFO: renamed from: f */
    public abstract int mo13846f(View view);

    /* JADX INFO: renamed from: g */
    public abstract int mo13847g(View view);

    /* JADX INFO: renamed from: h */
    public abstract int mo13848h();

    /* JADX INFO: renamed from: i */
    public abstract int mo13849i();

    /* JADX INFO: renamed from: j */
    public abstract int mo13850j();

    /* JADX INFO: renamed from: k */
    public abstract int mo13851k();

    /* JADX INFO: renamed from: l */
    public abstract int mo13852l();

    /* JADX INFO: renamed from: m */
    public abstract int mo13853m();

    /* JADX INFO: renamed from: n */
    public abstract int mo13854n();

    /* JADX INFO: renamed from: o */
    public int m13855o() {
        if (Integer.MIN_VALUE == this.f11234b) {
            return 0;
        }
        return mo13854n() - this.f11234b;
    }

    /* JADX INFO: renamed from: p */
    public abstract int mo13856p(View view);

    /* JADX INFO: renamed from: q */
    public abstract int mo13857q(View view);

    /* JADX INFO: renamed from: r */
    public abstract void mo13858r(int i7);

    /* JADX INFO: renamed from: s */
    public void m13859s() {
        this.f11234b = mo13854n();
    }

    private AbstractC2793l(RecyclerView.AbstractC2765p abstractC2765p) {
        this.f11234b = Integer.MIN_VALUE;
        this.f11235c = new Rect();
        this.f11233a = abstractC2765p;
    }
}
