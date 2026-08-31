package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.L5 */
/* JADX INFO: loaded from: classes2.dex */
final class C4084L5 {

    /* JADX INFO: renamed from: a */
    protected long f15300a;

    /* JADX INFO: renamed from: b */
    protected long f15301b;

    /* JADX INFO: renamed from: c */
    private final AbstractC4366x f15302c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ C4098N5 f15303d;

    public C4084L5(C4098N5 c4098n5) {
        Objects.requireNonNull(c4098n5);
        this.f15303d = c4098n5;
        this.f15302c = new C4069J5(this, c4098n5.f15066a);
        long jMo18161c = c4098n5.f15066a.mo18425f().mo18161c();
        this.f15300a = jMo18161c;
        this.f15301b = jMo18161c;
    }

    /* JADX INFO: renamed from: a */
    final void m18537a(long j7) {
        this.f15303d.mo18427h();
        this.f15302c.m19251d();
        this.f15300a = j7;
        this.f15301b = j7;
    }

    /* JADX INFO: renamed from: b */
    final void m18538b(long j7) {
        this.f15302c.m19251d();
    }

    /* JADX INFO: renamed from: c */
    final void m18539c() {
        this.f15302c.m19251d();
        long jMo18161c = this.f15303d.f15066a.mo18425f().mo18161c();
        this.f15300a = jMo18161c;
        this.f15301b = jMo18161c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m18540d(boolean z7, boolean z8, long j7) {
        C4098N5 c4098n5 = this.f15303d;
        c4098n5.mo18427h();
        c4098n5.m18748j();
        if (c4098n5.f15066a.m18675g()) {
            C4164X2 c4164x2 = c4098n5.f15066a;
            c4164x2.m18687x().f15183q.m18434b(c4164x2.mo18425f().mo18159a());
        }
        long j8 = j7 - this.f15300a;
        if (!z7 && j8 < 1000) {
            c4098n5.f15066a.mo18421a().m18859w().m18835b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j8));
            return false;
        }
        if (!z8) {
            j8 = j7 - this.f15301b;
            this.f15301b = j7;
        }
        C4164X2 c4164x3 = c4098n5.f15066a;
        c4164x3.mo18421a().m18859w().m18835b("Recording user engagement, ms", Long.valueOf(j8));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j8);
        boolean z9 = !c4164x3.m18686w().m18806N();
        C4164X2 c4164x4 = c4098n5.f15066a;
        C4389z6.m19362k0(c4164x4.m18667I().m18550q(z9), bundle, true);
        if (!z8) {
            c4164x4.m18660B().m19303t("auto", "_e", bundle);
        }
        this.f15300a = j7;
        AbstractC4366x abstractC4366x = this.f15302c;
        abstractC4366x.m19251d();
        abstractC4366x.m19249b(((Long) AbstractC4209d2.f15695r0.m18706b(null)).longValue());
        return true;
    }
}
