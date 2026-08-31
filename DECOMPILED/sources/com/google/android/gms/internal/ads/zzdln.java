package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.C3431F0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;
import p157U3.InterfaceFutureC1673e;
import p380w2.C7333b;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdln {
    private final zzgpd zza;
    private final zzdmc zzb;
    private final zzdmh zzc;
    private final zzdsg zzd;

    zzdln(zzgpd zzgpdVar, zzdmc zzdmcVar, zzdmh zzdmhVar, zzdsg zzdsgVar) {
        this.zza = zzgpdVar;
        this.zzb = zzdmcVar;
        this.zzc = zzdmhVar;
        this.zzd = zzdsgVar;
    }

    private final InterfaceFutureC1673e zze(InterfaceFutureC1673e interfaceFutureC1673e, zzdru zzdruVar) {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzcy)).booleanValue()) {
            zzgot.zzq(interfaceFutureC1673e, new zzdlk(this, zzdruVar), this.zza);
        }
        return interfaceFutureC1673e;
    }

    private static final boolean zzf(JSONObject jSONObject) {
        return jSONObject.optInt("template_id") == 3;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00fe  */
    public final InterfaceFutureC1673e zza(final zzfcu zzfcuVar, final zzfcj zzfcjVar, final JSONObject jSONObject, C7333b c7333b, zzbxf zzbxfVar) {
        InterfaceFutureC1673e interfaceFutureC1673eZza;
        JSONArray jSONArrayOptJSONArray;
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzct)).booleanValue()) {
            this.zzd.zze().putLong(zzdru.RENDERING_NATIVE_ASSETS_LOADING_START.zza(), C7351t.m32357o().mo18159a());
        }
        final InterfaceFutureC1673e interfaceFutureC1673eSubmit = this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzdlm
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzb(zzfcuVar, zzfcjVar, jSONObject);
            }
        });
        zze(interfaceFutureC1673eSubmit, zzdru.NATIVE_ASSETS_LOADING_BASIC_END);
        zzdmc zzdmcVar = this.zzb;
        final InterfaceFutureC1673e interfaceFutureC1673eZzb = zzdmcVar.zzb(jSONObject, "images", zzdru.NATIVE_ASSETS_LOADING_IMAGE_START);
        zze(interfaceFutureC1673eZzb, zzdru.NATIVE_ASSETS_LOADING_IMAGE_END);
        zzfcm zzfcmVar = zzfcuVar.zzb.zzb;
        final InterfaceFutureC1673e interfaceFutureC1673eZzc = zzdmcVar.zzc(jSONObject, "images", zzfcjVar, zzfcmVar, c7333b, zzbxfVar);
        zze(interfaceFutureC1673eZzc, zzdru.NATIVE_ASSETS_LOADING_IMAGE_COMPOSITION_END);
        final InterfaceFutureC1673e interfaceFutureC1673eZza2 = zzdmcVar.zza(jSONObject, "secondary_image", zzdru.NATIVE_ASSETS_LOADING_LOGO_START);
        zze(interfaceFutureC1673eZza2, zzdru.NATIVE_ASSETS_LOADING_LOGO_END);
        final InterfaceFutureC1673e interfaceFutureC1673eZza3 = zzdmcVar.zza(jSONObject, "app_icon", zzdru.NATIVE_ASSETS_LOADING_ICON_START);
        zze(interfaceFutureC1673eZza3, zzdru.NATIVE_ASSETS_LOADING_ICON_END);
        final InterfaceFutureC1673e interfaceFutureC1673eZzd = zzdmcVar.zzd(jSONObject, "attribution", zzdru.NATIVE_ASSETS_LOADING_ATTRIBUTION_START);
        zze(interfaceFutureC1673eZzd, zzdru.NATIVE_ASSETS_LOADING_ATTRIBUTION_END);
        final InterfaceFutureC1673e interfaceFutureC1673eZzg = zzdmcVar.zzg(jSONObject, zzfcjVar, zzfcmVar, c7333b, zzbxfVar);
        zze(interfaceFutureC1673eZzg, zzdru.NATIVE_ASSETS_LOADING_VIDEO_END);
        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zznO)).booleanValue() || !jSONObject.has("video")) {
            interfaceFutureC1673eZza = zzgot.zza(new Bundle());
            break;
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("video");
        if (jSONObjectOptJSONObject.has("flags") && (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("flags")) != null) {
            int i7 = 0;
            while (true) {
                if (i7 < jSONArrayOptJSONArray.length()) {
                    JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i7);
                    if (jSONObjectOptJSONObject2 == null || !jSONObjectOptJSONObject2.optString("key").equals("afma_video_player_type")) {
                        i7++;
                    } else {
                        try {
                            if (Integer.parseInt(jSONObjectOptJSONObject2.optString("value")) == 3) {
                                interfaceFutureC1673eZza = this.zzb.zzf(interfaceFutureC1673eZzg);
                                zze(interfaceFutureC1673eZza, zzdru.NATIVE_ASSETS_LOADING_MEDIA_END);
                                break;
                            }
                        } catch (NumberFormatException unused) {
                        }
                    }
                }
                interfaceFutureC1673eZza = zzgot.zza(new Bundle());
                break;
            }
        }
        interfaceFutureC1673eZza = zzgot.zza(new Bundle());
        break;
        final InterfaceFutureC1673e interfaceFutureC1673eZza4 = this.zzc.zza(jSONObject, "custom_assets");
        zze(interfaceFutureC1673eZza4, zzdru.NATIVE_ASSETS_LOADING_CUSTOM_END);
        final InterfaceFutureC1673e interfaceFutureC1673eZze = this.zzb.zze(jSONObject, c7333b, zzbxfVar);
        zze(interfaceFutureC1673eZze, zzdru.NATIVE_ASSETS_LOADING_OMID_END);
        ArrayList arrayList = new ArrayList();
        arrayList.add(interfaceFutureC1673eSubmit);
        arrayList.add(interfaceFutureC1673eZzb);
        arrayList.add(interfaceFutureC1673eZzc);
        arrayList.add(interfaceFutureC1673eZza2);
        arrayList.add(interfaceFutureC1673eZza3);
        arrayList.add(interfaceFutureC1673eZzd);
        arrayList.add(interfaceFutureC1673eZzg);
        arrayList.add(interfaceFutureC1673eZza);
        arrayList.add(interfaceFutureC1673eZza4);
        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzfQ)).booleanValue() || zzf(jSONObject)) {
            arrayList.add(interfaceFutureC1673eZze);
        }
        final InterfaceFutureC1673e interfaceFutureC1673e = interfaceFutureC1673eZza;
        return zzgot.zzm(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdll
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc(interfaceFutureC1673eSubmit, interfaceFutureC1673eZzb, interfaceFutureC1673eZza3, interfaceFutureC1673eZza2, interfaceFutureC1673eZzd, jSONObject, interfaceFutureC1673eZzg, interfaceFutureC1673e, interfaceFutureC1673eZzc, interfaceFutureC1673eZze, interfaceFutureC1673eZza4);
            }
        }, this.zza);
    }

    final /* synthetic */ zzdiu zzb(zzfcu zzfcuVar, zzfcj zzfcjVar, JSONObject jSONObject) throws zzeho {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzcy)).booleanValue()) {
            this.zzd.zze().putLong(zzdru.NATIVE_ASSETS_LOADING_BASIC_START.zza(), C7351t.m32357o().mo18159a());
        }
        zzdiu zzdiuVar = new zzdiu();
        zzdiuVar.zza(jSONObject.optInt("template_id", -1));
        zzdiuVar.zzl(jSONObject.optString("custom_template_id"));
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("omid_settings");
        zzdiuVar.zzv(jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("omid_partner_name") : null);
        zzfdc zzfdcVar = zzfcuVar.zza.zza;
        if (!zzfdcVar.zzh.contains(Integer.toString(zzdiuVar.zzx()))) {
            int iZzx = zzdiuVar.zzx();
            StringBuilder sb = new StringBuilder(String.valueOf(iZzx).length() + 21);
            sb.append("Invalid template ID: ");
            sb.append(iZzx);
            throw new zzeho(1, sb.toString());
        }
        if (zzdiuVar.zzx() == 3) {
            if (zzdiuVar.zzS() == null) {
                throw new zzeho(1, "No custom template id for custom template ad response.");
            }
            if (!zzfdcVar.zzi.contains(zzdiuVar.zzS())) {
                throw new zzeho(1, "Unexpected custom template id in the response.");
            }
        }
        zzdiuVar.zzi(jSONObject.optDouble("rating", -1.0d));
        String strOptString = jSONObject.optString("headline", null);
        if (zzfcjVar.zzM) {
            C7351t.m32349g();
            String strM17404c = C3431F0.m17404c();
            StringBuilder sb2 = new StringBuilder(String.valueOf(strM17404c).length() + 3 + String.valueOf(strOptString).length());
            sb2.append(strM17404c);
            sb2.append(" : ");
            sb2.append(strOptString);
            strOptString = sb2.toString();
        }
        zzdiuVar.zzs("headline", strOptString);
        zzdiuVar.zzs("body", jSONObject.optString("body", null));
        zzdiuVar.zzs("call_to_action", jSONObject.optString("call_to_action", null));
        zzdiuVar.zzs("store", jSONObject.optString("store", null));
        zzdiuVar.zzs("price", jSONObject.optString("price", null));
        zzdiuVar.zzs("advertiser", jSONObject.optString("advertiser", null));
        return zzdiuVar;
    }

    final /* synthetic */ zzdiu zzc(InterfaceFutureC1673e interfaceFutureC1673e, InterfaceFutureC1673e interfaceFutureC1673e2, InterfaceFutureC1673e interfaceFutureC1673e3, InterfaceFutureC1673e interfaceFutureC1673e4, InterfaceFutureC1673e interfaceFutureC1673e5, JSONObject jSONObject, InterfaceFutureC1673e interfaceFutureC1673e6, InterfaceFutureC1673e interfaceFutureC1673e7, InterfaceFutureC1673e interfaceFutureC1673e8, InterfaceFutureC1673e interfaceFutureC1673e9, InterfaceFutureC1673e interfaceFutureC1673e10) {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzct)).booleanValue()) {
            this.zzd.zze().putLong(zzdru.RENDERING_NATIVE_ASSETS_LOADING_END.zza(), C7351t.m32357o().mo18159a());
        }
        zzdiu zzdiuVar = (zzdiu) interfaceFutureC1673e.get();
        zzdiuVar.zzd((List) interfaceFutureC1673e2.get());
        zzdiuVar.zzj((zzbfw) interfaceFutureC1673e3.get());
        zzdiuVar.zzk((zzbfw) interfaceFutureC1673e4.get());
        zzdiuVar.zzc((zzbfp) interfaceFutureC1673e5.get());
        zzdiuVar.zze(zzdmc.zzl(jSONObject));
        zzdiuVar.zzf(zzdmc.zzk(jSONObject));
        zzcek zzcekVar = (zzcek) interfaceFutureC1673e6.get();
        if (zzcekVar != null) {
            zzdiuVar.zzm(zzcekVar);
            zzdiuVar.zzg(zzcekVar.zzE());
            zzdiuVar.zzb(zzcekVar.zzh());
        }
        zzdiuVar.zzH().putAll((Bundle) interfaceFutureC1673e7.get());
        zzcek zzcekVar2 = (zzcek) interfaceFutureC1673e8.get();
        if (zzcekVar2 != null) {
            zzdiuVar.zzn(zzcekVar2);
            zzdiuVar.zzh(zzcekVar2.zzE());
        }
        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzfQ)).booleanValue() || zzf(jSONObject)) {
            zzcek zzcekVar3 = (zzcek) interfaceFutureC1673e9.get();
            if (zzcekVar3 != null) {
                zzdiuVar.zzo(zzcekVar3);
            }
        } else {
            zzdiuVar.zzp(interfaceFutureC1673e9);
            zzdiuVar.zzr(new zzbzm());
        }
        for (zzdme zzdmeVar : (List) interfaceFutureC1673e10.get()) {
            if (zzdmeVar.zza != 1) {
                zzdiuVar.zzt(zzdmeVar.zzb, zzdmeVar.zzd);
            } else {
                zzdiuVar.zzs(zzdmeVar.zzb, zzdmeVar.zzc);
            }
        }
        return zzdiuVar;
    }

    final /* synthetic */ zzdsg zzd() {
        return this.zzd;
    }
}
