package p276j4;

import java.util.List;

/* JADX INFO: renamed from: j4.h */
/* JADX INFO: loaded from: classes.dex */
final class C5877h extends AbstractC5868F.e {

    /* JADX INFO: renamed from: a */
    private final String f23270a;

    /* JADX INFO: renamed from: b */
    private final String f23271b;

    /* JADX INFO: renamed from: c */
    private final String f23272c;

    /* JADX INFO: renamed from: d */
    private final long f23273d;

    /* JADX INFO: renamed from: e */
    private final Long f23274e;

    /* JADX INFO: renamed from: f */
    private final boolean f23275f;

    /* JADX INFO: renamed from: g */
    private final AbstractC5868F.e.a f23276g;

    /* JADX INFO: renamed from: h */
    private final AbstractC5868F.e.f f23277h;

    /* JADX INFO: renamed from: i */
    private final AbstractC5868F.e.AbstractC7712e f23278i;

    /* JADX INFO: renamed from: j */
    private final AbstractC5868F.e.c f23279j;

    /* JADX INFO: renamed from: k */
    private final List f23280k;

    /* JADX INFO: renamed from: l */
    private final int f23281l;

    /* JADX INFO: renamed from: j4.h$b */
    static final class b extends AbstractC5868F.e.b {

        /* JADX INFO: renamed from: a */
        private String f23282a;

        /* JADX INFO: renamed from: b */
        private String f23283b;

        /* JADX INFO: renamed from: c */
        private String f23284c;

        /* JADX INFO: renamed from: d */
        private long f23285d;

        /* JADX INFO: renamed from: e */
        private Long f23286e;

        /* JADX INFO: renamed from: f */
        private boolean f23287f;

        /* JADX INFO: renamed from: g */
        private AbstractC5868F.e.a f23288g;

        /* JADX INFO: renamed from: h */
        private AbstractC5868F.e.f f23289h;

        /* JADX INFO: renamed from: i */
        private AbstractC5868F.e.AbstractC7712e f23290i;

        /* JADX INFO: renamed from: j */
        private AbstractC5868F.e.c f23291j;

        /* JADX INFO: renamed from: k */
        private List f23292k;

        /* JADX INFO: renamed from: l */
        private int f23293l;

        /* JADX INFO: renamed from: m */
        private byte f23294m;

        @Override // p276j4.AbstractC5868F.e.b
        /* JADX INFO: renamed from: a */
        public AbstractC5868F.e mo26417a() {
            String str;
            String str2;
            AbstractC5868F.e.a aVar;
            if (this.f23294m == 7 && (str = this.f23282a) != null && (str2 = this.f23283b) != null && (aVar = this.f23288g) != null) {
                return new C5877h(str, str2, this.f23284c, this.f23285d, this.f23286e, this.f23287f, aVar, this.f23289h, this.f23290i, this.f23291j, this.f23292k, this.f23293l);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f23282a == null) {
                sb.append(" generator");
            }
            if (this.f23283b == null) {
                sb.append(" identifier");
            }
            if ((this.f23294m & 1) == 0) {
                sb.append(" startedAt");
            }
            if ((this.f23294m & 2) == 0) {
                sb.append(" crashed");
            }
            if (this.f23288g == null) {
                sb.append(" app");
            }
            if ((this.f23294m & 4) == 0) {
                sb.append(" generatorType");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // p276j4.AbstractC5868F.e.b
        /* JADX INFO: renamed from: b */
        public AbstractC5868F.e.b mo26418b(AbstractC5868F.e.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null app");
            }
            this.f23288g = aVar;
            return this;
        }

        @Override // p276j4.AbstractC5868F.e.b
        /* JADX INFO: renamed from: c */
        public AbstractC5868F.e.b mo26419c(String str) {
            this.f23284c = str;
            return this;
        }

        @Override // p276j4.AbstractC5868F.e.b
        /* JADX INFO: renamed from: d */
        public AbstractC5868F.e.b mo26420d(boolean z7) {
            this.f23287f = z7;
            this.f23294m = (byte) (this.f23294m | 2);
            return this;
        }

        @Override // p276j4.AbstractC5868F.e.b
        /* JADX INFO: renamed from: e */
        public AbstractC5868F.e.b mo26421e(AbstractC5868F.e.c cVar) {
            this.f23291j = cVar;
            return this;
        }

        @Override // p276j4.AbstractC5868F.e.b
        /* JADX INFO: renamed from: f */
        public AbstractC5868F.e.b mo26422f(Long l7) {
            this.f23286e = l7;
            return this;
        }

        @Override // p276j4.AbstractC5868F.e.b
        /* JADX INFO: renamed from: g */
        public AbstractC5868F.e.b mo26423g(List list) {
            this.f23292k = list;
            return this;
        }

        @Override // p276j4.AbstractC5868F.e.b
        /* JADX INFO: renamed from: h */
        public AbstractC5868F.e.b mo26424h(String str) {
            if (str == null) {
                throw new NullPointerException("Null generator");
            }
            this.f23282a = str;
            return this;
        }

        @Override // p276j4.AbstractC5868F.e.b
        /* JADX INFO: renamed from: i */
        public AbstractC5868F.e.b mo26425i(int i7) {
            this.f23293l = i7;
            this.f23294m = (byte) (this.f23294m | 4);
            return this;
        }

        @Override // p276j4.AbstractC5868F.e.b
        /* JADX INFO: renamed from: j */
        public AbstractC5868F.e.b mo26426j(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.f23283b = str;
            return this;
        }

        @Override // p276j4.AbstractC5868F.e.b
        /* JADX INFO: renamed from: l */
        public AbstractC5868F.e.b mo26428l(AbstractC5868F.e.AbstractC7712e abstractC7712e) {
            this.f23290i = abstractC7712e;
            return this;
        }

        @Override // p276j4.AbstractC5868F.e.b
        /* JADX INFO: renamed from: m */
        public AbstractC5868F.e.b mo26429m(long j7) {
            this.f23285d = j7;
            this.f23294m = (byte) (this.f23294m | 1);
            return this;
        }

        @Override // p276j4.AbstractC5868F.e.b
        /* JADX INFO: renamed from: n */
        public AbstractC5868F.e.b mo26430n(AbstractC5868F.e.f fVar) {
            this.f23289h = fVar;
            return this;
        }

        b() {
        }

        private b(AbstractC5868F.e eVar) {
            this.f23282a = eVar.mo26390g();
            this.f23283b = eVar.mo26392i();
            this.f23284c = eVar.mo26386c();
            this.f23285d = eVar.mo26395l();
            this.f23286e = eVar.mo26388e();
            this.f23287f = eVar.mo26397n();
            this.f23288g = eVar.mo26385b();
            this.f23289h = eVar.mo26396m();
            this.f23290i = eVar.mo26394k();
            this.f23291j = eVar.mo26387d();
            this.f23292k = eVar.mo26389f();
            this.f23293l = eVar.mo26391h();
            this.f23294m = (byte) 7;
        }
    }

    @Override // p276j4.AbstractC5868F.e
    /* JADX INFO: renamed from: b */
    public AbstractC5868F.e.a mo26385b() {
        return this.f23276g;
    }

    @Override // p276j4.AbstractC5868F.e
    /* JADX INFO: renamed from: c */
    public String mo26386c() {
        return this.f23272c;
    }

    @Override // p276j4.AbstractC5868F.e
    /* JADX INFO: renamed from: d */
    public AbstractC5868F.e.c mo26387d() {
        return this.f23279j;
    }

    @Override // p276j4.AbstractC5868F.e
    /* JADX INFO: renamed from: e */
    public Long mo26388e() {
        return this.f23274e;
    }

    public boolean equals(Object obj) {
        String str;
        Long l7;
        AbstractC5868F.e.f fVar;
        AbstractC5868F.e.AbstractC7712e abstractC7712e;
        AbstractC5868F.e.c cVar;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5868F.e) {
            AbstractC5868F.e eVar = (AbstractC5868F.e) obj;
            if (this.f23270a.equals(eVar.mo26390g()) && this.f23271b.equals(eVar.mo26392i()) && ((str = this.f23272c) != null ? str.equals(eVar.mo26386c()) : eVar.mo26386c() == null) && this.f23273d == eVar.mo26395l() && ((l7 = this.f23274e) != null ? l7.equals(eVar.mo26388e()) : eVar.mo26388e() == null) && this.f23275f == eVar.mo26397n() && this.f23276g.equals(eVar.mo26385b()) && ((fVar = this.f23277h) != null ? fVar.equals(eVar.mo26396m()) : eVar.mo26396m() == null) && ((abstractC7712e = this.f23278i) != null ? abstractC7712e.equals(eVar.mo26394k()) : eVar.mo26394k() == null) && ((cVar = this.f23279j) != null ? cVar.equals(eVar.mo26387d()) : eVar.mo26387d() == null) && ((list = this.f23280k) != null ? list.equals(eVar.mo26389f()) : eVar.mo26389f() == null) && this.f23281l == eVar.mo26391h()) {
                return true;
            }
        }
        return false;
    }

    @Override // p276j4.AbstractC5868F.e
    /* JADX INFO: renamed from: f */
    public List mo26389f() {
        return this.f23280k;
    }

    @Override // p276j4.AbstractC5868F.e
    /* JADX INFO: renamed from: g */
    public String mo26390g() {
        return this.f23270a;
    }

    @Override // p276j4.AbstractC5868F.e
    /* JADX INFO: renamed from: h */
    public int mo26391h() {
        return this.f23281l;
    }

    public int hashCode() {
        int iHashCode = (((this.f23270a.hashCode() ^ 1000003) * 1000003) ^ this.f23271b.hashCode()) * 1000003;
        String str = this.f23272c;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        long j7 = this.f23273d;
        int i7 = (((iHashCode ^ iHashCode2) * 1000003) ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003;
        Long l7 = this.f23274e;
        int iHashCode3 = (((((i7 ^ (l7 == null ? 0 : l7.hashCode())) * 1000003) ^ (this.f23275f ? 1231 : 1237)) * 1000003) ^ this.f23276g.hashCode()) * 1000003;
        AbstractC5868F.e.f fVar = this.f23277h;
        int iHashCode4 = (iHashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        AbstractC5868F.e.AbstractC7712e abstractC7712e = this.f23278i;
        int iHashCode5 = (iHashCode4 ^ (abstractC7712e == null ? 0 : abstractC7712e.hashCode())) * 1000003;
        AbstractC5868F.e.c cVar = this.f23279j;
        int iHashCode6 = (iHashCode5 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        List list = this.f23280k;
        return ((iHashCode6 ^ (list != null ? list.hashCode() : 0)) * 1000003) ^ this.f23281l;
    }

    @Override // p276j4.AbstractC5868F.e
    /* JADX INFO: renamed from: i */
    public String mo26392i() {
        return this.f23271b;
    }

    @Override // p276j4.AbstractC5868F.e
    /* JADX INFO: renamed from: k */
    public AbstractC5868F.e.AbstractC7712e mo26394k() {
        return this.f23278i;
    }

    @Override // p276j4.AbstractC5868F.e
    /* JADX INFO: renamed from: l */
    public long mo26395l() {
        return this.f23273d;
    }

    @Override // p276j4.AbstractC5868F.e
    /* JADX INFO: renamed from: m */
    public AbstractC5868F.e.f mo26396m() {
        return this.f23277h;
    }

    @Override // p276j4.AbstractC5868F.e
    /* JADX INFO: renamed from: n */
    public boolean mo26397n() {
        return this.f23275f;
    }

    @Override // p276j4.AbstractC5868F.e
    /* JADX INFO: renamed from: o */
    public AbstractC5868F.e.b mo26398o() {
        return new b(this);
    }

    public String toString() {
        return "Session{generator=" + this.f23270a + ", identifier=" + this.f23271b + ", appQualitySessionId=" + this.f23272c + ", startedAt=" + this.f23273d + ", endedAt=" + this.f23274e + ", crashed=" + this.f23275f + ", app=" + this.f23276g + ", user=" + this.f23277h + ", os=" + this.f23278i + ", device=" + this.f23279j + ", events=" + this.f23280k + ", generatorType=" + this.f23281l + "}";
    }

    private C5877h(String str, String str2, String str3, long j7, Long l7, boolean z7, AbstractC5868F.e.a aVar, AbstractC5868F.e.f fVar, AbstractC5868F.e.AbstractC7712e abstractC7712e, AbstractC5868F.e.c cVar, List list, int i7) {
        this.f23270a = str;
        this.f23271b = str2;
        this.f23272c = str3;
        this.f23273d = j7;
        this.f23274e = l7;
        this.f23275f = z7;
        this.f23276g = aVar;
        this.f23277h = fVar;
        this.f23278i = abstractC7712e;
        this.f23279j = cVar;
        this.f23280k = list;
        this.f23281l = i7;
    }
}
