package p259h3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3714q;
import com.google.android.gms.common.internal.AbstractC3718s;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: h3.r */
/* JADX INFO: loaded from: classes.dex */
public class C5627r extends AbstractC1945a {
    public static final Parcelable.Creator<C5627r> CREATOR = new C5578L0();

    /* JADX INFO: renamed from: a */
    private final String f21558a;

    public C5627r(String str) {
        this.f21558a = (String) AbstractC3718s.m18083l(str);
    }

    /* JADX INFO: renamed from: T */
    public String m25067T() {
        return this.f21558a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C5627r) {
            return this.f21558a.equals(((C5627r) obj).f21558a);
        }
        return false;
    }

    public int hashCode() {
        return AbstractC3714q.m18054c(this.f21558a);
    }

    public final String toString() {
        return "FidoAppIdExtension{appid='" + this.f21558a + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8044E(parcel, 2, m25067T(), false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
