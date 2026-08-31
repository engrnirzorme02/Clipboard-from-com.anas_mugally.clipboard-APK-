package p318o6;

import java.util.concurrent.CancellationException;
import p173W5.InterfaceC1875e;
import p173W5.InterfaceC1879i;
import p238e6.InterfaceC5367l;
import p238e6.InterfaceC5371p;
import p294l6.InterfaceC6304e;
import p384w6.InterfaceC7360a;

/* JADX INFO: renamed from: o6.y0 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC6701y0 extends InterfaceC1879i.b {

    /* JADX INFO: renamed from: p */
    public static final b f24999p = b.f25000a;

    /* JADX INFO: renamed from: o6.y0$a */
    public static final class a {
        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m28291b(InterfaceC6701y0 interfaceC6701y0, CancellationException cancellationException, int i7, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i7 & 1) != 0) {
                cancellationException = null;
            }
            interfaceC6701y0.cancel(cancellationException);
        }

        /* JADX INFO: renamed from: c */
        public static Object m28292c(InterfaceC6701y0 interfaceC6701y0, Object obj, InterfaceC5371p interfaceC5371p) {
            return InterfaceC1879i.b.a.m7782a(interfaceC6701y0, obj, interfaceC5371p);
        }

        /* JADX INFO: renamed from: d */
        public static InterfaceC1879i.b m28293d(InterfaceC6701y0 interfaceC6701y0, InterfaceC1879i.c cVar) {
            return InterfaceC1879i.b.a.m7783b(interfaceC6701y0, cVar);
        }

        /* JADX INFO: renamed from: e */
        public static InterfaceC1879i m28294e(InterfaceC6701y0 interfaceC6701y0, InterfaceC1879i.c cVar) {
            return InterfaceC1879i.b.a.m7784c(interfaceC6701y0, cVar);
        }

        /* JADX INFO: renamed from: f */
        public static InterfaceC1879i m28295f(InterfaceC6701y0 interfaceC6701y0, InterfaceC1879i interfaceC1879i) {
            return InterfaceC1879i.b.a.m7785d(interfaceC6701y0, interfaceC1879i);
        }

        /* JADX INFO: renamed from: g */
        public static InterfaceC6701y0 m28296g(InterfaceC6701y0 interfaceC6701y0, InterfaceC6701y0 interfaceC6701y1) {
            return interfaceC6701y1;
        }
    }

    /* JADX INFO: renamed from: o6.y0$b */
    public static final class b implements InterfaceC1879i.c {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ b f25000a = new b();

        private b() {
        }
    }

    InterfaceC6692u attachChild(InterfaceC6696w interfaceC6696w);

    /* synthetic */ void cancel();

    void cancel(CancellationException cancellationException);

    /* synthetic */ boolean cancel(Throwable th);

    CancellationException getCancellationException();

    InterfaceC6304e getChildren();

    InterfaceC7360a getOnJoin();

    InterfaceC6701y0 getParent();

    InterfaceC6661e0 invokeOnCompletion(InterfaceC5367l interfaceC5367l);

    InterfaceC6661e0 invokeOnCompletion(boolean z7, boolean z8, InterfaceC5367l interfaceC5367l);

    boolean isActive();

    boolean isCancelled();

    boolean isCompleted();

    Object join(InterfaceC1875e interfaceC1875e);

    InterfaceC6701y0 plus(InterfaceC6701y0 interfaceC6701y0);

    boolean start();
}
