package p392x6;

import p173W5.InterfaceC1875e;

/* JADX INFO: renamed from: x6.a */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC7419a {

    /* JADX INFO: renamed from: x6.a$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ boolean m32857a(InterfaceC7419a interfaceC7419a, Object obj, int i7, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryLock");
            }
            if ((i7 & 1) != 0) {
                obj = null;
            }
            return interfaceC7419a.mo32853a(obj);
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m32858b(InterfaceC7419a interfaceC7419a, Object obj, int i7, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlock");
            }
            if ((i7 & 1) != 0) {
                obj = null;
            }
            interfaceC7419a.mo32855c(obj);
        }
    }

    /* JADX INFO: renamed from: a */
    boolean mo32853a(Object obj);

    /* JADX INFO: renamed from: b */
    boolean mo32854b();

    /* JADX INFO: renamed from: c */
    void mo32855c(Object obj);

    /* JADX INFO: renamed from: d */
    Object mo32856d(Object obj, InterfaceC1875e interfaceC1875e);
}
