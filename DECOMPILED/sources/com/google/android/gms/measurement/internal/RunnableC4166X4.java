package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.Objects;
import p283k3.InterfaceC6033d;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.X4 */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4166X4 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C4028E4 f15502a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C4364w5 f15503b;

    RunnableC4166X4(C4364w5 c4364w5, C4028E4 c4028e4) {
        this.f15502a = c4028e4;
        Objects.requireNonNull(c4364w5);
        this.f15503b = c4364w5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4364w5 c4364w5 = this.f15503b;
        InterfaceC6033d interfaceC6033dM19215N = c4364w5.m19215N();
        if (interfaceC6033dM19215N == null) {
            c4364w5.f15066a.mo18421a().m18851o().m18834a("Failed to send current screen to service");
            return;
        }
        try {
            C4028E4 c4028e4 = this.f15502a;
            if (c4028e4 == null) {
                interfaceC6033dM19215N.mo18738q(0L, null, null, c4364w5.f15066a.mo18424e().getPackageName());
            } else {
                interfaceC6033dM19215N.mo18738q(c4028e4.f15198c, c4028e4.f15196a, c4028e4.f15197b, c4364w5.f15066a.mo18424e().getPackageName());
            }
            c4364w5.m19211J();
        } catch (RemoteException e7) {
            this.f15503b.f15066a.mo18421a().m18851o().m18835b("Failed to send current screen to the service", e7);
        }
    }
}
