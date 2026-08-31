package com.google.android.material.sidesheet;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: renamed from: com.google.android.material.sidesheet.a */
/* JADX INFO: loaded from: classes2.dex */
final class C4573a extends AbstractC4575c {

    /* JADX INFO: renamed from: a */
    final SideSheetBehavior f17601a;

    C4573a(SideSheetBehavior sideSheetBehavior) {
        this.f17601a = sideSheetBehavior;
    }

    @Override // com.google.android.material.sidesheet.AbstractC4575c
    /* JADX INFO: renamed from: a */
    int mo21069a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // com.google.android.material.sidesheet.AbstractC4575c
    /* JADX INFO: renamed from: b */
    float mo21070b(int i7) {
        float fMo21073e = mo21073e();
        return (i7 - fMo21073e) / (mo21072d() - fMo21073e);
    }

    @Override // com.google.android.material.sidesheet.AbstractC4575c
    /* JADX INFO: renamed from: c */
    int mo21071c(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // com.google.android.material.sidesheet.AbstractC4575c
    /* JADX INFO: renamed from: d */
    int mo21072d() {
        return Math.max(0, this.f17601a.m21060m0() + this.f17601a.m21058k0());
    }

    @Override // com.google.android.material.sidesheet.AbstractC4575c
    /* JADX INFO: renamed from: e */
    int mo21073e() {
        return (-this.f17601a.m21053d0()) - this.f17601a.m21058k0();
    }

    @Override // com.google.android.material.sidesheet.AbstractC4575c
    /* JADX INFO: renamed from: f */
    int mo21074f() {
        return this.f17601a.m21058k0();
    }

    @Override // com.google.android.material.sidesheet.AbstractC4575c
    /* JADX INFO: renamed from: g */
    int mo21075g() {
        return -this.f17601a.m21053d0();
    }

    @Override // com.google.android.material.sidesheet.AbstractC4575c
    /* JADX INFO: renamed from: h */
    int mo21076h(View view) {
        return view.getRight() + this.f17601a.m21058k0();
    }

    @Override // com.google.android.material.sidesheet.AbstractC4575c
    /* JADX INFO: renamed from: i */
    public int mo21077i(CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getLeft();
    }

    @Override // com.google.android.material.sidesheet.AbstractC4575c
    /* JADX INFO: renamed from: j */
    int mo21078j() {
        return 1;
    }

    @Override // com.google.android.material.sidesheet.AbstractC4575c
    /* JADX INFO: renamed from: k */
    boolean mo21079k(float f7) {
        return f7 > 0.0f;
    }

    @Override // com.google.android.material.sidesheet.AbstractC4575c
    /* JADX INFO: renamed from: l */
    boolean mo21080l(View view) {
        return view.getRight() < (mo21072d() - mo21073e()) / 2;
    }

    @Override // com.google.android.material.sidesheet.AbstractC4575c
    /* JADX INFO: renamed from: m */
    boolean mo21081m(float f7, float f8) {
        return AbstractC4576d.m21085a(f7, f8) && Math.abs(f7) > ((float) this.f17601a.m21062o0());
    }

    @Override // com.google.android.material.sidesheet.AbstractC4575c
    /* JADX INFO: renamed from: n */
    boolean mo21082n(View view, float f7) {
        return Math.abs(((float) view.getLeft()) + (f7 * this.f17601a.m21056i0())) > this.f17601a.m21057j0();
    }

    @Override // com.google.android.material.sidesheet.AbstractC4575c
    /* JADX INFO: renamed from: o */
    void mo21083o(ViewGroup.MarginLayoutParams marginLayoutParams, int i7) {
        marginLayoutParams.leftMargin = i7;
    }

    @Override // com.google.android.material.sidesheet.AbstractC4575c
    /* JADX INFO: renamed from: p */
    void mo21084p(ViewGroup.MarginLayoutParams marginLayoutParams, int i7, int i8) {
        if (i7 <= this.f17601a.m21061n0()) {
            marginLayoutParams.leftMargin = i8;
        }
    }
}
