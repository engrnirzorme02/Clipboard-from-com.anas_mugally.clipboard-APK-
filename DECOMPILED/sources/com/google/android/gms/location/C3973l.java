package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.List;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: com.google.android.gms.location.l */
/* JADX INFO: loaded from: classes2.dex */
public final class C3973l extends AbstractC1945a {
    public static final Parcelable.Creator<C3973l> CREATOR = new C3946K();

    /* JADX INFO: renamed from: a */
    private final List f15036a;

    /* JADX INFO: renamed from: b */
    private final boolean f15037b;

    /* JADX INFO: renamed from: c */
    private final boolean f15038c;

    /* JADX INFO: renamed from: d */
    private C3944I f15039d;

    C3973l(List list, boolean z7, boolean z8, C3944I c3944i) {
        this.f15036a = list;
        this.f15037b = z7;
        this.f15038c = z8;
        this.f15039d = c3944i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8048I(parcel, 1, Collections.unmodifiableList(this.f15036a), false);
        AbstractC1947c.m8059g(parcel, 2, this.f15037b);
        AbstractC1947c.m8059g(parcel, 3, this.f15038c);
        AbstractC1947c.m8042C(parcel, 5, this.f15039d, i7, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
