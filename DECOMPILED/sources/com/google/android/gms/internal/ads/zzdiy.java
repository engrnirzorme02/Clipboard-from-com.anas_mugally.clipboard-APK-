package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.AbstractC3453S;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdiy extends zzdiz {
    private final JSONObject zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final boolean zze;
    private final boolean zzf;
    private final String zzg;
    private final JSONObject zzh;

    public zzdiy(zzfcj zzfcjVar, JSONObject jSONObject) {
        super(zzfcjVar);
        this.zzb = AbstractC3453S.m17482i(jSONObject, "tracking_urls_and_actions", "active_view");
        this.zzc = AbstractC3453S.m17483j(false, jSONObject, "allow_pub_owned_ad_view");
        this.zzd = AbstractC3453S.m17483j(false, jSONObject, "attribution", "allow_pub_rendering");
        this.zze = AbstractC3453S.m17483j(false, jSONObject, "enable_omid");
        this.zzg = AbstractC3453S.m17484k("", jSONObject, "watermark_overlay_png_base64");
        this.zzf = jSONObject.optJSONObject("overlay") != null;
        this.zzh = jSONObject.optJSONObject("omid_settings");
    }

    @Override // com.google.android.gms.internal.ads.zzdiz
    public final JSONObject zza() {
        JSONObject jSONObject = this.zzb;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            return new JSONObject(this.zza.zzz);
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdiz
    public final boolean zzb() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzdiz
    public final boolean zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzdiz
    public final boolean zzd() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzdiz
    public final boolean zze() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzdiz
    public final String zzf() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzdiz
    public final zzfdf zzg() {
        JSONObject jSONObject = this.zzh;
        return jSONObject != null ? new zzfdf(jSONObject) : this.zza.zzV;
    }
}
