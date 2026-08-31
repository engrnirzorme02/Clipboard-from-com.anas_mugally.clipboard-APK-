package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3250D;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
final class zzdvm {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final int zzd;
    private final String zze;
    private final int zzf;
    private final boolean zzg;

    public zzdvm(String str, String str2, String str3, int i7, String str4, int i8, boolean z7) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = i7;
        this.zze = str4;
        this.zzf = i8;
        this.zzg = z7;
    }

    public final JSONObject zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("adapterClassName", this.zza);
        jSONObject.put("version", this.zzc);
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzke)).booleanValue()) {
            jSONObject.put("sdkVersion", this.zzb);
        }
        jSONObject.put("status", this.zzd);
        jSONObject.put("description", this.zze);
        jSONObject.put("initializationLatencyMillis", this.zzf);
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzkf)).booleanValue()) {
            jSONObject.put("supportsInitialization", this.zzg);
        }
        return jSONObject;
    }
}
