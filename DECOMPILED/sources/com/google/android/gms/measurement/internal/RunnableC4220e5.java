package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.AbstractC3718s;
import java.util.Objects;
import p283k3.InterfaceC6033d;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.e5 */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4220e5 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C4006B6 f15733a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ boolean f15734b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C4246i f15735c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ C4364w5 f15736d;

    RunnableC4220e5(C4364w5 c4364w5, boolean z7, C4006B6 c4006b6, boolean z8, C4246i c4246i, C4246i c4246i2) {
        this.f15733a = c4006b6;
        this.f15734b = z8;
        this.f15735c = c4246i;
        Objects.requireNonNull(c4364w5);
        this.f15736d = c4364w5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4364w5 c4364w5 = this.f15736d;
        InterfaceC6033d interfaceC6033dM19215N = c4364w5.m19215N();
        if (interfaceC6033dM19215N == null) {
            c4364w5.f15066a.mo18421a().m18851o().m18834a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        C4006B6 c4006b6 = this.f15733a;
        AbstractC3718s.m18083l(c4006b6);
        c4364w5.m19224b0(interfaceC6033dM19215N, this.f15734b ? null : this.f15735c, c4006b6);
        c4364w5.m19211J();
    }
}
