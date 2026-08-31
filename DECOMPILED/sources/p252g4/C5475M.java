package p252g4;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: g4.M */
/* JADX INFO: loaded from: classes.dex */
public final class C5475M {

    /* JADX INFO: renamed from: a */
    private final AtomicInteger f20807a = new AtomicInteger();

    /* JADX INFO: renamed from: b */
    private final AtomicInteger f20808b = new AtomicInteger();

    /* JADX INFO: renamed from: a */
    public void m24721a() {
        this.f20808b.getAndIncrement();
    }

    /* JADX INFO: renamed from: b */
    public void m24722b() {
        this.f20807a.getAndIncrement();
    }

    /* JADX INFO: renamed from: c */
    public void m24723c() {
        this.f20808b.set(0);
    }
}
