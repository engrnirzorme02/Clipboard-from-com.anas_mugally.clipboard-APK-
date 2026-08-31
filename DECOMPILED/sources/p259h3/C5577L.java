package p259h3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3714q;
import com.google.android.gms.common.internal.AbstractC3718s;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: h3.L */
/* JADX INFO: loaded from: classes.dex */
public final class C5577L extends AbstractC1945a {
    public static final Parcelable.Creator<C5577L> CREATOR = new C5579M();

    /* JADX INFO: renamed from: a */
    private final long f21458a;

    public C5577L(long j7) {
        this.f21458a = ((Long) AbstractC3718s.m18083l(Long.valueOf(j7))).longValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C5577L) && this.f21458a == ((C5577L) obj).f21458a;
    }

    public final int hashCode() {
        return AbstractC3714q.m18054c(Long.valueOf(this.f21458a));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        long j7 = this.f21458a;
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8076x(parcel, 1, j7);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
