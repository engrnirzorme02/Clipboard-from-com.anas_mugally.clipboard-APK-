package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import p333q3.AbstractC6826a;

/* JADX INFO: renamed from: com.google.android.material.tabs.a */
/* JADX INFO: loaded from: classes2.dex */
class C4617a extends C4619c {
    C4617a() {
    }

    /* JADX INFO: renamed from: e */
    private static float m21404e(float f7) {
        return (float) (1.0d - Math.cos((((double) f7) * 3.141592653589793d) / 2.0d));
    }

    /* JADX INFO: renamed from: f */
    private static float m21405f(float f7) {
        return (float) Math.sin((((double) f7) * 3.141592653589793d) / 2.0d);
    }

    @Override // com.google.android.material.tabs.C4619c
    /* JADX INFO: renamed from: d */
    void mo21406d(TabLayout tabLayout, View view, View view2, float f7, Drawable drawable) {
        float fM21405f;
        float fM21404e;
        RectF rectFM21407a = C4619c.m21407a(tabLayout, view);
        RectF rectFM21407a2 = C4619c.m21407a(tabLayout, view2);
        if (rectFM21407a.left < rectFM21407a2.left) {
            fM21405f = m21404e(f7);
            fM21404e = m21405f(f7);
        } else {
            fM21405f = m21405f(f7);
            fM21404e = m21404e(f7);
        }
        drawable.setBounds(AbstractC6826a.m29845c((int) rectFM21407a.left, (int) rectFM21407a2.left, fM21405f), drawable.getBounds().top, AbstractC6826a.m29845c((int) rectFM21407a.right, (int) rectFM21407a2.right, fM21404e), drawable.getBounds().bottom);
    }
}
