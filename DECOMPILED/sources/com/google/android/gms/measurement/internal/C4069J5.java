package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.J5 */
/* JADX INFO: loaded from: classes2.dex */
final class C4069J5 extends AbstractC4366x {

    /* JADX INFO: renamed from: e */
    final /* synthetic */ C4084L5 f15275e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C4069J5(C4084L5 c4084l5, InterfaceC4011C3 interfaceC4011C3) {
        super(interfaceC4011C3);
        Objects.requireNonNull(c4084l5);
        this.f15275e = c4084l5;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4366x
    /* JADX INFO: renamed from: a */
    public final void mo18529a() {
        C4084L5 c4084l5 = this.f15275e;
        C4098N5 c4098n5 = c4084l5.f15303d;
        c4098n5.mo18427h();
        C4164X2 c4164x2 = c4098n5.f15066a;
        c4084l5.m18540d(false, false, c4164x2.mo18425f().mo18161c());
        c4098n5.f15066a.m18671M().m18448k(c4164x2.mo18425f().mo18161c());
    }
}
