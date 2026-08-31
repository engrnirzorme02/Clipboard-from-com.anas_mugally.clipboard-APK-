package p276j4;

/* JADX INFO: renamed from: j4.z */
/* JADX INFO: loaded from: classes.dex */
final class C5895z extends AbstractC5868F.e.AbstractC7712e {

    /* JADX INFO: renamed from: a */
    private final int f23448a;

    /* JADX INFO: renamed from: b */
    private final String f23449b;

    /* JADX INFO: renamed from: c */
    private final String f23450c;

    /* JADX INFO: renamed from: d */
    private final boolean f23451d;

    /* JADX INFO: renamed from: j4.z$b */
    static final class b extends AbstractC5868F.e.AbstractC7712e.a {

        /* JADX INFO: renamed from: a */
        private int f23452a;

        /* JADX INFO: renamed from: b */
        private String f23453b;

        /* JADX INFO: renamed from: c */
        private String f23454c;

        /* JADX INFO: renamed from: d */
        private boolean f23455d;

        /* JADX INFO: renamed from: e */
        private byte f23456e;

        b() {
        }

        @Override // p276j4.AbstractC5868F.e.AbstractC7712e.a
        /* JADX INFO: renamed from: a */
        public AbstractC5868F.e.AbstractC7712e mo26600a() {
            String str;
            String str2;
            if (this.f23456e == 3 && (str = this.f23453b) != null && (str2 = this.f23454c) != null) {
                return new C5895z(this.f23452a, str, str2, this.f23455d);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f23456e & 1) == 0) {
                sb.append(" platform");
            }
            if (this.f23453b == null) {
                sb.append(" version");
            }
            if (this.f23454c == null) {
                sb.append(" buildVersion");
            }
            if ((this.f23456e & 2) == 0) {
                sb.append(" jailbroken");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // p276j4.AbstractC5868F.e.AbstractC7712e.a
        /* JADX INFO: renamed from: b */
        public AbstractC5868F.e.AbstractC7712e.a mo26601b(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildVersion");
            }
            this.f23454c = str;
            return this;
        }

        @Override // p276j4.AbstractC5868F.e.AbstractC7712e.a
        /* JADX INFO: renamed from: c */
        public AbstractC5868F.e.AbstractC7712e.a mo26602c(boolean z7) {
            this.f23455d = z7;
            this.f23456e = (byte) (this.f23456e | 2);
            return this;
        }

        @Override // p276j4.AbstractC5868F.e.AbstractC7712e.a
        /* JADX INFO: renamed from: d */
        public AbstractC5868F.e.AbstractC7712e.a mo26603d(int i7) {
            this.f23452a = i7;
            this.f23456e = (byte) (this.f23456e | 1);
            return this;
        }

        @Override // p276j4.AbstractC5868F.e.AbstractC7712e.a
        /* JADX INFO: renamed from: e */
        public AbstractC5868F.e.AbstractC7712e.a mo26604e(String str) {
            if (str == null) {
                throw new NullPointerException("Null version");
            }
            this.f23453b = str;
            return this;
        }
    }

    @Override // p276j4.AbstractC5868F.e.AbstractC7712e
    /* JADX INFO: renamed from: b */
    public String mo26596b() {
        return this.f23450c;
    }

    @Override // p276j4.AbstractC5868F.e.AbstractC7712e
    /* JADX INFO: renamed from: c */
    public int mo26597c() {
        return this.f23448a;
    }

    @Override // p276j4.AbstractC5868F.e.AbstractC7712e
    /* JADX INFO: renamed from: d */
    public String mo26598d() {
        return this.f23449b;
    }

    @Override // p276j4.AbstractC5868F.e.AbstractC7712e
    /* JADX INFO: renamed from: e */
    public boolean mo26599e() {
        return this.f23451d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5868F.e.AbstractC7712e) {
            AbstractC5868F.e.AbstractC7712e abstractC7712e = (AbstractC5868F.e.AbstractC7712e) obj;
            if (this.f23448a == abstractC7712e.mo26597c() && this.f23449b.equals(abstractC7712e.mo26598d()) && this.f23450c.equals(abstractC7712e.mo26596b()) && this.f23451d == abstractC7712e.mo26599e()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f23448a ^ 1000003) * 1000003) ^ this.f23449b.hashCode()) * 1000003) ^ this.f23450c.hashCode()) * 1000003) ^ (this.f23451d ? 1231 : 1237);
    }

    public String toString() {
        return "OperatingSystem{platform=" + this.f23448a + ", version=" + this.f23449b + ", buildVersion=" + this.f23450c + ", jailbroken=" + this.f23451d + "}";
    }

    private C5895z(int i7, String str, String str2, boolean z7) {
        this.f23448a = i7;
        this.f23449b = str;
        this.f23450c = str2;
        this.f23451d = z7;
    }
}
