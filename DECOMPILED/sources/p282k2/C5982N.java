package p282k2;

import p138R5.InterfaceC1380a;
import p234e2.InterfaceC5336b;
import p298m2.InterfaceC6328a;

/* JADX INFO: renamed from: k2.N */
/* JADX INFO: loaded from: classes.dex */
public final class C5982N implements InterfaceC5336b {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1380a f23733a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC1380a f23734b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC1380a f23735c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC1380a f23736d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC1380a f23737e;

    public C5982N(InterfaceC1380a interfaceC1380a, InterfaceC1380a interfaceC1380a2, InterfaceC1380a interfaceC1380a3, InterfaceC1380a interfaceC1380a4, InterfaceC1380a interfaceC1380a5) {
        this.f23733a = interfaceC1380a;
        this.f23734b = interfaceC1380a2;
        this.f23735c = interfaceC1380a3;
        this.f23736d = interfaceC1380a4;
        this.f23737e = interfaceC1380a5;
    }

    /* JADX INFO: renamed from: a */
    public static C5982N m26990a(InterfaceC1380a interfaceC1380a, InterfaceC1380a interfaceC1380a2, InterfaceC1380a interfaceC1380a3, InterfaceC1380a interfaceC1380a4, InterfaceC1380a interfaceC1380a5) {
        return new C5982N(interfaceC1380a, interfaceC1380a2, interfaceC1380a3, interfaceC1380a4, interfaceC1380a5);
    }

    /* JADX INFO: renamed from: c */
    public static C5981M m26991c(InterfaceC6328a interfaceC6328a, InterfaceC6328a interfaceC6328a2, Object obj, Object obj2, InterfaceC1380a interfaceC1380a) {
        return new C5981M(interfaceC6328a, interfaceC6328a2, (AbstractC5996e) obj, (C5990W) obj2, interfaceC1380a);
    }

    @Override // p138R5.InterfaceC1380a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C5981M get() {
        return m26991c((InterfaceC6328a) this.f23733a.get(), (InterfaceC6328a) this.f23734b.get(), this.f23735c.get(), this.f23736d.get(), this.f23737e);
    }
}
