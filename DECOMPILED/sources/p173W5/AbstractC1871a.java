package p173W5;

import kotlin.jvm.internal.AbstractC6118n;
import p238e6.InterfaceC5371p;

/* JADX INFO: renamed from: W5.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1871a implements InterfaceC1879i.b {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1879i.c f6037a;

    public AbstractC1871a(InterfaceC1879i.c key) {
        AbstractC6118n.m27187e(key, "key");
        this.f6037a = key;
    }

    @Override // p173W5.InterfaceC1879i.b, p173W5.InterfaceC1879i
    public Object fold(Object obj, InterfaceC5371p interfaceC5371p) {
        return InterfaceC1879i.b.a.m7782a(this, obj, interfaceC5371p);
    }

    @Override // p173W5.InterfaceC1879i.b, p173W5.InterfaceC1879i
    public InterfaceC1879i.b get(InterfaceC1879i.c cVar) {
        return InterfaceC1879i.b.a.m7783b(this, cVar);
    }

    @Override // p173W5.InterfaceC1879i.b
    public InterfaceC1879i.c getKey() {
        return this.f6037a;
    }

    @Override // p173W5.InterfaceC1879i.b, p173W5.InterfaceC1879i
    public InterfaceC1879i minusKey(InterfaceC1879i.c cVar) {
        return InterfaceC1879i.b.a.m7784c(this, cVar);
    }

    @Override // p173W5.InterfaceC1879i
    public InterfaceC1879i plus(InterfaceC1879i interfaceC1879i) {
        return InterfaceC1879i.b.a.m7785d(this, interfaceC1879i);
    }
}
