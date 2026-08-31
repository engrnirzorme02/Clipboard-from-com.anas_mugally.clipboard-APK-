package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.client.C3321a2;
import com.google.android.gms.ads.internal.client.C3369m2;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;
import p157U3.InterfaceFutureC1673e;
import p380w2.C7333b;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdmu {
    private final zzfdc zza;
    private final Executor zzb;
    private final zzdpi zzc;
    private final zzdod zzd;
    private final Context zze;
    private final zzdsm zzf;
    private final zzfjv zzg;
    private final zzecn zzh;
    private final zzdsg zzi;
    private final zzdtp zzj;

    public zzdmu(zzfdc zzfdcVar, Executor executor, zzdpi zzdpiVar, Context context, zzdsm zzdsmVar, zzfjv zzfjvVar, zzecn zzecnVar, zzdod zzdodVar, zzdsg zzdsgVar, zzdtp zzdtpVar) {
        this.zza = zzfdcVar;
        this.zzb = executor;
        this.zzc = zzdpiVar;
        this.zze = context;
        this.zzf = zzdsmVar;
        this.zzg = zzfjvVar;
        this.zzh = zzecnVar;
        this.zzd = zzdodVar;
        this.zzi = zzdsgVar;
        this.zzj = zzdtpVar;
    }

    private final void zzh(zzcek zzcekVar, zzbzl zzbzlVar) {
        C3321a2 c3321a2 = this.zza.zza;
        if (c3321a2 != null && zzcekVar.zzh() != null) {
            zzcekVar.zzh().zzc(c3321a2);
        }
        zzbzlVar.zzb();
    }

    private final void zzi(zzcek zzcekVar, C7333b c7333b, zzbxf zzbxfVar) {
        zzdtp zzdtpVar;
        zzj(zzcekVar);
        zzcekVar.zzab("/video", zzbjk.zzl);
        zzcekVar.zzab("/videoMeta", zzbjk.zzm);
        zzcekVar.zzab("/precache", new zzccr());
        zzcekVar.zzab("/delayPageLoaded", zzbjk.zzp);
        zzcekVar.zzab("/instrument", zzbjk.zzn);
        zzcekVar.zzab("/log", zzbjk.zzg);
        zzcekVar.zzab("/click", zzbjk.zzb(null, null));
        if (this.zza.zzb != null) {
            zzcekVar.zzP().zzR(true);
            zzcekVar.zzab("/open", new zzbjy(true != ((Boolean) C3250D.m17200c().zzd(zzbci.zzoq)).booleanValue() ? null : c7333b, null, null, null, null, null));
        } else {
            zzcekVar.zzP().zzR(false);
        }
        if (C7351t.m32346d().zza(zzcekVar.getContext())) {
            Map map = new HashMap();
            if (zzcekVar.zzC() != null) {
                map = zzcekVar.zzC().zzaw;
            }
            zzcekVar.zzab("/logScionEvent", new zzbjr(zzcekVar.getContext(), map));
        }
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzoq)).booleanValue()) {
            zzcekVar.zzP().zzi(c7333b);
            zzcekVar.zzP().zzj(zzbxfVar);
        }
        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzio)).booleanValue() || (zzdtpVar = this.zzj) == null) {
            return;
        }
        zzcekVar.zzab("/onDeviceStorageEvent", new zzbjt(zzdtpVar));
    }

    private static final void zzj(zzcek zzcekVar) {
        zzcekVar.zzab("/videoClicked", zzbjk.zzh);
        zzcekVar.zzP().zzP(true);
        zzcekVar.zzab("/getNativeAdViewSignals", zzbjk.zzs);
        zzcekVar.zzab("/getNativeClickMeta", zzbjk.zzt);
    }

    public final InterfaceFutureC1673e zza(final JSONObject jSONObject, final C7333b c7333b, final zzbxf zzbxfVar) {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzcy)).booleanValue()) {
            this.zzi.zze().putLong(zzdru.NATIVE_ASSETS_LOADING_VIDEO_START.zza(), C7351t.m32357o().mo18159a());
        }
        InterfaceFutureC1673e interfaceFutureC1673eZza = zzgot.zza(null);
        zzgob zzgobVar = new zzgob() { // from class: com.google.android.gms.internal.ads.zzdmp
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ InterfaceFutureC1673e zza(Object obj) {
                return this.zza.zze(c7333b, zzbxfVar, obj);
            }
        };
        Executor executor = this.zzb;
        return zzgot.zzj(zzgot.zzj(interfaceFutureC1673eZza, zzgobVar, executor), new zzgob() { // from class: com.google.android.gms.internal.ads.zzdmt
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ InterfaceFutureC1673e zza(Object obj) {
                return this.zza.zzc(jSONObject, (zzcek) obj);
            }
        }, executor);
    }

    public final InterfaceFutureC1673e zzb(final String str, final String str2, final zzfcj zzfcjVar, final zzfcm zzfcmVar, final C3369m2 c3369m2, final C7333b c7333b, final zzbxf zzbxfVar) {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzcy)).booleanValue()) {
            this.zzi.zze().putLong(zzdru.NATIVE_ASSETS_LOADING_VIDEO_COMPOSITION_START.zza(), C7351t.m32357o().mo18159a());
        }
        return zzgot.zzj(zzgot.zza(null), new zzgob() { // from class: com.google.android.gms.internal.ads.zzdmo
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ InterfaceFutureC1673e zza(Object obj) {
                return this.zza.zzd(c3369m2, zzfcjVar, zzfcmVar, c7333b, zzbxfVar, str, str2, obj);
            }
        }, this.zzb);
    }

    final /* synthetic */ InterfaceFutureC1673e zzc(JSONObject jSONObject, final zzcek zzcekVar) {
        zzblw zzblwVar = this.zza.zzb;
        final zzbzl zzbzlVarZza = zzbzl.zza(zzcekVar);
        if (zzblwVar != null) {
            zzcekVar.zzaf(zzcgt.zze());
        } else {
            zzcekVar.zzaf(zzcgt.zzd());
        }
        zzcekVar.zzP().zzG(new zzcgg() { // from class: com.google.android.gms.internal.ads.zzdms
            @Override // com.google.android.gms.internal.ads.zzcgg
            public final /* synthetic */ void zza(boolean z7, int i7, String str, String str2) {
                this.zza.zzg(zzcekVar, zzbzlVarZza, z7, i7, str, str2);
            }
        });
        zzcekVar.zzb("google.afma.nativeAds.renderVideo", jSONObject);
        return zzbzlVarZza;
    }

    final /* synthetic */ InterfaceFutureC1673e zzd(C3369m2 c3369m2, zzfcj zzfcjVar, zzfcm zzfcmVar, C7333b c7333b, zzbxf zzbxfVar, String str, String str2, Object obj) throws zzcez {
        final zzcek zzcekVarZza = this.zzc.zza(c3369m2, zzfcjVar, zzfcmVar);
        final zzbzl zzbzlVarZza = zzbzl.zza(zzcekVarZza);
        if (this.zza.zzb != null) {
            zzi(zzcekVarZza, c7333b, zzbxfVar);
            zzcekVarZza.zzaf(zzcgt.zze());
        } else {
            zzdoa zzdoaVarZza = this.zzd.zza();
            zzcgi zzcgiVarZzP = zzcekVarZza.zzP();
            zzbbz zzbbzVar = zzbci.zzoq;
            zzcgiVarZzP.zzZ(zzdoaVarZza, zzdoaVarZza, zzdoaVarZza, zzdoaVarZza, zzdoaVarZza, false, null, !((Boolean) C3250D.m17200c().zzd(zzbbzVar)).booleanValue() ? new C7333b(this.zze, null, null) : c7333b, null, true != ((Boolean) C3250D.m17200c().zzd(zzbbzVar)).booleanValue() ? null : zzbxfVar, this.zzh, this.zzg, this.zzf, null, zzdoaVarZza, null, null, null, null, this.zzj, null);
            zzj(zzcekVarZza);
        }
        zzcekVarZza.zzP().zzG(new zzcgg() { // from class: com.google.android.gms.internal.ads.zzdmr
            @Override // com.google.android.gms.internal.ads.zzcgg
            public final /* synthetic */ void zza(boolean z7, int i7, String str3, String str4) {
                this.zza.zzf(zzcekVarZza, zzbzlVarZza, z7, i7, str3, str4);
            }
        });
        zzcekVarZza.zzau(str, str2, null);
        return zzbzlVarZza;
    }

    final /* synthetic */ InterfaceFutureC1673e zze(C7333b c7333b, zzbxf zzbxfVar, Object obj) throws zzcez {
        zzcek zzcekVarZza = this.zzc.zza(C3369m2.m17288U(), null, null);
        final zzbzl zzbzlVarZza = zzbzl.zza(zzcekVarZza);
        zzi(zzcekVarZza, c7333b, zzbxfVar);
        zzcekVarZza.zzP().zzH(new zzcgh() { // from class: com.google.android.gms.internal.ads.zzdmq
            @Override // com.google.android.gms.internal.ads.zzcgh
            public final /* synthetic */ void zza() {
                zzbzlVarZza.zzb();
            }
        });
        zzcekVarZza.loadUrl((String) C3250D.m17200c().zzd(zzbci.zzej));
        return zzbzlVarZza;
    }

    final /* synthetic */ void zzf(zzcek zzcekVar, zzbzl zzbzlVar, boolean z7, int i7, String str, String str2) {
        if (z7) {
            C3321a2 c3321a2 = this.zza.zza;
            if (c3321a2 != null && zzcekVar.zzh() != null) {
                zzcekVar.zzh().zzc(c3321a2);
            }
            zzbzlVar.zzb();
            return;
        }
        int length = String.valueOf(i7).length();
        StringBuilder sb = new StringBuilder(length + 63 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
        sb.append("Html video Web View failed to load. Error code: ");
        sb.append(i7);
        sb.append(", Description: ");
        sb.append(str);
        sb.append(", Failing URL: ");
        sb.append(str2);
        zzbzlVar.zzd(new zzeho(1, sb.toString()));
    }

    final /* synthetic */ void zzg(zzcek zzcekVar, zzbzl zzbzlVar, boolean z7, int i7, String str, String str2) {
        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzer)).booleanValue()) {
            zzh(zzcekVar, zzbzlVar);
            return;
        }
        if (z7) {
            zzh(zzcekVar, zzbzlVar);
            return;
        }
        int length = String.valueOf(i7).length();
        StringBuilder sb = new StringBuilder(length + 64 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
        sb.append("Native Video WebView failed to load. Error code: ");
        sb.append(i7);
        sb.append(", Description: ");
        sb.append(str);
        sb.append(", Failing URL: ");
        sb.append(str2);
        zzbzlVar.zzd(new zzeho(1, sb.toString()));
    }
}
