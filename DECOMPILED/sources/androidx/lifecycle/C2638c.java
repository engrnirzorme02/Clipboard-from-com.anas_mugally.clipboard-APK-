package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: androidx.lifecycle.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2638c {

    /* JADX INFO: renamed from: a */
    private final AtomicReference f10456a;

    public C2638c(Object obj) {
        this.f10456a = new AtomicReference(obj);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m12608a(Object obj, Object obj2) {
        return AbstractC2636b.m12603a(this.f10456a, obj, obj2);
    }

    /* JADX INFO: renamed from: b */
    public final Object m12609b() {
        return this.f10456a.get();
    }
}
