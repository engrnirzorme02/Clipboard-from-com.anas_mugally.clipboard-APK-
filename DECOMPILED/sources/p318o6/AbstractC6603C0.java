package p318o6;

import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC6116l;
import p145S5.C1444v;
import p173W5.InterfaceC1879i;
import p238e6.InterfaceC5367l;
import p294l6.InterfaceC6304e;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: o6.C0 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC6603C0 {

    /* JADX INFO: renamed from: o6.C0$a */
    /* synthetic */ class a extends AbstractC6116l implements InterfaceC5367l {
        a(Object obj) {
            super(1, obj, AbstractC6605D0.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0);
        }

        /* JADX INFO: renamed from: d */
        public final void m27971d(Throwable th) {
            ((AbstractC6605D0) this.receiver).mo27975w(th);
        }

        @Override // p238e6.InterfaceC5367l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m27971d((Throwable) obj);
            return C1444v.f4971a;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC6598A m27959a(InterfaceC6701y0 interfaceC6701y0) {
        return new C6599A0(interfaceC6701y0);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ InterfaceC6598A m27960b(InterfaceC6701y0 interfaceC6701y0, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            interfaceC6701y0 = null;
        }
        return AbstractC6601B0.m27944a(interfaceC6701y0);
    }

    /* JADX INFO: renamed from: c */
    public static final void m27961c(InterfaceC1879i interfaceC1879i, CancellationException cancellationException) {
        InterfaceC6701y0 interfaceC6701y0 = (InterfaceC6701y0) interfaceC1879i.get(InterfaceC6701y0.f24999p);
        if (interfaceC6701y0 != null) {
            interfaceC6701y0.cancel(cancellationException);
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m27962d(InterfaceC1879i interfaceC1879i, CancellationException cancellationException, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            cancellationException = null;
        }
        AbstractC6601B0.m27946c(interfaceC1879i, cancellationException);
    }

    /* JADX INFO: renamed from: e */
    public static final void m27963e(InterfaceC1879i interfaceC1879i, CancellationException cancellationException) {
        InterfaceC6304e children;
        InterfaceC6701y0 interfaceC6701y0 = (InterfaceC6701y0) interfaceC1879i.get(InterfaceC6701y0.f24999p);
        if (interfaceC6701y0 == null || (children = interfaceC6701y0.getChildren()) == null) {
            return;
        }
        Iterator it = children.iterator();
        while (it.hasNext()) {
            ((InterfaceC6701y0) it.next()).cancel(cancellationException);
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m27964f(InterfaceC1879i interfaceC1879i, CancellationException cancellationException, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            cancellationException = null;
        }
        AbstractC6601B0.m27948e(interfaceC1879i, cancellationException);
    }

    /* JADX INFO: renamed from: g */
    public static final InterfaceC6661e0 m27965g(InterfaceC6701y0 interfaceC6701y0, InterfaceC6661e0 interfaceC6661e0) {
        return m27970l(interfaceC6701y0, false, new C6665g0(interfaceC6661e0), 1, null);
    }

    /* JADX INFO: renamed from: h */
    public static final void m27966h(InterfaceC1879i interfaceC1879i) {
        InterfaceC6701y0 interfaceC6701y0 = (InterfaceC6701y0) interfaceC1879i.get(InterfaceC6701y0.f24999p);
        if (interfaceC6701y0 != null) {
            AbstractC6601B0.m27952i(interfaceC6701y0);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m27967i(InterfaceC6701y0 interfaceC6701y0) {
        if (!interfaceC6701y0.isActive()) {
            throw interfaceC6701y0.getCancellationException();
        }
    }

    /* JADX INFO: renamed from: j */
    public static final InterfaceC6701y0 m27968j(InterfaceC1879i interfaceC1879i) {
        InterfaceC6701y0 interfaceC6701y0 = (InterfaceC6701y0) interfaceC1879i.get(InterfaceC6701y0.f24999p);
        if (interfaceC6701y0 != null) {
            return interfaceC6701y0;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + interfaceC1879i).toString());
    }

    /* JADX INFO: renamed from: k */
    public static final InterfaceC6661e0 m27969k(InterfaceC6701y0 interfaceC6701y0, boolean z7, AbstractC6605D0 abstractC6605D0) {
        return interfaceC6701y0 instanceof C6607E0 ? ((C6607E0) interfaceC6701y0).m28030Z(z7, abstractC6605D0) : interfaceC6701y0.invokeOnCompletion(abstractC6605D0.mo27974v(), z7, new a(abstractC6605D0));
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ InterfaceC6661e0 m27970l(InterfaceC6701y0 interfaceC6701y0, boolean z7, AbstractC6605D0 abstractC6605D0, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z7 = true;
        }
        return AbstractC6601B0.m27954k(interfaceC6701y0, z7, abstractC6605D0);
    }
}
