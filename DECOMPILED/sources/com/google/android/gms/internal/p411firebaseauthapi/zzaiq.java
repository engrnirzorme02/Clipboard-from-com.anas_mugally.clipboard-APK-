package com.google.android.gms.internal.p411firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC3718s;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaiq implements zzafa {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final String zzg;
    private final String zzh;
    private zzagm zzi;

    private zzaiq(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.zza = AbstractC3718s.m18077f(str);
        this.zzb = AbstractC3718s.m18077f(str2);
        this.zzc = AbstractC3718s.m18077f(str3);
        this.zze = str4;
        this.zzd = str5;
        this.zzf = str6;
        this.zzg = str7;
        this.zzh = str8;
    }

    public static zzaiq zza(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        AbstractC3718s.m18077f(str3);
        return new zzaiq("phone", str, str2, str3, str4, str5, str6, str7);
    }

    public final String zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzafa
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("mfaPendingCredential", this.zzb);
        jSONObject.put("mfaEnrollmentId", this.zzc);
        this.zza.getClass();
        jSONObject.put("mfaProvider", 1);
        if (this.zze != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("phoneNumber", this.zze);
            if (!TextUtils.isEmpty(this.zzf)) {
                jSONObject2.put("recaptchaToken", this.zzf);
            }
            if (!TextUtils.isEmpty(this.zzg)) {
                jSONObject2.put("playIntegrityToken", this.zzg);
            }
            String str = this.zzh;
            if (str != null) {
                zzajk.zza(jSONObject2, "captchaResponse", str);
            } else {
                zzajk.zza(jSONObject2);
            }
            zzagm zzagmVar = this.zzi;
            if (zzagmVar != null) {
                jSONObject2.put("autoRetrievalInfo", zzagmVar.zza());
            }
            jSONObject.put("phoneSignInInfo", jSONObject2);
        }
        return jSONObject.toString();
    }

    public final void zza(zzagm zzagmVar) {
        this.zzi = zzagmVar;
    }
}
