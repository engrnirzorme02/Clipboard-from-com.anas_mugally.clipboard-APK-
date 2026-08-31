package p259h3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3714q;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: h3.I0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5572I0 extends AbstractC1945a {
    public static final Parcelable.Creator<C5572I0> CREATOR = new C5574J0();

    public C5572I0(boolean z7) {
    }

    public final boolean equals(Object obj) {
        return obj instanceof C5572I0;
    }

    public final int hashCode() {
        return AbstractC3714q.m18054c(Boolean.FALSE);
    }

    public final String toString() {
        return "DevicePublicKeyExtension{devicePublicKey=false}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8059g(parcel, 1, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
