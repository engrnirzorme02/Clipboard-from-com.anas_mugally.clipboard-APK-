package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.X5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4167X5 extends AbstractC1945a {
    public static final Parcelable.Creator<C4167X5> CREATOR = new C4174Y5();

    /* JADX INFO: renamed from: a */
    public final long f15504a;

    /* JADX INFO: renamed from: b */
    public byte[] f15505b;

    /* JADX INFO: renamed from: c */
    public final String f15506c;

    /* JADX INFO: renamed from: d */
    public final Bundle f15507d;

    /* JADX INFO: renamed from: e */
    public final int f15508e;

    /* JADX INFO: renamed from: f */
    public final long f15509f;

    /* JADX INFO: renamed from: r */
    public String f15510r;

    C4167X5(long j7, byte[] bArr, String str, Bundle bundle, int i7, long j8, String str2) {
        this.f15504a = j7;
        this.f15505b = bArr;
        this.f15506c = str;
        this.f15507d = bundle;
        this.f15508e = i7;
        this.f15509f = j8;
        this.f15510r = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        long j7 = this.f15504a;
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8076x(parcel, 1, j7);
        AbstractC1947c.m8063k(parcel, 2, this.f15505b, false);
        AbstractC1947c.m8044E(parcel, 3, this.f15506c, false);
        AbstractC1947c.m8062j(parcel, 4, this.f15507d, false);
        AbstractC1947c.m8072t(parcel, 5, this.f15508e);
        AbstractC1947c.m8076x(parcel, 6, this.f15509f);
        AbstractC1947c.m8044E(parcel, 7, this.f15510r, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
