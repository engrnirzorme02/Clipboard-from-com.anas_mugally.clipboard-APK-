package p114O2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3714q;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: O2.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1121d extends AbstractC1945a {
    public static final Parcelable.Creator<C1121d> CREATOR = new C1136s();

    /* JADX INFO: renamed from: a */
    private final String f4036a;

    /* JADX INFO: renamed from: b */
    private final boolean f4037b;

    public C1121d(String str, boolean z7) {
        this.f4036a = str;
        this.f4037b = z7;
    }

    /* JADX INFO: renamed from: T */
    public String m4928T() {
        return this.f4036a;
    }

    /* JADX INFO: renamed from: U */
    public boolean m4929U() {
        return this.f4037b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1121d) {
            C1121d c1121d = (C1121d) obj;
            if (this.f4036a.equals(c1121d.f4036a) && this.f4037b == c1121d.f4037b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return AbstractC3714q.m18054c(this.f4036a, Boolean.valueOf(this.f4037b));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8044E(parcel, 1, m4928T(), false);
        AbstractC1947c.m8059g(parcel, 2, m4929U());
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
