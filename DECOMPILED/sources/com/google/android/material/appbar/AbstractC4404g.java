package com.google.android.material.appbar;

import android.R;
import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.internal.AbstractC4543s;
import p325p3.AbstractC6742c;
import p325p3.AbstractC6747h;

/* JADX INFO: renamed from: com.google.android.material.appbar.g */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC4404g {

    /* JADX INFO: renamed from: a */
    private static final int[] f16369a = {R.attr.stateListAnimator};

    /* JADX INFO: renamed from: a */
    static void m19535a(View view) {
        view.setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }

    /* JADX INFO: renamed from: b */
    static void m19536b(View view, float f7) {
        int integer = view.getResources().getInteger(AbstractC6747h.f26444a);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j7 = integer;
        stateListAnimator.addState(new int[]{R.attr.state_enabled, AbstractC6742c.f26261j0, -AbstractC6742c.f26263k0}, ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(j7));
        stateListAnimator.addState(new int[]{R.attr.state_enabled}, ObjectAnimator.ofFloat(view, "elevation", f7).setDuration(j7));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }

    /* JADX INFO: renamed from: c */
    static void m19537c(View view, AttributeSet attributeSet, int i7, int i8) {
        Context context = view.getContext();
        TypedArray typedArrayM20818i = AbstractC4543s.m20818i(context, attributeSet, f16369a, i7, i8, new int[0]);
        try {
            if (typedArrayM20818i.hasValue(0)) {
                view.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, typedArrayM20818i.getResourceId(0, 0)));
            }
        } finally {
            typedArrayM20818i.recycle();
        }
    }
}
