package com.google.android.gms.internal.fido;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.AbstractC3560h;
import com.google.android.gms.common.internal.AbstractC3696h;
import com.google.android.gms.common.internal.C3690e;
import p170W2.C1839d;
import p243f3.AbstractC5436b;

/* JADX INFO: loaded from: classes2.dex */
public final class zzp extends AbstractC3696h {
    public zzp(Context context, Looper looper, C3690e c3690e, AbstractC3560h.b bVar, AbstractC3560h.c cVar) {
        super(context, looper, 148, c3690e, bVar, cVar);
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c
    protected final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
        return iInterfaceQueryLocalInterface instanceof zzs ? (zzs) iInterfaceQueryLocalInterface : new zzs(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c
    public final C1839d[] getApiFeatures() {
        return new C1839d[]{AbstractC5436b.f20715h, AbstractC5436b.f20714g};
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c
    protected final Bundle getGetServiceRequestExtraArgs() {
        Bundle bundle = new Bundle();
        bundle.putString("FIDO2_ACTION_START_SERVICE", "com.google.android.gms.fido.fido2.regular.START");
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c, com.google.android.gms.common.api.C3553a.f
    public final int getMinApkVersion() {
        return 13000000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c
    protected final String getServiceDescriptor() {
        return "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c
    protected final String getStartServiceAction() {
        return "com.google.android.gms.fido.fido2.regular.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c
    public final boolean usesClientTelemetry() {
        return true;
    }
}
