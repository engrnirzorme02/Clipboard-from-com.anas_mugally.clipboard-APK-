package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C4230g extends AbstractC1945a {
    public static final Parcelable.Creator<C4230g> CREATOR = new C4238h();

    /* JADX INFO: renamed from: a */
    public final long f15756a;

    /* JADX INFO: renamed from: b */
    public final int f15757b;

    /* JADX INFO: renamed from: c */
    public final long f15758c;

    C4230g(long j7, int i7, long j8) {
        this.f15756a = j7;
        this.f15757b = i7;
        this.f15758c = j8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        long j7 = this.f15756a;
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8076x(parcel, 1, j7);
        AbstractC1947c.m8072t(parcel, 2, this.f15757b);
        AbstractC1947c.m8076x(parcel, 3, this.f15758c);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
