package com.google.android.gms.internal.auth;

import android.content.Context;
import com.google.android.gms.common.api.AbstractC3560h;
import com.google.android.gms.common.api.C3553a;
import com.google.android.gms.common.api.InterfaceC3643m;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC3594d;
import p100M2.AbstractC0887b;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzbi extends AbstractC3594d {
    public zzbi(AbstractC3560h abstractC3560h) {
        super(AbstractC0887b.f3484a, abstractC3560h);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* synthetic */ InterfaceC3643m createFailedResult(Status status) {
        return new zzbu(status);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3594d
    protected final /* bridge */ /* synthetic */ void doExecute(C3553a.b bVar) {
        zzbe zzbeVar = (zzbe) bVar;
        zza(zzbeVar.getContext(), (zzbh) zzbeVar.getService());
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3596e
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((InterfaceC3643m) obj);
    }

    protected abstract void zza(Context context, zzbh zzbhVar);
}
