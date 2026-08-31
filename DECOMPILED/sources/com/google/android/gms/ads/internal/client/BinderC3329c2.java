package com.google.android.gms.ads.internal.client;

import p314o2.AbstractC6553e;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.c2 */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC3329c2 extends AbstractBinderC3277M {

    /* JADX INFO: renamed from: a */
    private final AbstractC6553e f13924a;

    /* JADX INFO: renamed from: b */
    private final Object f13925b;

    public BinderC3329c2(AbstractC6553e abstractC6553e, Object obj) {
        this.f13924a = abstractC6553e;
        this.f13925b = obj;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3280N
    public final void zzb() {
        Object obj;
        AbstractC6553e abstractC6553e = this.f13924a;
        if (abstractC6553e == null || (obj = this.f13925b) == null) {
            return;
        }
        abstractC6553e.onAdLoaded(obj);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3280N
    public final void zzc(C3324b1 c3324b1) {
        AbstractC6553e abstractC6553e = this.f13924a;
        if (abstractC6553e != null) {
            abstractC6553e.onAdFailedToLoad(c3324b1.m17221U());
        }
    }
}
