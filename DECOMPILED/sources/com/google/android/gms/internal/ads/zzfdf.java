package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3250D;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfdf {
    private final JSONObject zza;

    public zzfdf(JSONObject jSONObject) {
        this.zza = jSONObject;
    }

    public final String zza() {
        if (zzc() - 1 != 1) {
            return "javascript";
        }
        return null;
    }

    public final boolean zzb() {
        return this.zza.optBoolean((String) C3250D.m17200c().zzd(zzbci.zzfO), true);
    }

    public final int zzc() {
        int iOptInt = this.zza.optInt("media_type", -1);
        if (iOptInt != 0) {
            return iOptInt != 1 ? 3 : 1;
        }
        return 2;
    }
}
