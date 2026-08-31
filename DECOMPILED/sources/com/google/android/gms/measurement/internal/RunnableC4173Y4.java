package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.AbstractC3718s;
import java.util.Objects;
import p283k3.InterfaceC6033d;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.Y4 */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4173Y4 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C4006B6 f15520a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ boolean f15521b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C4023E f15522c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ Bundle f15523d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ C4364w5 f15524e;

    RunnableC4173Y4(C4364w5 c4364w5, boolean z7, C4006B6 c4006b6, boolean z8, C4023E c4023e, Bundle bundle) {
        this.f15520a = c4006b6;
        this.f15521b = z8;
        this.f15522c = c4023e;
        this.f15523d = bundle;
        Objects.requireNonNull(c4364w5);
        this.f15524e = c4364w5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4364w5 c4364w5 = this.f15524e;
        InterfaceC6033d interfaceC6033dM19215N = c4364w5.m19215N();
        if (interfaceC6033dM19215N == null) {
            c4364w5.f15066a.mo18421a().m18851o().m18834a("Failed to send default event parameters to service");
            return;
        }
        if (c4364w5.f15066a.m18686w().m18800H(null, AbstractC4209d2.f15656c1)) {
            C4006B6 c4006b6 = this.f15520a;
            AbstractC3718s.m18083l(c4006b6);
            this.f15524e.m19224b0(interfaceC6033dM19215N, this.f15521b ? null : this.f15522c, c4006b6);
            return;
        }
        try {
            C4006B6 c4006b7 = this.f15520a;
            AbstractC3718s.m18083l(c4006b7);
            interfaceC6033dM19215N.mo18734b0(this.f15523d, c4006b7);
            c4364w5.m19211J();
        } catch (RemoteException e7) {
            this.f15524e.f15066a.mo18421a().m18851o().m18835b("Failed to send default event parameters to service", e7);
        }
    }
}
