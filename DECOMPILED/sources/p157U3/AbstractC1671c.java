package p157U3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import p122P3.AbstractC1203g;
import p122P3.AbstractC1209m;

/* JADX INFO: renamed from: U3.c */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1671c extends AbstractC1672d {

    /* JADX INFO: renamed from: U3.c$a */
    private static final class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final Future f5572a;

        /* JADX INFO: renamed from: b */
        final InterfaceC1670b f5573b;

        a(Future future, InterfaceC1670b interfaceC1670b) {
            this.f5572a = future;
            this.f5573b = interfaceC1670b;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f5573b.onSuccess(AbstractC1671c.m7032b(this.f5572a));
            } catch (Error e7) {
                e = e7;
                this.f5573b.mo7030a(e);
            } catch (RuntimeException e8) {
                e = e8;
                this.f5573b.mo7030a(e);
            } catch (ExecutionException e9) {
                this.f5573b.mo7030a(e9.getCause());
            }
        }

        public String toString() {
            return AbstractC1203g.m5267b(this).m5279k(this.f5573b).toString();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m7031a(InterfaceFutureC1673e interfaceFutureC1673e, InterfaceC1670b interfaceC1670b, Executor executor) {
        AbstractC1209m.m5302n(interfaceC1670b);
        interfaceFutureC1673e.addListener(new a(interfaceFutureC1673e, interfaceC1670b), executor);
    }

    /* JADX INFO: renamed from: b */
    public static Object m7032b(Future future) {
        AbstractC1209m.m5311w(future.isDone(), "Future was expected to be done: %s", future);
        return AbstractC1676h.m7040a(future);
    }
}
