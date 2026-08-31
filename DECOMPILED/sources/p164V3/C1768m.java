package p164V3;

import com.google.android.gms.common.internal.AbstractC3718s;

/* JADX INFO: renamed from: V3.m */
/* JADX INFO: loaded from: classes.dex */
public class C1768m extends Exception {
    protected C1768m() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1768m(String str) {
        super(str);
        AbstractC3718s.m18078g(str, "Detail message must not be empty");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1768m(String str, Throwable th) {
        super(str, th);
        AbstractC3718s.m18078g(str, "Detail message must not be empty");
    }
}
