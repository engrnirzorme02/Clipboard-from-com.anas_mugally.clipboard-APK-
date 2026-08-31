package p237e5;

/* JADX INFO: renamed from: e5.a */
/* JADX INFO: loaded from: classes.dex */
final class C5350a extends AbstractC5353d {

    /* JADX INFO: renamed from: a */
    private final String f20456a;

    /* JADX INFO: renamed from: b */
    private final String f20457b;

    /* JADX INFO: renamed from: c */
    private final String f20458c;

    /* JADX INFO: renamed from: d */
    private final AbstractC5355f f20459d;

    /* JADX INFO: renamed from: e */
    private final AbstractC5353d.b f20460e;

    /* JADX INFO: renamed from: e5.a$b */
    static final class b extends AbstractC5353d.a {

        /* JADX INFO: renamed from: a */
        private String f20461a;

        /* JADX INFO: renamed from: b */
        private String f20462b;

        /* JADX INFO: renamed from: c */
        private String f20463c;

        /* JADX INFO: renamed from: d */
        private AbstractC5355f f20464d;

        /* JADX INFO: renamed from: e */
        private AbstractC5353d.b f20465e;

        b() {
        }

        @Override // p237e5.AbstractC5353d.a
        /* JADX INFO: renamed from: a */
        public AbstractC5353d mo24342a() {
            return new C5350a(this.f20461a, this.f20462b, this.f20463c, this.f20464d, this.f20465e);
        }

        @Override // p237e5.AbstractC5353d.a
        /* JADX INFO: renamed from: b */
        public AbstractC5353d.a mo24343b(AbstractC5355f abstractC5355f) {
            this.f20464d = abstractC5355f;
            return this;
        }

        @Override // p237e5.AbstractC5353d.a
        /* JADX INFO: renamed from: c */
        public AbstractC5353d.a mo24344c(String str) {
            this.f20462b = str;
            return this;
        }

        @Override // p237e5.AbstractC5353d.a
        /* JADX INFO: renamed from: d */
        public AbstractC5353d.a mo24345d(String str) {
            this.f20463c = str;
            return this;
        }

        @Override // p237e5.AbstractC5353d.a
        /* JADX INFO: renamed from: e */
        public AbstractC5353d.a mo24346e(AbstractC5353d.b bVar) {
            this.f20465e = bVar;
            return this;
        }

        @Override // p237e5.AbstractC5353d.a
        /* JADX INFO: renamed from: f */
        public AbstractC5353d.a mo24347f(String str) {
            this.f20461a = str;
            return this;
        }
    }

    @Override // p237e5.AbstractC5353d
    /* JADX INFO: renamed from: b */
    public AbstractC5355f mo24337b() {
        return this.f20459d;
    }

    @Override // p237e5.AbstractC5353d
    /* JADX INFO: renamed from: c */
    public String mo24338c() {
        return this.f20457b;
    }

    @Override // p237e5.AbstractC5353d
    /* JADX INFO: renamed from: d */
    public String mo24339d() {
        return this.f20458c;
    }

    @Override // p237e5.AbstractC5353d
    /* JADX INFO: renamed from: e */
    public AbstractC5353d.b mo24340e() {
        return this.f20460e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5353d) {
            AbstractC5353d abstractC5353d = (AbstractC5353d) obj;
            String str = this.f20456a;
            if (str != null ? str.equals(abstractC5353d.mo24341f()) : abstractC5353d.mo24341f() == null) {
                String str2 = this.f20457b;
                if (str2 != null ? str2.equals(abstractC5353d.mo24338c()) : abstractC5353d.mo24338c() == null) {
                    String str3 = this.f20458c;
                    if (str3 != null ? str3.equals(abstractC5353d.mo24339d()) : abstractC5353d.mo24339d() == null) {
                        AbstractC5355f abstractC5355f = this.f20459d;
                        if (abstractC5355f != null ? abstractC5355f.equals(abstractC5353d.mo24337b()) : abstractC5353d.mo24337b() == null) {
                            AbstractC5353d.b bVar = this.f20460e;
                            if (bVar != null ? bVar.equals(abstractC5353d.mo24340e()) : abstractC5353d.mo24340e() == null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // p237e5.AbstractC5353d
    /* JADX INFO: renamed from: f */
    public String mo24341f() {
        return this.f20456a;
    }

    public int hashCode() {
        String str = this.f20456a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f20457b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f20458c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        AbstractC5355f abstractC5355f = this.f20459d;
        int iHashCode4 = (iHashCode3 ^ (abstractC5355f == null ? 0 : abstractC5355f.hashCode())) * 1000003;
        AbstractC5353d.b bVar = this.f20460e;
        return iHashCode4 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f20456a + ", fid=" + this.f20457b + ", refreshToken=" + this.f20458c + ", authToken=" + this.f20459d + ", responseCode=" + this.f20460e + "}";
    }

    private C5350a(String str, String str2, String str3, AbstractC5355f abstractC5355f, AbstractC5353d.b bVar) {
        this.f20456a = str;
        this.f20457b = str2;
        this.f20458c = str3;
        this.f20459d = abstractC5355f;
        this.f20460e = bVar;
    }
}
