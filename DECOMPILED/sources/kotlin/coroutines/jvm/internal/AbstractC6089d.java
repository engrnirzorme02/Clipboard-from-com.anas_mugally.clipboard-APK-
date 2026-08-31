package kotlin.coroutines.jvm.internal;

import kotlin.jvm.internal.AbstractC6118n;
import p173W5.InterfaceC1875e;
import p173W5.InterfaceC1876f;
import p173W5.InterfaceC1879i;

/* JADX INFO: renamed from: kotlin.coroutines.jvm.internal.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6089d extends AbstractC6086a {
    private final InterfaceC1879i _context;
    private transient InterfaceC1875e<Object> intercepted;

    public AbstractC6089d(InterfaceC1875e interfaceC1875e, InterfaceC1879i interfaceC1879i) {
        super(interfaceC1875e);
        this._context = interfaceC1879i;
    }

    @Override // p173W5.InterfaceC1875e
    public InterfaceC1879i getContext() {
        InterfaceC1879i interfaceC1879i = this._context;
        AbstractC6118n.m27184b(interfaceC1879i);
        return interfaceC1879i;
    }

    public final InterfaceC1875e<Object> intercepted() {
        InterfaceC1875e interfaceC1875eMo7775x = this.intercepted;
        if (interfaceC1875eMo7775x == null) {
            InterfaceC1876f interfaceC1876f = (InterfaceC1876f) getContext().get(InterfaceC1876f.f6042h);
            if (interfaceC1876f == null || (interfaceC1875eMo7775x = interfaceC1876f.mo7775x(this)) == null) {
                interfaceC1875eMo7775x = this;
            }
            this.intercepted = interfaceC1875eMo7775x;
        }
        return interfaceC1875eMo7775x;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
    protected void releaseIntercepted() {
        InterfaceC1875e<Object> interfaceC1875e = this.intercepted;
        if (interfaceC1875e != null && interfaceC1875e != this) {
            InterfaceC1879i.b bVar = getContext().get(InterfaceC1876f.f6042h);
            AbstractC6118n.m27184b(bVar);
            ((InterfaceC1876f) bVar).mo7774m(interfaceC1875e);
        }
        this.intercepted = C6088c.f23850a;
    }

    public AbstractC6089d(InterfaceC1875e interfaceC1875e) {
        this(interfaceC1875e, interfaceC1875e != null ? interfaceC1875e.getContext() : null);
    }
}
