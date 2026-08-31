package p216c2;

import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: c2.b */
/* JADX INFO: loaded from: classes.dex */
final class C2986b extends AbstractC2993i {

    /* JADX INFO: renamed from: a */
    private final String f12356a;

    /* JADX INFO: renamed from: b */
    private final Integer f12357b;

    /* JADX INFO: renamed from: c */
    private final C2992h f12358c;

    /* JADX INFO: renamed from: d */
    private final long f12359d;

    /* JADX INFO: renamed from: e */
    private final long f12360e;

    /* JADX INFO: renamed from: f */
    private final Map f12361f;

    /* JADX INFO: renamed from: g */
    private final Integer f12362g;

    /* JADX INFO: renamed from: h */
    private final String f12363h;

    /* JADX INFO: renamed from: i */
    private final byte[] f12364i;

    /* JADX INFO: renamed from: j */
    private final byte[] f12365j;

    /* JADX INFO: renamed from: c2.b$b */
    static final class b extends AbstractC2993i.a {

        /* JADX INFO: renamed from: a */
        private String f12366a;

        /* JADX INFO: renamed from: b */
        private Integer f12367b;

        /* JADX INFO: renamed from: c */
        private C2992h f12368c;

        /* JADX INFO: renamed from: d */
        private Long f12369d;

        /* JADX INFO: renamed from: e */
        private Long f12370e;

        /* JADX INFO: renamed from: f */
        private Map f12371f;

        /* JADX INFO: renamed from: g */
        private Integer f12372g;

        /* JADX INFO: renamed from: h */
        private String f12373h;

        /* JADX INFO: renamed from: i */
        private byte[] f12374i;

        /* JADX INFO: renamed from: j */
        private byte[] f12375j;

        b() {
        }

        @Override // p216c2.AbstractC2993i.a
        /* JADX INFO: renamed from: d */
        public AbstractC2993i mo14906d() {
            String str = "";
            if (this.f12366a == null) {
                str = " transportName";
            }
            if (this.f12368c == null) {
                str = str + " encodedPayload";
            }
            if (this.f12369d == null) {
                str = str + " eventMillis";
            }
            if (this.f12370e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f12371f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new C2986b(this.f12366a, this.f12367b, this.f12368c, this.f12369d.longValue(), this.f12370e.longValue(), this.f12371f, this.f12372g, this.f12373h, this.f12374i, this.f12375j);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p216c2.AbstractC2993i.a
        /* JADX INFO: renamed from: e */
        protected Map mo14907e() {
            Map map = this.f12371f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // p216c2.AbstractC2993i.a
        /* JADX INFO: renamed from: f */
        protected AbstractC2993i.a mo14908f(Map map) {
            if (map == null) {
                throw new NullPointerException("Null autoMetadata");
            }
            this.f12371f = map;
            return this;
        }

        @Override // p216c2.AbstractC2993i.a
        /* JADX INFO: renamed from: g */
        public AbstractC2993i.a mo14909g(Integer num) {
            this.f12367b = num;
            return this;
        }

        @Override // p216c2.AbstractC2993i.a
        /* JADX INFO: renamed from: h */
        public AbstractC2993i.a mo14910h(C2992h c2992h) {
            if (c2992h == null) {
                throw new NullPointerException("Null encodedPayload");
            }
            this.f12368c = c2992h;
            return this;
        }

        @Override // p216c2.AbstractC2993i.a
        /* JADX INFO: renamed from: i */
        public AbstractC2993i.a mo14911i(long j7) {
            this.f12369d = Long.valueOf(j7);
            return this;
        }

        @Override // p216c2.AbstractC2993i.a
        /* JADX INFO: renamed from: j */
        public AbstractC2993i.a mo14912j(byte[] bArr) {
            this.f12374i = bArr;
            return this;
        }

        @Override // p216c2.AbstractC2993i.a
        /* JADX INFO: renamed from: k */
        public AbstractC2993i.a mo14913k(byte[] bArr) {
            this.f12375j = bArr;
            return this;
        }

        @Override // p216c2.AbstractC2993i.a
        /* JADX INFO: renamed from: l */
        public AbstractC2993i.a mo14914l(Integer num) {
            this.f12372g = num;
            return this;
        }

        @Override // p216c2.AbstractC2993i.a
        /* JADX INFO: renamed from: m */
        public AbstractC2993i.a mo14915m(String str) {
            this.f12373h = str;
            return this;
        }

        @Override // p216c2.AbstractC2993i.a
        /* JADX INFO: renamed from: n */
        public AbstractC2993i.a mo14916n(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f12366a = str;
            return this;
        }

        @Override // p216c2.AbstractC2993i.a
        /* JADX INFO: renamed from: o */
        public AbstractC2993i.a mo14917o(long j7) {
            this.f12370e = Long.valueOf(j7);
            return this;
        }
    }

    @Override // p216c2.AbstractC2993i
    /* JADX INFO: renamed from: c */
    protected Map mo14896c() {
        return this.f12361f;
    }

    @Override // p216c2.AbstractC2993i
    /* JADX INFO: renamed from: d */
    public Integer mo14897d() {
        return this.f12357b;
    }

    @Override // p216c2.AbstractC2993i
    /* JADX INFO: renamed from: e */
    public C2992h mo14898e() {
        return this.f12358c;
    }

    public boolean equals(Object obj) {
        Integer num;
        Integer num2;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2993i) {
            AbstractC2993i abstractC2993i = (AbstractC2993i) obj;
            if (this.f12356a.equals(abstractC2993i.mo14904n()) && ((num = this.f12357b) != null ? num.equals(abstractC2993i.mo14897d()) : abstractC2993i.mo14897d() == null) && this.f12358c.equals(abstractC2993i.mo14898e()) && this.f12359d == abstractC2993i.mo14899f() && this.f12360e == abstractC2993i.mo14905o() && this.f12361f.equals(abstractC2993i.mo14896c()) && ((num2 = this.f12362g) != null ? num2.equals(abstractC2993i.mo14902l()) : abstractC2993i.mo14902l() == null) && ((str = this.f12363h) != null ? str.equals(abstractC2993i.mo14903m()) : abstractC2993i.mo14903m() == null)) {
                boolean z7 = abstractC2993i instanceof C2986b;
                if (Arrays.equals(this.f12364i, z7 ? ((C2986b) abstractC2993i).f12364i : abstractC2993i.mo14900g())) {
                    if (Arrays.equals(this.f12365j, z7 ? ((C2986b) abstractC2993i).f12365j : abstractC2993i.mo14901h())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // p216c2.AbstractC2993i
    /* JADX INFO: renamed from: f */
    public long mo14899f() {
        return this.f12359d;
    }

    @Override // p216c2.AbstractC2993i
    /* JADX INFO: renamed from: g */
    public byte[] mo14900g() {
        return this.f12364i;
    }

    @Override // p216c2.AbstractC2993i
    /* JADX INFO: renamed from: h */
    public byte[] mo14901h() {
        return this.f12365j;
    }

    public int hashCode() {
        int iHashCode = (this.f12356a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f12357b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f12358c.hashCode()) * 1000003;
        long j7 = this.f12359d;
        int i7 = (iHashCode2 ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003;
        long j8 = this.f12360e;
        int iHashCode3 = (((i7 ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003) ^ this.f12361f.hashCode()) * 1000003;
        Integer num2 = this.f12362g;
        int iHashCode4 = (iHashCode3 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        String str = this.f12363h;
        return ((((iHashCode4 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ Arrays.hashCode(this.f12364i)) * 1000003) ^ Arrays.hashCode(this.f12365j);
    }

    @Override // p216c2.AbstractC2993i
    /* JADX INFO: renamed from: l */
    public Integer mo14902l() {
        return this.f12362g;
    }

    @Override // p216c2.AbstractC2993i
    /* JADX INFO: renamed from: m */
    public String mo14903m() {
        return this.f12363h;
    }

    @Override // p216c2.AbstractC2993i
    /* JADX INFO: renamed from: n */
    public String mo14904n() {
        return this.f12356a;
    }

    @Override // p216c2.AbstractC2993i
    /* JADX INFO: renamed from: o */
    public long mo14905o() {
        return this.f12360e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f12356a + ", code=" + this.f12357b + ", encodedPayload=" + this.f12358c + ", eventMillis=" + this.f12359d + ", uptimeMillis=" + this.f12360e + ", autoMetadata=" + this.f12361f + ", productId=" + this.f12362g + ", pseudonymousId=" + this.f12363h + ", experimentIdsClear=" + Arrays.toString(this.f12364i) + ", experimentIdsEncrypted=" + Arrays.toString(this.f12365j) + "}";
    }

    private C2986b(String str, Integer num, C2992h c2992h, long j7, long j8, Map map, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.f12356a = str;
        this.f12357b = num;
        this.f12358c = c2992h;
        this.f12359d = j7;
        this.f12360e = j8;
        this.f12361f = map;
        this.f12362g = num2;
        this.f12363h = str2;
        this.f12364i = bArr;
        this.f12365j = bArr2;
    }
}
