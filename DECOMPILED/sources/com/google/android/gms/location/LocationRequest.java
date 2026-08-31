package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.AbstractC3714q;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: loaded from: classes2.dex */
public final class LocationRequest extends AbstractC1945a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new C3940E();

    /* JADX INFO: renamed from: a */
    int f14979a;

    /* JADX INFO: renamed from: b */
    long f14980b;

    /* JADX INFO: renamed from: c */
    long f14981c;

    /* JADX INFO: renamed from: d */
    boolean f14982d;

    /* JADX INFO: renamed from: e */
    long f14983e;

    /* JADX INFO: renamed from: f */
    int f14984f;

    /* JADX INFO: renamed from: r */
    float f14985r;

    /* JADX INFO: renamed from: s */
    long f14986s;

    /* JADX INFO: renamed from: t */
    boolean f14987t;

    LocationRequest(int i7, long j7, long j8, boolean z7, long j9, int i8, float f7, long j10, boolean z8) {
        this.f14979a = i7;
        this.f14980b = j7;
        this.f14981c = j8;
        this.f14982d = z7;
        this.f14983e = j9;
        this.f14984f = i8;
        this.f14985r = f7;
        this.f14986s = j10;
        this.f14987t = z8;
    }

    /* JADX INFO: renamed from: T */
    public long m18384T() {
        return this.f14980b;
    }

    /* JADX INFO: renamed from: U */
    public long m18385U() {
        long j7 = this.f14986s;
        long j8 = this.f14980b;
        return j7 < j8 ? j8 : j7;
    }

    public boolean equals(Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            if (this.f14979a == locationRequest.f14979a && this.f14980b == locationRequest.f14980b && this.f14981c == locationRequest.f14981c && this.f14982d == locationRequest.f14982d && this.f14983e == locationRequest.f14983e && this.f14984f == locationRequest.f14984f && this.f14985r == locationRequest.f14985r && m18385U() == locationRequest.m18385U() && this.f14987t == locationRequest.f14987t) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return AbstractC3714q.m18054c(Integer.valueOf(this.f14979a), Long.valueOf(this.f14980b), Float.valueOf(this.f14985r), Long.valueOf(this.f14986s));
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Request[");
        int i7 = this.f14979a;
        if (i7 == 100) {
            str = "PRIORITY_HIGH_ACCURACY";
        } else if (i7 == 102) {
            str = "PRIORITY_BALANCED_POWER_ACCURACY";
        } else if (i7 != 104) {
            str = i7 != 105 ? "???" : "PRIORITY_NO_POWER";
        } else {
            str = "PRIORITY_LOW_POWER";
        }
        sb.append(str);
        if (this.f14979a != 105) {
            sb.append(" requested=");
            sb.append(this.f14980b);
            sb.append("ms");
        }
        sb.append(" fastest=");
        sb.append(this.f14981c);
        sb.append("ms");
        if (this.f14986s > this.f14980b) {
            sb.append(" maxWait=");
            sb.append(this.f14986s);
            sb.append("ms");
        }
        if (this.f14985r > 0.0f) {
            sb.append(" smallestDisplacement=");
            sb.append(this.f14985r);
            sb.append("m");
        }
        long j7 = this.f14983e;
        if (j7 != Long.MAX_VALUE) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            sb.append(" expireIn=");
            sb.append(j7 - jElapsedRealtime);
            sb.append("ms");
        }
        if (this.f14984f != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(this.f14984f);
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8072t(parcel, 1, this.f14979a);
        AbstractC1947c.m8076x(parcel, 2, this.f14980b);
        AbstractC1947c.m8076x(parcel, 3, this.f14981c);
        AbstractC1947c.m8059g(parcel, 4, this.f14982d);
        AbstractC1947c.m8076x(parcel, 5, this.f14983e);
        AbstractC1947c.m8072t(parcel, 6, this.f14984f);
        AbstractC1947c.m8068p(parcel, 7, this.f14985r);
        AbstractC1947c.m8076x(parcel, 8, this.f14986s);
        AbstractC1947c.m8059g(parcel, 9, this.f14987t);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
