package com.google.android.gms.internal.consent_sdk;

import p108N3.C0965g;
import p108N3.InterfaceC0960b;
import p108N3.InterfaceC0966h;
import p108N3.InterfaceC0967i;

/* JADX INFO: loaded from: classes2.dex */
final class zzba implements InterfaceC0967i, InterfaceC0966h {
    private final InterfaceC0967i zza;
    private final InterfaceC0966h zzb;

    /* synthetic */ zzba(InterfaceC0967i interfaceC0967i, InterfaceC0966h interfaceC0966h, zzbb zzbbVar) {
        this.zza = interfaceC0967i;
        this.zzb = interfaceC0966h;
    }

    @Override // p108N3.InterfaceC0966h
    public final void onConsentFormLoadFailure(C0965g c0965g) {
        this.zzb.onConsentFormLoadFailure(c0965g);
    }

    @Override // p108N3.InterfaceC0967i
    public final void onConsentFormLoadSuccess(InterfaceC0960b interfaceC0960b) {
        this.zza.onConsentFormLoadSuccess(interfaceC0960b);
    }
}
