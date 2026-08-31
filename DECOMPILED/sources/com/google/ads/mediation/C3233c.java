package com.google.ads.mediation;

import p004A2.AbstractC0012a;
import p004A2.AbstractC0013b;
import p012B2.InterfaceC0074o;
import p314o2.C6561m;

/* JADX INFO: renamed from: com.google.ads.mediation.c */
/* JADX INFO: loaded from: classes.dex */
final class C3233c extends AbstractC0013b {

    /* JADX INFO: renamed from: a */
    final AbstractAdViewAdapter f13835a;

    /* JADX INFO: renamed from: b */
    final InterfaceC0074o f13836b;

    public C3233c(AbstractAdViewAdapter abstractAdViewAdapter, InterfaceC0074o interfaceC0074o) {
        this.f13835a = abstractAdViewAdapter;
        this.f13836b = interfaceC0074o;
    }

    @Override // p314o2.AbstractC6553e
    public final void onAdFailedToLoad(C6561m c6561m) {
        this.f13836b.onAdFailedToLoad(this.f13835a, c6561m);
    }

    @Override // p314o2.AbstractC6553e
    public final /* bridge */ /* synthetic */ void onAdLoaded(Object obj) {
        AbstractAdViewAdapter abstractAdViewAdapter = this.f13835a;
        AbstractC0012a abstractC0012a = (AbstractC0012a) obj;
        abstractAdViewAdapter.mInterstitialAd = abstractC0012a;
        InterfaceC0074o interfaceC0074o = this.f13836b;
        abstractC0012a.setFullScreenContentCallback(new C3234d(abstractAdViewAdapter, interfaceC0074o));
        interfaceC0074o.onAdLoaded(abstractAdViewAdapter);
    }
}
