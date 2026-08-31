package p259h3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3714q;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: h3.g0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5606g0 extends AbstractC1945a {
    public static final Parcelable.Creator<C5606g0> CREATOR = new C5608h0();

    /* JADX INFO: renamed from: a */
    private final String f21516a;

    C5606g0(String str) {
        this.f21516a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5606g0) {
            return AbstractC3714q.m18053b(this.f21516a, ((C5606g0) obj).f21516a);
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC3714q.m18054c(this.f21516a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.f21516a;
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8044E(parcel, 1, str, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
