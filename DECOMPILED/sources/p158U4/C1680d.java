package p158U4;

/* JADX INFO: renamed from: U4.d */
/* JADX INFO: loaded from: classes.dex */
final class C1680d extends AbstractC1692p.c {

    /* JADX INFO: renamed from: a */
    private final C1693q f5594a;

    /* JADX INFO: renamed from: b */
    private final AbstractC1692p.c.a f5595b;

    C1680d(C1693q c1693q, AbstractC1692p.c.a aVar) {
        if (c1693q == null) {
            throw new NullPointerException("Null fieldPath");
        }
        this.f5594a = c1693q;
        if (aVar == null) {
            throw new NullPointerException("Null kind");
        }
        this.f5595b = aVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1692p.c) {
            AbstractC1692p.c cVar = (AbstractC1692p.c) obj;
            if (this.f5594a.equals(cVar.mo7050h()) && this.f5595b.equals(cVar.mo7051j())) {
                return true;
            }
        }
        return false;
    }

    @Override // p158U4.AbstractC1692p.c
    /* JADX INFO: renamed from: h */
    public C1693q mo7050h() {
        return this.f5594a;
    }

    public int hashCode() {
        return ((this.f5594a.hashCode() ^ 1000003) * 1000003) ^ this.f5595b.hashCode();
    }

    @Override // p158U4.AbstractC1692p.c
    /* JADX INFO: renamed from: j */
    public AbstractC1692p.c.a mo7051j() {
        return this.f5595b;
    }

    public String toString() {
        return "Segment{fieldPath=" + this.f5594a + ", kind=" + this.f5595b + "}";
    }
}
