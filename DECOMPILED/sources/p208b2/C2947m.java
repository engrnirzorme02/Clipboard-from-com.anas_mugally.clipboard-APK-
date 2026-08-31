package p208b2;

/* JADX INFO: renamed from: b2.m */
/* JADX INFO: loaded from: classes.dex */
final class C2947m extends AbstractC2957w {

    /* JADX INFO: renamed from: a */
    private final AbstractC2957w.c f12182a;

    /* JADX INFO: renamed from: b */
    private final AbstractC2957w.b f12183b;

    /* JADX INFO: renamed from: b2.m$b */
    static final class b extends AbstractC2957w.a {

        /* JADX INFO: renamed from: a */
        private AbstractC2957w.c f12184a;

        /* JADX INFO: renamed from: b */
        private AbstractC2957w.b f12185b;

        b() {
        }

        @Override // p208b2.AbstractC2957w.a
        /* JADX INFO: renamed from: a */
        public AbstractC2957w mo14781a() {
            return new C2947m(this.f12184a, this.f12185b);
        }

        @Override // p208b2.AbstractC2957w.a
        /* JADX INFO: renamed from: b */
        public AbstractC2957w.a mo14782b(AbstractC2957w.b bVar) {
            this.f12185b = bVar;
            return this;
        }

        @Override // p208b2.AbstractC2957w.a
        /* JADX INFO: renamed from: c */
        public AbstractC2957w.a mo14783c(AbstractC2957w.c cVar) {
            this.f12184a = cVar;
            return this;
        }
    }

    @Override // p208b2.AbstractC2957w
    /* JADX INFO: renamed from: b */
    public AbstractC2957w.b mo14779b() {
        return this.f12183b;
    }

    @Override // p208b2.AbstractC2957w
    /* JADX INFO: renamed from: c */
    public AbstractC2957w.c mo14780c() {
        return this.f12182a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2957w) {
            AbstractC2957w abstractC2957w = (AbstractC2957w) obj;
            AbstractC2957w.c cVar = this.f12182a;
            if (cVar != null ? cVar.equals(abstractC2957w.mo14780c()) : abstractC2957w.mo14780c() == null) {
                AbstractC2957w.b bVar = this.f12183b;
                if (bVar != null ? bVar.equals(abstractC2957w.mo14779b()) : abstractC2957w.mo14779b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        AbstractC2957w.c cVar = this.f12182a;
        int iHashCode = ((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003;
        AbstractC2957w.b bVar = this.f12183b;
        return iHashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f12182a + ", mobileSubtype=" + this.f12183b + "}";
    }

    private C2947m(AbstractC2957w.c cVar, AbstractC2957w.b bVar) {
        this.f12182a = cVar;
        this.f12183b = bVar;
    }
}
