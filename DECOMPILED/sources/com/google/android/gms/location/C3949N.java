package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3714q;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: com.google.android.gms.location.N */
/* JADX INFO: loaded from: classes2.dex */
public final class C3949N extends AbstractC1945a {
    public static final Parcelable.Creator<C3949N> CREATOR = new C3950O();

    /* JADX INFO: renamed from: a */
    public final int f14990a;

    /* JADX INFO: renamed from: b */
    public final int f14991b;

    /* JADX INFO: renamed from: c */
    public final long f14992c;

    /* JADX INFO: renamed from: d */
    public final long f14993d;

    C3949N(int i7, int i8, long j7, long j8) {
        this.f14990a = i7;
        this.f14991b = i8;
        this.f14992c = j7;
        this.f14993d = j8;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3949N) {
            C3949N c3949n = (C3949N) obj;
            if (this.f14990a == c3949n.f14990a && this.f14991b == c3949n.f14991b && this.f14992c == c3949n.f14992c && this.f14993d == c3949n.f14993d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC3714q.m18054c(Integer.valueOf(this.f14991b), Integer.valueOf(this.f14990a), Long.valueOf(this.f14993d), Long.valueOf(this.f14992c));
    }

    public final String toString() {
        return "NetworkLocationStatus: Wifi status: " + this.f14990a + " Cell status: " + this.f14991b + " elapsed time NS: " + this.f14993d + " system time ms: " + this.f14992c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8072t(parcel, 1, this.f14990a);
        AbstractC1947c.m8072t(parcel, 2, this.f14991b);
        AbstractC1947c.m8076x(parcel, 3, this.f14992c);
        AbstractC1947c.m8076x(parcel, 4, this.f14993d);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
