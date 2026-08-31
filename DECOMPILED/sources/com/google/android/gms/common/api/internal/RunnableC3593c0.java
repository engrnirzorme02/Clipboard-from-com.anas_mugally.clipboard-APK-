package com.google.android.gms.common.api.internal;

import p307n3.C6494l;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.c0 */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC3593c0 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C6494l f14629a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ BinderC3597e0 f14630b;

    RunnableC3593c0(BinderC3597e0 binderC3597e0, C6494l c6494l) {
        this.f14630b = binderC3597e0;
        this.f14629a = c6494l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BinderC3597e0.m17865M0(this.f14630b, this.f14629a);
    }
}
