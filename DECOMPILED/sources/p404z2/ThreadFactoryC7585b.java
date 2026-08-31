package p404z2;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: z2.b */
/* JADX INFO: loaded from: classes.dex */
final class ThreadFactoryC7585b implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    private final AtomicInteger f30231a = new AtomicInteger(1);

    /* JADX INFO: renamed from: b */
    final /* synthetic */ String f30232b;

    ThreadFactoryC7585b(String str) {
        this.f30232b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int andIncrement = this.f30231a.getAndIncrement();
        int length = String.valueOf(andIncrement).length();
        String str = this.f30232b;
        StringBuilder sb = new StringBuilder(str.length() + 12 + length);
        sb.append("AdWorker(");
        sb.append(str);
        sb.append(") #");
        sb.append(andIncrement);
        return new Thread(runnable, sb.toString());
    }
}
