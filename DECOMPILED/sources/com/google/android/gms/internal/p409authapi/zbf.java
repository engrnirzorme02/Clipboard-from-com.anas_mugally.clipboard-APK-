package com.google.android.gms.internal.p409authapi;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.internal.InterfaceC3598f;
import com.google.android.gms.common.api.internal.InterfaceC3616o;
import com.google.android.gms.common.internal.AbstractC3696h;
import com.google.android.gms.common.internal.C3690e;
import p114O2.AbstractC1132o;
import p170W2.C1839d;

/* JADX INFO: loaded from: classes2.dex */
public final class zbf extends AbstractC3696h {
    private final Bundle zba;

    public zbf(Context context, Looper looper, AbstractC1132o abstractC1132o, C3690e c3690e, InterfaceC3598f interfaceC3598f, InterfaceC3616o interfaceC3616o) {
        super(context, looper, 219, c3690e, interfaceC3598f, interfaceC3616o);
        Bundle bundle = new Bundle();
        bundle.putString("session_id", null);
        this.zba = bundle;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c
    protected final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.IAuthorizationService");
        return iInterfaceQueryLocalInterface instanceof zbj ? (zbj) iInterfaceQueryLocalInterface : new zbj(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c
    public final C1839d[] getApiFeatures() {
        return zbav.zbv;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c
    protected final Bundle getGetServiceRequestExtraArgs() {
        return this.zba;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c, com.google.android.gms.common.api.C3553a.f
    public final int getMinApkVersion() {
        return 17895000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c
    protected final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.identity.internal.IAuthorizationService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c
    protected final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.identity.service.authorization.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c
    protected final boolean getUseDynamicLookup() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c
    public final boolean usesClientTelemetry() {
        return true;
    }
}
