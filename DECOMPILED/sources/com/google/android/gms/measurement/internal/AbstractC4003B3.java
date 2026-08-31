package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.B3 */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC4003B3 extends AbstractC3995A3 {

    /* JADX INFO: renamed from: b */
    private boolean f15093b;

    AbstractC4003B3(C4164X2 c4164x2) {
        super(c4164x2);
        this.f15066a.m18679k();
    }

    /* JADX INFO: renamed from: i */
    protected abstract boolean mo18416i();

    /* JADX INFO: renamed from: j */
    protected void mo18435j() {
    }

    /* JADX INFO: renamed from: k */
    final boolean m18436k() {
        return this.f15093b;
    }

    /* JADX INFO: renamed from: l */
    protected final void m18437l() {
        if (!m18436k()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m18438m() {
        if (this.f15093b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (mo18416i()) {
            return;
        }
        this.f15066a.m18680l();
        this.f15093b = true;
    }

    /* JADX INFO: renamed from: n */
    public final void m18439n() {
        if (this.f15093b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        mo18435j();
        this.f15066a.m18680l();
        this.f15093b = true;
    }
}
