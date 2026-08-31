package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.d */
/* JADX INFO: loaded from: classes.dex */
public class C3688d extends AbstractC1945a {
    public static final Parcelable.Creator<C3688d> CREATOR = new C3656A();

    /* JADX INFO: renamed from: a */
    public final int f14748a;

    /* JADX INFO: renamed from: b */
    public final String f14749b;

    public C3688d(int i7, String str) {
        this.f14748a = i7;
        this.f14749b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3688d)) {
            return false;
        }
        C3688d c3688d = (C3688d) obj;
        return c3688d.f14748a == this.f14748a && AbstractC3714q.m18053b(c3688d.f14749b, this.f14749b);
    }

    public final int hashCode() {
        return this.f14748a;
    }

    public final String toString() {
        return this.f14748a + ":" + this.f14749b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.f14748a;
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8072t(parcel, 1, i8);
        AbstractC1947c.m8044E(parcel, 2, this.f14749b, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
