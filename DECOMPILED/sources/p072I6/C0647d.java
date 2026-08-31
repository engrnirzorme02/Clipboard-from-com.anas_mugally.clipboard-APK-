package p072I6;

import java.io.EOFException;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: I6.d */
/* JADX INFO: loaded from: classes.dex */
final class C0647d implements InterfaceC0669z {
    @Override // p072I6.InterfaceC0669z
    /* JADX INFO: renamed from: I */
    public void mo3003I(C0648e source, long j7) throws EOFException {
        AbstractC6118n.m27187e(source, "source");
        source.mo3052l(j7);
    }

    @Override // p072I6.InterfaceC0669z, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // p072I6.InterfaceC0669z, java.io.Flushable
    public void flush() {
    }

    @Override // p072I6.InterfaceC0669z
    /* JADX INFO: renamed from: g */
    public C0641C mo3005g() {
        return C0641C.f2530e;
    }
}
