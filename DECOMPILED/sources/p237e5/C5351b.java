package p237e5;

/* JADX INFO: renamed from: e5.b */
/* JADX INFO: loaded from: classes.dex */
final class C5351b extends AbstractC5355f {

    /* JADX INFO: renamed from: a */
    private final String f20466a;

    /* JADX INFO: renamed from: b */
    private final long f20467b;

    /* JADX INFO: renamed from: c */
    private final AbstractC5355f.b f20468c;

    /* JADX INFO: renamed from: e5.b$b */
    static final class b extends AbstractC5355f.a {

        /* JADX INFO: renamed from: a */
        private String f20469a;

        /* JADX INFO: renamed from: b */
        private Long f20470b;

        /* JADX INFO: renamed from: c */
        private AbstractC5355f.b f20471c;

        b() {
        }

        @Override // p237e5.AbstractC5355f.a
        /* JADX INFO: renamed from: a */
        public AbstractC5355f mo24351a() {
            String str = "";
            if (this.f20470b == null) {
                str = " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new C5351b(this.f20469a, this.f20470b.longValue(), this.f20471c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p237e5.AbstractC5355f.a
        /* JADX INFO: renamed from: b */
        public AbstractC5355f.a mo24352b(AbstractC5355f.b bVar) {
            this.f20471c = bVar;
            return this;
        }

        @Override // p237e5.AbstractC5355f.a
        /* JADX INFO: renamed from: c */
        public AbstractC5355f.a mo24353c(String str) {
            this.f20469a = str;
            return this;
        }

        @Override // p237e5.AbstractC5355f.a
        /* JADX INFO: renamed from: d */
        public AbstractC5355f.a mo24354d(long j7) {
            this.f20470b = Long.valueOf(j7);
            return this;
        }
    }

    @Override // p237e5.AbstractC5355f
    /* JADX INFO: renamed from: b */
    public AbstractC5355f.b mo24348b() {
        return this.f20468c;
    }

    @Override // p237e5.AbstractC5355f
    /* JADX INFO: renamed from: c */
    public String mo24349c() {
        return this.f20466a;
    }

    @Override // p237e5.AbstractC5355f
    /* JADX INFO: renamed from: d */
    public long mo24350d() {
        return this.f20467b;
    }

    public boolean equals(Object obj) {
        AbstractC5355f.b bVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5355f) {
            AbstractC5355f abstractC5355f = (AbstractC5355f) obj;
            String str = this.f20466a;
            if (str != null ? str.equals(abstractC5355f.mo24349c()) : abstractC5355f.mo24349c() == null) {
                if (this.f20467b == abstractC5355f.mo24350d() && ((bVar = this.f20468c) != null ? bVar.equals(abstractC5355f.mo24348b()) : abstractC5355f.mo24348b() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f20466a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j7 = this.f20467b;
        int i7 = (((iHashCode ^ 1000003) * 1000003) ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003;
        AbstractC5355f.b bVar = this.f20468c;
        return i7 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "TokenResult{token=" + this.f20466a + ", tokenExpirationTimestamp=" + this.f20467b + ", responseCode=" + this.f20468c + "}";
    }

    private C5351b(String str, long j7, AbstractC5355f.b bVar) {
        this.f20466a = str;
        this.f20467b = j7;
        this.f20468c = bVar;
    }
}
