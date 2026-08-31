package p318o6;

import p152T5.C1630i;
import p360t6.AbstractC7128l;

/* JADX INFO: renamed from: o6.i0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6669i0 extends AbstractC6618K {

    /* JADX INFO: renamed from: c */
    private long f24965c;

    /* JADX INFO: renamed from: d */
    private boolean f24966d;

    /* JADX INFO: renamed from: e */
    private C1630i f24967e;

    /* JADX INFO: renamed from: V0 */
    public static /* synthetic */ void m28187V0(AbstractC6669i0 abstractC6669i0, boolean z7, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
        }
        if ((i7 & 1) != 0) {
            z7 = false;
        }
        abstractC6669i0.m28190U0(z7);
    }

    /* JADX INFO: renamed from: W0 */
    private final long m28188W0(boolean z7) {
        return z7 ? 4294967296L : 1L;
    }

    /* JADX INFO: renamed from: a1 */
    public static /* synthetic */ void m28189a1(AbstractC6669i0 abstractC6669i0, boolean z7, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i7 & 1) != 0) {
            z7 = false;
        }
        abstractC6669i0.m28193Z0(z7);
    }

    @Override // p318o6.AbstractC6618K
    /* JADX INFO: renamed from: S0 */
    public final AbstractC6618K mo28086S0(int i7, String str) {
        AbstractC7128l.m31467a(i7);
        return AbstractC7128l.m31468b(this, str);
    }

    /* JADX INFO: renamed from: U0 */
    public final void m28190U0(boolean z7) {
        long jM28188W0 = this.f24965c - m28188W0(z7);
        this.f24965c = jM28188W0;
        if (jM28188W0 <= 0 && this.f24966d) {
            shutdown();
        }
    }

    /* JADX INFO: renamed from: X0 */
    public final void m28191X0(AbstractC6650a0 abstractC6650a0) {
        C1630i c1630i = this.f24967e;
        if (c1630i == null) {
            c1630i = new C1630i();
            this.f24967e = c1630i;
        }
        c1630i.addLast(abstractC6650a0);
    }

    /* JADX INFO: renamed from: Y0 */
    protected long mo28192Y0() {
        C1630i c1630i = this.f24967e;
        return (c1630i == null || c1630i.isEmpty()) ? Long.MAX_VALUE : 0L;
    }

    /* JADX INFO: renamed from: Z0 */
    public final void m28193Z0(boolean z7) {
        this.f24965c += m28188W0(z7);
        if (z7) {
            return;
        }
        this.f24966d = true;
    }

    /* JADX INFO: renamed from: b1 */
    public final boolean m28194b1() {
        return this.f24965c >= m28188W0(true);
    }

    /* JADX INFO: renamed from: c1 */
    public final boolean m28195c1() {
        C1630i c1630i = this.f24967e;
        if (c1630i != null) {
            return c1630i.isEmpty();
        }
        return true;
    }

    /* JADX INFO: renamed from: d1 */
    public abstract long mo28196d1();

    /* JADX INFO: renamed from: e1 */
    public final boolean m28197e1() {
        AbstractC6650a0 abstractC6650a0;
        C1630i c1630i = this.f24967e;
        if (c1630i == null || (abstractC6650a0 = (AbstractC6650a0) c1630i.m6686x()) == null) {
            return false;
        }
        abstractC6650a0.run();
        return true;
    }

    /* JADX INFO: renamed from: f1 */
    public boolean m28198f1() {
        return false;
    }

    public abstract void shutdown();
}
