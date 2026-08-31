package p174X;

/* JADX INFO: renamed from: X.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1902f extends AbstractC1889I {

    /* JADX INFO: renamed from: b */
    private final Object f6105b;

    /* JADX INFO: renamed from: c */
    private final int f6106c;

    public C1902f(Object obj, int i7, int i8) {
        super(i8, null);
        this.f6105b = obj;
        this.f6106c = i7;
    }

    /* JADX INFO: renamed from: b */
    public final void m7839b() {
        Object obj = this.f6105b;
        if ((obj != null ? obj.hashCode() : 0) != this.f6106c) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
        }
    }

    /* JADX INFO: renamed from: c */
    public final Object m7840c() {
        return this.f6105b;
    }
}
