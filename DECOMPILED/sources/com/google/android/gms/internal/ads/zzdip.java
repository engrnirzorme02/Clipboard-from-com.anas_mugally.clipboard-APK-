package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.collection.C2390a;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.client.InterfaceC3260G0;
import com.google.android.gms.ads.internal.client.InterfaceC3272K0;
import com.google.android.gms.ads.internal.client.InterfaceC3301U0;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.ads.internal.util.C3431F0;
import com.google.android.gms.dynamic.BinderC3773b;
import com.google.android.gms.dynamic.InterfaceC3772a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;
import p157U3.InterfaceFutureC1673e;
import p380w2.C7351t;
import p404z2.AbstractC7599p;
import p404z2.C7584a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdip extends zzcqs {
    public static final zzgjz zzc = zzgjz.zzn("3010", "3008", "1005", "1009", "2011", "2007");
    private final List zzA;
    private final Executor zzd;
    private final zzdiu zze;
    private final zzdjc zzf;
    private final zzdjt zzg;
    private final zzdiz zzh;
    private final zzdje zzi;
    private final zzhpr zzj;
    private final zzhpr zzk;
    private final zzhpr zzl;
    private final zzhpr zzm;
    private final zzhpr zzn;
    private zzdkr zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private boolean zzs;
    private final zzbxo zzt;
    private final zzauu zzu;
    private final C7584a zzv;
    private final Context zzw;
    private final zzdir zzx;
    private final zzell zzy;
    private final Map zzz;

    public zzdip(zzcqr zzcqrVar, Executor executor, zzdiu zzdiuVar, zzdjc zzdjcVar, zzdjt zzdjtVar, zzdiz zzdizVar, zzdje zzdjeVar, zzhpr zzhprVar, zzhpr zzhprVar2, zzhpr zzhprVar3, zzhpr zzhprVar4, zzhpr zzhprVar5, zzbxo zzbxoVar, zzauu zzauuVar, C7584a c7584a, Context context, zzdir zzdirVar, zzell zzellVar, zzayl zzaylVar) {
        super(zzcqrVar);
        this.zzd = executor;
        this.zze = zzdiuVar;
        this.zzf = zzdjcVar;
        this.zzg = zzdjtVar;
        this.zzh = zzdizVar;
        this.zzi = zzdjeVar;
        this.zzj = zzhprVar;
        this.zzk = zzhprVar2;
        this.zzl = zzhprVar3;
        this.zzm = zzhprVar4;
        this.zzn = zzhprVar5;
        this.zzt = zzbxoVar;
        this.zzu = zzauuVar;
        this.zzv = c7584a;
        this.zzw = context;
        this.zzx = zzdirVar;
        this.zzy = zzellVar;
        this.zzz = new HashMap();
        this.zzA = new ArrayList();
    }

    public static boolean zzI(View view) {
        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzlt)).booleanValue()) {
            return view.isShown() && view.getGlobalVisibleRect(new Rect(), new Point());
        }
        C7351t.m32349g();
        long jM17400a = C3431F0.m17400a(view);
        if (view.isShown() && view.getGlobalVisibleRect(new Rect(), new Point())) {
            if (jM17400a >= ((Integer) C3250D.m17200c().zzd(zzbci.zzlu)).intValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzac, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzU(zzdkr zzdkrVar) {
        Iterator<String> itKeys;
        View view;
        zzaup zzaupVarZzb;
        try {
            if (!this.zzp) {
                this.zzo = zzdkrVar;
                this.zzg.zza(zzdkrVar);
                this.zzf.zza(zzdkrVar.zzdJ(), zzdkrVar.zzk(), zzdkrVar.zzl(), zzdkrVar, zzdkrVar);
                if (((Boolean) C3250D.m17200c().zzd(zzbci.zzcV)).booleanValue() && (zzaupVarZzb = this.zzu.zzb()) != null) {
                    zzaupVarZzb.zzh(zzdkrVar.zzdJ());
                }
                if (((Boolean) C3250D.m17200c().zzd(zzbci.zzbX)).booleanValue()) {
                    zzfcj zzfcjVar = this.zzb;
                    if (zzfcjVar.zzak && (itKeys = zzfcjVar.zzaj.keys()) != null) {
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            zzdkr zzdkrVar2 = this.zzo;
                            WeakReference weakReference = zzdkrVar2 == null ? null : (WeakReference) zzdkrVar2.zzj().get(next);
                            this.zzz.put(next, Boolean.FALSE);
                            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                                zzayk zzaykVar = new zzayk(this.zzw, view);
                                this.zzA.add(zzaykVar);
                                zzaykVar.zza(new zzdie(this, next));
                            }
                        }
                    }
                }
                if (zzdkrVar.zzh() != null) {
                    zzdkrVar.zzh().zza(this.zzt);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzad, reason: merged with bridge method [inline-methods] */
    public final void zzV(zzdkr zzdkrVar) {
        this.zzf.zzb(zzdkrVar.zzdJ(), zzdkrVar.zzj());
        if (zzdkrVar.zzdF() != null) {
            zzdkrVar.zzdF().setClickable(false);
            zzdkrVar.zzdF().removeAllViews();
        }
        if (zzdkrVar.zzh() != null) {
            zzdkrVar.zzh().zzb(this.zzt);
        }
        this.zzo = null;
    }

    private final synchronized void zzae(View view, Map map, Map map2) {
        this.zzg.zzc(this.zzo);
        this.zzf.zzw(view, map, map2, zzah());
        this.zzq = true;
    }

    private final synchronized void zzaf(View view, Map map, Map map2) {
        View viewZzag;
        if (!this.zzr && (viewZzag = zzag(map)) != null) {
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzon)).booleanValue()) {
                Rect rect = new Rect();
                if (viewZzag.getGlobalVisibleRect(rect, new Point()) && viewZzag.getHeight() == rect.height() && viewZzag.getWidth() == rect.width()) {
                    this.zzf.zzx(view, map, map2, zzah());
                    this.zzr = true;
                }
            } else if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzoo)).booleanValue()) {
                zzbbz zzbbzVar = zzbci.zzop;
                if (((Float) C3250D.m17200c().zzd(zzbbzVar)).floatValue() > 0.0d) {
                    double dFloatValue = ((Float) C3250D.m17200c().zzd(zzbbzVar)).floatValue();
                    Rect rect2 = new Rect();
                    if (viewZzag.getGlobalVisibleRect(rect2, new Point())) {
                        if (rect2.height() * rect2.width() >= ((double) (viewZzag.getHeight() * viewZzag.getWidth())) * (dFloatValue / 100.0d)) {
                            this.zzf.zzx(view, map, map2, zzah());
                            this.zzr = true;
                        }
                    }
                }
            } else if (zzI(viewZzag)) {
                this.zzf.zzx(view, map, map2, zzah());
                this.zzr = true;
            }
        }
    }

    private final synchronized View zzag(Map map) {
        if (map != null) {
            zzgjz zzgjzVar = zzc;
            int size = zzgjzVar.size();
            int i7 = 0;
            while (i7 < size) {
                WeakReference weakReference = (WeakReference) map.get((String) zzgjzVar.get(i7));
                i7++;
                if (weakReference != null) {
                    return (View) weakReference.get();
                }
            }
        }
        return null;
    }

    private final synchronized ImageView.ScaleType zzah() {
        zzdkr zzdkrVar = this.zzo;
        if (zzdkrVar == null) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33326a("Ad should be associated with an ad view before calling getMediaviewScaleType()");
            return null;
        }
        InterfaceC3772a interfaceC3772aZzo = zzdkrVar.zzo();
        if (interfaceC3772aZzo != null) {
            return (ImageView.ScaleType) BinderC3773b.m18220M0(interfaceC3772aZzo);
        }
        return zzdjt.zza;
    }

    private final void zzai(String str, boolean z7) {
        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzfQ)).booleanValue()) {
            zzL("Google", true);
            return;
        }
        InterfaceFutureC1673e interfaceFutureC1673eZzX = this.zze.zzX();
        if (interfaceFutureC1673eZzX == null) {
            return;
        }
        zzgot.zzq(interfaceFutureC1673eZzX, new zzdif(this, "Google", true), this.zzd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzaj, reason: merged with bridge method [inline-methods] */
    public final void zzY(View view, zzedu zzeduVar) {
        zzcek zzcekVarZzW = this.zze.zzW();
        if (!this.zzh.zzd() || zzeduVar == null || zzcekVarZzW == null || view == null) {
            return;
        }
        C7351t.m32367y().zzh(zzeduVar.zza(), view);
    }

    public final synchronized void zzA(InterfaceC3272K0 interfaceC3272K0) {
        this.zzf.zzr(interfaceC3272K0);
    }

    public final synchronized void zzB(InterfaceC3260G0 interfaceC3260G0) {
        this.zzf.zzs(interfaceC3260G0);
    }

    public final synchronized void zzC() {
        this.zzf.zzg();
    }

    public final synchronized void zzD() {
        zzdkr zzdkrVar = this.zzo;
        if (zzdkrVar == null) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33326a("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        } else {
            final boolean z7 = zzdkrVar instanceof zzdjn;
            this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdik
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzW(z7);
                }
            });
        }
    }

    public final synchronized void zzE(final View view, final int i7) {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzmp)).booleanValue()) {
            zzdkr zzdkrVar = this.zzo;
            if (zzdkrVar == null) {
                int i8 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33326a("Ad should be associated with an ad view before calling performClickForCustomGesture()");
            } else {
                final boolean z7 = zzdkrVar instanceof zzdjn;
                this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdil
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzX(view, z7, i7);
                    }
                });
            }
        }
    }

    public final synchronized boolean zzF() {
        return this.zzf.zzh();
    }

    public final synchronized int zzG() {
        return this.zzf.zzu();
    }

    public final synchronized boolean zzH() {
        return this.zzf.zzv();
    }

    public final boolean zzJ() {
        return this.zzh.zzc();
    }

    public final String zzK() {
        return this.zzh.zzf();
    }

    public final zzedu zzL(String str, boolean z7) {
        boolean z8;
        String str2;
        zzedq zzedqVar;
        zzedr zzedrVar;
        String str3;
        zzdiz zzdizVar = this.zzh;
        if (zzdizVar.zzd() && !TextUtils.isEmpty(str)) {
            zzdiu zzdiuVar = this.zze;
            zzcek zzcekVarZzW = zzdiuVar.zzW();
            zzcek zzcekVarZzT = zzdiuVar.zzT();
            if (zzcekVarZzW == null && zzcekVarZzT == null) {
                int i7 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33331f("Omid display and video webview are null. Skipping initialization.");
                return null;
            }
            zzdizVar.zzg();
            int iZzc = zzdizVar.zzg().zzc();
            int i8 = iZzc - 1;
            boolean z9 = false;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (iZzc != 1) {
                        str3 = iZzc != 2 ? "UNKNOWN" : "DISPLAY";
                    } else {
                        str3 = "VIDEO";
                    }
                    StringBuilder sb = new StringBuilder(str3.length() + 49);
                    sb.append("Unknown omid media type: ");
                    sb.append(str3);
                    sb.append(". Not initializing Omid.");
                    String string = sb.toString();
                    int i9 = AbstractC3490o0.f14278b;
                    AbstractC7599p.m33331f(string);
                    return null;
                }
                if (zzcekVarZzW == null) {
                    int i10 = AbstractC3490o0.f14278b;
                    AbstractC7599p.m33331f("Omid media type was display but there was no display webview.");
                    return null;
                }
                z8 = false;
                z9 = true;
            } else if (zzcekVarZzT != null) {
                z8 = true;
            } else {
                int i11 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33331f("Omid media type was video but there was no video webview.");
            }
            if (z9) {
                str2 = null;
            } else {
                str2 = "javascript";
                zzcekVarZzW = zzcekVarZzT;
            }
            if (zzcekVarZzW == null) {
                int i12 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33331f("Webview is null in InternalNativeAd");
                return null;
            }
            if (!C7351t.m32367y().zza(this.zzw)) {
                int i13 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33331f("Failed to initialize omid in InternalNativeAd");
                return null;
            }
            C7584a c7584a = this.zzv;
            int i14 = c7584a.f30227b;
            int i15 = c7584a.f30228c;
            StringBuilder sb2 = new StringBuilder(String.valueOf(i14).length() + 1 + String.valueOf(i15).length());
            sb2.append(i14);
            sb2.append(".");
            sb2.append(i15);
            String string2 = sb2.toString();
            if (z8) {
                zzedqVar = zzedq.VIDEO;
                zzedrVar = zzedr.DEFINED_BY_JAVASCRIPT;
            } else {
                zzedqVar = zzedq.NATIVE_DISPLAY;
                zzedrVar = zzdiuVar.zzx() == 3 ? zzedr.UNSPECIFIED : zzedr.ONE_PIXEL;
            }
            zzedu zzeduVarZzd = C7351t.m32367y().zzd(string2, zzcekVarZzW.zzD(), "", "javascript", str2, str, zzedrVar, zzedqVar, this.zzb.zzal);
            if (zzeduVarZzd == null) {
                int i16 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33331f("Failed to create omid session in InternalNativeAd");
                return null;
            }
            zzdiuVar.zzq(zzeduVarZzd);
            zzcekVarZzW.zzak(zzeduVarZzd);
            if (z8) {
                zzflj zzfljVarZza = zzeduVarZzd.zza();
                if (zzcekVarZzT != null) {
                    C7351t.m32367y().zzh(zzfljVarZza, zzcekVarZzT.zzE());
                }
                this.zzs = true;
            }
            if (z7) {
                C7351t.m32367y().zze(zzeduVarZzd.zza());
                zzcekVarZzW.zze("onSdkLoaded", new C2390a());
            }
            return zzeduVarZzd;
        }
        return null;
    }

    public final boolean zzM() {
        return this.zzh.zzd();
    }

    public final void zzN(View view) {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzfQ)).booleanValue()) {
            zzdiu zzdiuVar = this.zze;
            if (zzdiuVar.zzx() != 3) {
                zzbzm zzbzmVarZzY = zzdiuVar.zzY();
                if (zzbzmVarZzY == null) {
                    return;
                }
                zzgot.zzq(zzbzmVarZzY, new zzdig(this, view), this.zzd);
                return;
            }
        }
        zzY(view, this.zze.zzZ());
    }

    public final void zzO(View view) {
        zzedu zzeduVarZzZ = this.zze.zzZ();
        if (!this.zzh.zzd() || zzeduVarZzZ == null || view == null) {
            return;
        }
        C7351t.m32367y().zzg(zzeduVarZzZ.zza(), view);
    }

    public final zzdir zzP() {
        return this.zzx;
    }

    public final synchronized void zzQ(InterfaceC3301U0 interfaceC3301U0) {
        this.zzy.zza(interfaceC3301U0);
    }

    public final void zzR(Bundle bundle) {
        final zzcek zzcekVarZzT = this.zze.zzT();
        if (zzcekVarZzT == null) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33328c("Video webview is null");
            return;
        }
        try {
            final JSONObject jSONObject = new JSONObject();
            for (String str : bundle.keySet()) {
                jSONObject.put(str, bundle.get(str));
            }
            this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdim
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzgjz zzgjzVar = zzdip.zzc;
                    zzcekVarZzT.zzd("onVideoEvent", jSONObject);
                }
            });
        } catch (JSONException e7) {
            int i8 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33329d("Error reading event signals", e7);
        }
    }

    final /* synthetic */ void zzS() {
        try {
            zzdiu zzdiuVar = this.zze;
            int iZzx = zzdiuVar.zzx();
            if (iZzx == 1) {
                zzbgx zzbgxVarZza = this.zzi.zza();
                if (zzbgxVarZza != null) {
                    zzai("Google", true);
                    zzbgxVarZza.zze((zzbgn) this.zzj.zzb());
                    return;
                }
                return;
            }
            if (iZzx == 2) {
                zzbgu zzbguVarZzb = this.zzi.zzb();
                if (zzbguVarZzb != null) {
                    zzai("Google", true);
                    zzbguVarZzb.zze((zzbgl) this.zzk.zzb());
                    return;
                }
                return;
            }
            if (iZzx == 3) {
                zzbhd zzbhdVarZzf = this.zzi.zzf(zzdiuVar.zzS());
                if (zzbhdVarZzf != null) {
                    if (zzdiuVar.zzT() != null) {
                        zzL("Google", true);
                    }
                    zzbhdVarZzf.zze((zzbgq) this.zzn.zzb());
                    return;
                }
                return;
            }
            if (iZzx == 6) {
                zzbhk zzbhkVarZzc = this.zzi.zzc();
                if (zzbhkVarZzc != null) {
                    zzai("Google", true);
                    zzbhkVarZzc.zze((zzbhq) this.zzl.zzb());
                    return;
                }
                return;
            }
            if (iZzx != 7) {
                int i7 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33328c("Wrong native template id!");
            } else {
                zzbmf zzbmfVarZze = this.zzi.zze();
                if (zzbmfVarZze != null) {
                    zzbmfVarZze.zze((zzblz) this.zzm.zzb());
                }
            }
        } catch (RemoteException e7) {
            int i8 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33329d("RemoteException when notifyAdLoad is called", e7);
        }
    }

    final /* synthetic */ void zzT() {
        this.zzf.zzA();
        this.zze.zzae();
    }

    final /* synthetic */ void zzW(boolean z7) {
        zzdkr zzdkrVar = this.zzo;
        if (zzdkrVar != null) {
            this.zzf.zzf(null, zzdkrVar.zzdJ(), this.zzo.zzj(), this.zzo.zzk(), z7, zzah(), 0);
        } else {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33326a("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        }
    }

    final /* synthetic */ void zzX(View view, boolean z7, int i7) {
        zzdkr zzdkrVar = this.zzo;
        if (zzdkrVar != null) {
            this.zzf.zzf(view, zzdkrVar.zzdJ(), this.zzo.zzj(), this.zzo.zzk(), z7, zzah(), i7);
        } else {
            int i8 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33326a("Ad should be associated with an ad view before calling performClickForCustomGesture()");
        }
    }

    final /* synthetic */ zzdiu zzZ() {
        return this.zze;
    }

    public final synchronized void zza(String str) {
        this.zzf.zzd(str);
    }

    final /* synthetic */ zzdkr zzaa() {
        return this.zzo;
    }

    final /* synthetic */ Map zzab() {
        return this.zzz;
    }

    public final synchronized void zzb() {
        if (this.zzq) {
            return;
        }
        this.zzf.zzn();
    }

    public final synchronized void zzc(Bundle bundle) {
        this.zzf.zze(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzcqs
    public final synchronized void zzd() {
        this.zzp = true;
        this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdih
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzT();
            }
        });
        super.zzd();
    }

    public final synchronized boolean zze(Bundle bundle) {
        if (this.zzq) {
            return true;
        }
        boolean zZzz = this.zzf.zzz(bundle);
        this.zzq = zZzz;
        return zZzz;
    }

    public final synchronized void zzf(Bundle bundle) {
        this.zzf.zzk(bundle);
    }

    public final synchronized void zzg(final zzdkr zzdkrVar) {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzbV)).booleanValue()) {
            C3431F0.f14180l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdii
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzU(zzdkrVar);
                }
            });
        } else {
            zzU(zzdkrVar);
        }
    }

    public final synchronized void zzh(final zzdkr zzdkrVar) {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzbV)).booleanValue()) {
            C3431F0.f14180l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdij
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzV(zzdkrVar);
                }
            });
        } else {
            zzV(zzdkrVar);
        }
    }

    public final synchronized void zzi(View view, View view2, Map map, Map map2, boolean z7) {
        zzcek zzcekVarZzT;
        this.zzg.zzb(this.zzo);
        this.zzf.zzc(view, view2, map, map2, z7, zzah());
        if (this.zzs) {
            zzdiu zzdiuVar = this.zze;
            if (zzdiuVar.zzT() != null && (zzcekVarZzT = zzdiuVar.zzT()) != null) {
                zzcekVarZzT.zze("onSdkAdUserInteractionClick", new C2390a());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcqs
    public final void zzj() {
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzdin
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzS();
            }
        };
        Executor executor = this.zzd;
        executor.execute(runnable);
        if (this.zze.zzx() != 7) {
            final zzdjc zzdjcVar = this.zzf;
            Objects.requireNonNull(zzdjcVar);
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdio
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzdjcVar.zzy();
                }
            });
        }
        super.zzj();
    }

    public final synchronized void zzk(View view, MotionEvent motionEvent, View view2) {
        this.zzf.zzj(view, motionEvent, view2);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004a A[Catch: all -> 0x000a, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:10:0x000d, B:12:0x001f, B:14:0x0025, B:15:0x002f, B:17:0x0035, B:21:0x004a, B:24:0x005e, B:25:0x0066, B:27:0x006c, B:29:0x0080, B:31:0x0086, B:36:0x008d), top: B:41:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x006c A[Catch: all -> 0x000a, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:10:0x000d, B:12:0x001f, B:14:0x0025, B:15:0x002f, B:17:0x0035, B:21:0x004a, B:24:0x005e, B:25:0x0066, B:27:0x006c, B:29:0x0080, B:31:0x0086, B:36:0x008d), top: B:41:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x008d A[Catch: all -> 0x000a, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:10:0x000d, B:12:0x001f, B:14:0x0025, B:15:0x002f, B:17:0x0035, B:21:0x004a, B:24:0x005e, B:25:0x0066, B:27:0x006c, B:29:0x0080, B:31:0x0086, B:36:0x008d), top: B:41:0x0001 }] */
    public final synchronized void zzu(View view, Map map, Map map2, boolean z7) {
        Iterator it;
        View view2;
        if (this.zzq) {
            zzaf(view, map, map2);
            return;
        }
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzbX)).booleanValue() && this.zzb.zzak) {
            Map map3 = this.zzz;
            Iterator it2 = map3.keySet().iterator();
            while (it2.hasNext()) {
                if (!((Boolean) map3.get((String) it2.next())).booleanValue()) {
                }
            }
            if (!z7) {
                zzae(view, map, map2);
                zzaf(view, map, map2);
                return;
            }
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzep)).booleanValue()) {
                it = map.entrySet().iterator();
                while (it.hasNext()) {
                    view2 = (View) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                    if (view2 == null) {
                    }
                }
            }
        } else {
            if (!z7) {
                zzae(view, map, map2);
                zzaf(view, map, map2);
                return;
            }
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzep)).booleanValue() && map != null) {
                it = map.entrySet().iterator();
                while (it.hasNext()) {
                    view2 = (View) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                    if (view2 == null && zzI(view2)) {
                        zzae(view, map, map2);
                        return;
                    }
                }
            }
        }
    }

    public final synchronized JSONObject zzv(View view, Map map, Map map2) {
        return this.zzf.zzl(view, map, map2, zzah());
    }

    public final synchronized JSONObject zzw(View view, Map map, Map map2) {
        return this.zzf.zzm(view, map, map2, zzah());
    }

    public final synchronized void zzx(View view) {
        this.zzf.zzo(view);
    }

    public final synchronized void zzy(zzbhn zzbhnVar) {
        this.zzf.zzp(zzbhnVar);
    }

    public final synchronized void zzz() {
        this.zzf.zzq();
    }
}
