package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.AbstractC3560h;
import com.google.android.gms.common.api.C3553a;

/* JADX INFO: loaded from: classes2.dex */
final class zzw extends zzx {
    final /* synthetic */ PendingIntent zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzw(zzz zzzVar, AbstractC3560h abstractC3560h, PendingIntent pendingIntent) {
        super(abstractC3560h);
        this.zza = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3594d
    protected final /* bridge */ /* synthetic */ void doExecute(C3553a.b bVar) {
        ((zzaz) bVar).zzG(this.zza, new zzy(this));
    }
}
