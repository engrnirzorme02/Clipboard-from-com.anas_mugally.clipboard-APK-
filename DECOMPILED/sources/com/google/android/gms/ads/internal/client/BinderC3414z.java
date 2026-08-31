package com.google.android.gms.ads.internal.client;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.z */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC3414z extends AbstractBinderC3259G {

    /* JADX INFO: renamed from: a */
    private final InterfaceC3318a f14129a;

    public BinderC3414z(InterfaceC3318a interfaceC3318a) {
        this.f14129a = interfaceC3318a;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3262H
    public final void zzb() {
        this.f14129a.onAdClicked();
    }
}
