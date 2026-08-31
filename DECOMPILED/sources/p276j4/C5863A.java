package p276j4;

/* JADX INFO: renamed from: j4.A */
/* JADX INFO: loaded from: classes.dex */
final class C5863A extends AbstractC5868F.e.f {

    /* JADX INFO: renamed from: a */
    private final String f23037a;

    /* JADX INFO: renamed from: j4.A$b */
    static final class b extends AbstractC5868F.e.f.a {

        /* JADX INFO: renamed from: a */
        private String f23038a;

        b() {
        }

        @Override // p276j4.AbstractC5868F.e.f.a
        /* JADX INFO: renamed from: a */
        public AbstractC5868F.e.f mo26280a() {
            String str = this.f23038a;
            if (str != null) {
                return new C5863A(str);
            }
            throw new IllegalStateException("Missing required properties: identifier");
        }

        @Override // p276j4.AbstractC5868F.e.f.a
        /* JADX INFO: renamed from: b */
        public AbstractC5868F.e.f.a mo26281b(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.f23038a = str;
            return this;
        }
    }

    @Override // p276j4.AbstractC5868F.e.f
    /* JADX INFO: renamed from: b */
    public String mo26279b() {
        return this.f23037a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5868F.e.f) {
            return this.f23037a.equals(((AbstractC5868F.e.f) obj).mo26279b());
        }
        return false;
    }

    public int hashCode() {
        return this.f23037a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "User{identifier=" + this.f23037a + "}";
    }

    private C5863A(String str) {
        this.f23037a = str;
    }
}
