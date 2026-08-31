package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.nativead.C3521b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p314o2.C6555g;
import p314o2.C6556h;
import p314o2.C6574z;
import p324p2.C6734a;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbjz implements zzbjl {
    private final zzdwp zza;

    public zzbjz(zzdwp zzdwpVar) {
        this.zza = zzdwpVar;
    }

    private static final Bundle zzb(Map map) {
        Bundle bundle = new Bundle();
        bundle.putString("request_origin", "inspector_ooct");
        if (map.containsKey("networkExtras")) {
            try {
                JSONObject jSONObject = new JSONObject((String) map.get("networkExtras"));
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Object obj = jSONObject.get(next);
                    if (obj instanceof String) {
                        bundle.putString(next, (String) obj);
                    } else if (obj instanceof Integer) {
                        bundle.putInt(next, ((Integer) obj).intValue());
                    } else if (obj instanceof Boolean) {
                        bundle.putBoolean(next, ((Boolean) obj).booleanValue());
                    } else if (obj instanceof Float) {
                        bundle.putFloat(next, ((Float) obj).floatValue());
                    } else if (obj instanceof Double) {
                        bundle.putDouble(next, ((Double) obj).doubleValue());
                    } else if (obj instanceof Long) {
                        bundle.putLong(next, ((Long) obj).longValue());
                    }
                }
            } catch (JSONException e7) {
                C7351t.m32354l().zzg(e7, "OutOfContextTestingGmsgHandler.generateNetworkExtras");
            }
        }
        return bundle;
    }

    private static final List zzc(String str, String str2) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            ArrayList arrayList = new ArrayList();
            for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                arrayList.add(jSONArray.getString(i7));
            }
            return arrayList;
        } catch (JSONException e7) {
            C7351t.m32354l().zzg(e7, "OutOfContextTestingGmsgHandler.stringArrayToList.".concat(str2));
            return new ArrayList();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final void zza(Object obj, Map map) {
        C6555g c6555gM27825k;
        C6556h c6556h;
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzkg)).booleanValue()) {
            zzdwq zzdwqVar = new zzdwq();
            String str = (String) map.get("adUnitId");
            if (!TextUtils.isEmpty(str)) {
                zzdwqVar.zzh(str);
            }
            String str2 = (String) map.get("format");
            if (!TextUtils.isEmpty(str2)) {
                zzdwqVar.zzi(str2);
            }
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzki)).booleanValue()) {
                boolean z7 = false;
                if (map.containsKey("isGamRequest") && ((String) map.get("isGamRequest")).equals("1")) {
                    z7 = true;
                }
                zzdwqVar.zzn(z7);
                if (zzdwqVar.zzg()) {
                    C6734a.a aVar = new C6734a.a();
                    if (map.containsKey("keywords")) {
                        Iterator it = zzc((String) map.get("keywords"), "keywords").iterator();
                        while (it.hasNext()) {
                            aVar.m27798b((String) it.next());
                        }
                    }
                    aVar.m27799c(AdMobAdapter.class, zzb(map));
                    if (map.containsKey("customTargeting")) {
                        try {
                            JSONObject jSONObject = new JSONObject((String) map.get("customTargeting"));
                            Iterator<String> itKeys = jSONObject.keys();
                            while (itKeys.hasNext()) {
                                String next = itKeys.next();
                                aVar.m27797a(next, jSONObject.getString(next));
                            }
                        } catch (JSONException e7) {
                            C7351t.m32354l().zzg(e7, "OutOfContextTestingGmsgHandler.generateAdManagerAdRequest");
                        }
                    }
                    if (map.containsKey("contentUrl")) {
                        aVar.m27801e((String) map.get("contentUrl"));
                    }
                    if (map.containsKey("neighboringContentUrlStrings")) {
                        aVar.m27802f(zzc((String) map.get("neighboringContentUrlStrings"), "neighboringContentUrlStrings"));
                    }
                    if (map.containsKey("requestAgent")) {
                        aVar.m27803g((String) map.get("requestAgent"));
                    }
                    if (map.containsKey("publisherProvidedId")) {
                        aVar.m29538m((String) map.get("publisherProvidedId"));
                    }
                    if (map.containsKey("categoryExclusions")) {
                        Iterator it2 = zzc((String) map.get("categoryExclusions"), "categoryExclusions").iterator();
                        while (it2.hasNext()) {
                            aVar.m29536k((String) it2.next());
                        }
                    }
                    c6555gM27825k = aVar.m29537l();
                } else {
                    C6555g.a aVar2 = new C6555g.a();
                    if (map.containsKey("keywords")) {
                        Iterator it3 = zzc((String) map.get("keywords"), "keywords").iterator();
                        while (it3.hasNext()) {
                            aVar2.m27798b((String) it3.next());
                        }
                    }
                    aVar2.m27799c(AdMobAdapter.class, zzb(map));
                    if (map.containsKey("customTargeting")) {
                        try {
                            JSONObject jSONObject2 = new JSONObject((String) map.get("customTargeting"));
                            Iterator<String> itKeys2 = jSONObject2.keys();
                            while (itKeys2.hasNext()) {
                                String next2 = itKeys2.next();
                                aVar2.m27797a(next2, jSONObject2.getString(next2));
                            }
                        } catch (JSONException e8) {
                            C7351t.m32354l().zzg(e8, "OutOfContextTestingGmsgHandler.generateAdMobAdRequest");
                        }
                    }
                    if (map.containsKey("contentUrl")) {
                        aVar2.m27801e((String) map.get("contentUrl"));
                    }
                    if (map.containsKey("neighboringContentUrlStrings")) {
                        aVar2.m27802f(zzc((String) map.get("neighboringContentUrlStrings"), "neighboringContentUrlStrings"));
                    }
                    if (map.containsKey("requestAgent")) {
                        aVar2.m27803g((String) map.get("requestAgent"));
                    }
                    c6555gM27825k = aVar2.m27825k();
                }
                zzdwqVar.zzj(c6555gM27825k);
                String str3 = (String) map.get("width");
                String str4 = (String) map.get("height");
                if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
                    c6556h = C6556h.f24740i;
                } else {
                    try {
                        c6556h = new C6556h(Integer.parseInt(str3), Integer.parseInt(str4));
                    } catch (NumberFormatException e9) {
                        C7351t.m32354l().zzg(e9, "OutOfContextTestingGmsgHandler.generateAdSize");
                        c6556h = C6556h.f24740i;
                    }
                }
                zzdwqVar.zzk(c6556h);
                if (map.containsKey("clickToExpandRequested") || map.containsKey("customControlsRequested") || map.containsKey("startMuted")) {
                    C6574z.a aVar3 = new C6574z.a();
                    if (map.containsKey("startMuted")) {
                        aVar3.m27877d(((String) map.get("startMuted")).equals("1"));
                    }
                    if (map.containsKey("customControlsRequested")) {
                        aVar3.m27876c(((String) map.get("customControlsRequested")).equals("1"));
                    }
                    if (map.containsKey("clickToExpandRequested")) {
                        aVar3.m27875b(((String) map.get("clickToExpandRequested")).equals("1"));
                    }
                    zzdwqVar.zzm(aVar3.m27874a());
                }
                if (map.containsKey("customMuteThisAdRequested") || map.containsKey("disableImageLoading") || map.containsKey("mediaAspectRatio") || map.containsKey("preferredAdChoicesPosition") || map.containsKey("shouldRequestMultipleImages") || (zzdwqVar.zzf() != null && zzdwqVar.zzb().equals("NATIVE"))) {
                    C3521b.a aVar4 = new C3521b.a();
                    if (map.containsKey("disableImageLoading")) {
                        aVar4.m17625g(((String) map.get("disableImageLoading")).equals("1"));
                    }
                    if (map.containsKey("mediaAspectRatio")) {
                        String str5 = (String) map.get("mediaAspectRatio");
                        if (!TextUtils.isEmpty(str5)) {
                            try {
                                aVar4.m17622d(Integer.parseInt(str5));
                            } catch (NumberFormatException e10) {
                                C7351t.m32354l().zzg(e10, "OutOfContextTestingGmsgHandler.generateNativeAdOptionsBuilder.mediaAspectRatio");
                            }
                        }
                    }
                    if (map.containsKey("shouldRequestMultipleImages")) {
                        aVar4.m17624f(((String) map.get("shouldRequestMultipleImages")).equals("1"));
                    }
                    if (map.containsKey("preferredAdChoicesPosition")) {
                        String str6 = (String) map.get("preferredAdChoicesPosition");
                        if (!TextUtils.isEmpty(str6)) {
                            try {
                                aVar4.m17621c(Integer.parseInt(str6));
                            } catch (NumberFormatException e11) {
                                C7351t.m32354l().zzg(e11, "OutOfContextTestingGmsgHandler.generateNativeAdOptionsBuilder.preferredAdChoicesPosition");
                            }
                        }
                    }
                    if (map.containsKey("customMuteThisAdRequested")) {
                        aVar4.m17623e(((String) map.get("customMuteThisAdRequested")).equals("1"));
                    }
                    C6574z c6574zZzf = zzdwqVar.zzf();
                    if (c6574zZzf != null) {
                        aVar4.m17626h(c6574zZzf);
                    }
                    zzdwqVar.zzl(aVar4.m17619a());
                }
            }
            String str7 = (String) map.get("action");
            if (TextUtils.isEmpty(str7) || TextUtils.isEmpty(zzdwqVar.zza())) {
                return;
            }
            if (str7.equals("load") && !TextUtils.isEmpty(zzdwqVar.zzb())) {
                this.zza.zzc(zzdwqVar);
            } else if (str7.equals("show")) {
                this.zza.zzd(zzdwqVar.zza());
            }
        }
    }
}
