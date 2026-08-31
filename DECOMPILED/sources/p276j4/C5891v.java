package p276j4;

/* JADX INFO: renamed from: j4.v */
/* JADX INFO: loaded from: classes.dex */
final class C5891v extends AbstractC5868F.e.d.AbstractC7710d {

    /* JADX INFO: renamed from: a */
    private final String f23431a;

    /* JADX INFO: renamed from: j4.v$b */
    static final class b extends AbstractC5868F.e.d.AbstractC7710d.a {

        /* JADX INFO: renamed from: a */
        private String f23432a;

        b() {
        }

        @Override // p276j4.AbstractC5868F.e.d.AbstractC7710d.a
        /* JADX INFO: renamed from: a */
        public AbstractC5868F.e.d.AbstractC7710d mo26573a() {
            String str = this.f23432a;
            if (str != null) {
                return new C5891v(str);
            }
            throw new IllegalStateException("Missing required properties: content");
        }

        @Override // p276j4.AbstractC5868F.e.d.AbstractC7710d.a
        /* JADX INFO: renamed from: b */
        public AbstractC5868F.e.d.AbstractC7710d.a mo26574b(String str) {
            if (str == null) {
                throw new NullPointerException("Null content");
            }
            this.f23432a = str;
            return this;
        }
    }

    @Override // p276j4.AbstractC5868F.e.d.AbstractC7710d
    /* JADX INFO: renamed from: b */
    public String mo26572b() {
        return this.f23431a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5868F.e.d.AbstractC7710d) {
            return this.f23431a.equals(((AbstractC5868F.e.d.AbstractC7710d) obj).mo26572b());
        }
        return false;
    }

    public int hashCode() {
        return this.f23431a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Log{content=" + this.f23431a + "}";
    }

    private C5891v(String str) {
        this.f23431a = str;
    }
}
