package com.google.android.gms.internal.p411firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC3718s;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzais implements zzaio {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private zzagm zzg;
    private final String zzh;

    private zzais(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.zza = AbstractC3718s.m18077f(str);
        AbstractC3718s.m18077f(str2);
        this.zzb = str3;
        this.zzc = str4;
        this.zzd = str5;
        this.zze = str6;
        this.zzf = str7;
        this.zzh = null;
    }

    public static zzais zza(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        AbstractC3718s.m18077f(str2);
        return new zzais(str, "phone", str2, str3, str4, str5, str6, null);
    }

    public final String zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzafa
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", this.zza);
        jSONObject.put("mfaProvider", 1);
        if (this.zzb != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("phoneNumber", this.zzb);
            if (!TextUtils.isEmpty(this.zzd)) {
                jSONObject2.put("recaptchaToken", this.zzd);
            }
            if (!TextUtils.isEmpty(this.zze)) {
                jSONObject2.put("playIntegrityToken", this.zze);
            }
            zzagm zzagmVar = this.zzg;
            if (zzagmVar != null) {
                jSONObject2.put("autoRetrievalInfo", zzagmVar.zza());
            }
            String str = this.zzf;
            if (str != null) {
                zzajk.zza(jSONObject2, "captchaResponse", str);
            } else {
                zzajk.zza(jSONObject2);
            }
            jSONObject.put("phoneEnrollmentInfo", jSONObject2);
        }
        if (!TextUtils.isEmpty(null)) {
            jSONObject.put("tenantId", (Object) null);
        }
        return jSONObject.toString();
    }

    public final void zza(zzagm zzagmVar) {
        this.zzg = zzagmVar;
    }
}
