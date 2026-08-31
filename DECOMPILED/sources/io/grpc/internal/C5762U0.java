package io.grpc.internal;

import p122P3.AbstractC1209m;

/* JADX INFO: renamed from: io.grpc.internal.U0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5762U0 {

    /* JADX INFO: renamed from: l */
    private static final b f22301l = new b(InterfaceC5756R0.f22224a);

    /* JADX INFO: renamed from: a */
    private final InterfaceC5756R0 f22302a;

    /* JADX INFO: renamed from: b */
    private long f22303b;

    /* JADX INFO: renamed from: c */
    private long f22304c;

    /* JADX INFO: renamed from: d */
    private long f22305d;

    /* JADX INFO: renamed from: e */
    private long f22306e;

    /* JADX INFO: renamed from: f */
    private long f22307f;

    /* JADX INFO: renamed from: g */
    private c f22308g;

    /* JADX INFO: renamed from: h */
    private long f22309h;

    /* JADX INFO: renamed from: i */
    private long f22310i;

    /* JADX INFO: renamed from: j */
    private final InterfaceC5781f0 f22311j;

    /* JADX INFO: renamed from: k */
    private volatile long f22312k;

    /* JADX INFO: renamed from: io.grpc.internal.U0$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        private final InterfaceC5756R0 f22313a;

        public b(InterfaceC5756R0 interfaceC5756R0) {
            this.f22313a = interfaceC5756R0;
        }

        /* JADX INFO: renamed from: a */
        public C5762U0 m25741a() {
            return new C5762U0(this.f22313a);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.U0$c */
    public interface c {
    }

    /* JADX INFO: renamed from: a */
    public static b m25734a() {
        return f22301l;
    }

    /* JADX INFO: renamed from: b */
    public void m25735b() {
        this.f22307f++;
    }

    /* JADX INFO: renamed from: c */
    public void m25736c() {
        this.f22303b++;
        this.f22304c = this.f22302a.mo25662a();
    }

    /* JADX INFO: renamed from: d */
    public void m25737d() {
        this.f22311j.mo25421a(1L);
        this.f22312k = this.f22302a.mo25662a();
    }

    /* JADX INFO: renamed from: e */
    public void m25738e(int i7) {
        if (i7 == 0) {
            return;
        }
        this.f22309h += (long) i7;
        this.f22310i = this.f22302a.mo25662a();
    }

    /* JADX INFO: renamed from: f */
    public void m25739f(boolean z7) {
        if (z7) {
            this.f22305d++;
        } else {
            this.f22306e++;
        }
    }

    /* JADX INFO: renamed from: g */
    public void m25740g(c cVar) {
        this.f22308g = (c) AbstractC1209m.m5302n(cVar);
    }

    private C5762U0(InterfaceC5756R0 interfaceC5756R0) {
        this.f22311j = AbstractC5783g0.m25926a();
        this.f22302a = interfaceC5756R0;
    }
}
