package p072I6;

import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: I6.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0654k implements InterfaceC0640B {

    /* JADX INFO: renamed from: a */
    private final InterfaceC0640B f2571a;

    public AbstractC0654k(InterfaceC0640B delegate) {
        AbstractC6118n.m27187e(delegate, "delegate");
        this.f2571a = delegate;
    }

    @Override // p072I6.InterfaceC0640B, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f2571a.close();
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC0640B m3119d() {
        return this.f2571a;
    }

    @Override // p072I6.InterfaceC0640B
    /* JADX INFO: renamed from: g */
    public C0641C mo2948g() {
        return this.f2571a.mo2948g();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f2571a + ')';
    }

    @Override // p072I6.InterfaceC0640B
    /* JADX INFO: renamed from: w */
    public long mo2949w(C0648e sink, long j7) {
        AbstractC6118n.m27187e(sink, "sink");
        return this.f2571a.mo2949w(sink, j7);
    }
}
