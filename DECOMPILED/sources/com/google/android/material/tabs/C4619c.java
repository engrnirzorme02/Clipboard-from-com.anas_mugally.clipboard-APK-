package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.internal.AbstractC4546v;
import p333q3.AbstractC6826a;

/* JADX INFO: renamed from: com.google.android.material.tabs.c */
/* JADX INFO: loaded from: classes2.dex */
class C4619c {
    C4619c() {
    }

    /* JADX INFO: renamed from: a */
    static RectF m21407a(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        return (tabLayout.m21332B() || !(view instanceof TabLayout.C4615i)) ? new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()) : m21408b((TabLayout.C4615i) view, 24);
    }

    /* JADX INFO: renamed from: b */
    static RectF m21408b(TabLayout.C4615i c4615i, int i7) {
        int contentWidth = c4615i.getContentWidth();
        int contentHeight = c4615i.getContentHeight();
        int iM20828c = (int) AbstractC4546v.m20828c(c4615i.getContext(), i7);
        if (contentWidth < iM20828c) {
            contentWidth = iM20828c;
        }
        int left = (c4615i.getLeft() + c4615i.getRight()) / 2;
        int top = (c4615i.getTop() + c4615i.getBottom()) / 2;
        int i8 = contentWidth / 2;
        return new RectF(left - i8, top - (contentHeight / 2), i8 + left, top + (left / 2));
    }

    /* JADX INFO: renamed from: c */
    void m21409c(TabLayout tabLayout, View view, Drawable drawable) {
        RectF rectFM21407a = m21407a(tabLayout, view);
        drawable.setBounds((int) rectFM21407a.left, drawable.getBounds().top, (int) rectFM21407a.right, drawable.getBounds().bottom);
    }

    /* JADX INFO: renamed from: d */
    void mo21406d(TabLayout tabLayout, View view, View view2, float f7, Drawable drawable) {
        RectF rectFM21407a = m21407a(tabLayout, view);
        RectF rectFM21407a2 = m21407a(tabLayout, view2);
        drawable.setBounds(AbstractC6826a.m29845c((int) rectFM21407a.left, (int) rectFM21407a2.left, f7), drawable.getBounds().top, AbstractC6826a.m29845c((int) rectFM21407a.right, (int) rectFM21407a2.right, f7), drawable.getBounds().bottom);
    }
}
