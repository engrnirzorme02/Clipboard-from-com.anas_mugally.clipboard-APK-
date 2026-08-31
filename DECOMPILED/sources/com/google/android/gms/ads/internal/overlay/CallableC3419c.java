package com.google.android.gms.ads.internal.overlay;

import java.util.concurrent.Callable;
import p380w2.C7351t;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.overlay.c */
/* JADX INFO: loaded from: classes.dex */
final class CallableC3419c implements Callable {

    /* JADX INFO: renamed from: a */
    private final long f14168a;

    CallableC3419c(long j7) {
        this.f14168a = j7;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (AdOverlayInfoParcel.f14133K.remove(Long.valueOf(this.f14168a)) == null) {
            return null;
        }
        C7351t.m32354l().zzg(new Exception("Key was non-null in AdOverlayObjectsCleanupTask"), "AdOverlayObjectsCleanupTask");
        return null;
    }
}
