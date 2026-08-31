package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.api.internal.InterfaceC3598f;
import com.google.android.gms.common.api.internal.InterfaceC3616o;
import com.google.android.gms.common.internal.AbstractC3696h;
import com.google.android.gms.common.internal.C3690e;
import p100M2.AbstractC0887b;
import p100M2.C0888c;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbe extends AbstractC3696h {
    private final Bundle zze;

    public zzbe(Context context, Looper looper, C3690e c3690e, C0888c c0888c, InterfaceC3598f interfaceC3598f, InterfaceC3616o interfaceC3616o) {
        super(context, looper, 16, c3690e, interfaceC3598f, interfaceC3616o);
        this.zze = c0888c == null ? new Bundle() : c0888c.m4047a();
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c
    protected final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        return iInterfaceQueryLocalInterface instanceof zzbh ? (zzbh) iInterfaceQueryLocalInterface : new zzbh(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c
    protected final Bundle getGetServiceRequestExtraArgs() {
        return this.zze;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c, com.google.android.gms.common.api.C3553a.f
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c
    protected final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c
    protected final String getStartServiceAction() {
        return "com.google.android.gms.auth.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c, com.google.android.gms.common.api.C3553a.f
    public final boolean requiresSignIn() {
        C3690e clientSettings = getClientSettings();
        return (TextUtils.isEmpty(clientSettings.m18006c()) || clientSettings.m18009f(AbstractC0887b.f3484a).isEmpty()) ? false : true;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c
    public final boolean usesClientTelemetry() {
        return true;
    }
}
