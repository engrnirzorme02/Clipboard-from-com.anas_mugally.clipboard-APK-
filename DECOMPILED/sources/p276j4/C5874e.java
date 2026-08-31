package p276j4;

/* JADX INFO: renamed from: j4.e */
/* JADX INFO: loaded from: classes.dex */
final class C5874e extends AbstractC5868F.c {

    /* JADX INFO: renamed from: a */
    private final String f23258a;

    /* JADX INFO: renamed from: b */
    private final String f23259b;

    /* JADX INFO: renamed from: j4.e$b */
    static final class b extends AbstractC5868F.c.a {

        /* JADX INFO: renamed from: a */
        private String f23260a;

        /* JADX INFO: renamed from: b */
        private String f23261b;

        b() {
        }

        @Override // p276j4.AbstractC5868F.c.a
        /* JADX INFO: renamed from: a */
        public AbstractC5868F.c mo26369a() {
            String str;
            String str2 = this.f23260a;
            if (str2 != null && (str = this.f23261b) != null) {
                return new C5874e(str2, str);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f23260a == null) {
                sb.append(" key");
            }
            if (this.f23261b == null) {
                sb.append(" value");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // p276j4.AbstractC5868F.c.a
        /* JADX INFO: renamed from: b */
        public AbstractC5868F.c.a mo26370b(String str) {
            if (str == null) {
                throw new NullPointerException("Null key");
            }
            this.f23260a = str;
            return this;
        }

        @Override // p276j4.AbstractC5868F.c.a
        /* JADX INFO: renamed from: c */
        public AbstractC5868F.c.a mo26371c(String str) {
            if (str == null) {
                throw new NullPointerException("Null value");
            }
            this.f23261b = str;
            return this;
        }
    }

    @Override // p276j4.AbstractC5868F.c
    /* JADX INFO: renamed from: b */
    public String mo26367b() {
        return this.f23258a;
    }

    @Override // p276j4.AbstractC5868F.c
    /* JADX INFO: renamed from: c */
    public String mo26368c() {
        return this.f23259b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5868F.c) {
            AbstractC5868F.c cVar = (AbstractC5868F.c) obj;
            if (this.f23258a.equals(cVar.mo26367b()) && this.f23259b.equals(cVar.mo26368c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f23258a.hashCode() ^ 1000003) * 1000003) ^ this.f23259b.hashCode();
    }

    public String toString() {
        return "CustomAttribute{key=" + this.f23258a + ", value=" + this.f23259b + "}";
    }

    private C5874e(String str, String str2) {
        this.f23258a = str;
        this.f23259b = str2;
    }
}
