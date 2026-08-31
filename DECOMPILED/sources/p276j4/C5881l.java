package p276j4;

/* JADX INFO: renamed from: j4.l */
/* JADX INFO: loaded from: classes.dex */
final class C5881l extends AbstractC5868F.e.d {

    /* JADX INFO: renamed from: a */
    private final long f23326a;

    /* JADX INFO: renamed from: b */
    private final String f23327b;

    /* JADX INFO: renamed from: c */
    private final AbstractC5868F.e.d.a f23328c;

    /* JADX INFO: renamed from: d */
    private final AbstractC5868F.e.d.c f23329d;

    /* JADX INFO: renamed from: e */
    private final AbstractC5868F.e.d.AbstractC7710d f23330e;

    /* JADX INFO: renamed from: f */
    private final AbstractC5868F.e.d.f f23331f;

    /* JADX INFO: renamed from: j4.l$b */
    static final class b extends AbstractC5868F.e.d.b {

        /* JADX INFO: renamed from: a */
        private long f23332a;

        /* JADX INFO: renamed from: b */
        private String f23333b;

        /* JADX INFO: renamed from: c */
        private AbstractC5868F.e.d.a f23334c;

        /* JADX INFO: renamed from: d */
        private AbstractC5868F.e.d.c f23335d;

        /* JADX INFO: renamed from: e */
        private AbstractC5868F.e.d.AbstractC7710d f23336e;

        /* JADX INFO: renamed from: f */
        private AbstractC5868F.e.d.f f23337f;

        /* JADX INFO: renamed from: g */
        private byte f23338g;

        @Override // p276j4.AbstractC5868F.e.d.b
        /* JADX INFO: renamed from: a */
        public AbstractC5868F.e.d mo26550a() {
            String str;
            AbstractC5868F.e.d.a aVar;
            AbstractC5868F.e.d.c cVar;
            if (this.f23338g == 1 && (str = this.f23333b) != null && (aVar = this.f23334c) != null && (cVar = this.f23335d) != null) {
                return new C5881l(this.f23332a, str, aVar, cVar, this.f23336e, this.f23337f);
            }
            StringBuilder sb = new StringBuilder();
            if ((1 & this.f23338g) == 0) {
                sb.append(" timestamp");
            }
            if (this.f23333b == null) {
                sb.append(" type");
            }
            if (this.f23334c == null) {
                sb.append(" app");
            }
            if (this.f23335d == null) {
                sb.append(" device");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // p276j4.AbstractC5868F.e.d.b
        /* JADX INFO: renamed from: b */
        public AbstractC5868F.e.d.b mo26551b(AbstractC5868F.e.d.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null app");
            }
            this.f23334c = aVar;
            return this;
        }

        @Override // p276j4.AbstractC5868F.e.d.b
        /* JADX INFO: renamed from: c */
        public AbstractC5868F.e.d.b mo26552c(AbstractC5868F.e.d.c cVar) {
            if (cVar == null) {
                throw new NullPointerException("Null device");
            }
            this.f23335d = cVar;
            return this;
        }

        @Override // p276j4.AbstractC5868F.e.d.b
        /* JADX INFO: renamed from: d */
        public AbstractC5868F.e.d.b mo26553d(AbstractC5868F.e.d.AbstractC7710d abstractC7710d) {
            this.f23336e = abstractC7710d;
            return this;
        }

        @Override // p276j4.AbstractC5868F.e.d.b
        /* JADX INFO: renamed from: e */
        public AbstractC5868F.e.d.b mo26554e(AbstractC5868F.e.d.f fVar) {
            this.f23337f = fVar;
            return this;
        }

        @Override // p276j4.AbstractC5868F.e.d.b
        /* JADX INFO: renamed from: f */
        public AbstractC5868F.e.d.b mo26555f(long j7) {
            this.f23332a = j7;
            this.f23338g = (byte) (this.f23338g | 1);
            return this;
        }

        @Override // p276j4.AbstractC5868F.e.d.b
        /* JADX INFO: renamed from: g */
        public AbstractC5868F.e.d.b mo26556g(String str) {
            if (str == null) {
                throw new NullPointerException("Null type");
            }
            this.f23333b = str;
            return this;
        }

        b() {
        }

        private b(AbstractC5868F.e.d dVar) {
            this.f23332a = dVar.mo26456f();
            this.f23333b = dVar.mo26457g();
            this.f23334c = dVar.mo26452b();
            this.f23335d = dVar.mo26453c();
            this.f23336e = dVar.mo26454d();
            this.f23337f = dVar.mo26455e();
            this.f23338g = (byte) 1;
        }
    }

    @Override // p276j4.AbstractC5868F.e.d
    /* JADX INFO: renamed from: b */
    public AbstractC5868F.e.d.a mo26452b() {
        return this.f23328c;
    }

    @Override // p276j4.AbstractC5868F.e.d
    /* JADX INFO: renamed from: c */
    public AbstractC5868F.e.d.c mo26453c() {
        return this.f23329d;
    }

    @Override // p276j4.AbstractC5868F.e.d
    /* JADX INFO: renamed from: d */
    public AbstractC5868F.e.d.AbstractC7710d mo26454d() {
        return this.f23330e;
    }

    @Override // p276j4.AbstractC5868F.e.d
    /* JADX INFO: renamed from: e */
    public AbstractC5868F.e.d.f mo26455e() {
        return this.f23331f;
    }

    public boolean equals(Object obj) {
        AbstractC5868F.e.d.AbstractC7710d abstractC7710d;
        AbstractC5868F.e.d.f fVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5868F.e.d) {
            AbstractC5868F.e.d dVar = (AbstractC5868F.e.d) obj;
            if (this.f23326a == dVar.mo26456f() && this.f23327b.equals(dVar.mo26457g()) && this.f23328c.equals(dVar.mo26452b()) && this.f23329d.equals(dVar.mo26453c()) && ((abstractC7710d = this.f23330e) != null ? abstractC7710d.equals(dVar.mo26454d()) : dVar.mo26454d() == null) && ((fVar = this.f23331f) != null ? fVar.equals(dVar.mo26455e()) : dVar.mo26455e() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // p276j4.AbstractC5868F.e.d
    /* JADX INFO: renamed from: f */
    public long mo26456f() {
        return this.f23326a;
    }

    @Override // p276j4.AbstractC5868F.e.d
    /* JADX INFO: renamed from: g */
    public String mo26457g() {
        return this.f23327b;
    }

    @Override // p276j4.AbstractC5868F.e.d
    /* JADX INFO: renamed from: h */
    public AbstractC5868F.e.d.b mo26458h() {
        return new b(this);
    }

    public int hashCode() {
        long j7 = this.f23326a;
        int iHashCode = (((((((((int) (j7 ^ (j7 >>> 32))) ^ 1000003) * 1000003) ^ this.f23327b.hashCode()) * 1000003) ^ this.f23328c.hashCode()) * 1000003) ^ this.f23329d.hashCode()) * 1000003;
        AbstractC5868F.e.d.AbstractC7710d abstractC7710d = this.f23330e;
        int iHashCode2 = (iHashCode ^ (abstractC7710d == null ? 0 : abstractC7710d.hashCode())) * 1000003;
        AbstractC5868F.e.d.f fVar = this.f23331f;
        return iHashCode2 ^ (fVar != null ? fVar.hashCode() : 0);
    }

    public String toString() {
        return "Event{timestamp=" + this.f23326a + ", type=" + this.f23327b + ", app=" + this.f23328c + ", device=" + this.f23329d + ", log=" + this.f23330e + ", rollouts=" + this.f23331f + "}";
    }

    private C5881l(long j7, String str, AbstractC5868F.e.d.a aVar, AbstractC5868F.e.d.c cVar, AbstractC5868F.e.d.AbstractC7710d abstractC7710d, AbstractC5868F.e.d.f fVar) {
        this.f23326a = j7;
        this.f23327b = str;
        this.f23328c = aVar;
        this.f23329d = cVar;
        this.f23330e = abstractC7710d;
        this.f23331f = fVar;
    }
}
