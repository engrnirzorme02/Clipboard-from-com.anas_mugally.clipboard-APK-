package p344r6;

import p145S5.C1444v;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p238e6.InterfaceC5371p;

/* JADX INFO: renamed from: r6.o */
/* JADX INFO: loaded from: classes.dex */
final class C6930o extends AbstractC6916a {

    /* JADX INFO: renamed from: a */
    private final InterfaceC5371p f27861a;

    public C6930o(InterfaceC5371p interfaceC5371p) {
        this.f27861a = interfaceC5371p;
    }

    @Override // p344r6.AbstractC6916a
    /* JADX INFO: renamed from: d */
    public Object mo30351d(InterfaceC6919d interfaceC6919d, InterfaceC1875e interfaceC1875e) {
        Object objInvoke = this.f27861a.invoke(interfaceC6919d, interfaceC1875e);
        return objInvoke == AbstractC2005b.m8369e() ? objInvoke : C1444v.f4971a;
    }
}
