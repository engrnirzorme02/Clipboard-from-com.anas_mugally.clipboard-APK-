package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import p170W2.C1837b;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.p5 */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4308p5 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C1837b f15951a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ ServiceConnectionC4316q5 f15952b;

    RunnableC4308p5(ServiceConnectionC4316q5 serviceConnectionC4316q5, C1837b c1837b) {
        this.f15951a = c1837b;
        Objects.requireNonNull(serviceConnectionC4316q5);
        this.f15952b = serviceConnectionC4316q5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4364w5 c4364w5 = this.f15952b.f15981c;
        c4364w5.m19216O(null);
        if (this.f15951a.m7596T() != 7777) {
            c4364w5.m19213L();
            return;
        }
        if (c4364w5.m19217P() == null) {
            c4364w5.m19218Q(Executors.newScheduledThreadPool(1));
        }
        c4364w5.m19217P().schedule(new Runnable() { // from class: com.google.android.gms.measurement.internal.n5
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                final C4364w5 c4364w6 = this.f15921a.f15952b.f15981c;
                c4364w6.f15066a.mo18422b().m18639t(new Runnable() { // from class: com.google.android.gms.measurement.internal.o5
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        c4364w6.m19243w();
                    }
                });
            }
        }, ((Long) AbstractC4209d2.f15649a0.m18706b(null)).longValue(), TimeUnit.MILLISECONDS);
    }
}
