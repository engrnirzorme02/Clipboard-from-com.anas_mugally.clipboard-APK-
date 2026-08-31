package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.C3457W;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
final class zzbip implements zzgoq {
    final /* synthetic */ zzcek zza;

    zzbip(zzcek zzcekVar) {
        this.zza = zzcekVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th) {
        C7351t.m32354l().zzg(th, "DefaultGmsgHandlers.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        String str = (String) obj;
        zzcek zzcekVar = this.zza;
        new C3457W(zzcekVar.getContext(), zzcekVar.zzs().f30226a, str, null, zzcekVar.zzC() != null ? zzcekVar.zzC().zzax : null).zzb();
    }
}
