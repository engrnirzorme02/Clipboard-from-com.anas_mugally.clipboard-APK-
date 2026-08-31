package p360t6;

import java.util.concurrent.atomic.AtomicReferenceArray;
import p278j6.AbstractC5905g;

/* JADX INFO: renamed from: t6.y */
/* JADX INFO: loaded from: classes.dex */
public final class C7141y {
    private volatile AtomicReferenceArray<Object> array;

    public C7141y(int i7) {
        this.array = new AtomicReferenceArray<>(i7);
    }

    /* JADX INFO: renamed from: a */
    public final int m31518a() {
        return this.array.length();
    }

    /* JADX INFO: renamed from: b */
    public final Object m31519b(int i7) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        if (i7 < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i7);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m31520c(int i7, Object obj) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i7 < length) {
            atomicReferenceArray.set(i7, obj);
            return;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(AbstractC5905g.m26654b(i7 + 1, length * 2));
        for (int i8 = 0; i8 < length; i8++) {
            atomicReferenceArray2.set(i8, atomicReferenceArray.get(i8));
        }
        atomicReferenceArray2.set(i7, obj);
        this.array = atomicReferenceArray2;
    }
}
