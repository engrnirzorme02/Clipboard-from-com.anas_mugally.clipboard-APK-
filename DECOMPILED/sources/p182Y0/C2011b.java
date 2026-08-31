package p182Y0;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import p175X0.ExecutorC1933k;

/* JADX INFO: renamed from: Y0.b */
/* JADX INFO: loaded from: classes.dex */
public class C2011b implements InterfaceC2010a {

    /* JADX INFO: renamed from: a */
    private final ExecutorC1933k f6678a;

    /* JADX INFO: renamed from: b */
    private final Handler f6679b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c */
    private final Executor f6680c = new a();

    /* JADX INFO: renamed from: Y0.b$a */
    class a implements Executor {
        a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            C2011b.this.m8372c(runnable);
        }
    }

    public C2011b(Executor executor) {
        this.f6678a = new ExecutorC1933k(executor);
    }

    @Override // p182Y0.InterfaceC2010a
    /* JADX INFO: renamed from: a */
    public Executor mo8370a() {
        return this.f6680c;
    }

    @Override // p182Y0.InterfaceC2010a
    /* JADX INFO: renamed from: b */
    public void mo8371b(Runnable runnable) {
        this.f6678a.execute(runnable);
    }

    /* JADX INFO: renamed from: c */
    public void m8372c(Runnable runnable) {
        this.f6679b.post(runnable);
    }

    @Override // p182Y0.InterfaceC2010a
    public ExecutorC1933k getBackgroundExecutor() {
        return this.f6678a;
    }
}
