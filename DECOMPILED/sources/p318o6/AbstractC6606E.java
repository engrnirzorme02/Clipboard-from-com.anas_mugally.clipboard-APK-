package p318o6;

import p145S5.AbstractC1437o;
import p145S5.C1436n;
import p173W5.InterfaceC1875e;

/* JADX INFO: renamed from: o6.E */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6606E {
    /* JADX INFO: renamed from: a */
    public static final Object m27977a(Object obj, InterfaceC1875e interfaceC1875e) {
        if (!(obj instanceof C6602C)) {
            return C1436n.m6073b(obj);
        }
        C1436n.a aVar = C1436n.f4958b;
        return C1436n.m6073b(AbstractC1437o.m6081a(((C6602C) obj).f24874a));
    }

    /* JADX INFO: renamed from: b */
    public static final Object m27978b(Object obj) {
        Throwable thM6075d = C1436n.m6075d(obj);
        return thM6075d == null ? obj : new C6602C(thM6075d, false, 2, null);
    }

    /* JADX INFO: renamed from: c */
    public static final Object m27979c(Object obj, InterfaceC6678n interfaceC6678n) {
        Throwable thM6075d = C1436n.m6075d(obj);
        return thM6075d == null ? obj : new C6602C(thM6075d, false, 2, null);
    }
}
