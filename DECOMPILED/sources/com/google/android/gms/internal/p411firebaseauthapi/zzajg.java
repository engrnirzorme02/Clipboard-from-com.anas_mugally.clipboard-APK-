package com.google.android.gms.internal.p411firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC3718s;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzajg implements zzafa {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private boolean zzf;

    private zzajg() {
    }

    public static zzajg zza(String str, String str2, boolean z7) {
        zzajg zzajgVar = new zzajg();
        zzajgVar.zzb = AbstractC3718s.m18077f(str);
        zzajgVar.zzc = AbstractC3718s.m18077f(str2);
        zzajgVar.zzf = z7;
        return zzajgVar;
    }

    public static zzajg zzb(String str, String str2, boolean z7) {
        zzajg zzajgVar = new zzajg();
        zzajgVar.zza = AbstractC3718s.m18077f(str);
        zzajgVar.zzd = AbstractC3718s.m18077f(str2);
        zzajgVar.zzf = z7;
        return zzajgVar;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzafa
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(this.zzd)) {
            jSONObject.put("phoneNumber", this.zza);
            jSONObject.put("temporaryProof", this.zzd);
        } else {
            jSONObject.put("sessionInfo", this.zzb);
            jSONObject.put("code", this.zzc);
        }
        String str = this.zze;
        if (str != null) {
            jSONObject.put("idToken", str);
        }
        if (!this.zzf) {
            jSONObject.put("operation", 2);
        }
        return jSONObject.toString();
    }

    public final void zza(String str) {
        this.zze = str;
    }
}
