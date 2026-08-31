package p208b2;

/* JADX INFO: renamed from: b2.f */
/* JADX INFO: loaded from: classes.dex */
final class C2940f extends AbstractC2950p {

    /* JADX INFO: renamed from: a */
    private final AbstractC2953s f12137a;

    /* JADX INFO: renamed from: b */
    private final AbstractC2950p.b f12138b;

    /* JADX INFO: renamed from: b2.f$b */
    static final class b extends AbstractC2950p.a {

        /* JADX INFO: renamed from: a */
        private AbstractC2953s f12139a;

        /* JADX INFO: renamed from: b */
        private AbstractC2950p.b f12140b;

        b() {
        }

        @Override // p208b2.AbstractC2950p.a
        /* JADX INFO: renamed from: a */
        public AbstractC2950p mo14730a() {
            return new C2940f(this.f12139a, this.f12140b);
        }

        @Override // p208b2.AbstractC2950p.a
        /* JADX INFO: renamed from: b */
        public AbstractC2950p.a mo14731b(AbstractC2953s abstractC2953s) {
            this.f12139a = abstractC2953s;
            return this;
        }

        @Override // p208b2.AbstractC2950p.a
        /* JADX INFO: renamed from: c */
        public AbstractC2950p.a mo14732c(AbstractC2950p.b bVar) {
            this.f12140b = bVar;
            return this;
        }
    }

    @Override // p208b2.AbstractC2950p
    /* JADX INFO: renamed from: b */
    public AbstractC2953s mo14728b() {
        return this.f12137a;
    }

    @Override // p208b2.AbstractC2950p
    /* JADX INFO: renamed from: c */
    public AbstractC2950p.b mo14729c() {
        return this.f12138b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2950p) {
            AbstractC2950p abstractC2950p = (AbstractC2950p) obj;
            AbstractC2953s abstractC2953s = this.f12137a;
            if (abstractC2953s != null ? abstractC2953s.equals(abstractC2950p.mo14728b()) : abstractC2950p.mo14728b() == null) {
                AbstractC2950p.b bVar = this.f12138b;
                if (bVar != null ? bVar.equals(abstractC2950p.mo14729c()) : abstractC2950p.mo14729c() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        AbstractC2953s abstractC2953s = this.f12137a;
        int iHashCode = ((abstractC2953s == null ? 0 : abstractC2953s.hashCode()) ^ 1000003) * 1000003;
        AbstractC2950p.b bVar = this.f12138b;
        return iHashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "ComplianceData{privacyContext=" + this.f12137a + ", productIdOrigin=" + this.f12138b + "}";
    }

    private C2940f(AbstractC2953s abstractC2953s, AbstractC2950p.b bVar) {
        this.f12137a = abstractC2953s;
        this.f12138b = bVar;
    }
}
