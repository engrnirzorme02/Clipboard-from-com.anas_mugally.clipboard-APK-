package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: com.google.android.gms.location.n */
/* JADX INFO: loaded from: classes2.dex */
public final class C3975n extends AbstractC1945a {
    public static final Parcelable.Creator<C3975n> CREATOR = new C3948M();

    /* JADX INFO: renamed from: a */
    private final boolean f15042a;

    /* JADX INFO: renamed from: b */
    private final boolean f15043b;

    /* JADX INFO: renamed from: c */
    private final boolean f15044c;

    /* JADX INFO: renamed from: d */
    private final boolean f15045d;

    /* JADX INFO: renamed from: e */
    private final boolean f15046e;

    /* JADX INFO: renamed from: f */
    private final boolean f15047f;

    public C3975n(boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12) {
        this.f15042a = z7;
        this.f15043b = z8;
        this.f15044c = z9;
        this.f15045d = z10;
        this.f15046e = z11;
        this.f15047f = z12;
    }

    /* JADX INFO: renamed from: T */
    public boolean m18398T() {
        return this.f15047f;
    }

    /* JADX INFO: renamed from: U */
    public boolean m18399U() {
        return this.f15044c;
    }

    /* JADX INFO: renamed from: V */
    public boolean m18400V() {
        return this.f15045d;
    }

    /* JADX INFO: renamed from: W */
    public boolean m18401W() {
        return this.f15042a;
    }

    /* JADX INFO: renamed from: X */
    public boolean m18402X() {
        return this.f15046e;
    }

    /* JADX INFO: renamed from: Y */
    public boolean m18403Y() {
        return this.f15043b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8059g(parcel, 1, m18401W());
        AbstractC1947c.m8059g(parcel, 2, m18403Y());
        AbstractC1947c.m8059g(parcel, 3, m18399U());
        AbstractC1947c.m8059g(parcel, 4, m18400V());
        AbstractC1947c.m8059g(parcel, 5, m18402X());
        AbstractC1947c.m8059g(parcel, 6, m18398T());
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
