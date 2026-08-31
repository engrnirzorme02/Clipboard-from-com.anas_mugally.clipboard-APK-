package com.google.android.material.navigation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;
import p033E.AbstractC0246a;
import p333q3.AbstractC6826a;

/* JADX INFO: renamed from: com.google.android.material.navigation.b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4555b {

    /* JADX INFO: renamed from: a */
    private static final int f17429a = Color.alpha(-1728053248);

    /* JADX INFO: renamed from: com.google.android.material.navigation.b$a */
    class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ DrawerLayout f17430a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ View f17431b;

        a(DrawerLayout drawerLayout, View view) {
            this.f17430a = drawerLayout;
            this.f17431b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f17430a.m11693e(this.f17431b, false);
            this.f17430a.setScrimColor(-1728053248);
        }
    }

    /* JADX INFO: renamed from: b */
    public static Animator.AnimatorListener m20871b(DrawerLayout drawerLayout, View view) {
        return new a(drawerLayout, view);
    }

    /* JADX INFO: renamed from: c */
    public static ValueAnimator.AnimatorUpdateListener m20872c(final DrawerLayout drawerLayout) {
        return new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.navigation.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                drawerLayout.setScrimColor(AbstractC0246a.m1182k(-1728053248, AbstractC6826a.m29845c(AbstractC4555b.f17429a, 0, valueAnimator.getAnimatedFraction())));
            }
        };
    }
}
