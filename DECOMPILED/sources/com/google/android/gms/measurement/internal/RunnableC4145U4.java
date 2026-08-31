package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.AbstractC3718s;
import java.util.Objects;
import p283k3.InterfaceC6033d;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.U4 */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4145U4 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C4006B6 f15443a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C4364w5 f15444b;

    RunnableC4145U4(C4364w5 c4364w5, C4006B6 c4006b6, boolean z7) {
        this.f15443a = c4006b6;
        Objects.requireNonNull(c4364w5);
        this.f15444b = c4364w5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4364w5 c4364w5 = this.f15444b;
        InterfaceC6033d interfaceC6033dM19215N = c4364w5.m19215N();
        if (interfaceC6033dM19215N == null) {
            c4364w5.f15066a.mo18421a().m18851o().m18834a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            C4006B6 c4006b6 = this.f15443a;
            AbstractC3718s.m18083l(c4006b6);
            C4164X2 c4164x2 = c4364w5.f15066a;
            C4278m c4278mM18686w = c4164x2.m18686w();
            C4201c2 c4201c2 = AbstractC4209d2.f15656c1;
            if (c4278mM18686w.m18800H(null, c4201c2)) {
                c4364w5.m19224b0(interfaceC6033dM19215N, null, c4006b6);
            }
            interfaceC6033dM19215N.mo18737k0(c4006b6);
            c4364w5.f15066a.m18663E().m18771v();
            c4164x2.m18686w().m18800H(null, c4201c2);
            c4364w5.m19224b0(interfaceC6033dM19215N, null, c4006b6);
            c4364w5.m19211J();
        } catch (RemoteException e7) {
            this.f15444b.f15066a.mo18421a().m18851o().m18835b("Failed to send app launch to the service", e7);
        }
    }
}
