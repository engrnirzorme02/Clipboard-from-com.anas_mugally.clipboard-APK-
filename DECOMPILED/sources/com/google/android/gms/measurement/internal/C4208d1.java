package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import p283k3.EnumC6050u;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.d1 */
/* JADX INFO: loaded from: classes2.dex */
final class C4208d1 {

    /* JADX INFO: renamed from: a */
    private final EnumC6050u f15595a;

    C4208d1(EnumC6050u enumC6050u) {
        this.f15595a = enumC6050u;
    }

    /* JADX INFO: renamed from: c */
    static C4208d1 m18712c(String str) {
        return new C4208d1((TextUtils.isEmpty(str) || str.length() > 1) ? EnumC6050u.UNINITIALIZED : C4027E3.m18506j(str.charAt(0)));
    }

    /* JADX INFO: renamed from: a */
    final EnumC6050u m18713a() {
        return this.f15595a;
    }

    /* JADX INFO: renamed from: b */
    final String m18714b() {
        return String.valueOf(C4027E3.m18507m(this.f15595a));
    }
}
