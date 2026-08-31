package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.AbstractC3465c;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcpm implements zzcwm {
    private final zzcek zza;
    private final zzdsm zzb;
    private final zzfcj zzc;

    zzcpm(zzcek zzcekVar, zzdsm zzdsmVar, zzfcj zzfcjVar) {
        this.zza = zzcekVar;
        this.zzb = zzdsmVar;
        this.zzc = zzfcjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzdw() {
        zzcek zzcekVar;
        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zznK)).booleanValue() || (zzcekVar = this.zza) == null) {
            return;
        }
        String str = true != AbstractC3465c.m17517a(zzcekVar.zzE()) ? "0" : "1";
        zzdsl zzdslVarZza = this.zzb.zza();
        zzdslVarZza.zzc("action", "hcp");
        zzdslVarZza.zzc("hcp", str);
        zzdslVarZza.zzb(this.zzc);
        zzdslVarZza.zzd();
    }
}
