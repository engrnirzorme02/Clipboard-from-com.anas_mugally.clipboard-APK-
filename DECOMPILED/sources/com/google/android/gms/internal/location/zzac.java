package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.AbstractC3560h;
import com.google.android.gms.common.api.C3553a;
import com.google.android.gms.location.C3969h;

/* JADX INFO: loaded from: classes2.dex */
final class zzac extends zzae {
    final /* synthetic */ C3969h zza;
    final /* synthetic */ PendingIntent zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzac(zzaf zzafVar, AbstractC3560h abstractC3560h, C3969h c3969h, PendingIntent pendingIntent) {
        super(abstractC3560h);
        this.zza = c3969h;
        this.zzb = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3594d
    protected final /* bridge */ /* synthetic */ void doExecute(C3553a.b bVar) {
        ((zzaz) bVar).zzv(this.zza, this.zzb, this);
    }
}
