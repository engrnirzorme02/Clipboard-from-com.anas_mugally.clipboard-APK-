package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.C3244B;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p157U3.InterfaceFutureC1673e;
import p380w2.C7351t;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbjk {
    public static final zzbjl zza = zzbjj.zza;
    public static final zzbjl zzb = zzbja.zza;
    public static final zzbjl zzc = zzbjb.zza;
    public static final zzbjl zzd = new zzbis();
    public static final zzbjl zze = new zzbit();
    public static final zzbjl zzf = zzbjg.zza;
    public static final zzbjl zzg = new zzbiu();
    public static final zzbjl zzh = new zzbiv();
    public static final zzbjl zzi = zzbjh.zza;
    public static final zzbjl zzj = new zzbiw();
    public static final zzbjl zzk = new zzbix();
    public static final zzbjl zzl = new zzcce();
    public static final zzbjl zzm = new zzccf();
    public static final zzbjl zzn = new zzbie();
    public static final zzbkc zzo = new zzbkc();
    public static final zzbjl zzp = new zzbiy();
    public static final zzbjl zzq = new zzbiz();
    public static final zzbjl zzr = new zzbif();
    public static final zzbjl zzs = new zzbig();
    public static final zzbjl zzt = new zzbih();
    public static final zzbjl zzu = new zzbii();
    public static final zzbjl zzv = new zzbij();
    public static final zzbjl zzw = new zzbik();
    public static final zzbjl zzx = new zzbil();
    public static final zzbjl zzy = new zzbim();
    public static final zzbjl zzz = new zzbin();
    public static final zzbjl zzA = new zzbio();
    public static final zzbjl zzB = new zzbiq();
    public static final zzbjl zzC = new zzbir();

    public static InterfaceFutureC1673e zza(zzcek zzcekVar, String str) {
        Uri uriZzd = Uri.parse(str);
        try {
            zzauu zzauuVarZzS = zzcekVar.zzS();
            zzfdg zzfdgVarZzT = zzcekVar.zzT();
            if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzmN)).booleanValue() || zzfdgVarZzT == null) {
                if (zzauuVarZzS != null && zzauuVarZzS.zza(uriZzd)) {
                    uriZzd = zzauuVarZzS.zzd(uriZzd, zzcekVar.getContext(), zzcekVar.zzE(), zzcekVar.zzj());
                }
            } else if (zzauuVarZzS != null && zzauuVarZzS.zza(uriZzd)) {
                uriZzd = zzfdgVarZzT.zza(uriZzd, zzcekVar.getContext(), zzcekVar.zzE(), zzcekVar.zzj());
            }
        } catch (zzauv unused) {
            String strConcat = "Unable to append parameter to URL: ".concat(str);
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33331f(strConcat);
        }
        Map map = new HashMap();
        if (zzcekVar.zzC() != null) {
            map = zzcekVar.zzC().zzaw;
        }
        final String strZzb = zzbxt.zzb(uriZzd, zzcekVar.getContext(), map);
        long jLongValue = ((Long) zzbeh.zze.zze()).longValue();
        if (jLongValue <= 0 || jLongValue > 253410000) {
            return zzgot.zza(strZzb);
        }
        zzgol zzgolVarZzw = zzgol.zzw(zzcekVar.zzaF());
        zzbjc zzbjcVar = zzbjc.zza;
        zzgpd zzgpdVar = zzbzh.zzg;
        return (zzgol) zzgot.zzg((zzgol) zzgot.zzk((zzgol) zzgot.zzg(zzgolVarZzw, Throwable.class, zzbjcVar, zzgpdVar), new zzggr() { // from class: com.google.android.gms.internal.ads.zzbjd
            /* JADX WARN: Code duplicated, block: B:16:0x004f  */
            /* JADX WARN: Code duplicated, block: B:19:0x0059  */
            /* JADX WARN: Code duplicated, block: B:21:0x0067  */
            @Override // com.google.android.gms.internal.ads.zzggr
            public final /* synthetic */ Object apply(Object obj) {
                String str2;
                String str3;
                Uri uri;
                String str4 = (String) obj;
                zzbjl zzbjlVar = zzbjk.zza;
                String strReplace = strZzb;
                if (str4 != null) {
                    if (((Boolean) zzbeh.zzf.zze()).booleanValue()) {
                        String[] strArr = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
                        String host = Uri.parse(strReplace).getHost();
                        for (int i8 = 0; i8 < 3; i8++) {
                            if (host.endsWith(strArr[i8])) {
                                str2 = (String) zzbeh.zza.zze();
                                str3 = (String) zzbeh.zzb.zze();
                                if (!TextUtils.isEmpty(str2)) {
                                    strReplace = strReplace.replace(str2, str4);
                                }
                                if (!TextUtils.isEmpty(str3)) {
                                    uri = Uri.parse(strReplace);
                                    if (!TextUtils.isEmpty(uri.getQueryParameter(str3))) {
                                        break;
                                    }
                                    return uri.buildUpon().appendQueryParameter(str3, str4).toString();
                                }
                                break;
                            }
                        }
                    } else {
                        str2 = (String) zzbeh.zza.zze();
                        str3 = (String) zzbeh.zzb.zze();
                        if (!TextUtils.isEmpty(str2)) {
                            strReplace = strReplace.replace(str2, str4);
                        }
                        if (!TextUtils.isEmpty(str3)) {
                            uri = Uri.parse(strReplace);
                            if (!TextUtils.isEmpty(uri.getQueryParameter(str3))) {
                                return uri.buildUpon().appendQueryParameter(str3, str4).toString();
                            }
                        }
                    }
                }
                return strReplace;
            }
        }, zzgpdVar), Throwable.class, new zzggr() { // from class: com.google.android.gms.internal.ads.zzbje
            @Override // com.google.android.gms.internal.ads.zzggr
            public final /* synthetic */ Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                zzbjl zzbjlVar = zzbjk.zza;
                if (((Boolean) zzbeh.zzi.zze()).booleanValue()) {
                    C7351t.m32354l().zzg(th, "prepareClickUrl.attestation2");
                }
                return strZzb;
            }
        }, zzgpdVar);
    }

    public static zzbjl zzb(final zzddz zzddzVar, final zzcmi zzcmiVar) {
        return new zzbjl() { // from class: com.google.android.gms.internal.ads.zzbjf
            @Override // com.google.android.gms.internal.ads.zzbjl
            public final /* synthetic */ void zza(Object obj, Map map) {
                zzcek zzcekVar = (zzcek) obj;
                zzbjk.zzc(map, zzddzVar);
                final String str = (String) map.get("u");
                if (str == null) {
                    int i7 = AbstractC3490o0.f14278b;
                    AbstractC7599p.m33331f("URL missing from click GMSG.");
                    return;
                }
                final zzcmi zzcmiVar2 = zzcmiVar;
                zzgol zzgolVarZzw = zzgol.zzw(zzbjk.zza(zzcekVar, str));
                zzgob zzgobVar = new zzgob() { // from class: com.google.android.gms.internal.ads.zzbji
                    @Override // com.google.android.gms.internal.ads.zzgob
                    public final /* synthetic */ InterfaceFutureC1673e zza(Object obj2) {
                        zzcmi zzcmiVar3;
                        String str2 = (String) obj2;
                        zzbjl zzbjlVar = zzbjk.zza;
                        return (((Boolean) C3250D.m17200c().zzd(zzbci.zzkQ)).booleanValue() && (zzcmiVar3 = zzcmiVar2) != null && zzcmi.zzc(str)) ? zzcmiVar3.zzb(str2, C3244B.m17194e()) : zzgot.zza(str2);
                    }
                };
                zzgpd zzgpdVar = zzbzh.zza;
                zzgot.zzq((zzgol) zzgot.zzj(zzgolVarZzw, zzgobVar, zzgpdVar), new zzbip(zzcekVar), zzgpdVar);
            }
        };
    }

    public static void zzc(Map map, zzddz zzddzVar) {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzlA)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("1") && zzddzVar != null) {
            zzddzVar.zzdz();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:18:0x0081  */
    /* JADX WARN: Code duplicated, block: B:20:0x008c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0099  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:34:0x00be  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e3  */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void zze(zzcfw zzcfwVar, Map map) {
        char c7;
        Intent uri;
        Intent intent;
        boolean z7;
        String[] strArrSplit;
        PackageManager packageManager = zzcfwVar.getContext().getPackageManager();
        try {
            try {
                JSONArray jSONArray = new JSONObject((String) map.get("data")).getJSONArray("intents");
                JSONObject jSONObject = new JSONObject();
                for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                    try {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i7);
                        String strOptString = jSONObject2.optString("id");
                        String strOptString2 = jSONObject2.optString("u");
                        String strOptString3 = jSONObject2.optString("i");
                        String strOptString4 = jSONObject2.optString("m");
                        String strOptString5 = jSONObject2.optString("p");
                        String strOptString6 = jSONObject2.optString("c");
                        String strOptString7 = jSONObject2.optString("intent_url");
                        ResolveInfo resolveInfoResolveActivity = null;
                        try {
                            try {
                                if (TextUtils.isEmpty(strOptString7)) {
                                    c7 = 1;
                                } else {
                                    try {
                                        uri = Intent.parseUri(strOptString7, 0);
                                        c7 = 1;
                                    } catch (URISyntaxException e7) {
                                        String strValueOf = String.valueOf(strOptString7);
                                        int i8 = AbstractC3490o0.f14278b;
                                        c7 = 1;
                                        AbstractC7599p.m33329d("Error parsing the url: ".concat(strValueOf), e7);
                                        uri = null;
                                    }
                                    if (uri == null) {
                                        uri = new Intent();
                                        if (!TextUtils.isEmpty(strOptString2)) {
                                            uri.setData(Uri.parse(strOptString2));
                                        }
                                        if (!TextUtils.isEmpty(strOptString3)) {
                                            uri.setAction(strOptString3);
                                        }
                                        if (!TextUtils.isEmpty(strOptString4)) {
                                            uri.setType(strOptString4);
                                        }
                                        if (!TextUtils.isEmpty(strOptString5)) {
                                            uri.setPackage(strOptString5);
                                        }
                                        if (!TextUtils.isEmpty(strOptString6)) {
                                            strArrSplit = strOptString6.split("/", 2);
                                            if (strArrSplit.length == 2) {
                                                uri.setComponent(new ComponentName(strArrSplit[0], strArrSplit[c7]));
                                            }
                                        }
                                    }
                                    intent = uri;
                                    resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536);
                                    if (resolveInfoResolveActivity != null) {
                                        z7 = c7;
                                    } else {
                                        z7 = 0;
                                    }
                                    jSONObject.put(strOptString, z7);
                                }
                                jSONObject.put(strOptString, z7);
                            } catch (JSONException e8) {
                                int i9 = AbstractC3490o0.f14278b;
                                AbstractC7599p.m33329d("Error constructing openable urls response.", e8);
                            }
                            resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536);
                        } catch (NullPointerException e9) {
                            C7351t.m32354l().zzg(e9, intent.toString());
                        }
                        uri = null;
                        if (uri == null) {
                            uri = new Intent();
                            if (!TextUtils.isEmpty(strOptString2)) {
                                uri.setData(Uri.parse(strOptString2));
                            }
                            if (!TextUtils.isEmpty(strOptString3)) {
                                uri.setAction(strOptString3);
                            }
                            if (!TextUtils.isEmpty(strOptString4)) {
                                uri.setType(strOptString4);
                            }
                            if (!TextUtils.isEmpty(strOptString5)) {
                                uri.setPackage(strOptString5);
                            }
                            if (!TextUtils.isEmpty(strOptString6)) {
                                strArrSplit = strOptString6.split("/", 2);
                                if (strArrSplit.length == 2) {
                                    uri.setComponent(new ComponentName(strArrSplit[0], strArrSplit[c7]));
                                }
                            }
                        }
                        intent = uri;
                        if (resolveInfoResolveActivity != null) {
                            z7 = c7;
                        } else {
                            z7 = 0;
                        }
                    } catch (JSONException e10) {
                        int i10 = AbstractC3490o0.f14278b;
                        AbstractC7599p.m33329d("Error parsing the intent data.", e10);
                    }
                }
                ((zzbmh) zzcfwVar).zzd("openableIntents", jSONObject);
            } catch (JSONException unused) {
                ((zzbmh) zzcfwVar).zzd("openableIntents", new JSONObject());
            }
        } catch (JSONException unused2) {
            ((zzbmh) zzcfwVar).zzd("openableIntents", new JSONObject());
        }
    }
}
