package com.google.android.gms.ads.internal.client;

import java.util.Objects;
import p314o2.C6561m;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.n1 */
/* JADX INFO: loaded from: classes.dex */
final class C3372n1 extends AbstractC3247C {

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C3380p1 f14042c;

    C3372n1(C3380p1 c3380p1) {
        Objects.requireNonNull(c3380p1);
        this.f14042c = c3380p1;
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3247C, p314o2.AbstractC6552d
    public final void onAdFailedToLoad(C6561m c6561m) {
        C3380p1 c3380p1 = this.f14042c;
        c3380p1.m17303e().m27869b(c3380p1.m17298D());
        super.onAdFailedToLoad(c6561m);
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3247C, p314o2.AbstractC6552d
    public final void onAdLoaded() {
        C3380p1 c3380p1 = this.f14042c;
        c3380p1.m17303e().m27869b(c3380p1.m17298D());
        super.onAdLoaded();
    }
}
