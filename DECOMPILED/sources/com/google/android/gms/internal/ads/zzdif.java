package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3250D;
import java.util.Objects;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
final class zzdif implements zzgoq {
    final /* synthetic */ String zza = "Google";
    final /* synthetic */ zzdip zzb;

    zzdif(zzdip zzdipVar, String str, boolean z7) {
        Objects.requireNonNull(zzdipVar);
        this.zzb = zzdipVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th) {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzfR)).booleanValue()) {
            C7351t.m32354l().zzh(th, "omid native display exp");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdip zzdipVar = this.zzb;
        zzdipVar.zzZ().zzo((zzcek) obj);
        String str = this.zza;
        zzbzm zzbzmVarZzY = zzdipVar.zzZ().zzY();
        zzedu zzeduVarZzL = zzdipVar.zzL(str, true);
        if (zzeduVarZzL != null && zzbzmVarZzY != null) {
            zzbzmVarZzY.zzc(zzeduVarZzL);
        } else if (zzbzmVarZzY != null) {
            zzbzmVarZzY.cancel(false);
        }
    }
}
