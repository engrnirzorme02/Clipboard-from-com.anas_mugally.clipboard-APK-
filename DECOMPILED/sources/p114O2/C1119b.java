package p114O2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3714q;
import com.google.android.gms.common.internal.AbstractC3718s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: O2.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1119b extends AbstractC1945a {
    public static final Parcelable.Creator<C1119b> CREATOR = new C1134q();

    /* JADX INFO: renamed from: a */
    private final e f3991a;

    /* JADX INFO: renamed from: b */
    private final b f3992b;

    /* JADX INFO: renamed from: c */
    private final String f3993c;

    /* JADX INFO: renamed from: d */
    private final boolean f3994d;

    /* JADX INFO: renamed from: e */
    private final int f3995e;

    /* JADX INFO: renamed from: f */
    private final d f3996f;

    /* JADX INFO: renamed from: r */
    private final c f3997r;

    /* JADX INFO: renamed from: s */
    private final boolean f3998s;

    /* JADX INFO: renamed from: O2.b$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private e f3999a;

        /* JADX INFO: renamed from: b */
        private b f4000b;

        /* JADX INFO: renamed from: c */
        private d f4001c;

        /* JADX INFO: renamed from: d */
        private c f4002d;

        /* JADX INFO: renamed from: e */
        private String f4003e;

        /* JADX INFO: renamed from: f */
        private boolean f4004f;

        /* JADX INFO: renamed from: g */
        private int f4005g;

        /* JADX INFO: renamed from: h */
        private boolean f4006h;

        public a() {
            e.a aVarM4923T = e.m4923T();
            aVarM4923T.m4926b(false);
            this.f3999a = aVarM4923T.m4925a();
            b.a aVarM4901T = b.m4901T();
            aVarM4901T.m4911b(false);
            this.f4000b = aVarM4901T.m4910a();
            d.a aVarM4917T = d.m4917T();
            aVarM4917T.m4922b(false);
            this.f4001c = aVarM4917T.m4921a();
            c.a aVarM4912T = c.m4912T();
            aVarM4912T.m4916b(false);
            this.f4002d = aVarM4912T.m4915a();
        }

        /* JADX INFO: renamed from: a */
        public C1119b m4892a() {
            return new C1119b(this.f3999a, this.f4000b, this.f4003e, this.f4004f, this.f4005g, this.f4001c, this.f4002d, this.f4006h);
        }

        /* JADX INFO: renamed from: b */
        public a m4893b(boolean z7) {
            this.f4004f = z7;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public a m4894c(b bVar) {
            this.f4000b = (b) AbstractC3718s.m18083l(bVar);
            return this;
        }

        /* JADX INFO: renamed from: d */
        public a m4895d(c cVar) {
            this.f4002d = (c) AbstractC3718s.m18083l(cVar);
            return this;
        }

        /* JADX INFO: renamed from: e */
        public a m4896e(d dVar) {
            this.f4001c = (d) AbstractC3718s.m18083l(dVar);
            return this;
        }

        /* JADX INFO: renamed from: f */
        public a m4897f(e eVar) {
            this.f3999a = (e) AbstractC3718s.m18083l(eVar);
            return this;
        }

        /* JADX INFO: renamed from: g */
        public a m4898g(boolean z7) {
            this.f4006h = z7;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public final a m4899h(String str) {
            this.f4003e = str;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public final a m4900i(int i7) {
            this.f4005g = i7;
            return this;
        }
    }

    /* JADX INFO: renamed from: O2.b$b */
    public static final class b extends AbstractC1945a {
        public static final Parcelable.Creator<b> CREATOR = new C1140w();

        /* JADX INFO: renamed from: a */
        private final boolean f4007a;

        /* JADX INFO: renamed from: b */
        private final String f4008b;

        /* JADX INFO: renamed from: c */
        private final String f4009c;

        /* JADX INFO: renamed from: d */
        private final boolean f4010d;

        /* JADX INFO: renamed from: e */
        private final String f4011e;

        /* JADX INFO: renamed from: f */
        private final List f4012f;

        /* JADX INFO: renamed from: r */
        private final boolean f4013r;

        /* JADX INFO: renamed from: s */
        private final List f4014s;

        /* JADX INFO: renamed from: O2.b$b$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            private boolean f4015a = false;

            /* JADX INFO: renamed from: b */
            private String f4016b = null;

            /* JADX INFO: renamed from: c */
            private String f4017c = null;

            /* JADX INFO: renamed from: d */
            private boolean f4018d = true;

            /* JADX INFO: renamed from: e */
            private String f4019e = null;

            /* JADX INFO: renamed from: f */
            private List f4020f = null;

            /* JADX INFO: renamed from: g */
            private boolean f4021g = false;

            /* JADX INFO: renamed from: h */
            private List f4022h = null;

            /* JADX INFO: renamed from: a */
            public b m4910a() {
                return new b(this.f4015a, this.f4016b, this.f4017c, this.f4018d, this.f4019e, this.f4020f, this.f4021g, this.f4022h);
            }

            /* JADX INFO: renamed from: b */
            public a m4911b(boolean z7) {
                this.f4015a = z7;
                return this;
            }
        }

        b(boolean z7, String str, String str2, boolean z8, String str3, List list, boolean z9, List list2) {
            boolean z10 = true;
            if (z8 && z9) {
                z10 = false;
            }
            AbstractC3718s.m18073b(z10, "filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.");
            this.f4007a = z7;
            if (z7) {
                AbstractC3718s.m18084m(str, "serverClientId must be provided if Google ID tokens are requested");
            }
            this.f4008b = str;
            this.f4009c = str2;
            this.f4010d = z8;
            Parcelable.Creator<C1119b> creator = C1119b.CREATOR;
            ArrayList arrayList = null;
            if (list != null && !list.isEmpty()) {
                arrayList = new ArrayList(list);
                Collections.sort(arrayList);
            }
            this.f4012f = arrayList;
            this.f4011e = str3;
            this.f4013r = z9;
            this.f4014s = list2;
        }

        /* JADX INFO: renamed from: T */
        public static a m4901T() {
            return new a();
        }

        /* JADX INFO: renamed from: U */
        public boolean m4902U() {
            return this.f4010d;
        }

        /* JADX INFO: renamed from: V */
        public List m4903V() {
            return this.f4014s;
        }

        /* JADX INFO: renamed from: W */
        public List m4904W() {
            return this.f4012f;
        }

        /* JADX INFO: renamed from: X */
        public String m4905X() {
            return this.f4011e;
        }

        /* JADX INFO: renamed from: Y */
        public String m4906Y() {
            return this.f4009c;
        }

        /* JADX INFO: renamed from: Z */
        public String m4907Z() {
            return this.f4008b;
        }

        /* JADX INFO: renamed from: a0 */
        public boolean m4908a0() {
            return this.f4007a;
        }

        /* JADX INFO: renamed from: b0 */
        public boolean m4909b0() {
            return this.f4013r;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f4007a == bVar.f4007a && AbstractC3714q.m18053b(this.f4008b, bVar.f4008b) && AbstractC3714q.m18053b(this.f4009c, bVar.f4009c) && this.f4010d == bVar.f4010d && AbstractC3714q.m18053b(this.f4011e, bVar.f4011e) && AbstractC3714q.m18053b(this.f4012f, bVar.f4012f) && this.f4013r == bVar.f4013r && AbstractC3714q.m18053b(this.f4014s, bVar.f4014s);
        }

        public int hashCode() {
            return AbstractC3714q.m18054c(Boolean.valueOf(this.f4007a), this.f4008b, this.f4009c, Boolean.valueOf(this.f4010d), this.f4011e, this.f4012f, Boolean.valueOf(this.f4013r), this.f4014s);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            int iM8053a = AbstractC1947c.m8053a(parcel);
            AbstractC1947c.m8059g(parcel, 1, m4908a0());
            AbstractC1947c.m8044E(parcel, 2, m4907Z(), false);
            AbstractC1947c.m8044E(parcel, 3, m4906Y(), false);
            AbstractC1947c.m8059g(parcel, 4, m4902U());
            AbstractC1947c.m8044E(parcel, 5, m4905X(), false);
            AbstractC1947c.m8046G(parcel, 6, m4904W(), false);
            AbstractC1947c.m8059g(parcel, 7, m4909b0());
            AbstractC1947c.m8048I(parcel, 8, m4903V(), false);
            AbstractC1947c.m8054b(parcel, iM8053a);
        }
    }

    /* JADX INFO: renamed from: O2.b$c */
    public static final class c extends AbstractC1945a {
        public static final Parcelable.Creator<c> CREATOR = new C1141x();

        /* JADX INFO: renamed from: a */
        private final boolean f4023a;

        /* JADX INFO: renamed from: b */
        private final String f4024b;

        /* JADX INFO: renamed from: O2.b$c$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            private boolean f4025a = false;

            /* JADX INFO: renamed from: b */
            private String f4026b;

            /* JADX INFO: renamed from: a */
            public c m4915a() {
                return new c(this.f4025a, this.f4026b);
            }

            /* JADX INFO: renamed from: b */
            public a m4916b(boolean z7) {
                this.f4025a = z7;
                return this;
            }
        }

        c(boolean z7, String str) {
            if (z7) {
                AbstractC3718s.m18083l(str);
            }
            this.f4023a = z7;
            this.f4024b = str;
        }

        /* JADX INFO: renamed from: T */
        public static a m4912T() {
            return new a();
        }

        /* JADX INFO: renamed from: U */
        public String m4913U() {
            return this.f4024b;
        }

        /* JADX INFO: renamed from: V */
        public boolean m4914V() {
            return this.f4023a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f4023a == cVar.f4023a && AbstractC3714q.m18053b(this.f4024b, cVar.f4024b);
        }

        public int hashCode() {
            return AbstractC3714q.m18054c(Boolean.valueOf(this.f4023a), this.f4024b);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            int iM8053a = AbstractC1947c.m8053a(parcel);
            AbstractC1947c.m8059g(parcel, 1, m4914V());
            AbstractC1947c.m8044E(parcel, 2, m4913U(), false);
            AbstractC1947c.m8054b(parcel, iM8053a);
        }
    }

    /* JADX INFO: renamed from: O2.b$d */
    public static final class d extends AbstractC1945a {
        public static final Parcelable.Creator<d> CREATOR = new C1142y();

        /* JADX INFO: renamed from: a */
        private final boolean f4027a;

        /* JADX INFO: renamed from: b */
        private final byte[] f4028b;

        /* JADX INFO: renamed from: c */
        private final String f4029c;

        /* JADX INFO: renamed from: O2.b$d$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            private boolean f4030a = false;

            /* JADX INFO: renamed from: b */
            private byte[] f4031b;

            /* JADX INFO: renamed from: c */
            private String f4032c;

            /* JADX INFO: renamed from: a */
            public d m4921a() {
                return new d(this.f4030a, this.f4031b, this.f4032c);
            }

            /* JADX INFO: renamed from: b */
            public a m4922b(boolean z7) {
                this.f4030a = z7;
                return this;
            }
        }

        d(boolean z7, byte[] bArr, String str) {
            if (z7) {
                AbstractC3718s.m18083l(bArr);
                AbstractC3718s.m18083l(str);
            }
            this.f4027a = z7;
            this.f4028b = bArr;
            this.f4029c = str;
        }

        /* JADX INFO: renamed from: T */
        public static a m4917T() {
            return new a();
        }

        /* JADX INFO: renamed from: U */
        public byte[] m4918U() {
            return this.f4028b;
        }

        /* JADX INFO: renamed from: V */
        public String m4919V() {
            return this.f4029c;
        }

        /* JADX INFO: renamed from: W */
        public boolean m4920W() {
            return this.f4027a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f4027a == dVar.f4027a && Arrays.equals(this.f4028b, dVar.f4028b) && Objects.equals(this.f4029c, dVar.f4029c);
        }

        public int hashCode() {
            return (Objects.hash(Boolean.valueOf(this.f4027a), this.f4029c) * 31) + Arrays.hashCode(this.f4028b);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            int iM8053a = AbstractC1947c.m8053a(parcel);
            AbstractC1947c.m8059g(parcel, 1, m4920W());
            AbstractC1947c.m8063k(parcel, 2, m4918U(), false);
            AbstractC1947c.m8044E(parcel, 3, m4919V(), false);
            AbstractC1947c.m8054b(parcel, iM8053a);
        }
    }

    /* JADX INFO: renamed from: O2.b$e */
    public static final class e extends AbstractC1945a {
        public static final Parcelable.Creator<e> CREATOR = new C1143z();

        /* JADX INFO: renamed from: a */
        private final boolean f4033a;

        /* JADX INFO: renamed from: O2.b$e$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            private boolean f4034a = false;

            /* JADX INFO: renamed from: a */
            public e m4925a() {
                return new e(this.f4034a);
            }

            /* JADX INFO: renamed from: b */
            public a m4926b(boolean z7) {
                this.f4034a = z7;
                return this;
            }
        }

        e(boolean z7) {
            this.f4033a = z7;
        }

        /* JADX INFO: renamed from: T */
        public static a m4923T() {
            return new a();
        }

        /* JADX INFO: renamed from: U */
        public boolean m4924U() {
            return this.f4033a;
        }

        public boolean equals(Object obj) {
            return (obj instanceof e) && this.f4033a == ((e) obj).f4033a;
        }

        public int hashCode() {
            return AbstractC3714q.m18054c(Boolean.valueOf(this.f4033a));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            int iM8053a = AbstractC1947c.m8053a(parcel);
            AbstractC1947c.m8059g(parcel, 1, m4924U());
            AbstractC1947c.m8054b(parcel, iM8053a);
        }
    }

    C1119b(e eVar, b bVar, String str, boolean z7, int i7, d dVar, c cVar, boolean z8) {
        this.f3991a = (e) AbstractC3718s.m18083l(eVar);
        this.f3992b = (b) AbstractC3718s.m18083l(bVar);
        this.f3993c = str;
        this.f3994d = z7;
        this.f3995e = i7;
        if (dVar == null) {
            d.a aVarM4917T = d.m4917T();
            aVarM4917T.m4922b(false);
            dVar = aVarM4917T.m4921a();
        }
        this.f3996f = dVar;
        if (cVar == null) {
            c.a aVarM4912T = c.m4912T();
            aVarM4912T.m4916b(false);
            cVar = aVarM4912T.m4915a();
        }
        this.f3997r = cVar;
        this.f3998s = z8;
    }

    /* JADX INFO: renamed from: T */
    public static a m4884T() {
        return new a();
    }

    /* JADX INFO: renamed from: a0 */
    public static a m4885a0(C1119b c1119b) {
        AbstractC3718s.m18083l(c1119b);
        a aVarM4884T = m4884T();
        aVarM4884T.m4894c(c1119b.m4886U());
        aVarM4884T.m4897f(c1119b.m4889X());
        aVarM4884T.m4896e(c1119b.m4888W());
        aVarM4884T.m4895d(c1119b.m4887V());
        aVarM4884T.m4893b(c1119b.f3994d);
        aVarM4884T.m4900i(c1119b.f3995e);
        aVarM4884T.m4898g(c1119b.f3998s);
        String str = c1119b.f3993c;
        if (str != null) {
            aVarM4884T.m4899h(str);
        }
        return aVarM4884T;
    }

    /* JADX INFO: renamed from: U */
    public b m4886U() {
        return this.f3992b;
    }

    /* JADX INFO: renamed from: V */
    public c m4887V() {
        return this.f3997r;
    }

    /* JADX INFO: renamed from: W */
    public d m4888W() {
        return this.f3996f;
    }

    /* JADX INFO: renamed from: X */
    public e m4889X() {
        return this.f3991a;
    }

    /* JADX INFO: renamed from: Y */
    public boolean m4890Y() {
        return this.f3998s;
    }

    /* JADX INFO: renamed from: Z */
    public boolean m4891Z() {
        return this.f3994d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1119b)) {
            return false;
        }
        C1119b c1119b = (C1119b) obj;
        return AbstractC3714q.m18053b(this.f3991a, c1119b.f3991a) && AbstractC3714q.m18053b(this.f3992b, c1119b.f3992b) && AbstractC3714q.m18053b(this.f3996f, c1119b.f3996f) && AbstractC3714q.m18053b(this.f3997r, c1119b.f3997r) && AbstractC3714q.m18053b(this.f3993c, c1119b.f3993c) && this.f3994d == c1119b.f3994d && this.f3995e == c1119b.f3995e && this.f3998s == c1119b.f3998s;
    }

    public int hashCode() {
        return AbstractC3714q.m18054c(this.f3991a, this.f3992b, this.f3996f, this.f3997r, this.f3993c, Boolean.valueOf(this.f3994d), Integer.valueOf(this.f3995e), Boolean.valueOf(this.f3998s));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8042C(parcel, 1, m4889X(), i7, false);
        AbstractC1947c.m8042C(parcel, 2, m4886U(), i7, false);
        AbstractC1947c.m8044E(parcel, 3, this.f3993c, false);
        AbstractC1947c.m8059g(parcel, 4, m4891Z());
        AbstractC1947c.m8072t(parcel, 5, this.f3995e);
        AbstractC1947c.m8042C(parcel, 6, m4888W(), i7, false);
        AbstractC1947c.m8042C(parcel, 7, m4887V(), i7, false);
        AbstractC1947c.m8059g(parcel, 8, m4890Y());
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
