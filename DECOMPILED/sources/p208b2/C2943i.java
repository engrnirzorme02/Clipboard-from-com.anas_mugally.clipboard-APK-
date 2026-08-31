package p208b2;

/* JADX INFO: renamed from: b2.i */
/* JADX INFO: loaded from: classes.dex */
final class C2943i extends AbstractC2953s {

    /* JADX INFO: renamed from: a */
    private final AbstractC2952r f12147a;

    /* JADX INFO: renamed from: b2.i$b */
    static final class b extends AbstractC2953s.a {

        /* JADX INFO: renamed from: a */
        private AbstractC2952r f12148a;

        b() {
        }

        @Override // p208b2.AbstractC2953s.a
        /* JADX INFO: renamed from: a */
        public AbstractC2953s mo14742a() {
            return new C2943i(this.f12148a);
        }

        @Override // p208b2.AbstractC2953s.a
        /* JADX INFO: renamed from: b */
        public AbstractC2953s.a mo14743b(AbstractC2952r abstractC2952r) {
            this.f12148a = abstractC2952r;
            return this;
        }
    }

    @Override // p208b2.AbstractC2953s
    /* JADX INFO: renamed from: b */
    public AbstractC2952r mo14741b() {
        return this.f12147a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2953s)) {
            return false;
        }
        AbstractC2952r abstractC2952r = this.f12147a;
        AbstractC2952r abstractC2952rMo14741b = ((AbstractC2953s) obj).mo14741b();
        if (abstractC2952r == null) {
            return abstractC2952rMo14741b == null;
        }
        return abstractC2952r.equals(abstractC2952rMo14741b);
    }

    public int hashCode() {
        AbstractC2952r abstractC2952r = this.f12147a;
        return (abstractC2952r == null ? 0 : abstractC2952r.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "ExternalPrivacyContext{prequest=" + this.f12147a + "}";
    }

    private C2943i(AbstractC2952r abstractC2952r) {
        this.f12147a = abstractC2952r;
    }
}
