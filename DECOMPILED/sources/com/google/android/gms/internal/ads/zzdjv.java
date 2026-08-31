package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.AbstractC3465c;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdjv {
    private final zzdsm zza;

    zzdjv(zzdsm zzdsmVar) {
        this.zza = zzdsmVar;
    }

    public final void zza(View view, zzfcj zzfcjVar) {
        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zznK)).booleanValue() || view == null) {
            return;
        }
        String str = true != AbstractC3465c.m17517a(view) ? "0" : "1";
        zzdsl zzdslVarZza = this.zza.zza();
        zzdslVarZza.zzc("action", "hcp");
        zzdslVarZza.zzc("hcp", str);
        zzdslVarZza.zzb(zzfcjVar);
        zzdslVarZza.zzd();
    }
}
