package com.google.android.gms.common.api.internal;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.G */
/* JADX INFO: loaded from: classes.dex */
final class C3569G implements ComponentCallbacks2C3592c.a {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C3600g f14572a;

    C3569G(C3600g c3600g) {
        this.f14572a = c3600g;
    }

    @Override // com.google.android.gms.common.api.internal.ComponentCallbacks2C3592c.a
    /* JADX INFO: renamed from: a */
    public final void mo7413a(boolean z7) {
        C3600g c3600g = this.f14572a;
        c3600g.f14657y.sendMessage(c3600g.f14657y.obtainMessage(1, Boolean.valueOf(z7)));
    }
}
