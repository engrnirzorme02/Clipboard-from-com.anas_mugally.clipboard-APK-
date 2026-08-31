package p312o0;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.C1444v;

/* JADX INFO: renamed from: o0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C6517g {

    /* JADX INFO: renamed from: a */
    private final C6516f f24639a = new C6516f();

    /* JADX INFO: renamed from: b */
    private final Map f24640b = new LinkedHashMap();

    /* JADX INFO: renamed from: c */
    private final Set f24641c = new LinkedHashSet();

    /* JADX INFO: renamed from: d */
    private volatile boolean f24642d;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public final void m27749f(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (Exception e7) {
                throw new RuntimeException(e7);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m27750d(String key, AutoCloseable closeable) {
        AutoCloseable autoCloseable;
        AbstractC6118n.m27187e(key, "key");
        AbstractC6118n.m27187e(closeable, "closeable");
        if (this.f24642d) {
            m27749f(closeable);
            return;
        }
        synchronized (this.f24639a) {
            autoCloseable = (AutoCloseable) this.f24640b.put(key, closeable);
        }
        m27749f(autoCloseable);
    }

    /* JADX INFO: renamed from: e */
    public final void m27751e() {
        if (this.f24642d) {
            return;
        }
        this.f24642d = true;
        synchronized (this.f24639a) {
            try {
                Iterator it = this.f24640b.values().iterator();
                while (it.hasNext()) {
                    m27749f((AutoCloseable) it.next());
                }
                Iterator it2 = this.f24641c.iterator();
                while (it2.hasNext()) {
                    m27749f((AutoCloseable) it2.next());
                }
                this.f24641c.clear();
                C1444v c1444v = C1444v.f4971a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final AutoCloseable m27752g(String key) {
        AutoCloseable autoCloseable;
        AbstractC6118n.m27187e(key, "key");
        synchronized (this.f24639a) {
            autoCloseable = (AutoCloseable) this.f24640b.get(key);
        }
        return autoCloseable;
    }
}
