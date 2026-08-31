package com.google.android.gms.common.api.internal;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.J */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC3572J implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C3573K f14576a;

    RunnableC3572J(C3573K c3573k) {
        this.f14576a = c3573k;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3574L c3574l = this.f14576a.f14577a;
        c3574l.f14579b.disconnect(c3574l.f14579b.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
