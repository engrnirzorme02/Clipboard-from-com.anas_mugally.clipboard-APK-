package com.google.android.material.appbar;

import android.view.View;
import p111O.AbstractC1030Z;

/* JADX INFO: renamed from: com.google.android.material.appbar.f */
/* JADX INFO: loaded from: classes2.dex */
class C4403f {

    /* JADX INFO: renamed from: a */
    private final View f16362a;

    /* JADX INFO: renamed from: b */
    private int f16363b;

    /* JADX INFO: renamed from: c */
    private int f16364c;

    /* JADX INFO: renamed from: d */
    private int f16365d;

    /* JADX INFO: renamed from: e */
    private int f16366e;

    /* JADX INFO: renamed from: f */
    private boolean f16367f = true;

    /* JADX INFO: renamed from: g */
    private boolean f16368g = true;

    public C4403f(View view) {
        this.f16362a = view;
    }

    /* JADX INFO: renamed from: a */
    void m19530a() {
        View view = this.f16362a;
        AbstractC1030Z.m4449U(view, this.f16365d - (view.getTop() - this.f16363b));
        View view2 = this.f16362a;
        AbstractC1030Z.m4448T(view2, this.f16366e - (view2.getLeft() - this.f16364c));
    }

    /* JADX INFO: renamed from: b */
    public int m19531b() {
        return this.f16365d;
    }

    /* JADX INFO: renamed from: c */
    void m19532c() {
        this.f16363b = this.f16362a.getTop();
        this.f16364c = this.f16362a.getLeft();
    }

    /* JADX INFO: renamed from: d */
    public boolean m19533d(int i7) {
        if (!this.f16368g || this.f16366e == i7) {
            return false;
        }
        this.f16366e = i7;
        m19530a();
        return true;
    }

    /* JADX INFO: renamed from: e */
    public boolean m19534e(int i7) {
        if (!this.f16367f || this.f16365d == i7) {
            return false;
        }
        this.f16365d = i7;
        m19530a();
        return true;
    }
}
