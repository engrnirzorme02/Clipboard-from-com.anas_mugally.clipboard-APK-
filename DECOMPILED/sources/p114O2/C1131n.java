package p114O2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3714q;
import com.google.android.gms.common.internal.AbstractC3718s;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: O2.n */
/* JADX INFO: loaded from: classes.dex */
public class C1131n extends AbstractC1945a {
    public static final Parcelable.Creator<C1131n> CREATOR = new C1117F();

    /* JADX INFO: renamed from: a */
    private final String f4070a;

    /* JADX INFO: renamed from: b */
    private final String f4071b;

    public C1131n(String str, String str2) {
        this.f4070a = AbstractC3718s.m18078g(((String) AbstractC3718s.m18084m(str, "Account identifier cannot be null")).trim(), "Account identifier cannot be empty");
        this.f4071b = AbstractC3718s.m18077f(str2);
    }

    /* JADX INFO: renamed from: T */
    public String m4965T() {
        return this.f4070a;
    }

    /* JADX INFO: renamed from: U */
    public String m4966U() {
        return this.f4071b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1131n)) {
            return false;
        }
        C1131n c1131n = (C1131n) obj;
        return AbstractC3714q.m18053b(this.f4070a, c1131n.f4070a) && AbstractC3714q.m18053b(this.f4071b, c1131n.f4071b);
    }

    public int hashCode() {
        return AbstractC3714q.m18054c(this.f4070a, this.f4071b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8044E(parcel, 1, m4965T(), false);
        AbstractC1947c.m8044E(parcel, 2, m4966U(), false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
