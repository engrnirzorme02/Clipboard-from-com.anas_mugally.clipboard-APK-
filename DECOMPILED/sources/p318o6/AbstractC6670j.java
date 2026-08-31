package p318o6;

import p173W5.C1880j;
import p173W5.InterfaceC1876f;
import p173W5.InterfaceC1879i;
import p238e6.InterfaceC5371p;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: o6.j */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC6670j {
    /* JADX WARN: Code duplicated, block: B:16:0x0036  */
    /* JADX INFO: renamed from: a */
    public static final Object m28199a(InterfaceC1879i interfaceC1879i, InterfaceC5371p interfaceC5371p) {
        AbstractC6669i0 abstractC6669i0M28127a;
        InterfaceC1879i interfaceC1879iM28083k;
        Thread threadCurrentThread = Thread.currentThread();
        InterfaceC1876f interfaceC1876f = (InterfaceC1876f) interfaceC1879i.get(InterfaceC1876f.f6042h);
        if (interfaceC1876f == null) {
            abstractC6669i0M28127a = C6638U0.f24927a.m28128b();
            interfaceC1879iM28083k = AbstractC6614I.m28083k(C6689s0.f24991a, interfaceC1879i.plus(abstractC6669i0M28127a));
        } else {
            AbstractC6669i0 abstractC6669i0 = interfaceC1876f instanceof AbstractC6669i0 ? (AbstractC6669i0) interfaceC1876f : null;
            if (abstractC6669i0 == null) {
                abstractC6669i0M28127a = C6638U0.f24927a.m28127a();
            } else {
                AbstractC6669i0 abstractC6669i1 = abstractC6669i0.m28198f1() ? abstractC6669i0 : null;
                if (abstractC6669i1 == null) {
                    abstractC6669i0M28127a = C6638U0.f24927a.m28127a();
                } else {
                    abstractC6669i0M28127a = abstractC6669i1;
                }
            }
            interfaceC1879iM28083k = AbstractC6614I.m28083k(C6689s0.f24991a, interfaceC1879i);
        }
        C6664g c6664g = new C6664g(interfaceC1879iM28083k, threadCurrentThread, abstractC6669i0M28127a);
        c6664g.m28148M0(EnumC6628P.DEFAULT, c6664g, interfaceC5371p);
        return c6664g.m28179N0();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Object m28200b(InterfaceC1879i interfaceC1879i, InterfaceC5371p interfaceC5371p, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            interfaceC1879i = C1880j.f6044a;
        }
        return AbstractC6668i.m28184e(interfaceC1879i, interfaceC5371p);
    }
}
