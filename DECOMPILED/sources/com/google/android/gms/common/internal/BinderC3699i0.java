package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.i0 */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC3699i0 extends AbstractBinderC3679X {

    /* JADX INFO: renamed from: a */
    private AbstractC3686c f14798a;

    /* JADX INFO: renamed from: b */
    private final int f14799b;

    public BinderC3699i0(AbstractC3686c abstractC3686c, int i7) {
        this.f14798a = abstractC3686c;
        this.f14799b = i7;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC3706m
    /* JADX INFO: renamed from: A */
    public final void mo18039A(int i7, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    @Override // com.google.android.gms.common.internal.InterfaceC3706m
    /* JADX INFO: renamed from: A0 */
    public final void mo18040A0(int i7, IBinder iBinder, C3707m0 c3707m0) {
        AbstractC3686c abstractC3686c = this.f14798a;
        AbstractC3718s.m18084m(abstractC3686c, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        AbstractC3718s.m18083l(c3707m0);
        AbstractC3686c.zzj(abstractC3686c, c3707m0);
        mo18041P(i7, iBinder, c3707m0.f14807a);
    }

    @Override // com.google.android.gms.common.internal.InterfaceC3706m
    /* JADX INFO: renamed from: P */
    public final void mo18041P(int i7, IBinder iBinder, Bundle bundle) {
        AbstractC3718s.m18084m(this.f14798a, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f14798a.onPostInitHandler(i7, iBinder, bundle, this.f14799b);
        this.f14798a = null;
    }
}
