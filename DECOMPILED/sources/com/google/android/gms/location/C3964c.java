package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3714q;
import com.google.android.gms.common.internal.AbstractC3718s;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: com.google.android.gms.location.c */
/* JADX INFO: loaded from: classes2.dex */
public class C3964c extends AbstractC1945a {
    public static final Parcelable.Creator<C3964c> CREATOR = new C3956V();

    /* JADX INFO: renamed from: a */
    private final int f15016a;

    /* JADX INFO: renamed from: b */
    private final int f15017b;

    C3964c(int i7, int i8) {
        this.f15016a = i7;
        this.f15017b = i8;
    }

    /* JADX INFO: renamed from: T */
    public int m18389T() {
        return this.f15016a;
    }

    /* JADX INFO: renamed from: U */
    public int m18390U() {
        return this.f15017b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3964c)) {
            return false;
        }
        C3964c c3964c = (C3964c) obj;
        return this.f15016a == c3964c.f15016a && this.f15017b == c3964c.f15017b;
    }

    public int hashCode() {
        return AbstractC3714q.m18054c(Integer.valueOf(this.f15016a), Integer.valueOf(this.f15017b));
    }

    public String toString() {
        int i7 = this.f15016a;
        int i8 = this.f15017b;
        StringBuilder sb = new StringBuilder(75);
        sb.append("ActivityTransition [mActivityType=");
        sb.append(i7);
        sb.append(", mTransitionType=");
        sb.append(i8);
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        AbstractC3718s.m18083l(parcel);
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8072t(parcel, 1, m18389T());
        AbstractC1947c.m8072t(parcel, 2, m18390U());
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
