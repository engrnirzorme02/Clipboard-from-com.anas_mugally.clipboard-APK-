package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import android.os.StrictMode;
import p157U3.InterfaceFutureC1673e;
import p380w2.C7332a;
import p380w2.C7351t;
import p380w2.InterfaceC7345n;
import p404z2.C7584a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcfa {
    public static final zzcek zza(final Context context, final zzcgt zzcgtVar, final String str, final boolean z7, final boolean z8, final zzauu zzauuVar, final zzbdp zzbdpVar, final C7584a c7584a, zzbcx zzbcxVar, final InterfaceC7345n interfaceC7345n, final C7332a c7332a, final zzbbh zzbbhVar, final zzfcj zzfcjVar, final zzfcm zzfcmVar, final zzecy zzecyVar, final zzfdg zzfdgVar, final zzdsm zzdsmVar) throws zzcez {
        zzbci.zza(context);
        try {
            final zzbcx zzbcxVar2 = null;
            zzght zzghtVar = new zzght(context, zzcgtVar, str, z7, z8, zzauuVar, zzbdpVar, c7584a, zzbcxVar2, interfaceC7345n, c7332a, zzbbhVar, zzfcjVar, zzfcmVar, zzfdgVar, zzdsmVar, zzecyVar) { // from class: com.google.android.gms.internal.ads.zzcew
                private final /* synthetic */ Context zza;
                private final /* synthetic */ zzcgt zzb;
                private final /* synthetic */ String zzc;
                private final /* synthetic */ boolean zzd;
                private final /* synthetic */ boolean zze;
                private final /* synthetic */ zzauu zzf;
                private final /* synthetic */ zzbdp zzg;
                private final /* synthetic */ C7584a zzh;
                private final /* synthetic */ InterfaceC7345n zzi;
                private final /* synthetic */ C7332a zzj;
                private final /* synthetic */ zzbbh zzk;
                private final /* synthetic */ zzfcj zzl;
                private final /* synthetic */ zzfcm zzm;
                private final /* synthetic */ zzfdg zzn;
                private final /* synthetic */ zzdsm zzo;
                private final /* synthetic */ zzecy zzp;

                {
                    this.zzi = interfaceC7345n;
                    this.zzj = c7332a;
                    this.zzk = zzbbhVar;
                    this.zzl = zzfcjVar;
                    this.zzm = zzfcmVar;
                    this.zzn = zzfdgVar;
                    this.zzo = zzdsmVar;
                    this.zzp = zzecyVar;
                }

                @Override // com.google.android.gms.internal.ads.zzght
                public final /* synthetic */ Object zza() {
                    zzcgt zzcgtVar2 = this.zzb;
                    String str2 = this.zzc;
                    boolean z9 = this.zzd;
                    boolean z10 = this.zze;
                    zzecy zzecyVar2 = this.zzp;
                    zzdsm zzdsmVar2 = this.zzo;
                    InterfaceC7345n interfaceC7345n2 = this.zzi;
                    C7332a c7332a2 = this.zzj;
                    zzbbh zzbbhVar2 = this.zzk;
                    zzfcj zzfcjVar2 = this.zzl;
                    zzfcm zzfcmVar2 = this.zzm;
                    zzfdg zzfdgVar2 = this.zzn;
                    zzauu zzauuVar2 = this.zzf;
                    zzbdp zzbdpVar2 = this.zzg;
                    C7584a c7584a2 = this.zzh;
                    Context context2 = this.zza;
                    try {
                        TrafficStats.setThreadStatsTag(264);
                        int i7 = zzcfn.zza;
                        zzcfg zzcfgVar = new zzcfg(new zzcfn(new zzcgl(context2), zzcgtVar2, str2, z9, z10, zzauuVar2, zzbdpVar2, c7584a2, null, interfaceC7345n2, c7332a2, zzbbhVar2, zzfcjVar2, zzfcmVar2, zzfdgVar2), zzdsmVar2);
                        zzcfgVar.setWebViewClient(C7351t.m32352j().mo17459b(zzcfgVar, zzbbhVar2, z10, zzecyVar2));
                        zzcfgVar.setWebChromeClient(new zzcej(zzcfgVar));
                        return zzcfgVar;
                    } finally {
                        TrafficStats.clearThreadStatsTag();
                    }
                }
            };
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                return (zzcek) zzghtVar.zza();
            } finally {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        } catch (Throwable th) {
            throw new zzcez("Webview initialization failed.", th);
        }
    }

    public static final InterfaceFutureC1673e zzb(final Context context, final C7584a c7584a, final String str, final zzauu zzauuVar, final C7332a c7332a, final zzecy zzecyVar, final zzfdg zzfdgVar, final zzdsm zzdsmVar) {
        return zzgot.zzf(new zzgoa() { // from class: com.google.android.gms.internal.ads.zzcey
            @Override // com.google.android.gms.internal.ads.zzgoa
            public final /* synthetic */ InterfaceFutureC1673e zza() throws zzcez {
                C7351t.m32350h();
                Context context2 = context;
                zzcgt zzcgtVarZzb = zzcgt.zzb();
                C7332a c7332a2 = c7332a;
                zzbbh zzbbhVarZza = zzbbh.zza();
                zzecy zzecyVar2 = zzecyVar;
                zzfdg zzfdgVar2 = zzfdgVar;
                zzdsm zzdsmVar2 = zzdsmVar;
                zzcek zzcekVarZza = zzcfa.zza(context2, zzcgtVarZzb, "", false, false, zzauuVar, null, c7584a, null, null, c7332a2, zzbbhVarZza, null, null, zzecyVar2, zzfdgVar2, zzdsmVar2);
                final zzbzl zzbzlVarZza = zzbzl.zza(zzcekVarZza);
                zzcekVarZza.zzP().zzG(new zzcgg() { // from class: com.google.android.gms.internal.ads.zzcex
                    @Override // com.google.android.gms.internal.ads.zzcgg
                    public final /* synthetic */ void zza(boolean z7, int i7, String str2, String str3) {
                        zzbzlVarZza.zzb();
                    }
                });
                zzcekVarZza.loadUrl(str);
                return zzbzlVarZza;
            }
        }, zzbzh.zzf);
    }
}
