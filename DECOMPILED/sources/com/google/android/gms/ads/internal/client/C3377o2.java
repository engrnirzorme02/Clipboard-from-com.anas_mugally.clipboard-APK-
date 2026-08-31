package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONObject;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.o2 */
/* JADX INFO: loaded from: classes.dex */
public final class C3377o2 extends AbstractC1945a {
    public static final Parcelable.Creator<C3377o2> CREATOR = new C3381p2();

    /* JADX INFO: renamed from: a */
    public final int f14049a;

    /* JADX INFO: renamed from: b */
    public final int f14050b;

    /* JADX INFO: renamed from: c */
    public final String f14051c;

    /* JADX INFO: renamed from: d */
    public final long f14052d;

    public C3377o2(int i7, int i8, String str, long j7) {
        this.f14049a = i7;
        this.f14050b = i8;
        this.f14051c = str;
        this.f14052d = j7;
    }

    /* JADX INFO: renamed from: T */
    public static C3377o2 m17292T(JSONObject jSONObject) {
        return new C3377o2(jSONObject.getInt("type_num"), jSONObject.getInt("precision_num"), jSONObject.getString("currency"), jSONObject.getLong("value"));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.f14049a;
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8072t(parcel, 1, i8);
        AbstractC1947c.m8072t(parcel, 2, this.f14050b);
        AbstractC1947c.m8044E(parcel, 3, this.f14051c, false);
        AbstractC1947c.m8076x(parcel, 4, this.f14052d);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
