package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.api.C3553a;
import com.google.android.gms.common.internal.AbstractC3714q;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: com.google.android.gms.location.Y */
/* JADX INFO: loaded from: classes2.dex */
public final class C3959Y extends AbstractC1945a {
    public static final Parcelable.Creator<C3959Y> CREATOR = new C3960Z();

    /* JADX INFO: renamed from: a */
    boolean f15001a;

    /* JADX INFO: renamed from: b */
    long f15002b;

    /* JADX INFO: renamed from: c */
    float f15003c;

    /* JADX INFO: renamed from: d */
    long f15004d;

    /* JADX INFO: renamed from: e */
    int f15005e;

    public C3959Y() {
        this(true, 50L, 0.0f, Long.MAX_VALUE, C3553a.e.API_PRIORITY_OTHER);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3959Y)) {
            return false;
        }
        C3959Y c3959y = (C3959Y) obj;
        return this.f15001a == c3959y.f15001a && this.f15002b == c3959y.f15002b && Float.compare(this.f15003c, c3959y.f15003c) == 0 && this.f15004d == c3959y.f15004d && this.f15005e == c3959y.f15005e;
    }

    public final int hashCode() {
        return AbstractC3714q.m18054c(Boolean.valueOf(this.f15001a), Long.valueOf(this.f15002b), Float.valueOf(this.f15003c), Long.valueOf(this.f15004d), Integer.valueOf(this.f15005e));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DeviceOrientationRequest[mShouldUseMag=");
        sb.append(this.f15001a);
        sb.append(" mMinimumSamplingPeriodMs=");
        sb.append(this.f15002b);
        sb.append(" mSmallestAngleChangeRadians=");
        sb.append(this.f15003c);
        long j7 = this.f15004d;
        if (j7 != Long.MAX_VALUE) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            sb.append(" expireIn=");
            sb.append(j7 - jElapsedRealtime);
            sb.append("ms");
        }
        if (this.f15005e != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(this.f15005e);
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8059g(parcel, 1, this.f15001a);
        AbstractC1947c.m8076x(parcel, 2, this.f15002b);
        AbstractC1947c.m8068p(parcel, 3, this.f15003c);
        AbstractC1947c.m8076x(parcel, 4, this.f15004d);
        AbstractC1947c.m8072t(parcel, 5, this.f15005e);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }

    C3959Y(boolean z7, long j7, float f7, long j8, int i7) {
        this.f15001a = z7;
        this.f15002b = j7;
        this.f15003c = f7;
        this.f15004d = j8;
        this.f15005e = i7;
    }
}
