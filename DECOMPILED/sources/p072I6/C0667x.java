package p072I6;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: I6.x */
/* JADX INFO: loaded from: classes.dex */
public final class C0667x {

    /* JADX INFO: renamed from: a */
    public static final C0667x f2605a = new C0667x();

    /* JADX INFO: renamed from: b */
    private static final int f2606b = 65536;

    /* JADX INFO: renamed from: c */
    private static final C0666w f2607c = new C0666w(new byte[0], 0, 0, false, false);

    /* JADX INFO: renamed from: d */
    private static final int f2608d;

    /* JADX INFO: renamed from: e */
    private static final AtomicReference[] f2609e;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f2608d = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i7 = 0; i7 < iHighestOneBit; i7++) {
            atomicReferenceArr[i7] = new AtomicReference();
        }
        f2609e = atomicReferenceArr;
    }

    private C0667x() {
    }

    /* JADX INFO: renamed from: a */
    private final AtomicReference m3177a() {
        return f2609e[(int) (Thread.currentThread().getId() & (((long) f2608d) - 1))];
    }

    /* JADX INFO: renamed from: b */
    public static final void m3178b(C0666w segment) {
        AbstractC6118n.m27187e(segment, "segment");
        if (segment.f2603f != null || segment.f2604g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (segment.f2601d) {
            return;
        }
        AtomicReference atomicReferenceM3177a = f2605a.m3177a();
        C0666w c0666w = f2607c;
        C0666w c0666w2 = (C0666w) atomicReferenceM3177a.getAndSet(c0666w);
        if (c0666w2 == c0666w) {
            return;
        }
        int i7 = c0666w2 != null ? c0666w2.f2600c : 0;
        if (i7 >= f2606b) {
            atomicReferenceM3177a.set(c0666w2);
            return;
        }
        segment.f2603f = c0666w2;
        segment.f2599b = 0;
        segment.f2600c = i7 + 8192;
        atomicReferenceM3177a.set(segment);
    }

    /* JADX INFO: renamed from: c */
    public static final C0666w m3179c() {
        AtomicReference atomicReferenceM3177a = f2605a.m3177a();
        C0666w c0666w = f2607c;
        C0666w c0666w2 = (C0666w) atomicReferenceM3177a.getAndSet(c0666w);
        if (c0666w2 == c0666w) {
            return new C0666w();
        }
        if (c0666w2 == null) {
            atomicReferenceM3177a.set(null);
            return new C0666w();
        }
        atomicReferenceM3177a.set(c0666w2.f2603f);
        c0666w2.f2603f = null;
        c0666w2.f2600c = 0;
        return c0666w2;
    }
}
