package p276j4;

/* JADX INFO: renamed from: j4.o */
/* JADX INFO: loaded from: classes.dex */
final class C5884o extends AbstractC5868F.e.d.a.b.AbstractC7699a {

    /* JADX INFO: renamed from: a */
    private final long f23364a;

    /* JADX INFO: renamed from: b */
    private final long f23365b;

    /* JADX INFO: renamed from: c */
    private final String f23366c;

    /* JADX INFO: renamed from: d */
    private final String f23367d;

    /* JADX INFO: renamed from: j4.o$b */
    static final class b extends AbstractC5868F.e.d.a.b.AbstractC7699a.AbstractC7700a {

        /* JADX INFO: renamed from: a */
        private long f23368a;

        /* JADX INFO: renamed from: b */
        private long f23369b;

        /* JADX INFO: renamed from: c */
        private String f23370c;

        /* JADX INFO: renamed from: d */
        private String f23371d;

        /* JADX INFO: renamed from: e */
        private byte f23372e;

        b() {
        }

        @Override // p276j4.AbstractC5868F.e.d.a.b.AbstractC7699a.AbstractC7700a
        /* JADX INFO: renamed from: a */
        public AbstractC5868F.e.d.a.b.AbstractC7699a mo26488a() {
            String str;
            if (this.f23372e == 3 && (str = this.f23370c) != null) {
                return new C5884o(this.f23368a, this.f23369b, str, this.f23371d);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f23372e & 1) == 0) {
                sb.append(" baseAddress");
            }
            if ((this.f23372e & 2) == 0) {
                sb.append(" size");
            }
            if (this.f23370c == null) {
                sb.append(" name");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // p276j4.AbstractC5868F.e.d.a.b.AbstractC7699a.AbstractC7700a
        /* JADX INFO: renamed from: b */
        public AbstractC5868F.e.d.a.b.AbstractC7699a.AbstractC7700a mo26489b(long j7) {
            this.f23368a = j7;
            this.f23372e = (byte) (this.f23372e | 1);
            return this;
        }

        @Override // p276j4.AbstractC5868F.e.d.a.b.AbstractC7699a.AbstractC7700a
        /* JADX INFO: renamed from: c */
        public AbstractC5868F.e.d.a.b.AbstractC7699a.AbstractC7700a mo26490c(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f23370c = str;
            return this;
        }

        @Override // p276j4.AbstractC5868F.e.d.a.b.AbstractC7699a.AbstractC7700a
        /* JADX INFO: renamed from: d */
        public AbstractC5868F.e.d.a.b.AbstractC7699a.AbstractC7700a mo26491d(long j7) {
            this.f23369b = j7;
            this.f23372e = (byte) (this.f23372e | 2);
            return this;
        }

        @Override // p276j4.AbstractC5868F.e.d.a.b.AbstractC7699a.AbstractC7700a
        /* JADX INFO: renamed from: e */
        public AbstractC5868F.e.d.a.b.AbstractC7699a.AbstractC7700a mo26492e(String str) {
            this.f23371d = str;
            return this;
        }
    }

    @Override // p276j4.AbstractC5868F.e.d.a.b.AbstractC7699a
    /* JADX INFO: renamed from: b */
    public long mo26483b() {
        return this.f23364a;
    }

    @Override // p276j4.AbstractC5868F.e.d.a.b.AbstractC7699a
    /* JADX INFO: renamed from: c */
    public String mo26484c() {
        return this.f23366c;
    }

    @Override // p276j4.AbstractC5868F.e.d.a.b.AbstractC7699a
    /* JADX INFO: renamed from: d */
    public long mo26485d() {
        return this.f23365b;
    }

    @Override // p276j4.AbstractC5868F.e.d.a.b.AbstractC7699a
    /* JADX INFO: renamed from: e */
    public String mo26486e() {
        return this.f23367d;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5868F.e.d.a.b.AbstractC7699a) {
            AbstractC5868F.e.d.a.b.AbstractC7699a abstractC7699a = (AbstractC5868F.e.d.a.b.AbstractC7699a) obj;
            if (this.f23364a == abstractC7699a.mo26483b() && this.f23365b == abstractC7699a.mo26485d() && this.f23366c.equals(abstractC7699a.mo26484c()) && ((str = this.f23367d) != null ? str.equals(abstractC7699a.mo26486e()) : abstractC7699a.mo26486e() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j7 = this.f23364a;
        long j8 = this.f23365b;
        int iHashCode = (((((((int) (j7 ^ (j7 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j8 >>> 32) ^ j8))) * 1000003) ^ this.f23366c.hashCode()) * 1000003;
        String str = this.f23367d;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "BinaryImage{baseAddress=" + this.f23364a + ", size=" + this.f23365b + ", name=" + this.f23366c + ", uuid=" + this.f23367d + "}";
    }

    private C5884o(long j7, long j8, String str, String str2) {
        this.f23364a = j7;
        this.f23365b = j8;
        this.f23366c = str;
        this.f23367d = str2;
    }
}
