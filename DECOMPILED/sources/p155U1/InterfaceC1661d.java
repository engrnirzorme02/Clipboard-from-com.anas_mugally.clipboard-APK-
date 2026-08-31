package p155U1;

/* JADX INFO: renamed from: U1.d */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1661d {

    /* JADX INFO: renamed from: U1.d$a */
    public enum a {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);


        /* JADX INFO: renamed from: a */
        private final boolean f5509a;

        a(boolean z7) {
            this.f5509a = z7;
        }

        /* JADX INFO: renamed from: d */
        boolean m6997d() {
            return this.f5509a;
        }
    }

    /* JADX INFO: renamed from: a */
    boolean mo6984a(InterfaceC1660c interfaceC1660c);

    /* JADX INFO: renamed from: b */
    boolean mo6985b();

    /* JADX INFO: renamed from: c */
    InterfaceC1661d mo6986c();

    /* JADX INFO: renamed from: d */
    boolean mo6987d(InterfaceC1660c interfaceC1660c);

    /* JADX INFO: renamed from: e */
    void mo6988e(InterfaceC1660c interfaceC1660c);

    /* JADX INFO: renamed from: f */
    boolean mo6989f(InterfaceC1660c interfaceC1660c);

    /* JADX INFO: renamed from: j */
    void mo6993j(InterfaceC1660c interfaceC1660c);
}
