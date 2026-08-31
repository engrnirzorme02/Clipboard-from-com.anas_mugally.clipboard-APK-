package p327p5;

import p138R5.InterfaceC1380a;
import p173W5.InterfaceC1879i;
import p174X.InterfaceC1905i;
import p301m5.InterfaceC6369X;
import p317o5.InterfaceC6594b;

/* JADX INFO: renamed from: p5.n */
/* JADX INFO: loaded from: classes.dex */
public final class C6771n implements InterfaceC6594b {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1380a f27207a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC1380a f27208b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC1380a f27209c;

    public C6771n(InterfaceC1380a interfaceC1380a, InterfaceC1380a interfaceC1380a2, InterfaceC1380a interfaceC1380a3) {
        this.f27207a = interfaceC1380a;
        this.f27208b = interfaceC1380a2;
        this.f27209c = interfaceC1380a3;
    }

    /* JADX INFO: renamed from: a */
    public static C6771n m29602a(InterfaceC1380a interfaceC1380a, InterfaceC1380a interfaceC1380a2, InterfaceC1380a interfaceC1380a3) {
        return new C6771n(interfaceC1380a, interfaceC1380a2, interfaceC1380a3);
    }

    /* JADX INFO: renamed from: c */
    public static C6770m m29603c(InterfaceC1879i interfaceC1879i, InterfaceC6369X interfaceC6369X, InterfaceC1905i interfaceC1905i) {
        return new C6770m(interfaceC1879i, interfaceC6369X, interfaceC1905i);
    }

    @Override // p138R5.InterfaceC1380a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C6770m get() {
        return m29603c((InterfaceC1879i) this.f27207a.get(), (InterfaceC6369X) this.f27208b.get(), (InterfaceC1905i) this.f27209c.get());
    }
}
