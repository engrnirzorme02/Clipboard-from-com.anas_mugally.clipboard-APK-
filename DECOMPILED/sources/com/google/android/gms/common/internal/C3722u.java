package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.u */
/* JADX INFO: loaded from: classes.dex */
public class C3722u extends AbstractC1945a {
    public static final Parcelable.Creator<C3722u> CREATOR = new C3693f0();

    /* JADX INFO: renamed from: a */
    private final int f14843a;

    /* JADX INFO: renamed from: b */
    private final boolean f14844b;

    /* JADX INFO: renamed from: c */
    private final boolean f14845c;

    /* JADX INFO: renamed from: d */
    private final int f14846d;

    /* JADX INFO: renamed from: e */
    private final int f14847e;

    public C3722u(int i7, boolean z7, boolean z8, int i8, int i9) {
        this.f14843a = i7;
        this.f14844b = z7;
        this.f14845c = z8;
        this.f14846d = i8;
        this.f14847e = i9;
    }

    /* JADX INFO: renamed from: T */
    public int m18092T() {
        return this.f14846d;
    }

    /* JADX INFO: renamed from: U */
    public int m18093U() {
        return this.f14847e;
    }

    /* JADX INFO: renamed from: V */
    public boolean m18094V() {
        return this.f14844b;
    }

    /* JADX INFO: renamed from: W */
    public boolean m18095W() {
        return this.f14845c;
    }

    /* JADX INFO: renamed from: X */
    public int m18096X() {
        return this.f14843a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8072t(parcel, 1, m18096X());
        AbstractC1947c.m8059g(parcel, 2, m18094V());
        AbstractC1947c.m8059g(parcel, 3, m18095W());
        AbstractC1947c.m8072t(parcel, 4, m18092T());
        AbstractC1947c.m8072t(parcel, 5, m18093U());
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
