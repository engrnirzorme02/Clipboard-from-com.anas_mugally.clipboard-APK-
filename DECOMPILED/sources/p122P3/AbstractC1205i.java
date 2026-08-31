package p122P3;

import java.util.Arrays;

/* JADX INFO: renamed from: P3.i */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1205i extends AbstractC1200d {
    /* JADX INFO: renamed from: a */
    public static boolean m5282a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static int m5283b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }
}
