package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: renamed from: androidx.recyclerview.widget.j */
/* JADX INFO: loaded from: classes.dex */
public class C2791j extends RecyclerView.AbstractC2745A {

    /* JADX INFO: renamed from: k */
    protected PointF f11226k;

    /* JADX INFO: renamed from: l */
    private final DisplayMetrics f11227l;

    /* JADX INFO: renamed from: n */
    private float f11229n;

    /* JADX INFO: renamed from: i */
    protected final LinearInterpolator f11224i = new LinearInterpolator();

    /* JADX INFO: renamed from: j */
    protected final DecelerateInterpolator f11225j = new DecelerateInterpolator();

    /* JADX INFO: renamed from: m */
    private boolean f11228m = false;

    /* JADX INFO: renamed from: o */
    protected int f11230o = 0;

    /* JADX INFO: renamed from: p */
    protected int f11231p = 0;

    public C2791j(Context context) {
        this.f11227l = context.getResources().getDisplayMetrics();
    }

    /* JADX INFO: renamed from: A */
    private float m13824A() {
        if (!this.f11228m) {
            this.f11229n = mo13831v(this.f11227l);
            this.f11228m = true;
        }
        return this.f11229n;
    }

    /* JADX INFO: renamed from: y */
    private int m13825y(int i7, int i8) {
        int i9 = i7 - i8;
        if (i7 * i9 <= 0) {
            return 0;
        }
        return i9;
    }

    /* JADX INFO: renamed from: B */
    protected int m13826B() {
        PointF pointF = this.f11226k;
        if (pointF == null) {
            return 0;
        }
        float f7 = pointF.y;
        if (f7 == 0.0f) {
            return 0;
        }
        return f7 > 0.0f ? 1 : -1;
    }

    /* JADX INFO: renamed from: C */
    protected void m13827C(RecyclerView.AbstractC2745A.a aVar) {
        PointF pointFMo13215a = mo13215a(m13220f());
        if (pointFMo13215a == null || (pointFMo13215a.x == 0.0f && pointFMo13215a.y == 0.0f)) {
            aVar.m13235b(m13220f());
            m13232r();
            return;
        }
        m13223i(pointFMo13215a);
        this.f11226k = pointFMo13215a;
        this.f11230o = (int) (pointFMo13215a.x * 10000.0f);
        this.f11231p = (int) (pointFMo13215a.y * 10000.0f);
        aVar.m13237d((int) (this.f11230o * 1.2f), (int) (this.f11231p * 1.2f), (int) (mo13833x(10000) * 1.2f), this.f11224i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2745A
    /* JADX INFO: renamed from: l */
    protected void mo13226l(int i7, int i8, RecyclerView.C2746B c2746b, RecyclerView.AbstractC2745A.a aVar) {
        if (m13217c() == 0) {
            m13232r();
            return;
        }
        this.f11230o = m13825y(this.f11230o, i7);
        int iM13825y = m13825y(this.f11231p, i8);
        this.f11231p = iM13825y;
        if (this.f11230o == 0 && iM13825y == 0) {
            m13827C(aVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2745A
    /* JADX INFO: renamed from: m */
    protected void mo13227m() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2745A
    /* JADX INFO: renamed from: n */
    protected void mo13228n() {
        this.f11231p = 0;
        this.f11230o = 0;
        this.f11226k = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2745A
    /* JADX INFO: renamed from: o */
    protected void mo13229o(View view, RecyclerView.C2746B c2746b, RecyclerView.AbstractC2745A.a aVar) {
        int iMo13829t = mo13829t(view, m13834z());
        int iMo13830u = mo13830u(view, m13826B());
        int iM13832w = m13832w((int) Math.sqrt((iMo13829t * iMo13829t) + (iMo13830u * iMo13830u)));
        if (iM13832w > 0) {
            aVar.m13237d(-iMo13829t, -iMo13830u, iM13832w, this.f11225j);
        }
    }

    /* JADX INFO: renamed from: s */
    public int m13828s(int i7, int i8, int i9, int i10, int i11) {
        if (i11 == -1) {
            return i9 - i7;
        }
        if (i11 != 0) {
            if (i11 == 1) {
                return i10 - i8;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i12 = i9 - i7;
        if (i12 > 0) {
            return i12;
        }
        int i13 = i10 - i8;
        if (i13 < 0) {
            return i13;
        }
        return 0;
    }

    /* JADX INFO: renamed from: t */
    public int mo13829t(View view, int i7) {
        RecyclerView.AbstractC2765p abstractC2765pM13219e = m13219e();
        if (abstractC2765pM13219e == null || !abstractC2765pM13219e.mo13060q()) {
            return 0;
        }
        RecyclerView.C2766q c2766q = (RecyclerView.C2766q) view.getLayoutParams();
        return m13828s(abstractC2765pM13219e.m13417W(view) - ((ViewGroup.MarginLayoutParams) c2766q).leftMargin, abstractC2765pM13219e.m13420Z(view) + ((ViewGroup.MarginLayoutParams) c2766q).rightMargin, abstractC2765pM13219e.m13438j0(), abstractC2765pM13219e.m13460t0() - abstractC2765pM13219e.m13441k0(), i7);
    }

    /* JADX INFO: renamed from: u */
    public int mo13830u(View view, int i7) {
        RecyclerView.AbstractC2765p abstractC2765pM13219e = m13219e();
        if (abstractC2765pM13219e == null || !abstractC2765pM13219e.mo13062r()) {
            return 0;
        }
        RecyclerView.C2766q c2766q = (RecyclerView.C2766q) view.getLayoutParams();
        return m13828s(abstractC2765pM13219e.m13421a0(view) - ((ViewGroup.MarginLayoutParams) c2766q).topMargin, abstractC2765pM13219e.m13414U(view) + ((ViewGroup.MarginLayoutParams) c2766q).bottomMargin, abstractC2765pM13219e.m13443l0(), abstractC2765pM13219e.m13424c0() - abstractC2765pM13219e.m13436i0(), i7);
    }

    /* JADX INFO: renamed from: v */
    protected float mo13831v(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    /* JADX INFO: renamed from: w */
    protected int m13832w(int i7) {
        return (int) Math.ceil(((double) mo13833x(i7)) / 0.3356d);
    }

    /* JADX INFO: renamed from: x */
    protected int mo13833x(int i7) {
        return (int) Math.ceil(Math.abs(i7) * m13824A());
    }

    /* JADX INFO: renamed from: z */
    protected int m13834z() {
        PointF pointF = this.f11226k;
        if (pointF == null) {
            return 0;
        }
        float f7 = pointF.x;
        if (f7 == 0.0f) {
            return 0;
        }
        return f7 > 0.0f ? 1 : -1;
    }
}
