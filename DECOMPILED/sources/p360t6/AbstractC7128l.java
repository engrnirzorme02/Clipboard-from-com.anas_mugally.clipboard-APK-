package p360t6;

import p318o6.AbstractC6618K;

/* JADX INFO: renamed from: t6.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7128l {
    /* JADX INFO: renamed from: a */
    public static final void m31467a(int i7) {
        if (i7 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Expected positive parallelism level, but got " + i7).toString());
    }

    /* JADX INFO: renamed from: b */
    public static final AbstractC6618K m31468b(AbstractC6618K abstractC6618K, String str) {
        return str != null ? new C7138v(abstractC6618K, str) : abstractC6618K;
    }
}
