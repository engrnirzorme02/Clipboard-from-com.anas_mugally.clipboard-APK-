package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3244B;
import com.google.android.gms.ads.internal.client.C3250D;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
final class zzeal implements zzbnw {
    zzeal() {
    }

    @Override // com.google.android.gms.internal.ads.zzbnw
    public final /* bridge */ /* synthetic */ JSONObject zzb(Object obj) throws JSONException {
        zzeam zzeamVar = (zzeam) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzkb)).booleanValue()) {
            zzbux zzbuxVar = zzeamVar.zzc;
            jSONObject2.put("ad_request_url", zzbuxVar.zze());
            jSONObject2.put("ad_request_post_body", zzbuxVar.zzd());
        }
        zzbux zzbuxVar2 = zzeamVar.zzc;
        jSONObject2.put("base_url", zzbuxVar2.zzc());
        jSONObject2.put("signals", zzeamVar.zzb);
        zzeas zzeasVar = zzeamVar.zza;
        jSONObject3.put("body", zzeasVar.zzc);
        jSONObject3.put("headers", C3244B.m17190a().m33296s(zzeasVar.zzb));
        jSONObject3.put("response_code", zzeasVar.zza);
        jSONObject3.put("latency", zzeasVar.zzd);
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", zzbuxVar2.zzh());
        return jSONObject;
    }
}
