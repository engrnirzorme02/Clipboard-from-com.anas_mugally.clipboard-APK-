package p360t6;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import p294l6.AbstractC6307h;
import p318o6.AbstractC6615I0;

/* JADX INFO: renamed from: t6.s */
/* JADX INFO: loaded from: classes.dex */
public final class C7135s {

    /* JADX INFO: renamed from: a */
    public static final C7135s f28443a;

    /* JADX INFO: renamed from: b */
    public static final AbstractC6615I0 f28444b;

    static {
        C7135s c7135s = new C7135s();
        f28443a = c7135s;
        AbstractC7105E.m31391f("kotlinx.coroutines.fast.service.loader", true);
        f28444b = c7135s.m31509a();
    }

    private C7135s() {
    }

    /* JADX INFO: renamed from: a */
    private final AbstractC6615I0 m31509a() {
        Object next;
        AbstractC6615I0 abstractC6615I0M31514e;
        try {
            List listN = AbstractC6307h.m27249n(AbstractC6307h.m27239d(ServiceLoader.load(InterfaceC7134r.class, InterfaceC7134r.class.getClassLoader()).iterator()));
            Iterator it = listN.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int iMo29608c = ((InterfaceC7134r) next).mo29608c();
                    do {
                        Object next2 = it.next();
                        int iMo29608c2 = ((InterfaceC7134r) next2).mo29608c();
                        if (iMo29608c < iMo29608c2) {
                            next = next2;
                            iMo29608c = iMo29608c2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            InterfaceC7134r interfaceC7134r = (InterfaceC7134r) next;
            if (interfaceC7134r != null && (abstractC6615I0M31514e = AbstractC7136t.m31514e(interfaceC7134r, listN)) != null) {
                return abstractC6615I0M31514e;
            }
            AbstractC7136t.m31511b(null, null, 3, null);
            return null;
        } catch (Throwable th) {
            AbstractC7136t.m31511b(th, null, 2, null);
            return null;
        }
    }
}
