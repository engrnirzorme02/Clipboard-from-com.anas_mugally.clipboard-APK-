package p360t6;

import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: t6.B */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7102B {
    /* JADX INFO: renamed from: a */
    public static Object m31382a(Object obj) {
        return obj;
    }

    /* JADX INFO: renamed from: b */
    public static final AbstractC7101A m31383b(Object obj) {
        if (obj == AbstractC7117a.f28407a) {
            throw new IllegalStateException("Does not contain segment");
        }
        AbstractC6118n.m27185c(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
        return (AbstractC7101A) obj;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m31384c(Object obj) {
        return obj == AbstractC7117a.f28407a;
    }
}
