package com.google.android.gms.internal.p411firebaseauthapi;

import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.common.util.AbstractC3765t;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class zzahs implements zzaez<zzahs> {
    private static final String zza = "zzahs";
    private String zzb;
    private zzah<zzaid> zzc;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaez
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzahs zza(String str) throws zzacn {
        zzah<zzaid> zzahVarZzg;
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = AbstractC3765t.m18208a(jSONObject.optString("recaptchaKey"));
            if (jSONObject.has("recaptchaEnforcementState")) {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("recaptchaEnforcementState");
                if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
                    zzahVarZzg = zzah.zzg();
                } else {
                    zzak zzakVarZzf = zzah.zzf();
                    for (int i7 = 0; i7 < jSONArrayOptJSONArray.length(); i7++) {
                        JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i7);
                        zzakVarZzf.zza(jSONObject2 == null ? zzaid.zza(null, null) : zzaid.zza(AbstractC3765t.m18208a(jSONObject2.optString("provider")), AbstractC3765t.m18208a(jSONObject2.optString("enforcementState"))));
                    }
                    zzahVarZzg = zzakVarZzf.zza();
                }
                this.zzc = zzahVarZzg;
            }
            return this;
        } catch (NullPointerException e7) {
            e = e7;
            throw zzajk.zza(e, zza, str);
        } catch (JSONException e8) {
            e = e8;
            throw zzajk.zza(e, zza, str);
        }
    }

    public final String zzb(String str) {
        AbstractC3718s.m18077f(str);
        zzah<zzaid> zzahVar = this.zzc;
        if (zzahVar != null && !zzahVar.isEmpty()) {
            zzah<zzaid> zzahVar2 = this.zzc;
            int size = zzahVar2.size();
            int i7 = 0;
            while (i7 < size) {
                zzaid zzaidVar = zzahVar2.get(i7);
                i7++;
                zzaid zzaidVar2 = zzaidVar;
                String strZza = zzaidVar2.zza();
                String strZzb = zzaidVar2.zzb();
                if (strZza != null && strZzb != null && strZzb.equals(str)) {
                    return zzaidVar2.zza();
                }
            }
        }
        return null;
    }

    public final boolean zzc(String str) {
        String strZzb = zzb(str);
        if (strZzb == null) {
            return false;
        }
        return strZzb.equals("ENFORCE") || strZzb.equals("AUDIT");
    }

    public final String zza() {
        return this.zzb;
    }
}
