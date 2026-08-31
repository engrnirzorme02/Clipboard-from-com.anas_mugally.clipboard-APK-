package io.grpc.internal;

import p063H5.AbstractC0533b;
import p063H5.AbstractC0551k;
import p063H5.C0530Z;
import p063H5.C0532a0;
import p063H5.C0535c;
import p063H5.C0554l0;
import p063H5.C0565r;
import p122P3.AbstractC1209m;

/* JADX INFO: renamed from: io.grpc.internal.o0 */
/* JADX INFO: loaded from: classes.dex */
final class C5799o0 extends AbstractC0533b.a {

    /* JADX INFO: renamed from: a */
    private final InterfaceC5808t f22803a;

    /* JADX INFO: renamed from: b */
    private final C0532a0 f22804b;

    /* JADX INFO: renamed from: c */
    private final C0530Z f22805c;

    /* JADX INFO: renamed from: d */
    private final C0535c f22806d;

    /* JADX INFO: renamed from: f */
    private final a f22808f;

    /* JADX INFO: renamed from: g */
    private final AbstractC0551k[] f22809g;

    /* JADX INFO: renamed from: i */
    private InterfaceC5804r f22811i;

    /* JADX INFO: renamed from: j */
    boolean f22812j;

    /* JADX INFO: renamed from: k */
    C5726C f22813k;

    /* JADX INFO: renamed from: h */
    private final Object f22810h = new Object();

    /* JADX INFO: renamed from: e */
    private final C0565r f22807e = C0565r.m2503e();

    /* JADX INFO: renamed from: io.grpc.internal.o0$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo26062a();
    }

    C5799o0(InterfaceC5808t interfaceC5808t, C0532a0 c0532a0, C0530Z c0530z, C0535c c0535c, a aVar, AbstractC0551k[] abstractC0551kArr) {
        this.f22803a = interfaceC5808t;
        this.f22804b = c0532a0;
        this.f22805c = c0530z;
        this.f22806d = c0535c;
        this.f22808f = aVar;
        this.f22809g = abstractC0551kArr;
    }

    /* JADX INFO: renamed from: c */
    private void m26100c(InterfaceC5804r interfaceC5804r) {
        boolean z7;
        AbstractC1209m.m5309u(!this.f22812j, "already finalized");
        this.f22812j = true;
        synchronized (this.f22810h) {
            try {
                if (this.f22811i == null) {
                    this.f22811i = interfaceC5804r;
                    z7 = true;
                } else {
                    z7 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z7) {
            this.f22808f.mo26062a();
            return;
        }
        AbstractC1209m.m5309u(this.f22813k != null, "delayedStream is null");
        Runnable runnableM25470x = this.f22813k.m25470x(interfaceC5804r);
        if (runnableM25470x != null) {
            runnableM25470x.run();
        }
        this.f22808f.mo26062a();
    }

    @Override // p063H5.AbstractC0533b.a
    /* JADX INFO: renamed from: a */
    public void mo2340a(C0530Z c0530z) {
        AbstractC1209m.m5309u(!this.f22812j, "apply() or fail() already called");
        AbstractC1209m.m5303o(c0530z, "headers");
        this.f22805c.m2286m(c0530z);
        C0565r c0565rM2507b = this.f22807e.m2507b();
        try {
            InterfaceC5804r interfaceC5804rMo3348c = this.f22803a.mo3348c(this.f22804b, this.f22805c, this.f22806d, this.f22809g);
            this.f22807e.m2509f(c0565rM2507b);
            m26100c(interfaceC5804rMo3348c);
        } catch (Throwable th) {
            this.f22807e.m2509f(c0565rM2507b);
            throw th;
        }
    }

    @Override // p063H5.AbstractC0533b.a
    /* JADX INFO: renamed from: b */
    public void mo2341b(C0554l0 c0554l0) {
        AbstractC1209m.m5293e(!c0554l0.m2460o(), "Cannot fail with OK status");
        AbstractC1209m.m5309u(!this.f22812j, "apply() or fail() already called");
        m26100c(new C5734G(AbstractC5757S.m25677o(c0554l0), this.f22809g));
    }

    /* JADX INFO: renamed from: d */
    InterfaceC5804r m26101d() {
        synchronized (this.f22810h) {
            try {
                InterfaceC5804r interfaceC5804r = this.f22811i;
                if (interfaceC5804r != null) {
                    return interfaceC5804r;
                }
                C5726C c5726c = new C5726C();
                this.f22813k = c5726c;
                this.f22811i = c5726c;
                return c5726c;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
