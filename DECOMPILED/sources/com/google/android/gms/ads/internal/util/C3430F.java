package com.google.android.gms.ads.internal.util;

import com.google.android.gms.common.internal.AbstractC3714q;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.util.F */
/* JADX INFO: loaded from: classes.dex */
public final class C3430F {

    /* JADX INFO: renamed from: a */
    public final String f14175a;

    /* JADX INFO: renamed from: b */
    public final double f14176b;

    /* JADX INFO: renamed from: c */
    public final double f14177c;

    /* JADX INFO: renamed from: d */
    public final double f14178d;

    /* JADX INFO: renamed from: e */
    public final int f14179e;

    public C3430F(String str, double d7, double d8, double d9, int i7) {
        this.f14175a = str;
        this.f14177c = d7;
        this.f14176b = d8;
        this.f14178d = d9;
        this.f14179e = i7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3430F)) {
            return false;
        }
        C3430F c3430f = (C3430F) obj;
        return AbstractC3714q.m18053b(this.f14175a, c3430f.f14175a) && this.f14176b == c3430f.f14176b && this.f14177c == c3430f.f14177c && this.f14179e == c3430f.f14179e && Double.compare(this.f14178d, c3430f.f14178d) == 0;
    }

    public final int hashCode() {
        return AbstractC3714q.m18054c(this.f14175a, Double.valueOf(this.f14176b), Double.valueOf(this.f14177c), Double.valueOf(this.f14178d), Integer.valueOf(this.f14179e));
    }

    public final String toString() {
        return AbstractC3714q.m18055d(this).m18056a("name", this.f14175a).m18056a("minBound", Double.valueOf(this.f14177c)).m18056a("maxBound", Double.valueOf(this.f14176b)).m18056a("percent", Double.valueOf(this.f14178d)).m18056a("count", Integer.valueOf(this.f14179e)).toString();
    }
}
