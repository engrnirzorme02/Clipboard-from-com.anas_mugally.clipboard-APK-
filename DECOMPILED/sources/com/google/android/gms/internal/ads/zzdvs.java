package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.RemoteException;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.C3244B;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.client.InterfaceC3284O0;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p157U3.InterfaceFutureC1673e;
import p380w2.C7351t;
import p404z2.AbstractC7599p;
import p404z2.C7584a;
import p404z2.C7590g;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdvs implements zzdwu, zzdvd {
    private final zzdwd zza;
    private final zzdwv zzb;
    private final zzdve zzc;
    private final zzdvn zzd;
    private final zzdvc zze;
    private final zzdwp zzf;
    private final zzdvz zzg;
    private final zzdvz zzh;
    private final String zzi;
    private final Context zzj;
    private final String zzk;
    private JSONObject zzp;
    private boolean zzs;
    private int zzt;
    private boolean zzu;
    private final Map zzl = new HashMap();
    private final Map zzm = new HashMap();
    private final Map zzn = new HashMap();
    private String zzo = "{}";
    private long zzq = Long.MAX_VALUE;
    private zzdvo zzr = zzdvo.NONE;
    private zzdvr zzv = zzdvr.UNKNOWN;
    private long zzw = 0;
    private String zzx = "";

    zzdvs(zzdwd zzdwdVar, zzdwv zzdwvVar, zzdve zzdveVar, Context context, C7584a c7584a, zzdvn zzdvnVar, zzdwp zzdwpVar, zzdvz zzdvzVar, zzdvz zzdvzVar2, String str) {
        this.zza = zzdwdVar;
        this.zzb = zzdwvVar;
        this.zzc = zzdveVar;
        this.zze = new zzdvc(context);
        this.zzi = c7584a.f30226a;
        this.zzk = str;
        this.zzd = zzdvnVar;
        this.zzf = zzdwpVar;
        this.zzg = zzdvzVar;
        this.zzh = zzdvzVar2;
        this.zzj = context;
        C7351t.m32361s().m17586a(this);
    }

    private final synchronized void zzA(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            zzt(jSONObject.optBoolean("isTestMode", false), false);
            zzu((zzdvo) Enum.valueOf(zzdvo.class, jSONObject.optString("gesture", "NONE")), false);
            this.zzo = jSONObject.optString("networkExtras", "{}");
            this.zzq = jSONObject.optLong("networkExtrasExpirationSecs", Long.MAX_VALUE);
        } catch (JSONException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002d A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:3:0x0001, B:6:0x0006, B:8:0x000a, B:10:0x001c, B:15:0x0029, B:20:0x0038, B:16:0x002d, B:18:0x0033), top: B:27:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0033 A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:3:0x0001, B:6:0x0006, B:8:0x000a, B:10:0x001c, B:15:0x0029, B:20:0x0038, B:16:0x002d, B:18:0x0033), top: B:27:0x0001 }] */
    private final synchronized void zzt(boolean z7, boolean z8) {
        try {
            if (this.zzs != z7) {
                this.zzs = z7;
                if (z7) {
                    if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzjX)).booleanValue() || !C7351t.m32361s().m17596k()) {
                        zzx();
                    } else if (!zzs()) {
                        zzy();
                    }
                } else if (!zzs()) {
                    zzy();
                }
                if (z8) {
                    zzz();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void zzu(zzdvo zzdvoVar, boolean z7) {
        try {
            if (this.zzr != zzdvoVar) {
                if (zzs()) {
                    zzy();
                }
                this.zzr = zzdvoVar;
                if (zzs()) {
                    zzx();
                }
                if (z7) {
                    zzz();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized JSONObject zzv() {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            for (Map.Entry entry : this.zzl.entrySet()) {
                JSONArray jSONArray = new JSONArray();
                for (zzdvg zzdvgVar : (List) entry.getValue()) {
                    if (zzdvgVar.zzc()) {
                        jSONArray.put(zzdvgVar.zzg());
                    }
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put((String) entry.getKey(), jSONArray);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return jSONObject;
    }

    private final void zzw() {
        this.zzu = true;
        this.zzd.zza();
        this.zza.zzl(this);
        this.zzb.zza(this);
        this.zzc.zza(this);
        this.zzf.zzb(this);
        zzbbz zzbbzVar = zzbci.zzkm;
        if (!TextUtils.isEmpty((CharSequence) C3250D.m17200c().zzd(zzbbzVar))) {
            this.zzg.zza(PreferenceManager.getDefaultSharedPreferences(this.zzj), Arrays.asList(((String) C3250D.m17200c().zzd(zzbbzVar)).split(",")));
        }
        zzbbz zzbbzVar2 = zzbci.zzkn;
        if (!TextUtils.isEmpty((CharSequence) C3250D.m17200c().zzd(zzbbzVar2))) {
            this.zzh.zza(this.zzj.getSharedPreferences("admob", 0), Arrays.asList(((String) C3250D.m17200c().zzd(zzbbzVar2)).split(",")));
        }
        zzA(C7351t.m32354l().zzo().zzH());
        this.zzx = C7351t.m32354l().zzo().zzN();
    }

    private final synchronized void zzx() {
        int iOrdinal = this.zzr.ordinal();
        if (iOrdinal == 1) {
            this.zzb.zzb();
        } else {
            if (iOrdinal != 2) {
                return;
            }
            this.zzc.zzb();
        }
    }

    private final synchronized void zzy() {
        int iOrdinal = this.zzr.ordinal();
        if (iOrdinal == 1) {
            this.zzb.zzc();
        } else {
            if (iOrdinal != 2) {
                return;
            }
            this.zzc.zzc();
        }
    }

    private final void zzz() {
        C7351t.m32354l().zzo().mo17552e(zzh());
    }

    public final void zza() {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzjI)).booleanValue()) {
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzjX)).booleanValue() && C7351t.m32354l().zzo().zzJ()) {
                zzw();
                return;
            }
            String strZzH = C7351t.m32354l().zzo().zzH();
            if (TextUtils.isEmpty(strZzH)) {
                return;
            }
            try {
                if (new JSONObject(strZzH).optBoolean("isTestMode", false)) {
                    zzw();
                }
            } catch (JSONException unused) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0011  */
    public final void zzb(boolean z7) {
        if (this.zzu) {
            if (z7) {
                if (!this.zzs) {
                    zzx();
                    return;
                }
            }
        } else if (z7) {
            zzw();
            if (!this.zzs) {
                zzx();
                return;
            }
        }
        if (zzs()) {
            return;
        }
        zzy();
    }

    public final void zzc(boolean z7) {
        if (!this.zzu && z7) {
            zzw();
        }
        zzt(z7, true);
    }

    public final synchronized boolean zzd() {
        return this.zzs;
    }

    public final void zze(zzdvo zzdvoVar) {
        zzu(zzdvoVar, true);
    }

    public final zzdvo zzf() {
        return this.zzr;
    }

    public final synchronized String zzg() {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzjI)).booleanValue() && zzs()) {
            if (this.zzq < C7351t.m32357o().mo18159a() / 1000) {
                this.zzo = "{}";
                this.zzq = Long.MAX_VALUE;
                return "";
            }
            if (!this.zzo.equals("{}")) {
                return this.zzo;
            }
        }
        return "";
    }

    public final synchronized String zzh() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        try {
            jSONObject.put("isTestMode", this.zzs);
            jSONObject.put("gesture", this.zzr);
            if (this.zzq > C7351t.m32357o().mo18159a() / 1000) {
                jSONObject.put("networkExtras", this.zzo);
                jSONObject.put("networkExtrasExpirationSecs", this.zzq);
            }
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public final synchronized void zzi(String str, long j7) {
        this.zzo = str;
        this.zzq = j7;
        zzz();
    }

    public final synchronized void zzj(String str) {
        this.zzx = str;
        C7351t.m32354l().zzo().mo17558k(this.zzx);
    }

    public final synchronized void zzk(String str, zzdvg zzdvgVar) {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzjI)).booleanValue() && zzs()) {
            if (this.zzt >= ((Integer) C3250D.m17200c().zzd(zzbci.zzjK)).intValue()) {
                int i7 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33331f("Maximum number of ad requests stored reached. Dropping the current request.");
                return;
            }
            Map map = this.zzl;
            if (!map.containsKey(str)) {
                map.put(str, new ArrayList());
            }
            this.zzt++;
            ((List) map.get(str)).add(zzdvgVar);
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzkg)).booleanValue()) {
                String strZzd = zzdvgVar.zzd();
                this.zzm.put(strZzd, zzdvgVar);
                Map map2 = this.zzn;
                if (map2.containsKey(strZzd)) {
                    List list = (List) map2.get(strZzd);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((zzbzm) it.next()).zzc(zzdvgVar);
                    }
                    list.clear();
                }
            }
        }
    }

    public final synchronized void zzl(long j7) {
        this.zzw += j7;
    }

    public final boolean zzm() {
        return this.zzw < ((Long) C3250D.m17200c().zzd(zzbci.zzkd)).longValue();
    }

    public final synchronized InterfaceFutureC1673e zzn(String str) {
        zzbzm zzbzmVar;
        try {
            zzbzmVar = new zzbzm();
            Map map = this.zzm;
            if (map.containsKey(str)) {
                zzbzmVar.zzc((zzdvg) map.get(str));
            } else {
                Map map2 = this.zzn;
                if (!map2.containsKey(str)) {
                    map2.put(str, new ArrayList());
                }
                ((List) map2.get(str)).add(zzbzmVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return zzbzmVar;
    }

    public final synchronized void zzo(InterfaceC3284O0 interfaceC3284O0, zzdvr zzdvrVar) {
        if (!zzs()) {
            try {
                interfaceC3284O0.zze(zzfee.zzd(18, null, null));
                return;
            } catch (RemoteException unused) {
                int i7 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33331f("Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
                return;
            }
        }
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzjI)).booleanValue()) {
            this.zzv = zzdvrVar;
            this.zza.zzm(interfaceC3284O0, new zzbkg(this), new zzbjz(this.zzf), new zzbjm(this));
            return;
        } else {
            try {
                interfaceC3284O0.zze(zzfee.zzd(1, null, null));
                return;
            } catch (RemoteException unused2) {
                int i8 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33331f("Ad inspector had an internal error.");
                return;
            }
        }
        throw th;
    }

    public final synchronized void zzp(JSONObject jSONObject) {
        this.zzp = jSONObject;
    }

    public final boolean zzq() {
        return this.zzp != null;
    }

    public final synchronized JSONObject zzr() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put("platform", "ANDROID");
                String str = this.zzk;
                if (!TextUtils.isEmpty(str)) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
                    sb.append("afma-sdk-a-v");
                    sb.append(str);
                    jSONObject.put("sdkVersion", sb.toString());
                }
                jSONObject.put("internalSdkVersion", this.zzi);
                jSONObject.put("osVersion", Build.VERSION.RELEASE);
                jSONObject.put("adapters", this.zzd.zzb());
                if (((Boolean) C3250D.m17200c().zzd(zzbci.zzkj)).booleanValue()) {
                    String strZzu = C7351t.m32354l().zzu();
                    if (!TextUtils.isEmpty(strZzu)) {
                        jSONObject.put("plugin", strZzu);
                    }
                }
                if (this.zzq < C7351t.m32357o().mo18159a() / 1000) {
                    this.zzo = "{}";
                }
                jSONObject.put("networkExtras", this.zzo);
                jSONObject.put("adSlots", zzv());
                jSONObject.put("appInfo", this.zze.zza());
                String strZzd = C7351t.m32354l().zzo().zzi().zzd();
                if (!TextUtils.isEmpty(strZzd)) {
                    jSONObject.put("cld", new JSONObject(strZzd));
                }
                if (((Boolean) C3250D.m17200c().zzd(zzbci.zzjY)).booleanValue() && (jSONObject2 = this.zzp) != null) {
                    String string = jSONObject2.toString();
                    StringBuilder sb2 = new StringBuilder(string.length() + 13);
                    sb2.append("Server data: ");
                    sb2.append(string);
                    String string2 = sb2.toString();
                    int i7 = AbstractC3490o0.f14278b;
                    AbstractC7599p.m33326a(string2);
                    jSONObject.put("serverData", this.zzp);
                }
                if (((Boolean) C3250D.m17200c().zzd(zzbci.zzjX)).booleanValue()) {
                    jSONObject.put("openAction", this.zzv);
                    jSONObject.put("gesture", this.zzr);
                }
                jSONObject.put("isGamRegisteredTestDevice", C7351t.m32361s().m17596k());
                C7351t.m32349g();
                C3244B.m17190a();
                jSONObject.put("isSimulator", C7590g.m33291z());
                if (((Boolean) C3250D.m17200c().zzd(zzbci.zzkl)).booleanValue()) {
                    jSONObject.put("uiStorage", new JSONObject(this.zzx));
                }
                if (!TextUtils.isEmpty((CharSequence) C3250D.m17200c().zzd(zzbci.zzkn))) {
                    jSONObject.put("gmaDisk", this.zzh.zzb());
                }
                if (!TextUtils.isEmpty((CharSequence) C3250D.m17200c().zzd(zzbci.zzkm))) {
                    jSONObject.put("userDisk", this.zzg.zzb());
                }
            } catch (JSONException e7) {
                C7351t.m32354l().zzh(e7, "Inspector.toJson");
                int i8 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33332g("Ad inspector encountered an error", e7);
            }
        } catch (Throwable th) {
            throw th;
        }
        return jSONObject;
    }

    public final synchronized boolean zzs() {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzjX)).booleanValue()) {
            return this.zzs || C7351t.m32361s().m17596k();
        }
        return this.zzs;
    }
}
