package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.AbstractC3560h;
import com.google.android.gms.common.api.C3553a;
import com.google.android.gms.common.api.InterfaceC3643m;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.AbstractC3943H;
import com.google.android.gms.location.C3973l;
import com.google.android.gms.location.C3974m;

/* JADX INFO: loaded from: classes2.dex */
final class zzbh extends AbstractC3943H {
    final /* synthetic */ C3973l zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbh(zzbi zzbiVar, AbstractC3560h abstractC3560h, C3973l c3973l, String str) {
        super(abstractC3560h);
        this.zza = c3973l;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ InterfaceC3643m createFailedResult(Status status) {
        return new C3974m(status, null);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3594d
    protected final /* bridge */ /* synthetic */ void doExecute(C3553a.b bVar) {
        ((zzaz) bVar).zzL(this.zza, this, null);
    }
}
