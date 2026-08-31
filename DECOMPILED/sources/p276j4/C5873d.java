package p276j4;

/* JADX INFO: renamed from: j4.d */
/* JADX INFO: loaded from: classes.dex */
final class C5873d extends AbstractC5868F.a.AbstractC7695a {

    /* JADX INFO: renamed from: a */
    private final String f23252a;

    /* JADX INFO: renamed from: b */
    private final String f23253b;

    /* JADX INFO: renamed from: c */
    private final String f23254c;

    /* JADX INFO: renamed from: j4.d$b */
    static final class b extends AbstractC5868F.a.AbstractC7695a.AbstractC7696a {

        /* JADX INFO: renamed from: a */
        private String f23255a;

        /* JADX INFO: renamed from: b */
        private String f23256b;

        /* JADX INFO: renamed from: c */
        private String f23257c;

        b() {
        }

        @Override // p276j4.AbstractC5868F.a.AbstractC7695a.AbstractC7696a
        /* JADX INFO: renamed from: a */
        public AbstractC5868F.a.AbstractC7695a mo26339a() {
            String str;
            String str2;
            String str3 = this.f23255a;
            if (str3 != null && (str = this.f23256b) != null && (str2 = this.f23257c) != null) {
                return new C5873d(str3, str, str2);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f23255a == null) {
                sb.append(" arch");
            }
            if (this.f23256b == null) {
                sb.append(" libraryName");
            }
            if (this.f23257c == null) {
                sb.append(" buildId");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // p276j4.AbstractC5868F.a.AbstractC7695a.AbstractC7696a
        /* JADX INFO: renamed from: b */
        public AbstractC5868F.a.AbstractC7695a.AbstractC7696a mo26340b(String str) {
            if (str == null) {
                throw new NullPointerException("Null arch");
            }
            this.f23255a = str;
            return this;
        }

        @Override // p276j4.AbstractC5868F.a.AbstractC7695a.AbstractC7696a
        /* JADX INFO: renamed from: c */
        public AbstractC5868F.a.AbstractC7695a.AbstractC7696a mo26341c(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildId");
            }
            this.f23257c = str;
            return this;
        }

        @Override // p276j4.AbstractC5868F.a.AbstractC7695a.AbstractC7696a
        /* JADX INFO: renamed from: d */
        public AbstractC5868F.a.AbstractC7695a.AbstractC7696a mo26342d(String str) {
            if (str == null) {
                throw new NullPointerException("Null libraryName");
            }
            this.f23256b = str;
            return this;
        }
    }

    @Override // p276j4.AbstractC5868F.a.AbstractC7695a
    /* JADX INFO: renamed from: b */
    public String mo26336b() {
        return this.f23252a;
    }

    @Override // p276j4.AbstractC5868F.a.AbstractC7695a
    /* JADX INFO: renamed from: c */
    public String mo26337c() {
        return this.f23254c;
    }

    @Override // p276j4.AbstractC5868F.a.AbstractC7695a
    /* JADX INFO: renamed from: d */
    public String mo26338d() {
        return this.f23253b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5868F.a.AbstractC7695a) {
            AbstractC5868F.a.AbstractC7695a abstractC7695a = (AbstractC5868F.a.AbstractC7695a) obj;
            if (this.f23252a.equals(abstractC7695a.mo26336b()) && this.f23253b.equals(abstractC7695a.mo26338d()) && this.f23254c.equals(abstractC7695a.mo26337c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f23252a.hashCode() ^ 1000003) * 1000003) ^ this.f23253b.hashCode()) * 1000003) ^ this.f23254c.hashCode();
    }

    public String toString() {
        return "BuildIdMappingForArch{arch=" + this.f23252a + ", libraryName=" + this.f23253b + ", buildId=" + this.f23254c + "}";
    }

    private C5873d(String str, String str2, String str3) {
        this.f23252a = str;
        this.f23253b = str2;
        this.f23254c = str3;
    }
}
