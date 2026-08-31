package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.account.AbstractBinderC3530f;
import com.google.android.gms.common.api.AbstractC3560h;
import com.google.android.gms.common.internal.AbstractC3696h;
import com.google.android.gms.common.internal.C3690e;
import p092L2.AbstractC0841h;
import p170W2.C1839d;

/* JADX INFO: loaded from: classes2.dex */
public final class zzam extends AbstractC3696h {
    public zzam(Context context, Looper looper, C3690e c3690e, AbstractC3560h.b bVar, AbstractC3560h.c cVar) {
        super(context, looper, 120, c3690e, bVar, cVar);
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c
    protected final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        return AbstractBinderC3530f.m17639L0(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c
    public final C1839d[] getApiFeatures() {
        return new C1839d[]{AbstractC0841h.f3319n};
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c, com.google.android.gms.common.api.C3553a.f
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c
    protected final String getServiceDescriptor() {
        return "com.google.android.gms.auth.account.IWorkAccountService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c
    protected final String getStartServiceAction() {
        return "com.google.android.gms.auth.account.workaccount.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c
    public final boolean usesClientTelemetry() {
        return true;
    }
}
