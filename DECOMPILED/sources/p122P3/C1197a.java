package p122P3;

/* JADX INFO: renamed from: P3.a */
/* JADX INFO: loaded from: classes2.dex */
final class C1197a extends AbstractC1206j {

    /* JADX INFO: renamed from: a */
    static final C1197a f4271a = new C1197a();

    private C1197a() {
    }

    /* JADX INFO: renamed from: e */
    static AbstractC1206j m5252e() {
        return f4271a;
    }

    @Override // p122P3.AbstractC1206j
    /* JADX INFO: renamed from: b */
    public Object mo5253b() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // p122P3.AbstractC1206j
    /* JADX INFO: renamed from: c */
    public boolean mo5254c() {
        return false;
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public int hashCode() {
        return 2040732332;
    }

    public String toString() {
        return "Optional.absent()";
    }
}
