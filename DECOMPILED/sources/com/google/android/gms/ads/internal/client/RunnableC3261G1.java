package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import java.util.Objects;
import p404z2.AbstractC7599p;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.G1 */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC3261G1 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ BinderC3264H1 f13890a;

    RunnableC3261G1(BinderC3264H1 binderC3264H1) {
        Objects.requireNonNull(binderC3264H1);
        this.f13890a = binderC3264H1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BinderC3267I1 binderC3267I1 = this.f13890a.f13891a;
        if (binderC3267I1.m17209M0() != null) {
            try {
                binderC3267I1.m17209M0().zzc(1);
            } catch (RemoteException e7) {
                AbstractC7599p.m33332g("Could not notify onAdFailedToLoad event.", e7);
            }
        }
    }
}
