package p301m5;

import p138R5.InterfaceC1380a;
import p317o5.InterfaceC6594b;

/* JADX INFO: renamed from: m5.G */
/* JADX INFO: loaded from: classes.dex */
public final class C6353G implements InterfaceC6594b {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1380a f24220a;

    public C6353G(InterfaceC1380a interfaceC1380a) {
        this.f24220a = interfaceC1380a;
    }

    /* JADX INFO: renamed from: a */
    public static C6353G m27389a(InterfaceC1380a interfaceC1380a) {
        return new C6353G(interfaceC1380a);
    }

    /* JADX INFO: renamed from: c */
    public static C6352F m27390c(C6360N c6360n) {
        return new C6352F(c6360n);
    }

    @Override // p138R5.InterfaceC1380a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C6352F get() {
        return m27390c((C6360N) this.f24220a.get());
    }
}
