package p129Q3;

/* JADX INFO: renamed from: Q3.i */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC1270i {
    /* JADX INFO: renamed from: a */
    static int m5511a(int i7) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i7) * (-862048943)), 15)) * 461845907);
    }

    /* JADX INFO: renamed from: b */
    static int m5512b(Object obj) {
        return m5511a(obj == null ? 0 : obj.hashCode());
    }
}
