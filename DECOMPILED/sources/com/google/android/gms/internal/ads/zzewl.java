package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.AbstractC3453S;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzewl implements zzeun {
    private final String zza;
    private final String zzb;

    public zzewl(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        try {
            JSONObject jSONObjectM17481h = AbstractC3453S.m17481h((JSONObject) obj, "pii");
            jSONObjectM17481h.put("doritos", this.zza);
            jSONObjectM17481h.put("doritos_v2", this.zzb);
        } catch (JSONException unused) {
            AbstractC3490o0.m17545k("Failed putting doritos string.");
        }
    }
}
