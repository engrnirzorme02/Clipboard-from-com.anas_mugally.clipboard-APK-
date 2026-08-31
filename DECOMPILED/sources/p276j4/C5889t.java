package p276j4;

/* JADX INFO: renamed from: j4.t */
/* JADX INFO: loaded from: classes.dex */
final class C5889t extends AbstractC5868F.e.d.a.c {

    /* JADX INFO: renamed from: a */
    private final String f23409a;

    /* JADX INFO: renamed from: b */
    private final int f23410b;

    /* JADX INFO: renamed from: c */
    private final int f23411c;

    /* JADX INFO: renamed from: d */
    private final boolean f23412d;

    /* JADX INFO: renamed from: j4.t$b */
    static final class b extends AbstractC5868F.e.d.a.c.AbstractC7709a {

        /* JADX INFO: renamed from: a */
        private String f23413a;

        /* JADX INFO: renamed from: b */
        private int f23414b;

        /* JADX INFO: renamed from: c */
        private int f23415c;

        /* JADX INFO: renamed from: d */
        private boolean f23416d;

        /* JADX INFO: renamed from: e */
        private byte f23417e;

        b() {
        }

        @Override // p276j4.AbstractC5868F.e.d.a.c.AbstractC7709a
        /* JADX INFO: renamed from: a */
        public AbstractC5868F.e.d.a.c mo26545a() {
            String str;
            if (this.f23417e == 7 && (str = this.f23413a) != null) {
                return new C5889t(str, this.f23414b, this.f23415c, this.f23416d);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f23413a == null) {
                sb.append(" processName");
            }
            if ((this.f23417e & 1) == 0) {
                sb.append(" pid");
            }
            if ((this.f23417e & 2) == 0) {
                sb.append(" importance");
            }
            if ((this.f23417e & 4) == 0) {
                sb.append(" defaultProcess");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // p276j4.AbstractC5868F.e.d.a.c.AbstractC7709a
        /* JADX INFO: renamed from: b */
        public AbstractC5868F.e.d.a.c.AbstractC7709a mo26546b(boolean z7) {
            this.f23416d = z7;
            this.f23417e = (byte) (this.f23417e | 4);
            return this;
        }

        @Override // p276j4.AbstractC5868F.e.d.a.c.AbstractC7709a
        /* JADX INFO: renamed from: c */
        public AbstractC5868F.e.d.a.c.AbstractC7709a mo26547c(int i7) {
            this.f23415c = i7;
            this.f23417e = (byte) (this.f23417e | 2);
            return this;
        }

        @Override // p276j4.AbstractC5868F.e.d.a.c.AbstractC7709a
        /* JADX INFO: renamed from: d */
        public AbstractC5868F.e.d.a.c.AbstractC7709a mo26548d(int i7) {
            this.f23414b = i7;
            this.f23417e = (byte) (this.f23417e | 1);
            return this;
        }

        @Override // p276j4.AbstractC5868F.e.d.a.c.AbstractC7709a
        /* JADX INFO: renamed from: e */
        public AbstractC5868F.e.d.a.c.AbstractC7709a mo26549e(String str) {
            if (str == null) {
                throw new NullPointerException("Null processName");
            }
            this.f23413a = str;
            return this;
        }
    }

    @Override // p276j4.AbstractC5868F.e.d.a.c
    /* JADX INFO: renamed from: b */
    public int mo26541b() {
        return this.f23411c;
    }

    @Override // p276j4.AbstractC5868F.e.d.a.c
    /* JADX INFO: renamed from: c */
    public int mo26542c() {
        return this.f23410b;
    }

    @Override // p276j4.AbstractC5868F.e.d.a.c
    /* JADX INFO: renamed from: d */
    public String mo26543d() {
        return this.f23409a;
    }

    @Override // p276j4.AbstractC5868F.e.d.a.c
    /* JADX INFO: renamed from: e */
    public boolean mo26544e() {
        return this.f23412d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5868F.e.d.a.c) {
            AbstractC5868F.e.d.a.c cVar = (AbstractC5868F.e.d.a.c) obj;
            if (this.f23409a.equals(cVar.mo26543d()) && this.f23410b == cVar.mo26542c() && this.f23411c == cVar.mo26541b() && this.f23412d == cVar.mo26544e()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f23409a.hashCode() ^ 1000003) * 1000003) ^ this.f23410b) * 1000003) ^ this.f23411c) * 1000003) ^ (this.f23412d ? 1231 : 1237);
    }

    public String toString() {
        return "ProcessDetails{processName=" + this.f23409a + ", pid=" + this.f23410b + ", importance=" + this.f23411c + ", defaultProcess=" + this.f23412d + "}";
    }

    private C5889t(String str, int i7, int i8, boolean z7) {
        this.f23409a = str;
        this.f23410b = i7;
        this.f23411c = i8;
        this.f23412d = z7;
    }
}
