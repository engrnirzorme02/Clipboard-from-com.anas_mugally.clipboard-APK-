package p245f5;

/* JADX INFO: renamed from: f5.b */
/* JADX INFO: loaded from: classes.dex */
public class C5441b implements InterfaceC5440a {

    /* JADX INFO: renamed from: a */
    private static C5441b f20734a;

    private C5441b() {
    }

    /* JADX INFO: renamed from: b */
    public static C5441b m24645b() {
        if (f20734a == null) {
            f20734a = new C5441b();
        }
        return f20734a;
    }

    @Override // p245f5.InterfaceC5440a
    /* JADX INFO: renamed from: a */
    public long mo24644a() {
        return System.currentTimeMillis();
    }
}
