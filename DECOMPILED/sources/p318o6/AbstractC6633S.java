package p318o6;

import p145S5.AbstractC1437o;
import p145S5.C1436n;
import p173W5.InterfaceC1875e;
import p360t6.C7124h;

/* JADX INFO: renamed from: o6.S */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6633S {
    /* JADX INFO: renamed from: a */
    public static final String m28108a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    /* JADX INFO: renamed from: b */
    public static final String m28109b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* JADX INFO: renamed from: c */
    public static final String m28110c(InterfaceC1875e interfaceC1875e) {
        Object objM6073b;
        if (interfaceC1875e instanceof C7124h) {
            return ((C7124h) interfaceC1875e).toString();
        }
        try {
            C1436n.a aVar = C1436n.f4958b;
            objM6073b = C1436n.m6073b(interfaceC1875e + '@' + m28109b(interfaceC1875e));
        } catch (Throwable th) {
            C1436n.a aVar2 = C1436n.f4958b;
            objM6073b = C1436n.m6073b(AbstractC1437o.m6081a(th));
        }
        if (C1436n.m6075d(objM6073b) != null) {
            objM6073b = interfaceC1875e.getClass().getName() + '@' + m28109b(interfaceC1875e);
        }
        return (String) objM6073b;
    }
}
