package p119P0;

import android.content.Context;
import androidx.work.C2895a;
import androidx.work.C2896b;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.utils.futures.C2913c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import p112O0.AbstractC1095h;
import p112O0.AbstractC1097j;
import p112O0.EnumC1106s;
import p157U3.InterfaceFutureC1673e;
import p161V0.InterfaceC1711a;
import p168W0.C1814p;
import p168W0.InterfaceC1800b;
import p168W0.InterfaceC1815q;
import p168W0.InterfaceC1818t;
import p175X0.AbstractC1929g;
import p175X0.C1938p;
import p175X0.C1939q;
import p175X0.RunnableC1937o;
import p182Y0.InterfaceC2010a;

/* JADX INFO: renamed from: P0.j */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC1183j implements Runnable {

    /* JADX INFO: renamed from: E */
    static final String f4184E = AbstractC1097j.m4846f("WorkerWrapper");

    /* JADX INFO: renamed from: A */
    private String f4185A;

    /* JADX INFO: renamed from: D */
    private volatile boolean f4188D;

    /* JADX INFO: renamed from: a */
    Context f4189a;

    /* JADX INFO: renamed from: b */
    private String f4190b;

    /* JADX INFO: renamed from: c */
    private List f4191c;

    /* JADX INFO: renamed from: d */
    private WorkerParameters.C2894a f4192d;

    /* JADX INFO: renamed from: e */
    C1814p f4193e;

    /* JADX INFO: renamed from: f */
    ListenableWorker f4194f;

    /* JADX INFO: renamed from: r */
    InterfaceC2010a f4195r;

    /* JADX INFO: renamed from: t */
    private C2895a f4197t;

    /* JADX INFO: renamed from: u */
    private InterfaceC1711a f4198u;

    /* JADX INFO: renamed from: v */
    private WorkDatabase f4199v;

    /* JADX INFO: renamed from: w */
    private InterfaceC1815q f4200w;

    /* JADX INFO: renamed from: x */
    private InterfaceC1800b f4201x;

    /* JADX INFO: renamed from: y */
    private InterfaceC1818t f4202y;

    /* JADX INFO: renamed from: z */
    private List f4203z;

    /* JADX INFO: renamed from: s */
    ListenableWorker.AbstractC2892a f4196s = ListenableWorker.AbstractC2892a.m14461a();

    /* JADX INFO: renamed from: B */
    C2913c f4186B = C2913c.m14629s();

    /* JADX INFO: renamed from: C */
    InterfaceFutureC1673e f4187C = null;

    /* JADX INFO: renamed from: P0.j$a */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceFutureC1673e f4204a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C2913c f4205b;

        a(InterfaceFutureC1673e interfaceFutureC1673e, C2913c c2913c) {
            this.f4204a = interfaceFutureC1673e;
            this.f4205b = c2913c;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f4204a.get();
                AbstractC1097j.m4844c().mo4847a(RunnableC1183j.f4184E, String.format("Starting work for %s", RunnableC1183j.this.f4193e.f5894c), new Throwable[0]);
                RunnableC1183j runnableC1183j = RunnableC1183j.this;
                runnableC1183j.f4187C = runnableC1183j.f4194f.startWork();
                this.f4205b.mo14621q(RunnableC1183j.this.f4187C);
            } catch (Throwable th) {
                this.f4205b.mo14620p(th);
            }
        }
    }

    /* JADX INFO: renamed from: P0.j$b */
    class b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C2913c f4207a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f4208b;

        b(C2913c c2913c, String str) {
            this.f4207a = c2913c;
            this.f4208b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    ListenableWorker.AbstractC2892a abstractC2892a = (ListenableWorker.AbstractC2892a) this.f4207a.get();
                    if (abstractC2892a == null) {
                        AbstractC1097j.m4844c().mo4848b(RunnableC1183j.f4184E, String.format("%s returned a null result. Treating it as a failure.", RunnableC1183j.this.f4193e.f5894c), new Throwable[0]);
                    } else {
                        AbstractC1097j.m4844c().mo4847a(RunnableC1183j.f4184E, String.format("%s returned a %s result.", RunnableC1183j.this.f4193e.f5894c, abstractC2892a), new Throwable[0]);
                        RunnableC1183j.this.f4196s = abstractC2892a;
                    }
                    RunnableC1183j.this.m5195f();
                } catch (InterruptedException e7) {
                    e = e7;
                    AbstractC1097j.m4844c().mo4848b(RunnableC1183j.f4184E, String.format("%s failed because it threw an exception/error", this.f4208b), e);
                    RunnableC1183j.this.m5195f();
                } catch (CancellationException e8) {
                    AbstractC1097j.m4844c().mo4849d(RunnableC1183j.f4184E, String.format("%s was cancelled", this.f4208b), e8);
                    RunnableC1183j.this.m5195f();
                } catch (ExecutionException e9) {
                    e = e9;
                    AbstractC1097j.m4844c().mo4848b(RunnableC1183j.f4184E, String.format("%s failed because it threw an exception/error", this.f4208b), e);
                    RunnableC1183j.this.m5195f();
                }
            } catch (Throwable th) {
                RunnableC1183j.this.m5195f();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: P0.j$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        Context f4210a;

        /* JADX INFO: renamed from: b */
        ListenableWorker f4211b;

        /* JADX INFO: renamed from: c */
        InterfaceC1711a f4212c;

        /* JADX INFO: renamed from: d */
        InterfaceC2010a f4213d;

        /* JADX INFO: renamed from: e */
        C2895a f4214e;

        /* JADX INFO: renamed from: f */
        WorkDatabase f4215f;

        /* JADX INFO: renamed from: g */
        String f4216g;

        /* JADX INFO: renamed from: h */
        List f4217h;

        /* JADX INFO: renamed from: i */
        WorkerParameters.C2894a f4218i = new WorkerParameters.C2894a();

        public c(Context context, C2895a c2895a, InterfaceC2010a interfaceC2010a, InterfaceC1711a interfaceC1711a, WorkDatabase workDatabase, String str) {
            this.f4210a = context.getApplicationContext();
            this.f4213d = interfaceC2010a;
            this.f4212c = interfaceC1711a;
            this.f4214e = c2895a;
            this.f4215f = workDatabase;
            this.f4216g = str;
        }

        /* JADX INFO: renamed from: a */
        public RunnableC1183j m5197a() {
            return new RunnableC1183j(this);
        }

        /* JADX INFO: renamed from: b */
        public c m5198b(WorkerParameters.C2894a c2894a) {
            if (c2894a != null) {
                this.f4218i = c2894a;
            }
            return this;
        }

        /* JADX INFO: renamed from: c */
        public c m5199c(List list) {
            this.f4217h = list;
            return this;
        }
    }

    RunnableC1183j(c cVar) {
        this.f4189a = cVar.f4210a;
        this.f4195r = cVar.f4213d;
        this.f4198u = cVar.f4212c;
        this.f4190b = cVar.f4216g;
        this.f4191c = cVar.f4217h;
        this.f4192d = cVar.f4218i;
        this.f4194f = cVar.f4211b;
        this.f4197t = cVar.f4214e;
        WorkDatabase workDatabase = cVar.f4215f;
        this.f4199v = workDatabase;
        this.f4200w = workDatabase.mo14518K();
        this.f4201x = this.f4199v.mo14513C();
        this.f4202y = this.f4199v.mo14519L();
    }

    /* JADX INFO: renamed from: a */
    private String m5182a(List list) {
        StringBuilder sb = new StringBuilder("Work [ id=");
        sb.append(this.f4190b);
        sb.append(", tags={ ");
        Iterator it = list.iterator();
        boolean z7 = true;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (z7) {
                z7 = false;
            } else {
                sb.append(", ");
            }
            sb.append(str);
        }
        sb.append(" } ]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    private void m5183c(ListenableWorker.AbstractC2892a abstractC2892a) {
        if (abstractC2892a instanceof ListenableWorker.AbstractC2892a.c) {
            AbstractC1097j.m4844c().mo4849d(f4184E, String.format("Worker result SUCCESS for %s", this.f4185A), new Throwable[0]);
            if (this.f4193e.m7535d()) {
                m5186h();
                return;
            } else {
                m5190m();
                return;
            }
        }
        if (abstractC2892a instanceof ListenableWorker.AbstractC2892a.b) {
            AbstractC1097j.m4844c().mo4849d(f4184E, String.format("Worker result RETRY for %s", this.f4185A), new Throwable[0]);
            m5185g();
            return;
        }
        AbstractC1097j.m4844c().mo4849d(f4184E, String.format("Worker result FAILURE for %s", this.f4185A), new Throwable[0]);
        if (this.f4193e.m7535d()) {
            m5186h();
        } else {
            m5196l();
        }
    }

    /* JADX INFO: renamed from: e */
    private void m5184e(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (this.f4200w.mo7549m(str2) != EnumC1106s.CANCELLED) {
                this.f4200w.mo7546j(EnumC1106s.FAILED, str2);
            }
            linkedList.addAll(this.f4201x.mo7510a(str2));
        }
    }

    /* JADX INFO: renamed from: g */
    private void m5185g() {
        this.f4199v.m33029e();
        try {
            this.f4200w.mo7546j(EnumC1106s.ENQUEUED, this.f4190b);
            this.f4200w.mo7555s(this.f4190b, System.currentTimeMillis());
            this.f4200w.mo7538b(this.f4190b, -1L);
            this.f4199v.m33042z();
        } finally {
            this.f4199v.m33031i();
            m5187i(true);
        }
    }

    /* JADX INFO: renamed from: h */
    private void m5186h() {
        this.f4199v.m33029e();
        try {
            this.f4200w.mo7555s(this.f4190b, System.currentTimeMillis());
            this.f4200w.mo7546j(EnumC1106s.ENQUEUED, this.f4190b);
            this.f4200w.mo7551o(this.f4190b);
            this.f4200w.mo7538b(this.f4190b, -1L);
            this.f4199v.m33042z();
        } finally {
            this.f4199v.m33031i();
            m5187i(false);
        }
    }

    /* JADX INFO: renamed from: i */
    private void m5187i(boolean z7) {
        ListenableWorker listenableWorker;
        this.f4199v.m33029e();
        try {
            if (!this.f4199v.mo14518K().mo7547k()) {
                AbstractC1929g.m7977a(this.f4189a, RescheduleReceiver.class, false);
            }
            if (z7) {
                this.f4200w.mo7546j(EnumC1106s.ENQUEUED, this.f4190b);
                this.f4200w.mo7538b(this.f4190b, -1L);
            }
            if (this.f4193e != null && (listenableWorker = this.f4194f) != null && listenableWorker.isRunInForeground()) {
                this.f4198u.mo5128b(this.f4190b);
            }
            this.f4199v.m33042z();
            this.f4199v.m33031i();
            this.f4186B.mo14619o(Boolean.valueOf(z7));
        } catch (Throwable th) {
            this.f4199v.m33031i();
            throw th;
        }
    }

    /* JADX INFO: renamed from: j */
    private void m5188j() {
        EnumC1106s enumC1106sMo7549m = this.f4200w.mo7549m(this.f4190b);
        if (enumC1106sMo7549m == EnumC1106s.RUNNING) {
            AbstractC1097j.m4844c().mo4847a(f4184E, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", this.f4190b), new Throwable[0]);
            m5187i(true);
        } else {
            AbstractC1097j.m4844c().mo4847a(f4184E, String.format("Status for %s is %s; not doing any work", this.f4190b, enumC1106sMo7549m), new Throwable[0]);
            m5187i(false);
        }
    }

    /* JADX INFO: renamed from: k */
    private void m5189k() {
        C2896b c2896bMo4840b;
        if (m5191n()) {
            return;
        }
        this.f4199v.m33029e();
        try {
            C1814p c1814pMo7550n = this.f4200w.mo7550n(this.f4190b);
            this.f4193e = c1814pMo7550n;
            if (c1814pMo7550n == null) {
                AbstractC1097j.m4844c().mo4848b(f4184E, String.format("Didn't find WorkSpec for id %s", this.f4190b), new Throwable[0]);
                m5187i(false);
                this.f4199v.m33042z();
                this.f4199v.m33031i();
                return;
            }
            if (c1814pMo7550n.f5893b != EnumC1106s.ENQUEUED) {
                m5188j();
                this.f4199v.m33042z();
                AbstractC1097j.m4844c().mo4847a(f4184E, String.format("%s is not in ENQUEUED state. Nothing more to do.", this.f4193e.f5894c), new Throwable[0]);
                this.f4199v.m33031i();
                return;
            }
            if (c1814pMo7550n.m7535d() || this.f4193e.m7534c()) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                C1814p c1814p = this.f4193e;
                if (c1814p.f5905n != 0 && jCurrentTimeMillis < c1814p.m7532a()) {
                    AbstractC1097j.m4844c().mo4847a(f4184E, String.format("Delaying execution for %s because it is being executed before schedule.", this.f4193e.f5894c), new Throwable[0]);
                    m5187i(true);
                    this.f4199v.m33042z();
                    this.f4199v.m33031i();
                    return;
                }
            }
            this.f4199v.m33042z();
            this.f4199v.m33031i();
            if (this.f4193e.m7535d()) {
                c2896bMo4840b = this.f4193e.f5896e;
            } else {
                AbstractC1095h abstractC1095hM4843b = this.f4197t.m14485f().m4843b(this.f4193e.f5895d);
                if (abstractC1095hM4843b == null) {
                    AbstractC1097j.m4844c().mo4848b(f4184E, String.format("Could not create Input Merger %s", this.f4193e.f5895d), new Throwable[0]);
                    m5196l();
                    return;
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.f4193e.f5896e);
                    arrayList.addAll(this.f4200w.mo7553q(this.f4190b));
                    c2896bMo4840b = abstractC1095hM4843b.mo4840b(arrayList);
                }
            }
            WorkerParameters workerParameters = new WorkerParameters(UUID.fromString(this.f4190b), c2896bMo4840b, this.f4203z, this.f4192d, this.f4193e.f5902k, this.f4197t.m14484e(), this.f4195r, this.f4197t.m14492m(), new C1939q(this.f4199v, this.f4195r), new C1938p(this.f4199v, this.f4198u, this.f4195r));
            if (this.f4194f == null) {
                this.f4194f = this.f4197t.m14492m().m4876b(this.f4189a, this.f4193e.f5894c, workerParameters);
            }
            ListenableWorker listenableWorker = this.f4194f;
            if (listenableWorker == null) {
                AbstractC1097j.m4844c().mo4848b(f4184E, String.format("Could not create Worker %s", this.f4193e.f5894c), new Throwable[0]);
                m5196l();
                return;
            }
            if (listenableWorker.isUsed()) {
                AbstractC1097j.m4844c().mo4848b(f4184E, String.format("Received an already-used Worker %s; WorkerFactory should return new instances", this.f4193e.f5894c), new Throwable[0]);
                m5196l();
                return;
            }
            this.f4194f.setUsed();
            if (!m5192o()) {
                m5188j();
                return;
            }
            if (m5191n()) {
                return;
            }
            C2913c c2913cM14629s = C2913c.m14629s();
            RunnableC1937o runnableC1937o = new RunnableC1937o(this.f4189a, this.f4193e, this.f4194f, workerParameters.m14469b(), this.f4195r);
            this.f4195r.mo8370a().execute(runnableC1937o);
            InterfaceFutureC1673e interfaceFutureC1673eM7988a = runnableC1937o.m7988a();
            interfaceFutureC1673eM7988a.addListener(new a(interfaceFutureC1673eM7988a, c2913cM14629s), this.f4195r.mo8370a());
            c2913cM14629s.addListener(new b(c2913cM14629s, this.f4185A), this.f4195r.getBackgroundExecutor());
        } catch (Throwable th) {
            this.f4199v.m33031i();
            throw th;
        }
    }

    /* JADX INFO: renamed from: m */
    private void m5190m() {
        this.f4199v.m33029e();
        try {
            this.f4200w.mo7546j(EnumC1106s.SUCCEEDED, this.f4190b);
            this.f4200w.mo7543g(this.f4190b, ((ListenableWorker.AbstractC2892a.c) this.f4196s).m14466e());
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (String str : this.f4201x.mo7510a(this.f4190b)) {
                if (this.f4200w.mo7549m(str) == EnumC1106s.BLOCKED && this.f4201x.mo7512c(str)) {
                    AbstractC1097j.m4844c().mo4849d(f4184E, String.format("Setting status to enqueued for %s", str), new Throwable[0]);
                    this.f4200w.mo7546j(EnumC1106s.ENQUEUED, str);
                    this.f4200w.mo7555s(str, jCurrentTimeMillis);
                }
            }
            this.f4199v.m33042z();
        } finally {
            this.f4199v.m33031i();
            m5187i(false);
        }
    }

    /* JADX INFO: renamed from: n */
    private boolean m5191n() {
        if (!this.f4188D) {
            return false;
        }
        AbstractC1097j.m4844c().mo4847a(f4184E, String.format("Work interrupted for %s", this.f4185A), new Throwable[0]);
        EnumC1106s enumC1106sMo7549m = this.f4200w.mo7549m(this.f4190b);
        if (enumC1106sMo7549m == null) {
            m5187i(false);
        } else {
            m5187i(!enumC1106sMo7549m.m4861c());
        }
        return true;
    }

    /* JADX INFO: renamed from: o */
    private boolean m5192o() {
        boolean z7;
        this.f4199v.m33029e();
        try {
            if (this.f4200w.mo7549m(this.f4190b) == EnumC1106s.ENQUEUED) {
                this.f4200w.mo7546j(EnumC1106s.RUNNING, this.f4190b);
                this.f4200w.mo7554r(this.f4190b);
                z7 = true;
            } else {
                z7 = false;
            }
            this.f4199v.m33042z();
            return z7;
        } finally {
            this.f4199v.m33031i();
        }
    }

    /* JADX INFO: renamed from: b */
    public InterfaceFutureC1673e m5193b() {
        return this.f4186B;
    }

    /* JADX INFO: renamed from: d */
    public void m5194d() {
        boolean zIsDone;
        this.f4188D = true;
        m5191n();
        InterfaceFutureC1673e interfaceFutureC1673e = this.f4187C;
        if (interfaceFutureC1673e != null) {
            zIsDone = interfaceFutureC1673e.isDone();
            this.f4187C.cancel(true);
        } else {
            zIsDone = false;
        }
        ListenableWorker listenableWorker = this.f4194f;
        if (listenableWorker != null && !zIsDone) {
            listenableWorker.stop();
        } else {
            AbstractC1097j.m4844c().mo4847a(f4184E, String.format("WorkSpec %s is already done. Not interrupting.", this.f4193e), new Throwable[0]);
        }
    }

    /* JADX INFO: renamed from: f */
    void m5195f() {
        if (!m5191n()) {
            this.f4199v.m33029e();
            try {
                EnumC1106s enumC1106sMo7549m = this.f4200w.mo7549m(this.f4190b);
                this.f4199v.mo14517J().mo7528a(this.f4190b);
                if (enumC1106sMo7549m == null) {
                    m5187i(false);
                } else if (enumC1106sMo7549m == EnumC1106s.RUNNING) {
                    m5183c(this.f4196s);
                } else if (!enumC1106sMo7549m.m4861c()) {
                    m5185g();
                }
                this.f4199v.m33042z();
                this.f4199v.m33031i();
            } catch (Throwable th) {
                this.f4199v.m33031i();
                throw th;
            }
        }
        List list = this.f4191c;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((InterfaceC1178e) it.next()).mo5141e(this.f4190b);
            }
            AbstractC1179f.m5143b(this.f4197t, this.f4199v, this.f4191c);
        }
    }

    /* JADX INFO: renamed from: l */
    void m5196l() {
        this.f4199v.m33029e();
        try {
            m5184e(this.f4190b);
            this.f4200w.mo7543g(this.f4190b, ((ListenableWorker.AbstractC2892a.a) this.f4196s).m14465e());
            this.f4199v.m33042z();
        } finally {
            this.f4199v.m33031i();
            m5187i(false);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        List listMo7560b = this.f4202y.mo7560b(this.f4190b);
        this.f4203z = listMo7560b;
        this.f4185A = m5182a(listMo7560b);
        m5189k();
    }
}
