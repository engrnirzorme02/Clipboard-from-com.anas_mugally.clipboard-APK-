package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3714q;
import java.util.ArrayList;
import java.util.List;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;
import p404z2.AbstractC7600q;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.h2 */
/* JADX INFO: loaded from: classes.dex */
public final class C3349h2 extends AbstractC1945a {
    public static final Parcelable.Creator<C3349h2> CREATOR = new C3357j2();

    /* JADX INFO: renamed from: A */
    public final String f13936A;

    /* JADX INFO: renamed from: B */
    public final String f13937B;

    /* JADX INFO: renamed from: C */
    public final boolean f13938C;

    /* JADX INFO: renamed from: D */
    public final C3323b0 f13939D;

    /* JADX INFO: renamed from: E */
    public final int f13940E;

    /* JADX INFO: renamed from: F */
    public final String f13941F;

    /* JADX INFO: renamed from: G */
    public final List f13942G;

    /* JADX INFO: renamed from: H */
    public final int f13943H;

    /* JADX INFO: renamed from: I */
    public final String f13944I;

    /* JADX INFO: renamed from: J */
    public final int f13945J;

    /* JADX INFO: renamed from: K */
    public final long f13946K;

    /* JADX INFO: renamed from: L */
    public final long f13947L;

    /* JADX INFO: renamed from: M */
    public final Bundle f13948M = new Bundle();

    /* JADX INFO: renamed from: a */
    public final int f13949a;

    /* JADX INFO: renamed from: b */
    public final long f13950b;

    /* JADX INFO: renamed from: c */
    public final Bundle f13951c;

    /* JADX INFO: renamed from: d */
    public final int f13952d;

    /* JADX INFO: renamed from: e */
    public final List f13953e;

    /* JADX INFO: renamed from: f */
    public final boolean f13954f;

    /* JADX INFO: renamed from: r */
    public final int f13955r;

    /* JADX INFO: renamed from: s */
    public final boolean f13956s;

    /* JADX INFO: renamed from: t */
    public final String f13957t;

    /* JADX INFO: renamed from: u */
    public final C3308W1 f13958u;

    /* JADX INFO: renamed from: v */
    public final Location f13959v;

    /* JADX INFO: renamed from: w */
    public final String f13960w;

    /* JADX INFO: renamed from: x */
    public final Bundle f13961x;

    /* JADX INFO: renamed from: y */
    public final Bundle f13962y;

    /* JADX INFO: renamed from: z */
    public final List f13963z;

    public C3349h2(int i7, long j7, Bundle bundle, int i8, List list, boolean z7, int i9, boolean z8, String str, C3308W1 c3308w1, Location location, String str2, Bundle bundle2, Bundle bundle3, List list2, String str3, String str4, boolean z9, C3323b0 c3323b0, int i10, String str5, List list3, int i11, String str6, int i12, long j8, long j9) {
        this.f13949a = i7;
        this.f13950b = j7;
        this.f13951c = bundle == null ? new Bundle() : bundle;
        this.f13952d = i8;
        this.f13953e = list;
        this.f13954f = z7;
        this.f13955r = i9;
        this.f13956s = z8;
        this.f13957t = str;
        this.f13958u = c3308w1;
        this.f13959v = location;
        this.f13960w = str2;
        this.f13961x = bundle2 == null ? new Bundle() : bundle2;
        this.f13962y = bundle3;
        this.f13963z = list2;
        this.f13936A = str3;
        this.f13937B = str4;
        this.f13938C = z9;
        this.f13939D = c3323b0;
        this.f13940E = i10;
        this.f13941F = str5;
        this.f13942G = list3 == null ? new ArrayList() : list3;
        this.f13943H = i11;
        this.f13944I = str6;
        this.f13945J = i12;
        this.f13946K = j8;
        this.f13947L = j9;
    }

    /* JADX INFO: renamed from: T */
    public final boolean m17230T(Object obj) {
        if (!(obj instanceof C3349h2)) {
            return false;
        }
        C3349h2 c3349h2 = (C3349h2) obj;
        return this.f13949a == c3349h2.f13949a && this.f13950b == c3349h2.f13950b && AbstractC7600q.m33336a(this.f13951c, c3349h2.f13951c) && this.f13952d == c3349h2.f13952d && AbstractC3714q.m18053b(this.f13953e, c3349h2.f13953e) && this.f13954f == c3349h2.f13954f && this.f13955r == c3349h2.f13955r && this.f13956s == c3349h2.f13956s && AbstractC3714q.m18053b(this.f13957t, c3349h2.f13957t) && AbstractC3714q.m18053b(this.f13958u, c3349h2.f13958u) && AbstractC3714q.m18053b(this.f13959v, c3349h2.f13959v) && AbstractC3714q.m18053b(this.f13960w, c3349h2.f13960w) && AbstractC7600q.m33336a(this.f13961x, c3349h2.f13961x) && AbstractC7600q.m33336a(this.f13962y, c3349h2.f13962y) && AbstractC3714q.m18053b(this.f13963z, c3349h2.f13963z) && AbstractC3714q.m18053b(this.f13936A, c3349h2.f13936A) && AbstractC3714q.m18053b(this.f13937B, c3349h2.f13937B) && this.f13938C == c3349h2.f13938C && this.f13940E == c3349h2.f13940E && AbstractC3714q.m18053b(this.f13941F, c3349h2.f13941F) && AbstractC3714q.m18053b(this.f13942G, c3349h2.f13942G) && this.f13943H == c3349h2.f13943H && AbstractC3714q.m18053b(this.f13944I, c3349h2.f13944I) && this.f13945J == c3349h2.f13945J;
    }

    /* JADX INFO: renamed from: U */
    public final boolean m17231U() {
        return zzc() || zzd();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3349h2) {
            return m17230T(obj) && this.f13946K == ((C3349h2) obj).f13946K;
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC3714q.m18054c(Integer.valueOf(this.f13949a), Long.valueOf(this.f13950b), this.f13951c, Integer.valueOf(this.f13952d), this.f13953e, Boolean.valueOf(this.f13954f), Integer.valueOf(this.f13955r), Boolean.valueOf(this.f13956s), this.f13957t, this.f13958u, this.f13959v, this.f13960w, this.f13961x, this.f13962y, this.f13963z, this.f13936A, this.f13937B, Boolean.valueOf(this.f13938C), Integer.valueOf(this.f13940E), this.f13941F, this.f13942G, Integer.valueOf(this.f13943H), this.f13944I, Integer.valueOf(this.f13945J), Long.valueOf(this.f13946K), Long.valueOf(this.f13947L));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.f13949a;
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8072t(parcel, 1, i8);
        AbstractC1947c.m8076x(parcel, 2, this.f13950b);
        AbstractC1947c.m8062j(parcel, 3, this.f13951c, false);
        AbstractC1947c.m8072t(parcel, 4, this.f13952d);
        AbstractC1947c.m8046G(parcel, 5, this.f13953e, false);
        AbstractC1947c.m8059g(parcel, 6, this.f13954f);
        AbstractC1947c.m8072t(parcel, 7, this.f13955r);
        AbstractC1947c.m8059g(parcel, 8, this.f13956s);
        AbstractC1947c.m8044E(parcel, 9, this.f13957t, false);
        AbstractC1947c.m8042C(parcel, 10, this.f13958u, i7, false);
        AbstractC1947c.m8042C(parcel, 11, this.f13959v, i7, false);
        AbstractC1947c.m8044E(parcel, 12, this.f13960w, false);
        AbstractC1947c.m8062j(parcel, 13, this.f13961x, false);
        AbstractC1947c.m8062j(parcel, 14, this.f13962y, false);
        AbstractC1947c.m8046G(parcel, 15, this.f13963z, false);
        AbstractC1947c.m8044E(parcel, 16, this.f13936A, false);
        AbstractC1947c.m8044E(parcel, 17, this.f13937B, false);
        AbstractC1947c.m8059g(parcel, 18, this.f13938C);
        AbstractC1947c.m8042C(parcel, 19, this.f13939D, i7, false);
        AbstractC1947c.m8072t(parcel, 20, this.f13940E);
        AbstractC1947c.m8044E(parcel, 21, this.f13941F, false);
        AbstractC1947c.m8046G(parcel, 22, this.f13942G, false);
        AbstractC1947c.m8072t(parcel, 23, this.f13943H);
        AbstractC1947c.m8044E(parcel, 24, this.f13944I, false);
        AbstractC1947c.m8072t(parcel, 25, this.f13945J);
        AbstractC1947c.m8076x(parcel, 26, this.f13946K);
        AbstractC1947c.m8076x(parcel, 27, this.f13947L);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }

    public final boolean zzc() {
        return this.f13951c.getBoolean("is_sdk_preload", false);
    }

    public final boolean zzd() {
        return this.f13951c.getBoolean("zenith_v2", false);
    }
}
