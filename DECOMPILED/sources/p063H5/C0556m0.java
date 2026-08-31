package p063H5;

/* JADX INFO: renamed from: H5.m0 */
/* JADX INFO: loaded from: classes.dex */
public class C0556m0 extends Exception {

    /* JADX INFO: renamed from: a */
    private final C0554l0 f2151a;

    /* JADX INFO: renamed from: b */
    private final C0530Z f2152b;

    /* JADX INFO: renamed from: c */
    private final boolean f2153c;

    public C0556m0(C0554l0 c0554l0) {
        this(c0554l0, null);
    }

    /* JADX INFO: renamed from: a */
    public final C0554l0 m2475a() {
        return this.f2151a;
    }

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        return this.f2153c ? super.fillInStackTrace() : this;
    }

    public C0556m0(C0554l0 c0554l0, C0530Z c0530z) {
        this(c0554l0, c0530z, true);
    }

    C0556m0(C0554l0 c0554l0, C0530Z c0530z, boolean z7) {
        super(C0554l0.m2449g(c0554l0), c0554l0.m2457l());
        this.f2151a = c0554l0;
        this.f2152b = c0530z;
        this.f2153c = z7;
        fillInStackTrace();
    }
}
