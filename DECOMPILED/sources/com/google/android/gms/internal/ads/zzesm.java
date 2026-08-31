package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.C3250D;

/* JADX INFO: loaded from: classes2.dex */
public final class zzesm implements zzeun {
    public final zzfci zza;

    public zzesm(zzfci zzfciVar) {
        this.zza = zzfciVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        zzcuu zzcuuVar = (zzcuu) obj;
        zzfci zzfciVar = this.zza;
        if (zzfciVar != null) {
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzmK)).booleanValue()) {
                return;
            }
            Bundle bundle = zzcuuVar.zza;
            bundle.putBoolean("render_in_browser", zzfciVar.zzb());
            bundle.putBoolean("disable_ml", zzfciVar.zzc());
        }
    }
}
