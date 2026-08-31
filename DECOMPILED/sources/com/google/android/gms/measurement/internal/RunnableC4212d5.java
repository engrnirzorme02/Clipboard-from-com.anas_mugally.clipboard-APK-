package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.AbstractC3718s;
import java.util.Objects;
import p283k3.InterfaceC6033d;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.d5 */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4212d5 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C4006B6 f15716a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ boolean f15717b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C4039G f15718c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ C4364w5 f15719d;

    RunnableC4212d5(C4364w5 c4364w5, boolean z7, C4006B6 c4006b6, boolean z8, C4039G c4039g, String str) {
        this.f15716a = c4006b6;
        this.f15717b = z8;
        this.f15718c = c4039g;
        Objects.requireNonNull(c4364w5);
        this.f15719d = c4364w5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4364w5 c4364w5 = this.f15719d;
        InterfaceC6033d interfaceC6033dM19215N = c4364w5.m19215N();
        if (interfaceC6033dM19215N == null) {
            c4364w5.f15066a.mo18421a().m18851o().m18834a("Discarding data. Failed to send event to service");
            return;
        }
        C4006B6 c4006b6 = this.f15716a;
        AbstractC3718s.m18083l(c4006b6);
        c4364w5.m19224b0(interfaceC6033dM19215N, this.f15717b ? null : this.f15718c, c4006b6);
        c4364w5.m19211J();
    }
}
