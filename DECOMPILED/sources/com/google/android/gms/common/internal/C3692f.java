package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.f */
/* JADX INFO: loaded from: classes.dex */
public class C3692f extends AbstractC1945a {
    public static final Parcelable.Creator<C3692f> CREATOR = new C3711o0();

    /* JADX INFO: renamed from: a */
    private final C3722u f14766a;

    /* JADX INFO: renamed from: b */
    private final boolean f14767b;

    /* JADX INFO: renamed from: c */
    private final boolean f14768c;

    /* JADX INFO: renamed from: d */
    private final int[] f14769d;

    /* JADX INFO: renamed from: e */
    private final int f14770e;

    /* JADX INFO: renamed from: f */
    private final int[] f14771f;

    public C3692f(C3722u c3722u, boolean z7, boolean z8, int[] iArr, int i7, int[] iArr2) {
        this.f14766a = c3722u;
        this.f14767b = z7;
        this.f14768c = z8;
        this.f14769d = iArr;
        this.f14770e = i7;
        this.f14771f = iArr2;
    }

    /* JADX INFO: renamed from: T */
    public int m18021T() {
        return this.f14770e;
    }

    /* JADX INFO: renamed from: U */
    public int[] m18022U() {
        return this.f14769d;
    }

    /* JADX INFO: renamed from: V */
    public int[] m18023V() {
        return this.f14771f;
    }

    /* JADX INFO: renamed from: W */
    public boolean m18024W() {
        return this.f14767b;
    }

    /* JADX INFO: renamed from: X */
    public boolean m18025X() {
        return this.f14768c;
    }

    /* JADX INFO: renamed from: Y */
    public final C3722u m18026Y() {
        return this.f14766a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8042C(parcel, 1, this.f14766a, i7, false);
        AbstractC1947c.m8059g(parcel, 2, m18024W());
        AbstractC1947c.m8059g(parcel, 3, m18025X());
        AbstractC1947c.m8073u(parcel, 4, m18022U(), false);
        AbstractC1947c.m8072t(parcel, 5, m18021T());
        AbstractC1947c.m8073u(parcel, 6, m18023V(), false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
