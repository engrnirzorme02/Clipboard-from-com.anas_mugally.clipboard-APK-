package p352s6;

import kotlin.jvm.internal.AbstractC6112h;
import p145S5.C1444v;
import p173W5.C1880j;
import p173W5.InterfaceC1875e;
import p173W5.InterfaceC1879i;
import p180X5.AbstractC2005b;
import p336q6.EnumC6845a;
import p344r6.InterfaceC6918c;
import p344r6.InterfaceC6919d;

/* JADX INFO: renamed from: s6.h */
/* JADX INFO: loaded from: classes.dex */
public final class C7051h extends AbstractC7050g {
    public /* synthetic */ C7051h(InterfaceC6918c interfaceC6918c, InterfaceC1879i interfaceC1879i, int i7, EnumC6845a enumC6845a, int i8, AbstractC6112h abstractC6112h) {
        this(interfaceC6918c, (i8 & 2) != 0 ? C1880j.f6044a : interfaceC1879i, (i8 & 4) != 0 ? -3 : i7, (i8 & 8) != 0 ? EnumC6845a.SUSPEND : enumC6845a);
    }

    @Override // p352s6.AbstractC7048e
    /* JADX INFO: renamed from: g */
    protected AbstractC7048e mo30354g(InterfaceC1879i interfaceC1879i, int i7, EnumC6845a enumC6845a) {
        return new C7051h(this.f28196d, interfaceC1879i, i7, enumC6845a);
    }

    @Override // p352s6.AbstractC7050g
    /* JADX INFO: renamed from: n */
    protected Object mo31138n(InterfaceC6919d interfaceC6919d, InterfaceC1875e interfaceC1875e) {
        Object objMo7891a = this.f28196d.mo7891a(interfaceC6919d, interfaceC1875e);
        return objMo7891a == AbstractC2005b.m8369e() ? objMo7891a : C1444v.f4971a;
    }

    public C7051h(InterfaceC6918c interfaceC6918c, InterfaceC1879i interfaceC1879i, int i7, EnumC6845a enumC6845a) {
        super(interfaceC6918c, interfaceC1879i, i7, enumC6845a);
    }
}
