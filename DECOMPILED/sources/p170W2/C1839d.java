package p170W2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3714q;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: W2.d */
/* JADX INFO: loaded from: classes.dex */
public class C1839d extends AbstractC1945a {
    public static final Parcelable.Creator<C1839d> CREATOR = new C1852q();

    /* JADX INFO: renamed from: a */
    private final String f5980a;

    /* JADX INFO: renamed from: b */
    private final int f5981b;

    /* JADX INFO: renamed from: c */
    private final long f5982c;

    public C1839d(String str, int i7, long j7) {
        this.f5980a = str;
        this.f5981b = i7;
        this.f5982c = j7;
    }

    /* JADX INFO: renamed from: T */
    public String m7602T() {
        return this.f5980a;
    }

    /* JADX INFO: renamed from: U */
    public long m7603U() {
        long j7 = this.f5982c;
        return j7 == -1 ? this.f5981b : j7;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1839d) {
            C1839d c1839d = (C1839d) obj;
            if (((m7602T() != null && m7602T().equals(c1839d.m7602T())) || (m7602T() == null && c1839d.m7602T() == null)) && m7603U() == c1839d.m7603U()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC3714q.m18054c(m7602T(), Long.valueOf(m7603U()));
    }

    public final String toString() {
        AbstractC3714q.a aVarM18055d = AbstractC3714q.m18055d(this);
        aVarM18055d.m18056a("name", m7602T());
        aVarM18055d.m18056a("version", Long.valueOf(m7603U()));
        return aVarM18055d.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8044E(parcel, 1, m7602T(), false);
        AbstractC1947c.m8072t(parcel, 2, this.f5981b);
        AbstractC1947c.m8076x(parcel, 3, m7603U());
        AbstractC1947c.m8054b(parcel, iM8053a);
    }

    public C1839d(String str, long j7) {
        this.f5980a = str;
        this.f5982c = j7;
        this.f5981b = -1;
    }
}
