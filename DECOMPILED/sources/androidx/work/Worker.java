package androidx.work;

import android.content.Context;
import androidx.work.impl.utils.futures.C2913c;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes.dex */
public abstract class Worker extends ListenableWorker {

    /* JADX INFO: renamed from: f */
    C2913c f11844f;

    /* JADX INFO: renamed from: androidx.work.Worker$a */
    class RunnableC2893a implements Runnable {
        RunnableC2893a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Worker.this.f11844f.mo14619o(Worker.this.doWork());
            } catch (Throwable th) {
                Worker.this.f11844f.mo14620p(th);
            }
        }
    }

    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract ListenableWorker.AbstractC2892a doWork();

    @Override // androidx.work.ListenableWorker
    public final InterfaceFutureC1673e startWork() {
        this.f11844f = C2913c.m14629s();
        getBackgroundExecutor().execute(new RunnableC2893a());
        return this.f11844f;
    }
}
