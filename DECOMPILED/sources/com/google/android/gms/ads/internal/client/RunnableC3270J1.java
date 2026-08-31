package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import java.util.Objects;
import p404z2.AbstractC7599p;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.J1 */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC3270J1 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ BinderC3273K1 f13893a;

    RunnableC3270J1(BinderC3273K1 binderC3273K1) {
        Objects.requireNonNull(binderC3273K1);
        this.f13893a = binderC3273K1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BinderC3273K1 binderC3273K1 = this.f13893a;
        if (binderC3273K1.m17211L0() != null) {
            try {
                binderC3273K1.m17211L0().zzc(1);
            } catch (RemoteException e7) {
                AbstractC7599p.m33332g("Could not notify onAdFailedToLoad event.", e7);
            }
        }
    }
}
