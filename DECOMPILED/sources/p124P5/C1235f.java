package p124P5;

import p063H5.AbstractC0523S;
import p063H5.C0531a;
import p063H5.C0563q;
import p122P3.AbstractC1209m;

/* JADX INFO: renamed from: P5.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1235f extends AbstractC1232c {

    /* JADX INFO: renamed from: a */
    private final AbstractC0523S.e f4345a;

    /* JADX INFO: renamed from: P5.f$a */
    static final class a extends AbstractC1233d {

        /* JADX INFO: renamed from: a */
        private final AbstractC0523S.i f4346a;

        /* JADX INFO: renamed from: b */
        private final AbstractC0523S.k f4347b;

        /* JADX INFO: renamed from: P5.f$a$a, reason: collision with other inner class name */
        class C7640a implements AbstractC0523S.k {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ AbstractC0523S.k f4348a;

            C7640a(AbstractC0523S.k kVar) {
                this.f4348a = kVar;
            }

            @Override // p063H5.AbstractC0523S.k
            /* JADX INFO: renamed from: a */
            public void mo2231a(C0563q c0563q) {
                this.f4348a.mo2231a(c0563q);
                a.this.f4347b.mo2231a(c0563q);
            }
        }

        a(AbstractC0523S.i iVar, AbstractC0523S.k kVar) {
            this.f4346a = (AbstractC0523S.i) AbstractC1209m.m5303o(iVar, "delegate");
            this.f4347b = (AbstractC0523S.k) AbstractC1209m.m5303o(kVar, "healthListener");
        }

        @Override // p124P5.AbstractC1233d, p063H5.AbstractC0523S.i
        /* JADX INFO: renamed from: c */
        public C0531a mo2223c() {
            return super.mo2223c().m2314d().m2318d(AbstractC0523S.f1943d, Boolean.TRUE).m2316a();
        }

        @Override // p124P5.AbstractC1233d, p063H5.AbstractC0523S.i
        /* JADX INFO: renamed from: h */
        public void mo2228h(AbstractC0523S.k kVar) {
            this.f4346a.mo2228h(new C7640a(kVar));
        }

        @Override // p124P5.AbstractC1233d
        /* JADX INFO: renamed from: j */
        public AbstractC0523S.i mo5354j() {
            return this.f4346a;
        }
    }

    public C1235f(AbstractC0523S.e eVar) {
        this.f4345a = (AbstractC0523S.e) AbstractC1209m.m5303o(eVar, "helper");
    }

    @Override // p124P5.AbstractC1232c, p063H5.AbstractC0523S.e
    /* JADX INFO: renamed from: a */
    public AbstractC0523S.i mo2194a(AbstractC0523S.b bVar) {
        AbstractC0523S.k kVar = (AbstractC0523S.k) bVar.m2183c(AbstractC0523S.f1942c);
        AbstractC0523S.i iVarMo2194a = super.mo2194a(bVar);
        return (kVar == null || iVarMo2194a.mo2223c().m2313b(AbstractC0523S.f1943d) != null) ? iVarMo2194a : new a(iVarMo2194a, kVar);
    }

    @Override // p124P5.AbstractC1232c
    /* JADX INFO: renamed from: g */
    protected AbstractC0523S.e mo5353g() {
        return this.f4345a;
    }
}
