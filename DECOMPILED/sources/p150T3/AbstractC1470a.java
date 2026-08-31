package p150T3;

import com.google.android.gms.common.api.C3553a;

/* JADX INFO: renamed from: T3.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1470a extends AbstractC1471b {
    /* JADX INFO: renamed from: a */
    public static int m6131a(long j7) {
        if (j7 > 2147483647L) {
            return C3553a.e.API_PRIORITY_OTHER;
        }
        if (j7 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j7;
    }
}
