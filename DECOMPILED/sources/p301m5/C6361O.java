package p301m5;

import p138R5.InterfaceC1380a;
import p317o5.InterfaceC6594b;

/* JADX INFO: renamed from: m5.O */
/* JADX INFO: loaded from: classes.dex */
public final class C6361O implements InterfaceC6594b {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1380a f24258a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC1380a f24259b;

    public C6361O(InterfaceC1380a interfaceC1380a, InterfaceC1380a interfaceC1380a2) {
        this.f24258a = interfaceC1380a;
        this.f24259b = interfaceC1380a2;
    }

    /* JADX INFO: renamed from: a */
    public static C6361O m27421a(InterfaceC1380a interfaceC1380a, InterfaceC1380a interfaceC1380a2) {
        return new C6361O(interfaceC1380a, interfaceC1380a2);
    }

    /* JADX INFO: renamed from: c */
    public static C6360N m27422c(InterfaceC6369X interfaceC6369X, InterfaceC6371Z interfaceC6371Z) {
        return new C6360N(interfaceC6369X, interfaceC6371Z);
    }

    @Override // p138R5.InterfaceC1380a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C6360N get() {
        return m27422c((InterfaceC6369X) this.f24258a.get(), (InterfaceC6371Z) this.f24259b.get());
    }
}
