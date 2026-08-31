package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;
import p314o2.C6570v;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.U1 */
/* JADX INFO: loaded from: classes.dex */
public final class C3302U1 extends AbstractC1945a {
    public static final Parcelable.Creator<C3302U1> CREATOR = new C3305V1();

    /* JADX INFO: renamed from: a */
    public final int f13905a;

    /* JADX INFO: renamed from: b */
    public final int f13906b;

    public C3302U1(int i7, int i8) {
        this.f13905a = i7;
        this.f13906b = i8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.f13905a;
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8072t(parcel, 1, i8);
        AbstractC1947c.m8072t(parcel, 2, this.f13906b);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }

    public C3302U1(C6570v c6570v) {
        this.f13905a = c6570v.m27856c();
        this.f13906b = c6570v.m27857d();
    }
}
