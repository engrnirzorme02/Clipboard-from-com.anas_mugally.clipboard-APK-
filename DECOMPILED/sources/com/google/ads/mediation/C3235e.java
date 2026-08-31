package com.google.ads.mediation;

import com.google.android.gms.internal.ads.zzbgr;
import p012B2.InterfaceC0076q;
import p314o2.AbstractC6552d;
import p314o2.C6561m;
import p340r2.AbstractC6890h;
import p340r2.InterfaceC6894l;
import p340r2.InterfaceC6895m;
import p340r2.InterfaceC6897o;

/* JADX INFO: renamed from: com.google.ads.mediation.e */
/* JADX INFO: loaded from: classes.dex */
final class C3235e extends AbstractC6552d implements InterfaceC6897o, InterfaceC6895m, InterfaceC6894l {

    /* JADX INFO: renamed from: a */
    final AbstractAdViewAdapter f13839a;

    /* JADX INFO: renamed from: b */
    final InterfaceC0076q f13840b;

    public C3235e(AbstractAdViewAdapter abstractAdViewAdapter, InterfaceC0076q interfaceC0076q) {
        this.f13839a = abstractAdViewAdapter;
        this.f13840b = interfaceC0076q;
    }

    @Override // p340r2.InterfaceC6895m
    /* JADX INFO: renamed from: a */
    public final void mo17140a(zzbgr zzbgrVar) {
        this.f13840b.zzc(this.f13839a, zzbgrVar);
    }

    @Override // p340r2.InterfaceC6897o
    /* JADX INFO: renamed from: b */
    public final void mo17141b(AbstractC6890h abstractC6890h) {
        this.f13840b.onAdLoaded(this.f13839a, new C3231a(abstractC6890h));
    }

    @Override // p340r2.InterfaceC6894l
    /* JADX INFO: renamed from: c */
    public final void mo17142c(zzbgr zzbgrVar, String str) {
        this.f13840b.zzd(this.f13839a, zzbgrVar, str);
    }

    @Override // p314o2.AbstractC6552d, com.google.android.gms.ads.internal.client.InterfaceC3318a
    public final void onAdClicked() {
        this.f13840b.onAdClicked(this.f13839a);
    }

    @Override // p314o2.AbstractC6552d
    public final void onAdClosed() {
        this.f13840b.onAdClosed(this.f13839a);
    }

    @Override // p314o2.AbstractC6552d
    public final void onAdFailedToLoad(C6561m c6561m) {
        this.f13840b.onAdFailedToLoad(this.f13839a, c6561m);
    }

    @Override // p314o2.AbstractC6552d
    public final void onAdImpression() {
        this.f13840b.onAdImpression(this.f13839a);
    }

    @Override // p314o2.AbstractC6552d
    public final void onAdLoaded() {
    }

    @Override // p314o2.AbstractC6552d
    public final void onAdOpened() {
        this.f13840b.onAdOpened(this.f13839a);
    }
}
