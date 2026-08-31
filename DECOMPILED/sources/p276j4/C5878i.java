package p276j4;

/* JADX INFO: renamed from: j4.i */
/* JADX INFO: loaded from: classes.dex */
final class C5878i extends AbstractC5868F.e.a {

    /* JADX INFO: renamed from: a */
    private final String f23295a;

    /* JADX INFO: renamed from: b */
    private final String f23296b;

    /* JADX INFO: renamed from: c */
    private final String f23297c;

    /* JADX INFO: renamed from: d */
    private final String f23298d;

    /* JADX INFO: renamed from: e */
    private final String f23299e;

    /* JADX INFO: renamed from: f */
    private final String f23300f;

    /* JADX INFO: renamed from: j4.i$b */
    static final class b extends AbstractC5868F.e.a.AbstractC7697a {

        /* JADX INFO: renamed from: a */
        private String f23301a;

        /* JADX INFO: renamed from: b */
        private String f23302b;

        /* JADX INFO: renamed from: c */
        private String f23303c;

        /* JADX INFO: renamed from: d */
        private String f23304d;

        /* JADX INFO: renamed from: e */
        private String f23305e;

        /* JADX INFO: renamed from: f */
        private String f23306f;

        b() {
        }

        @Override // p276j4.AbstractC5868F.e.a.AbstractC7697a
        /* JADX INFO: renamed from: a */
        public AbstractC5868F.e.a mo26410a() {
            String str;
            String str2 = this.f23301a;
            if (str2 != null && (str = this.f23302b) != null) {
                return new C5878i(str2, str, this.f23303c, null, this.f23304d, this.f23305e, this.f23306f);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f23301a == null) {
                sb.append(" identifier");
            }
            if (this.f23302b == null) {
                sb.append(" version");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // p276j4.AbstractC5868F.e.a.AbstractC7697a
        /* JADX INFO: renamed from: b */
        public AbstractC5868F.e.a.AbstractC7697a mo26411b(String str) {
            this.f23305e = str;
            return this;
        }

        @Override // p276j4.AbstractC5868F.e.a.AbstractC7697a
        /* JADX INFO: renamed from: c */
        public AbstractC5868F.e.a.AbstractC7697a mo26412c(String str) {
            this.f23306f = str;
            return this;
        }

        @Override // p276j4.AbstractC5868F.e.a.AbstractC7697a
        /* JADX INFO: renamed from: d */
        public AbstractC5868F.e.a.AbstractC7697a mo26413d(String str) {
            this.f23303c = str;
            return this;
        }

        @Override // p276j4.AbstractC5868F.e.a.AbstractC7697a
        /* JADX INFO: renamed from: e */
        public AbstractC5868F.e.a.AbstractC7697a mo26414e(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.f23301a = str;
            return this;
        }

        @Override // p276j4.AbstractC5868F.e.a.AbstractC7697a
        /* JADX INFO: renamed from: f */
        public AbstractC5868F.e.a.AbstractC7697a mo26415f(String str) {
            this.f23304d = str;
            return this;
        }

        @Override // p276j4.AbstractC5868F.e.a.AbstractC7697a
        /* JADX INFO: renamed from: g */
        public AbstractC5868F.e.a.AbstractC7697a mo26416g(String str) {
            if (str == null) {
                throw new NullPointerException("Null version");
            }
            this.f23302b = str;
            return this;
        }
    }

    @Override // p276j4.AbstractC5868F.e.a
    /* JADX INFO: renamed from: b */
    public String mo26403b() {
        return this.f23299e;
    }

    @Override // p276j4.AbstractC5868F.e.a
    /* JADX INFO: renamed from: c */
    public String mo26404c() {
        return this.f23300f;
    }

    @Override // p276j4.AbstractC5868F.e.a
    /* JADX INFO: renamed from: d */
    public String mo26405d() {
        return this.f23297c;
    }

    @Override // p276j4.AbstractC5868F.e.a
    /* JADX INFO: renamed from: e */
    public String mo26406e() {
        return this.f23295a;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5868F.e.a) {
            AbstractC5868F.e.a aVar = (AbstractC5868F.e.a) obj;
            if (this.f23295a.equals(aVar.mo26406e()) && this.f23296b.equals(aVar.mo26409h()) && ((str = this.f23297c) != null ? str.equals(aVar.mo26405d()) : aVar.mo26405d() == null)) {
                aVar.mo26408g();
                String str2 = this.f23298d;
                if (str2 != null ? str2.equals(aVar.mo26407f()) : aVar.mo26407f() == null) {
                    String str3 = this.f23299e;
                    if (str3 != null ? str3.equals(aVar.mo26403b()) : aVar.mo26403b() == null) {
                        String str4 = this.f23300f;
                        if (str4 != null ? str4.equals(aVar.mo26404c()) : aVar.mo26404c() == null) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // p276j4.AbstractC5868F.e.a
    /* JADX INFO: renamed from: f */
    public String mo26407f() {
        return this.f23298d;
    }

    @Override // p276j4.AbstractC5868F.e.a
    /* JADX INFO: renamed from: g */
    public AbstractC5868F.e.a.b mo26408g() {
        return null;
    }

    @Override // p276j4.AbstractC5868F.e.a
    /* JADX INFO: renamed from: h */
    public String mo26409h() {
        return this.f23296b;
    }

    public int hashCode() {
        int iHashCode = (((this.f23295a.hashCode() ^ 1000003) * 1000003) ^ this.f23296b.hashCode()) * 1000003;
        String str = this.f23297c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * (-721379959);
        String str2 = this.f23298d;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f23299e;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f23300f;
        return iHashCode4 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "Application{identifier=" + this.f23295a + ", version=" + this.f23296b + ", displayVersion=" + this.f23297c + ", organization=" + ((Object) null) + ", installationUuid=" + this.f23298d + ", developmentPlatform=" + this.f23299e + ", developmentPlatformVersion=" + this.f23300f + "}";
    }

    private C5878i(String str, String str2, String str3, AbstractC5868F.e.a.b bVar, String str4, String str5, String str6) {
        this.f23295a = str;
        this.f23296b = str2;
        this.f23297c = str3;
        this.f23298d = str4;
        this.f23299e = str5;
        this.f23300f = str6;
    }
}
