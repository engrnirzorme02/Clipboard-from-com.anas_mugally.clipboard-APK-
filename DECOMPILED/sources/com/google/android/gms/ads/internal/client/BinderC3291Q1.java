package com.google.android.gms.ads.internal.client;

import p068I2.InterfaceC0606a;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.Q1 */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC3291Q1 extends AbstractBinderC3290Q0 {

    /* JADX INFO: renamed from: a */
    private final InterfaceC0606a f13900a;

    public BinderC3291Q1(InterfaceC0606a interfaceC0606a) {
        this.f13900a = interfaceC0606a;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3292R0
    public final void zze() {
        InterfaceC0606a interfaceC0606a = this.f13900a;
        if (interfaceC0606a != null) {
            interfaceC0606a.onAdMetadataChanged();
        }
    }
}
