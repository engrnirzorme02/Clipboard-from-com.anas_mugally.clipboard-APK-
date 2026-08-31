package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.android.billingclient.api.f */
/* JADX INFO: loaded from: classes.dex */
public final class C3180f {

    /* JADX INFO: renamed from: a */
    private final String f13577a;

    /* JADX INFO: renamed from: b */
    private final JSONObject f13578b;

    /* JADX INFO: renamed from: c */
    private final String f13579c;

    /* JADX INFO: renamed from: d */
    private final String f13580d;

    /* JADX INFO: renamed from: e */
    private final String f13581e;

    /* JADX INFO: renamed from: f */
    private final String f13582f;

    /* JADX INFO: renamed from: g */
    private final String f13583g;

    /* JADX INFO: renamed from: h */
    private final String f13584h;

    /* JADX INFO: renamed from: i */
    private final String f13585i;

    /* JADX INFO: renamed from: j */
    private final List f13586j;

    /* JADX INFO: renamed from: k */
    private final List f13587k;

    /* JADX INFO: renamed from: com.android.billingclient.api.f$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private final int f13588a;

        /* JADX INFO: renamed from: b */
        private final int f13589b;

        a(JSONObject jSONObject) {
            this.f13588a = jSONObject.getInt("commitmentPaymentsCount");
            this.f13589b = jSONObject.optInt("subsequentCommitmentPaymentsCount");
        }
    }

    /* JADX INFO: renamed from: com.android.billingclient.api.f$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        private final String f13590a;

        /* JADX INFO: renamed from: b */
        private final long f13591b;

        /* JADX INFO: renamed from: c */
        private final String f13592c;

        /* JADX INFO: renamed from: d */
        private final String f13593d;

        /* JADX INFO: renamed from: e */
        private final String f13594e;

        /* JADX INFO: renamed from: f */
        private final String f13595f;

        /* JADX INFO: renamed from: g */
        private final List f13596g;

        /* JADX INFO: renamed from: h */
        private final Long f13597h;

        /* JADX INFO: renamed from: i */
        private final a f13598i;

        /* JADX INFO: renamed from: j */
        private final d f13599j;

        /* JADX INFO: renamed from: k */
        private final C7679b f13600k;

        /* JADX INFO: renamed from: l */
        private final String f13601l;

        /* JADX INFO: renamed from: m */
        private final c f13602m;

        /* JADX INFO: renamed from: n */
        private final C3166N f13603n;

        /* JADX INFO: renamed from: com.android.billingclient.api.f$b$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            private final Integer f13604a;

            /* JADX INFO: renamed from: b */
            private final C7678a f13605b;

            /* JADX INFO: renamed from: com.android.billingclient.api.f$b$a$a, reason: collision with other inner class name */
            public static final class C7678a {

                /* JADX INFO: renamed from: a */
                private final String f13606a;

                /* JADX INFO: renamed from: b */
                private final long f13607b;

                /* JADX INFO: renamed from: c */
                private final String f13608c;

                C7678a(JSONObject jSONObject) {
                    this.f13606a = jSONObject.optString("formattedDiscountAmount");
                    this.f13607b = jSONObject.optLong("discountAmountMicros");
                    this.f13608c = jSONObject.optString("discountAmountCurrencyCode");
                }
            }

            a(JSONObject jSONObject) {
                this.f13604a = jSONObject.has("percentageDiscount") ? Integer.valueOf(jSONObject.optInt("percentageDiscount")) : null;
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("discountAmount");
                this.f13605b = jSONObjectOptJSONObject != null ? new C7678a(jSONObjectOptJSONObject) : null;
            }
        }

        /* JADX INFO: renamed from: com.android.billingclient.api.f$b$b, reason: collision with other inner class name */
        public static final class C7679b {

            /* JADX INFO: renamed from: a */
            private final int f13609a;

            /* JADX INFO: renamed from: b */
            private final int f13610b;

            C7679b(JSONObject jSONObject) {
                this.f13609a = jSONObject.getInt("maximumQuantity");
                this.f13610b = jSONObject.getInt("remainingQuantity");
            }
        }

        /* JADX INFO: renamed from: com.android.billingclient.api.f$b$c */
        public static final class c {

            /* JADX INFO: renamed from: a */
            private final String f13611a;

            /* JADX INFO: renamed from: b */
            private final String f13612b;

            c(JSONObject jSONObject) {
                this.f13611a = jSONObject.getString("rentalPeriod");
                String strOptString = jSONObject.optString("rentalExpirationPeriod");
                this.f13612b = true == strOptString.isEmpty() ? null : strOptString;
            }
        }

        /* JADX INFO: renamed from: com.android.billingclient.api.f$b$d */
        public static final class d {

            /* JADX INFO: renamed from: a */
            private final Long f13613a;

            /* JADX INFO: renamed from: b */
            private final Long f13614b;

            d(JSONObject jSONObject) {
                this.f13613a = jSONObject.has("startTimeMillis") ? Long.valueOf(jSONObject.optLong("startTimeMillis")) : null;
                this.f13614b = jSONObject.has("endTimeMillis") ? Long.valueOf(jSONObject.optLong("endTimeMillis")) : null;
            }
        }

        b(JSONObject jSONObject) throws JSONException {
            this.f13590a = jSONObject.optString("formattedPrice");
            this.f13591b = jSONObject.optLong("priceAmountMicros");
            this.f13592c = jSONObject.optString("priceCurrencyCode");
            String strOptString = jSONObject.optString("offerIdToken");
            this.f13593d = true == strOptString.isEmpty() ? null : strOptString;
            String strOptString2 = jSONObject.optString("offerId");
            this.f13594e = true == strOptString2.isEmpty() ? null : strOptString2;
            String strOptString3 = jSONObject.optString("purchaseOptionId");
            this.f13595f = true == strOptString3.isEmpty() ? null : strOptString3;
            jSONObject.optInt("offerType");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
            this.f13596g = new ArrayList();
            if (jSONArrayOptJSONArray != null) {
                for (int i7 = 0; i7 < jSONArrayOptJSONArray.length(); i7++) {
                    this.f13596g.add(jSONArrayOptJSONArray.getString(i7));
                }
            }
            this.f13597h = jSONObject.has("fullPriceMicros") ? Long.valueOf(jSONObject.optLong("fullPriceMicros")) : null;
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("discountDisplayInfo");
            this.f13598i = jSONObjectOptJSONObject == null ? null : new a(jSONObjectOptJSONObject);
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("validTimeWindow");
            this.f13599j = jSONObjectOptJSONObject2 == null ? null : new d(jSONObjectOptJSONObject2);
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("limitedQuantityInfo");
            this.f13600k = jSONObjectOptJSONObject3 == null ? null : new C7679b(jSONObjectOptJSONObject3);
            this.f13601l = jSONObject.optString("serializedDocid");
            JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("preorderDetails");
            if (jSONObjectOptJSONObject4 != null) {
                jSONObjectOptJSONObject4.getLong("preorderReleaseTimeMillis");
                jSONObjectOptJSONObject4.getLong("preorderPresaleEndTimeMillis");
            }
            JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("rentalDetails");
            this.f13602m = jSONObjectOptJSONObject5 == null ? null : new c(jSONObjectOptJSONObject5);
            JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject("autoPayDetails");
            this.f13603n = jSONObjectOptJSONObject6 != null ? new C3166N(jSONObjectOptJSONObject6) : null;
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("pricingPhases");
            if (jSONArrayOptJSONArray2 == null) {
                return;
            }
            new d(jSONArrayOptJSONArray2);
        }

        /* JADX INFO: renamed from: a */
        public String m16949a() {
            return this.f13590a;
        }

        /* JADX INFO: renamed from: b */
        public String m16950b() {
            return this.f13593d;
        }

        /* JADX INFO: renamed from: c */
        public long m16951c() {
            return this.f13591b;
        }

        /* JADX INFO: renamed from: d */
        public final C3166N m16952d() {
            return this.f13603n;
        }

        /* JADX INFO: renamed from: e */
        final String m16953e() {
            return this.f13601l;
        }
    }

    /* JADX INFO: renamed from: com.android.billingclient.api.f$c */
    public static final class c {

        /* JADX INFO: renamed from: a */
        private final String f13615a;

        /* JADX INFO: renamed from: b */
        private final long f13616b;

        /* JADX INFO: renamed from: c */
        private final String f13617c;

        /* JADX INFO: renamed from: d */
        private final String f13618d;

        /* JADX INFO: renamed from: e */
        private final int f13619e;

        /* JADX INFO: renamed from: f */
        private final int f13620f;

        c(JSONObject jSONObject) {
            this.f13618d = jSONObject.optString("billingPeriod");
            this.f13617c = jSONObject.optString("priceCurrencyCode");
            this.f13615a = jSONObject.optString("formattedPrice");
            this.f13616b = jSONObject.optLong("priceAmountMicros");
            this.f13620f = jSONObject.optInt("recurrenceMode");
            this.f13619e = jSONObject.optInt("billingCycleCount");
        }

        /* JADX INFO: renamed from: a */
        public String m16954a() {
            return this.f13615a;
        }

        /* JADX INFO: renamed from: b */
        public long m16955b() {
            return this.f13616b;
        }
    }

    /* JADX INFO: renamed from: com.android.billingclient.api.f$d */
    public static class d {

        /* JADX INFO: renamed from: a */
        private final List f13621a;

        d(JSONArray jSONArray) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i7);
                    if (jSONObjectOptJSONObject != null) {
                        arrayList.add(new c(jSONObjectOptJSONObject));
                    }
                }
            }
            this.f13621a = arrayList;
        }

        /* JADX INFO: renamed from: a */
        public List m16956a() {
            return this.f13621a;
        }
    }

    /* JADX INFO: renamed from: com.android.billingclient.api.f$e */
    public static final class e {

        /* JADX INFO: renamed from: a */
        private final String f13622a;

        /* JADX INFO: renamed from: b */
        private final String f13623b;

        /* JADX INFO: renamed from: c */
        private final String f13624c;

        /* JADX INFO: renamed from: d */
        private final d f13625d;

        /* JADX INFO: renamed from: e */
        private final List f13626e;

        /* JADX INFO: renamed from: f */
        private final a f13627f;

        e(JSONObject jSONObject) throws JSONException {
            this.f13622a = jSONObject.optString("basePlanId");
            String strOptString = jSONObject.optString("offerId");
            this.f13623b = true == strOptString.isEmpty() ? null : strOptString;
            this.f13624c = jSONObject.getString("offerIdToken");
            this.f13625d = new d(jSONObject.getJSONArray("pricingPhases"));
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("installmentPlanDetails");
            this.f13627f = jSONObjectOptJSONObject != null ? new a(jSONObjectOptJSONObject) : null;
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("transitionPlanDetails");
            if (jSONObjectOptJSONObject2 != null) {
                jSONObjectOptJSONObject2.getString("productId");
                jSONObjectOptJSONObject2.optString("title");
                jSONObjectOptJSONObject2.optString("name");
                jSONObjectOptJSONObject2.optString("description");
                jSONObjectOptJSONObject2.optString("basePlanId");
                JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("pricingPhase");
                if (jSONObjectOptJSONObject3 != null) {
                    new c(jSONObjectOptJSONObject3);
                }
            }
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
            if (jSONArrayOptJSONArray != null) {
                for (int i7 = 0; i7 < jSONArrayOptJSONArray.length(); i7++) {
                    arrayList.add(jSONArrayOptJSONArray.getString(i7));
                }
            }
            this.f13626e = arrayList;
        }

        /* JADX INFO: renamed from: a */
        public String m16957a() {
            return this.f13624c;
        }

        /* JADX INFO: renamed from: b */
        public d m16958b() {
            return this.f13625d;
        }
    }

    C3180f(String str) {
        this.f13577a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f13578b = jSONObject;
        String strOptString = jSONObject.optString("productId");
        this.f13579c = strOptString;
        String strOptString2 = jSONObject.optString("type");
        this.f13580d = strOptString2;
        if (TextUtils.isEmpty(strOptString)) {
            throw new IllegalArgumentException("Product id cannot be empty.");
        }
        if (TextUtils.isEmpty(strOptString2)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        this.f13581e = jSONObject.optString("title");
        this.f13582f = jSONObject.optString("name");
        this.f13583g = jSONObject.optString("description");
        jSONObject.optString("packageDisplayName");
        jSONObject.optString("iconUrl");
        this.f13584h = jSONObject.optString("skuDetailsToken");
        this.f13585i = jSONObject.optString("serializedDocid");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i7 = 0; i7 < jSONArrayOptJSONArray.length(); i7++) {
                arrayList.add(new e(jSONArrayOptJSONArray.getJSONObject(i7)));
            }
            this.f13586j = arrayList;
        } else {
            this.f13586j = (strOptString2.equals("subs") || strOptString2.equals("play_pass_subs")) ? new ArrayList() : null;
        }
        JSONObject jSONObjectOptJSONObject = this.f13578b.optJSONObject("oneTimePurchaseOfferDetails");
        JSONArray jSONArrayOptJSONArray2 = this.f13578b.optJSONArray("oneTimePurchaseOfferDetailsList");
        ArrayList arrayList2 = new ArrayList();
        if (jSONArrayOptJSONArray2 != null) {
            for (int i8 = 0; i8 < jSONArrayOptJSONArray2.length(); i8++) {
                arrayList2.add(new b(jSONArrayOptJSONArray2.getJSONObject(i8)));
            }
            this.f13587k = arrayList2;
            return;
        }
        if (jSONObjectOptJSONObject == null) {
            this.f13587k = null;
        } else {
            arrayList2.add(new b(jSONObjectOptJSONObject));
            this.f13587k = arrayList2;
        }
    }

    /* JADX INFO: renamed from: a */
    public b m16940a() {
        List list = this.f13587k;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (b) list.get(0);
    }

    /* JADX INFO: renamed from: b */
    public List m16941b() {
        return this.f13587k;
    }

    /* JADX INFO: renamed from: c */
    public String m16942c() {
        return this.f13579c;
    }

    /* JADX INFO: renamed from: d */
    public String m16943d() {
        return this.f13580d;
    }

    /* JADX INFO: renamed from: e */
    public List m16944e() {
        return this.f13586j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3180f) {
            return TextUtils.equals(this.f13577a, ((C3180f) obj).f13577a);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final String m16945f() {
        return this.f13578b.optString("packageName");
    }

    /* JADX INFO: renamed from: g */
    final String m16946g() {
        return this.f13584h;
    }

    /* JADX INFO: renamed from: h */
    public String m16947h() {
        return this.f13585i;
    }

    public int hashCode() {
        return this.f13577a.hashCode();
    }

    /* JADX INFO: renamed from: i */
    final List m16948i() {
        return this.f13587k;
    }

    public String toString() {
        List list = this.f13586j;
        return "ProductDetails{jsonString='" + this.f13577a + "', parsedJson=" + this.f13578b.toString() + ", productId='" + this.f13579c + "', productType='" + this.f13580d + "', title='" + this.f13581e + "', productDetailsToken='" + this.f13584h + "', subscriptionOfferDetails=" + String.valueOf(list) + "}";
    }
}
