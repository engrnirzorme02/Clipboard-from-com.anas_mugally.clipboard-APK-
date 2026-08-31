package com.google.android.material.behavior;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: com.google.android.material.behavior.c */
/* JADX INFO: loaded from: classes2.dex */
final class C4415c extends AbstractC4416d {
    C4415c() {
    }

    @Override // com.google.android.material.behavior.AbstractC4416d
    /* JADX INFO: renamed from: a */
    int mo19584a(View view, ViewGroup.MarginLayoutParams marginLayoutParams) {
        return view.getMeasuredWidth() + marginLayoutParams.rightMargin;
    }

    @Override // com.google.android.material.behavior.AbstractC4416d
    /* JADX INFO: renamed from: b */
    int mo19585b() {
        return 0;
    }

    @Override // com.google.android.material.behavior.AbstractC4416d
    /* JADX INFO: renamed from: c */
    int mo19586c() {
        return 0;
    }

    @Override // com.google.android.material.behavior.AbstractC4416d
    /* JADX INFO: renamed from: d */
    ViewPropertyAnimator mo19587d(View view, int i7) {
        return view.animate().translationX(i7);
    }

    @Override // com.google.android.material.behavior.AbstractC4416d
    /* JADX INFO: renamed from: e */
    void mo19588e(View view, int i7) {
        view.setTranslationX(i7);
    }
}
