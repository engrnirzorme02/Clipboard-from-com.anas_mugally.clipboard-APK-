package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.W4 */
/* JADX INFO: loaded from: classes2.dex */
final class C4159W4 extends AbstractC4366x {

    /* JADX INFO: renamed from: e */
    final /* synthetic */ C4364w5 f15464e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C4159W4(C4364w5 c4364w5, InterfaceC4011C3 interfaceC4011C3) {
        super(interfaceC4011C3);
        Objects.requireNonNull(c4364w5);
        this.f15464e = c4364w5;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4366x
    /* JADX INFO: renamed from: a */
    public final void mo18529a() {
        C4364w5 c4364w5 = this.f15464e;
        c4364w5.mo18427h();
        if (c4364w5.m19219W()) {
            c4364w5.f15066a.mo18421a().m18859w().m18834a("Inactivity, disconnecting from the service");
            c4364w5.m19202A();
        }
    }
}
