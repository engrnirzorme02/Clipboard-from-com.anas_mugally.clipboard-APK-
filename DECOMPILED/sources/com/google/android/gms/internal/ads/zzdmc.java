package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.ads.internal.client.BinderC3413y1;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.client.C3369m2;
import com.google.android.gms.ads.internal.util.AbstractC3453S;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p157U3.InterfaceFutureC1673e;
import p314o2.C6556h;
import p380w2.C7332a;
import p380w2.C7333b;
import p380w2.C7351t;
import p404z2.AbstractC7599p;
import p404z2.C7584a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdmc {
    private final Context zza;
    private final zzdli zzb;
    private final zzauu zzc;
    private final C7584a zzd;
    private final C7332a zze;
    private final zzbbh zzf;
    private final Executor zzg;
    private final zzbfl zzh;
    private final zzdmu zzi;
    private final zzdpi zzj;
    private final ScheduledExecutorService zzk;
    private final zzdod zzl;
    private final zzdsm zzm;
    private final zzfjv zzn;
    private final zzecn zzo;
    private final zzecy zzp;
    private final zzfdg zzq;
    private final zzdsg zzr;
    private final zzdtp zzs;

    public zzdmc(Context context, zzdli zzdliVar, zzauu zzauuVar, C7584a c7584a, C7332a c7332a, zzbbh zzbbhVar, Executor executor, zzfdc zzfdcVar, zzdmu zzdmuVar, zzdpi zzdpiVar, ScheduledExecutorService scheduledExecutorService, zzdsm zzdsmVar, zzfjv zzfjvVar, zzecn zzecnVar, zzdod zzdodVar, zzecy zzecyVar, zzfdg zzfdgVar, zzdsg zzdsgVar, zzdtp zzdtpVar) {
        this.zza = context;
        this.zzb = zzdliVar;
        this.zzc = zzauuVar;
        this.zzd = c7584a;
        this.zze = c7332a;
        this.zzf = zzbbhVar;
        this.zzg = executor;
        this.zzh = zzfdcVar.zzj;
        this.zzi = zzdmuVar;
        this.zzj = zzdpiVar;
        this.zzk = scheduledExecutorService;
        this.zzm = zzdsmVar;
        this.zzn = zzfjvVar;
        this.zzo = zzecnVar;
        this.zzl = zzdodVar;
        this.zzp = zzecyVar;
        this.zzq = zzfdgVar;
        this.zzr = zzdsgVar;
        this.zzs = zzdtpVar;
    }

    public static final BinderC3413y1 zzk(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("mute");
        if (jSONObjectOptJSONObject2 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return zzt(jSONObjectOptJSONObject);
    }

    public static final List zzl(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("mute");
        if (jSONObjectOptJSONObject == null) {
            return zzgjz.zzi();
        }
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("reasons");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return zzgjz.zzi();
        }
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < jSONArrayOptJSONArray.length(); i7++) {
            BinderC3413y1 binderC3413y1Zzt = zzt(jSONArrayOptJSONArray.optJSONObject(i7));
            if (binderC3413y1Zzt != null) {
                arrayList.add(binderC3413y1Zzt);
            }
        }
        return zzgjz.zzq(arrayList);
    }

    private final InterfaceFutureC1673e zzm(JSONArray jSONArray, boolean z7, boolean z8, zzdru zzdruVar) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return zzgot.zza(Collections.EMPTY_LIST);
        }
        ArrayList arrayList = new ArrayList();
        int length = z8 ? jSONArray.length() : 1;
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzcy)).booleanValue()) {
            this.zzr.zze().putLong(zzdruVar.zza(), C7351t.m32357o().mo18159a());
        }
        for (int i7 = 0; i7 < length; i7++) {
            arrayList.add(zzn(jSONArray.optJSONObject(i7), z7, null));
        }
        return zzgot.zzk(zzgot.zzl(arrayList), zzdmb.zza, this.zzg);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0055  */
    private final InterfaceFutureC1673e zzn(JSONObject jSONObject, boolean z7, zzdru zzdruVar) {
        HashMap map;
        if (jSONObject == null) {
            return zzgot.zza(null);
        }
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzes)).booleanValue()) {
            if (jSONObject.has((String) C3250D.m17200c().zzd(zzbci.zzet))) {
                HashMap map2 = new HashMap();
                for (String str : ((String) C3250D.m17200c().zzd(zzbci.zzeu)).split(",")) {
                    try {
                        map2.put(str, jSONObject.getString(str));
                    } catch (JSONException unused) {
                    }
                }
                map = map2;
            } else {
                map = null;
            }
        } else {
            map = null;
        }
        final String strOptString = jSONObject.optString("url");
        if (TextUtils.isEmpty(strOptString) && map == null) {
            return zzgot.zza(null);
        }
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzcy)).booleanValue() && zzdruVar != null) {
            this.zzr.zze().putLong(zzdruVar.zza(), C7351t.m32357o().mo18159a());
        }
        final double dOptDouble = jSONObject.optDouble("scale", 1.0d);
        boolean zOptBoolean = jSONObject.optBoolean("is_transparent", true);
        final int iOptInt = jSONObject.optInt("width", -1);
        final int iOptInt2 = jSONObject.optInt("height", -1);
        if (z7 || map != null) {
            return zzgot.zza(new zzbfh(null, Uri.parse(strOptString), dOptDouble, iOptInt, iOptInt2, map));
        }
        return zzr(jSONObject.optBoolean("require"), zzgot.zzk(this.zzb.zza(strOptString, dOptDouble, zOptBoolean), new zzggr() { // from class: com.google.android.gms.internal.ads.zzdlr
            @Override // com.google.android.gms.internal.ads.zzggr
            public final /* synthetic */ Object apply(Object obj) {
                return new zzbfh(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(strOptString), dOptDouble, iOptInt, iOptInt2, null);
            }
        }, this.zzg), null);
    }

    private static Integer zzo(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    private final InterfaceFutureC1673e zzp(JSONObject jSONObject, zzfcj zzfcjVar, zzfcm zzfcmVar, C7333b c7333b, zzbxf zzbxfVar) {
        final InterfaceFutureC1673e interfaceFutureC1673eZzb = this.zzi.zzb(jSONObject.optString("base_url"), jSONObject.optString("html"), zzfcjVar, zzfcmVar, zzs(jSONObject.optInt("width", 0), jSONObject.optInt("height", 0)), c7333b, zzbxfVar);
        return zzgot.zzj(interfaceFutureC1673eZzb, new zzgob() { // from class: com.google.android.gms.internal.ads.zzdlw
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ InterfaceFutureC1673e zza(Object obj) throws zzeho {
                zzcek zzcekVar = (zzcek) obj;
                if (zzcekVar == null || zzcekVar.zzh() == null) {
                    throw new zzeho(1, "Retrieve video view in html5 ad response failed.");
                }
                return interfaceFutureC1673eZzb;
            }
        }, zzbzh.zzg);
    }

    private static InterfaceFutureC1673e zzq(InterfaceFutureC1673e interfaceFutureC1673e, Object obj) {
        final Object obj2 = null;
        return zzgot.zzh(interfaceFutureC1673e, Exception.class, new zzgob(obj2) { // from class: com.google.android.gms.internal.ads.zzdlx
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ InterfaceFutureC1673e zza(Object obj3) {
                AbstractC3490o0.m17546l("Error during loading assets.", (Exception) obj3);
                return zzgot.zza(null);
            }
        }, zzbzh.zzg);
    }

    private static InterfaceFutureC1673e zzr(boolean z7, final InterfaceFutureC1673e interfaceFutureC1673e, Object obj) {
        return z7 ? zzgot.zzj(interfaceFutureC1673e, new zzgob() { // from class: com.google.android.gms.internal.ads.zzdly
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ InterfaceFutureC1673e zza(Object obj2) {
                return obj2 != null ? interfaceFutureC1673e : zzgot.zzc(new zzeho(1, "Retrieve required value in native ad response failed."));
            }
        }, zzbzh.zzg) : zzq(interfaceFutureC1673e, null);
    }

    private final C3369m2 zzs(int i7, int i8) {
        if (i7 == 0) {
            if (i8 == 0) {
                return C3369m2.m17288U();
            }
            i7 = 0;
        }
        return new C3369m2(this.zza, new C6556h(i7, i8));
    }

    private static final BinderC3413y1 zzt(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString("reason");
        String strOptString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
            return null;
        }
        return new BinderC3413y1(strOptString, strOptString2);
    }

    public final InterfaceFutureC1673e zza(JSONObject jSONObject, String str, zzdru zzdruVar) {
        return zzn(jSONObject.optJSONObject(str), this.zzh.zzb, zzdruVar);
    }

    public final InterfaceFutureC1673e zzb(JSONObject jSONObject, String str, zzdru zzdruVar) {
        zzbfl zzbflVar = this.zzh;
        return zzm(jSONObject.optJSONArray("images"), zzbflVar.zzb, zzbflVar.zzd, zzdruVar);
    }

    public final InterfaceFutureC1673e zzc(JSONObject jSONObject, String str, final zzfcj zzfcjVar, final zzfcm zzfcmVar, final C7333b c7333b, final zzbxf zzbxfVar) {
        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzkP)).booleanValue()) {
            return zzgot.zza(null);
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("images");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return zzgot.zza(null);
        }
        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0);
        if (jSONObjectOptJSONObject == null) {
            return zzgot.zza(null);
        }
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzes)).booleanValue()) {
            if (jSONObjectOptJSONObject.has((String) C3250D.m17200c().zzd(zzbci.zzet))) {
                return zzgot.zza(null);
            }
        }
        final String strOptString = jSONObjectOptJSONObject.optString("base_url");
        final String strOptString2 = jSONObjectOptJSONObject.optString("html");
        final C3369m2 c3369m2Zzs = zzs(jSONObjectOptJSONObject.optInt("width", 0), jSONObjectOptJSONObject.optInt("height", 0));
        if (TextUtils.isEmpty(strOptString2)) {
            return zzgot.zza(null);
        }
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzcy)).booleanValue()) {
            this.zzr.zze().putLong(zzdru.NATIVE_ASSETS_LOADING_IMAGE_COMPOSITION_START.zza(), C7351t.m32357o().mo18159a());
        }
        final InterfaceFutureC1673e interfaceFutureC1673eZzj = zzgot.zzj(zzgot.zza(null), new zzgob() { // from class: com.google.android.gms.internal.ads.zzdls
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ InterfaceFutureC1673e zza(Object obj) {
                return this.zza.zzh(c3369m2Zzs, zzfcjVar, zzfcmVar, c7333b, zzbxfVar, strOptString, strOptString2, obj);
            }
        }, zzbzh.zzf);
        return zzgot.zzj(interfaceFutureC1673eZzj, new zzgob() { // from class: com.google.android.gms.internal.ads.zzdlt
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ InterfaceFutureC1673e zza(Object obj) throws zzeho {
                if (((zzcek) obj) != null) {
                    return interfaceFutureC1673eZzj;
                }
                throw new zzeho(1, "Retrieve Web View from image ad response failed.");
            }
        }, zzbzh.zzg);
    }

    public final InterfaceFutureC1673e zzd(JSONObject jSONObject, String str, zzdru zzdruVar) {
        final JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("attribution");
        if (jSONObjectOptJSONObject == null) {
            return zzgot.zza(null);
        }
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("images");
        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("image");
        if (jSONArrayOptJSONArray == null && jSONObjectOptJSONObject2 != null) {
            jSONArrayOptJSONArray = new JSONArray();
            jSONArrayOptJSONArray.put(jSONObjectOptJSONObject2);
        }
        return zzr(jSONObjectOptJSONObject.optBoolean("require"), zzgot.zzk(zzm(jSONArrayOptJSONArray, false, true, zzdruVar), new zzggr() { // from class: com.google.android.gms.internal.ads.zzdlu
            @Override // com.google.android.gms.internal.ads.zzggr
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzi(jSONObjectOptJSONObject, (List) obj);
            }
        }, this.zzg), null);
    }

    public final InterfaceFutureC1673e zze(JSONObject jSONObject, final C7333b c7333b, final zzbxf zzbxfVar) {
        JSONObject jSONObjectOptJSONObject;
        if (jSONObject.optBoolean("enable_omid") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("omid_settings")) != null) {
            final String strOptString = jSONObjectOptJSONObject.optString("omid_html");
            if (TextUtils.isEmpty(strOptString)) {
                return zzgot.zza(null);
            }
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzcy)).booleanValue()) {
                this.zzr.zze().putLong(zzdru.NATIVE_ASSETS_LOADING_OMID_START.zza(), C7351t.m32357o().mo18159a());
            }
            return zzgot.zzj(zzgot.zza(null), new zzgob() { // from class: com.google.android.gms.internal.ads.zzdlv
                @Override // com.google.android.gms.internal.ads.zzgob
                public final /* synthetic */ InterfaceFutureC1673e zza(Object obj) {
                    return this.zza.zzj(strOptString, zzbxfVar, c7333b, obj);
                }
            }, zzbzh.zzf);
        }
        return zzgot.zza(null);
    }

    public final InterfaceFutureC1673e zzf(InterfaceFutureC1673e interfaceFutureC1673e) {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzcy)).booleanValue()) {
            this.zzr.zze().putLong(zzdru.NATIVE_ASSETS_LOADING_MEDIA_START.zza(), C7351t.m32357o().mo18159a());
        }
        zzbzm zzbzmVar = new zzbzm();
        zzgot.zzq(interfaceFutureC1673e, new zzdlq(this, zzbzmVar), zzbzh.zzf);
        return zzbzmVar;
    }

    public final InterfaceFutureC1673e zzg(JSONObject jSONObject, zzfcj zzfcjVar, zzfcm zzfcmVar, C7333b c7333b, zzbxf zzbxfVar) {
        InterfaceFutureC1673e interfaceFutureC1673eZza;
        zzdmc zzdmcVar;
        JSONObject jSONObjectM17482i = AbstractC3453S.m17482i(jSONObject, "html_containers", "instream");
        if (jSONObjectM17482i != null) {
            return zzp(jSONObjectM17482i, zzfcjVar, zzfcmVar, c7333b, zzbxfVar);
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("video");
        if (jSONObjectOptJSONObject == null) {
            return zzgot.zza(null);
        }
        String strOptString = jSONObjectOptJSONObject.optString("vast_xml");
        boolean z7 = false;
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzkO)).booleanValue() && jSONObjectOptJSONObject.has("html")) {
            z7 = true;
        }
        if (!TextUtils.isEmpty(strOptString)) {
            if (!z7) {
                interfaceFutureC1673eZza = this.zzi.zza(jSONObjectOptJSONObject, c7333b, zzbxfVar);
                zzdmcVar = this;
            }
            return zzq(zzgot.zzi(interfaceFutureC1673eZza, ((Integer) C3250D.m17200c().zzd(zzbci.zzek)).intValue(), TimeUnit.SECONDS, zzdmcVar.zzk), null);
        }
        if (!z7) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33331f("Required field 'vast_xml' or 'html' is missing");
            return zzgot.zza(null);
        }
        zzdmcVar = this;
        interfaceFutureC1673eZza = zzdmcVar.zzp(jSONObjectOptJSONObject, zzfcjVar, zzfcmVar, c7333b, zzbxfVar);
        return zzq(zzgot.zzi(interfaceFutureC1673eZza, ((Integer) C3250D.m17200c().zzd(zzbci.zzek)).intValue(), TimeUnit.SECONDS, zzdmcVar.zzk), null);
    }

    final /* synthetic */ InterfaceFutureC1673e zzh(C3369m2 c3369m2, zzfcj zzfcjVar, zzfcm zzfcmVar, C7333b c7333b, zzbxf zzbxfVar, String str, String str2, Object obj) throws zzcez {
        zzdtp zzdtpVar;
        zzcek zzcekVarZza = this.zzj.zza(c3369m2, zzfcjVar, zzfcmVar);
        final zzbzl zzbzlVarZza = zzbzl.zza(zzcekVarZza);
        zzdoa zzdoaVarZza = this.zzl.zza();
        zzcgi zzcgiVarZzP = zzcekVarZza.zzP();
        zzbbz zzbbzVar = zzbci.zzoq;
        zzcgiVarZzP.zzZ(zzdoaVarZza, zzdoaVarZza, zzdoaVarZza, zzdoaVarZza, zzdoaVarZza, false, null, !((Boolean) C3250D.m17200c().zzd(zzbbzVar)).booleanValue() ? new C7333b(this.zza, null, null) : c7333b, null, true != ((Boolean) C3250D.m17200c().zzd(zzbbzVar)).booleanValue() ? null : zzbxfVar, this.zzo, this.zzn, this.zzm, null, zzdoaVarZza, null, null, null, null, null, null);
        zzcekVarZza.zzab("/getNativeAdViewSignals", zzbjk.zzs);
        zzcekVarZza.zzab("/getNativeClickMeta", zzbjk.zzt);
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzio)).booleanValue()) {
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zziq)).booleanValue() && (zzdtpVar = this.zzs) != null) {
                zzcekVarZza.zzab("/onDeviceStorageEvent", new zzbjt(zzdtpVar));
            }
        }
        zzcekVarZza.zzP().zzQ(true);
        zzcekVarZza.zzP().zzG(new zzcgg() { // from class: com.google.android.gms.internal.ads.zzdma
            @Override // com.google.android.gms.internal.ads.zzcgg
            public final /* synthetic */ void zza(boolean z7, int i7, String str3, String str4) {
                zzbzl zzbzlVar = zzbzlVarZza;
                if (z7) {
                    zzbzlVar.zzb();
                    return;
                }
                int length = String.valueOf(i7).length();
                StringBuilder sb = new StringBuilder(length + 58 + String.valueOf(str3).length() + 15 + String.valueOf(str4).length());
                sb.append("Image Web View failed to load. Error code: ");
                sb.append(i7);
                sb.append(", Description: ");
                sb.append(str3);
                sb.append(", Failing URL: ");
                sb.append(str4);
                zzbzlVar.zzd(new zzeho(1, sb.toString()));
            }
        });
        zzcekVarZza.zzau(str, str2, null);
        return zzbzlVarZza;
    }

    final /* synthetic */ zzbfe zzi(JSONObject jSONObject, List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        String strOptString = jSONObject.optString("text");
        Integer numZzo = zzo(jSONObject, "bg_color");
        Integer numZzo2 = zzo(jSONObject, "text_color");
        int iOptInt = jSONObject.optInt("text_size", -1);
        boolean zOptBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int iOptInt2 = jSONObject.optInt("animation_ms", zzbbn.zzq.zzf);
        return new zzbfe(strOptString, list, numZzo, numZzo2, iOptInt > 0 ? Integer.valueOf(iOptInt) : null, jSONObject.optInt("presentation_ms", 4000) + iOptInt2, this.zzh.zze, zOptBoolean);
    }

    final /* synthetic */ InterfaceFutureC1673e zzj(String str, zzbxf zzbxfVar, C7333b c7333b, Object obj) throws zzcez {
        C7351t.m32350h();
        Context context = this.zza;
        zzecy zzecyVar = this.zzp;
        zzcek zzcekVarZza = zzcfa.zza(context, zzcgt.zzb(), "native-omid", false, false, this.zzc, null, this.zzd, null, null, this.zze, this.zzf, null, null, zzecyVar, this.zzq, this.zzm);
        final zzbzl zzbzlVarZza = zzbzl.zza(zzcekVarZza);
        zzcekVarZza.zzP().zzG(new zzcgg() { // from class: com.google.android.gms.internal.ads.zzdlz
            @Override // com.google.android.gms.internal.ads.zzcgg
            public final /* synthetic */ void zza(boolean z7, int i7, String str2, String str3) {
                zzbzlVarZza.zzb();
            }
        });
        zzcekVarZza.loadData(Base64.encodeToString(str.getBytes(), 1), "text/html", "base64");
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzoq)).booleanValue()) {
            if (zzbxfVar != null) {
                zzcekVarZza.zzP().zzj(zzbxfVar);
            }
            zzcekVarZza.zzP().zzi(c7333b);
        }
        return zzbzlVarZza;
    }
}
