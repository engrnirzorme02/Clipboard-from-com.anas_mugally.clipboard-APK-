package p092L2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3714q;
import com.google.android.gms.common.internal.AbstractC3718s;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: L2.a */
/* JADX INFO: loaded from: classes.dex */
public class C0834a extends AbstractC1945a {
    public static final Parcelable.Creator<C0834a> CREATOR = new C0837d();

    /* JADX INFO: renamed from: a */
    final int f3294a;

    /* JADX INFO: renamed from: b */
    final long f3295b;

    /* JADX INFO: renamed from: c */
    final String f3296c;

    /* JADX INFO: renamed from: d */
    final int f3297d;

    /* JADX INFO: renamed from: e */
    final int f3298e;

    /* JADX INFO: renamed from: f */
    final String f3299f;

    C0834a(int i7, long j7, String str, int i8, int i9, String str2) {
        this.f3294a = i7;
        this.f3295b = j7;
        this.f3296c = (String) AbstractC3718s.m18083l(str);
        this.f3297d = i8;
        this.f3298e = i9;
        this.f3299f = str2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0834a)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C0834a c0834a = (C0834a) obj;
        return this.f3294a == c0834a.f3294a && this.f3295b == c0834a.f3295b && AbstractC3714q.m18053b(this.f3296c, c0834a.f3296c) && this.f3297d == c0834a.f3297d && this.f3298e == c0834a.f3298e && AbstractC3714q.m18053b(this.f3299f, c0834a.f3299f);
    }

    public int hashCode() {
        return AbstractC3714q.m18054c(Integer.valueOf(this.f3294a), Long.valueOf(this.f3295b), this.f3296c, Integer.valueOf(this.f3297d), Integer.valueOf(this.f3298e), this.f3299f);
    }

    public String toString() {
        String str;
        int i7 = this.f3297d;
        if (i7 == 1) {
            str = "ADDED";
        } else if (i7 == 2) {
            str = "REMOVED";
        } else if (i7 != 3) {
            str = i7 != 4 ? "UNKNOWN" : "RENAMED_TO";
        } else {
            str = "RENAMED_FROM";
        }
        return "AccountChangeEvent {accountName = " + this.f3296c + ", changeType = " + str + ", changeData = " + this.f3299f + ", eventIndex = " + this.f3298e + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8072t(parcel, 1, this.f3294a);
        AbstractC1947c.m8076x(parcel, 2, this.f3295b);
        AbstractC1947c.m8044E(parcel, 3, this.f3296c, false);
        AbstractC1947c.m8072t(parcel, 4, this.f3297d);
        AbstractC1947c.m8072t(parcel, 5, this.f3298e);
        AbstractC1947c.m8044E(parcel, 6, this.f3299f, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
