package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.C1 */
/* JADX INFO: loaded from: classes.dex */
public final class C3249C1 extends AbstractC1945a {
    public static final Parcelable.Creator<C3249C1> CREATOR = new C3252D1();

    /* JADX INFO: renamed from: a */
    private final int f13878a;

    /* JADX INFO: renamed from: b */
    private final int f13879b;

    /* JADX INFO: renamed from: c */
    private final String f13880c;

    public C3249C1(int i7, int i8, String str) {
        this.f13878a = i7;
        this.f13879b = i8;
        this.f13880c = str;
    }

    /* JADX INFO: renamed from: T */
    public final int m17196T() {
        return this.f13879b;
    }

    /* JADX INFO: renamed from: U */
    public final String m17197U() {
        return this.f13880c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8072t(parcel, 1, this.f13878a);
        AbstractC1947c.m8072t(parcel, 2, this.f13879b);
        AbstractC1947c.m8044E(parcel, 3, this.f13880c, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
