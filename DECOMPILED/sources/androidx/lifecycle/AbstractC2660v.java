package androidx.lifecycle;

import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: androidx.lifecycle.v */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2660v {
    /* JADX INFO: renamed from: a */
    public static final void m12656a(InterfaceC2657s interfaceC2657s, AbstractC2650l.b current, AbstractC2650l.b next) {
        AbstractC6118n.m27187e(current, "current");
        AbstractC6118n.m27187e(next, "next");
        if (current == AbstractC2650l.b.INITIALIZED && next == AbstractC2650l.b.DESTROYED) {
            throw new IllegalStateException(("State must be at least '" + AbstractC2650l.b.CREATED + "' to be moved to '" + next + "' in component " + interfaceC2657s).toString());
        }
        AbstractC2650l.b bVar = AbstractC2650l.b.DESTROYED;
        if (current != bVar || current == next) {
            return;
        }
        throw new IllegalStateException(("State is '" + bVar + "' and cannot be moved to `" + next + "` in component " + interfaceC2657s).toString());
    }
}
