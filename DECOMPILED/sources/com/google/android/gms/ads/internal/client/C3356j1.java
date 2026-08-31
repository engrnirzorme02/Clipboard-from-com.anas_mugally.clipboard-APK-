package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.j1 */
/* JADX INFO: loaded from: classes.dex */
public final class C3356j1 extends AbstractC1945a {
    public static final Parcelable.Creator<C3356j1> CREATOR = new C3360k1();

    /* JADX INFO: renamed from: a */
    public final int f13980a;

    public C3356j1(int i7) {
        this.f13980a = i7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.f13980a;
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8072t(parcel, 2, i8);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
