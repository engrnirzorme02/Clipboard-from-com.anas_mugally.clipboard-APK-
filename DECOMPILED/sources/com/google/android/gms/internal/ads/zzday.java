package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3250D;

/* JADX INFO: loaded from: classes2.dex */
public final class zzday implements zzcyy {
    private int zza = ((Integer) C3250D.m17200c().zzd(zzbci.zzbu)).intValue();
    private int zzb = ((Integer) C3250D.m17200c().zzd(zzbci.zznI)).intValue();

    public final synchronized int zzc() {
        return this.zza;
    }

    public final synchronized int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcyy
    public final void zzdT(zzbuv zzbuvVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcyy
    public final synchronized void zzdU(zzfcu zzfcuVar) {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzbv)).booleanValue()) {
            try {
                zzfcm zzfcmVar = zzfcuVar.zzb.zzb;
                this.zza = zzfcmVar.zzc;
                this.zzb = zzfcmVar.zzd;
            } catch (NullPointerException unused) {
            }
        }
    }
}
