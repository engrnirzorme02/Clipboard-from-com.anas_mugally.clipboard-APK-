package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.client.C3321a2;
import com.google.android.gms.ads.internal.client.C3369m2;
import com.google.android.gms.ads.internal.client.InterfaceC3340f1;
import com.google.android.gms.ads.internal.util.C3501u;
import java.util.concurrent.Executor;
import p157U3.InterfaceFutureC1673e;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeez implements zzedz {
    private final zzcpp zza;
    private final Context zzb;
    private final zzdpi zzc;
    private final zzfdc zzd;
    private final Executor zze;
    private final zzggr zzf;
    private final zzdsg zzg;

    public zzeez(zzcpp zzcppVar, Context context, Executor executor, zzdpi zzdpiVar, zzfdc zzfdcVar, zzggr zzggrVar, zzdsg zzdsgVar) {
        this.zzb = context;
        this.zza = zzcppVar;
        this.zze = executor;
        this.zzc = zzdpiVar;
        this.zzd = zzfdcVar;
        this.zzf = zzggrVar;
        this.zzg = zzdsgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzedz
    public final boolean zza(zzfcu zzfcuVar, zzfcj zzfcjVar) {
        zzfco zzfcoVar = zzfcjVar.zzs;
        return (zzfcoVar == null || zzfcoVar.zza == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzedz
    public final InterfaceFutureC1673e zzb(final zzfcu zzfcuVar, final zzfcj zzfcjVar) {
        return zzgot.zzj(zzgot.zza(null), new zzgob() { // from class: com.google.android.gms.internal.ads.zzeey
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ InterfaceFutureC1673e zza(Object obj) {
                return this.zza.zzc(zzfcuVar, zzfcjVar, obj);
            }
        }, this.zze);
    }

    final /* synthetic */ InterfaceFutureC1673e zzc(zzfcu zzfcuVar, zzfcj zzfcjVar, Object obj) throws zzcez {
        zzbbz zzbbzVar = zzbci.zzcu;
        if (((Boolean) C3250D.m17200c().zzd(zzbbzVar)).booleanValue()) {
            this.zzg.zze().putLong(zzdru.RENDERING_WEBVIEW_CREATION_START.zza(), C7351t.m32357o().mo18159a());
        }
        Context context = this.zzb;
        C3369m2 c3369m2Zza = zzfdi.zza(context, zzfcjVar.zzu);
        final zzcek zzcekVarZza = this.zzc.zza(c3369m2Zza, zzfcjVar, zzfcuVar.zzb.zzb);
        zzcekVarZza.zzaw(zzfcjVar.zzW);
        View viewZza = (((Boolean) C3250D.m17200c().zzd(zzbci.zziC)).booleanValue() && zzfcjVar.zzag) ? zzcqe.zza(context, zzcekVarZza.zzE(), zzfcjVar) : new zzdpl(context, zzcekVarZza.zzE(), (C3501u) this.zzf.apply(zzfcjVar));
        if (((Boolean) C3250D.m17200c().zzd(zzbbzVar)).booleanValue()) {
            this.zzg.zze().putLong(zzdru.RENDERING_WEBVIEW_CREATION_END.zza(), C7351t.m32357o().mo18159a());
        }
        zzcpp zzcppVar = this.zza;
        final zzcol zzcolVarZzf = zzcppVar.zzf(new zzcri(zzfcuVar, zzfcjVar, null), new zzcor(viewZza, zzcekVarZza, new zzcqq() { // from class: com.google.android.gms.internal.ads.zzeeu
            @Override // com.google.android.gms.internal.ads.zzcqq
            public final /* synthetic */ InterfaceC3340f1 zza() {
                return zzcekVarZza.zzh();
            }
        }, zzfdi.zzb(c3369m2Zza)));
        if (((Boolean) C3250D.m17200c().zzd(zzbbzVar)).booleanValue()) {
            this.zzg.zze().putLong(zzdru.RENDERING_AD_COMPONENT_CREATION_END.zza(), C7351t.m32357o().mo18159a());
        }
        zzdph zzdphVarZzj = zzcolVarZzf.zzj();
        zzdsg zzdsgVar = this.zzg;
        zzdphVarZzj.zzi(zzcekVarZza, false, null, zzdsgVar.zze());
        zzcwk zzcwkVarZzd = zzcolVarZzf.zzd();
        zzcwm zzcwmVar = new zzcwm() { // from class: com.google.android.gms.internal.ads.zzeev
            @Override // com.google.android.gms.internal.ads.zzcwm
            public final /* synthetic */ void zzdw() {
                zzcek zzcekVar = zzcekVarZza;
                if (zzcekVar.zzP() != null) {
                    zzcekVar.zzP().zzq();
                }
            }
        };
        zzgpd zzgpdVar = zzbzh.zzg;
        zzcwkVarZzd.zzq(zzcwmVar, zzgpdVar);
        zzfco zzfcoVar = zzfcjVar.zzs;
        String strZza = zzfcoVar.zza;
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzfM)).booleanValue() && zzcolVarZzf.zzm().zza(true)) {
            strZza = zzcgb.zza(strZza, zzcgb.zzb(zzfcjVar));
        }
        zzcolVarZzf.zzj();
        InterfaceFutureC1673e interfaceFutureC1673eZzj = zzdph.zzj(zzcekVarZza, zzfcoVar.zzb, strZza, zzdsgVar.zze(), zzcppVar.zze());
        if (zzfcjVar.zzM) {
            interfaceFutureC1673eZzj.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeet
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzcekVarZza.zzav();
                }
            }, this.zze);
        }
        interfaceFutureC1673eZzj.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeew
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzd(zzcekVarZza);
            }
        }, this.zze);
        return zzgot.zzk(interfaceFutureC1673eZzj, new zzggr() { // from class: com.google.android.gms.internal.ads.zzeex
            @Override // com.google.android.gms.internal.ads.zzggr
            public final /* synthetic */ Object apply(Object obj2) {
                return zzcolVarZzf.zzi();
            }
        }, zzgpdVar);
    }

    final /* synthetic */ void zzd(zzcek zzcekVar) {
        zzcekVar.zzJ();
        zzfdc zzfdcVar = this.zzd;
        zzcfq zzcfqVarZzh = zzcekVar.zzh();
        C3321a2 c3321a2 = zzfdcVar.zza;
        if (c3321a2 != null && zzcfqVarZzh != null) {
            zzcfqVarZzh.zzc(c3321a2);
        }
        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzbw)).booleanValue() || zzcekVar.isAttachedToWindow()) {
            return;
        }
        zzcekVar.onPause();
        zzcekVar.zzaG(true);
    }
}
