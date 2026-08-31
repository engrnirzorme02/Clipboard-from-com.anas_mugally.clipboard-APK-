package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.internal.p411firebaseauthapi.zzaao;
import org.json.JSONException;
import org.json.JSONObject;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: com.google.firebase.auth.K */
/* JADX INFO: loaded from: classes.dex */
public class C4827K extends AbstractC4817C {
    public static final Parcelable.Creator<C4827K> CREATOR = new C4847c0();

    /* JADX INFO: renamed from: a */
    private final String f18472a;

    /* JADX INFO: renamed from: b */
    private final String f18473b;

    /* JADX INFO: renamed from: c */
    private final long f18474c;

    /* JADX INFO: renamed from: d */
    private final String f18475d;

    public C4827K(String str, String str2, long j7, String str3) {
        this.f18472a = AbstractC3718s.m18077f(str);
        this.f18473b = str2;
        this.f18474c = j7;
        this.f18475d = AbstractC3718s.m18077f(str3);
    }

    /* JADX INFO: renamed from: Z */
    public static C4827K m22012Z(JSONObject jSONObject) {
        if (jSONObject.has("enrollmentTimestamp")) {
            return new C4827K(jSONObject.optString("uid"), jSONObject.optString("displayName"), jSONObject.optLong("enrollmentTimestamp"), jSONObject.optString("phoneNumber"));
        }
        throw new IllegalArgumentException("An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a PhoneMultiFactorInfo instance.");
    }

    @Override // com.google.firebase.auth.AbstractC4817C
    /* JADX INFO: renamed from: T */
    public String mo21965T() {
        return this.f18473b;
    }

    @Override // com.google.firebase.auth.AbstractC4817C
    /* JADX INFO: renamed from: U */
    public long mo21966U() {
        return this.f18474c;
    }

    @Override // com.google.firebase.auth.AbstractC4817C
    /* JADX INFO: renamed from: V */
    public String mo21967V() {
        return "phone";
    }

    @Override // com.google.firebase.auth.AbstractC4817C
    /* JADX INFO: renamed from: W */
    public String mo21968W() {
        return this.f18472a;
    }

    @Override // com.google.firebase.auth.AbstractC4817C
    /* JADX INFO: renamed from: X */
    public JSONObject mo21969X() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", "phone");
            jSONObject.putOpt("uid", this.f18472a);
            jSONObject.putOpt("displayName", this.f18473b);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.f18474c));
            jSONObject.putOpt("phoneNumber", this.f18475d);
            return jSONObject;
        } catch (JSONException e7) {
            Log.d("PhoneMultiFactorInfo", "Failed to jsonify this object");
            throw new zzaao(e7);
        }
    }

    /* JADX INFO: renamed from: Y */
    public String m22013Y() {
        return this.f18475d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8044E(parcel, 1, mo21968W(), false);
        AbstractC1947c.m8044E(parcel, 2, mo21965T(), false);
        AbstractC1947c.m8076x(parcel, 3, mo21966U());
        AbstractC1947c.m8044E(parcel, 4, m22013Y(), false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
