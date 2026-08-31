package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.JsonReader;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.client.C3349h2;
import com.google.android.gms.ads.internal.client.C3353i2;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.ads.internal.util.C3431F0;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import p314o2.C6570v;
import p380w2.C7351t;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdub extends zzbkn {
    private final zzdue zza;
    private final zzdtz zzb;
    private final Map zzc = new HashMap();

    zzdub(zzdue zzdueVar, zzdtz zzdtzVar) {
        this.zza = zzdueVar;
        this.zzb = zzdtzVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:35:0x0081  */
    private static C3349h2 zzc(Map map) {
        C3353i2 c3353i2 = new C3353i2();
        String str = (String) map.get("ad_request");
        if (str == null) {
            return c3353i2.m17232a();
        }
        JsonReader jsonReader = new JsonReader(new StringReader(Uri.decode(str)));
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                switch (jsonReader.nextName()) {
                    case "extras":
                        jsonReader.beginObject();
                        Bundle bundle = new Bundle();
                        while (jsonReader.hasNext()) {
                            bundle.putString(jsonReader.nextName(), jsonReader.nextString());
                        }
                        jsonReader.endObject();
                        c3353i2.m17233b(bundle);
                        break;
                    case "keywords":
                        jsonReader.beginArray();
                        ArrayList arrayList = new ArrayList();
                        while (jsonReader.hasNext()) {
                            arrayList.add(jsonReader.nextString());
                        }
                        jsonReader.endArray();
                        c3353i2.m17234c(arrayList);
                        break;
                    case "isTestDevice":
                        c3353i2.m17235d(jsonReader.nextBoolean());
                        break;
                    case "tagForChildDirectedTreatment":
                        if (!jsonReader.nextBoolean()) {
                            c3353i2.m17236e(0);
                            break;
                        } else {
                            c3353i2.m17236e(1);
                            break;
                        }
                        break;
                    case "tagForUnderAgeOfConsent":
                        if (!jsonReader.nextBoolean()) {
                            c3353i2.m17237f(0);
                            break;
                        } else {
                            c3353i2.m17237f(1);
                            break;
                        }
                        break;
                    case "maxAdContentRating":
                        String strNextString = jsonReader.nextString();
                        if (!C6570v.f24768f.contains(strNextString)) {
                            break;
                        } else {
                            c3353i2.m17238g(strNextString);
                            break;
                        }
                        break;
                    case "httpTimeoutMillis":
                        c3353i2.m17239h(jsonReader.nextInt());
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
        } catch (IOException unused) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33326a("Ad Request json was malformed, parsing ended early.");
        }
        C3349h2 c3349h2M17232a = c3353i2.m17232a();
        Bundle bundle2 = c3349h2M17232a.f13961x;
        Bundle bundle3 = bundle2.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle3 == null) {
            bundle3 = c3349h2M17232a.f13951c;
            bundle2.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundle3);
        }
        return new C3349h2(c3349h2M17232a.f13949a, c3349h2M17232a.f13950b, bundle3, c3349h2M17232a.f13952d, c3349h2M17232a.f13953e, c3349h2M17232a.f13954f, c3349h2M17232a.f13955r, c3349h2M17232a.f13956s, c3349h2M17232a.f13957t, c3349h2M17232a.f13958u, c3349h2M17232a.f13959v, c3349h2M17232a.f13960w, bundle2, c3349h2M17232a.f13962y, c3349h2M17232a.f13963z, c3349h2M17232a.f13936A, c3349h2M17232a.f13937B, c3349h2M17232a.f13938C, c3349h2M17232a.f13939D, c3349h2M17232a.f13940E, c3349h2M17232a.f13941F, c3349h2M17232a.f13942G, c3349h2M17232a.f13943H, c3349h2M17232a.f13944I, c3349h2M17232a.f13945J, c3349h2M17232a.f13946K, c3349h2M17232a.f13947L);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0065  */
    @Override // com.google.android.gms.internal.ads.zzbko
    public final void zze(String str) {
        byte b7;
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzkK)).booleanValue()) {
            AbstractC3490o0.m17545k("Received H5 gmsg: ".concat(String.valueOf(str)));
            Uri uri = Uri.parse(str);
            C7351t.m32349g();
            Map mapM17430u = C3431F0.m17430u(uri);
            String str2 = (String) mapM17430u.get("action");
            if (TextUtils.isEmpty(str2)) {
                AbstractC7599p.m33326a("H5 gmsg did not contain an action");
                return;
            }
            int iHashCode = str2.hashCode();
            if (iHashCode != 579053441) {
                if (iHashCode == 871091088 && str2.equals("initialize")) {
                    b7 = 0;
                } else {
                    b7 = -1;
                }
            } else if (str2.equals("dispose_all")) {
                b7 = 1;
            } else {
                b7 = -1;
            }
            if (b7 == 0) {
                this.zzc.clear();
                this.zzb.zza();
                return;
            }
            if (b7 == 1) {
                Map map = this.zzc;
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    ((zzdtv) it.next()).zzc();
                }
                map.clear();
                return;
            }
            String str3 = (String) mapM17430u.get("obj_id");
            try {
                Objects.requireNonNull(str3);
                long j7 = Long.parseLong(str3);
                switch (str2) {
                    case "create_interstitial_ad":
                        Map map2 = this.zzc;
                        if (map2.size() >= ((Integer) C3250D.m17200c().zzd(zzbci.zzkL)).intValue()) {
                            AbstractC7599p.m33331f("Could not create H5 ad, too many existing objects");
                            this.zzb.zzc(j7);
                            break;
                        } else {
                            Long lValueOf = Long.valueOf(j7);
                            if (!map2.containsKey(lValueOf)) {
                                String str4 = (String) mapM17430u.get("ad_unit");
                                if (!TextUtils.isEmpty(str4)) {
                                    zzdtw zzdtwVarZzc = this.zza.zzc();
                                    zzdtwVarZzc.zzc(j7);
                                    zzdtwVarZzc.zzb(str4);
                                    map2.put(lValueOf, zzdtwVarZzc.zza().zza());
                                    this.zzb.zzb(j7);
                                    StringBuilder sb = new StringBuilder(String.valueOf(j7).length() + 39 + String.valueOf(str4).length());
                                    sb.append("Created H5 interstitial #");
                                    sb.append(j7);
                                    sb.append(" with ad unit ");
                                    sb.append(str4);
                                    AbstractC3490o0.m17545k(sb.toString());
                                } else {
                                    AbstractC7599p.m33331f("Could not create H5 ad, missing ad unit id");
                                    this.zzb.zzc(j7);
                                }
                            } else {
                                AbstractC7599p.m33326a("Could not create H5 ad, object ID already exists");
                                this.zzb.zzc(j7);
                            }
                            break;
                        }
                        break;
                    case "load_interstitial_ad":
                        zzdtv zzdtvVar = (zzdtv) this.zzc.get(Long.valueOf(j7));
                        if (zzdtvVar == null) {
                            AbstractC7599p.m33326a("Could not load H5 ad, object ID does not exist");
                            this.zzb.zzd(j7);
                            break;
                        } else {
                            zzdtvVar.zza(zzc(mapM17430u));
                            break;
                        }
                        break;
                    case "show_interstitial_ad":
                        zzdtv zzdtvVar2 = (zzdtv) this.zzc.get(Long.valueOf(j7));
                        if (zzdtvVar2 == null) {
                            AbstractC7599p.m33326a("Could not show H5 ad, object ID does not exist");
                            this.zzb.zzd(j7);
                            break;
                        } else {
                            zzdtvVar2.zzb();
                            break;
                        }
                        break;
                    case "create_rewarded_ad":
                        Map map3 = this.zzc;
                        if (map3.size() >= ((Integer) C3250D.m17200c().zzd(zzbci.zzkL)).intValue()) {
                            AbstractC7599p.m33331f("Could not create H5 ad, too many existing objects");
                            this.zzb.zzc(j7);
                            break;
                        } else {
                            Long lValueOf2 = Long.valueOf(j7);
                            if (!map3.containsKey(lValueOf2)) {
                                String str5 = (String) mapM17430u.get("ad_unit");
                                if (!TextUtils.isEmpty(str5)) {
                                    zzdtw zzdtwVarZzc2 = this.zza.zzc();
                                    zzdtwVarZzc2.zzc(j7);
                                    zzdtwVarZzc2.zzb(str5);
                                    map3.put(lValueOf2, zzdtwVarZzc2.zza().zzb());
                                    this.zzb.zzb(j7);
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(j7).length() + 35 + String.valueOf(str5).length());
                                    sb2.append("Created H5 rewarded #");
                                    sb2.append(j7);
                                    sb2.append(" with ad unit ");
                                    sb2.append(str5);
                                    AbstractC3490o0.m17545k(sb2.toString());
                                } else {
                                    AbstractC7599p.m33331f("Could not create H5 ad, missing ad unit id");
                                    this.zzb.zzc(j7);
                                }
                            } else {
                                AbstractC7599p.m33326a("Could not create H5 ad, object ID already exists");
                                this.zzb.zzc(j7);
                            }
                            break;
                        }
                        break;
                    case "load_rewarded_ad":
                        zzdtv zzdtvVar3 = (zzdtv) this.zzc.get(Long.valueOf(j7));
                        if (zzdtvVar3 == null) {
                            AbstractC7599p.m33326a("Could not load H5 ad, object ID does not exist");
                            this.zzb.zzj(j7);
                            break;
                        } else {
                            zzdtvVar3.zza(zzc(mapM17430u));
                            break;
                        }
                        break;
                    case "show_rewarded_ad":
                        zzdtv zzdtvVar4 = (zzdtv) this.zzc.get(Long.valueOf(j7));
                        if (zzdtvVar4 == null) {
                            AbstractC7599p.m33326a("Could not show H5 ad, object ID does not exist");
                            this.zzb.zzj(j7);
                            break;
                        } else {
                            zzdtvVar4.zzb();
                            break;
                        }
                        break;
                    case "dispose":
                        Map map4 = this.zzc;
                        Long lValueOf3 = Long.valueOf(j7);
                        zzdtv zzdtvVar5 = (zzdtv) map4.get(lValueOf3);
                        if (zzdtvVar5 == null) {
                            AbstractC7599p.m33326a("Could not dispose H5 ad, object ID does not exist");
                            break;
                        } else {
                            zzdtvVar5.zzc();
                            map4.remove(lValueOf3);
                            StringBuilder sb3 = new StringBuilder(String.valueOf(j7).length() + 16);
                            sb3.append("Disposed H5 ad #");
                            sb3.append(j7);
                            AbstractC3490o0.m17545k(sb3.toString());
                            break;
                        }
                        break;
                    default:
                        AbstractC7599p.m33326a("H5 gmsg contained invalid action: ".concat(str2));
                        break;
                }
            } catch (NullPointerException | NumberFormatException unused) {
                AbstractC7599p.m33326a("H5 gmsg did not contain a valid object id: ".concat(String.valueOf(str3)));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbko
    public final void zzf() {
        this.zzc.clear();
    }
}
