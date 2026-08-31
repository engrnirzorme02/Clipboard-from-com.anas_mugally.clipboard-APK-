package p194Z5;

/* JADX INFO: renamed from: Z5.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2168c {
    /* JADX INFO: renamed from: a */
    private static final int m8788a(int i7, int i8, int i9) {
        return m8790c(m8790c(i7, i9) - m8790c(i8, i9), i9);
    }

    /* JADX INFO: renamed from: b */
    public static final int m8789b(int i7, int i8, int i9) {
        if (i9 > 0) {
            if (i7 < i8) {
                return i8 - m8788a(i8, i7, i9);
            }
        } else {
            if (i9 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i7 > i8) {
                return i8 + m8788a(i7, i8, -i9);
            }
        }
        return i8;
    }

    /* JADX INFO: renamed from: c */
    private static final int m8790c(int i7, int i8) {
        int i9 = i7 % i8;
        return i9 >= 0 ? i9 : i9 + i8;
    }
}
