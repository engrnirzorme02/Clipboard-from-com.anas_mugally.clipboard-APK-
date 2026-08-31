package com.google.android.gms.internal.p409authapi;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.AbstractC3560h;
import com.google.android.gms.common.internal.AbstractC3696h;
import com.google.android.gms.common.internal.C3690e;
import p100M2.C0891f;
import p100M2.C0892g;

/* JADX INFO: loaded from: classes2.dex */
public final class zbd extends AbstractC3696h {
    private final C0892g zba;

    public zbd(Context context, Looper looper, C3690e c3690e, C0892g c0892g, AbstractC3560h.b bVar, AbstractC3560h.c cVar) {
        super(context, looper, 68, c3690e, bVar, cVar);
        C0891f c0891f = new C0891f(c0892g == null ? C0892g.f3492d : c0892g);
        c0891f.m4048a(zbaw.zba());
        this.zba = new C0892g(c0891f);
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c
    protected final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return iInterfaceQueryLocalInterface instanceof zbe ? (zbe) iInterfaceQueryLocalInterface : new zbe(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c
    protected final Bundle getGetServiceRequestExtraArgs() {
        return this.zba.m4049a();
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c, com.google.android.gms.common.api.C3553a.f
    public final int getMinApkVersion() {
        return 12800000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c
    protected final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c
    protected final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }
}
