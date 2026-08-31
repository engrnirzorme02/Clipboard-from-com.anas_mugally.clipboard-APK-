package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
final class zzdzd implements zzcyy {
    private final Context zza;
    private final zzbxr zzb;

    zzdzd(Context context, zzbxr zzbxrVar) {
        this.zza = context;
        this.zzb = zzbxrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcyy
    public final void zzdT(zzbuv zzbuvVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcyy
    public final void zzdU(zzfcu zzfcuVar) {
        String str = zzfcuVar.zzb.zzb.zze;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        zzbxr zzbxrVar = this.zzb;
        Context context = this.zza;
        zzbxrVar.zzc(context, zzfcuVar.zza.zza.zzd);
        zzbxrVar.zzm(context, str);
    }
}
