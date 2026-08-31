package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3714q;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: loaded from: classes2.dex */
public final class LocationAvailability extends AbstractC1945a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new C3939D();

    /* JADX INFO: renamed from: a */
    int f14974a;

    /* JADX INFO: renamed from: b */
    int f14975b;

    /* JADX INFO: renamed from: c */
    long f14976c;

    /* JADX INFO: renamed from: d */
    int f14977d;

    /* JADX INFO: renamed from: e */
    C3949N[] f14978e;

    LocationAvailability(int i7, int i8, int i9, long j7, C3949N[] c3949nArr) {
        this.f14977d = i7;
        this.f14974a = i8;
        this.f14975b = i9;
        this.f14976c = j7;
        this.f14978e = c3949nArr;
    }

    /* JADX INFO: renamed from: T */
    public boolean m18383T() {
        return this.f14977d < 1000;
    }

    public boolean equals(Object obj) {
        if (obj instanceof LocationAvailability) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            if (this.f14974a == locationAvailability.f14974a && this.f14975b == locationAvailability.f14975b && this.f14976c == locationAvailability.f14976c && this.f14977d == locationAvailability.f14977d && Arrays.equals(this.f14978e, locationAvailability.f14978e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return AbstractC3714q.m18054c(Integer.valueOf(this.f14977d), Integer.valueOf(this.f14974a), Integer.valueOf(this.f14975b), Long.valueOf(this.f14976c), this.f14978e);
    }

    public String toString() {
        boolean zM18383T = m18383T();
        StringBuilder sb = new StringBuilder(48);
        sb.append("LocationAvailability[isLocationAvailable: ");
        sb.append(zM18383T);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8072t(parcel, 1, this.f14974a);
        AbstractC1947c.m8072t(parcel, 2, this.f14975b);
        AbstractC1947c.m8076x(parcel, 3, this.f14976c);
        AbstractC1947c.m8072t(parcel, 4, this.f14977d);
        AbstractC1947c.m8047H(parcel, 5, this.f14978e, i7, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
