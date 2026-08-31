package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class Purchase {

    /* JADX INFO: renamed from: a */
    private final String f13477a;

    /* JADX INFO: renamed from: b */
    private final String f13478b;

    /* JADX INFO: renamed from: c */
    private final JSONObject f13479c;

    public Purchase(String str, String str2) {
        this.f13477a = str;
        this.f13478b = str2;
        this.f13479c = new JSONObject(str);
    }

    /* JADX INFO: renamed from: g */
    private final ArrayList m16786g() {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = this.f13479c;
        if (jSONObject.has("productIds")) {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("productIds");
            if (jSONArrayOptJSONArray != null) {
                for (int i7 = 0; i7 < jSONArrayOptJSONArray.length(); i7++) {
                    arrayList.add(jSONArrayOptJSONArray.optString(i7));
                }
            }
        } else if (jSONObject.has("productId")) {
            arrayList.add(jSONObject.optString("productId"));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public String m16787a() {
        return this.f13477a;
    }

    /* JADX INFO: renamed from: b */
    public List m16788b() {
        return m16786g();
    }

    /* JADX INFO: renamed from: c */
    public int m16789c() {
        return this.f13479c.optInt("purchaseState", 1) != 4 ? 1 : 2;
    }

    /* JADX INFO: renamed from: d */
    public String m16790d() {
        JSONObject jSONObject = this.f13479c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    /* JADX INFO: renamed from: e */
    public String m16791e() {
        return this.f13478b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) obj;
        return TextUtils.equals(this.f13477a, purchase.m16787a()) && TextUtils.equals(this.f13478b, purchase.m16791e());
    }

    /* JADX INFO: renamed from: f */
    public boolean m16792f() {
        return this.f13479c.optBoolean("acknowledged", true);
    }

    public int hashCode() {
        return this.f13477a.hashCode();
    }

    public String toString() {
        return "Purchase. Json: ".concat(String.valueOf(this.f13477a));
    }
}
