package p259h3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3714q;
import com.google.android.gms.common.internal.AbstractC3718s;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: h3.y */
/* JADX INFO: loaded from: classes.dex */
public class C5641y extends AbstractC1945a {
    public static final Parcelable.Creator<C5641y> CREATOR = new C5598c0();

    /* JADX INFO: renamed from: a */
    private final String f21623a;

    /* JADX INFO: renamed from: b */
    private final String f21624b;

    /* JADX INFO: renamed from: c */
    private final String f21625c;

    public C5641y(String str, String str2, String str3) {
        this.f21623a = (String) AbstractC3718s.m18083l(str);
        this.f21624b = (String) AbstractC3718s.m18083l(str2);
        this.f21625c = str3;
    }

    /* JADX INFO: renamed from: T */
    public String m25123T() {
        return this.f21625c;
    }

    /* JADX INFO: renamed from: U */
    public String m25124U() {
        return this.f21623a;
    }

    /* JADX INFO: renamed from: V */
    public String m25125V() {
        return this.f21624b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5641y)) {
            return false;
        }
        C5641y c5641y = (C5641y) obj;
        return AbstractC3714q.m18053b(this.f21623a, c5641y.f21623a) && AbstractC3714q.m18053b(this.f21624b, c5641y.f21624b) && AbstractC3714q.m18053b(this.f21625c, c5641y.f21625c);
    }

    public int hashCode() {
        return AbstractC3714q.m18054c(this.f21623a, this.f21624b, this.f21625c);
    }

    public final String toString() {
        return "PublicKeyCredentialRpEntity{\n id='" + this.f21623a + "', \n name='" + this.f21624b + "', \n icon='" + this.f21625c + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8044E(parcel, 2, m25124U(), false);
        AbstractC1947c.m8044E(parcel, 3, m25125V(), false);
        AbstractC1947c.m8044E(parcel, 4, m25123T(), false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
