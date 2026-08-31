package p276j4;

/* JADX INFO: renamed from: j4.w */
/* JADX INFO: loaded from: classes.dex */
final class C5892w extends AbstractC5868F.e.d.AbstractC7711e {

    /* JADX INFO: renamed from: a */
    private final AbstractC5868F.e.d.AbstractC7711e.b f23433a;

    /* JADX INFO: renamed from: b */
    private final String f23434b;

    /* JADX INFO: renamed from: c */
    private final String f23435c;

    /* JADX INFO: renamed from: d */
    private final long f23436d;

    /* JADX INFO: renamed from: j4.w$b */
    static final class b extends AbstractC5868F.e.d.AbstractC7711e.a {

        /* JADX INFO: renamed from: a */
        private AbstractC5868F.e.d.AbstractC7711e.b f23437a;

        /* JADX INFO: renamed from: b */
        private String f23438b;

        /* JADX INFO: renamed from: c */
        private String f23439c;

        /* JADX INFO: renamed from: d */
        private long f23440d;

        /* JADX INFO: renamed from: e */
        private byte f23441e;

        b() {
        }

        @Override // p276j4.AbstractC5868F.e.d.AbstractC7711e.a
        /* JADX INFO: renamed from: a */
        public AbstractC5868F.e.d.AbstractC7711e mo26580a() {
            AbstractC5868F.e.d.AbstractC7711e.b bVar;
            String str;
            String str2;
            if (this.f23441e == 1 && (bVar = this.f23437a) != null && (str = this.f23438b) != null && (str2 = this.f23439c) != null) {
                return new C5892w(bVar, str, str2, this.f23440d);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f23437a == null) {
                sb.append(" rolloutVariant");
            }
            if (this.f23438b == null) {
                sb.append(" parameterKey");
            }
            if (this.f23439c == null) {
                sb.append(" parameterValue");
            }
            if ((1 & this.f23441e) == 0) {
                sb.append(" templateVersion");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // p276j4.AbstractC5868F.e.d.AbstractC7711e.a
        /* JADX INFO: renamed from: b */
        public AbstractC5868F.e.d.AbstractC7711e.a mo26581b(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterKey");
            }
            this.f23438b = str;
            return this;
        }

        @Override // p276j4.AbstractC5868F.e.d.AbstractC7711e.a
        /* JADX INFO: renamed from: c */
        public AbstractC5868F.e.d.AbstractC7711e.a mo26582c(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterValue");
            }
            this.f23439c = str;
            return this;
        }

        @Override // p276j4.AbstractC5868F.e.d.AbstractC7711e.a
        /* JADX INFO: renamed from: d */
        public AbstractC5868F.e.d.AbstractC7711e.a mo26583d(AbstractC5868F.e.d.AbstractC7711e.b bVar) {
            if (bVar == null) {
                throw new NullPointerException("Null rolloutVariant");
            }
            this.f23437a = bVar;
            return this;
        }

        @Override // p276j4.AbstractC5868F.e.d.AbstractC7711e.a
        /* JADX INFO: renamed from: e */
        public AbstractC5868F.e.d.AbstractC7711e.a mo26584e(long j7) {
            this.f23440d = j7;
            this.f23441e = (byte) (this.f23441e | 1);
            return this;
        }
    }

    @Override // p276j4.AbstractC5868F.e.d.AbstractC7711e
    /* JADX INFO: renamed from: b */
    public String mo26576b() {
        return this.f23434b;
    }

    @Override // p276j4.AbstractC5868F.e.d.AbstractC7711e
    /* JADX INFO: renamed from: c */
    public String mo26577c() {
        return this.f23435c;
    }

    @Override // p276j4.AbstractC5868F.e.d.AbstractC7711e
    /* JADX INFO: renamed from: d */
    public AbstractC5868F.e.d.AbstractC7711e.b mo26578d() {
        return this.f23433a;
    }

    @Override // p276j4.AbstractC5868F.e.d.AbstractC7711e
    /* JADX INFO: renamed from: e */
    public long mo26579e() {
        return this.f23436d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5868F.e.d.AbstractC7711e) {
            AbstractC5868F.e.d.AbstractC7711e abstractC7711e = (AbstractC5868F.e.d.AbstractC7711e) obj;
            if (this.f23433a.equals(abstractC7711e.mo26578d()) && this.f23434b.equals(abstractC7711e.mo26576b()) && this.f23435c.equals(abstractC7711e.mo26577c()) && this.f23436d == abstractC7711e.mo26579e()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((((this.f23433a.hashCode() ^ 1000003) * 1000003) ^ this.f23434b.hashCode()) * 1000003) ^ this.f23435c.hashCode()) * 1000003;
        long j7 = this.f23436d;
        return iHashCode ^ ((int) (j7 ^ (j7 >>> 32)));
    }

    public String toString() {
        return "RolloutAssignment{rolloutVariant=" + this.f23433a + ", parameterKey=" + this.f23434b + ", parameterValue=" + this.f23435c + ", templateVersion=" + this.f23436d + "}";
    }

    private C5892w(AbstractC5868F.e.d.AbstractC7711e.b bVar, String str, String str2, long j7) {
        this.f23433a = bVar;
        this.f23434b = str;
        this.f23435c = str2;
        this.f23436d = j7;
    }
}
