package p276j4;

/* JADX INFO: renamed from: j4.x */
/* JADX INFO: loaded from: classes.dex */
final class C5893x extends AbstractC5868F.e.d.AbstractC7711e.b {

    /* JADX INFO: renamed from: a */
    private final String f23442a;

    /* JADX INFO: renamed from: b */
    private final String f23443b;

    /* JADX INFO: renamed from: j4.x$b */
    static final class b extends AbstractC5868F.e.d.AbstractC7711e.b.a {

        /* JADX INFO: renamed from: a */
        private String f23444a;

        /* JADX INFO: renamed from: b */
        private String f23445b;

        b() {
        }

        @Override // p276j4.AbstractC5868F.e.d.AbstractC7711e.b.a
        /* JADX INFO: renamed from: a */
        public AbstractC5868F.e.d.AbstractC7711e.b mo26588a() {
            String str;
            String str2 = this.f23444a;
            if (str2 != null && (str = this.f23445b) != null) {
                return new C5893x(str2, str);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f23444a == null) {
                sb.append(" rolloutId");
            }
            if (this.f23445b == null) {
                sb.append(" variantId");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // p276j4.AbstractC5868F.e.d.AbstractC7711e.b.a
        /* JADX INFO: renamed from: b */
        public AbstractC5868F.e.d.AbstractC7711e.b.a mo26589b(String str) {
            if (str == null) {
                throw new NullPointerException("Null rolloutId");
            }
            this.f23444a = str;
            return this;
        }

        @Override // p276j4.AbstractC5868F.e.d.AbstractC7711e.b.a
        /* JADX INFO: renamed from: c */
        public AbstractC5868F.e.d.AbstractC7711e.b.a mo26590c(String str) {
            if (str == null) {
                throw new NullPointerException("Null variantId");
            }
            this.f23445b = str;
            return this;
        }
    }

    @Override // p276j4.AbstractC5868F.e.d.AbstractC7711e.b
    /* JADX INFO: renamed from: b */
    public String mo26586b() {
        return this.f23442a;
    }

    @Override // p276j4.AbstractC5868F.e.d.AbstractC7711e.b
    /* JADX INFO: renamed from: c */
    public String mo26587c() {
        return this.f23443b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5868F.e.d.AbstractC7711e.b) {
            AbstractC5868F.e.d.AbstractC7711e.b bVar = (AbstractC5868F.e.d.AbstractC7711e.b) obj;
            if (this.f23442a.equals(bVar.mo26586b()) && this.f23443b.equals(bVar.mo26587c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f23442a.hashCode() ^ 1000003) * 1000003) ^ this.f23443b.hashCode();
    }

    public String toString() {
        return "RolloutVariant{rolloutId=" + this.f23442a + ", variantId=" + this.f23443b + "}";
    }

    private C5893x(String str, String str2) {
        this.f23442a = str;
        this.f23443b = str2;
    }
}
