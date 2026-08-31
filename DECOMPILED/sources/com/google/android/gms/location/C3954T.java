package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3714q;
import com.google.android.gms.common.internal.AbstractC3718s;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: com.google.android.gms.location.T */
/* JADX INFO: loaded from: classes2.dex */
public final class C3954T extends AbstractC1945a {
    public static final Parcelable.Creator<C3954T> CREATOR = new C3955U();

    /* JADX INFO: renamed from: a */
    private final int f14997a;

    /* JADX INFO: renamed from: b */
    private final int f14998b;

    /* JADX INFO: renamed from: c */
    private final int f14999c;

    /* JADX INFO: renamed from: d */
    private final int f15000d;

    public C3954T(int i7, int i8, int i9, int i10) {
        AbstractC3718s.m18087p(i7 >= 0 && i7 <= 23, "Start hour must be in range [0, 23].");
        AbstractC3718s.m18087p(i8 >= 0 && i8 <= 59, "Start minute must be in range [0, 59].");
        AbstractC3718s.m18087p(i9 >= 0 && i9 <= 23, "End hour must be in range [0, 23].");
        AbstractC3718s.m18087p(i10 >= 0 && i10 <= 59, "End minute must be in range [0, 59].");
        AbstractC3718s.m18087p(((i7 + i8) + i9) + i10 > 0, "Parameters can't be all 0.");
        this.f14997a = i7;
        this.f14998b = i8;
        this.f14999c = i9;
        this.f15000d = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3954T)) {
            return false;
        }
        C3954T c3954t = (C3954T) obj;
        return this.f14997a == c3954t.f14997a && this.f14998b == c3954t.f14998b && this.f14999c == c3954t.f14999c && this.f15000d == c3954t.f15000d;
    }

    public final int hashCode() {
        return AbstractC3714q.m18054c(Integer.valueOf(this.f14997a), Integer.valueOf(this.f14998b), Integer.valueOf(this.f14999c), Integer.valueOf(this.f15000d));
    }

    public final String toString() {
        int i7 = this.f14997a;
        int i8 = this.f14998b;
        int i9 = this.f14999c;
        int i10 = this.f15000d;
        StringBuilder sb = new StringBuilder(117);
        sb.append("UserPreferredSleepWindow [startHour=");
        sb.append(i7);
        sb.append(", startMinute=");
        sb.append(i8);
        sb.append(", endHour=");
        sb.append(i9);
        sb.append(", endMinute=");
        sb.append(i10);
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        AbstractC3718s.m18083l(parcel);
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8072t(parcel, 1, this.f14997a);
        AbstractC1947c.m8072t(parcel, 2, this.f14998b);
        AbstractC1947c.m8072t(parcel, 3, this.f14999c);
        AbstractC1947c.m8072t(parcel, 4, this.f15000d);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
