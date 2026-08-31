package com.google.android.gms.measurement.internal;

import java.util.Objects;
import p283k3.InterfaceC6033d;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.l5 */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4276l5 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ InterfaceC6033d f15871a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ ServiceConnectionC4316q5 f15872b;

    RunnableC4276l5(ServiceConnectionC4316q5 serviceConnectionC4316q5, InterfaceC6033d interfaceC6033d) {
        this.f15871a = interfaceC6033d;
        Objects.requireNonNull(serviceConnectionC4316q5);
        this.f15872b = serviceConnectionC4316q5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ServiceConnectionC4316q5 serviceConnectionC4316q5 = this.f15872b;
        synchronized (serviceConnectionC4316q5) {
            try {
                serviceConnectionC4316q5.m18865d(false);
                C4364w5 c4364w5 = serviceConnectionC4316q5.f15981c;
                if (!c4364w5.m19219W()) {
                    c4364w5.f15066a.mo18421a().m18858v().m18834a("Connected to remote service");
                    c4364w5.m19246z(this.f15871a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C4364w5 c4364w6 = this.f15872b.f15981c;
        if (c4364w6.m19217P() != null) {
            c4364w6.m19217P().shutdownNow();
            c4364w6.m19218Q(null);
        }
    }
}
