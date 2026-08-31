package p276j4;

/* JADX INFO: renamed from: j4.q */
/* JADX INFO: loaded from: classes.dex */
final class C5886q extends AbstractC5868F.e.d.a.b.AbstractC7703d {

    /* JADX INFO: renamed from: a */
    private final String f23384a;

    /* JADX INFO: renamed from: b */
    private final String f23385b;

    /* JADX INFO: renamed from: c */
    private final long f23386c;

    /* JADX INFO: renamed from: j4.q$b */
    static final class b extends AbstractC5868F.e.d.a.b.AbstractC7703d.AbstractC7704a {

        /* JADX INFO: renamed from: a */
        private String f23387a;

        /* JADX INFO: renamed from: b */
        private String f23388b;

        /* JADX INFO: renamed from: c */
        private long f23389c;

        /* JADX INFO: renamed from: d */
        private byte f23390d;

        b() {
        }

        @Override // p276j4.AbstractC5868F.e.d.a.b.AbstractC7703d.AbstractC7704a
        /* JADX INFO: renamed from: a */
        public AbstractC5868F.e.d.a.b.AbstractC7703d mo26516a() {
            String str;
            String str2;
            if (this.f23390d == 1 && (str = this.f23387a) != null && (str2 = this.f23388b) != null) {
                return new C5886q(str, str2, this.f23389c);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f23387a == null) {
                sb.append(" name");
            }
            if (this.f23388b == null) {
                sb.append(" code");
            }
            if ((1 & this.f23390d) == 0) {
                sb.append(" address");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // p276j4.AbstractC5868F.e.d.a.b.AbstractC7703d.AbstractC7704a
        /* JADX INFO: renamed from: b */
        public AbstractC5868F.e.d.a.b.AbstractC7703d.AbstractC7704a mo26517b(long j7) {
            this.f23389c = j7;
            this.f23390d = (byte) (this.f23390d | 1);
            return this;
        }

        @Override // p276j4.AbstractC5868F.e.d.a.b.AbstractC7703d.AbstractC7704a
        /* JADX INFO: renamed from: c */
        public AbstractC5868F.e.d.a.b.AbstractC7703d.AbstractC7704a mo26518c(String str) {
            if (str == null) {
                throw new NullPointerException("Null code");
            }
            this.f23388b = str;
            return this;
        }

        @Override // p276j4.AbstractC5868F.e.d.a.b.AbstractC7703d.AbstractC7704a
        /* JADX INFO: renamed from: d */
        public AbstractC5868F.e.d.a.b.AbstractC7703d.AbstractC7704a mo26519d(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f23387a = str;
            return this;
        }
    }

    @Override // p276j4.AbstractC5868F.e.d.a.b.AbstractC7703d
    /* JADX INFO: renamed from: b */
    public long mo26513b() {
        return this.f23386c;
    }

    @Override // p276j4.AbstractC5868F.e.d.a.b.AbstractC7703d
    /* JADX INFO: renamed from: c */
    public String mo26514c() {
        return this.f23385b;
    }

    @Override // p276j4.AbstractC5868F.e.d.a.b.AbstractC7703d
    /* JADX INFO: renamed from: d */
    public String mo26515d() {
        return this.f23384a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5868F.e.d.a.b.AbstractC7703d) {
            AbstractC5868F.e.d.a.b.AbstractC7703d abstractC7703d = (AbstractC5868F.e.d.a.b.AbstractC7703d) obj;
            if (this.f23384a.equals(abstractC7703d.mo26515d()) && this.f23385b.equals(abstractC7703d.mo26514c()) && this.f23386c == abstractC7703d.mo26513b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((this.f23384a.hashCode() ^ 1000003) * 1000003) ^ this.f23385b.hashCode()) * 1000003;
        long j7 = this.f23386c;
        return iHashCode ^ ((int) (j7 ^ (j7 >>> 32)));
    }

    public String toString() {
        return "Signal{name=" + this.f23384a + ", code=" + this.f23385b + ", address=" + this.f23386c + "}";
    }

    private C5886q(String str, String str2, long j7) {
        this.f23384a = str;
        this.f23385b = str2;
        this.f23386c = j7;
    }
}
