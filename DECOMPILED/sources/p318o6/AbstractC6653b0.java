package p318o6;

import kotlin.jvm.internal.AbstractC6118n;
import p145S5.AbstractC1437o;
import p145S5.C1436n;
import p145S5.C1444v;
import p173W5.InterfaceC1875e;
import p173W5.InterfaceC1879i;
import p360t6.AbstractC7111K;
import p360t6.C7124h;

/* JADX INFO: renamed from: o6.b0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6653b0 {
    /* JADX INFO: renamed from: a */
    public static final void m28155a(AbstractC6650a0 abstractC6650a0, int i7) {
        InterfaceC1875e interfaceC1875eMo28150g = abstractC6650a0.mo28150g();
        boolean z7 = i7 == 4;
        if (z7 || !(interfaceC1875eMo28150g instanceof C7124h) || m28156b(i7) != m28156b(abstractC6650a0.f24935c)) {
            m28158d(abstractC6650a0, interfaceC1875eMo28150g, z7);
            return;
        }
        C7124h c7124h = (C7124h) interfaceC1875eMo28150g;
        AbstractC6618K abstractC6618K = c7124h.f28414d;
        InterfaceC1879i context = c7124h.getContext();
        if (abstractC6618K.mo28091R0(context)) {
            abstractC6618K.mo28090Q0(context, abstractC6650a0);
        } else {
            m28159e(abstractC6650a0);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m28156b(int i7) {
        return i7 == 1 || i7 == 2;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m28157c(int i7) {
        return i7 == 2;
    }

    /* JADX INFO: renamed from: d */
    public static final void m28158d(AbstractC6650a0 abstractC6650a0, InterfaceC1875e interfaceC1875e, boolean z7) {
        Object objMo28152j;
        Object objMo28154m = abstractC6650a0.mo28154m();
        Throwable thMo28151i = abstractC6650a0.mo28151i(objMo28154m);
        if (thMo28151i != null) {
            C1436n.a aVar = C1436n.f4958b;
            objMo28152j = AbstractC1437o.m6081a(thMo28151i);
        } else {
            C1436n.a aVar2 = C1436n.f4958b;
            objMo28152j = abstractC6650a0.mo28152j(objMo28154m);
        }
        Object objM6073b = C1436n.m6073b(objMo28152j);
        if (!z7) {
            interfaceC1875e.resumeWith(objM6073b);
            return;
        }
        AbstractC6118n.m27185c(interfaceC1875e, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        C7124h c7124h = (C7124h) interfaceC1875e;
        InterfaceC1875e interfaceC1875e2 = c7124h.f28415e;
        Object obj = c7124h.f28417r;
        InterfaceC1879i context = interfaceC1875e2.getContext();
        Object objM31410i = AbstractC7111K.m31410i(context, obj);
        C6648Z0 c6648z0M28085m = objM31410i != AbstractC7111K.f28397a ? AbstractC6614I.m28085m(interfaceC1875e2, context, objM31410i) : null;
        try {
            c7124h.f28415e.resumeWith(objM6073b);
            C1444v c1444v = C1444v.f4971a;
        } finally {
            if (c6648z0M28085m == null || c6648z0M28085m.m28144N0()) {
                AbstractC7111K.m31407f(context, objM31410i);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    private static final void m28159e(AbstractC6650a0 abstractC6650a0) {
        AbstractC6669i0 abstractC6669i0M28128b = C6638U0.f24927a.m28128b();
        if (abstractC6669i0M28128b.m28194b1()) {
            abstractC6669i0M28128b.m28191X0(abstractC6650a0);
            return;
        }
        abstractC6669i0M28128b.m28193Z0(true);
        try {
            m28158d(abstractC6650a0, abstractC6650a0.mo28150g(), true);
            do {
            } while (abstractC6669i0M28128b.m28197e1());
        } catch (Throwable th) {
            try {
                abstractC6650a0.m28153k(th);
            } finally {
                abstractC6669i0M28128b.m28190U0(true);
            }
        }
    }
}
