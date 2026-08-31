package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.p */
/* JADX INFO: loaded from: classes.dex */
public class C3712p extends AbstractC1945a {
    public static final Parcelable.Creator<C3712p> CREATOR = new C3668L();

    /* JADX INFO: renamed from: a */
    private final int f14814a;

    /* JADX INFO: renamed from: b */
    private final int f14815b;

    /* JADX INFO: renamed from: c */
    private final int f14816c;

    /* JADX INFO: renamed from: d */
    private final long f14817d;

    /* JADX INFO: renamed from: e */
    private final long f14818e;

    /* JADX INFO: renamed from: f */
    private final String f14819f;

    /* JADX INFO: renamed from: r */
    private final String f14820r;

    /* JADX INFO: renamed from: s */
    private final int f14821s;

    /* JADX INFO: renamed from: t */
    private final int f14822t;

    public C3712p(int i7, int i8, int i9, long j7, long j8, String str, String str2, int i10, int i11) {
        this.f14814a = i7;
        this.f14815b = i8;
        this.f14816c = i9;
        this.f14817d = j7;
        this.f14818e = j8;
        this.f14819f = str;
        this.f14820r = str2;
        this.f14821s = i10;
        this.f14822t = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.f14814a;
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8072t(parcel, 1, i8);
        AbstractC1947c.m8072t(parcel, 2, this.f14815b);
        AbstractC1947c.m8072t(parcel, 3, this.f14816c);
        AbstractC1947c.m8076x(parcel, 4, this.f14817d);
        AbstractC1947c.m8076x(parcel, 5, this.f14818e);
        AbstractC1947c.m8044E(parcel, 6, this.f14819f, false);
        AbstractC1947c.m8044E(parcel, 7, this.f14820r, false);
        AbstractC1947c.m8072t(parcel, 8, this.f14821s);
        AbstractC1947c.m8072t(parcel, 9, this.f14822t);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
