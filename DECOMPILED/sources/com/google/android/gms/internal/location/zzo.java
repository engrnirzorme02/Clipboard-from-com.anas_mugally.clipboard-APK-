package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.AbstractC3560h;
import com.google.android.gms.common.api.C3553a;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes2.dex */
final class zzo extends zzx {
    final /* synthetic */ boolean zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzo(zzz zzzVar, AbstractC3560h abstractC3560h, boolean z7) {
        super(abstractC3560h);
        this.zza = z7;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3594d
    protected final /* bridge */ /* synthetic */ void doExecute(C3553a.b bVar) {
        ((zzaz) bVar).zzI(this.zza);
        setResult(Status.f14513f);
    }
}
