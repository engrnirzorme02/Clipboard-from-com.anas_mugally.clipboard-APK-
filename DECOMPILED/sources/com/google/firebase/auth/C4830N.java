package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.internal.p411firebaseauthapi.zzaao;
import com.google.android.gms.internal.p411firebaseauthapi.zzaiz;
import org.json.JSONException;
import org.json.JSONObject;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: com.google.firebase.auth.N */
/* JADX INFO: loaded from: classes.dex */
public class C4830N extends AbstractC4817C {
    public static final Parcelable.Creator<C4830N> CREATOR = new C4851e0();

    /* JADX INFO: renamed from: a */
    private final String f18477a;

    /* JADX INFO: renamed from: b */
    private final String f18478b;

    /* JADX INFO: renamed from: c */
    private final long f18479c;

    /* JADX INFO: renamed from: d */
    private final zzaiz f18480d;

    public C4830N(String str, String str2, long j7, zzaiz zzaizVar) {
        this.f18477a = AbstractC3718s.m18077f(str);
        this.f18478b = str2;
        this.f18479c = j7;
        this.f18480d = (zzaiz) AbstractC3718s.m18084m(zzaizVar, "totpInfo cannot be null.");
    }

    /* JADX INFO: renamed from: Y */
    public static C4830N m22015Y(JSONObject jSONObject) {
        if (!jSONObject.has("enrollmentTimestamp")) {
            throw new IllegalArgumentException("An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a TotpMultiFactorInfo instance.");
        }
        long jOptLong = jSONObject.optLong("enrollmentTimestamp");
        if (jSONObject.opt("totpInfo") == null) {
            throw new IllegalArgumentException("A totpInfo is required to build a TotpMultiFactorInfo instance.");
        }
        return new C4830N(jSONObject.optString("uid"), jSONObject.optString("displayName"), jOptLong, new zzaiz());
    }

    @Override // com.google.firebase.auth.AbstractC4817C
    /* JADX INFO: renamed from: T */
    public String mo21965T() {
        return this.f18478b;
    }

    @Override // com.google.firebase.auth.AbstractC4817C
    /* JADX INFO: renamed from: U */
    public long mo21966U() {
        return this.f18479c;
    }

    @Override // com.google.firebase.auth.AbstractC4817C
    /* JADX INFO: renamed from: V */
    public String mo21967V() {
        return "totp";
    }

    @Override // com.google.firebase.auth.AbstractC4817C
    /* JADX INFO: renamed from: W */
    public String mo21968W() {
        return this.f18477a;
    }

    @Override // com.google.firebase.auth.AbstractC4817C
    /* JADX INFO: renamed from: X */
    public JSONObject mo21969X() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", "totp");
            jSONObject.putOpt("uid", this.f18477a);
            jSONObject.putOpt("displayName", this.f18478b);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.f18479c));
            jSONObject.putOpt("totpInfo", this.f18480d);
            return jSONObject;
        } catch (JSONException e7) {
            Log.d("TotpMultiFactorInfo", "Failed to jsonify this object");
            throw new zzaao(e7);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8044E(parcel, 1, mo21968W(), false);
        AbstractC1947c.m8044E(parcel, 2, mo21965T(), false);
        AbstractC1947c.m8076x(parcel, 3, mo21966U());
        AbstractC1947c.m8042C(parcel, 4, this.f18480d, i7, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
