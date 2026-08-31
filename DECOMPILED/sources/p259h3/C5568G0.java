package p259h3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3714q;
import com.google.android.gms.common.internal.AbstractC3718s;
import java.util.HashSet;
import java.util.List;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: h3.G0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5568G0 extends AbstractC1945a {
    public static final Parcelable.Creator<C5568G0> CREATOR = new C5570H0();

    /* JADX INFO: renamed from: a */
    private final List f21453a;

    public C5568G0(List list) {
        this.f21453a = (List) AbstractC3718s.m18083l(list);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5568G0)) {
            return false;
        }
        C5568G0 c5568g0 = (C5568G0) obj;
        return this.f21453a.containsAll(c5568g0.f21453a) && c5568g0.f21453a.containsAll(this.f21453a);
    }

    public final int hashCode() {
        return AbstractC3714q.m18054c(new HashSet(this.f21453a));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        List list = this.f21453a;
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8048I(parcel, 1, list, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
