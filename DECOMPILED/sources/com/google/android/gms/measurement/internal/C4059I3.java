package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.I3 */
/* JADX INFO: loaded from: classes2.dex */
final class C4059I3 extends AbstractC4366x {

    /* JADX INFO: renamed from: e */
    final /* synthetic */ C4371x4 f15254e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C4059I3(C4371x4 c4371x4, InterfaceC4011C3 interfaceC4011C3) {
        super(interfaceC4011C3);
        Objects.requireNonNull(c4371x4);
        this.f15254e = c4371x4;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4366x
    /* JADX INFO: renamed from: a */
    public final void mo18529a() {
        final C4371x4 c4371x4M18660B = this.f15254e.f15066a.m18660B();
        Objects.requireNonNull(c4371x4M18660B);
        new Thread(new Runnable() { // from class: com.google.android.gms.measurement.internal.H3
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                c4371x4M18660B.m19306u0();
            }
        }).start();
    }
}
