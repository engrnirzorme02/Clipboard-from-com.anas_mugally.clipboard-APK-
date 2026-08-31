package p173W5;

import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: W5.f */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1876f extends InterfaceC1879i.b {

    /* JADX INFO: renamed from: h */
    public static final b f6042h = b.f6043a;

    /* JADX INFO: renamed from: W5.f$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static InterfaceC1879i.b m7776a(InterfaceC1876f interfaceC1876f, InterfaceC1879i.c key) {
            InterfaceC1879i.b bVarM7768b;
            AbstractC6118n.m27187e(key, "key");
            if (!(key instanceof AbstractC1872b)) {
                if (InterfaceC1876f.f6042h != key) {
                    return null;
                }
                AbstractC6118n.m27185c(interfaceC1876f, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return interfaceC1876f;
            }
            AbstractC1872b abstractC1872b = (AbstractC1872b) key;
            if (!abstractC1872b.m7767a(interfaceC1876f.getKey()) || (bVarM7768b = abstractC1872b.m7768b(interfaceC1876f)) == null) {
                return null;
            }
            return bVarM7768b;
        }

        /* JADX INFO: renamed from: b */
        public static InterfaceC1879i m7777b(InterfaceC1876f interfaceC1876f, InterfaceC1879i.c key) {
            AbstractC6118n.m27187e(key, "key");
            if (!(key instanceof AbstractC1872b)) {
                return InterfaceC1876f.f6042h == key ? C1880j.f6044a : interfaceC1876f;
            }
            AbstractC1872b abstractC1872b = (AbstractC1872b) key;
            return (!abstractC1872b.m7767a(interfaceC1876f.getKey()) || abstractC1872b.m7768b(interfaceC1876f) == null) ? interfaceC1876f : C1880j.f6044a;
        }
    }

    /* JADX INFO: renamed from: W5.f$b */
    public static final class b implements InterfaceC1879i.c {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ b f6043a = new b();

        private b() {
        }
    }

    /* JADX INFO: renamed from: m */
    void mo7774m(InterfaceC1875e interfaceC1875e);

    /* JADX INFO: renamed from: x */
    InterfaceC1875e mo7775x(InterfaceC1875e interfaceC1875e);
}
