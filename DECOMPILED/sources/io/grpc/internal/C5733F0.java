package io.grpc.internal;

import io.grpc.internal.C5733F0.a;
import p063H5.AbstractC0536c0;
import p063H5.C0531a;
import p063H5.C0554l0;
import p063H5.ExecutorC0562p0;

/* JADX INFO: renamed from: io.grpc.internal.F0 */
/* JADX INFO: loaded from: classes.dex */
final class C5733F0 extends AbstractC5748N {

    /* JADX INFO: renamed from: e */
    static final C0531a.c f22170e = C0531a.c.m2319a("io.grpc.internal.RetryingNameResolver.RESOLUTION_RESULT_LISTENER_KEY");

    /* JADX INFO: renamed from: b */
    private final AbstractC0536c0 f22171b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC5731E0 f22172c;

    /* JADX INFO: renamed from: d */
    private final ExecutorC0562p0 f22173d;

    /* JADX INFO: renamed from: io.grpc.internal.F0$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C5733F0.this.mo2367b();
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.F0$b */
    class b {
        b() {
        }

        /* JADX INFO: renamed from: a */
        public void m25588a(C0554l0 c0554l0) {
            if (c0554l0.m2460o()) {
                C5733F0.this.f22172c.reset();
            } else {
                C5733F0.this.f22172c.mo25583a(C5733F0.this.new a());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: io.grpc.internal.F0$c */
    class c extends AbstractC0536c0.d {

        /* JADX INFO: renamed from: a */
        private AbstractC0536c0.d f22176a;

        c(AbstractC0536c0.d dVar) {
            this.f22176a = dVar;
        }

        @Override // p063H5.AbstractC0536c0.d
        /* JADX INFO: renamed from: a */
        public void mo2392a(C0554l0 c0554l0) {
            this.f22176a.mo2392a(c0554l0);
            C5733F0.this.f22173d.execute(new Runnable() { // from class: io.grpc.internal.G0
                @Override // java.lang.Runnable
                public final void run() {
                    C5733F0.c cVar = this.f22182a;
                    C5733F0.this.f22172c.mo25583a(C5733F0.this.new a());
                }
            });
        }

        @Override // p063H5.AbstractC0536c0.d
        /* JADX INFO: renamed from: b */
        public void mo2393b(AbstractC0536c0.e eVar) {
            C0531a c0531aM2396b = eVar.m2396b();
            C0531a.c cVar = C5733F0.f22170e;
            if (c0531aM2396b.m2313b(cVar) != null) {
                throw new IllegalStateException("RetryingNameResolver can only be used once to wrap a NameResolver");
            }
            this.f22176a.mo2393b(eVar.m2398e().m2401c(eVar.m2396b().m2314d().m2318d(cVar, C5733F0.this.new b()).m2316a()).m2399a());
        }
    }

    C5733F0(AbstractC0536c0 abstractC0536c0, InterfaceC5731E0 interfaceC5731E0, ExecutorC0562p0 executorC0562p0) {
        super(abstractC0536c0);
        this.f22171b = abstractC0536c0;
        this.f22172c = interfaceC5731E0;
        this.f22173d = executorC0562p0;
    }

    @Override // io.grpc.internal.AbstractC5748N, p063H5.AbstractC0536c0
    /* JADX INFO: renamed from: c */
    public void mo2368c() {
        super.mo2368c();
        this.f22172c.reset();
    }

    @Override // io.grpc.internal.AbstractC5748N, p063H5.AbstractC0536c0
    /* JADX INFO: renamed from: d */
    public void mo2369d(AbstractC0536c0.d dVar) {
        super.mo2369d(new c(dVar));
    }
}
