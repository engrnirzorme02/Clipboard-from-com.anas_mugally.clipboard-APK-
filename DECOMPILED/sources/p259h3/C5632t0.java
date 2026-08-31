package p259h3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3714q;
import com.google.android.gms.internal.fido.zzgx;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: h3.t0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5632t0 extends AbstractC1945a {
    public static final Parcelable.Creator<C5632t0> CREATOR = new C5634u0();

    /* JADX INFO: renamed from: a */
    private final zzgx f21569a;

    /* JADX INFO: renamed from: b */
    private final zzgx f21570b;

    public C5632t0(zzgx zzgxVar, zzgx zzgxVar2) {
        this.f21569a = zzgxVar;
        this.f21570b = zzgxVar2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5632t0)) {
            return false;
        }
        C5632t0 c5632t0 = (C5632t0) obj;
        return AbstractC3714q.m18053b(this.f21569a, c5632t0.f21569a) && AbstractC3714q.m18053b(this.f21570b, c5632t0.f21570b);
    }

    public final int hashCode() {
        return AbstractC3714q.m18054c(this.f21569a, this.f21570b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        zzgx zzgxVar = this.f21569a;
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8063k(parcel, 1, zzgxVar == null ? null : zzgxVar.zzm(), false);
        zzgx zzgxVar2 = this.f21570b;
        AbstractC1947c.m8063k(parcel, 2, zzgxVar2 != null ? zzgxVar2.zzm() : null, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
