package p352s6;

import kotlin.coroutines.jvm.internal.AbstractC6086a;
import kotlin.coroutines.jvm.internal.AbstractC6093h;
import kotlin.jvm.internal.AbstractC6104G;
import p173W5.InterfaceC1875e;
import p173W5.InterfaceC1879i;
import p180X5.AbstractC2005b;
import p238e6.InterfaceC5371p;
import p344r6.InterfaceC6919d;
import p360t6.AbstractC7111K;

/* JADX INFO: renamed from: s6.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7049f {
    /* JADX INFO: renamed from: b */
    public static final Object m31132b(InterfaceC1879i interfaceC1879i, Object obj, Object obj2, InterfaceC5371p interfaceC5371p, InterfaceC1875e interfaceC1875e) {
        Object objM31410i = AbstractC7111K.m31410i(interfaceC1879i, obj2);
        try {
            C7063t c7063t = new C7063t(interfaceC1875e, interfaceC1879i);
            Object objD = !(interfaceC5371p instanceof AbstractC6086a) ? AbstractC2005b.m8368d(interfaceC5371p, obj, c7063t) : ((InterfaceC5371p) AbstractC6104G.m27161d(interfaceC5371p, 2)).invoke(obj, c7063t);
            AbstractC7111K.m31407f(interfaceC1879i, objM31410i);
            if (objD == AbstractC2005b.m8369e()) {
                AbstractC6093h.m27135c(interfaceC1875e);
            }
            return objD;
        } catch (Throwable th) {
            AbstractC7111K.m31407f(interfaceC1879i, objM31410i);
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Object m31133c(InterfaceC1879i interfaceC1879i, Object obj, Object obj2, InterfaceC5371p interfaceC5371p, InterfaceC1875e interfaceC1875e, int i7, Object obj3) {
        if ((i7 & 4) != 0) {
            obj2 = AbstractC7111K.m31408g(interfaceC1879i);
        }
        return m31132b(interfaceC1879i, obj, obj2, interfaceC5371p, interfaceC1875e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final InterfaceC6919d m31134d(InterfaceC6919d interfaceC6919d, InterfaceC1879i interfaceC1879i) {
        return !(interfaceC6919d instanceof C7062s) ? new C7064u(interfaceC6919d, interfaceC1879i) : interfaceC6919d;
    }
}
