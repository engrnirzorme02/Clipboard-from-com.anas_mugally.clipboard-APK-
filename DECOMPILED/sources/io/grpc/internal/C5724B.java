package io.grpc.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import p063H5.AbstractC0523S;
import p063H5.AbstractC0551k;
import p063H5.C0516K;
import p063H5.C0530Z;
import p063H5.C0532a0;
import p063H5.C0535c;
import p063H5.C0554l0;
import p063H5.C0565r;
import p063H5.ExecutorC0562p0;

/* JADX INFO: renamed from: io.grpc.internal.B */
/* JADX INFO: loaded from: classes.dex */
final class C5724B implements InterfaceC5793l0 {

    /* JADX INFO: renamed from: c */
    private final Executor f21931c;

    /* JADX INFO: renamed from: d */
    private final ExecutorC0562p0 f21932d;

    /* JADX INFO: renamed from: e */
    private Runnable f21933e;

    /* JADX INFO: renamed from: f */
    private Runnable f21934f;

    /* JADX INFO: renamed from: g */
    private Runnable f21935g;

    /* JADX INFO: renamed from: h */
    private InterfaceC5793l0.a f21936h;

    /* JADX INFO: renamed from: j */
    private C0554l0 f21938j;

    /* JADX INFO: renamed from: k */
    private AbstractC0523S.j f21939k;

    /* JADX INFO: renamed from: l */
    private long f21940l;

    /* JADX INFO: renamed from: a */
    private final C0516K f21929a = C0516K.m2160a(C5724B.class, null);

    /* JADX INFO: renamed from: b */
    private final Object f21930b = new Object();

    /* JADX INFO: renamed from: i */
    private Collection f21937i = new LinkedHashSet();

    /* JADX INFO: renamed from: io.grpc.internal.B$a */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC5793l0.a f21941a;

        a(InterfaceC5793l0.a aVar) {
            this.f21941a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f21941a.mo25822d(true);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.B$b */
    class b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC5793l0.a f21943a;

        b(InterfaceC5793l0.a aVar) {
            this.f21943a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f21943a.mo25822d(false);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.B$c */
    class c implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC5793l0.a f21945a;

        c(InterfaceC5793l0.a aVar) {
            this.f21945a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f21945a.mo25821c();
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.B$d */
    class d implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C0554l0 f21947a;

        d(C0554l0 c0554l0) {
            this.f21947a = c0554l0;
        }

        @Override // java.lang.Runnable
        public void run() {
            C5724B.this.f21936h.mo25823e(this.f21947a);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.B$e */
    private class e extends C5726C {

        /* JADX INFO: renamed from: j */
        private final AbstractC0523S.g f21949j;

        /* JADX INFO: renamed from: k */
        private final C0565r f21950k;

        /* JADX INFO: renamed from: l */
        private final AbstractC0551k[] f21951l;

        /* synthetic */ e(C5724B c5724b, AbstractC0523S.g gVar, AbstractC0551k[] abstractC0551kArr, a aVar) {
            this(gVar, abstractC0551kArr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: B */
        public Runnable m25435B(InterfaceC5808t interfaceC5808t) {
            C0565r c0565rM2507b = this.f21950k.m2507b();
            try {
                return m25470x(interfaceC5808t.mo3348c(this.f21949j.mo2211c(), this.f21949j.mo2210b(), this.f21949j.mo2209a(), this.f21951l));
            } finally {
                this.f21950k.m2509f(c0565rM2507b);
            }
        }

        @Override // io.grpc.internal.C5726C, io.grpc.internal.InterfaceC5804r
        /* JADX INFO: renamed from: a */
        public void mo25438a(C0554l0 c0554l0) {
            super.mo25438a(c0554l0);
            synchronized (C5724B.this.f21930b) {
                try {
                    if (C5724B.this.f21935g != null) {
                        boolean zRemove = C5724B.this.f21937i.remove(this);
                        if (!C5724B.this.m25432r() && zRemove) {
                            C5724B.this.f21932d.m2489b(C5724B.this.f21934f);
                            if (C5724B.this.f21938j != null) {
                                C5724B.this.f21932d.m2489b(C5724B.this.f21935g);
                                C5724B.this.f21935g = null;
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            C5724B.this.f21932d.m2488a();
        }

        @Override // io.grpc.internal.C5726C, io.grpc.internal.InterfaceC5804r
        /* JADX INFO: renamed from: p */
        public void mo25439p(C5768Y c5768y) {
            if (this.f21949j.mo2209a().m2352j()) {
                c5768y.m25762a("wait_for_ready");
            }
            super.mo25439p(c5768y);
        }

        @Override // io.grpc.internal.C5726C
        /* JADX INFO: renamed from: v */
        protected void mo25440v(C0554l0 c0554l0) {
            for (AbstractC0551k abstractC0551k : this.f21951l) {
                abstractC0551k.mo2487i(c0554l0);
            }
        }

        private e(AbstractC0523S.g gVar, AbstractC0551k[] abstractC0551kArr) {
            this.f21950k = C0565r.m2503e();
            this.f21949j = gVar;
            this.f21951l = abstractC0551kArr;
        }
    }

    C5724B(Executor executor, ExecutorC0562p0 executorC0562p0) {
        this.f21931c = executor;
        this.f21932d = executorC0562p0;
    }

    /* JADX INFO: renamed from: p */
    private e m25430p(AbstractC0523S.g gVar, AbstractC0551k[] abstractC0551kArr) {
        e eVar = new e(this, gVar, abstractC0551kArr, null);
        this.f21937i.add(eVar);
        if (m25431q() == 1) {
            this.f21932d.m2489b(this.f21933e);
        }
        for (AbstractC0551k abstractC0551k : abstractC0551kArr) {
            abstractC0551k.mo2427j();
        }
        return eVar;
    }

    @Override // io.grpc.internal.InterfaceC5808t
    /* JADX INFO: renamed from: c */
    public final InterfaceC5804r mo3348c(C0532a0 c0532a0, C0530Z c0530z, C0535c c0535c, AbstractC0551k[] abstractC0551kArr) {
        InterfaceC5804r c5734g;
        try {
            C5815w0 c5815w0 = new C5815w0(c0532a0, c0530z, c0535c);
            AbstractC0523S.j jVar = null;
            long j7 = -1;
            while (true) {
                synchronized (this.f21930b) {
                    if (this.f21938j == null) {
                        AbstractC0523S.j jVar2 = this.f21939k;
                        if (jVar2 != null) {
                            if (jVar != null && j7 == this.f21940l) {
                                c5734g = m25430p(c5815w0, abstractC0551kArr);
                                break;
                            }
                            j7 = this.f21940l;
                            InterfaceC5808t interfaceC5808tM25673k = AbstractC5757S.m25673k(jVar2.mo2179a(c5815w0), c0535c.m2352j());
                            if (interfaceC5808tM25673k != null) {
                                c5734g = interfaceC5808tM25673k.mo3348c(c5815w0.mo2211c(), c5815w0.mo2210b(), c5815w0.mo2209a(), abstractC0551kArr);
                                break;
                            }
                            jVar = jVar2;
                        } else {
                            c5734g = m25430p(c5815w0, abstractC0551kArr);
                            break;
                        }
                    } else {
                        c5734g = new C5734G(this.f21938j, abstractC0551kArr);
                        break;
                    }
                }
            }
            this.f21932d.m2488a();
            return c5734g;
        } catch (Throwable th) {
            this.f21932d.m2488a();
            throw th;
        }
    }

    @Override // io.grpc.internal.InterfaceC5793l0
    /* JADX INFO: renamed from: d */
    public final void mo3350d(C0554l0 c0554l0) {
        Collection<e> collection;
        Runnable runnable;
        mo3353h(c0554l0);
        synchronized (this.f21930b) {
            try {
                collection = this.f21937i;
                runnable = this.f21935g;
                this.f21935g = null;
                if (!collection.isEmpty()) {
                    this.f21937i = Collections.EMPTY_LIST;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (runnable != null) {
            for (e eVar : collection) {
                Runnable runnableM25470x = eVar.m25470x(new C5734G(c0554l0, InterfaceC5806s.a.REFUSED, eVar.f21951l));
                if (runnableM25470x != null) {
                    runnableM25470x.run();
                }
            }
            this.f21932d.execute(runnable);
        }
    }

    @Override // io.grpc.internal.InterfaceC5793l0
    /* JADX INFO: renamed from: e */
    public final Runnable mo3351e(InterfaceC5793l0.a aVar) {
        this.f21936h = aVar;
        this.f21933e = new a(aVar);
        this.f21934f = new b(aVar);
        this.f21935g = new c(aVar);
        return null;
    }

    @Override // p063H5.InterfaceC0521P
    /* JADX INFO: renamed from: g */
    public C0516K mo2172g() {
        return this.f21929a;
    }

    @Override // io.grpc.internal.InterfaceC5793l0
    /* JADX INFO: renamed from: h */
    public final void mo3353h(C0554l0 c0554l0) {
        Runnable runnable;
        synchronized (this.f21930b) {
            try {
                if (this.f21938j != null) {
                    return;
                }
                this.f21938j = c0554l0;
                this.f21932d.m2489b(new d(c0554l0));
                if (!m25432r() && (runnable = this.f21935g) != null) {
                    this.f21932d.m2489b(runnable);
                    this.f21935g = null;
                }
                this.f21932d.m2488a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: q */
    final int m25431q() {
        int size;
        synchronized (this.f21930b) {
            size = this.f21937i.size();
        }
        return size;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m25432r() {
        boolean z7;
        synchronized (this.f21930b) {
            z7 = !this.f21937i.isEmpty();
        }
        return z7;
    }

    /* JADX INFO: renamed from: s */
    final void m25433s(AbstractC0523S.j jVar) {
        Runnable runnable;
        synchronized (this.f21930b) {
            this.f21939k = jVar;
            this.f21940l++;
            if (jVar != null && m25432r()) {
                ArrayList<e> arrayList = new ArrayList(this.f21937i);
                ArrayList arrayList2 = new ArrayList();
                for (e eVar : arrayList) {
                    AbstractC0523S.f fVarMo2179a = jVar.mo2179a(eVar.f21949j);
                    C0535c c0535cMo2209a = eVar.f21949j.mo2209a();
                    InterfaceC5808t interfaceC5808tM25673k = AbstractC5757S.m25673k(fVarMo2179a, c0535cMo2209a.m2352j());
                    if (interfaceC5808tM25673k != null) {
                        Executor executorM2347e = this.f21931c;
                        if (c0535cMo2209a.m2347e() != null) {
                            executorM2347e = c0535cMo2209a.m2347e();
                        }
                        Runnable runnableM25435B = eVar.m25435B(interfaceC5808tM25673k);
                        if (runnableM25435B != null) {
                            executorM2347e.execute(runnableM25435B);
                        }
                        arrayList2.add(eVar);
                    }
                }
                synchronized (this.f21930b) {
                    try {
                        if (m25432r()) {
                            this.f21937i.removeAll(arrayList2);
                            if (this.f21937i.isEmpty()) {
                                this.f21937i = new LinkedHashSet();
                            }
                            if (!m25432r()) {
                                this.f21932d.m2489b(this.f21934f);
                                if (this.f21938j != null && (runnable = this.f21935g) != null) {
                                    this.f21932d.m2489b(runnable);
                                    this.f21935g = null;
                                }
                            }
                            this.f21932d.m2488a();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }
}
