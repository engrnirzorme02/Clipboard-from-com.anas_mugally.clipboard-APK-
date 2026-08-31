package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p170W2.C1837b;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.T */
/* JADX INFO: loaded from: classes.dex */
public final class C3675T extends AbstractC1945a {
    public static final Parcelable.Creator<C3675T> CREATOR = new C3676U();

    /* JADX INFO: renamed from: a */
    final int f14734a;

    /* JADX INFO: renamed from: b */
    final IBinder f14735b;

    /* JADX INFO: renamed from: c */
    private final C1837b f14736c;

    /* JADX INFO: renamed from: d */
    private final boolean f14737d;

    /* JADX INFO: renamed from: e */
    private final boolean f14738e;

    C3675T(int i7, IBinder iBinder, C1837b c1837b, boolean z7, boolean z8) {
        this.f14734a = i7;
        this.f14735b = iBinder;
        this.f14736c = c1837b;
        this.f14737d = z7;
        this.f14738e = z8;
    }

    /* JADX INFO: renamed from: T */
    public final C1837b m17988T() {
        return this.f14736c;
    }

    /* JADX INFO: renamed from: U */
    public final InterfaceC3702k m17989U() {
        IBinder iBinder = this.f14735b;
        if (iBinder == null) {
            return null;
        }
        return InterfaceC3702k.a.m18048L0(iBinder);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3675T)) {
            return false;
        }
        C3675T c3675t = (C3675T) obj;
        return this.f14736c.equals(c3675t.f14736c) && AbstractC3714q.m18053b(m17989U(), c3675t.m17989U());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8072t(parcel, 1, this.f14734a);
        AbstractC1947c.m8071s(parcel, 2, this.f14735b, false);
        AbstractC1947c.m8042C(parcel, 3, this.f14736c, i7, false);
        AbstractC1947c.m8059g(parcel, 4, this.f14737d);
        AbstractC1947c.m8059g(parcel, 5, this.f14738e);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
