package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.futures.C2913c;
import java.util.Collections;
import java.util.List;
import p112O0.AbstractC1097j;
import p119P0.C1182i;
import p140S0.C1385d;
import p140S0.InterfaceC1384c;
import p157U3.InterfaceFutureC1673e;
import p168W0.C1814p;
import p182Y0.InterfaceC2010a;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintTrackingWorker extends ListenableWorker implements InterfaceC1384c {

    /* JADX INFO: renamed from: v */
    private static final String f12020v = AbstractC1097j.m4846f("ConstraintTrkngWrkr");

    /* JADX INFO: renamed from: f */
    private WorkerParameters f12021f;

    /* JADX INFO: renamed from: r */
    final Object f12022r;

    /* JADX INFO: renamed from: s */
    volatile boolean f12023s;

    /* JADX INFO: renamed from: t */
    C2913c f12024t;

    /* JADX INFO: renamed from: u */
    private ListenableWorker f12025u;

    /* JADX INFO: renamed from: androidx.work.impl.workers.ConstraintTrackingWorker$a */
    class RunnableC2914a implements Runnable {
        RunnableC2914a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ConstraintTrackingWorker.this.m14633e();
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.workers.ConstraintTrackingWorker$b */
    class RunnableC2915b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceFutureC1673e f12027a;

        RunnableC2915b(InterfaceFutureC1673e interfaceFutureC1673e) {
            this.f12027a = interfaceFutureC1673e;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (ConstraintTrackingWorker.this.f12022r) {
                try {
                    if (ConstraintTrackingWorker.this.f12023s) {
                        ConstraintTrackingWorker.this.m14632d();
                    } else {
                        ConstraintTrackingWorker.this.f12024t.mo14621q(this.f12027a);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f12021f = workerParameters;
        this.f12022r = new Object();
        this.f12023s = false;
        this.f12024t = C2913c.m14629s();
    }

    /* JADX INFO: renamed from: a */
    public WorkDatabase m14630a() {
        return C1182i.m5164k(getApplicationContext()).m5173o();
    }

    @Override // p140S0.InterfaceC1384c
    /* JADX INFO: renamed from: b */
    public void mo5494b(List list) {
        AbstractC1097j.m4844c().mo4847a(f12020v, String.format("Constraints changed for %s", list), new Throwable[0]);
        synchronized (this.f12022r) {
            this.f12023s = true;
        }
    }

    /* JADX INFO: renamed from: c */
    void m14631c() {
        this.f12024t.mo14619o(ListenableWorker.AbstractC2892a.m14461a());
    }

    /* JADX INFO: renamed from: d */
    void m14632d() {
        this.f12024t.mo14619o(ListenableWorker.AbstractC2892a.m14462b());
    }

    /* JADX INFO: renamed from: e */
    void m14633e() {
        String strM14503i = getInputData().m14503i("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        if (TextUtils.isEmpty(strM14503i)) {
            AbstractC1097j.m4844c().mo4848b(f12020v, "No worker to delegate to.", new Throwable[0]);
            m14631c();
            return;
        }
        ListenableWorker listenableWorkerM4876b = getWorkerFactory().m4876b(getApplicationContext(), strM14503i, this.f12021f);
        this.f12025u = listenableWorkerM4876b;
        if (listenableWorkerM4876b == null) {
            AbstractC1097j.m4844c().mo4847a(f12020v, "No worker to delegate to.", new Throwable[0]);
            m14631c();
            return;
        }
        C1814p c1814pMo7550n = m14630a().mo14518K().mo7550n(getId().toString());
        if (c1814pMo7550n == null) {
            m14631c();
            return;
        }
        C1385d c1385d = new C1385d(getApplicationContext(), getTaskExecutor(), this);
        c1385d.m5957d(Collections.singletonList(c1814pMo7550n));
        if (!c1385d.m5956c(getId().toString())) {
            AbstractC1097j.m4844c().mo4847a(f12020v, String.format("Constraints not met for delegate %s. Requesting retry.", strM14503i), new Throwable[0]);
            m14632d();
            return;
        }
        AbstractC1097j.m4844c().mo4847a(f12020v, String.format("Constraints met for delegate %s", strM14503i), new Throwable[0]);
        try {
            InterfaceFutureC1673e interfaceFutureC1673eStartWork = this.f12025u.startWork();
            interfaceFutureC1673eStartWork.addListener(new RunnableC2915b(interfaceFutureC1673eStartWork), getBackgroundExecutor());
        } catch (Throwable th) {
            AbstractC1097j abstractC1097jM4844c = AbstractC1097j.m4844c();
            String str = f12020v;
            abstractC1097jM4844c.mo4847a(str, String.format("Delegated worker %s threw exception in startWork.", strM14503i), th);
            synchronized (this.f12022r) {
                try {
                    if (this.f12023s) {
                        AbstractC1097j.m4844c().mo4847a(str, "Constraints were unmet, Retrying.", new Throwable[0]);
                        m14632d();
                    } else {
                        m14631c();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // p140S0.InterfaceC1384c
    /* JADX INFO: renamed from: f */
    public void mo5495f(List list) {
    }

    @Override // androidx.work.ListenableWorker
    public InterfaceC2010a getTaskExecutor() {
        return C1182i.m5164k(getApplicationContext()).m5174p();
    }

    @Override // androidx.work.ListenableWorker
    public boolean isRunInForeground() {
        ListenableWorker listenableWorker = this.f12025u;
        return listenableWorker != null && listenableWorker.isRunInForeground();
    }

    @Override // androidx.work.ListenableWorker
    public void onStopped() {
        super.onStopped();
        ListenableWorker listenableWorker = this.f12025u;
        if (listenableWorker == null || listenableWorker.isStopped()) {
            return;
        }
        this.f12025u.stop();
    }

    @Override // androidx.work.ListenableWorker
    public InterfaceFutureC1673e startWork() {
        getBackgroundExecutor().execute(new RunnableC2914a());
        return this.f12024t;
    }
}
