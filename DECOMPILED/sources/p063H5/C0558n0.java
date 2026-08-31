package p063H5;

/* JADX INFO: renamed from: H5.n0 */
/* JADX INFO: loaded from: classes.dex */
public class C0558n0 extends RuntimeException {

    /* JADX INFO: renamed from: a */
    private final C0554l0 f2154a;

    /* JADX INFO: renamed from: b */
    private final C0530Z f2155b;

    /* JADX INFO: renamed from: c */
    private final boolean f2156c;

    public C0558n0(C0554l0 c0554l0) {
        this(c0554l0, null);
    }

    /* JADX INFO: renamed from: a */
    public final C0554l0 m2476a() {
        return this.f2154a;
    }

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        return this.f2156c ? super.fillInStackTrace() : this;
    }

    public C0558n0(C0554l0 c0554l0, C0530Z c0530z) {
        this(c0554l0, c0530z, true);
    }

    C0558n0(C0554l0 c0554l0, C0530Z c0530z, boolean z7) {
        super(C0554l0.m2449g(c0554l0), c0554l0.m2457l());
        this.f2154a = c0554l0;
        this.f2155b = c0530z;
        this.f2156c = z7;
        fillInStackTrace();
    }
}
