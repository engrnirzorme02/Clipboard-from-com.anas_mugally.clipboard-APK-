package p328p6;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.C1444v;
import p173W5.InterfaceC1879i;
import p238e6.InterfaceC5367l;
import p278j6.AbstractC5905g;
import p318o6.AbstractC6601B0;
import p318o6.C6619K0;
import p318o6.C6656c0;
import p318o6.InterfaceC6643X;
import p318o6.InterfaceC6661e0;
import p318o6.InterfaceC6678n;

/* JADX INFO: renamed from: p6.e */
/* JADX INFO: loaded from: classes.dex */
public final class C6777e extends AbstractC6778f implements InterfaceC6643X {

    /* JADX INFO: renamed from: c */
    private final Handler f27214c;

    /* JADX INFO: renamed from: d */
    private final String f27215d;

    /* JADX INFO: renamed from: e */
    private final boolean f27216e;

    /* JADX INFO: renamed from: f */
    private final C6777e f27217f;

    /* JADX INFO: renamed from: p6.e$a */
    public static final class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC6678n f27218a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C6777e f27219b;

        public a(InterfaceC6678n interfaceC6678n, C6777e c6777e) {
            this.f27218a = interfaceC6678n;
            this.f27219b = c6777e;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f27218a.mo28235c(this.f27219b, C1444v.f4971a);
        }
    }

    private C6777e(Handler handler, String str, boolean z7) {
        super(null);
        this.f27214c = handler;
        this.f27215d = str;
        this.f27216e = z7;
        this.f27217f = z7 ? this : new C6777e(handler, str, true);
    }

    /* JADX INFO: renamed from: Y0 */
    private final void m29612Y0(InterfaceC1879i interfaceC1879i, Runnable runnable) {
        AbstractC6601B0.m27946c(interfaceC1879i, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        C6656c0.m28163b().mo28090Q0(interfaceC1879i, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a1 */
    public static final void m29613a1(C6777e c6777e, Runnable runnable) {
        c6777e.f27214c.removeCallbacks(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b1 */
    public static final C1444v m29614b1(C6777e c6777e, Runnable runnable, Throwable th) {
        c6777e.f27214c.removeCallbacks(runnable);
        return C1444v.f4971a;
    }

    @Override // p318o6.InterfaceC6643X
    /* JADX INFO: renamed from: Q */
    public void mo28132Q(long j7, InterfaceC6678n interfaceC6678n) {
        final a aVar = new a(interfaceC6678n, this);
        if (this.f27214c.postDelayed(aVar, AbstractC5905g.m26657e(j7, 4611686018427387903L))) {
            interfaceC6678n.mo28234a(new InterfaceC5367l() { // from class: p6.d
                @Override // p238e6.InterfaceC5367l
                public final Object invoke(Object obj) {
                    return C6777e.m29614b1(this.f27212a, aVar, (Throwable) obj);
                }
            });
        } else {
            m29612Y0(interfaceC6678n.getContext(), aVar);
        }
    }

    @Override // p318o6.AbstractC6618K
    /* JADX INFO: renamed from: Q0 */
    public void mo28090Q0(InterfaceC1879i interfaceC1879i, Runnable runnable) {
        if (this.f27214c.post(runnable)) {
            return;
        }
        m29612Y0(interfaceC1879i, runnable);
    }

    @Override // p318o6.AbstractC6618K
    /* JADX INFO: renamed from: R0 */
    public boolean mo28091R0(InterfaceC1879i interfaceC1879i) {
        return (this.f27216e && AbstractC6118n.m27183a(Looper.myLooper(), this.f27214c.getLooper())) ? false : true;
    }

    @Override // p318o6.AbstractC6615I0
    /* JADX INFO: renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public C6777e mo28087U0() {
        return this.f27217f;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6777e)) {
            return false;
        }
        C6777e c6777e = (C6777e) obj;
        return c6777e.f27214c == this.f27214c && c6777e.f27216e == this.f27216e;
    }

    public int hashCode() {
        return System.identityHashCode(this.f27214c) ^ (this.f27216e ? 1231 : 1237);
    }

    @Override // p318o6.InterfaceC6643X
    /* JADX INFO: renamed from: k0 */
    public InterfaceC6661e0 mo28121k0(long j7, final Runnable runnable, InterfaceC1879i interfaceC1879i) {
        if (this.f27214c.postDelayed(runnable, AbstractC5905g.m26657e(j7, 4611686018427387903L))) {
            return new InterfaceC6661e0() { // from class: p6.c
                @Override // p318o6.InterfaceC6661e0
                /* JADX INFO: renamed from: k */
                public final void mo7954k() {
                    C6777e.m29613a1(this.f27210a, runnable);
                }
            };
        }
        m29612Y0(interfaceC1879i, runnable);
        return C6619K0.f24909a;
    }

    @Override // p318o6.AbstractC6618K
    public String toString() {
        String strM28088V0 = m28088V0();
        if (strM28088V0 != null) {
            return strM28088V0;
        }
        String string = this.f27215d;
        if (string == null) {
            string = this.f27214c.toString();
        }
        if (!this.f27216e) {
            return string;
        }
        return string + ".immediate";
    }

    public /* synthetic */ C6777e(Handler handler, String str, int i7, AbstractC6112h abstractC6112h) {
        this(handler, (i7 & 2) != 0 ? null : str);
    }

    public C6777e(Handler handler, String str) {
        this(handler, str, false);
    }
}
