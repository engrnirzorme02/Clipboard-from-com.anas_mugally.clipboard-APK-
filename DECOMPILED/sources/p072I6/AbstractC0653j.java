package p072I6;

import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: I6.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0653j implements InterfaceC0669z {

    /* JADX INFO: renamed from: a */
    private final InterfaceC0669z f2570a;

    public AbstractC0653j(InterfaceC0669z delegate) {
        AbstractC6118n.m27187e(delegate, "delegate");
        this.f2570a = delegate;
    }

    @Override // p072I6.InterfaceC0669z
    /* JADX INFO: renamed from: I */
    public void mo3003I(C0648e source, long j7) {
        AbstractC6118n.m27187e(source, "source");
        this.f2570a.mo3003I(source, j7);
    }

    @Override // p072I6.InterfaceC0669z, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f2570a.close();
    }

    @Override // p072I6.InterfaceC0669z, java.io.Flushable
    public void flush() {
        this.f2570a.flush();
    }

    @Override // p072I6.InterfaceC0669z
    /* JADX INFO: renamed from: g */
    public C0641C mo3005g() {
        return this.f2570a.mo3005g();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f2570a + ')';
    }
}
