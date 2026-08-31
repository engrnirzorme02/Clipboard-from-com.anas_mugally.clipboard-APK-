package p360t6;

import java.util.concurrent.CancellationException;
import p145S5.AbstractC1437o;
import p145S5.C1436n;
import p145S5.C1444v;
import p173W5.InterfaceC1875e;
import p173W5.InterfaceC1879i;
import p318o6.AbstractC6606E;
import p318o6.AbstractC6614I;
import p318o6.AbstractC6669i0;
import p318o6.C6638U0;
import p318o6.C6648Z0;
import p318o6.InterfaceC6701y0;

/* JADX INFO: renamed from: t6.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7125i {

    /* JADX INFO: renamed from: a */
    private static final C7104D f28418a = new C7104D("UNDEFINED");

    /* JADX INFO: renamed from: b */
    public static final C7104D f28419b = new C7104D("REUSABLE_CLAIMED");

    /* JADX INFO: renamed from: b */
    public static final void m31458b(InterfaceC1875e interfaceC1875e, Object obj) {
        if (!(interfaceC1875e instanceof C7124h)) {
            interfaceC1875e.resumeWith(obj);
            return;
        }
        C7124h c7124h = (C7124h) interfaceC1875e;
        Object objM27978b = AbstractC6606E.m27978b(obj);
        if (c7124h.f28414d.mo28091R0(c7124h.getContext())) {
            c7124h.f28416f = objM27978b;
            c7124h.f24935c = 1;
            c7124h.f28414d.mo28090Q0(c7124h.getContext(), c7124h);
            return;
        }
        AbstractC6669i0 abstractC6669i0M28128b = C6638U0.f24927a.m28128b();
        if (abstractC6669i0M28128b.m28194b1()) {
            c7124h.f28416f = objM27978b;
            c7124h.f24935c = 1;
            abstractC6669i0M28128b.m28191X0(c7124h);
            return;
        }
        abstractC6669i0M28128b.m28193Z0(true);
        try {
            InterfaceC6701y0 interfaceC6701y0 = (InterfaceC6701y0) c7124h.getContext().get(InterfaceC6701y0.f24999p);
            if (interfaceC6701y0 == null || interfaceC6701y0.isActive()) {
                InterfaceC1875e interfaceC1875e2 = c7124h.f28415e;
                Object obj2 = c7124h.f28417r;
                InterfaceC1879i context = interfaceC1875e2.getContext();
                Object objM31410i = AbstractC7111K.m31410i(context, obj2);
                C6648Z0 c6648z0M28085m = objM31410i != AbstractC7111K.f28397a ? AbstractC6614I.m28085m(interfaceC1875e2, context, objM31410i) : null;
                try {
                    c7124h.f28415e.resumeWith(obj);
                    C1444v c1444v = C1444v.f4971a;
                    if (c6648z0M28085m == null || c6648z0M28085m.m28144N0()) {
                        AbstractC7111K.m31407f(context, objM31410i);
                    }
                } catch (Throwable th) {
                    if (c6648z0M28085m == null || c6648z0M28085m.m28144N0()) {
                        AbstractC7111K.m31407f(context, objM31410i);
                    }
                    throw th;
                }
            } else {
                CancellationException cancellationException = interfaceC6701y0.getCancellationException();
                c7124h.mo28149d(objM27978b, cancellationException);
                C1436n.a aVar = C1436n.f4958b;
                c7124h.resumeWith(C1436n.m6073b(AbstractC1437o.m6081a(cancellationException)));
            }
            while (abstractC6669i0M28128b.m28197e1()) {
            }
        } catch (Throwable th2) {
            try {
                c7124h.m28153k(th2);
            } finally {
                abstractC6669i0M28128b.m28190U0(true);
            }
        }
    }
}
