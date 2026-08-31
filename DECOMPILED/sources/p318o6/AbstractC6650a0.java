package p318o6;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.AbstractC1437o;
import p145S5.C1436n;
import p145S5.C1444v;
import p173W5.InterfaceC1875e;
import p173W5.InterfaceC1879i;
import p360t6.AbstractC7111K;
import p360t6.C7124h;
import p376v6.AbstractRunnableC7270h;

/* JADX INFO: renamed from: o6.a0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6650a0 extends AbstractRunnableC7270h {

    /* JADX INFO: renamed from: c */
    public int f24935c;

    public AbstractC6650a0(int i7) {
        this.f24935c = i7;
    }

    /* JADX INFO: renamed from: d */
    public void mo28149d(Object obj, Throwable th) {
    }

    /* JADX INFO: renamed from: g */
    public abstract InterfaceC1875e mo28150g();

    /* JADX INFO: renamed from: i */
    public Throwable mo28151i(Object obj) {
        C6602C c6602c = obj instanceof C6602C ? (C6602C) obj : null;
        if (c6602c != null) {
            return c6602c.f24874a;
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public Object mo28152j(Object obj) {
        return obj;
    }

    /* JADX INFO: renamed from: k */
    public final void m28153k(Throwable th) {
        AbstractC6622M.m28096a(mo28150g().getContext(), new C6630Q("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    /* JADX INFO: renamed from: m */
    public abstract Object mo28154m();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            InterfaceC1875e interfaceC1875eMo28150g = mo28150g();
            AbstractC6118n.m27185c(interfaceC1875eMo28150g, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            C7124h c7124h = (C7124h) interfaceC1875eMo28150g;
            InterfaceC1875e interfaceC1875e = c7124h.f28415e;
            Object obj = c7124h.f28417r;
            InterfaceC1879i context = interfaceC1875e.getContext();
            Object objM31410i = AbstractC7111K.m31410i(context, obj);
            InterfaceC6701y0 interfaceC6701y0 = null;
            C6648Z0 c6648z0M28085m = objM31410i != AbstractC7111K.f28397a ? AbstractC6614I.m28085m(interfaceC1875e, context, objM31410i) : null;
            try {
                InterfaceC1879i context2 = interfaceC1875e.getContext();
                Object objMo28154m = mo28154m();
                Throwable thMo28151i = mo28151i(objMo28154m);
                if (thMo28151i == null && AbstractC6653b0.m28156b(this.f24935c)) {
                    interfaceC6701y0 = (InterfaceC6701y0) context2.get(InterfaceC6701y0.f24999p);
                }
                if (interfaceC6701y0 != null && !interfaceC6701y0.isActive()) {
                    CancellationException cancellationException = interfaceC6701y0.getCancellationException();
                    mo28149d(objMo28154m, cancellationException);
                    C1436n.a aVar = C1436n.f4958b;
                    interfaceC1875e.resumeWith(C1436n.m6073b(AbstractC1437o.m6081a(cancellationException)));
                } else if (thMo28151i != null) {
                    C1436n.a aVar2 = C1436n.f4958b;
                    interfaceC1875e.resumeWith(C1436n.m6073b(AbstractC1437o.m6081a(thMo28151i)));
                } else {
                    C1436n.a aVar3 = C1436n.f4958b;
                    interfaceC1875e.resumeWith(C1436n.m6073b(mo28152j(objMo28154m)));
                }
                C1444v c1444v = C1444v.f4971a;
            } finally {
                if (c6648z0M28085m == null || c6648z0M28085m.m28144N0()) {
                    AbstractC7111K.m31407f(context, objM31410i);
                }
            }
        } catch (Throwable th) {
            m28153k(th);
        }
    }
}
