package p259h3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3714q;
import com.google.android.gms.common.internal.AbstractC3718s;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: h3.Q */
/* JADX INFO: loaded from: classes.dex */
public final class C5584Q extends AbstractC1945a {
    public static final Parcelable.Creator<C5584Q> CREATOR = new C5585S();

    /* JADX INFO: renamed from: a */
    private final String f21461a;

    public C5584Q(String str) {
        this.f21461a = (String) AbstractC3718s.m18083l(str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5584Q) {
            return this.f21461a.equals(((C5584Q) obj).f21461a);
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC3714q.m18054c(this.f21461a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.f21461a;
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8044E(parcel, 1, str, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
