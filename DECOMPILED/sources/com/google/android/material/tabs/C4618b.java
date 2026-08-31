package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import p333q3.AbstractC6826a;

/* JADX INFO: renamed from: com.google.android.material.tabs.b */
/* JADX INFO: loaded from: classes2.dex */
class C4618b extends C4619c {
    C4618b() {
    }

    @Override // com.google.android.material.tabs.C4619c
    /* JADX INFO: renamed from: d */
    void mo21406d(TabLayout tabLayout, View view, View view2, float f7, Drawable drawable) {
        if (f7 >= 0.5f) {
            view = view2;
        }
        RectF rectFM21407a = C4619c.m21407a(tabLayout, view);
        float fM29844b = f7 < 0.5f ? AbstractC6826a.m29844b(1.0f, 0.0f, 0.0f, 0.5f, f7) : AbstractC6826a.m29844b(0.0f, 1.0f, 0.5f, 1.0f, f7);
        drawable.setBounds((int) rectFM21407a.left, drawable.getBounds().top, (int) rectFM21407a.right, drawable.getBounds().bottom);
        drawable.setAlpha((int) (fM29844b * 255.0f));
    }
}
