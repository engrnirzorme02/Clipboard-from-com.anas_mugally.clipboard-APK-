package com.google.android.gms.internal.location;

import android.os.Looper;
import com.google.android.gms.common.api.AbstractC3560h;
import com.google.android.gms.common.api.C3553a;
import com.google.android.gms.common.api.internal.AbstractC3612m;
import com.google.android.gms.location.InterfaceC3971j;
import com.google.android.gms.location.LocationRequest;

/* JADX INFO: loaded from: classes2.dex */
final class zzs extends zzx {
    final /* synthetic */ LocationRequest zza;
    final /* synthetic */ InterfaceC3971j zzb;
    final /* synthetic */ Looper zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzs(zzz zzzVar, AbstractC3560h abstractC3560h, LocationRequest locationRequest, InterfaceC3971j interfaceC3971j, Looper looper) {
        super(abstractC3560h);
        this.zza = locationRequest;
        this.zzc = looper;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3594d
    protected final /* bridge */ /* synthetic */ void doExecute(C3553a.b bVar) {
        ((zzaz) bVar).zzC(this.zza, AbstractC3612m.m17931a(null, zzbj.zza(this.zzc), InterfaceC3971j.class.getSimpleName()), new zzy(this));
    }
}
