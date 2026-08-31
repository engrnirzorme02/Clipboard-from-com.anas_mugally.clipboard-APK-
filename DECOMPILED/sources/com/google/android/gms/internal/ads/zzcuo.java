package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
final class zzcuo implements zzcxg, zzcwn {
    private final zzfcj zza;

    public zzcuo(Context context, zzfcj zzfcjVar, zzbtb zzbtbVar) {
        this.zza = zzfcjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcwn
    public final void zza(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzcwn
    public final void zzb(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzcwn
    public final void zzc(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzcxg
    public final void zzg() {
        zzbtc zzbtcVar = this.zza.zzad;
        if (zzbtcVar == null || !zzbtcVar.zza) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        String str = zzbtcVar.zzb;
        if (str.isEmpty()) {
            return;
        }
        arrayList.add(str);
    }
}
