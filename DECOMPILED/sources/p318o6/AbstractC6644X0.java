package p318o6;

import kotlin.coroutines.jvm.internal.AbstractC6093h;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p238e6.InterfaceC5371p;
import p368u6.AbstractC7197b;

/* JADX INFO: renamed from: o6.X0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6644X0 {
    /* JADX INFO: renamed from: a */
    public static final C6640V0 m28134a(long j7, InterfaceC6643X interfaceC6643X, InterfaceC6701y0 interfaceC6701y0) {
        return new C6640V0("Timed out waiting for " + j7 + " ms", interfaceC6701y0);
    }

    /* JADX INFO: renamed from: b */
    private static final Object m28135b(RunnableC6642W0 runnableC6642W0, InterfaceC5371p interfaceC5371p) {
        AbstractC6601B0.m27950g(runnableC6642W0, AbstractC6645Y.m28138b(runnableC6642W0.f28449d.getContext()).mo28121k0(runnableC6642W0.f24930e, runnableC6642W0, runnableC6642W0.getContext()));
        return AbstractC7197b.m31768c(runnableC6642W0, runnableC6642W0, interfaceC5371p);
    }

    /* JADX INFO: renamed from: c */
    public static final Object m28136c(long j7, InterfaceC5371p interfaceC5371p, InterfaceC1875e interfaceC1875e) {
        if (j7 <= 0) {
            throw new C6640V0("Timed out immediately");
        }
        Object objM28135b = m28135b(new RunnableC6642W0(j7, interfaceC1875e), interfaceC5371p);
        if (objM28135b == AbstractC2005b.m8369e()) {
            AbstractC6093h.m27135c(interfaceC1875e);
        }
        return objM28135b;
    }
}
