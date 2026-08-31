package io.grpc.internal;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* JADX INFO: renamed from: io.grpc.internal.X */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5767X {

    /* JADX INFO: renamed from: a */
    private final Set f22331a = Collections.newSetFromMap(new IdentityHashMap());

    /* JADX INFO: renamed from: a */
    public final boolean m25759a(Object... objArr) {
        for (Object obj : objArr) {
            if (this.f22331a.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    protected abstract void mo3357b();

    /* JADX INFO: renamed from: c */
    protected abstract void mo3358c();

    /* JADX INFO: renamed from: d */
    public final boolean m25760d() {
        return !this.f22331a.isEmpty();
    }

    /* JADX INFO: renamed from: e */
    public final void m25761e(Object obj, boolean z7) {
        int size = this.f22331a.size();
        if (z7) {
            this.f22331a.add(obj);
            if (size == 0) {
                mo3357b();
                return;
            }
            return;
        }
        if (this.f22331a.remove(obj) && size == 1) {
            mo3358c();
        }
    }
}
