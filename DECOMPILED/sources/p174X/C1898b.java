package p174X;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1898b {

    /* JADX INFO: renamed from: a */
    private final AtomicInteger f6104a;

    public C1898b(int i7) {
        this.f6104a = new AtomicInteger(i7);
    }

    /* JADX INFO: renamed from: a */
    public final int m7834a() {
        return this.f6104a.decrementAndGet();
    }

    /* JADX INFO: renamed from: b */
    public final int m7835b() {
        return this.f6104a.get();
    }

    /* JADX INFO: renamed from: c */
    public final int m7836c() {
        return this.f6104a.getAndIncrement();
    }

    /* JADX INFO: renamed from: d */
    public final int m7837d() {
        return this.f6104a.incrementAndGet();
    }
}
