package p310n6;

/* JADX INFO: renamed from: n6.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6505b {

    /* JADX INFO: renamed from: a */
    private static final boolean f24610a = false;

    /* JADX INFO: renamed from: b */
    private static final ThreadLocal[] f24611b;

    static {
        ThreadLocal[] threadLocalArr = new ThreadLocal[4];
        for (int i7 = 0; i7 < 4; i7++) {
            threadLocalArr[i7] = new ThreadLocal();
        }
        f24611b = threadLocalArr;
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m27715a() {
        return f24610a;
    }
}
