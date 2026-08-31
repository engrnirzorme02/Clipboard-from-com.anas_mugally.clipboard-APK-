package com.google.android.gms.internal.p411firebaseauthapi;

import com.google.android.gms.common.internal.AbstractC3718s;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzahe implements zzahb {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;

    private zzahe(String str, String str2, String str3, String str4, String str5) {
        AbstractC3718s.m18077f(str);
        this.zza = AbstractC3718s.m18077f(str2);
        this.zzb = str3;
        this.zzc = str4;
        this.zzd = str5;
    }

    public static zzahe zza(String str, String str2, String str3, String str4) {
        AbstractC3718s.m18077f(str2);
        AbstractC3718s.m18077f(str4);
        return new zzahe("totp", str, str2, str3, str4);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzafa
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        String str = this.zzb;
        if (str != null) {
            jSONObject2.put("verificationCode", str);
        }
        jSONObject.put("totpVerificationInfo", jSONObject2);
        jSONObject.put("mfaPendingCredential", this.zza);
        String str2 = this.zzc;
        if (str2 != null) {
            jSONObject.put("tenantId", str2);
        }
        String str3 = this.zzd;
        if (str3 != null) {
            jSONObject.put("mfaEnrollmentId", str3);
        }
        return jSONObject.toString();
    }
}
