package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3718s;
import p177X2.AbstractC1945a;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.G */
/* JADX INFO: loaded from: classes2.dex */
public final class C4039G extends AbstractC1945a {
    public static final Parcelable.Creator<C4039G> CREATOR = new C4047H();

    /* JADX INFO: renamed from: a */
    public final String f15219a;

    /* JADX INFO: renamed from: b */
    public final C4023E f15220b;

    /* JADX INFO: renamed from: c */
    public final String f15221c;

    /* JADX INFO: renamed from: d */
    public final long f15222d;

    C4039G(C4039G c4039g, long j7) {
        AbstractC3718s.m18083l(c4039g);
        this.f15219a = c4039g.f15219a;
        this.f15220b = c4039g.f15220b;
        this.f15221c = c4039g.f15221c;
        this.f15222d = j7;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f15220b);
        String str = this.f15221c;
        int length = String.valueOf(str).length();
        String str2 = this.f15219a;
        StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + strValueOf.length());
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        sb.append(",params=");
        sb.append(strValueOf);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        C4047H.m18522a(this, parcel, i7);
    }

    public C4039G(String str, C4023E c4023e, String str2, long j7) {
        this.f15219a = str;
        this.f15220b = c4023e;
        this.f15221c = str2;
        this.f15222d = j7;
    }
}
