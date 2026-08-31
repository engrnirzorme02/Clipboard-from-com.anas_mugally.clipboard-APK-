package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3250D;
import java.util.Objects;
import p404z2.C7606w;

/* JADX INFO: loaded from: classes2.dex */
final class zzcmb implements zzgoq {
    final /* synthetic */ zzfjv zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ C7606w zzc;
    final /* synthetic */ zzcmi zzd;

    zzcmb(zzcmi zzcmiVar, zzfjv zzfjvVar, String str, C7606w c7606w) {
        this.zza = zzfjvVar;
        this.zzb = str;
        this.zzc = c7606w;
        Objects.requireNonNull(zzcmiVar);
        this.zzd = zzcmiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(final Throwable th) {
        final zzfjv zzfjvVar = this.zza;
        final String str = this.zzb;
        final C7606w c7606w = this.zzc;
        this.zzd.zzj().submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcma
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                boolean zBooleanValue = ((Boolean) C3250D.m17200c().zzd(zzbci.zzle)).booleanValue();
                Throwable th2 = th;
                zzcmb zzcmbVar = this.zza;
                if (zBooleanValue) {
                    zzcmi zzcmiVar = zzcmbVar.zzd;
                    zzbtv zzbtvVarZzc = zzbtt.zzc(zzcmiVar.zzi());
                    zzcmiVar.zzb = zzbtvVarZzc;
                    zzbtvVarZzc.zzh(th2, "AttributionReporting.registerSourceAndPingClickUrl");
                } else {
                    zzcmi zzcmiVar2 = zzcmbVar.zzd;
                    zzbtv zzbtvVarZza = zzbtt.zza(zzcmiVar2.zzi());
                    zzcmiVar2.zza = zzbtvVarZza;
                    zzbtvVarZza.zzh(th2, "AttributionReportingSampled.registerSourceAndPingClickUrl");
                }
                C7606w c7606w2 = c7606w;
                zzfjvVar.zzb(str, c7606w2, null, null);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        final zzfjv zzfjvVar = this.zza;
        final String str = (String) obj;
        final C7606w c7606w = this.zzc;
        this.zzd.zzj().submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclz
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzfjvVar.zzb(str, c7606w, null, null);
            }
        });
    }
}
