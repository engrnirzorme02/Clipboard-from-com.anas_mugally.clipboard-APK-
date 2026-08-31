package androidx.recyclerview.widget;

import android.graphics.Canvas;
import android.view.View;
import p111O.AbstractC1030Z;
import p386x0.AbstractC7381c;

/* JADX INFO: renamed from: androidx.recyclerview.widget.h */
/* JADX INFO: loaded from: classes.dex */
class C2789h implements InterfaceC2788g {

    /* JADX INFO: renamed from: a */
    static final InterfaceC2788g f11214a = new C2789h();

    C2789h() {
    }

    /* JADX INFO: renamed from: e */
    private static float m13821e(RecyclerView recyclerView, View view) {
        int childCount = recyclerView.getChildCount();
        float f7 = 0.0f;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = recyclerView.getChildAt(i7);
            if (childAt != view) {
                float fM4495u = AbstractC1030Z.m4495u(childAt);
                if (fM4495u > f7) {
                    f7 = fM4495u;
                }
            }
        }
        return f7;
    }

    @Override // androidx.recyclerview.widget.InterfaceC2788g
    /* JADX INFO: renamed from: a */
    public void mo13817a(View view) {
        int i7 = AbstractC7381c.f29588a;
        Object tag = view.getTag(i7);
        if (tag instanceof Float) {
            AbstractC1030Z.m4486p0(view, ((Float) tag).floatValue());
        }
        view.setTag(i7, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    @Override // androidx.recyclerview.widget.InterfaceC2788g
    /* JADX INFO: renamed from: b */
    public void mo13818b(View view) {
    }

    @Override // androidx.recyclerview.widget.InterfaceC2788g
    /* JADX INFO: renamed from: c */
    public void mo13819c(Canvas canvas, RecyclerView recyclerView, View view, float f7, float f8, int i7, boolean z7) {
    }

    @Override // androidx.recyclerview.widget.InterfaceC2788g
    /* JADX INFO: renamed from: d */
    public void mo13820d(Canvas canvas, RecyclerView recyclerView, View view, float f7, float f8, int i7, boolean z7) {
        if (z7) {
            int i8 = AbstractC7381c.f29588a;
            if (view.getTag(i8) == null) {
                Float fValueOf = Float.valueOf(AbstractC1030Z.m4495u(view));
                AbstractC1030Z.m4486p0(view, m13821e(recyclerView, view) + 1.0f);
                view.setTag(i8, fValueOf);
            }
        }
        view.setTranslationX(f7);
        view.setTranslationY(f8);
    }
}
