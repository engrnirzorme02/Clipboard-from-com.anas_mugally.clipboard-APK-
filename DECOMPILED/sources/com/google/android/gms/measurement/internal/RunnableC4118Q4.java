package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.AbstractC3718s;
import java.util.Objects;
import p283k3.InterfaceC6033d;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.Q4 */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4118Q4 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C4006B6 f15378a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ boolean f15379b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C4357v6 f15380c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ C4364w5 f15381d;

    RunnableC4118Q4(C4364w5 c4364w5, C4006B6 c4006b6, boolean z7, C4357v6 c4357v6) {
        this.f15378a = c4006b6;
        this.f15379b = z7;
        this.f15380c = c4357v6;
        Objects.requireNonNull(c4364w5);
        this.f15381d = c4364w5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4364w5 c4364w5 = this.f15381d;
        InterfaceC6033d interfaceC6033dM19215N = c4364w5.m19215N();
        if (interfaceC6033dM19215N == null) {
            c4364w5.f15066a.mo18421a().m18851o().m18834a("Discarding data. Failed to set user property");
            return;
        }
        C4006B6 c4006b6 = this.f15378a;
        AbstractC3718s.m18083l(c4006b6);
        c4364w5.m19224b0(interfaceC6033dM19215N, this.f15379b ? null : this.f15380c, c4006b6);
        c4364w5.m19211J();
    }
}
