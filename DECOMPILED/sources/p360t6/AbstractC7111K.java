package p360t6;

import kotlin.jvm.internal.AbstractC6118n;
import p173W5.InterfaceC1879i;
import p238e6.InterfaceC5371p;
import p318o6.InterfaceC6636T0;

/* JADX INFO: renamed from: t6.K */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7111K {

    /* JADX INFO: renamed from: a */
    public static final C7104D f28397a = new C7104D("NO_THREAD_ELEMENTS");

    /* JADX INFO: renamed from: b */
    private static final InterfaceC5371p f28398b = new InterfaceC5371p() { // from class: t6.H
        @Override // p238e6.InterfaceC5371p
        public final Object invoke(Object obj, Object obj2) {
            return AbstractC7111K.m31405d(obj, (InterfaceC1879i.b) obj2);
        }
    };

    /* JADX INFO: renamed from: c */
    private static final InterfaceC5371p f28399c = new InterfaceC5371p() { // from class: t6.I
        @Override // p238e6.InterfaceC5371p
        public final Object invoke(Object obj, Object obj2) {
            return AbstractC7111K.m31406e((InterfaceC6636T0) obj, (InterfaceC1879i.b) obj2);
        }
    };

    /* JADX INFO: renamed from: d */
    private static final InterfaceC5371p f28400d = new InterfaceC5371p() { // from class: t6.J
        @Override // p238e6.InterfaceC5371p
        public final Object invoke(Object obj, Object obj2) {
            return AbstractC7111K.m31409h((C7115O) obj, (InterfaceC1879i.b) obj2);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final Object m31405d(Object obj, InterfaceC1879i.b bVar) {
        if (!(bVar instanceof InterfaceC6636T0)) {
            return obj;
        }
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        int iIntValue = num != null ? num.intValue() : 1;
        return iIntValue == 0 ? bVar : Integer.valueOf(iIntValue + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final InterfaceC6636T0 m31406e(InterfaceC6636T0 interfaceC6636T0, InterfaceC1879i.b bVar) {
        if (interfaceC6636T0 != null) {
            return interfaceC6636T0;
        }
        if (bVar instanceof InterfaceC6636T0) {
            return (InterfaceC6636T0) bVar;
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static final void m31407f(InterfaceC1879i interfaceC1879i, Object obj) {
        if (obj == f28397a) {
            return;
        }
        if (obj instanceof C7115O) {
            ((C7115O) obj).m31427b(interfaceC1879i);
            return;
        }
        Object objFold = interfaceC1879i.fold(null, f28399c);
        AbstractC6118n.m27185c(objFold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((InterfaceC6636T0) objFold).m28123K0(interfaceC1879i, obj);
    }

    /* JADX INFO: renamed from: g */
    public static final Object m31408g(InterfaceC1879i interfaceC1879i) {
        Object objFold = interfaceC1879i.fold(0, f28398b);
        AbstractC6118n.m27184b(objFold);
        return objFold;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C7115O m31409h(C7115O c7115o, InterfaceC1879i.b bVar) {
        if (bVar instanceof InterfaceC6636T0) {
            InterfaceC6636T0 interfaceC6636T0 = (InterfaceC6636T0) bVar;
            c7115o.m31426a(interfaceC6636T0, interfaceC6636T0.m28124d0(c7115o.f28403a));
        }
        return c7115o;
    }

    /* JADX INFO: renamed from: i */
    public static final Object m31410i(InterfaceC1879i interfaceC1879i, Object obj) {
        if (obj == null) {
            obj = m31408g(interfaceC1879i);
        }
        if (obj == 0) {
            return f28397a;
        }
        if (obj instanceof Integer) {
            return interfaceC1879i.fold(new C7115O(interfaceC1879i, ((Number) obj).intValue()), f28400d);
        }
        AbstractC6118n.m27185c(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((InterfaceC6636T0) obj).m28124d0(interfaceC1879i);
    }
}
