package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* JADX INFO: renamed from: b */
    private AnimatorSet f18210b;

    /* JADX INFO: renamed from: com.google.android.material.transformation.ExpandableTransformationBehavior$a */
    class C4677a extends AnimatorListenerAdapter {
        C4677a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ExpandableTransformationBehavior.this.f18210b = null;
        }
    }

    public ExpandableTransformationBehavior() {
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior
    /* JADX INFO: renamed from: L */
    protected boolean mo21801L(View view, View view2, boolean z7, boolean z8) {
        AnimatorSet animatorSet = this.f18210b;
        boolean z9 = animatorSet != null;
        if (z9) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSetMo21803N = mo21803N(view, view2, z7, z9);
        this.f18210b = animatorSetMo21803N;
        animatorSetMo21803N.addListener(new C4677a());
        this.f18210b.start();
        if (!z8) {
            this.f18210b.end();
        }
        return true;
    }

    /* JADX INFO: renamed from: N */
    protected abstract AnimatorSet mo21803N(View view, View view2, boolean z7, boolean z8);

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
