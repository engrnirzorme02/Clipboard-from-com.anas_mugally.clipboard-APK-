package p145S5;

import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: S5.o */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1437o {
    /* JADX INFO: renamed from: a */
    public static final Object m6081a(Throwable exception) {
        AbstractC6118n.m27187e(exception, "exception");
        return new C1436n.b(exception);
    }

    /* JADX INFO: renamed from: b */
    public static final void m6082b(Object obj) {
        if (obj instanceof C1436n.b) {
            throw ((C1436n.b) obj).f4960a;
        }
    }
}
