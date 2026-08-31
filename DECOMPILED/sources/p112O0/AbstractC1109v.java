package p112O0;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;

/* JADX INFO: renamed from: O0.v */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1109v {

    /* JADX INFO: renamed from: a */
    private static final String f3984a = AbstractC1097j.m4846f("WorkerFactory");

    /* JADX INFO: renamed from: O0.v$a */
    class a extends AbstractC1109v {
        a() {
        }

        @Override // p112O0.AbstractC1109v
        /* JADX INFO: renamed from: a */
        public ListenableWorker mo4875a(Context context, String str, WorkerParameters workerParameters) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC1109v m4874c() {
        return new a();
    }

    /* JADX INFO: renamed from: a */
    public abstract ListenableWorker mo4875a(Context context, String str, WorkerParameters workerParameters);

    /* JADX INFO: renamed from: b */
    public final ListenableWorker m4876b(Context context, String str, WorkerParameters workerParameters) {
        Class clsAsSubclass;
        ListenableWorker listenableWorkerMo4875a = mo4875a(context, str, workerParameters);
        if (listenableWorkerMo4875a == null) {
            try {
                clsAsSubclass = Class.forName(str).asSubclass(ListenableWorker.class);
            } catch (Throwable th) {
                AbstractC1097j.m4844c().mo4848b(f3984a, "Invalid class: " + str, th);
                clsAsSubclass = null;
            }
            if (clsAsSubclass != null) {
                try {
                    listenableWorkerMo4875a = (ListenableWorker) clsAsSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                } catch (Throwable th2) {
                    AbstractC1097j.m4844c().mo4848b(f3984a, "Could not instantiate " + str, th2);
                }
            }
        }
        if (listenableWorkerMo4875a == null || !listenableWorkerMo4875a.isUsed()) {
            return listenableWorkerMo4875a;
        }
        throw new IllegalStateException(String.format("WorkerFactory (%s) returned an instance of a ListenableWorker (%s) which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.", getClass().getName(), str));
    }
}
