package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.q2 */
/* JADX INFO: loaded from: classes.dex */
public final class C3385q2 extends AbstractC1945a {
    public static final Parcelable.Creator<C3385q2> CREATOR = new C3389r2();

    /* JADX INFO: renamed from: a */
    public final String f14075a;

    /* JADX INFO: renamed from: b */
    public long f14076b;

    /* JADX INFO: renamed from: c */
    public C3324b1 f14077c;

    /* JADX INFO: renamed from: d */
    public final Bundle f14078d;

    /* JADX INFO: renamed from: e */
    public final String f14079e;

    /* JADX INFO: renamed from: f */
    public final String f14080f;

    /* JADX INFO: renamed from: r */
    public final String f14081r;

    /* JADX INFO: renamed from: s */
    public final String f14082s;

    public C3385q2(String str, long j7, C3324b1 c3324b1, Bundle bundle, String str2, String str3, String str4, String str5) {
        this.f14075a = str;
        this.f14076b = j7;
        this.f14077c = c3324b1;
        this.f14078d = bundle;
        this.f14079e = str2;
        this.f14080f = str3;
        this.f14081r = str4;
        this.f14082s = str5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.f14075a;
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8044E(parcel, 1, str, false);
        AbstractC1947c.m8076x(parcel, 2, this.f14076b);
        AbstractC1947c.m8042C(parcel, 3, this.f14077c, i7, false);
        AbstractC1947c.m8062j(parcel, 4, this.f14078d, false);
        AbstractC1947c.m8044E(parcel, 5, this.f14079e, false);
        AbstractC1947c.m8044E(parcel, 6, this.f14080f, false);
        AbstractC1947c.m8044E(parcel, 7, this.f14081r, false);
        AbstractC1947c.m8044E(parcel, 8, this.f14082s, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
