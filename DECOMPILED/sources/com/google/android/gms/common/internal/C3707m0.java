package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p170W2.C1839d;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.m0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3707m0 extends AbstractC1945a {
    public static final Parcelable.Creator<C3707m0> CREATOR = new C3709n0();

    /* JADX INFO: renamed from: a */
    Bundle f14807a;

    /* JADX INFO: renamed from: b */
    C1839d[] f14808b;

    /* JADX INFO: renamed from: c */
    int f14809c;

    /* JADX INFO: renamed from: d */
    C3692f f14810d;

    C3707m0(Bundle bundle, C1839d[] c1839dArr, int i7, C3692f c3692f) {
        this.f14807a = bundle;
        this.f14808b = c1839dArr;
        this.f14809c = i7;
        this.f14810d = c3692f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8062j(parcel, 1, this.f14807a, false);
        AbstractC1947c.m8047H(parcel, 2, this.f14808b, i7, false);
        AbstractC1947c.m8072t(parcel, 3, this.f14809c);
        AbstractC1947c.m8042C(parcel, 4, this.f14810d, i7, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
