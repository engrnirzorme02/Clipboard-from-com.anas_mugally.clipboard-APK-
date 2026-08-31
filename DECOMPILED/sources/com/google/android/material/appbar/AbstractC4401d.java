package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
import p065I.AbstractC0577a;
import p111O.C0982A0;

/* JADX INFO: renamed from: com.google.android.material.appbar.d */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC4401d extends AbstractC4402e {

    /* JADX INFO: renamed from: d */
    final Rect f16355d;

    /* JADX INFO: renamed from: e */
    final Rect f16356e;

    /* JADX INFO: renamed from: f */
    private int f16357f;

    /* JADX INFO: renamed from: r */
    private int f16358r;

    public AbstractC4401d() {
        this.f16355d = new Rect();
        this.f16356e = new Rect();
        this.f16357f = 0;
    }

    /* JADX INFO: renamed from: R */
    private static int m19523R(int i7) {
        if (i7 == 0) {
            return 8388659;
        }
        return i7;
    }

    @Override // com.google.android.material.appbar.AbstractC4402e
    /* JADX INFO: renamed from: J */
    protected void mo19524J(CoordinatorLayout coordinatorLayout, View view, int i7) {
        View viewMo19501L = mo19501L(coordinatorLayout.m10488v(view));
        if (viewMo19501L == null) {
            super.mo19524J(coordinatorLayout, view, i7);
            this.f16357f = 0;
            return;
        }
        CoordinatorLayout.C2426f c2426f = (CoordinatorLayout.C2426f) view.getLayoutParams();
        Rect rect = this.f16355d;
        rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c2426f).leftMargin, viewMo19501L.getBottom() + ((ViewGroup.MarginLayoutParams) c2426f).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c2426f).rightMargin, ((coordinatorLayout.getHeight() + viewMo19501L.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c2426f).bottomMargin);
        C0982A0 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null && coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            rect.left += lastWindowInsets.m4276j();
            rect.right -= lastWindowInsets.m4277k();
        }
        Rect rect2 = this.f16356e;
        Gravity.apply(m19523R(c2426f.f9257c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i7);
        int iM19525M = m19525M(viewMo19501L);
        view.layout(rect2.left, rect2.top - iM19525M, rect2.right, rect2.bottom - iM19525M);
        this.f16357f = rect2.top - viewMo19501L.getBottom();
    }

    /* JADX INFO: renamed from: L */
    abstract View mo19501L(List list);

    /* JADX INFO: renamed from: M */
    final int m19525M(View view) {
        if (this.f16358r == 0) {
            return 0;
        }
        float fMo19502N = mo19502N(view);
        int i7 = this.f16358r;
        return AbstractC0577a.m2541b((int) (fMo19502N * i7), 0, i7);
    }

    /* JADX INFO: renamed from: N */
    abstract float mo19502N(View view);

    /* JADX INFO: renamed from: O */
    public final int m19526O() {
        return this.f16358r;
    }

    /* JADX INFO: renamed from: P */
    int mo19503P(View view) {
        return view.getMeasuredHeight();
    }

    /* JADX INFO: renamed from: Q */
    final int m19527Q() {
        return this.f16357f;
    }

    /* JADX INFO: renamed from: S */
    public final void m19528S(int i7) {
        this.f16358r = i7;
    }

    /* JADX INFO: renamed from: T */
    protected boolean mo19529T() {
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2423c
    /* JADX INFO: renamed from: q */
    public boolean mo10512q(CoordinatorLayout coordinatorLayout, View view, int i7, int i8, int i9, int i10) {
        View viewMo19501L;
        C0982A0 lastWindowInsets;
        int i11 = view.getLayoutParams().height;
        if ((i11 != -1 && i11 != -2) || (viewMo19501L = mo19501L(coordinatorLayout.m10488v(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i9);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (viewMo19501L.getFitsSystemWindows() && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.m4278l() + lastWindowInsets.m4275i();
        }
        int iMo19503P = size + mo19503P(viewMo19501L);
        int measuredHeight = viewMo19501L.getMeasuredHeight();
        if (mo19529T()) {
            view.setTranslationY(-measuredHeight);
        } else {
            view.setTranslationY(0.0f);
            iMo19503P -= measuredHeight;
        }
        coordinatorLayout.m10477R(view, i7, i8, View.MeasureSpec.makeMeasureSpec(iMo19503P, i11 == -1 ? 1073741824 : Integer.MIN_VALUE), i10);
        return true;
    }

    public AbstractC4401d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16355d = new Rect();
        this.f16356e = new Rect();
        this.f16357f = 0;
    }
}
