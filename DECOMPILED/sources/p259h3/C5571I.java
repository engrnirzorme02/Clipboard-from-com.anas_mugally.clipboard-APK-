package p259h3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3714q;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: h3.I */
/* JADX INFO: loaded from: classes.dex */
public class C5571I extends AbstractC1945a {
    public static final Parcelable.Creator<C5571I> CREATOR = new C5624p0();

    /* JADX INFO: renamed from: a */
    private final int f21455a;

    /* JADX INFO: renamed from: b */
    private final short f21456b;

    /* JADX INFO: renamed from: c */
    private final short f21457c;

    C5571I(int i7, short s7, short s8) {
        this.f21455a = i7;
        this.f21456b = s7;
        this.f21457c = s8;
    }

    /* JADX INFO: renamed from: T */
    public short m25002T() {
        return this.f21456b;
    }

    /* JADX INFO: renamed from: U */
    public short m25003U() {
        return this.f21457c;
    }

    /* JADX INFO: renamed from: V */
    public int m25004V() {
        return this.f21455a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5571I)) {
            return false;
        }
        C5571I c5571i = (C5571I) obj;
        return this.f21455a == c5571i.f21455a && this.f21456b == c5571i.f21456b && this.f21457c == c5571i.f21457c;
    }

    public int hashCode() {
        return AbstractC3714q.m18054c(Integer.valueOf(this.f21455a), Short.valueOf(this.f21456b), Short.valueOf(this.f21457c));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8072t(parcel, 1, m25004V());
        AbstractC1947c.m8043D(parcel, 2, m25002T());
        AbstractC1947c.m8043D(parcel, 3, m25003U());
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
