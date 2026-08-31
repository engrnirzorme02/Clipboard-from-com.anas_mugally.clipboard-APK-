package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzeae implements zzfgm {
    static final /* synthetic */ zzeae zza = new zzeae();

    private /* synthetic */ zzeae() {
    }

    @Override // com.google.android.gms.internal.ads.zzfgm
    public final /* synthetic */ Object zza(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        AbstractC3490o0.m17545k("Ad request signals:");
        AbstractC3490o0.m17545k(jSONObject.toString(2));
        return jSONObject;
    }
}
