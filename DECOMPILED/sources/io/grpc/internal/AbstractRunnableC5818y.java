package io.grpc.internal;

import p063H5.C0565r;

/* JADX INFO: renamed from: io.grpc.internal.y */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractRunnableC5818y implements Runnable {

    /* JADX INFO: renamed from: a */
    private final C0565r f22945a;

    protected AbstractRunnableC5818y(C0565r c0565r) {
        this.f22945a = c0565r;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo25416a();

    @Override // java.lang.Runnable
    public final void run() {
        C0565r c0565rM2507b = this.f22945a.m2507b();
        try {
            mo25416a();
        } finally {
            this.f22945a.m2509f(c0565rM2507b);
        }
    }
}
