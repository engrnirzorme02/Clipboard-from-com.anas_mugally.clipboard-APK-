package com.google.android.gms.internal.p411firebaseauthapi;

import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.firebase.auth.C4850e;
import com.google.firebase.auth.C4856h;
import org.json.JSONException;
import org.json.JSONObject;
import p191Z2.C2086a;

/* JADX INFO: loaded from: classes2.dex */
public class zzagx implements zzafa {
    private static final String zza = "zzagx";
    private final String zzb;
    private final String zzc;
    private final C4856h zzd;
    private final String zze;
    private final String zzf;

    static {
        new C2086a(zzagx.class.getSimpleName(), new String[0]);
    }

    public zzagx(C4856h c4856h, String str, String str2) {
        this.zzd = (C4856h) AbstractC3718s.m18083l(c4856h);
        this.zzb = AbstractC3718s.m18077f(c4856h.zzc());
        this.zzc = AbstractC3718s.m18077f(c4856h.zze());
        this.zze = str;
        this.zzf = str2;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzafa
    public final String zza() throws JSONException {
        C4850e c4850eM22032b = C4850e.m22032b(this.zzc);
        String strM22034a = c4850eM22032b != null ? c4850eM22032b.m22034a() : null;
        String strM22035c = c4850eM22032b != null ? c4850eM22032b.m22035c() : null;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("email", this.zzb);
        if (strM22034a != null) {
            jSONObject.put("oobCode", strM22034a);
        }
        if (strM22035c != null) {
            jSONObject.put("tenantId", strM22035c);
        }
        String str = this.zze;
        if (str != null) {
            jSONObject.put("idToken", str);
        }
        String str2 = this.zzf;
        if (str2 != null) {
            zzajk.zza(jSONObject, "captchaResp", str2);
        } else {
            zzajk.zza(jSONObject);
        }
        return jSONObject.toString();
    }

    public final C4856h zzb() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zzf;
    }
}
