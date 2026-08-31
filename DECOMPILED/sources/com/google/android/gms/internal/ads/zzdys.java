package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.C3420A;

/* JADX INFO: loaded from: classes2.dex */
final class zzdys implements zzgoq {
    final /* synthetic */ Context zza;

    zzdys(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th) {
        if (((Boolean) zzbea.zzh.zze()).booleanValue() && (th instanceof C3420A)) {
            zzbbt.zze(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        if (((Boolean) zzbea.zzj.zze()).booleanValue()) {
            zzbbt.zze(this.zza);
        }
    }
}
