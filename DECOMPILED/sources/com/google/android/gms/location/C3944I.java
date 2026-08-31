package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: com.google.android.gms.location.I */
/* JADX INFO: loaded from: classes2.dex */
public final class C3944I extends AbstractC1945a {
    public static final Parcelable.Creator<C3944I> CREATOR = new C3945J();

    /* JADX INFO: renamed from: a */
    private final String f14971a;

    /* JADX INFO: renamed from: b */
    private final String f14972b;

    /* JADX INFO: renamed from: c */
    private final String f14973c;

    C3944I(String str, String str2, String str3) {
        this.f14973c = str;
        this.f14971a = str2;
        this.f14972b = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8044E(parcel, 1, this.f14971a, false);
        AbstractC1947c.m8044E(parcel, 2, this.f14972b, false);
        AbstractC1947c.m8044E(parcel, 5, this.f14973c, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
