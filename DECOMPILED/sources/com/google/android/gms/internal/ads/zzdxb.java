package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.C3250D;
import p036E2.C0318M;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdxb implements zzcyy, zzdel, zzcxg {
    private final Context zza;
    private final zzdsm zzb;

    zzdxb(Context context, zzdsm zzdsmVar) {
        this.zza = context;
        this.zzb = zzdsmVar;
    }

    private final void zzf(final Context context) {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzfd)).booleanValue()) {
            zzbzh.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdxa
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzc(context);
                }
            });
        }
    }

    final /* synthetic */ void zzc(Context context) {
        C7351t.m32360r().zza(context, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zzd(C0318M c0318m) {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzfg)).booleanValue()) {
            zzf(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyy
    public final void zzdT(zzbuv zzbuvVar) {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzff)).booleanValue()) {
            zzf(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyy
    public final void zzdU(zzfcu zzfcuVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zze(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzcxg
    public final void zzg() {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzfh)).booleanValue()) {
            zzf(this.zza);
        }
    }
}
