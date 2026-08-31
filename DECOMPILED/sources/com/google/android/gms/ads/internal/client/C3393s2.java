package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.s2 */
/* JADX INFO: loaded from: classes.dex */
public final class C3393s2 extends AbstractC1945a {
    public static final Parcelable.Creator<C3393s2> CREATOR = new C3397t2();

    /* JADX INFO: renamed from: a */
    public final int f14089a;

    public C3393s2(int i7) {
        this.f14089a = i7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.f14089a;
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8072t(parcel, 2, i8);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
