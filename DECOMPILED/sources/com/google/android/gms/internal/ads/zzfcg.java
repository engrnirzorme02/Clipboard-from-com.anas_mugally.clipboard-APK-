package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.client.InterfaceC3328c1;
import com.google.android.gms.ads.internal.client.InterfaceC3331d0;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.dynamic.BinderC3773b;
import com.google.android.gms.dynamic.InterfaceC3772a;
import java.util.regex.Pattern;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfcg extends zzbvj {
    private final zzfbw zza;
    private final zzfbn zzb;
    private final zzfcv zzc;
    private zzdom zzd;
    private boolean zze = false;

    public zzfcg(zzfbw zzfbwVar, zzfbn zzfbnVar, zzfcv zzfcvVar) {
        this.zza = zzfbwVar;
        this.zzb = zzfbnVar;
        this.zzc = zzfcvVar;
    }

    private final synchronized boolean zzy() {
        zzdom zzdomVar = this.zzd;
        return (zzdomVar == null || zzdomVar.zze()) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.C3250D.m17200c().zzd(com.google.android.gms.internal.ads.zzbci.zzfX)).booleanValue() == false) goto L18;
     */
    @Override // com.google.android.gms.internal.ads.zzbvk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void zzb(zzbvo zzbvoVar) {
        AbstractC3718s.m18076e("loadAd must be called on the main UI thread.");
        String str = zzbvoVar.zzb;
        String str2 = (String) C3250D.m17200c().zzd(zzbci.zzfV);
        if (str2 != null && str != null) {
            try {
                if (!Pattern.matches(str2, str)) {
                }
            } catch (RuntimeException e7) {
                C7351t.m32354l().zzg(e7, "NonagonUtil.isPatternMatched");
            }
            return;
        }
        if (zzy()) {
        }
        zzfbp zzfbpVar = new zzfbp(null);
        this.zzd = null;
        zzfbw zzfbwVar = this.zza;
        zzfbwVar.zzj(1);
        zzfbwVar.zza(zzbvoVar.zza, zzbvoVar.zzb, zzfbpVar, new zzfce(this));
    }

    @Override // com.google.android.gms.internal.ads.zzbvk
    public final synchronized void zzc() {
        zzp(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbvk
    public final void zzd(zzbvn zzbvnVar) {
        AbstractC3718s.m18076e("setRewardedVideoAdListener can only be called from the UI thread.");
        this.zzb.zzn(zzbvnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbvk
    public final boolean zze() {
        AbstractC3718s.m18076e("isLoaded must be called on the main UI thread.");
        return zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbvk
    public final void zzf() {
        zzi(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbvk
    public final void zzg() {
        zzj(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbvk
    public final void zzh() {
        zzk(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbvk
    public final synchronized void zzi(InterfaceC3772a interfaceC3772a) {
        AbstractC3718s.m18076e("pause must be called on the main UI thread.");
        if (this.zzd != null) {
            this.zzd.zzl().zza(interfaceC3772a == null ? null : (Context) BinderC3773b.m18220M0(interfaceC3772a));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvk
    public final synchronized void zzj(InterfaceC3772a interfaceC3772a) {
        AbstractC3718s.m18076e("resume must be called on the main UI thread.");
        if (this.zzd != null) {
            this.zzd.zzl().zzb(interfaceC3772a == null ? null : (Context) BinderC3773b.m18220M0(interfaceC3772a));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvk
    public final synchronized void zzk(InterfaceC3772a interfaceC3772a) {
        AbstractC3718s.m18076e("destroy must be called on the main UI thread.");
        Context context = null;
        this.zzb.zzk(null);
        if (this.zzd != null) {
            if (interfaceC3772a != null) {
                context = (Context) BinderC3773b.m18220M0(interfaceC3772a);
            }
            this.zzd.zzl().zzc(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvk
    public final synchronized String zzl() {
        zzdom zzdomVar = this.zzd;
        if (zzdomVar == null || zzdomVar.zzn() == null) {
            return null;
        }
        return zzdomVar.zzn().zze();
    }

    @Override // com.google.android.gms.internal.ads.zzbvk
    public final synchronized void zzm(String str) {
        AbstractC3718s.m18076e("setUserId must be called on the main UI thread.");
        this.zzc.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbvk
    public final void zzn(InterfaceC3331d0 interfaceC3331d0) {
        AbstractC3718s.m18076e("setAdMetadataListener can only be called from the UI thread.");
        if (interfaceC3331d0 == null) {
            this.zzb.zzk(null);
        } else {
            this.zzb.zzk(new zzfcf(this, interfaceC3331d0));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvk
    public final Bundle zzo() {
        AbstractC3718s.m18076e("getAdMetadata can only be called from the UI thread.");
        zzdom zzdomVar = this.zzd;
        return zzdomVar != null ? zzdomVar.zzg() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbvk
    public final synchronized void zzp(InterfaceC3772a interfaceC3772a) {
        try {
            AbstractC3718s.m18076e("showAd must be called on the main UI thread.");
            if (this.zzd != null) {
                Activity activity = null;
                if (interfaceC3772a != null) {
                    Object objM18220M0 = BinderC3773b.m18220M0(interfaceC3772a);
                    if (objM18220M0 instanceof Activity) {
                        activity = (Activity) objM18220M0;
                    }
                }
                this.zzd.zza(this.zze, activity);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvk
    public final synchronized void zzq(String str) {
        AbstractC3718s.m18076e("#008 Must be called on the main UI thread.: setCustomData");
        this.zzc.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbvk
    public final synchronized void zzr(boolean z7) {
        AbstractC3718s.m18076e("setImmersiveMode must be called on the main UI thread.");
        this.zze = z7;
    }

    @Override // com.google.android.gms.internal.ads.zzbvk
    public final boolean zzs() {
        zzdom zzdomVar = this.zzd;
        return zzdomVar != null && zzdomVar.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzbvk
    public final synchronized InterfaceC3328c1 zzt() {
        zzdom zzdomVar;
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzhg)).booleanValue() && (zzdomVar = this.zzd) != null) {
            return zzdomVar.zzn();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvk
    public final void zzu(zzbvi zzbviVar) {
        AbstractC3718s.m18076e("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.zzb.zzp(zzbviVar);
    }

    final /* synthetic */ zzfcv zzv() {
        return this.zzc;
    }

    final /* synthetic */ zzdom zzw() {
        return this.zzd;
    }

    final /* synthetic */ void zzx(zzdom zzdomVar) {
        this.zzd = zzdomVar;
    }
}
