package p122P3;

/* JADX INFO: renamed from: P3.n */
/* JADX INFO: loaded from: classes2.dex */
final class C1210n extends AbstractC1206j {

    /* JADX INFO: renamed from: a */
    private final Object f4294a;

    C1210n(Object obj) {
        this.f4294a = obj;
    }

    @Override // p122P3.AbstractC1206j
    /* JADX INFO: renamed from: b */
    public Object mo5253b() {
        return this.f4294a;
    }

    @Override // p122P3.AbstractC1206j
    /* JADX INFO: renamed from: c */
    public boolean mo5254c() {
        return true;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1210n) {
            return this.f4294a.equals(((C1210n) obj).f4294a);
        }
        return false;
    }

    public int hashCode() {
        return this.f4294a.hashCode() + 1502476572;
    }

    public String toString() {
        return "Optional.of(" + this.f4294a + ")";
    }
}
