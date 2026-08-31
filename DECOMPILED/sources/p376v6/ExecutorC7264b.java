package p376v6;

import java.util.concurrent.Executor;
import p173W5.C1880j;
import p173W5.InterfaceC1879i;
import p278j6.AbstractC5905g;
import p318o6.AbstractC6618K;
import p318o6.AbstractC6683p0;
import p360t6.AbstractC7105E;
import p360t6.AbstractC7107G;

/* JADX INFO: renamed from: v6.b */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC7264b extends AbstractC6683p0 implements Executor {

    /* JADX INFO: renamed from: d */
    public static final ExecutorC7264b f29075d = new ExecutorC7264b();

    /* JADX INFO: renamed from: e */
    private static final AbstractC6618K f29076e = AbstractC6618K.m28089T0(C7273k.f29093c, AbstractC7107G.m31400e("kotlinx.coroutines.io.parallelism", AbstractC5905g.m26654b(64, AbstractC7105E.m31386a()), 0, 0, 12, null), null, 2, null);

    private ExecutorC7264b() {
    }

    @Override // p318o6.AbstractC6618K
    /* JADX INFO: renamed from: Q0 */
    public void mo28090Q0(InterfaceC1879i interfaceC1879i, Runnable runnable) {
        f29076e.mo28090Q0(interfaceC1879i, runnable);
    }

    @Override // p318o6.AbstractC6618K
    /* JADX INFO: renamed from: S0 */
    public AbstractC6618K mo28086S0(int i7, String str) {
        return C7273k.f29093c.mo28086S0(i7, str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        mo28090Q0(C1880j.f6044a, runnable);
    }

    @Override // p318o6.AbstractC6618K
    public String toString() {
        return "Dispatchers.IO";
    }
}
