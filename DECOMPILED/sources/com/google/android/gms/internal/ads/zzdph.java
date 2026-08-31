package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.client.InterfaceC3318a;
import java.util.Map;
import java.util.concurrent.Executor;
import p157U3.InterfaceFutureC1673e;
import p380w2.C7333b;
import p380w2.C7351t;
import p396y2.InterfaceC7516d;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdph {
    private final zzcvq zza;
    private final zzddx zzb;
    private final zzcwz zzc;
    private final zzcxm zzd;
    private final zzcyd zze;
    private final zzdaw zzf;
    private final Executor zzg;
    private final zzddt zzh;
    private final zzcnf zzi;
    private final C7333b zzj;
    private final zzbxf zzk;
    private final zzauu zzl;
    private final zzdan zzm;
    private final zzecn zzn;
    private final zzfjv zzo;
    private final zzdsm zzp;
    private final zzcmi zzq;
    private final zzdpn zzr;
    private final zzdtp zzs;
    private final zzcur zzt;

    public zzdph(zzcvq zzcvqVar, zzcwz zzcwzVar, zzcxm zzcxmVar, zzcyd zzcydVar, zzdaw zzdawVar, Executor executor, zzddt zzddtVar, zzcnf zzcnfVar, C7333b c7333b, zzbxf zzbxfVar, zzauu zzauuVar, zzdan zzdanVar, zzecn zzecnVar, zzfjv zzfjvVar, zzdsm zzdsmVar, zzddx zzddxVar, zzcmi zzcmiVar, zzdpn zzdpnVar, zzdtp zzdtpVar, zzcur zzcurVar) {
        this.zza = zzcvqVar;
        this.zzc = zzcwzVar;
        this.zzd = zzcxmVar;
        this.zze = zzcydVar;
        this.zzf = zzdawVar;
        this.zzg = executor;
        this.zzh = zzddtVar;
        this.zzi = zzcnfVar;
        this.zzj = c7333b;
        this.zzk = zzbxfVar;
        this.zzl = zzauuVar;
        this.zzm = zzdanVar;
        this.zzn = zzecnVar;
        this.zzo = zzfjvVar;
        this.zzp = zzdsmVar;
        this.zzb = zzddxVar;
        this.zzq = zzcmiVar;
        this.zzr = zzdpnVar;
        this.zzs = zzdtpVar;
        this.zzt = zzcurVar;
    }

    public static final InterfaceFutureC1673e zzj(zzcek zzcekVar, String str, String str2, final Bundle bundle, zzfib zzfibVar) {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzcu)).booleanValue()) {
            bundle.putLong(zzdru.RENDERING_WEBVIEW_LOAD_HTML_START.zza(), C7351t.m32357o().mo18159a());
        }
        final zzbzm zzbzmVar = new zzbzm();
        if (((Boolean) zzbeb.zzf.zze()).booleanValue()) {
            zzfhr zzfhrVarZzn = zzfhr.zzn(zzcekVar.getContext(), 112);
            zzfhrVarZzn.zza();
            zzfia.zzd(zzbzmVar, zzfibVar, zzfhrVarZzn);
        }
        zzcekVar.zzP().zzG(new zzcgg() { // from class: com.google.android.gms.internal.ads.zzdpf
            @Override // com.google.android.gms.internal.ads.zzcgg
            public final /* synthetic */ void zza(boolean z7, int i7, String str3, String str4) {
                zzbzm zzbzmVar2 = zzbzmVar;
                if (z7) {
                    if (((Boolean) C3250D.m17200c().zzd(zzbci.zzcu)).booleanValue()) {
                        bundle.putLong(zzdru.RENDERING_WEBVIEW_LOAD_HTML_END.zza(), C7351t.m32357o().mo18159a());
                    }
                    zzbzmVar2.zzc(null);
                    return;
                }
                int length = String.valueOf(i7).length();
                StringBuilder sb = new StringBuilder(length + 55 + String.valueOf(str3).length() + 15 + String.valueOf(str4).length());
                sb.append("Ad Web View failed to load. Error code: ");
                sb.append(i7);
                sb.append(", Description: ");
                sb.append(str3);
                sb.append(", Failing URL: ");
                sb.append(str4);
                zzbzmVar2.zzd(new Exception(sb.toString()));
            }
        });
        zzcekVar.zzau(str, str2, null);
        return zzbzmVar;
    }

    final /* synthetic */ void zza() {
        this.zza.onAdClicked();
    }

    final /* synthetic */ void zzb(String str, String str2) {
        this.zzf.zzb(str, str2);
    }

    final /* synthetic */ void zzc() {
        this.zzc.zzb();
    }

    final /* synthetic */ boolean zzd(View view, MotionEvent motionEvent) {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzkQ)).booleanValue() && motionEvent != null && motionEvent.getAction() == 0) {
            this.zzr.zza(motionEvent);
        }
        this.zzj.m32305a();
        if (view == null) {
            return false;
        }
        view.performClick();
        return false;
    }

    final /* synthetic */ void zze(View view) {
        this.zzj.m32305a();
    }

    final /* synthetic */ void zzf(zzcek zzcekVar, zzcek zzcekVar2, Map map) {
        this.zzi.zzn(zzcekVar);
    }

    final /* synthetic */ zzcwz zzg() {
        return this.zzc;
    }

    final /* synthetic */ zzdan zzh() {
        return this.zzm;
    }

    public final void zzi(final zzcek zzcekVar, boolean z7, zzbjo zzbjoVar, Bundle bundle) {
        zzaup zzaupVarZzb;
        zzbbz zzbbzVar = zzbci.zzcu;
        if (((Boolean) C3250D.m17200c().zzd(zzbbzVar)).booleanValue()) {
            bundle.putLong(zzdru.RENDERING_CONFIGURE_WEBVIEW_START.zza(), C7351t.m32357o().mo18159a());
        }
        zzcekVar.zzP().zzZ(new InterfaceC3318a() { // from class: com.google.android.gms.internal.ads.zzdpg
            @Override // com.google.android.gms.ads.internal.client.InterfaceC3318a
            public final /* synthetic */ void onAdClicked() {
                this.zza.zza();
            }
        }, this.zzd, this.zze, new zzbid() { // from class: com.google.android.gms.internal.ads.zzdoz
            @Override // com.google.android.gms.internal.ads.zzbid
            public final /* synthetic */ void zzb(String str, String str2) {
                this.zza.zzb(str, str2);
            }
        }, new InterfaceC7516d() { // from class: com.google.android.gms.internal.ads.zzdpa
            @Override // p396y2.InterfaceC7516d
            public final /* synthetic */ void zzl() {
                this.zza.zzc();
            }
        }, z7, zzbjoVar, this.zzj, new zzdoy(this), this.zzk, this.zzn, this.zzo, this.zzp, null, this.zzb, null, null, null, this.zzq, this.zzs, this.zzt);
        zzcekVar.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.gms.internal.ads.zzdpb
            @Override // android.view.View.OnTouchListener
            public final /* synthetic */ boolean onTouch(View view, MotionEvent motionEvent) {
                this.zza.zzd(view, motionEvent);
                return false;
            }
        });
        zzcekVar.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzdpc
            @Override // android.view.View.OnClickListener
            public final /* synthetic */ void onClick(View view) {
                this.zza.zze(view);
            }
        });
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzcV)).booleanValue() && (zzaupVarZzb = this.zzl.zzb()) != null) {
            zzaupVarZzb.zzh(zzcekVar.zzE());
        }
        zzddt zzddtVar = this.zzh;
        Executor executor = this.zzg;
        zzddtVar.zzq(zzcekVar, executor);
        zzddtVar.zzq(new zzayi() { // from class: com.google.android.gms.internal.ads.zzdpd
            @Override // com.google.android.gms.internal.ads.zzayi
            public final /* synthetic */ void zzdo(zzayh zzayhVar) {
                Rect rect = zzayhVar.zzd;
                zzcekVar.zzP().zza(rect.left, rect.top, false);
            }
        }, executor);
        zzddtVar.zza(zzcekVar.zzE());
        zzcekVar.zzab("/trackActiveViewUnit", new zzbjl() { // from class: com.google.android.gms.internal.ads.zzdpe
            @Override // com.google.android.gms.internal.ads.zzbjl
            public final /* synthetic */ void zza(Object obj, Map map) {
                this.zza.zzf(zzcekVar, (zzcek) obj, map);
            }
        });
        this.zzi.zzo(zzcekVar);
        if (((Boolean) C3250D.m17200c().zzd(zzbbzVar)).booleanValue()) {
            bundle.putLong(zzdru.RENDERING_CONFIGURE_WEBVIEW_END.zza(), C7351t.m32357o().mo18159a());
        }
    }
}
