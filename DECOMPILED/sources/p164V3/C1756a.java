package p164V3;

/* JADX INFO: renamed from: V3.a */
/* JADX INFO: loaded from: classes.dex */
final class C1756a extends AbstractC1773r {

    /* JADX INFO: renamed from: a */
    private final long f5787a;

    /* JADX INFO: renamed from: b */
    private final long f5788b;

    /* JADX INFO: renamed from: c */
    private final long f5789c;

    C1756a(long j7, long j8, long j9) {
        this.f5787a = j7;
        this.f5788b = j8;
        this.f5789c = j9;
    }

    @Override // p164V3.AbstractC1773r
    /* JADX INFO: renamed from: b */
    public long mo7382b() {
        return this.f5788b;
    }

    @Override // p164V3.AbstractC1773r
    /* JADX INFO: renamed from: c */
    public long mo7383c() {
        return this.f5787a;
    }

    @Override // p164V3.AbstractC1773r
    /* JADX INFO: renamed from: d */
    public long mo7384d() {
        return this.f5789c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1773r) {
            AbstractC1773r abstractC1773r = (AbstractC1773r) obj;
            if (this.f5787a == abstractC1773r.mo7383c() && this.f5788b == abstractC1773r.mo7382b() && this.f5789c == abstractC1773r.mo7384d()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j7 = this.f5787a;
        long j8 = this.f5788b;
        int i7 = (((((int) (j7 ^ (j7 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        long j9 = this.f5789c;
        return i7 ^ ((int) ((j9 >>> 32) ^ j9));
    }

    public String toString() {
        return "StartupTime{epochMillis=" + this.f5787a + ", elapsedRealtime=" + this.f5788b + ", uptimeMillis=" + this.f5789c + "}";
    }
}
