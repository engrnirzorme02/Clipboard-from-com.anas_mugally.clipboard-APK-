package kotlin.coroutines.jvm.internal;

import p173W5.C1880j;
import p173W5.InterfaceC1875e;
import p173W5.InterfaceC1879i;

/* JADX INFO: renamed from: kotlin.coroutines.jvm.internal.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6095j extends AbstractC6086a {
    public AbstractC6095j(InterfaceC1875e interfaceC1875e) {
        super(interfaceC1875e);
        if (interfaceC1875e != null && interfaceC1875e.getContext() != C1880j.f6044a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // p173W5.InterfaceC1875e
    public InterfaceC1879i getContext() {
        return C1880j.f6044a;
    }
}
