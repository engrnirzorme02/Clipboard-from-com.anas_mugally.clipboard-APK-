package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.C3250D;
import java.util.concurrent.Executor;
import p157U3.InterfaceFutureC1673e;
import p380w2.C7351t;
import p404z2.C7584a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeek implements zzedz {
    private final zzcny zza;
    private final Context zzb;
    private final zzdpi zzc;
    private final zzfdc zzd;
    private final Executor zze;
    private final C7584a zzf;
    private final zzbjo zzg;
    private final boolean zzh = ((Boolean) C3250D.m17200c().zzd(zzbci.zzjH)).booleanValue();
    private final zzecy zzi;
    private final zzdsg zzj;
    private final zzdsm zzk;

    public zzeek(zzcny zzcnyVar, Context context, Executor executor, zzdpi zzdpiVar, zzfdc zzfdcVar, C7584a c7584a, zzbjo zzbjoVar, zzecy zzecyVar, zzdsg zzdsgVar, zzdsm zzdsmVar) {
        this.zzb = context;
        this.zza = zzcnyVar;
        this.zze = executor;
        this.zzc = zzdpiVar;
        this.zzd = zzfdcVar;
        this.zzf = c7584a;
        this.zzg = zzbjoVar;
        this.zzi = zzecyVar;
        this.zzj = zzdsgVar;
        this.zzk = zzdsmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzedz
    public final boolean zza(zzfcu zzfcuVar, zzfcj zzfcjVar) {
        zzfco zzfcoVar = zzfcjVar.zzs;
        return (zzfcoVar == null || zzfcoVar.zza == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzedz
    public final InterfaceFutureC1673e zzb(final zzfcu zzfcuVar, final zzfcj zzfcjVar) {
        final zzdpm zzdpmVar = new zzdpm();
        InterfaceFutureC1673e interfaceFutureC1673eZza = zzgot.zza(null);
        zzgob zzgobVar = new zzgob() { // from class: com.google.android.gms.internal.ads.zzeei
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ InterfaceFutureC1673e zza(Object obj) {
                return this.zza.zzc(zzfcjVar, zzfcuVar, zzdpmVar, obj);
            }
        };
        Executor executor = this.zze;
        InterfaceFutureC1673e interfaceFutureC1673eZzj = zzgot.zzj(interfaceFutureC1673eZza, zzgobVar, executor);
        interfaceFutureC1673eZzj.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeej
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzdpmVar.zzb();
            }
        }, executor);
        return interfaceFutureC1673eZzj;
    }

    final /* synthetic */ InterfaceFutureC1673e zzc(final zzfcj zzfcjVar, zzfcu zzfcuVar, zzdpm zzdpmVar, Object obj) throws zzcez {
        zzbbz zzbbzVar = zzbci.zzcu;
        if (((Boolean) C3250D.m17200c().zzd(zzbbzVar)).booleanValue()) {
            this.zzj.zze().putLong(zzdru.RENDERING_WEBVIEW_CREATION_START.zza(), C7351t.m32357o().mo18159a());
        }
        zzdpi zzdpiVar = this.zzc;
        zzfdc zzfdcVar = this.zzd;
        final zzcek zzcekVarZza = zzdpiVar.zza(zzfdcVar.zzf, zzfcjVar, zzfcuVar.zzb.zzb);
        zzcekVarZza.zzaw(zzfcjVar.zzW);
        zzdpmVar.zza(this.zzb, zzcekVarZza.zzE());
        if (((Boolean) C3250D.m17200c().zzd(zzbbzVar)).booleanValue()) {
            this.zzj.zze().putLong(zzdru.RENDERING_WEBVIEW_CREATION_END.zza(), C7351t.m32357o().mo18159a());
        }
        zzbzm zzbzmVar = new zzbzm();
        zzcny zzcnyVar = this.zza;
        zzcri zzcriVar = new zzcri(zzfcuVar, zzfcjVar, null);
        C7584a c7584a = this.zzf;
        boolean z7 = this.zzh;
        zzbjo zzbjoVar = this.zzg;
        final zzcnv zzcnvVarZzf = zzcnyVar.zzf(zzcriVar, new zzdfe(new zzeem(c7584a, zzbzmVar, zzfcjVar, zzcekVarZza, zzfdcVar, z7, zzbjoVar, this.zzi, this.zzk), zzcekVarZza), new zzcnw(zzfcjVar.zzaa));
        if (((Boolean) C3250D.m17200c().zzd(zzbbzVar)).booleanValue()) {
            this.zzj.zze().putLong(zzdru.RENDERING_AD_COMPONENT_CREATION_END.zza(), C7351t.m32357o().mo18159a());
        }
        zzdph zzdphVarZzi = zzcnvVarZzf.zzi();
        zzbjo zzbjoVar2 = true == z7 ? zzbjoVar : null;
        zzdsg zzdsgVar = this.zzj;
        zzdphVarZzi.zzi(zzcekVarZza, false, zzbjoVar2, zzdsgVar.zze());
        zzbzmVar.zzc(zzcnvVarZzf);
        zzcnvVarZzf.zzd().zzq(new zzcwm() { // from class: com.google.android.gms.internal.ads.zzeeg
            @Override // com.google.android.gms.internal.ads.zzcwm
            public final /* synthetic */ void zzdw() {
                zzcek zzcekVar = zzcekVarZza;
                if (zzcekVar.zzP() != null) {
                    zzcekVar.zzP().zzq();
                }
            }
        }, zzbzh.zzg);
        zzfco zzfcoVar = zzfcjVar.zzs;
        String strZza = zzfcoVar.zza;
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzfM)).booleanValue() && zzcnvVarZzf.zzk().zza(true)) {
            strZza = zzcgb.zza(strZza, zzcgb.zzb(zzfcjVar));
        }
        zzcnvVarZzf.zzi();
        return zzgot.zzk(zzdph.zzj(zzcekVarZza, zzfcoVar.zzb, strZza, zzdsgVar.zze(), zzcnyVar.zzd()), new zzggr(this) { // from class: com.google.android.gms.internal.ads.zzeeh
            @Override // com.google.android.gms.internal.ads.zzggr
            public final /* synthetic */ Object apply(Object obj2) {
                zzcek zzcekVar = zzcekVarZza;
                if (zzfcjVar.zzM) {
                    zzcekVar.zzav();
                }
                zzcnv zzcnvVar = zzcnvVarZzf;
                zzcekVar.zzJ();
                zzcekVar.onPause();
                return zzcnvVar.zzh();
            }
        }, this.zze);
    }
}
