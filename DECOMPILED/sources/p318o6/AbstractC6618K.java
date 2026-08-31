package p318o6;

import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p173W5.AbstractC1871a;
import p173W5.AbstractC1872b;
import p173W5.InterfaceC1875e;
import p173W5.InterfaceC1876f;
import p173W5.InterfaceC1879i;
import p238e6.InterfaceC5367l;
import p360t6.AbstractC7128l;
import p360t6.C7124h;
import p360t6.C7127k;

/* JADX INFO: renamed from: o6.K */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6618K extends AbstractC1871a implements InterfaceC1876f {

    /* JADX INFO: renamed from: b */
    public static final a f24908b = new a(null);

    /* JADX INFO: renamed from: o6.K$a */
    public static final class a extends AbstractC1872b {
        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: d */
        public static final AbstractC6618K m28093d(InterfaceC1879i.b bVar) {
            if (bVar instanceof AbstractC6618K) {
                return (AbstractC6618K) bVar;
            }
            return null;
        }

        private a() {
            super(InterfaceC1876f.f6042h, new InterfaceC5367l() { // from class: o6.J
                @Override // p238e6.InterfaceC5367l
                public final Object invoke(Object obj) {
                    return AbstractC6618K.a.m28093d((InterfaceC1879i.b) obj);
                }
            });
        }
    }

    public AbstractC6618K() {
        super(InterfaceC1876f.f6042h);
    }

    /* JADX INFO: renamed from: T0 */
    public static /* synthetic */ AbstractC6618K m28089T0(AbstractC6618K abstractC6618K, int i7, String str, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: limitedParallelism");
        }
        if ((i8 & 2) != 0) {
            str = null;
        }
        return abstractC6618K.mo28086S0(i7, str);
    }

    /* JADX INFO: renamed from: Q0 */
    public abstract void mo28090Q0(InterfaceC1879i interfaceC1879i, Runnable runnable);

    /* JADX INFO: renamed from: R0 */
    public boolean mo28091R0(InterfaceC1879i interfaceC1879i) {
        return true;
    }

    /* JADX INFO: renamed from: S0 */
    public AbstractC6618K mo28086S0(int i7, String str) {
        AbstractC7128l.m31467a(i7);
        return new C7127k(this, i7, str);
    }

    @Override // p173W5.AbstractC1871a, p173W5.InterfaceC1879i.b, p173W5.InterfaceC1879i
    public InterfaceC1879i.b get(InterfaceC1879i.c cVar) {
        return InterfaceC1876f.a.m7776a(this, cVar);
    }

    @Override // p173W5.InterfaceC1876f
    /* JADX INFO: renamed from: m */
    public final void mo7774m(InterfaceC1875e interfaceC1875e) {
        AbstractC6118n.m27185c(interfaceC1875e, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((C7124h) interfaceC1875e).m31455t();
    }

    @Override // p173W5.AbstractC1871a, p173W5.InterfaceC1879i.b, p173W5.InterfaceC1879i
    public InterfaceC1879i minusKey(InterfaceC1879i.c cVar) {
        return InterfaceC1876f.a.m7777b(this, cVar);
    }

    public String toString() {
        return AbstractC6633S.m28108a(this) + '@' + AbstractC6633S.m28109b(this);
    }

    @Override // p173W5.InterfaceC1876f
    /* JADX INFO: renamed from: x */
    public final InterfaceC1875e mo7775x(InterfaceC1875e interfaceC1875e) {
        return new C7124h(this, interfaceC1875e);
    }
}
