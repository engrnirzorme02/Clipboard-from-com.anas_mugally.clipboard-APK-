package p282k2;

/* JADX INFO: renamed from: k2.a */
/* JADX INFO: loaded from: classes.dex */
final class C5992a extends AbstractC5996e {

    /* JADX INFO: renamed from: b */
    private final long f23753b;

    /* JADX INFO: renamed from: c */
    private final int f23754c;

    /* JADX INFO: renamed from: d */
    private final int f23755d;

    /* JADX INFO: renamed from: e */
    private final long f23756e;

    /* JADX INFO: renamed from: f */
    private final int f23757f;

    /* JADX INFO: renamed from: k2.a$b */
    static final class b extends AbstractC5996e.a {

        /* JADX INFO: renamed from: a */
        private Long f23758a;

        /* JADX INFO: renamed from: b */
        private Integer f23759b;

        /* JADX INFO: renamed from: c */
        private Integer f23760c;

        /* JADX INFO: renamed from: d */
        private Long f23761d;

        /* JADX INFO: renamed from: e */
        private Integer f23762e;

        b() {
        }

        @Override // p282k2.AbstractC5996e.a
        /* JADX INFO: renamed from: a */
        AbstractC5996e mo27012a() {
            String str = "";
            if (this.f23758a == null) {
                str = " maxStorageSizeInBytes";
            }
            if (this.f23759b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f23760c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f23761d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f23762e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new C5992a(this.f23758a.longValue(), this.f23759b.intValue(), this.f23760c.intValue(), this.f23761d.longValue(), this.f23762e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p282k2.AbstractC5996e.a
        /* JADX INFO: renamed from: b */
        AbstractC5996e.a mo27013b(int i7) {
            this.f23760c = Integer.valueOf(i7);
            return this;
        }

        @Override // p282k2.AbstractC5996e.a
        /* JADX INFO: renamed from: c */
        AbstractC5996e.a mo27014c(long j7) {
            this.f23761d = Long.valueOf(j7);
            return this;
        }

        @Override // p282k2.AbstractC5996e.a
        /* JADX INFO: renamed from: d */
        AbstractC5996e.a mo27015d(int i7) {
            this.f23759b = Integer.valueOf(i7);
            return this;
        }

        @Override // p282k2.AbstractC5996e.a
        /* JADX INFO: renamed from: e */
        AbstractC5996e.a mo27016e(int i7) {
            this.f23762e = Integer.valueOf(i7);
            return this;
        }

        @Override // p282k2.AbstractC5996e.a
        /* JADX INFO: renamed from: f */
        AbstractC5996e.a mo27017f(long j7) {
            this.f23758a = Long.valueOf(j7);
            return this;
        }
    }

    @Override // p282k2.AbstractC5996e
    /* JADX INFO: renamed from: b */
    int mo27007b() {
        return this.f23755d;
    }

    @Override // p282k2.AbstractC5996e
    /* JADX INFO: renamed from: c */
    long mo27008c() {
        return this.f23756e;
    }

    @Override // p282k2.AbstractC5996e
    /* JADX INFO: renamed from: d */
    int mo27009d() {
        return this.f23754c;
    }

    @Override // p282k2.AbstractC5996e
    /* JADX INFO: renamed from: e */
    int mo27010e() {
        return this.f23757f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5996e) {
            AbstractC5996e abstractC5996e = (AbstractC5996e) obj;
            if (this.f23753b == abstractC5996e.mo27011f() && this.f23754c == abstractC5996e.mo27009d() && this.f23755d == abstractC5996e.mo27007b() && this.f23756e == abstractC5996e.mo27008c() && this.f23757f == abstractC5996e.mo27010e()) {
                return true;
            }
        }
        return false;
    }

    @Override // p282k2.AbstractC5996e
    /* JADX INFO: renamed from: f */
    long mo27011f() {
        return this.f23753b;
    }

    public int hashCode() {
        long j7 = this.f23753b;
        int i7 = (((((((int) (j7 ^ (j7 >>> 32))) ^ 1000003) * 1000003) ^ this.f23754c) * 1000003) ^ this.f23755d) * 1000003;
        long j8 = this.f23756e;
        return ((i7 ^ ((int) ((j8 >>> 32) ^ j8))) * 1000003) ^ this.f23757f;
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f23753b + ", loadBatchSize=" + this.f23754c + ", criticalSectionEnterTimeoutMs=" + this.f23755d + ", eventCleanUpAge=" + this.f23756e + ", maxBlobByteSizePerRow=" + this.f23757f + "}";
    }

    private C5992a(long j7, int i7, int i8, long j8, int i9) {
        this.f23753b = j7;
        this.f23754c = i7;
        this.f23755d = i8;
        this.f23756e = j8;
        this.f23757f = i9;
    }
}
