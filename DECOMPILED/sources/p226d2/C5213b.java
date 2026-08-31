package p226d2;

/* JADX INFO: renamed from: d2.b */
/* JADX INFO: loaded from: classes.dex */
final class C5213b extends AbstractC5218g {

    /* JADX INFO: renamed from: a */
    private final AbstractC5218g.a f19923a;

    /* JADX INFO: renamed from: b */
    private final long f19924b;

    C5213b(AbstractC5218g.a aVar, long j7) {
        if (aVar == null) {
            throw new NullPointerException("Null status");
        }
        this.f19923a = aVar;
        this.f19924b = j7;
    }

    @Override // p226d2.AbstractC5218g
    /* JADX INFO: renamed from: b */
    public long mo24122b() {
        return this.f19924b;
    }

    @Override // p226d2.AbstractC5218g
    /* JADX INFO: renamed from: c */
    public AbstractC5218g.a mo24123c() {
        return this.f19923a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5218g) {
            AbstractC5218g abstractC5218g = (AbstractC5218g) obj;
            if (this.f19923a.equals(abstractC5218g.mo24123c()) && this.f19924b == abstractC5218g.mo24122b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f19923a.hashCode() ^ 1000003) * 1000003;
        long j7 = this.f19924b;
        return iHashCode ^ ((int) (j7 ^ (j7 >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f19923a + ", nextRequestWaitMillis=" + this.f19924b + "}";
    }
}
