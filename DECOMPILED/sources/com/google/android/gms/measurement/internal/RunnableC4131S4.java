package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.AbstractC3718s;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import p283k3.EnumC6051v;
import p283k3.InterfaceC6033d;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.S4 */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4131S4 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ AtomicReference f15414a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C4006B6 f15415b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C4364w5 f15416c;

    RunnableC4131S4(C4364w5 c4364w5, AtomicReference atomicReference, C4006B6 c4006b6) {
        this.f15414a = atomicReference;
        this.f15415b = c4006b6;
        Objects.requireNonNull(c4364w5);
        this.f15416c = c4364w5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2 = this.f15414a;
        synchronized (atomicReference2) {
            try {
                try {
                    C4364w5 c4364w5 = this.f15416c;
                    C4164X2 c4164x2 = c4364w5.f15066a;
                    if (c4164x2.m18687x().m18495w().m18514o(EnumC6051v.ANALYTICS_STORAGE)) {
                        InterfaceC6033d interfaceC6033dM19215N = c4364w5.m19215N();
                        if (interfaceC6033dM19215N != null) {
                            C4006B6 c4006b6 = this.f15415b;
                            AbstractC3718s.m18083l(c4006b6);
                            atomicReference2.set(interfaceC6033dM19215N.mo18743x0(c4006b6));
                            String str = (String) atomicReference2.get();
                            if (str != null) {
                                c4364w5.f15066a.m18660B().m19260E(str);
                                c4164x2.m18687x().f15174h.m18460b(str);
                            }
                            c4364w5.m19211J();
                            atomicReference = this.f15414a;
                            atomicReference.notify();
                            return;
                        }
                        c4164x2.mo18421a().m18851o().m18834a("Failed to get app instance id");
                        atomicReference2.notify();
                    } else {
                        c4164x2.mo18421a().m18856t().m18834a("Analytics storage consent denied; will not get app instance id");
                        c4364w5.f15066a.m18660B().m19260E(null);
                        c4164x2.m18687x().f15174h.m18460b(null);
                        atomicReference2.set(null);
                        atomicReference2.notify();
                    }
                } catch (RemoteException e7) {
                    this.f15416c.f15066a.mo18421a().m18851o().m18835b("Failed to get app instance id", e7);
                    atomicReference = this.f15414a;
                }
            } catch (Throwable th) {
                this.f15414a.notify();
                throw th;
            }
        }
    }
}
