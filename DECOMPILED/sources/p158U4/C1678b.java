package p158U4;

/* JADX INFO: renamed from: U4.b */
/* JADX INFO: loaded from: classes.dex */
final class C1678b extends AbstractC1692p.a {

    /* JADX INFO: renamed from: c */
    private final C1698v f5589c;

    /* JADX INFO: renamed from: d */
    private final C1687k f5590d;

    /* JADX INFO: renamed from: e */
    private final int f5591e;

    C1678b(C1698v c1698v, C1687k c1687k, int i7) {
        if (c1698v == null) {
            throw new NullPointerException("Null readTime");
        }
        this.f5589c = c1698v;
        if (c1687k == null) {
            throw new NullPointerException("Null documentKey");
        }
        this.f5590d = c1687k;
        this.f5591e = i7;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1692p.a) {
            AbstractC1692p.a aVar = (AbstractC1692p.a) obj;
            if (this.f5589c.equals(aVar.mo7047o()) && this.f5590d.equals(aVar.mo7045m()) && this.f5591e == aVar.mo7046n()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f5589c.hashCode() ^ 1000003) * 1000003) ^ this.f5590d.hashCode()) * 1000003) ^ this.f5591e;
    }

    @Override // p158U4.AbstractC1692p.a
    /* JADX INFO: renamed from: m */
    public C1687k mo7045m() {
        return this.f5590d;
    }

    @Override // p158U4.AbstractC1692p.a
    /* JADX INFO: renamed from: n */
    public int mo7046n() {
        return this.f5591e;
    }

    @Override // p158U4.AbstractC1692p.a
    /* JADX INFO: renamed from: o */
    public C1698v mo7047o() {
        return this.f5589c;
    }

    public String toString() {
        return "IndexOffset{readTime=" + this.f5589c + ", documentKey=" + this.f5590d + ", largestBatchId=" + this.f5591e + "}";
    }
}
