package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.client.C3250D;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaxi extends zzaxl {
    private final View zzh;

    public zzaxi(zzavx zzavxVar, String str, String str2, zzarw zzarwVar, int i7, int i8, View view) {
        super(zzavxVar, "UGogIgDf9q+IGA3QKHqW/91b9ZzRTVJqtfmUoLBkD310fwrDg1hJZvDQk8/WK1MH", "sEqRe1gPhw/PwjhUj/qVAEUjKSVJDrXHsmrE44pcjTE=", zzarwVar, i7, 57);
        this.zzh = view;
    }

    @Override // com.google.android.gms.internal.ads.zzaxl
    protected final void zza() {
        View view = this.zzh;
        if (view != null) {
            Boolean bool = (Boolean) C3250D.m17200c().zzd(zzbci.zzdP);
            Boolean bool2 = (Boolean) C3250D.m17200c().zzd(zzbci.zzlM);
            zzawb zzawbVar = new zzawb((String) this.zze.invoke(null, view, this.zza.zzb().getResources().getDisplayMetrics(), bool, bool2));
            zzasr zzasrVarZza = zzass.zza();
            zzasrVarZza.zzb(zzawbVar.zza.longValue());
            zzasrVarZza.zzc(zzawbVar.zzb.longValue());
            zzasrVarZza.zzd(zzawbVar.zzc.longValue());
            if (bool2.booleanValue()) {
                zzasrVarZza.zza(zzawbVar.zze.longValue());
            }
            if (bool.booleanValue()) {
                zzasrVarZza.zze(zzawbVar.zzd.longValue());
            }
            this.zzd.zzM((zzass) zzasrVarZza.zzbu());
        }
    }
}
