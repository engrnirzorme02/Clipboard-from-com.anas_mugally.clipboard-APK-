package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.client.C3323b0;
import com.google.android.gms.ads.internal.util.AbstractC3453S;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p036E2.AbstractC0335c;
import p036E2.C0366r0;
import p157U3.InterfaceFutureC1673e;
import p380w2.C7351t;
import p404z2.AbstractC7599p;
import p404z2.C7584a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdyo {
    private static final Pattern zza = Pattern.compile("\\?");
    private final zzcgv zzb;
    private final Context zzc;
    private final C7584a zzd;
    private final zzfdc zze;
    private final Executor zzf;
    private final ScheduledExecutorService zzg;
    private final String zzh;
    private final zzfib zzi;
    private final zzdsg zzj;
    private final zzfjv zzk;
    private final zzcyw zzl;
    private final Object zzm = new Object();
    private String zzn;
    private List zzo;
    private Bundle zzp;
    private final zzbvd zzq;

    zzdyo(zzcgv zzcgvVar, Context context, C7584a c7584a, zzfdc zzfdcVar, Executor executor, String str, zzfib zzfibVar, zzdsg zzdsgVar, zzbvd zzbvdVar, zzeau zzeauVar, ScheduledExecutorService scheduledExecutorService, zzfjv zzfjvVar, zzcyw zzcywVar) {
        this.zzb = zzcgvVar;
        this.zzc = context;
        this.zzd = c7584a;
        this.zze = zzfdcVar;
        this.zzf = executor;
        this.zzh = str;
        this.zzi = zzfibVar;
        zzcgvVar.zzz();
        this.zzj = zzdsgVar;
        this.zzq = zzbvdVar;
        this.zzg = scheduledExecutorService;
        this.zzk = zzfjvVar;
        this.zzl = zzcywVar;
    }

    private final InterfaceFutureC1673e zzg(String str, final String str2) {
        InterfaceFutureC1673e interfaceFutureC1673eZza;
        String str3;
        String str4 = "";
        if (TextUtils.isEmpty(str)) {
            return zzgot.zzc(new zzeho(15, "Invalid ad string."));
        }
        Context context = this.zzc;
        zzfhr zzfhrVarZzn = zzfhr.zzn(context, 11);
        zzfhrVarZzn.zza();
        zzbod zzbodVarZzb = C7351t.m32364v().zzb(context, this.zzd, this.zzb.zzv());
        zzbnx zzbnxVar = zzboa.zza;
        final zzbnt zzbntVarZza = zzbodVarZzb.zza("google.afma.response.normalize", zzbnxVar, zzbnxVar);
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzhz)).booleanValue()) {
            try {
                str3 = str;
                try {
                    JSONObject jSONObject = new JSONObject(str3);
                    this.zzn = jSONObject.optString("fetch_url", "");
                    this.zzo = AbstractC3453S.m17474a(new JSONObject(jSONObject.optString("settings", "")).getJSONArray("nofill_urls"), null);
                } catch (JSONException unused) {
                    int i7 = AbstractC3490o0.f14278b;
                    AbstractC7599p.m33331f("Invalid ad response.");
                }
            } catch (JSONException unused2) {
                str3 = str;
            }
            String string = this.zzn;
            final List list = this.zzo;
            if (TextUtils.isEmpty(string)) {
                interfaceFutureC1673eZza = zzgot.zza(str3);
                this.zzj.zzd("sst", "1");
            } else {
                this.zzj.zzd("sst", "2");
                String str5 = (String) C3250D.m17200c().zzd(zzbci.zzhB);
                if (((Boolean) C3250D.m17200c().zzd(zzbci.zzhA)).booleanValue()) {
                    List listZze = zzghq.zzb(zza).zze(string);
                    if (listZze.size() < 2) {
                        interfaceFutureC1673eZza = zzgot.zzc(new zzeho(1, "Invalid fetch URL."));
                    } else {
                        str4 = (String) listZze.get(1);
                        C7351t.m32349g();
                        string = Uri.parse(string).buildUpon().query(null).build().toString();
                        final zzear zzearVar = new zzear(string, 60000, new HashMap(), str4.getBytes(StandardCharsets.UTF_8), str5, false);
                        interfaceFutureC1673eZza = (zzgol) zzgot.zzh((zzgol) zzgot.zzi(zzgol.zzw(zzbzh.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzdyl
                            @Override // java.util.concurrent.Callable
                            public final /* synthetic */ Object call() {
                                return this.zza.zzd(zzearVar);
                            }
                        })), ((Integer) C3250D.m17200c().zzd(zzbci.zzhC)).intValue(), TimeUnit.MILLISECONDS, this.zzg), Exception.class, new zzgob() { // from class: com.google.android.gms.internal.ads.zzdym
                            @Override // com.google.android.gms.internal.ads.zzgob
                            public final /* synthetic */ InterfaceFutureC1673e zza(Object obj) {
                                return this.zza.zze(list, (Exception) obj);
                            }
                        }, this.zzf);
                    }
                } else {
                    final zzear zzearVar2 = new zzear(string, 60000, new HashMap(), str4.getBytes(StandardCharsets.UTF_8), str5, false);
                    interfaceFutureC1673eZza = (zzgol) zzgot.zzh((zzgol) zzgot.zzi(zzgol.zzw(zzbzh.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzdyl
                        @Override // java.util.concurrent.Callable
                        public final /* synthetic */ Object call() {
                            return this.zza.zzd(zzearVar2);
                        }
                    })), ((Integer) C3250D.m17200c().zzd(zzbci.zzhC)).intValue(), TimeUnit.MILLISECONDS, this.zzg), Exception.class, new zzgob() { // from class: com.google.android.gms.internal.ads.zzdym
                        @Override // com.google.android.gms.internal.ads.zzgob
                        public final /* synthetic */ InterfaceFutureC1673e zza(Object obj) {
                            return this.zza.zze(list, (Exception) obj);
                        }
                    }, this.zzf);
                }
            }
        } else {
            interfaceFutureC1673eZza = zzgot.zza(str);
            this.zzj.zzd("sst", "1");
        }
        zzgob zzgobVar = new zzgob(this) { // from class: com.google.android.gms.internal.ads.zzdyn
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ InterfaceFutureC1673e zza(Object obj) throws JSONException {
                String str6 = (String) obj;
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                JSONObject jSONObject4 = new JSONObject();
                String str7 = str2;
                try {
                    jSONObject4.put("headers", new JSONObject());
                    jSONObject4.put("body", str6);
                    jSONObject3.put("base_url", "");
                    jSONObject3.put("signals", new JSONObject(str7));
                    jSONObject2.put("request", jSONObject3);
                    jSONObject2.put("response", jSONObject4);
                    jSONObject2.put("flags", new JSONObject());
                    return zzgot.zza(jSONObject2);
                } catch (JSONException e7) {
                    throw new JSONException("Preloaded loader: ".concat(String.valueOf(e7.getCause())));
                }
            }
        };
        Executor executor = this.zzf;
        InterfaceFutureC1673e interfaceFutureC1673eZzj = zzgot.zzj(zzgot.zzj(zzgot.zzj(interfaceFutureC1673eZza, zzgobVar, executor), new zzgob() { // from class: com.google.android.gms.internal.ads.zzdyj
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ InterfaceFutureC1673e zza(Object obj) {
                return this.zza.zzb(zzbntVarZza, (JSONObject) obj);
            }
        }, executor), new zzgob() { // from class: com.google.android.gms.internal.ads.zzdyk
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ InterfaceFutureC1673e zza(Object obj) {
                return this.zza.zzc((JSONObject) obj);
            }
        }, executor);
        zzfia.zzd(interfaceFutureC1673eZzj, this.zzi, zzfhrVarZzn);
        zzgot.zzq(interfaceFutureC1673eZzj, new zzdyi(this), zzbzh.zzg);
        return interfaceFutureC1673eZzj;
    }

    private final void zzh(zzdru zzdruVar) {
        Bundle bundleZze = this.zzj.zze();
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzhE)).booleanValue()) {
            bundleZze.putLong(zzdruVar.zza(), C7351t.m32357o().mo18159a());
        }
    }

    private final String zzi(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && "unknown".equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put(this.zzh));
            }
            return jSONObject.toString();
        } catch (JSONException e7) {
            String strConcat = "Failed to update the ad types for rendering. ".concat(e7.toString());
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33331f(strConcat);
            return str;
        }
    }

    private static final String zzj(String str) {
        try {
            return new JSONObject(str).optString("request_id", "");
        } catch (JSONException unused) {
            return "";
        }
    }

    /* JADX WARN: Code duplicated, block: B:90:0x0234 A[Catch: all -> 0x00e4, TryCatch #4 {all -> 0x00e4, blocks: (B:21:0x0080, B:23:0x009e, B:25:0x00a6, B:27:0x00b3, B:29:0x00cd, B:33:0x00fd, B:36:0x0109, B:38:0x0111, B:40:0x0117, B:44:0x0120, B:55:0x015a, B:47:0x0134, B:54:0x0145, B:57:0x015f, B:32:0x00e7, B:58:0x0173, B:65:0x0190, B:68:0x0198, B:72:0x01ba, B:74:0x01cf, B:78:0x01f0, B:80:0x0205, B:83:0x0219, B:85:0x021f, B:86:0x022c, B:88:0x022e, B:91:0x0237, B:90:0x0234, B:79:0x01fa, B:75:0x01e2, B:71:0x01a6, B:62:0x0180, B:63:0x0185), top: B:121:0x0080, inners: #2 }] */
    public final InterfaceFutureC1673e zza() {
        String strOptString;
        int i7;
        List listAsList;
        String string;
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzct)).booleanValue()) {
            this.zzp = this.zze.zzt;
            this.zzj.zze().putLong(zzdru.SCAR_PRELOADER_READY.zza(), C7351t.m32357o().mo18159a());
        }
        String strZzb = this.zze.zzd.f13944I;
        if (!TextUtils.isEmpty(strZzb)) {
            String strZzj = zzj(strZzb);
            zzbbz zzbbzVar = zzbci.zzhv;
            if (((Boolean) C3250D.m17200c().zzd(zzbbzVar)).booleanValue() && strZzj.isEmpty()) {
                int iLastIndexOf = strZzb.lastIndexOf("&request_id=");
                strZzj = iLastIndexOf != -1 ? strZzb.substring(iLastIndexOf + 12) : "";
            }
            if (TextUtils.isEmpty(strZzj)) {
                return zzgot.zzc(new zzeho(15, "Invalid ad string."));
            }
            synchronized (this.zzm) {
                try {
                    C0366r0 c0366r0Zzr = this.zzb.zzr();
                    zzdsg zzdsgVar = this.zzj;
                    String strM1555b = c0366r0Zzr.m1555b(strZzj, zzdsgVar);
                    String str = null;
                    if (((Boolean) C3250D.m17200c().zzd(zzbbzVar)).booleanValue() && !TextUtils.isEmpty(strM1555b)) {
                        try {
                            JSONObject jSONObjectOptJSONObject = new JSONObject(strM1555b).optJSONObject("extras");
                            if (jSONObjectOptJSONObject != null) {
                                String strOptString2 = jSONObjectOptJSONObject.optString("query_info_type", "");
                                if (((Boolean) C3250D.m17200c().zzd(zzbci.zzhx)).booleanValue()) {
                                    listAsList = Arrays.asList(((String) C3250D.m17200c().zzd(zzbci.zzhy)).split(","));
                                } else {
                                    listAsList = Arrays.asList(((String) C3250D.m17200c().zzd(zzbci.zzhw)).split(","));
                                }
                                if (listAsList.contains(AbstractC0335c.m1520b(strOptString2))) {
                                    int iLastIndexOf2 = strZzb.lastIndexOf("&");
                                    String strSubstring = iLastIndexOf2 != -1 ? strZzb.substring(0, iLastIndexOf2) : null;
                                    if (!TextUtils.isEmpty(strSubstring)) {
                                        try {
                                            byte[] bArrDecode = Base64.decode(strSubstring, 11);
                                            byte[] bytes = strZzj.getBytes("UTF-8");
                                            if (TextUtils.isEmpty(strM1555b)) {
                                                string = null;
                                            } else {
                                                try {
                                                    string = new JSONObject(strM1555b).getString("arek");
                                                } catch (JSONException e7) {
                                                    AbstractC3490o0.m17545k("Failed to get key from QueryJSONMap".concat(e7.toString()));
                                                    C7351t.m32354l().zzg(e7, "CryptoUtils.getKeyFromQueryJsonMap");
                                                    string = null;
                                                }
                                            }
                                            strZzb = zzfds.zzb(bArrDecode, bytes, string, zzdsgVar);
                                        } catch (UnsupportedEncodingException | IllegalArgumentException e8) {
                                            AbstractC3490o0.m17545k("Failed to decode the adResponse. ".concat(e8.toString()));
                                            C7351t.m32354l().zzg(e8, "PreloadedLoader.decryptAdResponseIfNecessary");
                                        }
                                    }
                                }
                            }
                        } catch (JSONException unused) {
                        }
                    }
                    if (TextUtils.isEmpty(strZzb)) {
                        strOptString = "";
                    } else {
                        try {
                            strOptString = new JSONObject(strZzb).optString("render_id", "");
                        } catch (JSONException unused2) {
                            strOptString = "";
                        }
                    }
                    if (TextUtils.isEmpty(strOptString)) {
                        i7 = 0;
                    } else {
                        String str2 = "";
                        try {
                            str2 = new String(Base64.decode(strOptString, 0), StandardCharsets.UTF_8);
                        } catch (IllegalArgumentException e9) {
                            AbstractC3490o0.m17545k("Ad grouping: Has render_id, but not base64 encoded: ".concat(String.valueOf(strOptString)));
                            C7351t.m32354l().zzg(e9, "PreloadedLoader.decodeRenderId");
                        }
                        List listZze = zzghq.zza(zzggo.zzc(':')).zze(str2);
                        if (listZze.size() == 2) {
                            str = (String) listZze.get(0);
                            i7 = Integer.parseInt((String) listZze.get(1));
                        } else {
                            AbstractC3490o0.m17545k("Ad grouping: Has render_id, but invalid format: ".concat(String.valueOf(strOptString)));
                            i7 = 0;
                        }
                    }
                    Pair pair = str != null ? new Pair(str, Integer.valueOf(i7)) : new Pair("", 0);
                    String str3 = (String) pair.first;
                    int iIntValue = ((Integer) pair.second).intValue();
                    if (TextUtils.isEmpty(str3) || iIntValue <= 0) {
                        c0366r0Zzr.m1556c(strZzj);
                    } else {
                        if (c0366r0Zzr.m1557d(strZzj, str3)) {
                            return zzgot.zzc(new zzeho(10, "The ad has already been shown."));
                        }
                        if (!c0366r0Zzr.m1558e(strZzj, str3, iIntValue)) {
                            c0366r0Zzr.m1556c(strZzj);
                        }
                    }
                    if (!TextUtils.isEmpty(strM1555b)) {
                        return zzg(strZzb, zzi(strM1555b));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        C3323b0 c3323b0 = this.zze.zzd.f13939D;
        if (c3323b0 != null) {
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzhn)).booleanValue()) {
                String str4 = c3323b0.f13916a;
                String str5 = c3323b0.f13917b;
                String strZzj2 = zzj(str4);
                String strZzj3 = zzj(str5);
                if (TextUtils.isEmpty(strZzj3) || !strZzj2.equals(strZzj3)) {
                    this.zzj.zzc().put("ridmm", "true");
                } else {
                    this.zzb.zzr().m1556c(strZzj2);
                    this.zzj.zzc().put("request_id", strZzj2);
                }
            }
            return zzg(c3323b0.f13916a, zzi(c3323b0.f13917b));
        }
        return zzgot.zzc(new zzeho(14, "Mismatch request IDs."));
    }

    final /* synthetic */ InterfaceFutureC1673e zzb(zzbnt zzbntVar, JSONObject jSONObject) {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzct)).booleanValue()) {
            this.zzj.zze().putLong(zzdru.SCAR_PRELOADER_PROCESSING_DONE.zza(), C7351t.m32357o().mo18159a());
        }
        return zzbntVar.zzb(jSONObject);
    }

    final /* synthetic */ InterfaceFutureC1673e zzc(JSONObject jSONObject) {
        zzfcr zzfcrVar = new zzfcr(this.zze);
        String string = jSONObject.toString();
        return zzgot.zza(new zzfcu(zzfcrVar, zzfct.zza(new StringReader(string), this.zzp)));
    }

    final /* synthetic */ String zzd(zzear zzearVar) throws zzeho {
        zzh(zzdru.RENDERING_ADSTRING_TYPE2_FETCH_START);
        int i7 = 0;
        int i8 = -1;
        while (true) {
            try {
                if (i7 >= ((Integer) C3250D.m17200c().zzd(zzbci.zzhD)).intValue()) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i8).length() + 40);
                    sb.append("Received HTTP error code from ad server:");
                    sb.append(i8);
                    throw new zzeho(1, sb.toString());
                }
                zzeas zzeasVarZzb = new zzeat(this.zzc, this.zzd.f30226a, this.zzq, Binder.getCallingUid()).zza(zzearVar);
                int i9 = zzeasVarZzb.zza;
                if (((Boolean) C3250D.m17200c().zzd(zzbci.zzhE)).booleanValue()) {
                    this.zzj.zzd("fr", String.valueOf(i7));
                }
                if (i9 == 200) {
                    zzh(zzdru.RENDERING_ADSTRING_TYPE2_FETCH_END);
                    return zzeasVarZzb.zzc;
                }
                i7++;
                i8 = i9;
            } catch (Exception e7) {
                throw new zzeho(1, e7.getMessage() == null ? "Fetch failed." : e7.getMessage(), e7);
            }
        }
    }

    final /* synthetic */ InterfaceFutureC1673e zze(List list, Exception exc) {
        zzeho zzehoVar;
        C7351t.m32354l().zzh(exc, "PreloadedLoader.getTypeTwoAdResponseString");
        if (exc instanceof TimeoutException) {
            zzehoVar = new zzeho(1, "Timed out waiting for ad response.");
        } else if (exc instanceof zzeho) {
            zzehoVar = (zzeho) exc;
        } else {
            zzehoVar = new zzeho(1, exc.getMessage() == null ? "Fetch failed." : exc.getMessage());
        }
        String message = zzehoVar.getMessage() == null ? "" : zzehoVar.getMessage();
        if (list != null && !list.isEmpty()) {
            String str = "0.6.0.0";
            if (!TextUtils.isEmpty(message)) {
                if (message.contains("Timed out waiting for ad response.")) {
                    message = "timeout";
                    str = "0.2.0.0";
                } else if (message.contains("Received HTTP error code from ad server:")) {
                    List listZze = zzghq.zza(zzggo.zzc(':')).zze(message);
                    if (listZze.size() == 2) {
                        message = (String) listZze.get(1);
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(zzfjr.zzd(zzfjr.zzd((String) it.next(), "@gw_adnetstatus@", str), "@error_code@", message));
            }
            this.zzk.zza(arrayList, null);
        }
        return zzgot.zzc(zzehoVar);
    }

    final /* synthetic */ zzcyw zzf() {
        return this.zzl;
    }
}
