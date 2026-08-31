package p352s6;

import p173W5.InterfaceC1879i;
import p238e6.InterfaceC5371p;

/* JADX INFO: renamed from: s6.i */
/* JADX INFO: loaded from: classes.dex */
public final class C7052i implements InterfaceC1879i {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ InterfaceC1879i f28200a;

    /* JADX INFO: renamed from: b */
    public final Throwable f28201b;

    public C7052i(Throwable th, InterfaceC1879i interfaceC1879i) {
        this.f28200a = interfaceC1879i;
        this.f28201b = th;
    }

    @Override // p173W5.InterfaceC1879i
    public Object fold(Object obj, InterfaceC5371p interfaceC5371p) {
        return this.f28200a.fold(obj, interfaceC5371p);
    }

    @Override // p173W5.InterfaceC1879i
    public InterfaceC1879i.b get(InterfaceC1879i.c cVar) {
        return this.f28200a.get(cVar);
    }

    @Override // p173W5.InterfaceC1879i
    public InterfaceC1879i minusKey(InterfaceC1879i.c cVar) {
        return this.f28200a.minusKey(cVar);
    }

    @Override // p173W5.InterfaceC1879i
    public InterfaceC1879i plus(InterfaceC1879i interfaceC1879i) {
        return this.f28200a.plus(interfaceC1879i);
    }
}
