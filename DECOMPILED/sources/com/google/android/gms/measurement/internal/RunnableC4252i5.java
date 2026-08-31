package com.google.android.gms.measurement.internal;

import java.util.Objects;
import p283k3.InterfaceC6033d;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.i5 */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4252i5 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ InterfaceC6033d f15828a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ ServiceConnectionC4316q5 f15829b;

    RunnableC4252i5(ServiceConnectionC4316q5 serviceConnectionC4316q5, InterfaceC6033d interfaceC6033d) {
        this.f15828a = interfaceC6033d;
        Objects.requireNonNull(serviceConnectionC4316q5);
        this.f15829b = serviceConnectionC4316q5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ServiceConnectionC4316q5 serviceConnectionC4316q5 = this.f15829b;
        synchronized (serviceConnectionC4316q5) {
            try {
                serviceConnectionC4316q5.m18865d(false);
                C4364w5 c4364w5 = serviceConnectionC4316q5.f15981c;
                if (!c4364w5.m19219W()) {
                    c4364w5.f15066a.mo18421a().m18859w().m18834a("Connected to service");
                    c4364w5.m19246z(this.f15828a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
