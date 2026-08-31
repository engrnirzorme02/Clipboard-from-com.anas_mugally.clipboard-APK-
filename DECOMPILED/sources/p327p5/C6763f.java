package p327p5;

import p138R5.InterfaceC1380a;
import p173W5.InterfaceC1879i;
import p301m5.C6374b;
import p317o5.InterfaceC6594b;

/* JADX INFO: renamed from: p5.f */
/* JADX INFO: loaded from: classes.dex */
public final class C6763f implements InterfaceC6594b {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1380a f27169a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC1380a f27170b;

    public C6763f(InterfaceC1380a interfaceC1380a, InterfaceC1380a interfaceC1380a2) {
        this.f27169a = interfaceC1380a;
        this.f27170b = interfaceC1380a2;
    }

    /* JADX INFO: renamed from: a */
    public static C6763f m29563a(InterfaceC1380a interfaceC1380a, InterfaceC1380a interfaceC1380a2) {
        return new C6763f(interfaceC1380a, interfaceC1380a2);
    }

    /* JADX INFO: renamed from: c */
    public static C6762e m29564c(C6374b c6374b, InterfaceC1879i interfaceC1879i) {
        return new C6762e(c6374b, interfaceC1879i);
    }

    @Override // p138R5.InterfaceC1380a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C6762e get() {
        return m29564c((C6374b) this.f27169a.get(), (InterfaceC1879i) this.f27170b.get());
    }
}
