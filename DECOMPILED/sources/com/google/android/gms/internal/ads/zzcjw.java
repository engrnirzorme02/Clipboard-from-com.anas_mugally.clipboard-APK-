package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.AbstractBinderC3245B0;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.client.C3302U1;
import com.google.android.gms.ads.internal.client.InterfaceC3284O0;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.ads.internal.util.C3431F0;
import com.google.android.gms.ads.internal.util.C3501u;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.dynamic.BinderC3773b;
import com.google.android.gms.dynamic.InterfaceC3772a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p380w2.C7351t;
import p404z2.AbstractC7599p;
import p404z2.C7584a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcjw extends AbstractBinderC3245B0 {
    private final Context zza;
    private final C7584a zzb;
    private final zzdqc zzc;
    private final zzeeb zzd;
    private final zzekd zze;
    private final zzdux zzf;
    private final zzbxr zzg;
    private final zzdqh zzh;
    private final zzdvs zzi;
    private final zzbfc zzj;
    private final zzfie zzk;
    private final zzfdy zzl;
    private final zzctd zzm;
    private final zzdsm zzn;
    private boolean zzo = false;
    private final Long zzp = Long.valueOf(C7351t.m32357o().mo18161c());

    zzcjw(Context context, C7584a c7584a, zzdqc zzdqcVar, zzeeb zzeebVar, zzekd zzekdVar, zzdux zzduxVar, zzbxr zzbxrVar, zzdqh zzdqhVar, zzdvs zzdvsVar, zzbfc zzbfcVar, zzfie zzfieVar, zzfdy zzfdyVar, zzctd zzctdVar, zzdsm zzdsmVar) {
        this.zza = context;
        this.zzb = c7584a;
        this.zzc = zzdqcVar;
        this.zzd = zzeebVar;
        this.zze = zzekdVar;
        this.zzf = zzduxVar;
        this.zzg = zzbxrVar;
        this.zzh = zzdqhVar;
        this.zzi = zzdvsVar;
        this.zzj = zzbfcVar;
        this.zzk = zzfieVar;
        this.zzl = zzfdyVar;
        this.zzm = zzctdVar;
        this.zzn = zzdsmVar;
    }

    final void zzb() {
        if (C7351t.m32354l().zzo().zzJ()) {
            String strZzL = C7351t.m32354l().zzo().zzL();
            if (C7351t.m32361s().m17590e(this.zza, strZzL, this.zzb.f30226a)) {
                return;
            }
            C7351t.m32354l().zzo().zzK(false);
            C7351t.m32354l().zzo().mo17555h("");
        }
    }

    final /* synthetic */ void zzc() {
        zzfeh.zza(this.zza, true);
    }

    final /* synthetic */ void zzd() {
        C7351t.m32360r().zza(this.zza, this.zzn);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3248C0
    public final synchronized void zze() {
        if (this.zzo) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33331f("Mobile ads is initialized already.");
            return;
        }
        Context context = this.zza;
        zzbci.zza(context);
        C7351t.m32354l().zze(context, this.zzb, this.zzn);
        this.zzm.zzc();
        C7351t.m32356n().zza(context);
        this.zzo = true;
        this.zzf.zzc();
        this.zze.zza();
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzey)).booleanValue()) {
            this.zzh.zza();
        }
        this.zzi.zza();
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzjX)).booleanValue()) {
            zzbzh.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjv
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzb();
                }
            });
        }
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzlL)).booleanValue()) {
            zzbzh.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjs
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzw();
                }
            });
        }
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzds)).booleanValue()) {
            zzbzh.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjq
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzc();
                }
            });
        }
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzfd)).booleanValue()) {
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzfe)).booleanValue()) {
                zzbzh.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjr
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzd();
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3248C0
    public final synchronized void zzf(float f7) {
        C7351t.m32355m().m17513a(f7);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3248C0
    public final synchronized void zzg(String str) {
        Context context = this.zza;
        zzbci.zza(context);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzew)).booleanValue()) {
                C7351t.m32358p().m32311a(context, this.zzb, str, null, this.zzk, null, null, this.zzi.zzs());
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3248C0
    public final synchronized void zzh(boolean z7) {
        C7351t.m32355m().m17515c(z7);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3248C0
    public final void zzi(InterfaceC3772a interfaceC3772a, String str) {
        if (interfaceC3772a == null) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33328c("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) BinderC3773b.m18220M0(interfaceC3772a);
        if (context == null) {
            int i8 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33328c("Context is null. Failed to open debug menu.");
        } else {
            C3501u c3501u = new C3501u(context);
            c3501u.m17568c(str);
            c3501u.m17569d(this.zzb.f30226a);
            c3501u.m17567b();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3248C0
    public final void zzj(String str, InterfaceC3772a interfaceC3772a) {
        String strM17407d0;
        Runnable runnable;
        Context context = this.zza;
        zzbci.zza(context);
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzeD)).booleanValue()) {
            try {
                C7351t.m32349g();
                strM17407d0 = C3431F0.m17407d0(context);
            } catch (RemoteException | RuntimeException e7) {
                C7351t.m32354l().zzg(e7, "NonagonMobileAdsSettingManager_AppId");
                strM17407d0 = "";
            }
        } else {
            strM17407d0 = "";
        }
        boolean z7 = true;
        String str2 = true == TextUtils.isEmpty(strM17407d0) ? str : strM17407d0;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        boolean zBooleanValue = ((Boolean) C3250D.m17200c().zzd(zzbci.zzew)).booleanValue();
        zzbbz zzbbzVar = zzbci.zzbf;
        boolean zBooleanValue2 = zBooleanValue | ((Boolean) C3250D.m17200c().zzd(zzbbzVar)).booleanValue();
        if (((Boolean) C3250D.m17200c().zzd(zzbbzVar)).booleanValue()) {
            final Runnable runnable2 = (Runnable) BinderC3773b.m18220M0(interfaceC3772a);
            runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjt
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzgpd zzgpdVar = zzbzh.zzf;
                    final zzcjw zzcjwVar = this.zza;
                    final Runnable runnable3 = runnable2;
                    zzgpdVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcju
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzcjwVar.zzx(runnable3);
                        }
                    });
                }
            };
        } else {
            runnable = null;
            z7 = zBooleanValue2;
        }
        Runnable runnable3 = runnable;
        if (z7) {
            C7351t.m32358p().m32311a(this.zza, this.zzb, str2, runnable3, this.zzk, this.zzn, this.zzp, this.zzi.zzs());
        }
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3248C0
    public final synchronized float zzk() {
        return C7351t.m32355m().m17514b();
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3248C0
    public final synchronized boolean zzl() {
        return C7351t.m32355m().m17516d();
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3248C0
    public final String zzm() {
        return this.zzb.f30226a;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3248C0
    public final void zzn(String str) {
        this.zze.zze(str);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3248C0
    public final void zzo(zzbox zzboxVar) {
        this.zzl.zzc(zzboxVar);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3248C0
    public final void zzp(zzblr zzblrVar) {
        this.zzf.zzb(zzblrVar);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3248C0
    public final List zzq() {
        return this.zzf.zzd();
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3248C0
    public final void zzr(C3302U1 c3302u1) {
        this.zzg.zzb(this.zza, c3302u1);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3248C0
    public final void zzs() {
        this.zzf.zza();
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3248C0
    public final void zzt(InterfaceC3284O0 interfaceC3284O0) {
        this.zzi.zzo(interfaceC3284O0, zzdvr.API);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3248C0
    public final void zzu(boolean z7) throws RemoteException {
        try {
            Context context = this.zza;
            zzftj.zza(context).zzb(z7);
            if (z7) {
                return;
            }
            try {
                if (context.getSharedPreferences("query_info_shared_prefs", 0).edit().clear().commit()) {
                    return;
                } else {
                    throw new IOException("Failed to remove query_info_shared_prefs");
                }
            } catch (IOException e7) {
                C7351t.m32354l().zzg(e7, "clearStorageOnGpidPubDisable_scar");
                return;
            }
            throw new RemoteException(e.getMessage());
        } catch (IOException e8) {
            throw new RemoteException(e8.getMessage());
        }
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3248C0
    public final void zzv(String str) {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzkj)).booleanValue()) {
            C7351t.m32354l().zzt(str);
        }
    }

    final /* synthetic */ void zzw() {
        this.zzj.zza(new zzbtx());
    }

    final /* synthetic */ void zzx(Runnable runnable) {
        AbstractC3718s.m18076e("Adapters must be initialized on the main thread.");
        Map mapZzf = C7351t.m32354l().zzo().zzi().zzf();
        if (mapZzf.isEmpty()) {
            return;
        }
        if (runnable != null) {
            try {
                runnable.run();
            } catch (Throwable th) {
                int i7 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33332g("Could not initialize rewarded ads.", th);
                return;
            }
        }
        if (this.zzc.zzc()) {
            HashMap map = new HashMap();
            Iterator it = mapZzf.values().iterator();
            while (it.hasNext()) {
                for (zzboq zzboqVar : ((zzbor) it.next()).zza) {
                    String str = zzboqVar.zzb;
                    for (String str2 : zzboqVar.zza) {
                        if (!map.containsKey(str2)) {
                            map.put(str2, new ArrayList());
                        }
                        if (str != null) {
                            ((List) map.get(str2)).add(str);
                        }
                    }
                }
            }
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : map.entrySet()) {
                String str3 = (String) entry.getKey();
                try {
                    zzeec zzeecVarZza = this.zzd.zza(str3, jSONObject);
                    if (zzeecVarZza != null) {
                        zzfea zzfeaVar = (zzfea) zzeecVarZza.zzb;
                        if (!zzfeaVar.zzn() && zzfeaVar.zzq()) {
                            zzfeaVar.zzr(this.zza, (zzefp) zzeecVarZza.zzc, (List) entry.getValue());
                            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 45);
                            sb.append("Initialized rewarded video mediation adapter ");
                            sb.append(str3);
                            String string = sb.toString();
                            int i8 = AbstractC3490o0.f14278b;
                            AbstractC7599p.m33326a(string);
                        }
                    }
                } catch (zzfdj e7) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 56);
                    sb2.append("Failed to initialize rewarded video mediation adapter \"");
                    sb2.append(str3);
                    sb2.append("\"");
                    String string2 = sb2.toString();
                    int i9 = AbstractC3490o0.f14278b;
                    AbstractC7599p.m33332g(string2, e7);
                }
            }
        }
    }
}
