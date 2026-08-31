package p276j4;

/* JADX INFO: renamed from: j4.s */
/* JADX INFO: loaded from: classes.dex */
final class C5888s extends AbstractC5868F.e.d.a.b.AbstractC7705e.AbstractC7707b {

    /* JADX INFO: renamed from: a */
    private final long f23398a;

    /* JADX INFO: renamed from: b */
    private final String f23399b;

    /* JADX INFO: renamed from: c */
    private final String f23400c;

    /* JADX INFO: renamed from: d */
    private final long f23401d;

    /* JADX INFO: renamed from: e */
    private final int f23402e;

    /* JADX INFO: renamed from: j4.s$b */
    static final class b extends AbstractC5868F.e.d.a.b.AbstractC7705e.AbstractC7707b.AbstractC7708a {

        /* JADX INFO: renamed from: a */
        private long f23403a;

        /* JADX INFO: renamed from: b */
        private String f23404b;

        /* JADX INFO: renamed from: c */
        private String f23405c;

        /* JADX INFO: renamed from: d */
        private long f23406d;

        /* JADX INFO: renamed from: e */
        private int f23407e;

        /* JADX INFO: renamed from: f */
        private byte f23408f;

        b() {
        }

        @Override // p276j4.AbstractC5868F.e.d.a.b.AbstractC7705e.AbstractC7707b.AbstractC7708a
        /* JADX INFO: renamed from: a */
        public AbstractC5868F.e.d.a.b.AbstractC7705e.AbstractC7707b mo26534a() {
            String str;
            if (this.f23408f == 7 && (str = this.f23404b) != null) {
                return new C5888s(this.f23403a, str, this.f23405c, this.f23406d, this.f23407e);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f23408f & 1) == 0) {
                sb.append(" pc");
            }
            if (this.f23404b == null) {
                sb.append(" symbol");
            }
            if ((this.f23408f & 2) == 0) {
                sb.append(" offset");
            }
            if ((this.f23408f & 4) == 0) {
                sb.append(" importance");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // p276j4.AbstractC5868F.e.d.a.b.AbstractC7705e.AbstractC7707b.AbstractC7708a
        /* JADX INFO: renamed from: b */
        public AbstractC5868F.e.d.a.b.AbstractC7705e.AbstractC7707b.AbstractC7708a mo26535b(String str) {
            this.f23405c = str;
            return this;
        }

        @Override // p276j4.AbstractC5868F.e.d.a.b.AbstractC7705e.AbstractC7707b.AbstractC7708a
        /* JADX INFO: renamed from: c */
        public AbstractC5868F.e.d.a.b.AbstractC7705e.AbstractC7707b.AbstractC7708a mo26536c(int i7) {
            this.f23407e = i7;
            this.f23408f = (byte) (this.f23408f | 4);
            return this;
        }

        @Override // p276j4.AbstractC5868F.e.d.a.b.AbstractC7705e.AbstractC7707b.AbstractC7708a
        /* JADX INFO: renamed from: d */
        public AbstractC5868F.e.d.a.b.AbstractC7705e.AbstractC7707b.AbstractC7708a mo26537d(long j7) {
            this.f23406d = j7;
            this.f23408f = (byte) (this.f23408f | 2);
            return this;
        }

        @Override // p276j4.AbstractC5868F.e.d.a.b.AbstractC7705e.AbstractC7707b.AbstractC7708a
        /* JADX INFO: renamed from: e */
        public AbstractC5868F.e.d.a.b.AbstractC7705e.AbstractC7707b.AbstractC7708a mo26538e(long j7) {
            this.f23403a = j7;
            this.f23408f = (byte) (this.f23408f | 1);
            return this;
        }

        @Override // p276j4.AbstractC5868F.e.d.a.b.AbstractC7705e.AbstractC7707b.AbstractC7708a
        /* JADX INFO: renamed from: f */
        public AbstractC5868F.e.d.a.b.AbstractC7705e.AbstractC7707b.AbstractC7708a mo26539f(String str) {
            if (str == null) {
                throw new NullPointerException("Null symbol");
            }
            this.f23404b = str;
            return this;
        }
    }

    @Override // p276j4.AbstractC5868F.e.d.a.b.AbstractC7705e.AbstractC7707b
    /* JADX INFO: renamed from: b */
    public String mo26529b() {
        return this.f23400c;
    }

    @Override // p276j4.AbstractC5868F.e.d.a.b.AbstractC7705e.AbstractC7707b
    /* JADX INFO: renamed from: c */
    public int mo26530c() {
        return this.f23402e;
    }

    @Override // p276j4.AbstractC5868F.e.d.a.b.AbstractC7705e.AbstractC7707b
    /* JADX INFO: renamed from: d */
    public long mo26531d() {
        return this.f23401d;
    }

    @Override // p276j4.AbstractC5868F.e.d.a.b.AbstractC7705e.AbstractC7707b
    /* JADX INFO: renamed from: e */
    public long mo26532e() {
        return this.f23398a;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5868F.e.d.a.b.AbstractC7705e.AbstractC7707b) {
            AbstractC5868F.e.d.a.b.AbstractC7705e.AbstractC7707b abstractC7707b = (AbstractC5868F.e.d.a.b.AbstractC7705e.AbstractC7707b) obj;
            if (this.f23398a == abstractC7707b.mo26532e() && this.f23399b.equals(abstractC7707b.mo26533f()) && ((str = this.f23400c) != null ? str.equals(abstractC7707b.mo26529b()) : abstractC7707b.mo26529b() == null) && this.f23401d == abstractC7707b.mo26531d() && this.f23402e == abstractC7707b.mo26530c()) {
                return true;
            }
        }
        return false;
    }

    @Override // p276j4.AbstractC5868F.e.d.a.b.AbstractC7705e.AbstractC7707b
    /* JADX INFO: renamed from: f */
    public String mo26533f() {
        return this.f23399b;
    }

    public int hashCode() {
        long j7 = this.f23398a;
        int iHashCode = (((((int) (j7 ^ (j7 >>> 32))) ^ 1000003) * 1000003) ^ this.f23399b.hashCode()) * 1000003;
        String str = this.f23400c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j8 = this.f23401d;
        return ((iHashCode2 ^ ((int) ((j8 >>> 32) ^ j8))) * 1000003) ^ this.f23402e;
    }

    public String toString() {
        return "Frame{pc=" + this.f23398a + ", symbol=" + this.f23399b + ", file=" + this.f23400c + ", offset=" + this.f23401d + ", importance=" + this.f23402e + "}";
    }

    private C5888s(long j7, String str, String str2, long j8, int i7) {
        this.f23398a = j7;
        this.f23399b = str;
        this.f23400c = str2;
        this.f23401d = j8;
        this.f23402e = i7;
    }
}
