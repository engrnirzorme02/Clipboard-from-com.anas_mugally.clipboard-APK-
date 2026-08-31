package p114O2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3714q;
import com.google.android.gms.common.internal.AbstractC3718s;
import java.util.List;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: O2.g */
/* JADX INFO: loaded from: classes.dex */
public class C1124g extends AbstractC1945a {
    public static final Parcelable.Creator<C1124g> CREATOR = new C1139v();

    /* JADX INFO: renamed from: a */
    private final String f4039a;

    /* JADX INFO: renamed from: b */
    private final String f4040b;

    /* JADX INFO: renamed from: c */
    private final String f4041c;

    /* JADX INFO: renamed from: d */
    private final String f4042d;

    /* JADX INFO: renamed from: e */
    private final boolean f4043e;

    /* JADX INFO: renamed from: f */
    private final int f4044f;

    /* JADX INFO: renamed from: r */
    private final List f4045r;

    /* JADX INFO: renamed from: O2.g$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private String f4046a;

        /* JADX INFO: renamed from: b */
        private String f4047b;

        /* JADX INFO: renamed from: c */
        private String f4048c;

        /* JADX INFO: renamed from: d */
        private List f4049d;

        /* JADX INFO: renamed from: e */
        private String f4050e;

        /* JADX INFO: renamed from: f */
        private boolean f4051f;

        /* JADX INFO: renamed from: g */
        private int f4052g;

        /* JADX INFO: renamed from: a */
        public C1124g m4937a() {
            return new C1124g(this.f4046a, this.f4047b, this.f4048c, this.f4050e, this.f4051f, this.f4052g, this.f4049d);
        }

        /* JADX INFO: renamed from: b */
        public a m4938b(String str) {
            this.f4047b = str;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public a m4939c(List list) {
            this.f4049d = list;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public a m4940d(String str) {
            this.f4050e = str;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public a m4941e(boolean z7) {
            this.f4051f = z7;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public a m4942f(String str) {
            AbstractC3718s.m18083l(str);
            this.f4046a = str;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public final a m4943g(String str) {
            this.f4048c = str;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public final a m4944h(int i7) {
            this.f4052g = i7;
            return this;
        }
    }

    C1124g(String str, String str2, String str3, String str4, boolean z7, int i7, List list) {
        AbstractC3718s.m18083l(str);
        this.f4039a = str;
        this.f4040b = str2;
        this.f4041c = str3;
        this.f4042d = str4;
        this.f4043e = z7;
        this.f4044f = i7;
        this.f4045r = list;
    }

    /* JADX INFO: renamed from: T */
    public static a m4930T() {
        return new a();
    }

    /* JADX INFO: renamed from: Z */
    public static a m4931Z(C1124g c1124g) {
        AbstractC3718s.m18083l(c1124g);
        a aVarM4930T = m4930T();
        aVarM4930T.m4942f(c1124g.m4935X());
        aVarM4930T.m4940d(c1124g.m4934W());
        aVarM4930T.m4938b(c1124g.m4933V());
        aVarM4930T.m4941e(c1124g.f4043e);
        aVarM4930T.m4944h(c1124g.f4044f);
        aVarM4930T.m4939c(c1124g.m4932U());
        String str = c1124g.f4041c;
        if (str != null) {
            aVarM4930T.m4943g(str);
        }
        return aVarM4930T;
    }

    /* JADX INFO: renamed from: U */
    public List m4932U() {
        return this.f4045r;
    }

    /* JADX INFO: renamed from: V */
    public String m4933V() {
        return this.f4040b;
    }

    /* JADX INFO: renamed from: W */
    public String m4934W() {
        return this.f4042d;
    }

    /* JADX INFO: renamed from: X */
    public String m4935X() {
        return this.f4039a;
    }

    /* JADX INFO: renamed from: Y */
    public boolean m4936Y() {
        return this.f4043e;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1124g)) {
            return false;
        }
        C1124g c1124g = (C1124g) obj;
        return AbstractC3714q.m18053b(this.f4039a, c1124g.f4039a) && AbstractC3714q.m18053b(this.f4042d, c1124g.f4042d) && AbstractC3714q.m18053b(this.f4040b, c1124g.f4040b) && AbstractC3714q.m18053b(Boolean.valueOf(this.f4043e), Boolean.valueOf(c1124g.f4043e)) && this.f4044f == c1124g.f4044f && AbstractC3714q.m18053b(this.f4045r, c1124g.f4045r);
    }

    public int hashCode() {
        return AbstractC3714q.m18054c(this.f4039a, this.f4040b, this.f4042d, Boolean.valueOf(this.f4043e), Integer.valueOf(this.f4044f), this.f4045r);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8044E(parcel, 1, m4935X(), false);
        AbstractC1947c.m8044E(parcel, 2, m4933V(), false);
        AbstractC1947c.m8044E(parcel, 3, this.f4041c, false);
        AbstractC1947c.m8044E(parcel, 4, m4934W(), false);
        AbstractC1947c.m8059g(parcel, 5, m4936Y());
        AbstractC1947c.m8072t(parcel, 6, this.f4044f);
        AbstractC1947c.m8048I(parcel, 7, m4932U(), false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
