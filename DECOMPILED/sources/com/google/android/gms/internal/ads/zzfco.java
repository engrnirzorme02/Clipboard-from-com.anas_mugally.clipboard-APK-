package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.google.android.gms.ads.internal.util.AbstractC3453S;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfco {
    public final String zza;
    public final String zzb;
    public final JSONObject zzc;
    public final JSONObject zzd;

    zzfco(JsonReader jsonReader) {
        JSONObject jSONObjectM17477d = AbstractC3453S.m17477d(jsonReader);
        this.zzd = jSONObjectM17477d;
        this.zza = jSONObjectM17477d.optString("ad_html", null);
        this.zzb = jSONObjectM17477d.optString("ad_base_url", null);
        this.zzc = jSONObjectM17477d.optJSONObject("ad_json");
    }
}
