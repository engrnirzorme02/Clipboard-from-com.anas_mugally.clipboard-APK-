package com.google.ads.mediation;

import com.google.android.gms.ads.internal.client.InterfaceC3318a;
import p012B2.InterfaceC0069j;
import p314o2.AbstractC6552d;
import p314o2.C6561m;
import p324p2.InterfaceC6738e;

/* JADX INFO: renamed from: com.google.ads.mediation.b */
/* JADX INFO: loaded from: classes.dex */
final class C3232b extends AbstractC6552d implements InterfaceC6738e, InterfaceC3318a {

    /* JADX INFO: renamed from: a */
    final AbstractAdViewAdapter f13833a;

    /* JADX INFO: renamed from: b */
    final InterfaceC0069j f13834b;

    public C3232b(AbstractAdViewAdapter abstractAdViewAdapter, InterfaceC0069j interfaceC0069j) {
        this.f13833a = abstractAdViewAdapter;
        this.f13834b = interfaceC0069j;
    }

    @Override // p314o2.AbstractC6552d, com.google.android.gms.ads.internal.client.InterfaceC3318a
    public final void onAdClicked() {
        this.f13834b.onAdClicked(this.f13833a);
    }

    @Override // p314o2.AbstractC6552d
    public final void onAdClosed() {
        this.f13834b.onAdClosed(this.f13833a);
    }

    @Override // p314o2.AbstractC6552d
    public final void onAdFailedToLoad(C6561m c6561m) {
        this.f13834b.onAdFailedToLoad(this.f13833a, c6561m);
    }

    @Override // p314o2.AbstractC6552d
    public final void onAdLoaded() {
        this.f13834b.onAdLoaded(this.f13833a);
    }

    @Override // p314o2.AbstractC6552d
    public final void onAdOpened() {
        this.f13834b.onAdOpened(this.f13833a);
    }

    @Override // p324p2.InterfaceC6738e
    public final void onAppEvent(String str, String str2) {
        this.f13834b.zza(this.f13833a, str, str2);
    }
}
