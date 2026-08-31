package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.internal.measurement.zzcu;
import java.util.Objects;
import p283k3.EnumC6051v;
import p283k3.InterfaceC6033d;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.T4 */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4138T4 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C4006B6 f15434a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ zzcu f15435b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C4364w5 f15436c;

    RunnableC4138T4(C4364w5 c4364w5, C4006B6 c4006b6, zzcu zzcuVar) {
        this.f15434a = c4006b6;
        this.f15435b = zzcuVar;
        Objects.requireNonNull(c4364w5);
        this.f15436c = c4364w5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcu zzcuVar;
        C4389z6 c4389z6M18661C;
        String strMo18743x0 = null;
        try {
            try {
                C4364w5 c4364w5 = this.f15436c;
                C4164X2 c4164x2 = c4364w5.f15066a;
                if (c4164x2.m18687x().m18495w().m18514o(EnumC6051v.ANALYTICS_STORAGE)) {
                    InterfaceC6033d interfaceC6033dM19215N = c4364w5.m19215N();
                    if (interfaceC6033dM19215N != null) {
                        C4006B6 c4006b6 = this.f15434a;
                        AbstractC3718s.m18083l(c4006b6);
                        strMo18743x0 = interfaceC6033dM19215N.mo18743x0(c4006b6);
                        if (strMo18743x0 != null) {
                            c4364w5.f15066a.m18660B().m19260E(strMo18743x0);
                            c4164x2.m18687x().f15174h.m18460b(strMo18743x0);
                        }
                        c4364w5.m19211J();
                        C4364w5 c4364w6 = this.f15436c;
                        zzcuVar = this.f15435b;
                        c4389z6M18661C = c4364w6.f15066a.m18661C();
                        c4389z6M18661C.m19390a0(zzcuVar, strMo18743x0);
                    }
                    c4164x2.mo18421a().m18851o().m18834a("Failed to get app instance id");
                } else {
                    c4164x2.mo18421a().m18856t().m18834a("Analytics storage consent denied; will not get app instance id");
                    c4364w5.f15066a.m18660B().m19260E(null);
                    c4164x2.m18687x().f15174h.m18460b(null);
                }
                c4389z6M18661C = c4164x2.m18661C();
                zzcuVar = this.f15435b;
            } catch (RemoteException e7) {
                this.f15436c.f15066a.mo18421a().m18851o().m18835b("Failed to get app instance id", e7);
            }
            c4389z6M18661C.m19390a0(zzcuVar, strMo18743x0);
        } catch (Throwable th) {
            C4364w5 c4364w7 = this.f15436c;
            c4364w7.f15066a.m18661C().m19390a0(this.f15435b, null);
            throw th;
        }
    }
}
