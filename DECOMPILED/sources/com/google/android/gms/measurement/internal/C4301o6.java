package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.AbstractC3718s;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.o6 */
/* JADX INFO: loaded from: classes2.dex */
final class C4301o6 {

    /* JADX INFO: renamed from: a */
    private final C4317q6 f15937a;

    /* JADX INFO: renamed from: b */
    private int f15938b = 1;

    /* JADX INFO: renamed from: c */
    private long f15939c = m18838d();

    public C4301o6(C4317q6 c4317q6) {
        this.f15937a = c4317q6;
    }

    /* JADX INFO: renamed from: d */
    private final long m18838d() {
        C4317q6 c4317q6 = this.f15937a;
        AbstractC3718s.m18083l(c4317q6);
        long jLongValue = ((Long) AbstractC4209d2.f15702v.m18706b(null)).longValue();
        long jLongValue2 = ((Long) AbstractC4209d2.f15704w.m18706b(null)).longValue();
        for (int i7 = 1; i7 < this.f15938b; i7++) {
            jLongValue += jLongValue;
            if (jLongValue >= jLongValue2) {
                break;
            }
        }
        return c4317q6.mo18425f().mo18159a() + Math.min(jLongValue, jLongValue2);
    }

    /* JADX INFO: renamed from: a */
    public final void m18839a() {
        this.f15938b++;
        this.f15939c = m18838d();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m18840b() {
        return this.f15937a.mo18425f().mo18159a() >= this.f15939c;
    }

    /* JADX INFO: renamed from: c */
    final /* synthetic */ long m18841c() {
        return this.f15939c;
    }
}
