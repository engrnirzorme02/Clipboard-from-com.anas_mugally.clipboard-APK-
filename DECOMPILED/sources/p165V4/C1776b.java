package p165V4;

/* JADX INFO: renamed from: V4.b */
/* JADX INFO: loaded from: classes.dex */
final class C1776b extends AbstractC1785k {

    /* JADX INFO: renamed from: a */
    private final int f5829a;

    /* JADX INFO: renamed from: b */
    private final AbstractC1780f f5830b;

    C1776b(int i7, AbstractC1780f abstractC1780f) {
        this.f5829a = i7;
        if (abstractC1780f == null) {
            throw new NullPointerException("Null mutation");
        }
        this.f5830b = abstractC1780f;
    }

    @Override // p165V4.AbstractC1785k
    /* JADX INFO: renamed from: c */
    public int mo7451c() {
        return this.f5829a;
    }

    @Override // p165V4.AbstractC1785k
    /* JADX INFO: renamed from: d */
    public AbstractC1780f mo7452d() {
        return this.f5830b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1785k) {
            AbstractC1785k abstractC1785k = (AbstractC1785k) obj;
            if (this.f5829a == abstractC1785k.mo7451c() && this.f5830b.equals(abstractC1785k.mo7452d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f5829a ^ 1000003) * 1000003) ^ this.f5830b.hashCode();
    }

    public String toString() {
        return "Overlay{largestBatchId=" + this.f5829a + ", mutation=" + this.f5830b + "}";
    }
}
