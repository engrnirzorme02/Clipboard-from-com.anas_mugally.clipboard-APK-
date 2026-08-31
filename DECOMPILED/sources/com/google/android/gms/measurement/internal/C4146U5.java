package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.U5 */
/* JADX INFO: loaded from: classes2.dex */
final class C4146U5 extends AbstractC4366x {

    /* JADX INFO: renamed from: e */
    final /* synthetic */ C4153V5 f15445e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C4146U5(C4153V5 c4153v5, InterfaceC4011C3 interfaceC4011C3) {
        super(interfaceC4011C3);
        Objects.requireNonNull(c4153v5);
        this.f15445e = c4153v5;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4366x
    /* JADX INFO: renamed from: a */
    public final void mo18529a() {
        C4153V5 c4153v5 = this.f15445e;
        c4153v5.m18651n();
        c4153v5.f15066a.mo18421a().m18859w().m18834a("Starting upload from DelayedRunnable");
        c4153v5.f15465b.m18942r();
    }
}
