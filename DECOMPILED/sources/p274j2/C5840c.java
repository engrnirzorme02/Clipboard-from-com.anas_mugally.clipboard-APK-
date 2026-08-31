package p274j2;

import java.util.Set;

/* JADX INFO: renamed from: j2.c */
/* JADX INFO: loaded from: classes.dex */
final class C5840c extends AbstractC5843f.b {

    /* JADX INFO: renamed from: a */
    private final long f22966a;

    /* JADX INFO: renamed from: b */
    private final long f22967b;

    /* JADX INFO: renamed from: c */
    private final Set f22968c;

    /* JADX INFO: renamed from: j2.c$b */
    static final class b extends AbstractC5843f.b.a {

        /* JADX INFO: renamed from: a */
        private Long f22969a;

        /* JADX INFO: renamed from: b */
        private Long f22970b;

        /* JADX INFO: renamed from: c */
        private Set f22971c;

        b() {
        }

        @Override // p274j2.AbstractC5843f.b.a
        /* JADX INFO: renamed from: a */
        public AbstractC5843f.b mo26234a() {
            String str = "";
            if (this.f22969a == null) {
                str = " delta";
            }
            if (this.f22970b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f22971c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new C5840c(this.f22969a.longValue(), this.f22970b.longValue(), this.f22971c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p274j2.AbstractC5843f.b.a
        /* JADX INFO: renamed from: b */
        public AbstractC5843f.b.a mo26235b(long j7) {
            this.f22969a = Long.valueOf(j7);
            return this;
        }

        @Override // p274j2.AbstractC5843f.b.a
        /* JADX INFO: renamed from: c */
        public AbstractC5843f.b.a mo26236c(Set set) {
            if (set == null) {
                throw new NullPointerException("Null flags");
            }
            this.f22971c = set;
            return this;
        }

        @Override // p274j2.AbstractC5843f.b.a
        /* JADX INFO: renamed from: d */
        public AbstractC5843f.b.a mo26237d(long j7) {
            this.f22970b = Long.valueOf(j7);
            return this;
        }
    }

    @Override // p274j2.AbstractC5843f.b
    /* JADX INFO: renamed from: b */
    long mo26231b() {
        return this.f22966a;
    }

    @Override // p274j2.AbstractC5843f.b
    /* JADX INFO: renamed from: c */
    Set mo26232c() {
        return this.f22968c;
    }

    @Override // p274j2.AbstractC5843f.b
    /* JADX INFO: renamed from: d */
    long mo26233d() {
        return this.f22967b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5843f.b) {
            AbstractC5843f.b bVar = (AbstractC5843f.b) obj;
            if (this.f22966a == bVar.mo26231b() && this.f22967b == bVar.mo26233d() && this.f22968c.equals(bVar.mo26232c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j7 = this.f22966a;
        int i7 = (((int) (j7 ^ (j7 >>> 32))) ^ 1000003) * 1000003;
        long j8 = this.f22967b;
        return ((i7 ^ ((int) ((j8 >>> 32) ^ j8))) * 1000003) ^ this.f22968c.hashCode();
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f22966a + ", maxAllowedDelay=" + this.f22967b + ", flags=" + this.f22968c + "}";
    }

    private C5840c(long j7, long j8, Set set) {
        this.f22966a = j7;
        this.f22967b = j8;
        this.f22968c = set;
    }
}
