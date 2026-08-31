package com.google.android.gms.internal.auth;

import android.content.Context;
import com.google.android.gms.common.api.AbstractC3560h;
import p128Q2.C1255b;

/* JADX INFO: loaded from: classes2.dex */
final class zzbq extends zzbi {
    final /* synthetic */ C1255b zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbq(zzbt zzbtVar, AbstractC3560h abstractC3560h, C1255b c1255b) {
        super(abstractC3560h);
        this.zza = c1255b;
    }

    @Override // com.google.android.gms.internal.auth.zzbi
    protected final void zza(Context context, zzbh zzbhVar) {
        zzbhVar.zze(new zzbp(this), this.zza);
    }
}
