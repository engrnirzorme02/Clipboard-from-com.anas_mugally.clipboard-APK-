package com.google.android.material.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.app.AbstractC2263x;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p029D3.InterfaceC0190b;

/* JADX INFO: loaded from: classes2.dex */
public abstract class SearchView extends FrameLayout implements CoordinatorLayout.InterfaceC2422b, InterfaceC0190b {

    public static class Behavior extends CoordinatorLayout.AbstractC2423c {
        public Behavior() {
        }

        /* JADX INFO: renamed from: I */
        public boolean m21003I(CoordinatorLayout coordinatorLayout, SearchView searchView, View view) {
            throw null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2423c
        /* JADX INFO: renamed from: l */
        public /* bridge */ /* synthetic */ boolean mo10507l(CoordinatorLayout coordinatorLayout, View view, View view2) {
            AbstractC2263x.m9328a(view);
            return m21003I(coordinatorLayout, null, view2);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }
}
