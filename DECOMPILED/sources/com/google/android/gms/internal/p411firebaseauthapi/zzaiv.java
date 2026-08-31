package com.google.android.gms.internal.p411firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaiv extends zzair {
    private static final String zza = "zzaiv";
    private String zzb;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzair
    /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final zzaiv zza(String str) throws zzacn {
        try {
            JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject("phoneSessionInfo");
            if (jSONObjectOptJSONObject == null) {
                return this;
            }
            this.zzb = zzac.zza(jSONObjectOptJSONObject.optString("sessionInfo"));
            return this;
        } catch (NullPointerException | JSONException e7) {
            throw zzajk.zza(e7, zza, str);
        }
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzair, com.google.android.gms.internal.p411firebaseauthapi.zzaez
    public final /* synthetic */ zzaez zza(String str) {
        return (zzaiv) zza(str);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzair
    public final String zza() {
        return this.zzb;
    }
}
