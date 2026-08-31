package p170W2;

/* JADX INFO: renamed from: W2.L */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1835L {
    /* JADX INFO: renamed from: a */
    static int m7593a(int i7) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i8 = 0; i8 < 6; i8++) {
            int i9 = iArr[i8];
            int i10 = i9 - 1;
            if (i9 == 0) {
                throw null;
            }
            if (i10 == i7) {
                return i9;
            }
        }
        return 1;
    }
}
