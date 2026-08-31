package p158U4;

/* JADX INFO: renamed from: U4.c */
/* JADX INFO: loaded from: classes.dex */
final class C1679c extends AbstractC1692p.b {

    /* JADX INFO: renamed from: a */
    private final long f5592a;

    /* JADX INFO: renamed from: b */
    private final AbstractC1692p.a f5593b;

    C1679c(long j7, AbstractC1692p.a aVar) {
        this.f5592a = j7;
        if (aVar == null) {
            throw new NullPointerException("Null offset");
        }
        this.f5593b = aVar;
    }

    @Override // p158U4.AbstractC1692p.b
    /* JADX INFO: renamed from: c */
    public AbstractC1692p.a mo7048c() {
        return this.f5593b;
    }

    @Override // p158U4.AbstractC1692p.b
    /* JADX INFO: renamed from: d */
    public long mo7049d() {
        return this.f5592a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1692p.b) {
            AbstractC1692p.b bVar = (AbstractC1692p.b) obj;
            if (this.f5592a == bVar.mo7049d() && this.f5593b.equals(bVar.mo7048c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j7 = this.f5592a;
        return ((((int) (j7 ^ (j7 >>> 32))) ^ 1000003) * 1000003) ^ this.f5593b.hashCode();
    }

    public String toString() {
        return "IndexState{sequenceNumber=" + this.f5592a + ", offset=" + this.f5593b + "}";
    }
}
