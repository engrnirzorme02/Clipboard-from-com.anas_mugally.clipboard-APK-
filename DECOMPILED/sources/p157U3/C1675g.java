package p157U3;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: U3.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C1675g {

    /* JADX INFO: renamed from: a */
    private String f5574a = null;

    /* JADX INFO: renamed from: b */
    private Boolean f5575b = null;

    /* JADX INFO: renamed from: c */
    private Integer f5576c = null;

    /* JADX INFO: renamed from: d */
    private Thread.UncaughtExceptionHandler f5577d = null;

    /* JADX INFO: renamed from: e */
    private ThreadFactory f5578e = null;

    /* JADX INFO: renamed from: U3.g$a */
    class a implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ThreadFactory f5579a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f5580b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ AtomicLong f5581c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ Boolean f5582d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ Integer f5583e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ Thread.UncaughtExceptionHandler f5584f;

        a(ThreadFactory threadFactory, String str, AtomicLong atomicLong, Boolean bool, Integer num, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f5579a = threadFactory;
            this.f5580b = str;
            this.f5581c = atomicLong;
            this.f5582d = bool;
            this.f5583e = num;
            this.f5584f = uncaughtExceptionHandler;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = this.f5579a.newThread(runnable);
            Objects.requireNonNull(threadNewThread);
            String str = this.f5580b;
            if (str != null) {
                AtomicLong atomicLong = this.f5581c;
                Objects.requireNonNull(atomicLong);
                threadNewThread.setName(C1675g.m7036d(str, Long.valueOf(atomicLong.getAndIncrement())));
            }
            Boolean bool = this.f5582d;
            if (bool != null) {
                threadNewThread.setDaemon(bool.booleanValue());
            }
            Integer num = this.f5583e;
            if (num != null) {
                threadNewThread.setPriority(num.intValue());
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f5584f;
            if (uncaughtExceptionHandler != null) {
                threadNewThread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
            }
            return threadNewThread;
        }
    }

    /* JADX INFO: renamed from: c */
    private static ThreadFactory m7035c(C1675g c1675g) {
        String str = c1675g.f5574a;
        Boolean bool = c1675g.f5575b;
        Integer num = c1675g.f5576c;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = c1675g.f5577d;
        ThreadFactory threadFactoryDefaultThreadFactory = c1675g.f5578e;
        if (threadFactoryDefaultThreadFactory == null) {
            threadFactoryDefaultThreadFactory = Executors.defaultThreadFactory();
        }
        return new a(threadFactoryDefaultThreadFactory, str, str != null ? new AtomicLong(0L) : null, bool, num, uncaughtExceptionHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static String m7036d(String str, Object... objArr) {
        return String.format(Locale.ROOT, str, objArr);
    }

    /* JADX INFO: renamed from: b */
    public ThreadFactory m7037b() {
        return m7035c(this);
    }

    /* JADX INFO: renamed from: e */
    public C1675g m7038e(boolean z7) {
        this.f5575b = Boolean.valueOf(z7);
        return this;
    }

    /* JADX INFO: renamed from: f */
    public C1675g m7039f(String str) {
        m7036d(str, 0);
        this.f5574a = str;
        return this;
    }
}
