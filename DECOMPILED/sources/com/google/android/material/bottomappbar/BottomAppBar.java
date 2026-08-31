package com.google.android.material.bottomappbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AbstractC2263x;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.ref.WeakReference;
import p325p3.AbstractC6741b;
import p325p3.AbstractC6742c;
import p325p3.AbstractC6751l;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BottomAppBar extends Toolbar implements CoordinatorLayout.InterfaceC2422b {

    /* JADX INFO: renamed from: i0 */
    private static final int f16424i0 = AbstractC6751l.f26554s;

    /* JADX INFO: renamed from: j0 */
    private static final int f16425j0 = AbstractC6742c.f26224I;

    /* JADX INFO: renamed from: k0 */
    private static final int f16426k0 = AbstractC6742c.f26234S;

    /* JADX INFO: renamed from: T */
    static /* synthetic */ void m19589T(BottomAppBar bottomAppBar) {
        throw null;
    }

    /* JADX INFO: renamed from: U */
    static /* synthetic */ View m19590U(BottomAppBar bottomAppBar) {
        throw null;
    }

    /* JADX INFO: renamed from: W */
    static /* synthetic */ boolean m19592W(BottomAppBar bottomAppBar) {
        throw null;
    }

    /* JADX INFO: renamed from: X */
    static /* synthetic */ void m19593X(BottomAppBar bottomAppBar, FloatingActionButton floatingActionButton) {
        throw null;
    }

    /* JADX INFO: renamed from: Y */
    static /* synthetic */ int m19594Y(BottomAppBar bottomAppBar) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static void m19595Z(BottomAppBar bottomAppBar, View view) {
        ((CoordinatorLayout.C2426f) view.getLayoutParams()).f9258d = 17;
        throw null;
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* JADX INFO: renamed from: A */
        private final Rect f16427A;

        /* JADX INFO: renamed from: B */
        private WeakReference f16428B;

        /* JADX INFO: renamed from: C */
        private int f16429C;

        /* JADX INFO: renamed from: D */
        private final View.OnLayoutChangeListener f16430D;

        /* JADX INFO: renamed from: com.google.android.material.bottomappbar.BottomAppBar$Behavior$a */
        class ViewOnLayoutChangeListenerC4417a implements View.OnLayoutChangeListener {
            ViewOnLayoutChangeListenerC4417a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
                AbstractC2263x.m9328a(Behavior.this.f16428B.get());
                view.removeOnLayoutChangeListener(this);
            }
        }

        public Behavior() {
            this.f16430D = new ViewOnLayoutChangeListenerC4417a();
            this.f16427A = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2423c
        /* JADX INFO: renamed from: E */
        public /* bridge */ /* synthetic */ boolean mo10496E(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i7, int i8) {
            AbstractC2263x.m9328a(view);
            return m19598Y(coordinatorLayout, null, view2, view3, i7, i8);
        }

        /* JADX INFO: renamed from: X */
        public boolean m19597X(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i7) {
            this.f16428B = new WeakReference(bottomAppBar);
            View viewM19590U = BottomAppBar.m19590U(bottomAppBar);
            if (viewM19590U != null && !viewM19590U.isLaidOut()) {
                BottomAppBar.m19595Z(bottomAppBar, viewM19590U);
                this.f16429C = ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C2426f) viewM19590U.getLayoutParams())).bottomMargin;
                if (viewM19590U instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) viewM19590U;
                    if (BottomAppBar.m19594Y(bottomAppBar) == 0 && BottomAppBar.m19592W(bottomAppBar)) {
                        floatingActionButton.setElevation(0.0f);
                        floatingActionButton.setCompatElevation(0.0f);
                    }
                    if (floatingActionButton.getShowMotionSpec() == null) {
                        floatingActionButton.setShowMotionSpecResource(AbstractC6741b.f26213f);
                    }
                    if (floatingActionButton.getHideMotionSpec() == null) {
                        floatingActionButton.setHideMotionSpecResource(AbstractC6741b.f26212e);
                    }
                    BottomAppBar.m19593X(bottomAppBar, floatingActionButton);
                }
                viewM19590U.addOnLayoutChangeListener(this.f16430D);
                BottomAppBar.m19589T(bottomAppBar);
            }
            coordinatorLayout.m10476Q(bottomAppBar, i7);
            return super.mo10511p(coordinatorLayout, bottomAppBar, i7);
        }

        /* JADX INFO: renamed from: Y */
        public boolean m19598Y(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i7, int i8) {
            throw null;
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2423c
        /* JADX INFO: renamed from: p */
        public /* bridge */ /* synthetic */ boolean mo10511p(CoordinatorLayout coordinatorLayout, View view, int i7) {
            AbstractC2263x.m9328a(view);
            return m19597X(coordinatorLayout, null, i7);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f16430D = new ViewOnLayoutChangeListenerC4417a();
            this.f16427A = new Rect();
        }
    }
}
