package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.r2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4321r2 {

    /* JADX INFO: renamed from: a */
    public final String f16025a;

    /* JADX INFO: renamed from: b */
    public final String f16026b;

    /* JADX INFO: renamed from: c */
    public final long f16027c;

    /* JADX INFO: renamed from: d */
    public final Bundle f16028d;

    public C4321r2(String str, String str2, Bundle bundle, long j7) {
        this.f16025a = str;
        this.f16026b = str2;
        this.f16028d = bundle;
        this.f16027c = j7;
    }

    /* JADX INFO: renamed from: a */
    public static C4321r2 m18959a(C4039G c4039g) {
        return new C4321r2(c4039g.f15219a, c4039g.f15221c, c4039g.f15220b.m18484Y(), c4039g.f15222d);
    }

    /* JADX INFO: renamed from: b */
    public final C4039G m18960b() {
        return new C4039G(this.f16025a, new C4023E(new Bundle(this.f16028d)), this.f16026b, this.f16027c);
    }

    public final String toString() {
        String str = this.f16026b;
        String string = this.f16028d.toString();
        int length = String.valueOf(str).length();
        String str2 = this.f16025a;
        StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + string.length());
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        sb.append(",params=");
        sb.append(string);
        return sb.toString();
    }
}
