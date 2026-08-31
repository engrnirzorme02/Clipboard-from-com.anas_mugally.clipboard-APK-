package com.google.android.gms.ads.internal.client;

import p314o2.C6573y;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.Y1 */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC3314Y1 extends AbstractBinderC3348h1 {

    /* JADX INFO: renamed from: a */
    private final C6573y.a f13908a;

    public BinderC3314Y1(C6573y.a aVar) {
        this.f13908a = aVar;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3352i1
    public final void zze() {
        this.f13908a.onVideoStart();
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3352i1
    public final void zzf() {
        this.f13908a.onVideoPlay();
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3352i1
    public final void zzg() {
        this.f13908a.onVideoPause();
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3352i1
    public final void zzh() {
        this.f13908a.onVideoEnd();
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3352i1
    public final void zzi(boolean z7) {
        this.f13908a.onVideoMute(z7);
    }
}
