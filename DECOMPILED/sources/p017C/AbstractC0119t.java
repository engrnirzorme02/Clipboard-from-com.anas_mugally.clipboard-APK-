package p017C;

import android.app.RemoteInput;

/* JADX INFO: renamed from: C.t */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0119t {

    /* JADX INFO: renamed from: C.t$a */
    static class a {
        /* JADX INFO: renamed from: a */
        public static RemoteInput m568a(AbstractC0119t abstractC0119t) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    static RemoteInput m566a(AbstractC0119t abstractC0119t) {
        return a.m568a(abstractC0119t);
    }

    /* JADX INFO: renamed from: b */
    static RemoteInput[] m567b(AbstractC0119t[] abstractC0119tArr) {
        if (abstractC0119tArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[abstractC0119tArr.length];
        for (int i7 = 0; i7 < abstractC0119tArr.length; i7++) {
            AbstractC0119t abstractC0119t = abstractC0119tArr[i7];
            remoteInputArr[i7] = m566a(null);
        }
        return remoteInputArr;
    }
}
