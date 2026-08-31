package p277j5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: j5.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5897b {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC5896a f23457a;

    /* JADX INFO: renamed from: b */
    private static volatile InterfaceC5896a f23458b;

    /* JADX INFO: renamed from: j5.b$b */
    private static class b implements InterfaceC5896a {
        private b() {
        }

        @Override // p277j5.InterfaceC5896a
        /* JADX INFO: renamed from: a */
        public ExecutorService mo26636a(ThreadFactory threadFactory, EnumC5898c enumC5898c) {
            return m26638b(1, threadFactory, enumC5898c);
        }

        /* JADX INFO: renamed from: b */
        public ExecutorService m26638b(int i7, ThreadFactory threadFactory, EnumC5898c enumC5898c) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i7, i7, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            return Executors.unconfigurableExecutorService(threadPoolExecutor);
        }
    }

    static {
        b bVar = new b();
        f23457a = bVar;
        f23458b = bVar;
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC5896a m26637a() {
        return f23458b;
    }
}
