package p072I6;

import java.io.Closeable;
import java.io.Flushable;

/* JADX INFO: renamed from: I6.z */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0669z extends Closeable, Flushable {
    /* JADX INFO: renamed from: I */
    void mo3003I(C0648e c0648e, long j7);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();

    /* JADX INFO: renamed from: g */
    C0641C mo3005g();
}
