package p095L5;

/* JADX INFO: renamed from: L5.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0853i {

    /* JADX INFO: renamed from: a */
    private int f3411a;

    /* JADX INFO: renamed from: b */
    private int f3412b;

    /* JADX INFO: renamed from: c */
    private int f3413c;

    /* JADX INFO: renamed from: d */
    private final int[] f3414d = new int[10];

    /* JADX INFO: renamed from: a */
    public int m3961a(int i7) {
        return this.f3414d[i7];
    }

    /* JADX INFO: renamed from: b */
    int m3962b() {
        if ((this.f3411a & 2) != 0) {
            return this.f3414d[1];
        }
        return -1;
    }

    /* JADX INFO: renamed from: c */
    int m3963c(int i7) {
        return (this.f3411a & 32) != 0 ? this.f3414d[5] : i7;
    }

    /* JADX INFO: renamed from: d */
    public boolean m3964d(int i7) {
        return ((1 << i7) & this.f3411a) != 0;
    }

    /* JADX INFO: renamed from: e */
    public C0853i m3965e(int i7, int i8, int i9) {
        int[] iArr = this.f3414d;
        if (i7 >= iArr.length) {
            return this;
        }
        int i10 = 1 << i7;
        this.f3411a |= i10;
        if ((i8 & 1) != 0) {
            this.f3412b |= i10;
        } else {
            this.f3412b &= ~i10;
        }
        if ((i8 & 2) != 0) {
            this.f3413c |= i10;
        } else {
            this.f3413c &= ~i10;
        }
        iArr[i7] = i9;
        return this;
    }

    /* JADX INFO: renamed from: f */
    int m3966f() {
        return Integer.bitCount(this.f3411a);
    }
}
