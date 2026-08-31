package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3714q;
import com.google.android.gms.common.internal.AbstractC3718s;
import java.util.List;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: com.google.android.gms.location.q */
/* JADX INFO: loaded from: classes2.dex */
public class C3978q extends AbstractC1945a {
    public static final Parcelable.Creator<C3978q> CREATOR = new C3953S();

    /* JADX INFO: renamed from: a */
    private final List f15048a;

    /* JADX INFO: renamed from: b */
    private final int f15049b;

    public C3978q(List list, int i7) {
        this.f15048a = list;
        this.f15049b = i7;
    }

    /* JADX INFO: renamed from: T */
    public int m18406T() {
        return this.f15049b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3978q)) {
            return false;
        }
        C3978q c3978q = (C3978q) obj;
        return AbstractC3714q.m18053b(this.f15048a, c3978q.f15048a) && this.f15049b == c3978q.f15049b;
    }

    public int hashCode() {
        return AbstractC3714q.m18054c(this.f15048a, Integer.valueOf(this.f15049b));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        AbstractC3718s.m18083l(parcel);
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8048I(parcel, 1, this.f15048a, false);
        AbstractC1947c.m8072t(parcel, 2, m18406T());
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
