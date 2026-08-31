package com.google.android.gms.internal.p411firebaseauthapi;

import com.google.android.gms.common.internal.AbstractC3718s;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaji implements zzafa {
    private final String zza;
    private final String zzb;
    private final String zzc;

    public zzaji(String str, String str2, String str3) {
        this.zza = AbstractC3718s.m18077f(str);
        this.zzb = AbstractC3718s.m18077f(str2);
        this.zzc = str3;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzafa
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", this.zza);
        jSONObject.put("mfaEnrollmentId", this.zzb);
        String str = this.zzc;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        return jSONObject.toString();
    }
}
