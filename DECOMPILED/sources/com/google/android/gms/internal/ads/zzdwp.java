package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.AbstractBinderC3307W0;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.client.InterfaceC3328c1;
import com.google.android.gms.ads.internal.util.C3431F0;
import com.google.android.gms.ads.nativead.C3521b;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.dynamic.BinderC3773b;
import com.google.android.gms.dynamic.InterfaceC3772a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import p004A2.AbstractC0012a;
import p068I2.AbstractC0608c;
import p076J2.AbstractC0679a;
import p314o2.AbstractC6559k;
import p314o2.C6554f;
import p314o2.C6557i;
import p314o2.C6561m;
import p314o2.C6571w;
import p314o2.C6574z;
import p324p2.C6735b;
import p332q2.AbstractC6824a;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdwp extends AbstractBinderC3307W0 {
    final Map zza = new HashMap();
    private final Context zzb;
    private final WeakReference zzc;
    private final zzdwd zzd;
    private final zzgpd zze;
    private zzdvs zzf;

    zzdwp(Context context, WeakReference weakReference, zzdwd zzdwdVar, zzdwr zzdwrVar, zzgpd zzgpdVar) {
        this.zzb = context;
        this.zzc = weakReference;
        this.zzd = zzdwdVar;
        this.zze = zzgpdVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzj, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzg(String str) {
        try {
            zzgot.zzq(this.zzf.zzn(str), new zzdwk(this), this.zze);
        } catch (NullPointerException e7) {
            C7351t.m32354l().zzg(e7, "OutOfContextTester.setAdAsOutOfContext");
            this.zzd.zzn();
        }
    }

    private final synchronized void zzk(String str) {
        try {
            zzgot.zzq(this.zzf.zzn(str), new zzdwl(this), this.zze);
        } catch (NullPointerException e7) {
            C7351t.m32354l().zzg(e7, "OutOfContextTester.setAdAsShown");
            this.zzd.zzn();
        }
    }

    private final Context zzl() {
        Context context = (Context) this.zzc.get();
        return context == null ? this.zzb : context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzm(Object obj) {
        C6571w responseInfo;
        InterfaceC3328c1 interfaceC3328c1M27867g;
        if (obj instanceof C6561m) {
            responseInfo = ((C6561m) obj).m27853f();
        } else if (obj instanceof AbstractC6824a) {
            responseInfo = ((AbstractC6824a) obj).getResponseInfo();
        } else if (obj instanceof AbstractC0012a) {
            responseInfo = ((AbstractC0012a) obj).getResponseInfo();
        } else if (obj instanceof AbstractC0608c) {
            responseInfo = ((AbstractC0608c) obj).getResponseInfo();
        } else if (obj instanceof AbstractC0679a) {
            responseInfo = ((AbstractC0679a) obj).getResponseInfo();
        } else if (obj instanceof C6557i) {
            responseInfo = ((C6557i) obj).getResponseInfo();
        } else {
            if (!(obj instanceof NativeAd)) {
                return "";
            }
            responseInfo = ((NativeAd) obj).getResponseInfo();
        }
        if (responseInfo == null || (interfaceC3328c1M27867g = responseInfo.m27867g()) == null) {
            return "";
        }
        try {
            return interfaceC3328c1M27867g.zzj();
        } catch (RemoteException unused) {
            return "";
        }
    }

    public final void zzb(zzdvs zzdvsVar) {
        this.zzf = zzdvsVar;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final synchronized void zzc(zzdwq zzdwqVar) {
        byte b7;
        try {
            String strZzb = zzdwqVar.zzb();
            switch (strZzb.hashCode()) {
                case -1999289321:
                    if (!strZzb.equals("NATIVE")) {
                        b7 = -1;
                    } else {
                        b7 = 3;
                    }
                    break;
                case -1372958932:
                    if (!strZzb.equals("INTERSTITIAL")) {
                        b7 = -1;
                    } else {
                        b7 = 2;
                    }
                    break;
                case -428325382:
                    if (!strZzb.equals("APP_OPEN_AD")) {
                        b7 = -1;
                    } else {
                        b7 = 0;
                    }
                    break;
                case 543046670:
                    if (!strZzb.equals("REWARDED")) {
                        b7 = -1;
                    } else {
                        b7 = 4;
                    }
                    break;
                case 1854800829:
                    if (!strZzb.equals("REWARDED_INTERSTITIAL")) {
                        b7 = -1;
                    } else {
                        b7 = 5;
                    }
                    break;
                case 1951953708:
                    if (!strZzb.equals("BANNER")) {
                        b7 = -1;
                    } else {
                        b7 = 1;
                    }
                    break;
                default:
                    b7 = -1;
                    break;
            }
            if (b7 == 0) {
                String strZza = zzdwqVar.zza();
                AbstractC6824a.load(zzl(), strZza, zzdwqVar.zzc(), new zzdwe(this, strZza));
                return;
            }
            if (b7 == 1) {
                String strZza2 = zzdwqVar.zza();
                zzbbz zzbbzVar = zzbci.zzki;
                AbstractC6559k c6735b = (((Boolean) C3250D.m17200c().zzd(zzbbzVar)).booleanValue() && zzdwqVar.zzg()) ? new C6735b(zzl()) : new C6557i(zzl());
                c6735b.setAdSize(zzdwqVar.zzd());
                c6735b.setAdUnitId(strZza2);
                c6735b.setAdListener(new zzdwf(this, strZza2, c6735b));
                C6574z c6574zZzf = zzdwqVar.zzf();
                if (((Boolean) C3250D.m17200c().zzd(zzbbzVar)).booleanValue() && zzdwqVar.zzg() && c6574zZzf != null) {
                    ((C6735b) c6735b).setVideoOptions(c6574zZzf);
                }
                c6735b.m27849b(zzdwqVar.zzc());
                return;
            }
            if (b7 == 2) {
                String strZza3 = zzdwqVar.zza();
                AbstractC0012a.load(zzl(), strZza3, zzdwqVar.zzc(), new zzdwg(this, strZza3));
                return;
            }
            if (b7 != 3) {
                if (b7 == 4) {
                    String strZza4 = zzdwqVar.zza();
                    AbstractC0608c.load(zzl(), strZza4, zzdwqVar.zzc(), new zzdwh(this, strZza4));
                    return;
                } else {
                    if (b7 != 5) {
                        return;
                    }
                    String strZza5 = zzdwqVar.zza();
                    AbstractC0679a.load(zzl(), strZza5, zzdwqVar.zzc(), new zzdwi(this, strZza5));
                    return;
                }
            }
            final String strZza6 = zzdwqVar.zza();
            C6554f.a aVar = new C6554f.a(zzl(), strZza6);
            aVar.m27818b(new NativeAd.InterfaceC3518c() { // from class: com.google.android.gms.internal.ads.zzdwn
                @Override // com.google.android.gms.ads.nativead.NativeAd.InterfaceC3518c
                public final /* synthetic */ void onNativeAdLoaded(NativeAd nativeAd) {
                    this.zza.zzf(strZza6, nativeAd);
                }
            });
            aVar.m27819c(new zzdwj(this));
            C3521b c3521bZze = zzdwqVar.zze();
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzki)).booleanValue() && c3521bZze != null) {
                aVar.m27820d(c3521bZze);
            }
            aVar.m27817a().m27815a(zzdwqVar.zzc());
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzd(String str) {
        Map map;
        Object obj;
        try {
            Activity activityZzo = this.zzd.zzo();
            if (activityZzo != null && (obj = (map = this.zza).get(str)) != null) {
                zzbbz zzbbzVar = zzbci.zzkh;
                if (!((Boolean) C3250D.m17200c().zzd(zzbbzVar)).booleanValue() || (obj instanceof AbstractC6824a) || (obj instanceof AbstractC0012a) || (obj instanceof AbstractC0608c) || (obj instanceof AbstractC0679a)) {
                    map.remove(str);
                }
                zzk(zzm(obj));
                if (obj instanceof AbstractC6824a) {
                    ((AbstractC6824a) obj).show(activityZzo);
                    return;
                }
                if (obj instanceof AbstractC0012a) {
                    ((AbstractC0012a) obj).show(activityZzo);
                    return;
                }
                if (obj instanceof AbstractC0608c) {
                    ((AbstractC0608c) obj).show(activityZzo, zzdwo.zza);
                    return;
                }
                if (obj instanceof AbstractC0679a) {
                    ((AbstractC0679a) obj).show(activityZzo, zzdwm.zza);
                    return;
                }
                if (((Boolean) C3250D.m17200c().zzd(zzbbzVar)).booleanValue() && ((obj instanceof C6557i) || (obj instanceof NativeAd))) {
                    Intent intent = new Intent();
                    Context contextZzl = zzl();
                    intent.setClassName(contextZzl, "com.google.android.gms.ads.OutOfContextTestingActivity");
                    intent.putExtra("adUnit", str);
                    C7351t.m32349g();
                    C3431F0.m17434y(contextZzl, intent);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3310X0
    public final void zze(String str, InterfaceC3772a interfaceC3772a, InterfaceC3772a interfaceC3772a2) {
        Context context = (Context) BinderC3773b.m18220M0(interfaceC3772a);
        ViewGroup viewGroup = (ViewGroup) BinderC3773b.m18220M0(interfaceC3772a2);
        if (context == null || viewGroup == null) {
            return;
        }
        Map map = this.zza;
        Object obj = map.get(str);
        if (obj != null) {
            map.remove(str);
        }
        if (obj instanceof C6557i) {
            zzdwr.zza(context, viewGroup, (C6557i) obj);
        } else if (obj instanceof NativeAd) {
            zzdwr.zzb(context, viewGroup, (NativeAd) obj);
        }
    }

    protected final synchronized void zzf(String str, Object obj) {
        this.zza.put(str, obj);
        zzg(zzm(obj));
    }

    final /* synthetic */ zzdwd zzi() {
        return this.zzd;
    }
}
