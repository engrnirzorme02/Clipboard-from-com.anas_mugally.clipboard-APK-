package p208b2;

/* JADX INFO: renamed from: b2.e */
/* JADX INFO: loaded from: classes.dex */
final class C2939e extends AbstractC2949o {

    /* JADX INFO: renamed from: a */
    private final AbstractC2949o.b f12133a;

    /* JADX INFO: renamed from: b */
    private final AbstractC2935a f12134b;

    /* JADX INFO: renamed from: b2.e$b */
    static final class b extends AbstractC2949o.a {

        /* JADX INFO: renamed from: a */
        private AbstractC2949o.b f12135a;

        /* JADX INFO: renamed from: b */
        private AbstractC2935a f12136b;

        b() {
        }

        @Override // p208b2.AbstractC2949o.a
        /* JADX INFO: renamed from: a */
        public AbstractC2949o mo14725a() {
            return new C2939e(this.f12135a, this.f12136b);
        }

        @Override // p208b2.AbstractC2949o.a
        /* JADX INFO: renamed from: b */
        public AbstractC2949o.a mo14726b(AbstractC2935a abstractC2935a) {
            this.f12136b = abstractC2935a;
            return this;
        }

        @Override // p208b2.AbstractC2949o.a
        /* JADX INFO: renamed from: c */
        public AbstractC2949o.a mo14727c(AbstractC2949o.b bVar) {
            this.f12135a = bVar;
            return this;
        }
    }

    @Override // p208b2.AbstractC2949o
    /* JADX INFO: renamed from: b */
    public AbstractC2935a mo14723b() {
        return this.f12134b;
    }

    @Override // p208b2.AbstractC2949o
    /* JADX INFO: renamed from: c */
    public AbstractC2949o.b mo14724c() {
        return this.f12133a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2949o) {
            AbstractC2949o abstractC2949o = (AbstractC2949o) obj;
            AbstractC2949o.b bVar = this.f12133a;
            if (bVar != null ? bVar.equals(abstractC2949o.mo14724c()) : abstractC2949o.mo14724c() == null) {
                AbstractC2935a abstractC2935a = this.f12134b;
                if (abstractC2935a != null ? abstractC2935a.equals(abstractC2949o.mo14723b()) : abstractC2949o.mo14723b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        AbstractC2949o.b bVar = this.f12133a;
        int iHashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        AbstractC2935a abstractC2935a = this.f12134b;
        return iHashCode ^ (abstractC2935a != null ? abstractC2935a.hashCode() : 0);
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f12133a + ", androidClientInfo=" + this.f12134b + "}";
    }

    private C2939e(AbstractC2949o.b bVar, AbstractC2935a abstractC2935a) {
        this.f12133a = bVar;
        this.f12134b = abstractC2935a;
    }
}
