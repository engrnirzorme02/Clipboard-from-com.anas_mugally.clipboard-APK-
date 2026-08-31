package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import p283k3.AbstractBinderC6038i;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.P4 */
/* JADX INFO: loaded from: classes2.dex */
final class BinderC4111P4 extends AbstractBinderC6038i {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ AtomicReference f15365a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C4364w5 f15366b;

    BinderC4111P4(C4364w5 c4364w5, AtomicReference atomicReference) {
        this.f15365a = atomicReference;
        Objects.requireNonNull(c4364w5);
        this.f15366b = c4364w5;
    }

    @Override // p283k3.InterfaceC6039j
    /* JADX INFO: renamed from: m0 */
    public final void mo18612m0(C4181Z5 c4181z5) {
        AtomicReference atomicReference = this.f15365a;
        synchronized (atomicReference) {
            this.f15366b.f15066a.mo18421a().m18859w().m18835b("[sgtm] Got upload batches from service. count", Integer.valueOf(c4181z5.f15539a.size()));
            atomicReference.set(c4181z5);
            atomicReference.notifyAll();
        }
    }
}
