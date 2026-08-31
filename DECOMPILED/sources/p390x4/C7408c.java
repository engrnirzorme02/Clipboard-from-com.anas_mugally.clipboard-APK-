package p390x4;

/* JADX INFO: renamed from: x4.c */
/* JADX INFO: loaded from: classes.dex */
public class C7408c implements InterfaceC7406a {

    /* JADX INFO: renamed from: a */
    public final long f29659a;

    public C7408c(long j7) {
        this.f29659a = j7;
    }

    @Override // p390x4.InterfaceC7406a
    /* JADX INFO: renamed from: a */
    public boolean mo32729a(long j7, long j8) {
        return j7 > this.f29659a || j8 > 1000;
    }

    @Override // p390x4.InterfaceC7406a
    /* JADX INFO: renamed from: b */
    public long mo32730b() {
        return 1000L;
    }

    @Override // p390x4.InterfaceC7406a
    /* JADX INFO: renamed from: c */
    public float mo32731c() {
        return 0.2f;
    }

    @Override // p390x4.InterfaceC7406a
    /* JADX INFO: renamed from: d */
    public boolean mo32732d(long j7) {
        return j7 > 1000;
    }
}
