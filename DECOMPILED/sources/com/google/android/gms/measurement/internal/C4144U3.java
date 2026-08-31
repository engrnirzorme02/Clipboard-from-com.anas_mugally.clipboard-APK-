package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.U3 */
/* JADX INFO: loaded from: classes2.dex */
final class C4144U3 extends AbstractC4366x {

    /* JADX INFO: renamed from: e */
    final /* synthetic */ C4371x4 f15442e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C4144U3(C4371x4 c4371x4, InterfaceC4011C3 interfaceC4011C3) {
        super(interfaceC4011C3);
        Objects.requireNonNull(c4371x4);
        this.f15442e = c4371x4;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4366x
    /* JADX INFO: renamed from: a */
    public final void mo18529a() {
        C4371x4 c4371x4 = this.f15442e;
        if (c4371x4.f15066a.m18682n()) {
            c4371x4.m19284c0().m19249b(2000L);
        }
    }
}
