package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.account.InterfaceC3531g;
import com.google.android.gms.common.api.AbstractC3560h;
import com.google.android.gms.common.api.C3553a;
import com.google.android.gms.common.api.InterfaceC3643m;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC3594d;

/* JADX INFO: loaded from: classes2.dex */
final class zzae extends AbstractC3594d {
    final /* synthetic */ String zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzae(zzal zzalVar, C3553a c3553a, AbstractC3560h abstractC3560h, String str) {
        super(c3553a, abstractC3560h);
        this.zza = str;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* synthetic */ InterfaceC3643m createFailedResult(Status status) {
        return new zzai(status, null);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3594d
    protected final /* bridge */ /* synthetic */ void doExecute(C3553a.b bVar) {
        ((InterfaceC3531g) ((zzam) bVar).getService()).mo17637s0(new zzad(this), this.zza);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3596e
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((InterfaceC3643m) obj);
    }
}
