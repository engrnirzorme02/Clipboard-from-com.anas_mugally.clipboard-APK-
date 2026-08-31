package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.AbstractC3718s;
import java.util.Objects;
import p283k3.InterfaceC6033d;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.R4 */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4124R4 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C4006B6 f15398a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C4364w5 f15399b;

    RunnableC4124R4(C4364w5 c4364w5, C4006B6 c4006b6) {
        this.f15398a = c4006b6;
        Objects.requireNonNull(c4364w5);
        this.f15399b = c4364w5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4364w5 c4364w5 = this.f15399b;
        InterfaceC6033d interfaceC6033dM19215N = c4364w5.m19215N();
        if (interfaceC6033dM19215N == null) {
            c4364w5.f15066a.mo18421a().m18851o().m18834a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            C4006B6 c4006b6 = this.f15398a;
            AbstractC3718s.m18083l(c4006b6);
            interfaceC6033dM19215N.mo18741u(c4006b6);
        } catch (RemoteException e7) {
            this.f15399b.f15066a.mo18421a().m18851o().m18835b("Failed to reset data on the service: remote exception", e7);
        }
        this.f15399b.m19211J();
    }
}
