package p114O2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3714q;
import com.google.android.gms.common.internal.AbstractC3718s;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: O2.j */
/* JADX INFO: loaded from: classes.dex */
public class C1127j extends AbstractC1945a {
    public static final Parcelable.Creator<C1127j> CREATOR = new C1113B();

    /* JADX INFO: renamed from: a */
    private final C1131n f4054a;

    /* JADX INFO: renamed from: b */
    private final String f4055b;

    /* JADX INFO: renamed from: c */
    private final int f4056c;

    /* JADX INFO: renamed from: O2.j$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private C1131n f4057a;

        /* JADX INFO: renamed from: b */
        private String f4058b;

        /* JADX INFO: renamed from: c */
        private int f4059c;

        /* JADX INFO: renamed from: a */
        public C1127j m4951a() {
            return new C1127j(this.f4057a, this.f4058b, this.f4059c);
        }

        /* JADX INFO: renamed from: b */
        public a m4952b(C1131n c1131n) {
            this.f4057a = c1131n;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public final a m4953c(int i7) {
            this.f4059c = i7;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public final a m4954d(String str) {
            this.f4058b = str;
            return this;
        }
    }

    C1127j(C1131n c1131n, String str, int i7) {
        this.f4054a = (C1131n) AbstractC3718s.m18083l(c1131n);
        this.f4055b = str;
        this.f4056c = i7;
    }

    /* JADX INFO: renamed from: T */
    public static a m4948T() {
        return new a();
    }

    /* JADX INFO: renamed from: V */
    public static a m4949V(C1127j c1127j) {
        AbstractC3718s.m18083l(c1127j);
        a aVarM4948T = m4948T();
        aVarM4948T.m4952b(c1127j.m4950U());
        aVarM4948T.m4953c(c1127j.f4056c);
        String str = c1127j.f4055b;
        if (str != null) {
            aVarM4948T.m4954d(str);
        }
        return aVarM4948T;
    }

    /* JADX INFO: renamed from: U */
    public C1131n m4950U() {
        return this.f4054a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1127j)) {
            return false;
        }
        C1127j c1127j = (C1127j) obj;
        return AbstractC3714q.m18053b(this.f4054a, c1127j.f4054a) && AbstractC3714q.m18053b(this.f4055b, c1127j.f4055b) && this.f4056c == c1127j.f4056c;
    }

    public int hashCode() {
        return AbstractC3714q.m18054c(this.f4054a, this.f4055b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8042C(parcel, 1, m4950U(), i7, false);
        AbstractC1947c.m8044E(parcel, 2, this.f4055b, false);
        AbstractC1947c.m8072t(parcel, 3, this.f4056c);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
