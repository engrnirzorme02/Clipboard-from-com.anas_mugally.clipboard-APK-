package com.google.android.gms.ads.internal.client;

import p314o2.AbstractC6552d;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.Z1 */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC3317Z1 extends AbstractBinderC3268J {

    /* JADX INFO: renamed from: a */
    private final AbstractC6552d f13909a;

    public BinderC3317Z1(AbstractC6552d abstractC6552d) {
        this.f13909a = abstractC6552d;
    }

    /* JADX INFO: renamed from: L0 */
    public final AbstractC6552d m17219L0() {
        return this.f13909a;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3271K
    public final void zzb() {
        AbstractC6552d abstractC6552d = this.f13909a;
        if (abstractC6552d != null) {
            abstractC6552d.onAdClosed();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3271K
    public final void zzc(int i7) {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3271K
    public final void zzd(C3324b1 c3324b1) {
        AbstractC6552d abstractC6552d = this.f13909a;
        if (abstractC6552d != null) {
            abstractC6552d.onAdFailedToLoad(c3324b1.m17221U());
        }
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3271K
    public final void zze() {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3271K
    public final void zzf() {
        AbstractC6552d abstractC6552d = this.f13909a;
        if (abstractC6552d != null) {
            abstractC6552d.onAdLoaded();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3271K
    public final void zzg() {
        AbstractC6552d abstractC6552d = this.f13909a;
        if (abstractC6552d != null) {
            abstractC6552d.onAdOpened();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3271K
    public final void zzh() {
        AbstractC6552d abstractC6552d = this.f13909a;
        if (abstractC6552d != null) {
            abstractC6552d.onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3271K
    public final void zzi() {
        AbstractC6552d abstractC6552d = this.f13909a;
        if (abstractC6552d != null) {
            abstractC6552d.onAdSwipeGestureClicked();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3271K
    public final void zzj() {
        AbstractC6552d abstractC6552d = this.f13909a;
        if (abstractC6552d != null) {
            abstractC6552d.onAdImpression();
        }
    }
}
