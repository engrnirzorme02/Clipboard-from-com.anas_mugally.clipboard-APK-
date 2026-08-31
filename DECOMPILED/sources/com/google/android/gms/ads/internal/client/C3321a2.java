package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;
import p314o2.C6574z;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.a2 */
/* JADX INFO: loaded from: classes.dex */
public final class C3321a2 extends AbstractC1945a {
    public static final Parcelable.Creator<C3321a2> CREATOR = new C3325b2();

    /* JADX INFO: renamed from: a */
    public final boolean f13910a;

    /* JADX INFO: renamed from: b */
    public final boolean f13911b;

    /* JADX INFO: renamed from: c */
    public final boolean f13912c;

    public C3321a2(C6574z c6574z) {
        this(c6574z.m27873c(), c6574z.m27872b(), c6574z.m27871a());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        boolean z7 = this.f13910a;
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8059g(parcel, 2, z7);
        AbstractC1947c.m8059g(parcel, 3, this.f13911b);
        AbstractC1947c.m8059g(parcel, 4, this.f13912c);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }

    public C3321a2(boolean z7, boolean z8, boolean z9) {
        this.f13910a = z7;
        this.f13911b = z8;
        this.f13912c = z9;
    }
}
