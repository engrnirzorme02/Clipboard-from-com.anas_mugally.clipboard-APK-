package p276j4;

import java.util.List;

/* JADX INFO: renamed from: j4.p */
/* JADX INFO: loaded from: classes.dex */
final class C5885p extends AbstractC5868F.e.d.a.b.c {

    /* JADX INFO: renamed from: a */
    private final String f23373a;

    /* JADX INFO: renamed from: b */
    private final String f23374b;

    /* JADX INFO: renamed from: c */
    private final List f23375c;

    /* JADX INFO: renamed from: d */
    private final AbstractC5868F.e.d.a.b.c f23376d;

    /* JADX INFO: renamed from: e */
    private final int f23377e;

    /* JADX INFO: renamed from: j4.p$b */
    static final class b extends AbstractC5868F.e.d.a.b.c.AbstractC7702a {

        /* JADX INFO: renamed from: a */
        private String f23378a;

        /* JADX INFO: renamed from: b */
        private String f23379b;

        /* JADX INFO: renamed from: c */
        private List f23380c;

        /* JADX INFO: renamed from: d */
        private AbstractC5868F.e.d.a.b.c f23381d;

        /* JADX INFO: renamed from: e */
        private int f23382e;

        /* JADX INFO: renamed from: f */
        private byte f23383f;

        b() {
        }

        @Override // p276j4.AbstractC5868F.e.d.a.b.c.AbstractC7702a
        /* JADX INFO: renamed from: a */
        public AbstractC5868F.e.d.a.b.c mo26506a() {
            String str;
            List list;
            if (this.f23383f == 1 && (str = this.f23378a) != null && (list = this.f23380c) != null) {
                return new C5885p(str, this.f23379b, list, this.f23381d, this.f23382e);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f23378a == null) {
                sb.append(" type");
            }
            if (this.f23380c == null) {
                sb.append(" frames");
            }
            if ((1 & this.f23383f) == 0) {
                sb.append(" overflowCount");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // p276j4.AbstractC5868F.e.d.a.b.c.AbstractC7702a
        /* JADX INFO: renamed from: b */
        public AbstractC5868F.e.d.a.b.c.AbstractC7702a mo26507b(AbstractC5868F.e.d.a.b.c cVar) {
            this.f23381d = cVar;
            return this;
        }

        @Override // p276j4.AbstractC5868F.e.d.a.b.c.AbstractC7702a
        /* JADX INFO: renamed from: c */
        public AbstractC5868F.e.d.a.b.c.AbstractC7702a mo26508c(List list) {
            if (list == null) {
                throw new NullPointerException("Null frames");
            }
            this.f23380c = list;
            return this;
        }

        @Override // p276j4.AbstractC5868F.e.d.a.b.c.AbstractC7702a
        /* JADX INFO: renamed from: d */
        public AbstractC5868F.e.d.a.b.c.AbstractC7702a mo26509d(int i7) {
            this.f23382e = i7;
            this.f23383f = (byte) (this.f23383f | 1);
            return this;
        }

        @Override // p276j4.AbstractC5868F.e.d.a.b.c.AbstractC7702a
        /* JADX INFO: renamed from: e */
        public AbstractC5868F.e.d.a.b.c.AbstractC7702a mo26510e(String str) {
            this.f23379b = str;
            return this;
        }

        @Override // p276j4.AbstractC5868F.e.d.a.b.c.AbstractC7702a
        /* JADX INFO: renamed from: f */
        public AbstractC5868F.e.d.a.b.c.AbstractC7702a mo26511f(String str) {
            if (str == null) {
                throw new NullPointerException("Null type");
            }
            this.f23378a = str;
            return this;
        }
    }

    @Override // p276j4.AbstractC5868F.e.d.a.b.c
    /* JADX INFO: renamed from: b */
    public AbstractC5868F.e.d.a.b.c mo26501b() {
        return this.f23376d;
    }

    @Override // p276j4.AbstractC5868F.e.d.a.b.c
    /* JADX INFO: renamed from: c */
    public List mo26502c() {
        return this.f23375c;
    }

    @Override // p276j4.AbstractC5868F.e.d.a.b.c
    /* JADX INFO: renamed from: d */
    public int mo26503d() {
        return this.f23377e;
    }

    @Override // p276j4.AbstractC5868F.e.d.a.b.c
    /* JADX INFO: renamed from: e */
    public String mo26504e() {
        return this.f23374b;
    }

    public boolean equals(Object obj) {
        String str;
        AbstractC5868F.e.d.a.b.c cVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5868F.e.d.a.b.c) {
            AbstractC5868F.e.d.a.b.c cVar2 = (AbstractC5868F.e.d.a.b.c) obj;
            if (this.f23373a.equals(cVar2.mo26505f()) && ((str = this.f23374b) != null ? str.equals(cVar2.mo26504e()) : cVar2.mo26504e() == null) && this.f23375c.equals(cVar2.mo26502c()) && ((cVar = this.f23376d) != null ? cVar.equals(cVar2.mo26501b()) : cVar2.mo26501b() == null) && this.f23377e == cVar2.mo26503d()) {
                return true;
            }
        }
        return false;
    }

    @Override // p276j4.AbstractC5868F.e.d.a.b.c
    /* JADX INFO: renamed from: f */
    public String mo26505f() {
        return this.f23373a;
    }

    public int hashCode() {
        int iHashCode = (this.f23373a.hashCode() ^ 1000003) * 1000003;
        String str = this.f23374b;
        int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f23375c.hashCode()) * 1000003;
        AbstractC5868F.e.d.a.b.c cVar = this.f23376d;
        return ((iHashCode2 ^ (cVar != null ? cVar.hashCode() : 0)) * 1000003) ^ this.f23377e;
    }

    public String toString() {
        return "Exception{type=" + this.f23373a + ", reason=" + this.f23374b + ", frames=" + this.f23375c + ", causedBy=" + this.f23376d + ", overflowCount=" + this.f23377e + "}";
    }

    private C5885p(String str, String str2, List list, AbstractC5868F.e.d.a.b.c cVar, int i7) {
        this.f23373a = str;
        this.f23374b = str2;
        this.f23375c = list;
        this.f23376d = cVar;
        this.f23377e = i7;
    }
}
