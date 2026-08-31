package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3718s;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C4246i extends AbstractC1945a {
    public static final Parcelable.Creator<C4246i> CREATOR = new C4254j();

    /* JADX INFO: renamed from: a */
    public String f15806a;

    /* JADX INFO: renamed from: b */
    public String f15807b;

    /* JADX INFO: renamed from: c */
    public C4357v6 f15808c;

    /* JADX INFO: renamed from: d */
    public long f15809d;

    /* JADX INFO: renamed from: e */
    public boolean f15810e;

    /* JADX INFO: renamed from: f */
    public String f15811f;

    /* JADX INFO: renamed from: r */
    public final C4039G f15812r;

    /* JADX INFO: renamed from: s */
    public long f15813s;

    /* JADX INFO: renamed from: t */
    public C4039G f15814t;

    /* JADX INFO: renamed from: u */
    public final long f15815u;

    /* JADX INFO: renamed from: v */
    public final C4039G f15816v;

    C4246i(C4246i c4246i) {
        AbstractC3718s.m18083l(c4246i);
        this.f15806a = c4246i.f15806a;
        this.f15807b = c4246i.f15807b;
        this.f15808c = c4246i.f15808c;
        this.f15809d = c4246i.f15809d;
        this.f15810e = c4246i.f15810e;
        this.f15811f = c4246i.f15811f;
        this.f15812r = c4246i.f15812r;
        this.f15813s = c4246i.f15813s;
        this.f15814t = c4246i.f15814t;
        this.f15815u = c4246i.f15815u;
        this.f15816v = c4246i.f15816v;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8044E(parcel, 2, this.f15806a, false);
        AbstractC1947c.m8044E(parcel, 3, this.f15807b, false);
        AbstractC1947c.m8042C(parcel, 4, this.f15808c, i7, false);
        AbstractC1947c.m8076x(parcel, 5, this.f15809d);
        AbstractC1947c.m8059g(parcel, 6, this.f15810e);
        AbstractC1947c.m8044E(parcel, 7, this.f15811f, false);
        AbstractC1947c.m8042C(parcel, 8, this.f15812r, i7, false);
        AbstractC1947c.m8076x(parcel, 9, this.f15813s);
        AbstractC1947c.m8042C(parcel, 10, this.f15814t, i7, false);
        AbstractC1947c.m8076x(parcel, 11, this.f15815u);
        AbstractC1947c.m8042C(parcel, 12, this.f15816v, i7, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }

    C4246i(String str, String str2, C4357v6 c4357v6, long j7, boolean z7, String str3, C4039G c4039g, long j8, C4039G c4039g2, long j9, C4039G c4039g3) {
        this.f15806a = str;
        this.f15807b = str2;
        this.f15808c = c4357v6;
        this.f15809d = j7;
        this.f15810e = z7;
        this.f15811f = str3;
        this.f15812r = c4039g;
        this.f15813s = j8;
        this.f15814t = c4039g2;
        this.f15815u = j9;
        this.f15816v = c4039g3;
    }
}
