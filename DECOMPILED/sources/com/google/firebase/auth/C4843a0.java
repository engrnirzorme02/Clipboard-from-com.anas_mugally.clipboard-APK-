package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p411firebaseauthapi.zzah;
import com.google.android.gms.internal.p411firebaseauthapi.zzak;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: com.google.firebase.auth.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4843a0 extends AbstractC1945a {
    public static final Parcelable.Creator<C4843a0> CREATOR = new C4841Z();

    /* JADX INFO: renamed from: a */
    private final String f18497a;

    /* JADX INFO: renamed from: b */
    private final String f18498b;

    /* JADX INFO: renamed from: c */
    private final String f18499c;

    C4843a0(String str, String str2, String str3) {
        this.f18497a = str;
        this.f18498b = str2;
        this.f18499c = str3;
    }

    /* JADX INFO: renamed from: T */
    public static zzah m22020T(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return zzah.zzg();
        }
        zzak zzakVarZzf = zzah.zzf();
        for (int i7 = 0; i7 < jSONArray.length(); i7++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i7);
            zzakVarZzf.zza(new C4843a0(jSONObject.getString("credentialId"), jSONObject.getString("name"), jSONObject.getString("displayName")));
        }
        return zzakVarZzf.zza();
    }

    /* JADX INFO: renamed from: U */
    public static final C4843a0 m22021U(JSONObject jSONObject) {
        return new C4843a0(jSONObject.getString("credentialId"), jSONObject.getString("name"), jSONObject.getString("displayName"));
    }

    /* JADX INFO: renamed from: V */
    public static final JSONObject m22022V(C4843a0 c4843a0) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("credentialId", c4843a0.f18497a);
        jSONObject.put("name", c4843a0.f18498b);
        jSONObject.put("displayName", c4843a0.f18499c);
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8044E(parcel, 1, this.f18497a, false);
        AbstractC1947c.m8044E(parcel, 2, this.f18498b, false);
        AbstractC1947c.m8044E(parcel, 3, this.f18499c, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
