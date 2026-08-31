package p259h3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3714q;
import com.google.android.gms.common.internal.AbstractC3718s;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: h3.M0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5580M0 extends AbstractC1945a {
    public static final Parcelable.Creator<C5580M0> CREATOR = new C5575K();

    /* JADX INFO: renamed from: a */
    private final boolean f21459a;

    public C5580M0(boolean z7) {
        this.f21459a = ((Boolean) AbstractC3718s.m18083l(Boolean.valueOf(z7))).booleanValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C5580M0) && this.f21459a == ((C5580M0) obj).f21459a;
    }

    public final int hashCode() {
        return AbstractC3714q.m18054c(Boolean.valueOf(this.f21459a));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        boolean z7 = this.f21459a;
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8059g(parcel, 1, z7);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
