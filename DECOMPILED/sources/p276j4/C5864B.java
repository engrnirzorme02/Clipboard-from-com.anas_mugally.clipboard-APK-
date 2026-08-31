package p276j4;

/* JADX INFO: renamed from: j4.B */
/* JADX INFO: loaded from: classes.dex */
final class C5864B extends AbstractC5869G {

    /* JADX INFO: renamed from: a */
    private final AbstractC5869G.a f23039a;

    /* JADX INFO: renamed from: b */
    private final AbstractC5869G.c f23040b;

    /* JADX INFO: renamed from: c */
    private final AbstractC5869G.b f23041c;

    C5864B(AbstractC5869G.a aVar, AbstractC5869G.c cVar, AbstractC5869G.b bVar) {
        if (aVar == null) {
            throw new NullPointerException("Null appData");
        }
        this.f23039a = aVar;
        if (cVar == null) {
            throw new NullPointerException("Null osData");
        }
        this.f23040b = cVar;
        if (bVar == null) {
            throw new NullPointerException("Null deviceData");
        }
        this.f23041c = bVar;
    }

    @Override // p276j4.AbstractC5869G
    /* JADX INFO: renamed from: a */
    public AbstractC5869G.a mo26282a() {
        return this.f23039a;
    }

    @Override // p276j4.AbstractC5869G
    /* JADX INFO: renamed from: c */
    public AbstractC5869G.b mo26283c() {
        return this.f23041c;
    }

    @Override // p276j4.AbstractC5869G
    /* JADX INFO: renamed from: d */
    public AbstractC5869G.c mo26284d() {
        return this.f23040b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5869G) {
            AbstractC5869G abstractC5869G = (AbstractC5869G) obj;
            if (this.f23039a.equals(abstractC5869G.mo26282a()) && this.f23040b.equals(abstractC5869G.mo26284d()) && this.f23041c.equals(abstractC5869G.mo26283c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f23039a.hashCode() ^ 1000003) * 1000003) ^ this.f23040b.hashCode()) * 1000003) ^ this.f23041c.hashCode();
    }

    public String toString() {
        return "StaticSessionData{appData=" + this.f23039a + ", osData=" + this.f23040b + ", deviceData=" + this.f23041c + "}";
    }
}
