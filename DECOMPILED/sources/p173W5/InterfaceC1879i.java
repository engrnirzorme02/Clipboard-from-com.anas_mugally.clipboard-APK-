package p173W5;

import kotlin.jvm.internal.AbstractC6118n;
import p238e6.InterfaceC5371p;

/* JADX INFO: renamed from: W5.i */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1879i {

    /* JADX INFO: renamed from: W5.i$a */
    public static final class a {
        /* JADX INFO: renamed from: b */
        public static InterfaceC1879i m7780b(InterfaceC1879i interfaceC1879i, InterfaceC1879i context) {
            AbstractC6118n.m27187e(context, "context");
            return context == C1880j.f6044a ? interfaceC1879i : (InterfaceC1879i) context.fold(interfaceC1879i, new InterfaceC5371p() { // from class: W5.h
                @Override // p238e6.InterfaceC5371p
                public final Object invoke(Object obj, Object obj2) {
                    return InterfaceC1879i.a.m7781c((InterfaceC1879i) obj, (InterfaceC1879i.b) obj2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: c */
        public static InterfaceC1879i m7781c(InterfaceC1879i acc, b element) {
            AbstractC6118n.m27187e(acc, "acc");
            AbstractC6118n.m27187e(element, "element");
            InterfaceC1879i interfaceC1879iMinusKey = acc.minusKey(element.getKey());
            C1880j c1880j = C1880j.f6044a;
            if (interfaceC1879iMinusKey == c1880j) {
                return element;
            }
            InterfaceC1876f.b bVar = InterfaceC1876f.f6042h;
            InterfaceC1876f interfaceC1876f = (InterfaceC1876f) interfaceC1879iMinusKey.get(bVar);
            if (interfaceC1876f == null) {
                return new C1874d(interfaceC1879iMinusKey, element);
            }
            InterfaceC1879i interfaceC1879iMinusKey2 = interfaceC1879iMinusKey.minusKey(bVar);
            return interfaceC1879iMinusKey2 == c1880j ? new C1874d(element, interfaceC1876f) : new C1874d(new C1874d(interfaceC1879iMinusKey2, element), interfaceC1876f);
        }
    }

    /* JADX INFO: renamed from: W5.i$b */
    public interface b extends InterfaceC1879i {

        /* JADX INFO: renamed from: W5.i$b$a */
        public static final class a {
            /* JADX INFO: renamed from: a */
            public static Object m7782a(b bVar, Object obj, InterfaceC5371p operation) {
                AbstractC6118n.m27187e(operation, "operation");
                return operation.invoke(obj, bVar);
            }

            /* JADX INFO: renamed from: b */
            public static b m7783b(b bVar, c key) {
                AbstractC6118n.m27187e(key, "key");
                if (!AbstractC6118n.m27183a(bVar.getKey(), key)) {
                    return null;
                }
                AbstractC6118n.m27185c(bVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                return bVar;
            }

            /* JADX INFO: renamed from: c */
            public static InterfaceC1879i m7784c(b bVar, c key) {
                AbstractC6118n.m27187e(key, "key");
                return AbstractC6118n.m27183a(bVar.getKey(), key) ? C1880j.f6044a : bVar;
            }

            /* JADX INFO: renamed from: d */
            public static InterfaceC1879i m7785d(b bVar, InterfaceC1879i context) {
                AbstractC6118n.m27187e(context, "context");
                return a.m7780b(bVar, context);
            }
        }

        @Override // p173W5.InterfaceC1879i
        Object fold(Object obj, InterfaceC5371p interfaceC5371p);

        @Override // p173W5.InterfaceC1879i
        b get(c cVar);

        c getKey();

        @Override // p173W5.InterfaceC1879i
        InterfaceC1879i minusKey(c cVar);
    }

    /* JADX INFO: renamed from: W5.i$c */
    public interface c {
    }

    Object fold(Object obj, InterfaceC5371p interfaceC5371p);

    b get(c cVar);

    InterfaceC1879i minusKey(c cVar);

    InterfaceC1879i plus(InterfaceC1879i interfaceC1879i);
}
