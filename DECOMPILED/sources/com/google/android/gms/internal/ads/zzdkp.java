package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.C3244B;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.client.C3369m2;
import com.google.android.gms.ads.internal.util.AbstractC3456V;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import p404z2.AbstractC7599p;
import p404z2.C7590g;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdkp {
    private final zzdpi zza;
    private final zzdnx zzb;
    private ViewTreeObserver.OnScrollChangedListener zzc = null;

    public zzdkp(zzdpi zzdpiVar, zzdnx zzdnxVar) {
        this.zza = zzdpiVar;
        this.zzb = zzdnxVar;
    }

    private static final int zzf(Context context, String str, int i7) {
        try {
            i7 = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        C3244B.m17190a();
        return C7590g.m33276c(context, i7);
    }

    public final View zza(final View view, final WindowManager windowManager) throws zzcez {
        zzcek zzcekVarZza = this.zza.zza(C3369m2.m17288U(), null, null);
        zzcekVarZza.zzE().setVisibility(4);
        zzcekVarZza.zzE().setContentDescription("policy_validator");
        zzcekVarZza.zzab("/sendMessageToSdk", new zzbjl() { // from class: com.google.android.gms.internal.ads.zzdko
            @Override // com.google.android.gms.internal.ads.zzbjl
            public final /* synthetic */ void zza(Object obj, Map map) {
                this.zza.zzb((zzcek) obj, map);
            }
        });
        zzcekVarZza.zzab("/hideValidatorOverlay", new zzbjl() { // from class: com.google.android.gms.internal.ads.zzdkj
            @Override // com.google.android.gms.internal.ads.zzbjl
            public final /* synthetic */ void zza(Object obj, Map map) {
                this.zza.zzc(windowManager, view, (zzcek) obj, map);
            }
        });
        zzcekVarZza.zzab("/open", new zzbjy(null, null, null, null, null, null));
        WeakReference weakReference = new WeakReference(zzcekVarZza);
        zzbjl zzbjlVar = new zzbjl() { // from class: com.google.android.gms.internal.ads.zzdkk
            @Override // com.google.android.gms.internal.ads.zzbjl
            public final /* synthetic */ void zza(Object obj, Map map) {
                this.zza.zzd(view, windowManager, (zzcek) obj, map);
            }
        };
        zzdnx zzdnxVar = this.zzb;
        zzdnxVar.zzh(weakReference, "/loadNativeAdPolicyViolations", zzbjlVar);
        zzdnxVar.zzh(new WeakReference(zzcekVarZza), "/showValidatorOverlay", zzdkl.zza);
        return zzcekVarZza.zzE();
    }

    final /* synthetic */ void zzb(zzcek zzcekVar, Map map) {
        this.zzb.zzf("sendMessageToNativeJs", map);
    }

    final /* synthetic */ void zzc(WindowManager windowManager, View view, zzcek zzcekVar, Map map) {
        int i7 = AbstractC3490o0.f14278b;
        AbstractC7599p.m33326a("Hide native ad policy validator overlay.");
        zzcekVar.zzE().setVisibility(8);
        if (zzcekVar.zzE().getWindowToken() != null) {
            windowManager.removeView(zzcekVar.zzE());
        }
        zzcekVar.destroy();
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (this.zzc == null || viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            return;
        }
        viewTreeObserver.removeOnScrollChangedListener(this.zzc);
    }

    final /* synthetic */ void zzd(final View view, final WindowManager windowManager, zzcek zzcekVar, final Map map) {
        final zzcek zzcekVar2;
        zzcekVar.zzP().zzG(new zzcgg() { // from class: com.google.android.gms.internal.ads.zzdkn
            @Override // com.google.android.gms.internal.ads.zzcgg
            public final /* synthetic */ void zza(boolean z7, int i7, String str, String str2) {
                this.zza.zze(map, z7, i7, str, str2);
            }
        });
        if (map == null) {
            return;
        }
        Context context = view.getContext();
        int iZzf = zzf(context, (String) map.get("validator_width"), ((Integer) C3250D.m17200c().zzd(zzbci.zziP)).intValue());
        int iZzf2 = zzf(context, (String) map.get("validator_height"), ((Integer) C3250D.m17200c().zzd(zzbci.zziQ)).intValue());
        int iZzf3 = zzf(context, (String) map.get("validator_x"), 0);
        int iZzf4 = zzf(context, (String) map.get("validator_y"), 0);
        zzcekVar.zzaf(zzcgt.zzc(iZzf, iZzf2));
        try {
            zzcekVar.zzD().getSettings().setUseWideViewPort(((Boolean) C3250D.m17200c().zzd(zzbci.zziR)).booleanValue());
            zzcekVar.zzD().getSettings().setLoadWithOverviewMode(((Boolean) C3250D.m17200c().zzd(zzbci.zziS)).booleanValue());
        } catch (NullPointerException unused) {
        }
        final WindowManager.LayoutParams layoutParamsM17502k = AbstractC3456V.m17502k();
        layoutParamsM17502k.x = iZzf3;
        layoutParamsM17502k.y = iZzf4;
        windowManager.updateViewLayout(zzcekVar.zzE(), layoutParamsM17502k);
        final String str = (String) map.get("orientation");
        Rect rect = new Rect();
        if (view.getGlobalVisibleRect(rect)) {
            final int i7 = (("1".equals(str) || "2".equals(str)) ? rect.bottom : rect.top) - iZzf4;
            zzcekVar2 = zzcekVar;
            this.zzc = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.google.android.gms.internal.ads.zzdkm
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final /* synthetic */ void onScrollChanged() {
                    Rect rect2 = new Rect();
                    if (view.getGlobalVisibleRect(rect2)) {
                        zzcek zzcekVar3 = zzcekVar2;
                        if (zzcekVar3.zzE().getWindowToken() == null) {
                            return;
                        }
                        int i8 = i7;
                        WindowManager.LayoutParams layoutParams = layoutParamsM17502k;
                        String str2 = str;
                        if ("1".equals(str2) || "2".equals(str2)) {
                            layoutParams.y = rect2.bottom - i8;
                        } else {
                            layoutParams.y = rect2.top - i8;
                        }
                        windowManager.updateViewLayout(zzcekVar3.zzE(), layoutParams);
                    }
                }
            };
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnScrollChangedListener(this.zzc);
            }
        } else {
            zzcekVar2 = zzcekVar;
        }
        String str2 = (String) map.get("overlay_url");
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        zzcekVar2.loadUrl(str2);
    }

    final /* synthetic */ void zze(Map map, boolean z7, int i7, String str, String str2) {
        HashMap map2 = new HashMap();
        map2.put("messageType", "validatorHtmlLoaded");
        map2.put("id", (String) map.get("id"));
        this.zzb.zzf("sendMessageToNativeJs", map2);
    }
}
