package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzbof implements zzbzo {
    final /* synthetic */ zzbzm zza;
    final /* synthetic */ zzbnj zzb;

    zzbof(zzboh zzbohVar, zzbzm zzbzmVar, zzbnj zzbnjVar) {
        this.zza = zzbzmVar;
        this.zzb = zzbnjVar;
        Objects.requireNonNull(zzbohVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbzo
    public final void zza() {
        AbstractC3490o0.m17545k("callJs > getEngine: Promise rejected");
        this.zza.zzd(new zzbns("Unable to obtain a JavascriptEngine."));
        this.zzb.zza();
    }
}
