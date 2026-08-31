package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.w */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4358w implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ InterfaceC4011C3 f16130a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ AbstractC4366x f16131b;

    RunnableC4358w(AbstractC4366x abstractC4366x, InterfaceC4011C3 interfaceC4011C3) {
        this.f16130a = interfaceC4011C3;
        Objects.requireNonNull(abstractC4366x);
        this.f16131b = abstractC4366x;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC4011C3 interfaceC4011C3 = this.f16130a;
        interfaceC4011C3.mo18423c();
        if (C4222f.m18746a()) {
            interfaceC4011C3.mo18422b().m18639t(this);
            return;
        }
        AbstractC4366x abstractC4366x = this.f16131b;
        boolean zM19250c = abstractC4366x.m19250c();
        abstractC4366x.m19252e(0L);
        if (zM19250c) {
            abstractC4366x.mo18529a();
        }
    }
}
