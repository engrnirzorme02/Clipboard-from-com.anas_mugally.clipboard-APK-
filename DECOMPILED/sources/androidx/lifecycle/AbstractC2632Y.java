package androidx.lifecycle;

import kotlin.jvm.internal.AbstractC6118n;
import p312o0.C6517g;

/* JADX INFO: renamed from: androidx.lifecycle.Y */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2632Y {

    /* JADX INFO: renamed from: a */
    private final C6517g f10441a = new C6517g();

    /* JADX INFO: renamed from: a */
    public final void m12587a(String key, AutoCloseable closeable) {
        AbstractC6118n.m27187e(key, "key");
        AbstractC6118n.m27187e(closeable, "closeable");
        C6517g c6517g = this.f10441a;
        if (c6517g != null) {
            c6517g.m27750d(key, closeable);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m12588b() {
        C6517g c6517g = this.f10441a;
        if (c6517g != null) {
            c6517g.m27751e();
        }
        mo12439d();
    }

    /* JADX INFO: renamed from: c */
    public final AutoCloseable m12589c(String key) {
        AbstractC6118n.m27187e(key, "key");
        C6517g c6517g = this.f10441a;
        if (c6517g != null) {
            return c6517g.m27752g(key);
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    protected void mo12439d() {
    }
}
