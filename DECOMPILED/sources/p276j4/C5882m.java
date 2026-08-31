package p276j4;

import java.util.List;

/* JADX INFO: renamed from: j4.m */
/* JADX INFO: loaded from: classes.dex */
final class C5882m extends AbstractC5868F.e.d.a {

    /* JADX INFO: renamed from: a */
    private final AbstractC5868F.e.d.a.b f23339a;

    /* JADX INFO: renamed from: b */
    private final List f23340b;

    /* JADX INFO: renamed from: c */
    private final List f23341c;

    /* JADX INFO: renamed from: d */
    private final Boolean f23342d;

    /* JADX INFO: renamed from: e */
    private final AbstractC5868F.e.d.a.c f23343e;

    /* JADX INFO: renamed from: f */
    private final List f23344f;

    /* JADX INFO: renamed from: g */
    private final int f23345g;

    /* JADX INFO: renamed from: j4.m$b */
    static final class b extends AbstractC5868F.e.d.a.AbstractC7698a {

        /* JADX INFO: renamed from: a */
        private AbstractC5868F.e.d.a.b f23346a;

        /* JADX INFO: renamed from: b */
        private List f23347b;

        /* JADX INFO: renamed from: c */
        private List f23348c;

        /* JADX INFO: renamed from: d */
        private Boolean f23349d;

        /* JADX INFO: renamed from: e */
        private AbstractC5868F.e.d.a.c f23350e;

        /* JADX INFO: renamed from: f */
        private List f23351f;

        /* JADX INFO: renamed from: g */
        private int f23352g;

        /* JADX INFO: renamed from: h */
        private byte f23353h;

        @Override // p276j4.AbstractC5868F.e.d.a.AbstractC7698a
        /* JADX INFO: renamed from: a */
        public AbstractC5868F.e.d.a mo26468a() {
            AbstractC5868F.e.d.a.b bVar;
            if (this.f23353h == 1 && (bVar = this.f23346a) != null) {
                return new C5882m(bVar, this.f23347b, this.f23348c, this.f23349d, this.f23350e, this.f23351f, this.f23352g);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f23346a == null) {
                sb.append(" execution");
            }
            if ((1 & this.f23353h) == 0) {
                sb.append(" uiOrientation");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // p276j4.AbstractC5868F.e.d.a.AbstractC7698a
        /* JADX INFO: renamed from: b */
        public AbstractC5868F.e.d.a.AbstractC7698a mo26469b(List list) {
            this.f23351f = list;
            return this;
        }

        @Override // p276j4.AbstractC5868F.e.d.a.AbstractC7698a
        /* JADX INFO: renamed from: c */
        public AbstractC5868F.e.d.a.AbstractC7698a mo26470c(Boolean bool) {
            this.f23349d = bool;
            return this;
        }

        @Override // p276j4.AbstractC5868F.e.d.a.AbstractC7698a
        /* JADX INFO: renamed from: d */
        public AbstractC5868F.e.d.a.AbstractC7698a mo26471d(AbstractC5868F.e.d.a.c cVar) {
            this.f23350e = cVar;
            return this;
        }

        @Override // p276j4.AbstractC5868F.e.d.a.AbstractC7698a
        /* JADX INFO: renamed from: e */
        public AbstractC5868F.e.d.a.AbstractC7698a mo26472e(List list) {
            this.f23347b = list;
            return this;
        }

        @Override // p276j4.AbstractC5868F.e.d.a.AbstractC7698a
        /* JADX INFO: renamed from: f */
        public AbstractC5868F.e.d.a.AbstractC7698a mo26473f(AbstractC5868F.e.d.a.b bVar) {
            if (bVar == null) {
                throw new NullPointerException("Null execution");
            }
            this.f23346a = bVar;
            return this;
        }

        @Override // p276j4.AbstractC5868F.e.d.a.AbstractC7698a
        /* JADX INFO: renamed from: g */
        public AbstractC5868F.e.d.a.AbstractC7698a mo26474g(List list) {
            this.f23348c = list;
            return this;
        }

        @Override // p276j4.AbstractC5868F.e.d.a.AbstractC7698a
        /* JADX INFO: renamed from: h */
        public AbstractC5868F.e.d.a.AbstractC7698a mo26475h(int i7) {
            this.f23352g = i7;
            this.f23353h = (byte) (this.f23353h | 1);
            return this;
        }

        b() {
        }

        private b(AbstractC5868F.e.d.a aVar) {
            this.f23346a = aVar.mo26464f();
            this.f23347b = aVar.mo26463e();
            this.f23348c = aVar.mo26465g();
            this.f23349d = aVar.mo26461c();
            this.f23350e = aVar.mo26462d();
            this.f23351f = aVar.mo26460b();
            this.f23352g = aVar.mo26466h();
            this.f23353h = (byte) 1;
        }
    }

    @Override // p276j4.AbstractC5868F.e.d.a
    /* JADX INFO: renamed from: b */
    public List mo26460b() {
        return this.f23344f;
    }

    @Override // p276j4.AbstractC5868F.e.d.a
    /* JADX INFO: renamed from: c */
    public Boolean mo26461c() {
        return this.f23342d;
    }

    @Override // p276j4.AbstractC5868F.e.d.a
    /* JADX INFO: renamed from: d */
    public AbstractC5868F.e.d.a.c mo26462d() {
        return this.f23343e;
    }

    @Override // p276j4.AbstractC5868F.e.d.a
    /* JADX INFO: renamed from: e */
    public List mo26463e() {
        return this.f23340b;
    }

    public boolean equals(Object obj) {
        List list;
        List list2;
        Boolean bool;
        AbstractC5868F.e.d.a.c cVar;
        List list3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5868F.e.d.a) {
            AbstractC5868F.e.d.a aVar = (AbstractC5868F.e.d.a) obj;
            if (this.f23339a.equals(aVar.mo26464f()) && ((list = this.f23340b) != null ? list.equals(aVar.mo26463e()) : aVar.mo26463e() == null) && ((list2 = this.f23341c) != null ? list2.equals(aVar.mo26465g()) : aVar.mo26465g() == null) && ((bool = this.f23342d) != null ? bool.equals(aVar.mo26461c()) : aVar.mo26461c() == null) && ((cVar = this.f23343e) != null ? cVar.equals(aVar.mo26462d()) : aVar.mo26462d() == null) && ((list3 = this.f23344f) != null ? list3.equals(aVar.mo26460b()) : aVar.mo26460b() == null) && this.f23345g == aVar.mo26466h()) {
                return true;
            }
        }
        return false;
    }

    @Override // p276j4.AbstractC5868F.e.d.a
    /* JADX INFO: renamed from: f */
    public AbstractC5868F.e.d.a.b mo26464f() {
        return this.f23339a;
    }

    @Override // p276j4.AbstractC5868F.e.d.a
    /* JADX INFO: renamed from: g */
    public List mo26465g() {
        return this.f23341c;
    }

    @Override // p276j4.AbstractC5868F.e.d.a
    /* JADX INFO: renamed from: h */
    public int mo26466h() {
        return this.f23345g;
    }

    public int hashCode() {
        int iHashCode = (this.f23339a.hashCode() ^ 1000003) * 1000003;
        List list = this.f23340b;
        int iHashCode2 = (iHashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.f23341c;
        int iHashCode3 = (iHashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        Boolean bool = this.f23342d;
        int iHashCode4 = (iHashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        AbstractC5868F.e.d.a.c cVar = this.f23343e;
        int iHashCode5 = (iHashCode4 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        List list3 = this.f23344f;
        return ((iHashCode5 ^ (list3 != null ? list3.hashCode() : 0)) * 1000003) ^ this.f23345g;
    }

    @Override // p276j4.AbstractC5868F.e.d.a
    /* JADX INFO: renamed from: i */
    public AbstractC5868F.e.d.a.AbstractC7698a mo26467i() {
        return new b(this);
    }

    public String toString() {
        return "Application{execution=" + this.f23339a + ", customAttributes=" + this.f23340b + ", internalKeys=" + this.f23341c + ", background=" + this.f23342d + ", currentProcessDetails=" + this.f23343e + ", appProcessDetails=" + this.f23344f + ", uiOrientation=" + this.f23345g + "}";
    }

    private C5882m(AbstractC5868F.e.d.a.b bVar, List list, List list2, Boolean bool, AbstractC5868F.e.d.a.c cVar, List list3, int i7) {
        this.f23339a = bVar;
        this.f23340b = list;
        this.f23341c = list2;
        this.f23342d = bool;
        this.f23343e = cVar;
        this.f23344f = list3;
        this.f23345g = i7;
    }
}
