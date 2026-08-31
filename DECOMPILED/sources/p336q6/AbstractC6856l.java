package p336q6;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: renamed from: q6.l */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC6856l {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m30045a(AtomicReferenceArray atomicReferenceArray, int i7, Object obj, Object obj2) {
        while (!atomicReferenceArray.compareAndSet(i7, obj, obj2)) {
            if (atomicReferenceArray.get(i7) != obj) {
                return false;
            }
        }
        return true;
    }
}
