package p174X;

import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: X.B */
/* JADX INFO: loaded from: classes.dex */
public final class C1882B extends AbstractC1889I {

    /* JADX INFO: renamed from: b */
    private final Throwable f6057b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1882B(Throwable readException, int i7) {
        super(i7, null);
        AbstractC6118n.m27187e(readException, "readException");
        this.f6057b = readException;
    }

    /* JADX INFO: renamed from: b */
    public final Throwable m7798b() {
        return this.f6057b;
    }
}
