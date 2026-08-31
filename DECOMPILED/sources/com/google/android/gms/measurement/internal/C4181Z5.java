package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.Z5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4181Z5 extends AbstractC1945a {
    public static final Parcelable.Creator<C4181Z5> CREATOR = new C4189a6();

    /* JADX INFO: renamed from: a */
    public final List f15539a;

    C4181Z5(List list) {
        this.f15539a = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        List list = this.f15539a;
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8048I(parcel, 1, list, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
