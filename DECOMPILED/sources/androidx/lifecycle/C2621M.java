package androidx.lifecycle;

import kotlin.jvm.internal.AbstractC6118n;
import p010B0.C0047f;

/* JADX INFO: renamed from: androidx.lifecycle.M */
/* JADX INFO: loaded from: classes.dex */
public final class C2621M implements InterfaceC2654p, AutoCloseable {

    /* JADX INFO: renamed from: a */
    private final String f10413a;

    /* JADX INFO: renamed from: b */
    private final C2619K f10414b;

    /* JADX INFO: renamed from: c */
    private boolean f10415c;

    public C2621M(String key, C2619K handle) {
        AbstractC6118n.m27187e(key, "key");
        AbstractC6118n.m27187e(handle, "handle");
        this.f10413a = key;
        this.f10414b = handle;
    }

    /* JADX INFO: renamed from: J */
    public final void m12554J(C0047f registry, AbstractC2650l lifecycle) {
        AbstractC6118n.m27187e(registry, "registry");
        AbstractC6118n.m27187e(lifecycle, "lifecycle");
        if (this.f10415c) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f10415c = true;
        lifecycle.mo12625a(this);
        registry.m187c(this.f10413a, this.f10414b.m12552a());
    }

    /* JADX INFO: renamed from: Q */
    public final C2619K m12555Q() {
        return this.f10414b;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
    }

    /* JADX INFO: renamed from: d0 */
    public final boolean m12556d0() {
        return this.f10415c;
    }

    @Override // androidx.lifecycle.InterfaceC2654p
    /* JADX INFO: renamed from: n */
    public void mo173n(InterfaceC2657s source, AbstractC2650l.a event) {
        AbstractC6118n.m27187e(source, "source");
        AbstractC6118n.m27187e(event, "event");
        if (event == AbstractC2650l.a.ON_DESTROY) {
            this.f10415c = false;
            source.mo419P().mo12628d(this);
        }
    }
}
