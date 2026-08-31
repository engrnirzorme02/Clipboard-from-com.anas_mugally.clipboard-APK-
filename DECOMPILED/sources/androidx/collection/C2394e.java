package androidx.collection;

import kotlin.jvm.internal.AbstractC6112h;
import p152T5.AbstractC1631j;

/* JADX INFO: renamed from: androidx.collection.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2394e {

    /* JADX INFO: renamed from: a */
    private int[] f8463a;

    /* JADX INFO: renamed from: b */
    private int f8464b;

    /* JADX INFO: renamed from: c */
    private int f8465c;

    /* JADX INFO: renamed from: d */
    private int f8466d;

    public C2394e() {
        this(0, 1, null);
    }

    /* JADX INFO: renamed from: c */
    private final void m10276c() {
        int[] iArr = this.f8463a;
        int length = iArr.length;
        int i7 = this.f8464b;
        int i8 = length - i7;
        int i9 = length << 1;
        if (i9 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        int[] iArr2 = new int[i9];
        AbstractC1631j.m6692e(iArr, iArr2, 0, i7, length);
        AbstractC1631j.m6692e(this.f8463a, iArr2, i8, 0, this.f8464b);
        this.f8463a = iArr2;
        this.f8464b = 0;
        this.f8465c = length;
        this.f8466d = i9 - 1;
    }

    /* JADX INFO: renamed from: a */
    public final void m10277a(int i7) {
        int[] iArr = this.f8463a;
        int i8 = this.f8465c;
        iArr[i8] = i7;
        int i9 = this.f8466d & (i8 + 1);
        this.f8465c = i9;
        if (i9 == this.f8464b) {
            m10276c();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m10278b() {
        this.f8465c = this.f8464b;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m10279d() {
        return this.f8464b == this.f8465c;
    }

    /* JADX INFO: renamed from: e */
    public final int m10280e() {
        int i7 = this.f8464b;
        if (i7 == this.f8465c) {
            C2395f c2395f = C2395f.f8467a;
            throw new ArrayIndexOutOfBoundsException();
        }
        int i8 = this.f8463a[i7];
        this.f8464b = (i7 + 1) & this.f8466d;
        return i8;
    }

    public C2394e(int i7) {
        if (i7 < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        }
        if (i7 > 1073741824) {
            throw new IllegalArgumentException("capacity must be <= 2^30");
        }
        i7 = Integer.bitCount(i7) != 1 ? Integer.highestOneBit(i7 - 1) << 1 : i7;
        this.f8466d = i7 - 1;
        this.f8463a = new int[i7];
    }

    public /* synthetic */ C2394e(int i7, int i8, AbstractC6112h abstractC6112h) {
        this((i8 & 1) != 0 ? 8 : i7);
    }
}
