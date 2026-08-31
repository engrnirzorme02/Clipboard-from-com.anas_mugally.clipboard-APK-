package com.google.android.material.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* JADX INFO: loaded from: classes2.dex */
public class SearchBar$ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {

    /* JADX INFO: renamed from: s */
    private boolean f17566s;

    public SearchBar$ScrollingViewBehavior() {
        this.f17566s = false;
    }

    /* JADX INFO: renamed from: Y */
    private void m21002Y(AppBarLayout appBarLayout) {
        appBarLayout.setBackgroundColor(0);
        appBarLayout.setTargetElevation(0.0f);
    }

    @Override // com.google.android.material.appbar.AbstractC4401d
    /* JADX INFO: renamed from: T */
    protected boolean mo19529T() {
        return true;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2423c
    /* JADX INFO: renamed from: l */
    public boolean mo10507l(CoordinatorLayout coordinatorLayout, View view, View view2) {
        boolean zMo10507l = super.mo10507l(coordinatorLayout, view, view2);
        if (!this.f17566s && (view2 instanceof AppBarLayout)) {
            this.f17566s = true;
            m21002Y((AppBarLayout) view2);
        }
        return zMo10507l;
    }

    public SearchBar$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17566s = false;
    }
}
