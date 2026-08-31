package com.google.android.gms.ads.internal.util;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.util.a */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC3461a implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ AbstractC3422B f14225a;

    RunnableC3461a(AbstractC3422B abstractC3422B) {
        Objects.requireNonNull(abstractC3422B);
        this.f14225a = abstractC3422B;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC3422B abstractC3422B = this.f14225a;
        abstractC3422B.zzc(Thread.currentThread());
        abstractC3422B.zza();
    }
}
