package com.android.billingclient.api;

import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.android.billingclient.api.i */
/* JADX INFO: loaded from: classes.dex */
public final class C3183i {

    /* JADX INFO: renamed from: a */
    private final String f13636a;

    /* JADX INFO: renamed from: b */
    private final String f13637b;

    /* JADX INFO: renamed from: c */
    private final String f13638c;

    /* JADX INFO: renamed from: d */
    private final int f13639d;

    /* JADX INFO: renamed from: e */
    private final String f13640e;

    C3183i(String str) {
        this.f13636a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f13637b = jSONObject.optString("productId");
        String strOptString = jSONObject.optString("type");
        this.f13638c = strOptString;
        this.f13639d = jSONObject.has("statusCode") ? jSONObject.optInt("statusCode") : 0;
        if (TextUtils.isEmpty(strOptString)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        this.f13640e = jSONObject.optString("serializedDocid");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3183i) {
            return TextUtils.equals(this.f13636a, ((C3183i) obj).f13636a);
        }
        return false;
    }

    public int hashCode() {
        return this.f13636a.hashCode();
    }

    public String toString() {
        return "UnfetchedProduct{productId='" + this.f13637b + "', productType='" + this.f13638c + "', statusCode=" + this.f13639d + "}";
    }
}
