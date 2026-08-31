package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import p108N3.InterfaceC0960b;
import p108N3.InterfaceC0967i;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zzbm implements InterfaceC0967i {
    public final /* synthetic */ Activity zza;
    public final /* synthetic */ InterfaceC0960b.a zzb;

    @Override // p108N3.InterfaceC0967i
    public final void onConsentFormLoadSuccess(InterfaceC0960b interfaceC0960b) {
        interfaceC0960b.show(this.zza, null);
    }
}
