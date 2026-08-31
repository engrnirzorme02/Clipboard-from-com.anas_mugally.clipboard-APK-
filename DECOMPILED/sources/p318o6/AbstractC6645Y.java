package p318o6;

import kotlin.coroutines.jvm.internal.AbstractC6093h;
import p145S5.C1444v;
import p173W5.InterfaceC1875e;
import p173W5.InterfaceC1876f;
import p173W5.InterfaceC1879i;
import p180X5.AbstractC2005b;

/* JADX INFO: renamed from: o6.Y */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6645Y {
    /* JADX INFO: renamed from: a */
    public static final Object m28137a(long j7, InterfaceC1875e interfaceC1875e) {
        if (j7 <= 0) {
            return C1444v.f4971a;
        }
        C6682p c6682p = new C6682p(AbstractC2005b.m8367c(interfaceC1875e), 1);
        c6682p.m28263E();
        if (j7 < Long.MAX_VALUE) {
            m28138b(c6682p.getContext()).mo28132Q(j7, c6682p);
        }
        Object objM28273y = c6682p.m28273y();
        if (objM28273y == AbstractC2005b.m8369e()) {
            AbstractC6093h.m27135c(interfaceC1875e);
        }
        return objM28273y == AbstractC2005b.m8369e() ? objM28273y : C1444v.f4971a;
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC6643X m28138b(InterfaceC1879i interfaceC1879i) {
        InterfaceC1879i.b bVar = interfaceC1879i.get(InterfaceC1876f.f6042h);
        InterfaceC6643X interfaceC6643X = bVar instanceof InterfaceC6643X ? (InterfaceC6643X) bVar : null;
        return interfaceC6643X == null ? AbstractC6637U.m28125a() : interfaceC6643X;
    }
}
