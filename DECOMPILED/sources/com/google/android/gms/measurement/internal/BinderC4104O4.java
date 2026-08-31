package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import p283k3.AbstractBinderC6035f;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.O4 */
/* JADX INFO: loaded from: classes2.dex */
final class BinderC4104O4 extends AbstractBinderC6035f {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ AtomicReference f15347a;

    BinderC4104O4(C4364w5 c4364w5, AtomicReference atomicReference) {
        this.f15347a = atomicReference;
        Objects.requireNonNull(c4364w5);
    }

    @Override // p283k3.InterfaceC6036g
    public final void zze(List list) {
        AtomicReference atomicReference = this.f15347a;
        synchronized (atomicReference) {
            atomicReference.set(list);
            atomicReference.notifyAll();
        }
    }
}
