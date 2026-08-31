package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.C3250D;
import java.util.concurrent.Executor;
import p157U3.InterfaceFutureC1673e;
import p380w2.C7351t;
import p404z2.C7584a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzefv implements zzedz {
    private final Context zza;
    private final zzdpi zzb;
    private final zzdgh zzc;
    private final zzfdc zzd;
    private final Executor zze;
    private final C7584a zzf;
    private final zzbjo zzg;
    private final boolean zzh = ((Boolean) C3250D.m17200c().zzd(zzbci.zzjH)).booleanValue();
    private final zzecy zzi;
    private final zzdsg zzj;
    private final zzdsm zzk;

    public zzefv(Context context, C7584a c7584a, zzfdc zzfdcVar, Executor executor, zzdgh zzdghVar, zzdpi zzdpiVar, zzbjo zzbjoVar, zzecy zzecyVar, zzdsg zzdsgVar, zzdsm zzdsmVar) {
        this.zza = context;
        this.zzd = zzfdcVar;
        this.zzc = zzdghVar;
        this.zze = executor;
        this.zzf = c7584a;
        this.zzb = zzdpiVar;
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
        zzgob zzgobVar = new zzgob() { // from class: com.google.android.gms.internal.ads.zzefs
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ InterfaceFutureC1673e zza(Object obj) {
                return this.zza.zzc(zzfcjVar, zzfcuVar, zzdpmVar, obj);
            }
        };
        Executor executor = this.zze;
        InterfaceFutureC1673e interfaceFutureC1673eZzj = zzgot.zzj(interfaceFutureC1673eZza, zzgobVar, executor);
        interfaceFutureC1673eZzj.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzefu
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
        zzdpi zzdpiVar = this.zzb;
        zzfdc zzfdcVar = this.zzd;
        final zzcek zzcekVarZza = zzdpiVar.zza(zzfdcVar.zzf, zzfcjVar, zzfcuVar.zzb.zzb);
        zzcekVarZza.zzaw(zzfcjVar.zzW);
        Context context = this.zza;
        zzdpmVar.zza(context, zzcekVarZza.zzE());
        if (((Boolean) C3250D.m17200c().zzd(zzbbzVar)).booleanValue()) {
            this.zzj.zze().putLong(zzdru.RENDERING_WEBVIEW_CREATION_END.zza(), C7351t.m32357o().mo18159a());
        }
        zzbzm zzbzmVar = new zzbzm();
        zzdgh zzdghVar = this.zzc;
        zzcri zzcriVar = new zzcri(zzfcuVar, zzfcjVar, null);
        C7584a c7584a = this.zzf;
        boolean z7 = this.zzh;
        zzbjo zzbjoVar = this.zzg;
        final zzdfb zzdfbVarZzd = zzdghVar.zzd(zzcriVar, new zzdfe(new zzeft(context, c7584a, zzbzmVar, zzfcjVar, zzcekVarZza, zzfdcVar, z7, zzbjoVar, this.zzi, this.zzk), zzcekVarZza));
        zzbzmVar.zzc(zzdfbVarZzd);
        if (((Boolean) C3250D.m17200c().zzd(zzbbzVar)).booleanValue()) {
            this.zzj.zze().putLong(zzdru.RENDERING_AD_COMPONENT_CREATION_END.zza(), C7351t.m32357o().mo18159a());
        }
        zzdfbVarZzd.zzd().zzq(new zzcwm() { // from class: com.google.android.gms.internal.ads.zzefq
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
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzfM)).booleanValue() && zzdfbVarZzd.zzl().zza(true)) {
            strZza = zzcgb.zza(strZza, zzcgb.zzb(zzfcjVar));
        }
        zzdph zzdphVarZzk = zzdfbVarZzd.zzk();
        zzbjo zzbjoVar2 = true != z7 ? null : zzbjoVar;
        zzdsg zzdsgVar = this.zzj;
        zzdphVarZzk.zzi(zzcekVarZza, true, zzbjoVar2, zzdsgVar.zze());
        zzdfbVarZzd.zzk();
        return zzgot.zzk(zzdph.zzj(zzcekVarZza, zzfcoVar.zzb, strZza, zzdsgVar.zze(), zzdghVar.zzc()), new zzggr(this) { // from class: com.google.android.gms.internal.ads.zzefr
            @Override // com.google.android.gms.internal.ads.zzggr
            public final /* synthetic */ Object apply(Object obj2) {
                zzcek zzcekVar = zzcekVarZza;
                if (zzfcjVar.zzM) {
                    zzcekVar.zzav();
                }
                zzdfb zzdfbVar = zzdfbVarZzd;
                zzcekVar.zzJ();
                zzcekVar.onPause();
                return zzdfbVar.zzh();
            }
        }, this.zze);
    }
}
