package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.gms.common.api.C3553a;

/* JADX INFO: renamed from: androidx.recyclerview.widget.m */
/* JADX INFO: loaded from: classes.dex */
public class C2794m extends AbstractC2798q {

    /* JADX INFO: renamed from: d */
    private AbstractC2793l f11236d;

    /* JADX INFO: renamed from: e */
    private AbstractC2793l f11237e;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.m$a */
    class a extends C2791j {
        a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.C2791j, androidx.recyclerview.widget.RecyclerView.AbstractC2745A
        /* JADX INFO: renamed from: o */
        protected void mo13229o(View view, RecyclerView.C2746B c2746b, RecyclerView.AbstractC2745A.a aVar) {
            C2794m c2794m = C2794m.this;
            int[] iArrMo13867c = c2794m.mo13867c(c2794m.f11244a.getLayoutManager(), view);
            int i7 = iArrMo13867c[0];
            int i8 = iArrMo13867c[1];
            int iM13832w = m13832w(Math.max(Math.abs(i7), Math.abs(i8)));
            if (iM13832w > 0) {
                aVar.m13237d(i7, i8, iM13832w, this.f11225j);
            }
        }

        @Override // androidx.recyclerview.widget.C2791j
        /* JADX INFO: renamed from: v */
        protected float mo13831v(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.C2791j
        /* JADX INFO: renamed from: x */
        protected int mo13833x(int i7) {
            return Math.min(100, super.mo13833x(i7));
        }
    }

    /* JADX INFO: renamed from: k */
    private int m13860k(View view, AbstractC2793l abstractC2793l) {
        return (abstractC2793l.mo13847g(view) + (abstractC2793l.mo13845e(view) / 2)) - (abstractC2793l.mo13853m() + (abstractC2793l.mo13854n() / 2));
    }

    /* JADX INFO: renamed from: l */
    private View m13861l(RecyclerView.AbstractC2765p abstractC2765p, AbstractC2793l abstractC2793l) {
        int iM13407P = abstractC2765p.m13407P();
        View view = null;
        if (iM13407P == 0) {
            return null;
        }
        int iMo13853m = abstractC2793l.mo13853m() + (abstractC2793l.mo13854n() / 2);
        int i7 = C3553a.e.API_PRIORITY_OTHER;
        for (int i8 = 0; i8 < iM13407P; i8++) {
            View viewM13405O = abstractC2765p.m13405O(i8);
            int iAbs = Math.abs((abstractC2793l.mo13847g(viewM13405O) + (abstractC2793l.mo13845e(viewM13405O) / 2)) - iMo13853m);
            if (iAbs < i7) {
                view = viewM13405O;
                i7 = iAbs;
            }
        }
        return view;
    }

    /* JADX INFO: renamed from: m */
    private AbstractC2793l m13862m(RecyclerView.AbstractC2765p abstractC2765p) {
        AbstractC2793l abstractC2793l = this.f11237e;
        if (abstractC2793l == null || abstractC2793l.f11233a != abstractC2765p) {
            this.f11237e = AbstractC2793l.m13841a(abstractC2765p);
        }
        return this.f11237e;
    }

    /* JADX INFO: renamed from: n */
    private AbstractC2793l m13863n(RecyclerView.AbstractC2765p abstractC2765p) {
        if (abstractC2765p.mo13062r()) {
            return m13864o(abstractC2765p);
        }
        if (abstractC2765p.mo13060q()) {
            return m13862m(abstractC2765p);
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    private AbstractC2793l m13864o(RecyclerView.AbstractC2765p abstractC2765p) {
        AbstractC2793l abstractC2793l = this.f11236d;
        if (abstractC2793l == null || abstractC2793l.f11233a != abstractC2765p) {
            this.f11236d = AbstractC2793l.m13843c(abstractC2765p);
        }
        return this.f11236d;
    }

    /* JADX INFO: renamed from: p */
    private boolean m13865p(RecyclerView.AbstractC2765p abstractC2765p, int i7, int i8) {
        if (abstractC2765p.mo13060q()) {
            return i7 > 0;
        }
        return i8 > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    private boolean m13866q(RecyclerView.AbstractC2765p abstractC2765p) {
        PointF pointFMo13049c;
        int iM13428f = abstractC2765p.m13428f();
        if (!(abstractC2765p instanceof RecyclerView.AbstractC2745A.b) || (pointFMo13049c = ((RecyclerView.AbstractC2745A.b) abstractC2765p).mo13049c(iM13428f - 1)) == null) {
            return false;
        }
        return pointFMo13049c.x < 0.0f || pointFMo13049c.y < 0.0f;
    }

    @Override // androidx.recyclerview.widget.AbstractC2798q
    /* JADX INFO: renamed from: c */
    public int[] mo13867c(RecyclerView.AbstractC2765p abstractC2765p, View view) {
        int[] iArr = new int[2];
        if (abstractC2765p.mo13060q()) {
            iArr[0] = m13860k(view, m13862m(abstractC2765p));
        } else {
            iArr[0] = 0;
        }
        if (abstractC2765p.mo13062r()) {
            iArr[1] = m13860k(view, m13864o(abstractC2765p));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    @Override // androidx.recyclerview.widget.AbstractC2798q
    /* JADX INFO: renamed from: d */
    protected RecyclerView.AbstractC2745A mo13868d(RecyclerView.AbstractC2765p abstractC2765p) {
        if (abstractC2765p instanceof RecyclerView.AbstractC2745A.b) {
            return new a(this.f11244a.getContext());
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.AbstractC2798q
    /* JADX INFO: renamed from: f */
    public View mo13869f(RecyclerView.AbstractC2765p abstractC2765p) {
        if (abstractC2765p.mo13062r()) {
            return m13861l(abstractC2765p, m13864o(abstractC2765p));
        }
        if (abstractC2765p.mo13060q()) {
            return m13861l(abstractC2765p, m13862m(abstractC2765p));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.AbstractC2798q
    /* JADX INFO: renamed from: g */
    public int mo13870g(RecyclerView.AbstractC2765p abstractC2765p, int i7, int i8) {
        AbstractC2793l abstractC2793lM13863n;
        int iM13428f = abstractC2765p.m13428f();
        if (iM13428f == 0 || (abstractC2793lM13863n = m13863n(abstractC2765p)) == null) {
            return -1;
        }
        int iM13407P = abstractC2765p.m13407P();
        View view = null;
        int i9 = Integer.MAX_VALUE;
        int i10 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i11 = 0; i11 < iM13407P; i11++) {
            View viewM13405O = abstractC2765p.m13405O(i11);
            if (viewM13405O != null) {
                int iM13860k = m13860k(viewM13405O, abstractC2793lM13863n);
                if (iM13860k <= 0 && iM13860k > i10) {
                    view2 = viewM13405O;
                    i10 = iM13860k;
                }
                if (iM13860k >= 0 && iM13860k < i9) {
                    view = viewM13405O;
                    i9 = iM13860k;
                }
            }
        }
        boolean zM13865p = m13865p(abstractC2765p, i7, i8);
        if (zM13865p && view != null) {
            return abstractC2765p.m13445m0(view);
        }
        if (!zM13865p && view2 != null) {
            return abstractC2765p.m13445m0(view2);
        }
        if (zM13865p) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int iM13445m0 = abstractC2765p.m13445m0(view) + (m13866q(abstractC2765p) == zM13865p ? -1 : 1);
        if (iM13445m0 < 0 || iM13445m0 >= iM13428f) {
            return -1;
        }
        return iM13445m0;
    }
}
