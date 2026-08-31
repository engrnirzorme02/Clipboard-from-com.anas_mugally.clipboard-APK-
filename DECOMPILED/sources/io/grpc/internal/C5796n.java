package io.grpc.internal;

/* JADX INFO: renamed from: io.grpc.internal.n */
/* JADX INFO: loaded from: classes.dex */
final class C5796n {

    /* JADX INFO: renamed from: f */
    static final b f22777f = new a();

    /* JADX INFO: renamed from: a */
    private final InterfaceC5756R0 f22778a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC5781f0 f22779b = AbstractC5783g0.m25926a();

    /* JADX INFO: renamed from: c */
    private final InterfaceC5781f0 f22780c = AbstractC5783g0.m25926a();

    /* JADX INFO: renamed from: d */
    private final InterfaceC5781f0 f22781d = AbstractC5783g0.m25926a();

    /* JADX INFO: renamed from: e */
    private volatile long f22782e;

    /* JADX INFO: renamed from: io.grpc.internal.n$a */
    class a implements b {
        a() {
        }

        @Override // io.grpc.internal.C5796n.b
        /* JADX INFO: renamed from: a */
        public C5796n mo26003a() {
            return new C5796n(InterfaceC5756R0.f22224a);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.n$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        C5796n mo26003a();
    }

    C5796n(InterfaceC5756R0 interfaceC5756R0) {
        this.f22778a = interfaceC5756R0;
    }

    /* JADX INFO: renamed from: a */
    public void m26076a(boolean z7) {
        if (z7) {
            this.f22780c.mo25421a(1L);
        } else {
            this.f22781d.mo25421a(1L);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m26077b() {
        this.f22779b.mo25421a(1L);
        this.f22782e = this.f22778a.mo25662a();
    }
}
