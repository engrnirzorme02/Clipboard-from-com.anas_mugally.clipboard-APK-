package com.google.android.gms.common.api.internal;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.I */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC3571I implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ int f14574a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C3574L f14575b;

    RunnableC3571I(C3574L c3574l, int i7) {
        this.f14575b = c3574l;
        this.f14574a = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f14575b.m17807i(this.f14574a);
    }
}
