package p318o6;

import p173W5.InterfaceC1875e;
import p238e6.InterfaceC5367l;
import p238e6.InterfaceC5372q;

/* JADX INFO: renamed from: o6.n */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC6678n extends InterfaceC1875e {

    /* JADX INFO: renamed from: o6.n$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ boolean m28240a(InterfaceC6678n interfaceC6678n, Throwable th, int i7, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i7 & 1) != 0) {
                th = null;
            }
            return interfaceC6678n.cancel(th);
        }
    }

    /* JADX INFO: renamed from: a */
    void mo28234a(InterfaceC5367l interfaceC5367l);

    /* JADX INFO: renamed from: c */
    void mo28235c(AbstractC6618K abstractC6618K, Object obj);

    boolean cancel(Throwable th);

    /* JADX INFO: renamed from: e */
    void mo28236e(Object obj, InterfaceC5372q interfaceC5372q);

    /* JADX INFO: renamed from: f */
    Object mo28237f(Throwable th);

    /* JADX INFO: renamed from: h */
    Object mo28238h(Object obj, Object obj2, InterfaceC5372q interfaceC5372q);

    boolean isCompleted();

    /* JADX INFO: renamed from: l */
    void mo28239l(Object obj);
}
