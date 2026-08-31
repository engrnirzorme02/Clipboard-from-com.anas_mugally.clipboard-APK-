package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: renamed from: com.google.android.material.appbar.e */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC4402e extends CoordinatorLayout.AbstractC2423c {

    /* JADX INFO: renamed from: a */
    private C4403f f16359a;

    /* JADX INFO: renamed from: b */
    private int f16360b;

    /* JADX INFO: renamed from: c */
    private int f16361c;

    public AbstractC4402e() {
        this.f16360b = 0;
        this.f16361c = 0;
    }

    /* JADX INFO: renamed from: I */
    public int mo19496I() {
        C4403f c4403f = this.f16359a;
        if (c4403f != null) {
            return c4403f.m19531b();
        }
        return 0;
    }

    /* JADX INFO: renamed from: J */
    protected void mo19524J(CoordinatorLayout coordinatorLayout, View view, int i7) {
        coordinatorLayout.m10476Q(view, i7);
    }

    /* JADX INFO: renamed from: K */
    public boolean mo19497K(int i7) {
        C4403f c4403f = this.f16359a;
        if (c4403f != null) {
            return c4403f.m19534e(i7);
        }
        this.f16360b = i7;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2423c
    /* JADX INFO: renamed from: p */
    public boolean mo10511p(CoordinatorLayout coordinatorLayout, View view, int i7) {
        mo19524J(coordinatorLayout, view, i7);
        if (this.f16359a == null) {
            this.f16359a = new C4403f(view);
        }
        this.f16359a.m19532c();
        this.f16359a.m19530a();
        int i8 = this.f16360b;
        if (i8 != 0) {
            this.f16359a.m19534e(i8);
            this.f16360b = 0;
        }
        int i9 = this.f16361c;
        if (i9 == 0) {
            return true;
        }
        this.f16359a.m19533d(i9);
        this.f16361c = 0;
        return true;
    }

    public AbstractC4402e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16360b = 0;
        this.f16361c = 0;
    }
}
