package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.f2 */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC4225f2 extends AbstractC4025E1 {

    /* JADX INFO: renamed from: b */
    private boolean f15741b;

    AbstractC4225f2(C4164X2 c4164x2) {
        super(c4164x2);
        this.f15066a.m18679k();
    }

    /* JADX INFO: renamed from: i */
    final boolean m18747i() {
        return this.f15741b;
    }

    /* JADX INFO: renamed from: j */
    protected final void m18748j() {
        if (!m18747i()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m18749k() {
        if (this.f15741b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (mo18463m()) {
            return;
        }
        this.f15066a.m18680l();
        this.f15741b = true;
    }

    /* JADX INFO: renamed from: l */
    public final void m18750l() {
        if (this.f15741b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        mo18464n();
        this.f15066a.m18680l();
        this.f15741b = true;
    }

    /* JADX INFO: renamed from: m */
    protected abstract boolean mo18463m();

    /* JADX INFO: renamed from: n */
    protected void mo18464n() {
    }
}
