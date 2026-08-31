package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import p333q3.AbstractC6827b;
import p333q3.C6832g;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* JADX INFO: renamed from: c */
    private final C6832g f18224c;

    /* JADX INFO: renamed from: d */
    private final C6832g f18225d;

    /* JADX INFO: renamed from: com.google.android.material.transformation.FabTransformationScrimBehavior$a */
    class C4680a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ boolean f18226a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ View f18227b;

        C4680a(boolean z7, View view) {
            this.f18226a = z7;
            this.f18227b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f18226a) {
                return;
            }
            this.f18227b.setVisibility(4);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f18226a) {
                this.f18227b.setVisibility(0);
            }
        }
    }

    public FabTransformationScrimBehavior() {
        this.f18224c = new C6832g(75L, 150L);
        this.f18225d = new C6832g(0L, 150L);
    }

    /* JADX INFO: renamed from: O */
    private void m21821O(View view, boolean z7, boolean z8, List list, List list2) {
        ObjectAnimator objectAnimatorOfFloat;
        C6832g c6832g = z7 ? this.f18224c : this.f18225d;
        if (z7) {
            if (!z8) {
                view.setAlpha(0.0f);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f);
        }
        c6832g.m29864a(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2423c
    /* JADX INFO: renamed from: H */
    public boolean mo10499H(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return super.mo10499H(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /* JADX INFO: renamed from: N */
    protected AnimatorSet mo21803N(View view, View view2, boolean z7, boolean z8) {
        ArrayList arrayList = new ArrayList();
        m21821O(view2, z7, z8, arrayList, new ArrayList());
        AnimatorSet animatorSet = new AnimatorSet();
        AbstractC6827b.m29846a(animatorSet, arrayList);
        animatorSet.addListener(new C4680a(z7, view2));
        return animatorSet;
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2423c
    /* JADX INFO: renamed from: i */
    public boolean mo10504i(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18224c = new C6832g(75L, 150L);
        this.f18225d = new C6832g(0L, 150L);
    }
}
