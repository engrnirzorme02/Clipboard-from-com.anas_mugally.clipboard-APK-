package p318o6;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.AbstractC6093h;
import p173W5.InterfaceC1875e;
import p173W5.InterfaceC1879i;
import p180X5.AbstractC2005b;
import p238e6.InterfaceC5371p;
import p360t6.C7120d;
import p360t6.C7142z;
import p368u6.AbstractC7197b;

/* JADX INFO: renamed from: o6.O */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6626O {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC6624N m28098a(InterfaceC1879i interfaceC1879i) {
        if (interfaceC1879i.get(InterfaceC6701y0.f24999p) == null) {
            interfaceC1879i = interfaceC1879i.plus(AbstractC6603C0.m27960b(null, 1, null));
        }
        return new C7120d(interfaceC1879i);
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC6624N m28099b() {
        return new C7120d(AbstractC6634S0.m28112b(null, 1, null).plus(C6656c0.m28164c()));
    }

    /* JADX INFO: renamed from: c */
    public static final void m28100c(InterfaceC6624N interfaceC6624N, CancellationException cancellationException) {
        InterfaceC6701y0 interfaceC6701y0 = (InterfaceC6701y0) interfaceC6624N.mo12635Q().get(InterfaceC6701y0.f24999p);
        if (interfaceC6701y0 != null) {
            interfaceC6701y0.cancel(cancellationException);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + interfaceC6624N).toString());
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m28101d(InterfaceC6624N interfaceC6624N, CancellationException cancellationException, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            cancellationException = null;
        }
        m28100c(interfaceC6624N, cancellationException);
    }

    /* JADX INFO: renamed from: e */
    public static final Object m28102e(InterfaceC5371p interfaceC5371p, InterfaceC1875e interfaceC1875e) {
        C7142z c7142z = new C7142z(interfaceC1875e.getContext(), interfaceC1875e);
        Object objM31767b = AbstractC7197b.m31767b(c7142z, c7142z, interfaceC5371p);
        if (objM31767b == AbstractC2005b.m8369e()) {
            AbstractC6093h.m27135c(interfaceC1875e);
        }
        return objM31767b;
    }

    /* JADX INFO: renamed from: f */
    public static final void m28103f(InterfaceC6624N interfaceC6624N) {
        AbstractC6601B0.m27951h(interfaceC6624N.mo12635Q());
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m28104g(InterfaceC6624N interfaceC6624N) {
        InterfaceC6701y0 interfaceC6701y0 = (InterfaceC6701y0) interfaceC6624N.mo12635Q().get(InterfaceC6701y0.f24999p);
        if (interfaceC6701y0 != null) {
            return interfaceC6701y0.isActive();
        }
        return true;
    }
}
