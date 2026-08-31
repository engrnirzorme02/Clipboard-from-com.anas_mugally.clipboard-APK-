package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC3718s;
import java.util.List;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.B6 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4006B6 extends AbstractC1945a {
    public static final Parcelable.Creator<C4006B6> CREATOR = new C4014C6();

    /* JADX INFO: renamed from: A */
    public final Boolean f15096A;

    /* JADX INFO: renamed from: B */
    public final long f15097B;

    /* JADX INFO: renamed from: C */
    public final List f15098C;

    /* JADX INFO: renamed from: D */
    public final String f15099D;

    /* JADX INFO: renamed from: E */
    public final String f15100E;

    /* JADX INFO: renamed from: F */
    public final String f15101F;

    /* JADX INFO: renamed from: G */
    public final boolean f15102G;

    /* JADX INFO: renamed from: H */
    public final long f15103H;

    /* JADX INFO: renamed from: I */
    public final int f15104I;

    /* JADX INFO: renamed from: J */
    public final String f15105J;

    /* JADX INFO: renamed from: K */
    public final int f15106K;

    /* JADX INFO: renamed from: L */
    public final long f15107L;

    /* JADX INFO: renamed from: M */
    public final String f15108M;

    /* JADX INFO: renamed from: N */
    public final String f15109N;

    /* JADX INFO: renamed from: O */
    public final long f15110O;

    /* JADX INFO: renamed from: P */
    public final int f15111P;

    /* JADX INFO: renamed from: a */
    public final String f15112a;

    /* JADX INFO: renamed from: b */
    public final String f15113b;

    /* JADX INFO: renamed from: c */
    public final String f15114c;

    /* JADX INFO: renamed from: d */
    public final String f15115d;

    /* JADX INFO: renamed from: e */
    public final long f15116e;

    /* JADX INFO: renamed from: f */
    public final long f15117f;

    /* JADX INFO: renamed from: r */
    public final String f15118r;

    /* JADX INFO: renamed from: s */
    public final boolean f15119s;

    /* JADX INFO: renamed from: t */
    public final boolean f15120t;

    /* JADX INFO: renamed from: u */
    public final long f15121u;

    /* JADX INFO: renamed from: v */
    public final String f15122v;

    /* JADX INFO: renamed from: w */
    public final long f15123w;

    /* JADX INFO: renamed from: x */
    public final int f15124x;

    /* JADX INFO: renamed from: y */
    public final boolean f15125y;

    /* JADX INFO: renamed from: z */
    public final boolean f15126z;

    C4006B6(String str, String str2, String str3, long j7, String str4, long j8, long j9, String str5, boolean z7, boolean z8, String str6, long j10, int i7, boolean z9, boolean z10, Boolean bool, long j11, List list, String str7, String str8, String str9, boolean z11, long j12, int i8, String str10, int i9, long j13, String str11, String str12, long j14, int i10) {
        AbstractC3718s.m18077f(str);
        this.f15112a = str;
        this.f15113b = true == TextUtils.isEmpty(str2) ? null : str2;
        this.f15114c = str3;
        this.f15121u = j7;
        this.f15115d = str4;
        this.f15116e = j8;
        this.f15117f = j9;
        this.f15118r = str5;
        this.f15119s = z7;
        this.f15120t = z8;
        this.f15122v = str6;
        this.f15123w = j10;
        this.f15124x = i7;
        this.f15125y = z9;
        this.f15126z = z10;
        this.f15096A = bool;
        this.f15097B = j11;
        this.f15098C = list;
        this.f15099D = str7;
        this.f15100E = str8;
        this.f15101F = str9;
        this.f15102G = z11;
        this.f15103H = j12;
        this.f15104I = i8;
        this.f15105J = str10;
        this.f15106K = i9;
        this.f15107L = j13;
        this.f15108M = str11;
        this.f15109N = str12;
        this.f15110O = j14;
        this.f15111P = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.f15112a;
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8044E(parcel, 2, str, false);
        AbstractC1947c.m8044E(parcel, 3, this.f15113b, false);
        AbstractC1947c.m8044E(parcel, 4, this.f15114c, false);
        AbstractC1947c.m8044E(parcel, 5, this.f15115d, false);
        AbstractC1947c.m8076x(parcel, 6, this.f15116e);
        AbstractC1947c.m8076x(parcel, 7, this.f15117f);
        AbstractC1947c.m8044E(parcel, 8, this.f15118r, false);
        AbstractC1947c.m8059g(parcel, 9, this.f15119s);
        AbstractC1947c.m8059g(parcel, 10, this.f15120t);
        AbstractC1947c.m8076x(parcel, 11, this.f15121u);
        AbstractC1947c.m8044E(parcel, 12, this.f15122v, false);
        AbstractC1947c.m8076x(parcel, 14, this.f15123w);
        AbstractC1947c.m8072t(parcel, 15, this.f15124x);
        AbstractC1947c.m8059g(parcel, 16, this.f15125y);
        AbstractC1947c.m8059g(parcel, 18, this.f15126z);
        AbstractC1947c.m8061i(parcel, 21, this.f15096A, false);
        AbstractC1947c.m8076x(parcel, 22, this.f15097B);
        AbstractC1947c.m8046G(parcel, 23, this.f15098C, false);
        AbstractC1947c.m8044E(parcel, 25, this.f15099D, false);
        AbstractC1947c.m8044E(parcel, 26, this.f15100E, false);
        AbstractC1947c.m8044E(parcel, 27, this.f15101F, false);
        AbstractC1947c.m8059g(parcel, 28, this.f15102G);
        AbstractC1947c.m8076x(parcel, 29, this.f15103H);
        AbstractC1947c.m8072t(parcel, 30, this.f15104I);
        AbstractC1947c.m8044E(parcel, 31, this.f15105J, false);
        AbstractC1947c.m8072t(parcel, 32, this.f15106K);
        AbstractC1947c.m8076x(parcel, 34, this.f15107L);
        AbstractC1947c.m8044E(parcel, 35, this.f15108M, false);
        AbstractC1947c.m8044E(parcel, 36, this.f15109N, false);
        AbstractC1947c.m8076x(parcel, 37, this.f15110O);
        AbstractC1947c.m8072t(parcel, 38, this.f15111P);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }

    C4006B6(String str, String str2, String str3, String str4, long j7, long j8, String str5, boolean z7, boolean z8, long j9, String str6, long j10, int i7, boolean z9, boolean z10, Boolean bool, long j11, List list, String str7, String str8, String str9, boolean z11, long j12, int i8, String str10, int i9, long j13, String str11, String str12, long j14, int i10) {
        this.f15112a = str;
        this.f15113b = str2;
        this.f15114c = str3;
        this.f15121u = j9;
        this.f15115d = str4;
        this.f15116e = j7;
        this.f15117f = j8;
        this.f15118r = str5;
        this.f15119s = z7;
        this.f15120t = z8;
        this.f15122v = str6;
        this.f15123w = j10;
        this.f15124x = i7;
        this.f15125y = z9;
        this.f15126z = z10;
        this.f15096A = bool;
        this.f15097B = j11;
        this.f15098C = list;
        this.f15099D = str7;
        this.f15100E = str8;
        this.f15101F = str9;
        this.f15102G = z11;
        this.f15103H = j12;
        this.f15104I = i8;
        this.f15105J = str10;
        this.f15106K = i9;
        this.f15107L = j13;
        this.f15108M = str11;
        this.f15109N = str12;
        this.f15110O = j14;
        this.f15111P = i10;
    }
}
