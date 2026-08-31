package p175X0;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.impl.utils.futures.C2913c;
import p081K.C0709a;
import p112O0.AbstractC1097j;
import p112O0.C1092e;
import p112O0.InterfaceC1093f;
import p157U3.InterfaceFutureC1673e;
import p168W0.C1814p;
import p182Y0.InterfaceC2010a;

/* JADX INFO: renamed from: X0.o */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC1937o implements Runnable {

    /* JADX INFO: renamed from: r */
    static final String f6394r = AbstractC1097j.m4846f("WorkForegroundRunnable");

    /* JADX INFO: renamed from: a */
    final C2913c f6395a = C2913c.m14629s();

    /* JADX INFO: renamed from: b */
    final Context f6396b;

    /* JADX INFO: renamed from: c */
    final C1814p f6397c;

    /* JADX INFO: renamed from: d */
    final ListenableWorker f6398d;

    /* JADX INFO: renamed from: e */
    final InterfaceC1093f f6399e;

    /* JADX INFO: renamed from: f */
    final InterfaceC2010a f6400f;

    /* JADX INFO: renamed from: X0.o$a */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C2913c f6401a;

        a(C2913c c2913c) {
            this.f6401a = c2913c;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f6401a.mo14621q(RunnableC1937o.this.f6398d.getForegroundInfoAsync());
        }
    }

    /* JADX INFO: renamed from: X0.o$b */
    class b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C2913c f6403a;

        b(C2913c c2913c) {
            this.f6403a = c2913c;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C1092e c1092e = (C1092e) this.f6403a.get();
                if (c1092e == null) {
                    throw new IllegalStateException(String.format("Worker was marked important (%s) but did not provide ForegroundInfo", RunnableC1937o.this.f6397c.f5894c));
                }
                AbstractC1097j.m4844c().mo4847a(RunnableC1937o.f6394r, String.format("Updating notification for %s", RunnableC1937o.this.f6397c.f5894c), new Throwable[0]);
                RunnableC1937o.this.f6398d.setRunInForeground(true);
                RunnableC1937o runnableC1937o = RunnableC1937o.this;
                runnableC1937o.f6395a.mo14621q(runnableC1937o.f6399e.mo4838a(runnableC1937o.f6396b, runnableC1937o.f6398d.getId(), c1092e));
            } catch (Throwable th) {
                RunnableC1937o.this.f6395a.mo14620p(th);
            }
        }
    }

    public RunnableC1937o(Context context, C1814p c1814p, ListenableWorker listenableWorker, InterfaceC1093f interfaceC1093f, InterfaceC2010a interfaceC2010a) {
        this.f6396b = context;
        this.f6397c = c1814p;
        this.f6398d = listenableWorker;
        this.f6399e = interfaceC1093f;
        this.f6400f = interfaceC2010a;
    }

    /* JADX INFO: renamed from: a */
    public InterfaceFutureC1673e m7988a() {
        return this.f6395a;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!this.f6397c.f5908q || C0709a.m3452c()) {
            this.f6395a.mo14619o(null);
            return;
        }
        C2913c c2913cM14629s = C2913c.m14629s();
        this.f6400f.mo8370a().execute(new a(c2913cM14629s));
        c2913cM14629s.addListener(new b(c2913cM14629s), this.f6400f.mo8370a());
    }
}
