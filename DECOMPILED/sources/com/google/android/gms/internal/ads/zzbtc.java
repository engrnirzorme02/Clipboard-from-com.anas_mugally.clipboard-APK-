package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbtc {
    public final boolean zza;
    public final String zzb;
    public final boolean zzc;

    public zzbtc(boolean z7, String str, boolean z8) {
        this.zza = z7;
        this.zzb = str;
        this.zzc = z8;
    }

    public static zzbtc zza(JSONObject jSONObject) {
        return new zzbtc(jSONObject.optBoolean("enable_prewarming", false), jSONObject.optString("prefetch_url", ""), jSONObject.optBoolean("skip_offline_notification_flow", false));
    }
}
