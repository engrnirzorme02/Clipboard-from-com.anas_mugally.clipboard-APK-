package p376v6;

import p173W5.InterfaceC1879i;
import p318o6.AbstractC6683p0;

/* JADX INFO: renamed from: v6.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7268f extends AbstractC6683p0 {

    /* JADX INFO: renamed from: d */
    private final int f29079d;

    /* JADX INFO: renamed from: e */
    private final int f29080e;

    /* JADX INFO: renamed from: f */
    private final long f29081f;

    /* JADX INFO: renamed from: r */
    private final String f29082r;

    /* JADX INFO: renamed from: s */
    private ExecutorC7263a f29083s = m32237U0();

    public AbstractC7268f(int i7, int i8, long j7, String str) {
        this.f29079d = i7;
        this.f29080e = i8;
        this.f29081f = j7;
        this.f29082r = str;
    }

    /* JADX INFO: renamed from: U0 */
    private final ExecutorC7263a m32237U0() {
        return new ExecutorC7263a(this.f29079d, this.f29080e, this.f29081f, this.f29082r);
    }

    @Override // p318o6.AbstractC6618K
    /* JADX INFO: renamed from: Q0 */
    public void mo28090Q0(InterfaceC1879i interfaceC1879i, Runnable runnable) {
        ExecutorC7263a.m32201k0(this.f29083s, runnable, false, false, 6, null);
    }

    /* JADX INFO: renamed from: V0 */
    public final void m32238V0(Runnable runnable, boolean z7, boolean z8) {
        this.f29083s.m32214d0(runnable, z7, z8);
    }
}
