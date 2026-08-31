package p217c3;

import com.google.android.gms.common.internal.AbstractC3718s;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: c3.b */
/* JADX INFO: loaded from: classes.dex */
public class ThreadFactoryC3009b implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    private final String f12432a;

    /* JADX INFO: renamed from: b */
    private final ThreadFactory f12433b = Executors.defaultThreadFactory();

    public ThreadFactoryC3009b(String str) {
        AbstractC3718s.m18084m(str, "Name must not be null");
        this.f12432a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f12433b.newThread(new RunnableC3010c(runnable, 0));
        threadNewThread.setName(this.f12432a);
        return threadNewThread;
    }
}
