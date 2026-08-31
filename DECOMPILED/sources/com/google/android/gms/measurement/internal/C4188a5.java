package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.a5 */
/* JADX INFO: loaded from: classes2.dex */
final class C4188a5 extends AbstractC4366x {

    /* JADX INFO: renamed from: e */
    final /* synthetic */ C4364w5 f15550e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C4188a5(C4364w5 c4364w5, InterfaceC4011C3 interfaceC4011C3) {
        super(interfaceC4011C3);
        Objects.requireNonNull(c4364w5);
        this.f15550e = c4364w5;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4366x
    /* JADX INFO: renamed from: a */
    public final void mo18529a() {
        this.f15550e.f15066a.mo18421a().m18854r().m18834a("Tasks have been queued for a long time");
    }
}
