package p229d5;

/* JADX INFO: renamed from: d5.a */
/* JADX INFO: loaded from: classes.dex */
final class C5241a extends AbstractC5244d {

    /* JADX INFO: renamed from: b */
    private final String f19972b;

    /* JADX INFO: renamed from: c */
    private final C5243c.a f19973c;

    /* JADX INFO: renamed from: d */
    private final String f19974d;

    /* JADX INFO: renamed from: e */
    private final String f19975e;

    /* JADX INFO: renamed from: f */
    private final long f19976f;

    /* JADX INFO: renamed from: g */
    private final long f19977g;

    /* JADX INFO: renamed from: h */
    private final String f19978h;

    /* JADX INFO: renamed from: d5.a$b */
    static final class b extends AbstractC5244d.a {

        /* JADX INFO: renamed from: a */
        private String f19979a;

        /* JADX INFO: renamed from: b */
        private C5243c.a f19980b;

        /* JADX INFO: renamed from: c */
        private String f19981c;

        /* JADX INFO: renamed from: d */
        private String f19982d;

        /* JADX INFO: renamed from: e */
        private Long f19983e;

        /* JADX INFO: renamed from: f */
        private Long f19984f;

        /* JADX INFO: renamed from: g */
        private String f19985g;

        @Override // p229d5.AbstractC5244d.a
        /* JADX INFO: renamed from: a */
        public AbstractC5244d mo24207a() {
            String str = "";
            if (this.f19980b == null) {
                str = " registrationStatus";
            }
            if (this.f19983e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f19984f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new C5241a(this.f19979a, this.f19980b, this.f19981c, this.f19982d, this.f19983e.longValue(), this.f19984f.longValue(), this.f19985g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p229d5.AbstractC5244d.a
        /* JADX INFO: renamed from: b */
        public AbstractC5244d.a mo24208b(String str) {
            this.f19981c = str;
            return this;
        }

        @Override // p229d5.AbstractC5244d.a
        /* JADX INFO: renamed from: c */
        public AbstractC5244d.a mo24209c(long j7) {
            this.f19983e = Long.valueOf(j7);
            return this;
        }

        @Override // p229d5.AbstractC5244d.a
        /* JADX INFO: renamed from: d */
        public AbstractC5244d.a mo24210d(String str) {
            this.f19979a = str;
            return this;
        }

        @Override // p229d5.AbstractC5244d.a
        /* JADX INFO: renamed from: e */
        public AbstractC5244d.a mo24211e(String str) {
            this.f19985g = str;
            return this;
        }

        @Override // p229d5.AbstractC5244d.a
        /* JADX INFO: renamed from: f */
        public AbstractC5244d.a mo24212f(String str) {
            this.f19982d = str;
            return this;
        }

        @Override // p229d5.AbstractC5244d.a
        /* JADX INFO: renamed from: g */
        public AbstractC5244d.a mo24213g(C5243c.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null registrationStatus");
            }
            this.f19980b = aVar;
            return this;
        }

        @Override // p229d5.AbstractC5244d.a
        /* JADX INFO: renamed from: h */
        public AbstractC5244d.a mo24214h(long j7) {
            this.f19984f = Long.valueOf(j7);
            return this;
        }

        b() {
        }

        private b(AbstractC5244d abstractC5244d) {
            this.f19979a = abstractC5244d.mo24201d();
            this.f19980b = abstractC5244d.mo24204g();
            this.f19981c = abstractC5244d.mo24199b();
            this.f19982d = abstractC5244d.mo24203f();
            this.f19983e = Long.valueOf(abstractC5244d.mo24200c());
            this.f19984f = Long.valueOf(abstractC5244d.mo24205h());
            this.f19985g = abstractC5244d.mo24202e();
        }
    }

    @Override // p229d5.AbstractC5244d
    /* JADX INFO: renamed from: b */
    public String mo24199b() {
        return this.f19974d;
    }

    @Override // p229d5.AbstractC5244d
    /* JADX INFO: renamed from: c */
    public long mo24200c() {
        return this.f19976f;
    }

    @Override // p229d5.AbstractC5244d
    /* JADX INFO: renamed from: d */
    public String mo24201d() {
        return this.f19972b;
    }

    @Override // p229d5.AbstractC5244d
    /* JADX INFO: renamed from: e */
    public String mo24202e() {
        return this.f19978h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5244d) {
            AbstractC5244d abstractC5244d = (AbstractC5244d) obj;
            String str4 = this.f19972b;
            if (str4 != null ? str4.equals(abstractC5244d.mo24201d()) : abstractC5244d.mo24201d() == null) {
                if (this.f19973c.equals(abstractC5244d.mo24204g()) && ((str = this.f19974d) != null ? str.equals(abstractC5244d.mo24199b()) : abstractC5244d.mo24199b() == null) && ((str2 = this.f19975e) != null ? str2.equals(abstractC5244d.mo24203f()) : abstractC5244d.mo24203f() == null) && this.f19976f == abstractC5244d.mo24200c() && this.f19977g == abstractC5244d.mo24205h() && ((str3 = this.f19978h) != null ? str3.equals(abstractC5244d.mo24202e()) : abstractC5244d.mo24202e() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p229d5.AbstractC5244d
    /* JADX INFO: renamed from: f */
    public String mo24203f() {
        return this.f19975e;
    }

    @Override // p229d5.AbstractC5244d
    /* JADX INFO: renamed from: g */
    public C5243c.a mo24204g() {
        return this.f19973c;
    }

    @Override // p229d5.AbstractC5244d
    /* JADX INFO: renamed from: h */
    public long mo24205h() {
        return this.f19977g;
    }

    public int hashCode() {
        String str = this.f19972b;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f19973c.hashCode()) * 1000003;
        String str2 = this.f19974d;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f19975e;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j7 = this.f19976f;
        int i7 = (iHashCode3 ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003;
        long j8 = this.f19977g;
        int i8 = (i7 ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        String str4 = this.f19978h;
        return i8 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // p229d5.AbstractC5244d
    /* JADX INFO: renamed from: n */
    public AbstractC5244d.a mo24206n() {
        return new b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f19972b + ", registrationStatus=" + this.f19973c + ", authToken=" + this.f19974d + ", refreshToken=" + this.f19975e + ", expiresInSecs=" + this.f19976f + ", tokenCreationEpochInSecs=" + this.f19977g + ", fisError=" + this.f19978h + "}";
    }

    private C5241a(String str, C5243c.a aVar, String str2, String str3, long j7, long j8, String str4) {
        this.f19972b = str;
        this.f19973c = aVar;
        this.f19974d = str2;
        this.f19975e = str3;
        this.f19976f = j7;
        this.f19977g = j8;
        this.f19978h = str4;
    }
}
