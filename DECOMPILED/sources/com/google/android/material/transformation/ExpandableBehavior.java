package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
import p013B3.InterfaceC0084a;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public abstract class ExpandableBehavior extends CoordinatorLayout.AbstractC2423c {

    /* JADX INFO: renamed from: a */
    private int f18205a;

    /* JADX INFO: renamed from: com.google.android.material.transformation.ExpandableBehavior$a */
    class ViewTreeObserverOnPreDrawListenerC4676a implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ View f18206a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f18207b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ InterfaceC0084a f18208c;

        ViewTreeObserverOnPreDrawListenerC4676a(View view, int i7, InterfaceC0084a interfaceC0084a) {
            this.f18206a = view;
            this.f18207b = i7;
            this.f18208c = interfaceC0084a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f18206a.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.f18205a == this.f18207b) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                InterfaceC0084a interfaceC0084a = this.f18208c;
                expandableBehavior.mo21801L((View) interfaceC0084a, this.f18206a, interfaceC0084a.mo291a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.f18205a = 0;
    }

    /* JADX INFO: renamed from: J */
    private boolean m21799J(boolean z7) {
        if (!z7) {
            return this.f18205a == 1;
        }
        int i7 = this.f18205a;
        return i7 == 0 || i7 == 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K */
    protected InterfaceC0084a m21800K(CoordinatorLayout coordinatorLayout, View view) {
        List listM10488v = coordinatorLayout.m10488v(view);
        int size = listM10488v.size();
        for (int i7 = 0; i7 < size; i7++) {
            View view2 = (View) listM10488v.get(i7);
            if (mo10504i(coordinatorLayout, view, view2)) {
                return (InterfaceC0084a) view2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: L */
    protected abstract boolean mo21801L(View view, View view2, boolean z7, boolean z8);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2423c
    /* JADX INFO: renamed from: i */
    public abstract boolean mo10504i(CoordinatorLayout coordinatorLayout, View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2423c
    /* JADX INFO: renamed from: l */
    public boolean mo10507l(CoordinatorLayout coordinatorLayout, View view, View view2) {
        InterfaceC0084a interfaceC0084a = (InterfaceC0084a) view2;
        if (!m21799J(interfaceC0084a.mo291a())) {
            return false;
        }
        this.f18205a = interfaceC0084a.mo291a() ? 1 : 2;
        return mo21801L((View) interfaceC0084a, view, interfaceC0084a.mo291a(), true);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2423c
    /* JADX INFO: renamed from: p */
    public boolean mo10511p(CoordinatorLayout coordinatorLayout, View view, int i7) {
        InterfaceC0084a interfaceC0084aM21800K;
        if (view.isLaidOut() || (interfaceC0084aM21800K = m21800K(coordinatorLayout, view)) == null || !m21799J(interfaceC0084aM21800K.mo291a())) {
            return false;
        }
        int i8 = interfaceC0084aM21800K.mo291a() ? 1 : 2;
        this.f18205a = i8;
        view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC4676a(view, i8, interfaceC0084aM21800K));
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18205a = 0;
    }
}
