package p063H5;

import java.util.concurrent.Executor;
import p122P3.AbstractC1209m;

/* JADX INFO: renamed from: H5.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0555m extends AbstractC0533b {

    /* JADX INFO: renamed from: a */
    private final AbstractC0533b f2142a;

    /* JADX INFO: renamed from: b */
    private final AbstractC0533b f2143b;

    /* JADX INFO: renamed from: H5.m$a */
    private static final class a extends AbstractC0533b.a {

        /* JADX INFO: renamed from: a */
        private final AbstractC0533b.a f2144a;

        /* JADX INFO: renamed from: b */
        private final C0530Z f2145b;

        public a(AbstractC0533b.a aVar, C0530Z c0530z) {
            this.f2144a = aVar;
            this.f2145b = c0530z;
        }

        @Override // p063H5.AbstractC0533b.a
        /* JADX INFO: renamed from: a */
        public void mo2340a(C0530Z c0530z) {
            AbstractC1209m.m5303o(c0530z, "headers");
            C0530Z c0530z2 = new C0530Z();
            c0530z2.m2286m(this.f2145b);
            c0530z2.m2286m(c0530z);
            this.f2144a.mo2340a(c0530z2);
        }

        @Override // p063H5.AbstractC0533b.a
        /* JADX INFO: renamed from: b */
        public void mo2341b(C0554l0 c0554l0) {
            this.f2144a.mo2341b(c0554l0);
        }
    }

    /* JADX INFO: renamed from: H5.m$b */
    private final class b extends AbstractC0533b.a {

        /* JADX INFO: renamed from: a */
        private final AbstractC0533b.b f2146a;

        /* JADX INFO: renamed from: b */
        private final Executor f2147b;

        /* JADX INFO: renamed from: c */
        private final AbstractC0533b.a f2148c;

        /* JADX INFO: renamed from: d */
        private final C0565r f2149d;

        public b(AbstractC0533b.b bVar, Executor executor, AbstractC0533b.a aVar, C0565r c0565r) {
            this.f2146a = bVar;
            this.f2147b = executor;
            this.f2148c = (AbstractC0533b.a) AbstractC1209m.m5303o(aVar, "delegate");
            this.f2149d = (C0565r) AbstractC1209m.m5303o(c0565r, "context");
        }

        @Override // p063H5.AbstractC0533b.a
        /* JADX INFO: renamed from: a */
        public void mo2340a(C0530Z c0530z) {
            AbstractC1209m.m5303o(c0530z, "headers");
            C0565r c0565rM2507b = this.f2149d.m2507b();
            try {
                C0555m.this.f2143b.mo2339a(this.f2146a, this.f2147b, new a(this.f2148c, c0530z));
            } finally {
                this.f2149d.m2509f(c0565rM2507b);
            }
        }

        @Override // p063H5.AbstractC0533b.a
        /* JADX INFO: renamed from: b */
        public void mo2341b(C0554l0 c0554l0) {
            this.f2148c.mo2341b(c0554l0);
        }
    }

    public C0555m(AbstractC0533b abstractC0533b, AbstractC0533b abstractC0533b2) {
        this.f2142a = (AbstractC0533b) AbstractC1209m.m5303o(abstractC0533b, "creds1");
        this.f2143b = (AbstractC0533b) AbstractC1209m.m5303o(abstractC0533b2, "creds2");
    }

    @Override // p063H5.AbstractC0533b
    /* JADX INFO: renamed from: a */
    public void mo2339a(AbstractC0533b.b bVar, Executor executor, AbstractC0533b.a aVar) {
        this.f2142a.mo2339a(bVar, executor, new b(bVar, executor, aVar, C0565r.m2503e()));
    }
}
