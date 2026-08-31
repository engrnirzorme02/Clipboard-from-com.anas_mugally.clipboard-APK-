package p344r6;

import kotlin.jvm.internal.AbstractC6112h;
import p145S5.C1444v;
import p173W5.C1880j;
import p173W5.InterfaceC1875e;
import p173W5.InterfaceC1879i;
import p180X5.AbstractC2005b;
import p238e6.InterfaceC5371p;
import p336q6.EnumC6845a;
import p336q6.InterfaceC6866v;
import p352s6.AbstractC7048e;

/* JADX INFO: renamed from: r6.b */
/* JADX INFO: loaded from: classes.dex */
class C6917b extends AbstractC7048e {

    /* JADX INFO: renamed from: d */
    private final InterfaceC5371p f27787d;

    public /* synthetic */ C6917b(InterfaceC5371p interfaceC5371p, InterfaceC1879i interfaceC1879i, int i7, EnumC6845a enumC6845a, int i8, AbstractC6112h abstractC6112h) {
        this(interfaceC5371p, (i8 & 2) != 0 ? C1880j.f6044a : interfaceC1879i, (i8 & 4) != 0 ? -2 : i7, (i8 & 8) != 0 ? EnumC6845a.SUSPEND : enumC6845a);
    }

    /* JADX INFO: renamed from: k */
    static /* synthetic */ Object m30352k(C6917b c6917b, InterfaceC6866v interfaceC6866v, InterfaceC1875e interfaceC1875e) {
        Object objInvoke = c6917b.f27787d.invoke(interfaceC6866v, interfaceC1875e);
        return objInvoke == AbstractC2005b.m8369e() ? objInvoke : C1444v.f4971a;
    }

    @Override // p352s6.AbstractC7048e
    /* JADX INFO: renamed from: f */
    protected Object mo30353f(InterfaceC6866v interfaceC6866v, InterfaceC1875e interfaceC1875e) {
        return m30352k(this, interfaceC6866v, interfaceC1875e);
    }

    @Override // p352s6.AbstractC7048e
    /* JADX INFO: renamed from: g */
    protected AbstractC7048e mo30354g(InterfaceC1879i interfaceC1879i, int i7, EnumC6845a enumC6845a) {
        return new C6917b(this.f27787d, interfaceC1879i, i7, enumC6845a);
    }

    @Override // p352s6.AbstractC7048e
    public String toString() {
        return "block[" + this.f27787d + "] -> " + super.toString();
    }

    public C6917b(InterfaceC5371p interfaceC5371p, InterfaceC1879i interfaceC1879i, int i7, EnumC6845a enumC6845a) {
        super(interfaceC1879i, i7, enumC6845a);
        this.f27787d = interfaceC5371p;
    }
}
