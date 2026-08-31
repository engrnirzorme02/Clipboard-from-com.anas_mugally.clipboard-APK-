package p360t6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p173W5.C1880j;
import p173W5.InterfaceC1879i;
import p318o6.AbstractC6618K;
import p318o6.AbstractC6622M;
import p318o6.AbstractC6637U;
import p318o6.InterfaceC6643X;
import p318o6.InterfaceC6661e0;
import p318o6.InterfaceC6678n;

/* JADX INFO: renamed from: t6.k */
/* JADX INFO: loaded from: classes.dex */
public final class C7127k extends AbstractC6618K implements InterfaceC6643X {

    /* JADX INFO: renamed from: t */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f28420t = AtomicIntegerFieldUpdater.newUpdater(C7127k.class, "runningWorkers$volatile");

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ InterfaceC6643X f28421c;

    /* JADX INFO: renamed from: d */
    private final AbstractC6618K f28422d;

    /* JADX INFO: renamed from: e */
    private final int f28423e;

    /* JADX INFO: renamed from: f */
    private final String f28424f;

    /* JADX INFO: renamed from: r */
    private final C7132p f28425r;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX INFO: renamed from: s */
    private final Object f28426s;

    /* JADX INFO: renamed from: t6.k$a */
    private final class a implements Runnable {

        /* JADX INFO: renamed from: a */
        private Runnable f28427a;

        public a(Runnable runnable) {
            this.f28427a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i7 = 0;
            while (true) {
                try {
                    this.f28427a.run();
                } catch (Throwable th) {
                    AbstractC6622M.m28096a(C1880j.f6044a, th);
                }
                Runnable runnableM31465X0 = C7127k.this.m31465X0();
                if (runnableM31465X0 == null) {
                    return;
                }
                this.f28427a = runnableM31465X0;
                i7++;
                if (i7 >= 16 && C7127k.this.f28422d.mo28091R0(C7127k.this)) {
                    C7127k.this.f28422d.mo28090Q0(C7127k.this, this);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C7127k(AbstractC6618K abstractC6618K, int i7, String str) {
        InterfaceC6643X interfaceC6643X = abstractC6618K instanceof InterfaceC6643X ? (InterfaceC6643X) abstractC6618K : null;
        this.f28421c = interfaceC6643X == null ? AbstractC6637U.m28125a() : interfaceC6643X;
        this.f28422d = abstractC6618K;
        this.f28423e = i7;
        this.f28424f = str;
        this.f28425r = new C7132p(false);
        this.f28426s = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X0 */
    public final Runnable m31465X0() {
        while (true) {
            Runnable runnable = (Runnable) this.f28425r.m31490e();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f28426s) {
                f28420t.decrementAndGet(this);
                if (this.f28425r.m31489c() == 0) {
                    return null;
                }
                f28420t.incrementAndGet(this);
            }
        }
    }

    /* JADX INFO: renamed from: Y0 */
    private final boolean m31466Y0() {
        synchronized (this.f28426s) {
            if (f28420t.get(this) >= this.f28423e) {
                return false;
            }
            f28420t.incrementAndGet(this);
            return true;
        }
    }

    @Override // p318o6.InterfaceC6643X
    /* JADX INFO: renamed from: Q */
    public void mo28132Q(long j7, InterfaceC6678n interfaceC6678n) {
        this.f28421c.mo28132Q(j7, interfaceC6678n);
    }

    @Override // p318o6.AbstractC6618K
    /* JADX INFO: renamed from: Q0 */
    public void mo28090Q0(InterfaceC1879i interfaceC1879i, Runnable runnable) {
        Runnable runnableM31465X0;
        this.f28425r.m31487a(runnable);
        if (f28420t.get(this) >= this.f28423e || !m31466Y0() || (runnableM31465X0 = m31465X0()) == null) {
            return;
        }
        this.f28422d.mo28090Q0(this, new a(runnableM31465X0));
    }

    @Override // p318o6.AbstractC6618K
    /* JADX INFO: renamed from: S0 */
    public AbstractC6618K mo28086S0(int i7, String str) {
        AbstractC7128l.m31467a(i7);
        return i7 >= this.f28423e ? AbstractC7128l.m31468b(this, str) : super.mo28086S0(i7, str);
    }

    @Override // p318o6.InterfaceC6643X
    /* JADX INFO: renamed from: k0 */
    public InterfaceC6661e0 mo28121k0(long j7, Runnable runnable, InterfaceC1879i interfaceC1879i) {
        return this.f28421c.mo28121k0(j7, runnable, interfaceC1879i);
    }

    @Override // p318o6.AbstractC6618K
    public String toString() {
        String str = this.f28424f;
        if (str != null) {
            return str;
        }
        return this.f28422d + ".limitedParallelism(" + this.f28423e + ')';
    }
}
