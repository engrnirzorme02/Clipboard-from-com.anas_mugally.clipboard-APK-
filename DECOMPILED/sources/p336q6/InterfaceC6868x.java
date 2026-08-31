package p336q6;

import p173W5.InterfaceC1875e;
import p238e6.InterfaceC5367l;

/* JADX INFO: renamed from: q6.x */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC6868x {

    /* JADX INFO: renamed from: q6.x$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ boolean m30073a(InterfaceC6868x interfaceC6868x, Throwable th, int i7, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
            }
            if ((i7 & 1) != 0) {
                th = null;
            }
            return interfaceC6868x.mo29979g(th);
        }
    }

    /* JADX INFO: renamed from: g */
    boolean mo29979g(Throwable th);

    /* JADX INFO: renamed from: i */
    Object mo29980i(Object obj, InterfaceC1875e interfaceC1875e);

    /* JADX INFO: renamed from: j */
    void mo29981j(InterfaceC5367l interfaceC5367l);

    /* JADX INFO: renamed from: k */
    Object mo29982k(Object obj);
}
