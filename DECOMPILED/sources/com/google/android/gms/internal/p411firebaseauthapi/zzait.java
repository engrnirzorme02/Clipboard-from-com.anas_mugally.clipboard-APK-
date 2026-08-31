package com.google.android.gms.internal.p411firebaseauthapi;

import com.google.android.gms.common.util.AbstractC3765t;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class zzait implements zzaez<zzait> {
    private static final String zza = "zzait";
    private String zzb;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaez
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzait zza(String str) throws zzacn {
        try {
            JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject("phoneResponseInfo");
            if (jSONObjectOptJSONObject == null) {
                return this;
            }
            this.zzb = AbstractC3765t.m18208a(jSONObjectOptJSONObject.optString("sessionInfo"));
            return this;
        } catch (NullPointerException | JSONException e7) {
            throw zzajk.zza(e7, zza, str);
        }
    }

    public final String zza() {
        return this.zzb;
    }
}
