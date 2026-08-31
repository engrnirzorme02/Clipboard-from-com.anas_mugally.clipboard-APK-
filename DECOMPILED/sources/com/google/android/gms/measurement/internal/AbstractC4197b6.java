package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.b6 */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC4197b6 extends AbstractC4160W5 {

    /* JADX INFO: renamed from: c */
    private boolean f15565c;

    AbstractC4197b6(C4317q6 c4317q6) {
        super(c4317q6);
        this.f15465b.m18918e0();
    }

    /* JADX INFO: renamed from: i */
    final boolean m18695i() {
        return this.f15565c;
    }

    /* JADX INFO: renamed from: j */
    protected final void m18696j() {
        if (!m18695i()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m18697k() {
        if (this.f15565c) {
            throw new IllegalStateException("Can't initialize twice");
        }
        mo18457l();
        this.f15465b.m18919f0();
        this.f15565c = true;
    }

    /* JADX INFO: renamed from: l */
    protected abstract boolean mo18457l();
}
