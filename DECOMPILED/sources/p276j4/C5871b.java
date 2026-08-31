package p276j4;

/* JADX INFO: renamed from: j4.b */
/* JADX INFO: loaded from: classes.dex */
final class C5871b extends AbstractC5868F {

    /* JADX INFO: renamed from: b */
    private final String f23208b;

    /* JADX INFO: renamed from: c */
    private final String f23209c;

    /* JADX INFO: renamed from: d */
    private final int f23210d;

    /* JADX INFO: renamed from: e */
    private final String f23211e;

    /* JADX INFO: renamed from: f */
    private final String f23212f;

    /* JADX INFO: renamed from: g */
    private final String f23213g;

    /* JADX INFO: renamed from: h */
    private final String f23214h;

    /* JADX INFO: renamed from: i */
    private final String f23215i;

    /* JADX INFO: renamed from: j */
    private final String f23216j;

    /* JADX INFO: renamed from: k */
    private final AbstractC5868F.e f23217k;

    /* JADX INFO: renamed from: l */
    private final AbstractC5868F.d f23218l;

    /* JADX INFO: renamed from: m */
    private final AbstractC5868F.a f23219m;

    /* JADX INFO: renamed from: j4.b$b */
    static final class b extends AbstractC5868F.b {

        /* JADX INFO: renamed from: a */
        private String f23220a;

        /* JADX INFO: renamed from: b */
        private String f23221b;

        /* JADX INFO: renamed from: c */
        private int f23222c;

        /* JADX INFO: renamed from: d */
        private String f23223d;

        /* JADX INFO: renamed from: e */
        private String f23224e;

        /* JADX INFO: renamed from: f */
        private String f23225f;

        /* JADX INFO: renamed from: g */
        private String f23226g;

        /* JADX INFO: renamed from: h */
        private String f23227h;

        /* JADX INFO: renamed from: i */
        private String f23228i;

        /* JADX INFO: renamed from: j */
        private AbstractC5868F.e f23229j;

        /* JADX INFO: renamed from: k */
        private AbstractC5868F.d f23230k;

        /* JADX INFO: renamed from: l */
        private AbstractC5868F.a f23231l;

        /* JADX INFO: renamed from: m */
        private byte f23232m;

        @Override // p276j4.AbstractC5868F.b
        /* JADX INFO: renamed from: a */
        public AbstractC5868F mo26353a() {
            if (this.f23232m == 1 && this.f23220a != null && this.f23221b != null && this.f23223d != null && this.f23227h != null && this.f23228i != null) {
                return new C5871b(this.f23220a, this.f23221b, this.f23222c, this.f23223d, this.f23224e, this.f23225f, this.f23226g, this.f23227h, this.f23228i, this.f23229j, this.f23230k, this.f23231l);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f23220a == null) {
                sb.append(" sdkVersion");
            }
            if (this.f23221b == null) {
                sb.append(" gmpAppId");
            }
            if ((1 & this.f23232m) == 0) {
                sb.append(" platform");
            }
            if (this.f23223d == null) {
                sb.append(" installationUuid");
            }
            if (this.f23227h == null) {
                sb.append(" buildVersion");
            }
            if (this.f23228i == null) {
                sb.append(" displayVersion");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // p276j4.AbstractC5868F.b
        /* JADX INFO: renamed from: b */
        public AbstractC5868F.b mo26354b(AbstractC5868F.a aVar) {
            this.f23231l = aVar;
            return this;
        }

        @Override // p276j4.AbstractC5868F.b
        /* JADX INFO: renamed from: c */
        public AbstractC5868F.b mo26355c(String str) {
            this.f23226g = str;
            return this;
        }

        @Override // p276j4.AbstractC5868F.b
        /* JADX INFO: renamed from: d */
        public AbstractC5868F.b mo26356d(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildVersion");
            }
            this.f23227h = str;
            return this;
        }

        @Override // p276j4.AbstractC5868F.b
        /* JADX INFO: renamed from: e */
        public AbstractC5868F.b mo26357e(String str) {
            if (str == null) {
                throw new NullPointerException("Null displayVersion");
            }
            this.f23228i = str;
            return this;
        }

        @Override // p276j4.AbstractC5868F.b
        /* JADX INFO: renamed from: f */
        public AbstractC5868F.b mo26358f(String str) {
            this.f23225f = str;
            return this;
        }

        @Override // p276j4.AbstractC5868F.b
        /* JADX INFO: renamed from: g */
        public AbstractC5868F.b mo26359g(String str) {
            this.f23224e = str;
            return this;
        }

        @Override // p276j4.AbstractC5868F.b
        /* JADX INFO: renamed from: h */
        public AbstractC5868F.b mo26360h(String str) {
            if (str == null) {
                throw new NullPointerException("Null gmpAppId");
            }
            this.f23221b = str;
            return this;
        }

        @Override // p276j4.AbstractC5868F.b
        /* JADX INFO: renamed from: i */
        public AbstractC5868F.b mo26361i(String str) {
            if (str == null) {
                throw new NullPointerException("Null installationUuid");
            }
            this.f23223d = str;
            return this;
        }

        @Override // p276j4.AbstractC5868F.b
        /* JADX INFO: renamed from: j */
        public AbstractC5868F.b mo26362j(AbstractC5868F.d dVar) {
            this.f23230k = dVar;
            return this;
        }

        @Override // p276j4.AbstractC5868F.b
        /* JADX INFO: renamed from: k */
        public AbstractC5868F.b mo26363k(int i7) {
            this.f23222c = i7;
            this.f23232m = (byte) (this.f23232m | 1);
            return this;
        }

        @Override // p276j4.AbstractC5868F.b
        /* JADX INFO: renamed from: l */
        public AbstractC5868F.b mo26364l(String str) {
            if (str == null) {
                throw new NullPointerException("Null sdkVersion");
            }
            this.f23220a = str;
            return this;
        }

        @Override // p276j4.AbstractC5868F.b
        /* JADX INFO: renamed from: m */
        public AbstractC5868F.b mo26365m(AbstractC5868F.e eVar) {
            this.f23229j = eVar;
            return this;
        }

        b() {
        }

        private b(AbstractC5868F abstractC5868F) {
            this.f23220a = abstractC5868F.mo26315m();
            this.f23221b = abstractC5868F.mo26311i();
            this.f23222c = abstractC5868F.mo26314l();
            this.f23223d = abstractC5868F.mo26312j();
            this.f23224e = abstractC5868F.mo26310h();
            this.f23225f = abstractC5868F.mo26309g();
            this.f23226g = abstractC5868F.mo26306d();
            this.f23227h = abstractC5868F.mo26307e();
            this.f23228i = abstractC5868F.mo26308f();
            this.f23229j = abstractC5868F.mo26316n();
            this.f23230k = abstractC5868F.mo26313k();
            this.f23231l = abstractC5868F.mo26305c();
            this.f23232m = (byte) 1;
        }
    }

    @Override // p276j4.AbstractC5868F
    /* JADX INFO: renamed from: c */
    public AbstractC5868F.a mo26305c() {
        return this.f23219m;
    }

    @Override // p276j4.AbstractC5868F
    /* JADX INFO: renamed from: d */
    public String mo26306d() {
        return this.f23214h;
    }

    @Override // p276j4.AbstractC5868F
    /* JADX INFO: renamed from: e */
    public String mo26307e() {
        return this.f23215i;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        AbstractC5868F.e eVar;
        AbstractC5868F.d dVar;
        AbstractC5868F.a aVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5868F) {
            AbstractC5868F abstractC5868F = (AbstractC5868F) obj;
            if (this.f23208b.equals(abstractC5868F.mo26315m()) && this.f23209c.equals(abstractC5868F.mo26311i()) && this.f23210d == abstractC5868F.mo26314l() && this.f23211e.equals(abstractC5868F.mo26312j()) && ((str = this.f23212f) != null ? str.equals(abstractC5868F.mo26310h()) : abstractC5868F.mo26310h() == null) && ((str2 = this.f23213g) != null ? str2.equals(abstractC5868F.mo26309g()) : abstractC5868F.mo26309g() == null) && ((str3 = this.f23214h) != null ? str3.equals(abstractC5868F.mo26306d()) : abstractC5868F.mo26306d() == null) && this.f23215i.equals(abstractC5868F.mo26307e()) && this.f23216j.equals(abstractC5868F.mo26308f()) && ((eVar = this.f23217k) != null ? eVar.equals(abstractC5868F.mo26316n()) : abstractC5868F.mo26316n() == null) && ((dVar = this.f23218l) != null ? dVar.equals(abstractC5868F.mo26313k()) : abstractC5868F.mo26313k() == null) && ((aVar = this.f23219m) != null ? aVar.equals(abstractC5868F.mo26305c()) : abstractC5868F.mo26305c() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // p276j4.AbstractC5868F
    /* JADX INFO: renamed from: f */
    public String mo26308f() {
        return this.f23216j;
    }

    @Override // p276j4.AbstractC5868F
    /* JADX INFO: renamed from: g */
    public String mo26309g() {
        return this.f23213g;
    }

    @Override // p276j4.AbstractC5868F
    /* JADX INFO: renamed from: h */
    public String mo26310h() {
        return this.f23212f;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f23208b.hashCode() ^ 1000003) * 1000003) ^ this.f23209c.hashCode()) * 1000003) ^ this.f23210d) * 1000003) ^ this.f23211e.hashCode()) * 1000003;
        String str = this.f23212f;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f23213g;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f23214h;
        int iHashCode4 = (((((iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.f23215i.hashCode()) * 1000003) ^ this.f23216j.hashCode()) * 1000003;
        AbstractC5868F.e eVar = this.f23217k;
        int iHashCode5 = (iHashCode4 ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        AbstractC5868F.d dVar = this.f23218l;
        int iHashCode6 = (iHashCode5 ^ (dVar == null ? 0 : dVar.hashCode())) * 1000003;
        AbstractC5868F.a aVar = this.f23219m;
        return iHashCode6 ^ (aVar != null ? aVar.hashCode() : 0);
    }

    @Override // p276j4.AbstractC5868F
    /* JADX INFO: renamed from: i */
    public String mo26311i() {
        return this.f23209c;
    }

    @Override // p276j4.AbstractC5868F
    /* JADX INFO: renamed from: j */
    public String mo26312j() {
        return this.f23211e;
    }

    @Override // p276j4.AbstractC5868F
    /* JADX INFO: renamed from: k */
    public AbstractC5868F.d mo26313k() {
        return this.f23218l;
    }

    @Override // p276j4.AbstractC5868F
    /* JADX INFO: renamed from: l */
    public int mo26314l() {
        return this.f23210d;
    }

    @Override // p276j4.AbstractC5868F
    /* JADX INFO: renamed from: m */
    public String mo26315m() {
        return this.f23208b;
    }

    @Override // p276j4.AbstractC5868F
    /* JADX INFO: renamed from: n */
    public AbstractC5868F.e mo26316n() {
        return this.f23217k;
    }

    @Override // p276j4.AbstractC5868F
    /* JADX INFO: renamed from: o */
    protected AbstractC5868F.b mo26317o() {
        return new b(this);
    }

    public String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f23208b + ", gmpAppId=" + this.f23209c + ", platform=" + this.f23210d + ", installationUuid=" + this.f23211e + ", firebaseInstallationId=" + this.f23212f + ", firebaseAuthenticationToken=" + this.f23213g + ", appQualitySessionId=" + this.f23214h + ", buildVersion=" + this.f23215i + ", displayVersion=" + this.f23216j + ", session=" + this.f23217k + ", ndkPayload=" + this.f23218l + ", appExitInfo=" + this.f23219m + "}";
    }

    private C5871b(String str, String str2, int i7, String str3, String str4, String str5, String str6, String str7, String str8, AbstractC5868F.e eVar, AbstractC5868F.d dVar, AbstractC5868F.a aVar) {
        this.f23208b = str;
        this.f23209c = str2;
        this.f23210d = i7;
        this.f23211e = str3;
        this.f23212f = str4;
        this.f23213g = str5;
        this.f23214h = str6;
        this.f23215i = str7;
        this.f23216j = str8;
        this.f23217k = eVar;
        this.f23218l = dVar;
        this.f23219m = aVar;
    }
}
