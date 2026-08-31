package p208b2;

import java.util.Arrays;

/* JADX INFO: renamed from: b2.j */
/* JADX INFO: loaded from: classes.dex */
final class C2944j extends AbstractC2954t {

    /* JADX INFO: renamed from: a */
    private final long f12149a;

    /* JADX INFO: renamed from: b */
    private final Integer f12150b;

    /* JADX INFO: renamed from: c */
    private final AbstractC2950p f12151c;

    /* JADX INFO: renamed from: d */
    private final long f12152d;

    /* JADX INFO: renamed from: e */
    private final byte[] f12153e;

    /* JADX INFO: renamed from: f */
    private final String f12154f;

    /* JADX INFO: renamed from: g */
    private final long f12155g;

    /* JADX INFO: renamed from: h */
    private final AbstractC2957w f12156h;

    /* JADX INFO: renamed from: i */
    private final AbstractC2951q f12157i;

    /* JADX INFO: renamed from: b2.j$b */
    static final class b extends AbstractC2954t.a {

        /* JADX INFO: renamed from: a */
        private Long f12158a;

        /* JADX INFO: renamed from: b */
        private Integer f12159b;

        /* JADX INFO: renamed from: c */
        private AbstractC2950p f12160c;

        /* JADX INFO: renamed from: d */
        private Long f12161d;

        /* JADX INFO: renamed from: e */
        private byte[] f12162e;

        /* JADX INFO: renamed from: f */
        private String f12163f;

        /* JADX INFO: renamed from: g */
        private Long f12164g;

        /* JADX INFO: renamed from: h */
        private AbstractC2957w f12165h;

        /* JADX INFO: renamed from: i */
        private AbstractC2951q f12166i;

        b() {
        }

        @Override // p208b2.AbstractC2954t.a
        /* JADX INFO: renamed from: a */
        public AbstractC2954t mo14753a() {
            String str = "";
            if (this.f12158a == null) {
                str = " eventTimeMs";
            }
            if (this.f12161d == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f12164g == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new C2944j(this.f12158a.longValue(), this.f12159b, this.f12160c, this.f12161d.longValue(), this.f12162e, this.f12163f, this.f12164g.longValue(), this.f12165h, this.f12166i);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p208b2.AbstractC2954t.a
        /* JADX INFO: renamed from: b */
        public AbstractC2954t.a mo14754b(AbstractC2950p abstractC2950p) {
            this.f12160c = abstractC2950p;
            return this;
        }

        @Override // p208b2.AbstractC2954t.a
        /* JADX INFO: renamed from: c */
        public AbstractC2954t.a mo14755c(Integer num) {
            this.f12159b = num;
            return this;
        }

        @Override // p208b2.AbstractC2954t.a
        /* JADX INFO: renamed from: d */
        public AbstractC2954t.a mo14756d(long j7) {
            this.f12158a = Long.valueOf(j7);
            return this;
        }

        @Override // p208b2.AbstractC2954t.a
        /* JADX INFO: renamed from: e */
        public AbstractC2954t.a mo14757e(long j7) {
            this.f12161d = Long.valueOf(j7);
            return this;
        }

        @Override // p208b2.AbstractC2954t.a
        /* JADX INFO: renamed from: f */
        public AbstractC2954t.a mo14758f(AbstractC2951q abstractC2951q) {
            this.f12166i = abstractC2951q;
            return this;
        }

        @Override // p208b2.AbstractC2954t.a
        /* JADX INFO: renamed from: g */
        public AbstractC2954t.a mo14759g(AbstractC2957w abstractC2957w) {
            this.f12165h = abstractC2957w;
            return this;
        }

        @Override // p208b2.AbstractC2954t.a
        /* JADX INFO: renamed from: h */
        AbstractC2954t.a mo14760h(byte[] bArr) {
            this.f12162e = bArr;
            return this;
        }

        @Override // p208b2.AbstractC2954t.a
        /* JADX INFO: renamed from: i */
        AbstractC2954t.a mo14761i(String str) {
            this.f12163f = str;
            return this;
        }

        @Override // p208b2.AbstractC2954t.a
        /* JADX INFO: renamed from: j */
        public AbstractC2954t.a mo14762j(long j7) {
            this.f12164g = Long.valueOf(j7);
            return this;
        }
    }

    @Override // p208b2.AbstractC2954t
    /* JADX INFO: renamed from: b */
    public AbstractC2950p mo14744b() {
        return this.f12151c;
    }

    @Override // p208b2.AbstractC2954t
    /* JADX INFO: renamed from: c */
    public Integer mo14745c() {
        return this.f12150b;
    }

    @Override // p208b2.AbstractC2954t
    /* JADX INFO: renamed from: d */
    public long mo14746d() {
        return this.f12149a;
    }

    @Override // p208b2.AbstractC2954t
    /* JADX INFO: renamed from: e */
    public long mo14747e() {
        return this.f12152d;
    }

    public boolean equals(Object obj) {
        Integer num;
        AbstractC2950p abstractC2950p;
        String str;
        AbstractC2957w abstractC2957w;
        AbstractC2951q abstractC2951q;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2954t) {
            AbstractC2954t abstractC2954t = (AbstractC2954t) obj;
            if (this.f12149a == abstractC2954t.mo14746d() && ((num = this.f12150b) != null ? num.equals(abstractC2954t.mo14745c()) : abstractC2954t.mo14745c() == null) && ((abstractC2950p = this.f12151c) != null ? abstractC2950p.equals(abstractC2954t.mo14744b()) : abstractC2954t.mo14744b() == null) && this.f12152d == abstractC2954t.mo14747e()) {
                if (Arrays.equals(this.f12153e, abstractC2954t instanceof C2944j ? ((C2944j) abstractC2954t).f12153e : abstractC2954t.mo14750h()) && ((str = this.f12154f) != null ? str.equals(abstractC2954t.mo14751i()) : abstractC2954t.mo14751i() == null) && this.f12155g == abstractC2954t.mo14752j() && ((abstractC2957w = this.f12156h) != null ? abstractC2957w.equals(abstractC2954t.mo14749g()) : abstractC2954t.mo14749g() == null) && ((abstractC2951q = this.f12157i) != null ? abstractC2951q.equals(abstractC2954t.mo14748f()) : abstractC2954t.mo14748f() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p208b2.AbstractC2954t
    /* JADX INFO: renamed from: f */
    public AbstractC2951q mo14748f() {
        return this.f12157i;
    }

    @Override // p208b2.AbstractC2954t
    /* JADX INFO: renamed from: g */
    public AbstractC2957w mo14749g() {
        return this.f12156h;
    }

    @Override // p208b2.AbstractC2954t
    /* JADX INFO: renamed from: h */
    public byte[] mo14750h() {
        return this.f12153e;
    }

    public int hashCode() {
        long j7 = this.f12149a;
        int i7 = (((int) (j7 ^ (j7 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f12150b;
        int iHashCode = (i7 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        AbstractC2950p abstractC2950p = this.f12151c;
        int iHashCode2 = abstractC2950p == null ? 0 : abstractC2950p.hashCode();
        long j8 = this.f12152d;
        int iHashCode3 = (((((iHashCode ^ iHashCode2) * 1000003) ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f12153e)) * 1000003;
        String str = this.f12154f;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        long j9 = this.f12155g;
        int i8 = (((iHashCode3 ^ iHashCode4) * 1000003) ^ ((int) ((j9 >>> 32) ^ j9))) * 1000003;
        AbstractC2957w abstractC2957w = this.f12156h;
        int iHashCode5 = (i8 ^ (abstractC2957w == null ? 0 : abstractC2957w.hashCode())) * 1000003;
        AbstractC2951q abstractC2951q = this.f12157i;
        return iHashCode5 ^ (abstractC2951q != null ? abstractC2951q.hashCode() : 0);
    }

    @Override // p208b2.AbstractC2954t
    /* JADX INFO: renamed from: i */
    public String mo14751i() {
        return this.f12154f;
    }

    @Override // p208b2.AbstractC2954t
    /* JADX INFO: renamed from: j */
    public long mo14752j() {
        return this.f12155g;
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f12149a + ", eventCode=" + this.f12150b + ", complianceData=" + this.f12151c + ", eventUptimeMs=" + this.f12152d + ", sourceExtension=" + Arrays.toString(this.f12153e) + ", sourceExtensionJsonProto3=" + this.f12154f + ", timezoneOffsetSeconds=" + this.f12155g + ", networkConnectionInfo=" + this.f12156h + ", experimentIds=" + this.f12157i + "}";
    }

    private C2944j(long j7, Integer num, AbstractC2950p abstractC2950p, long j8, byte[] bArr, String str, long j9, AbstractC2957w abstractC2957w, AbstractC2951q abstractC2951q) {
        this.f12149a = j7;
        this.f12150b = num;
        this.f12151c = abstractC2950p;
        this.f12152d = j8;
        this.f12153e = bArr;
        this.f12154f = str;
        this.f12155g = j9;
        this.f12156h = abstractC2957w;
        this.f12157i = abstractC2951q;
    }
}
