package p380w2;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.internal.ads.zzbbz;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbnt;
import com.google.android.gms.internal.ads.zzbnx;
import com.google.android.gms.internal.ads.zzboa;
import com.google.android.gms.internal.ads.zzbod;
import com.google.android.gms.internal.ads.zzbyq;
import com.google.android.gms.internal.ads.zzbzh;
import com.google.android.gms.internal.ads.zzbzk;
import com.google.android.gms.internal.ads.zzdsl;
import com.google.android.gms.internal.ads.zzdsm;
import com.google.android.gms.internal.ads.zzfhr;
import com.google.android.gms.internal.ads.zzfie;
import com.google.android.gms.internal.ads.zzgob;
import com.google.android.gms.internal.ads.zzgot;
import com.google.android.gms.internal.ads.zzgpd;
import org.json.JSONException;
import org.json.JSONObject;
import p157U3.InterfaceFutureC1673e;
import p227d3.C5228d;
import p404z2.AbstractC7599p;
import p404z2.C7584a;

/* JADX INFO: renamed from: w2.f */
/* JADX INFO: loaded from: classes.dex */
public final class C7337f {

    /* JADX INFO: renamed from: a */
    private Context f29197a;

    /* JADX INFO: renamed from: b */
    private long f29198b = 0;

    /* JADX INFO: renamed from: d */
    static final /* synthetic */ InterfaceFutureC1673e m32308d(Long l7, zzdsm zzdsmVar, zzfhr zzfhrVar, zzfie zzfieVar, JSONObject jSONObject) throws JSONException {
        boolean zOptBoolean = jSONObject.optBoolean("isSuccessful", false);
        if (zOptBoolean) {
            C7351t.m32354l().zzo().zzh(jSONObject.getString("appSettingsJson"));
            if (l7 != null) {
                m32310f(zzdsmVar, "cld_s", C7351t.m32357o().mo18161c() - l7.longValue());
            }
        }
        String strOptString = jSONObject.optString("errorReason", "");
        if (!TextUtils.isEmpty(strOptString)) {
            zzfhrVar.zzk(strOptString);
        }
        zzfhrVar.zzd(zOptBoolean);
        zzfieVar.zzb(zzfhrVar.zzm());
        return zzgot.zza(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final void m32310f(zzdsm zzdsmVar, String str, long j7) {
        if (zzdsmVar != null) {
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zznw)).booleanValue()) {
                zzdsl zzdslVarZza = zzdsmVar.zza();
                zzdslVarZza.zzc("action", "lat_init");
                zzdslVarZza.zzc(str, Long.toString(j7));
                zzdslVarZza.zzd();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m32311a(Context context, C7584a c7584a, String str, Runnable runnable, zzfie zzfieVar, zzdsm zzdsmVar, Long l7, boolean z7) {
        m32313c(context, c7584a, true, null, str, null, runnable, zzfieVar, zzdsmVar, l7, z7);
    }

    /* JADX INFO: renamed from: b */
    public final void m32312b(Context context, C7584a c7584a, String str, zzbyq zzbyqVar, zzfie zzfieVar, boolean z7) {
        m32313c(context, c7584a, false, zzbyqVar, zzbyqVar != null ? zzbyqVar.zze() : null, str, null, zzfieVar, null, null, z7);
    }

    /* JADX INFO: renamed from: c */
    final void m32313c(Context context, C7584a c7584a, boolean z7, zzbyq zzbyqVar, String str, String str2, Runnable runnable, final zzfie zzfieVar, final zzdsm zzdsmVar, final Long l7, boolean z8) {
        zzfhr zzfhrVar;
        Exception exc;
        PackageInfo packageInfoM24152f;
        if (C7351t.m32357o().mo18161c() - this.f29198b < 5000) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33331f("Not retrying to fetch app settings");
            return;
        }
        this.f29198b = C7351t.m32357o().mo18161c();
        if (zzbyqVar != null && !TextUtils.isEmpty(zzbyqVar.zzd())) {
            if (C7351t.m32357o().mo18159a() - zzbyqVar.zzb() <= ((Long) C3250D.m17200c().zzd(zzbci.zzeE)).longValue() && zzbyqVar.zzc()) {
                return;
            }
        }
        if (context == null) {
            int i8 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33331f("Context not provided to fetch application settings");
            return;
        }
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            int i9 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33331f("App settings could not be fetched. Required parameters missing");
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        this.f29197a = applicationContext;
        final zzfhr zzfhrVarZzn = zzfhr.zzn(context, 4);
        zzfhrVarZzn.zza();
        zzbod zzbodVarZzb = C7351t.m32364v().zzb(this.f29197a, c7584a, zzfieVar);
        zzbnx zzbnxVar = zzboa.zza;
        zzbnt zzbntVarZza = zzbodVarZzb.zza("google.afma.config.fetchAppSettings", zzbnxVar, zzbnxVar);
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("app_id", str);
                } else if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put("ad_unit_id", str2);
                }
                jSONObject.put("is_init", z7);
                jSONObject.put("pn", context.getPackageName());
                zzbbz zzbbzVar = zzbci.zza;
                jSONObject.put("experiment_ids", TextUtils.join(",", C3250D.m17199b().zze()));
                jSONObject.put("js", c7584a.f30226a);
                if (((Boolean) C3250D.m17200c().zzd(zzbci.zzko)).booleanValue()) {
                    jSONObject.put("inspector_enabled", z8);
                }
                try {
                    ApplicationInfo applicationInfo = this.f29197a.getApplicationInfo();
                    if (applicationInfo != null && (packageInfoM24152f = C5228d.m24155a(context).m24152f(applicationInfo.packageName, 0)) != null) {
                        jSONObject.put("version", packageInfoM24152f.versionCode);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    AbstractC3490o0.m17545k("Error fetching PackageInfo.");
                }
                InterfaceFutureC1673e interfaceFutureC1673eZzb = zzbntVarZza.zzb(jSONObject);
                try {
                    zzgob zzgobVar = new zzgob(this) { // from class: w2.d
                        @Override // com.google.android.gms.internal.ads.zzgob
                        public final /* synthetic */ InterfaceFutureC1673e zza(Object obj) {
                            return C7337f.m32308d(l7, zzdsmVar, zzfhrVarZzn, zzfieVar, (JSONObject) obj);
                        }
                    };
                    zzfhrVar = zzfhrVarZzn;
                    try {
                        zzgpd zzgpdVar = zzbzh.zzg;
                        InterfaceFutureC1673e interfaceFutureC1673eZzj = zzgot.zzj(interfaceFutureC1673eZzb, zzgobVar, zzgpdVar);
                        if (runnable != null) {
                            interfaceFutureC1673eZzb.addListener(runnable, zzgpdVar);
                        }
                        if (l7 != null) {
                            interfaceFutureC1673eZzb.addListener(new Runnable(this) { // from class: w2.e
                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    C7337f.m32310f(zzdsmVar, "cld_r", C7351t.m32357o().mo18161c() - l7.longValue());
                                }
                            }, zzgpdVar);
                        }
                        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzik)).booleanValue()) {
                            zzbzk.zzb(interfaceFutureC1673eZzj, "ConfigLoader.maybeFetchNewAppSettings");
                        } else {
                            zzbzk.zza(interfaceFutureC1673eZzj, "ConfigLoader.maybeFetchNewAppSettings");
                        }
                    } catch (Exception e7) {
                        e = e7;
                        exc = e;
                        int i10 = AbstractC3490o0.f14278b;
                        AbstractC7599p.m33329d("Error requesting application settings", exc);
                        zzfhrVar.zzj(exc);
                        zzfhrVar.zzd(false);
                        zzfieVar.zzb(zzfhrVar.zzm());
                    }
                } catch (Exception e8) {
                    e = e8;
                    zzfhrVar = zzfhrVarZzn;
                }
            } catch (Exception e9) {
                exc = e9;
                zzfhrVar = zzfhrVarZzn;
                int i11 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33329d("Error requesting application settings", exc);
                zzfhrVar.zzj(exc);
                zzfhrVar.zzd(false);
                zzfieVar.zzb(zzfhrVar.zzm());
            }
        } catch (Exception e10) {
            e = e10;
            zzfhrVar = zzfhrVarZzn;
        }
    }
}
