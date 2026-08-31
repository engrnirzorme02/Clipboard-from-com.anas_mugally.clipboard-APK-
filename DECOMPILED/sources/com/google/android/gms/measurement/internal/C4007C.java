package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.AbstractC3718s;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.C */
/* JADX INFO: loaded from: classes2.dex */
final class C4007C {

    /* JADX INFO: renamed from: a */
    final String f15127a;

    /* JADX INFO: renamed from: b */
    final String f15128b;

    /* JADX INFO: renamed from: c */
    final long f15129c;

    /* JADX INFO: renamed from: d */
    final long f15130d;

    /* JADX INFO: renamed from: e */
    final long f15131e;

    /* JADX INFO: renamed from: f */
    final long f15132f;

    /* JADX INFO: renamed from: g */
    final long f15133g;

    /* JADX INFO: renamed from: h */
    final Long f15134h;

    /* JADX INFO: renamed from: i */
    final Long f15135i;

    /* JADX INFO: renamed from: j */
    final Long f15136j;

    /* JADX INFO: renamed from: k */
    final Boolean f15137k;

    C4007C(String str, String str2, long j7, long j8, long j9, long j10, long j11, Long l7, Long l8, Long l9, Boolean bool) {
        AbstractC3718s.m18077f(str);
        AbstractC3718s.m18077f(str2);
        AbstractC3718s.m18072a(j7 >= 0);
        AbstractC3718s.m18072a(j8 >= 0);
        AbstractC3718s.m18072a(j9 >= 0);
        AbstractC3718s.m18072a(j11 >= 0);
        this.f15127a = str;
        this.f15128b = str2;
        this.f15129c = j7;
        this.f15130d = j8;
        this.f15131e = j9;
        this.f15132f = j10;
        this.f15133g = j11;
        this.f15134h = l7;
        this.f15135i = l8;
        this.f15136j = l9;
        this.f15137k = bool;
    }

    /* JADX INFO: renamed from: a */
    final C4007C m18440a(long j7) {
        return new C4007C(this.f15127a, this.f15128b, this.f15129c, this.f15130d, this.f15131e, j7, this.f15133g, this.f15134h, this.f15135i, this.f15136j, this.f15137k);
    }

    /* JADX INFO: renamed from: b */
    final C4007C m18441b(long j7, long j8) {
        return new C4007C(this.f15127a, this.f15128b, this.f15129c, this.f15130d, this.f15131e, this.f15132f, j7, Long.valueOf(j8), this.f15135i, this.f15136j, this.f15137k);
    }

    /* JADX INFO: renamed from: c */
    final C4007C m18442c(Long l7, Long l8, Boolean bool) {
        return new C4007C(this.f15127a, this.f15128b, this.f15129c, this.f15130d, this.f15131e, this.f15132f, this.f15133g, this.f15134h, l7, l8, bool);
    }
}
