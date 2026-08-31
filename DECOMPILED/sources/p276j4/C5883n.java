package p276j4;

import java.util.List;

/* JADX INFO: renamed from: j4.n */
/* JADX INFO: loaded from: classes.dex */
final class C5883n extends AbstractC5868F.e.d.a.b {

    /* JADX INFO: renamed from: a */
    private final List f23354a;

    /* JADX INFO: renamed from: b */
    private final AbstractC5868F.e.d.a.b.c f23355b;

    /* JADX INFO: renamed from: c */
    private final AbstractC5868F.a f23356c;

    /* JADX INFO: renamed from: d */
    private final AbstractC5868F.e.d.a.b.AbstractC7703d f23357d;

    /* JADX INFO: renamed from: e */
    private final List f23358e;

    /* JADX INFO: renamed from: j4.n$b */
    static final class b extends AbstractC5868F.e.d.a.b.AbstractC7701b {

        /* JADX INFO: renamed from: a */
        private List f23359a;

        /* JADX INFO: renamed from: b */
        private AbstractC5868F.e.d.a.b.c f23360b;

        /* JADX INFO: renamed from: c */
        private AbstractC5868F.a f23361c;

        /* JADX INFO: renamed from: d */
        private AbstractC5868F.e.d.a.b.AbstractC7703d f23362d;

        /* JADX INFO: renamed from: e */
        private List f23363e;

        b() {
        }

        @Override // p276j4.AbstractC5868F.e.d.a.b.AbstractC7701b
        /* JADX INFO: renamed from: a */
        public AbstractC5868F.e.d.a.b mo26494a() {
            List list;
            AbstractC5868F.e.d.a.b.AbstractC7703d abstractC7703d = this.f23362d;
            if (abstractC7703d != null && (list = this.f23363e) != null) {
                return new C5883n(this.f23359a, this.f23360b, this.f23361c, abstractC7703d, list);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f23362d == null) {
                sb.append(" signal");
            }
            if (this.f23363e == null) {
                sb.append(" binaries");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // p276j4.AbstractC5868F.e.d.a.b.AbstractC7701b
        /* JADX INFO: renamed from: b */
        public AbstractC5868F.e.d.a.b.AbstractC7701b mo26495b(AbstractC5868F.a aVar) {
            this.f23361c = aVar;
            return this;
        }

        @Override // p276j4.AbstractC5868F.e.d.a.b.AbstractC7701b
        /* JADX INFO: renamed from: c */
        public AbstractC5868F.e.d.a.b.AbstractC7701b mo26496c(List list) {
            if (list == null) {
                throw new NullPointerException("Null binaries");
            }
            this.f23363e = list;
            return this;
        }

        @Override // p276j4.AbstractC5868F.e.d.a.b.AbstractC7701b
        /* JADX INFO: renamed from: d */
        public AbstractC5868F.e.d.a.b.AbstractC7701b mo26497d(AbstractC5868F.e.d.a.b.c cVar) {
            this.f23360b = cVar;
            return this;
        }

        @Override // p276j4.AbstractC5868F.e.d.a.b.AbstractC7701b
        /* JADX INFO: renamed from: e */
        public AbstractC5868F.e.d.a.b.AbstractC7701b mo26498e(AbstractC5868F.e.d.a.b.AbstractC7703d abstractC7703d) {
            if (abstractC7703d == null) {
                throw new NullPointerException("Null signal");
            }
            this.f23362d = abstractC7703d;
            return this;
        }

        @Override // p276j4.AbstractC5868F.e.d.a.b.AbstractC7701b
        /* JADX INFO: renamed from: f */
        public AbstractC5868F.e.d.a.b.AbstractC7701b mo26499f(List list) {
            this.f23359a = list;
            return this;
        }
    }

    @Override // p276j4.AbstractC5868F.e.d.a.b
    /* JADX INFO: renamed from: b */
    public AbstractC5868F.a mo26477b() {
        return this.f23356c;
    }

    @Override // p276j4.AbstractC5868F.e.d.a.b
    /* JADX INFO: renamed from: c */
    public List mo26478c() {
        return this.f23358e;
    }

    @Override // p276j4.AbstractC5868F.e.d.a.b
    /* JADX INFO: renamed from: d */
    public AbstractC5868F.e.d.a.b.c mo26479d() {
        return this.f23355b;
    }

    @Override // p276j4.AbstractC5868F.e.d.a.b
    /* JADX INFO: renamed from: e */
    public AbstractC5868F.e.d.a.b.AbstractC7703d mo26480e() {
        return this.f23357d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5868F.e.d.a.b) {
            AbstractC5868F.e.d.a.b bVar = (AbstractC5868F.e.d.a.b) obj;
            List list = this.f23354a;
            if (list != null ? list.equals(bVar.mo26481f()) : bVar.mo26481f() == null) {
                AbstractC5868F.e.d.a.b.c cVar = this.f23355b;
                if (cVar != null ? cVar.equals(bVar.mo26479d()) : bVar.mo26479d() == null) {
                    AbstractC5868F.a aVar = this.f23356c;
                    if (aVar != null ? aVar.equals(bVar.mo26477b()) : bVar.mo26477b() == null) {
                        if (this.f23357d.equals(bVar.mo26480e()) && this.f23358e.equals(bVar.mo26478c())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // p276j4.AbstractC5868F.e.d.a.b
    /* JADX INFO: renamed from: f */
    public List mo26481f() {
        return this.f23354a;
    }

    public int hashCode() {
        List list = this.f23354a;
        int iHashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        AbstractC5868F.e.d.a.b.c cVar = this.f23355b;
        int iHashCode2 = (iHashCode ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        AbstractC5868F.a aVar = this.f23356c;
        return ((((iHashCode2 ^ (aVar != null ? aVar.hashCode() : 0)) * 1000003) ^ this.f23357d.hashCode()) * 1000003) ^ this.f23358e.hashCode();
    }

    public String toString() {
        return "Execution{threads=" + this.f23354a + ", exception=" + this.f23355b + ", appExitInfo=" + this.f23356c + ", signal=" + this.f23357d + ", binaries=" + this.f23358e + "}";
    }

    private C5883n(List list, AbstractC5868F.e.d.a.b.c cVar, AbstractC5868F.a aVar, AbstractC5868F.e.d.a.b.AbstractC7703d abstractC7703d, List list2) {
        this.f23354a = list;
        this.f23355b = cVar;
        this.f23356c = aVar;
        this.f23357d = abstractC7703d;
        this.f23358e = list2;
    }
}
