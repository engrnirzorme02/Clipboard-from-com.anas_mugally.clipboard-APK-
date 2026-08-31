package p208b2;

import java.util.List;

/* JADX INFO: renamed from: b2.k */
/* JADX INFO: loaded from: classes.dex */
final class C2945k extends AbstractC2955u {

    /* JADX INFO: renamed from: a */
    private final long f12167a;

    /* JADX INFO: renamed from: b */
    private final long f12168b;

    /* JADX INFO: renamed from: c */
    private final AbstractC2949o f12169c;

    /* JADX INFO: renamed from: d */
    private final Integer f12170d;

    /* JADX INFO: renamed from: e */
    private final String f12171e;

    /* JADX INFO: renamed from: f */
    private final List f12172f;

    /* JADX INFO: renamed from: g */
    private final EnumC2958x f12173g;

    /* JADX INFO: renamed from: b2.k$b */
    static final class b extends AbstractC2955u.a {

        /* JADX INFO: renamed from: a */
        private Long f12174a;

        /* JADX INFO: renamed from: b */
        private Long f12175b;

        /* JADX INFO: renamed from: c */
        private AbstractC2949o f12176c;

        /* JADX INFO: renamed from: d */
        private Integer f12177d;

        /* JADX INFO: renamed from: e */
        private String f12178e;

        /* JADX INFO: renamed from: f */
        private List f12179f;

        /* JADX INFO: renamed from: g */
        private EnumC2958x f12180g;

        b() {
        }

        @Override // p208b2.AbstractC2955u.a
        /* JADX INFO: renamed from: a */
        public AbstractC2955u mo14770a() {
            String str = "";
            if (this.f12174a == null) {
                str = " requestTimeMs";
            }
            if (this.f12175b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new C2945k(this.f12174a.longValue(), this.f12175b.longValue(), this.f12176c, this.f12177d, this.f12178e, this.f12179f, this.f12180g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p208b2.AbstractC2955u.a
        /* JADX INFO: renamed from: b */
        public AbstractC2955u.a mo14771b(AbstractC2949o abstractC2949o) {
            this.f12176c = abstractC2949o;
            return this;
        }

        @Override // p208b2.AbstractC2955u.a
        /* JADX INFO: renamed from: c */
        public AbstractC2955u.a mo14772c(List list) {
            this.f12179f = list;
            return this;
        }

        @Override // p208b2.AbstractC2955u.a
        /* JADX INFO: renamed from: d */
        AbstractC2955u.a mo14773d(Integer num) {
            this.f12177d = num;
            return this;
        }

        @Override // p208b2.AbstractC2955u.a
        /* JADX INFO: renamed from: e */
        AbstractC2955u.a mo14774e(String str) {
            this.f12178e = str;
            return this;
        }

        @Override // p208b2.AbstractC2955u.a
        /* JADX INFO: renamed from: f */
        public AbstractC2955u.a mo14775f(EnumC2958x enumC2958x) {
            this.f12180g = enumC2958x;
            return this;
        }

        @Override // p208b2.AbstractC2955u.a
        /* JADX INFO: renamed from: g */
        public AbstractC2955u.a mo14776g(long j7) {
            this.f12174a = Long.valueOf(j7);
            return this;
        }

        @Override // p208b2.AbstractC2955u.a
        /* JADX INFO: renamed from: h */
        public AbstractC2955u.a mo14777h(long j7) {
            this.f12175b = Long.valueOf(j7);
            return this;
        }
    }

    @Override // p208b2.AbstractC2955u
    /* JADX INFO: renamed from: b */
    public AbstractC2949o mo14763b() {
        return this.f12169c;
    }

    @Override // p208b2.AbstractC2955u
    /* JADX INFO: renamed from: c */
    public List mo14764c() {
        return this.f12172f;
    }

    @Override // p208b2.AbstractC2955u
    /* JADX INFO: renamed from: d */
    public Integer mo14765d() {
        return this.f12170d;
    }

    @Override // p208b2.AbstractC2955u
    /* JADX INFO: renamed from: e */
    public String mo14766e() {
        return this.f12171e;
    }

    public boolean equals(Object obj) {
        AbstractC2949o abstractC2949o;
        Integer num;
        String str;
        List list;
        EnumC2958x enumC2958x;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2955u) {
            AbstractC2955u abstractC2955u = (AbstractC2955u) obj;
            if (this.f12167a == abstractC2955u.mo14768g() && this.f12168b == abstractC2955u.mo14769h() && ((abstractC2949o = this.f12169c) != null ? abstractC2949o.equals(abstractC2955u.mo14763b()) : abstractC2955u.mo14763b() == null) && ((num = this.f12170d) != null ? num.equals(abstractC2955u.mo14765d()) : abstractC2955u.mo14765d() == null) && ((str = this.f12171e) != null ? str.equals(abstractC2955u.mo14766e()) : abstractC2955u.mo14766e() == null) && ((list = this.f12172f) != null ? list.equals(abstractC2955u.mo14764c()) : abstractC2955u.mo14764c() == null) && ((enumC2958x = this.f12173g) != null ? enumC2958x.equals(abstractC2955u.mo14767f()) : abstractC2955u.mo14767f() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // p208b2.AbstractC2955u
    /* JADX INFO: renamed from: f */
    public EnumC2958x mo14767f() {
        return this.f12173g;
    }

    @Override // p208b2.AbstractC2955u
    /* JADX INFO: renamed from: g */
    public long mo14768g() {
        return this.f12167a;
    }

    @Override // p208b2.AbstractC2955u
    /* JADX INFO: renamed from: h */
    public long mo14769h() {
        return this.f12168b;
    }

    public int hashCode() {
        long j7 = this.f12167a;
        long j8 = this.f12168b;
        int i7 = (((((int) (j7 ^ (j7 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j8 >>> 32) ^ j8))) * 1000003;
        AbstractC2949o abstractC2949o = this.f12169c;
        int iHashCode = (i7 ^ (abstractC2949o == null ? 0 : abstractC2949o.hashCode())) * 1000003;
        Integer num = this.f12170d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f12171e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f12172f;
        int iHashCode4 = (iHashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        EnumC2958x enumC2958x = this.f12173g;
        return iHashCode4 ^ (enumC2958x != null ? enumC2958x.hashCode() : 0);
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f12167a + ", requestUptimeMs=" + this.f12168b + ", clientInfo=" + this.f12169c + ", logSource=" + this.f12170d + ", logSourceName=" + this.f12171e + ", logEvents=" + this.f12172f + ", qosTier=" + this.f12173g + "}";
    }

    private C2945k(long j7, long j8, AbstractC2949o abstractC2949o, Integer num, String str, List list, EnumC2958x enumC2958x) {
        this.f12167a = j7;
        this.f12168b = j8;
        this.f12169c = abstractC2949o;
        this.f12170d = num;
        this.f12171e = str;
        this.f12172f = list;
        this.f12173g = enumC2958x;
    }
}
