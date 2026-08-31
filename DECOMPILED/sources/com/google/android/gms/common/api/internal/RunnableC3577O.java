package com.google.android.gms.common.api.internal;

import android.util.Log;
import p170W2.C1837b;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.O */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC3577O implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C1837b f14593a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C3578P f14594b;

    RunnableC3577O(C3578P c3578p, C1837b c1837b) {
        this.f14594b = c3578p;
        this.f14593a = c1837b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3578P c3578p = this.f14594b;
        C3574L c3574l = (C3574L) c3578p.f14600f.f14653u.get(c3578p.f14596b);
        if (c3574l == null) {
            return;
        }
        if (!this.f14593a.m7600X()) {
            c3574l.m17825E(this.f14593a, null);
            return;
        }
        this.f14594b.f14599e = true;
        if (this.f14594b.f14595a.requiresSignIn()) {
            this.f14594b.m17842i();
            return;
        }
        try {
            C3578P c3578p2 = this.f14594b;
            c3578p2.f14595a.getRemoteService(null, c3578p2.f14595a.getScopesForConnectionlessNonSignIn());
        } catch (SecurityException e7) {
            Log.e("GoogleApiManager", "Failed to get service from broker. ", e7);
            this.f14594b.f14595a.disconnect("Failed to get service from broker.");
            c3574l.m17825E(new C1837b(10), null);
        }
    }
}
