package p352s6;

import kotlin.jvm.internal.AbstractC6118n;
import p173W5.InterfaceC1879i;
import p238e6.InterfaceC5371p;
import p318o6.InterfaceC6701y0;
import p360t6.C7142z;

/* JADX INFO: renamed from: s6.r */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7061r {
    /* JADX INFO: renamed from: b */
    public static final void m31150b(final C7058o c7058o, InterfaceC1879i interfaceC1879i) {
        if (((Number) interfaceC1879i.fold(0, new InterfaceC5371p() { // from class: s6.q
            @Override // p238e6.InterfaceC5371p
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(AbstractC7061r.m31151c(c7058o, ((Integer) obj).intValue(), (InterfaceC1879i.b) obj2));
            }
        })).intValue() == c7058o.f28209c) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + c7058o.f28208b + ",\n\t\tbut emission happened in " + interfaceC1879i + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final int m31151c(C7058o c7058o, int i7, InterfaceC1879i.b bVar) {
        InterfaceC1879i.c key = bVar.getKey();
        InterfaceC1879i.b bVar2 = c7058o.f28208b.get(key);
        if (key != InterfaceC6701y0.f24999p) {
            if (bVar != bVar2) {
                return Integer.MIN_VALUE;
            }
            return i7 + 1;
        }
        InterfaceC6701y0 interfaceC6701y0 = (InterfaceC6701y0) bVar2;
        AbstractC6118n.m27185c(bVar, "null cannot be cast to non-null type kotlinx.coroutines.Job");
        InterfaceC6701y0 interfaceC6701y0M31152d = m31152d((InterfaceC6701y0) bVar, interfaceC6701y0);
        if (interfaceC6701y0M31152d == interfaceC6701y0) {
            return interfaceC6701y0 == null ? i7 : i7 + 1;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + interfaceC6701y0M31152d + ", expected child of " + interfaceC6701y0 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }

    /* JADX INFO: renamed from: d */
    public static final InterfaceC6701y0 m31152d(InterfaceC6701y0 interfaceC6701y0, InterfaceC6701y0 interfaceC6701y1) {
        while (interfaceC6701y0 != null) {
            if (interfaceC6701y0 == interfaceC6701y1 || !(interfaceC6701y0 instanceof C7142z)) {
                return interfaceC6701y0;
            }
            interfaceC6701y0 = ((C7142z) interfaceC6701y0).getParent();
        }
        return null;
    }
}
