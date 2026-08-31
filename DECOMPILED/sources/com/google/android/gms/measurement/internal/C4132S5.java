package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.S5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4132S5 extends AbstractC1945a {
    public static final Parcelable.Creator<C4132S5> CREATOR = new C4139T5();

    /* JADX INFO: renamed from: a */
    public final String f15417a;

    /* JADX INFO: renamed from: b */
    public final long f15418b;

    /* JADX INFO: renamed from: c */
    public final int f15419c;

    C4132S5(String str, long j7, int i7) {
        this.f15417a = str;
        this.f15418b = j7;
        this.f15419c = i7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.f15417a;
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8044E(parcel, 1, str, false);
        AbstractC1947c.m8076x(parcel, 2, this.f15418b);
        AbstractC1947c.m8072t(parcel, 3, this.f15419c);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
