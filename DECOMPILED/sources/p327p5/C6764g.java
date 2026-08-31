package p327p5;

import p138R5.InterfaceC1380a;
import p219c5.InterfaceC3022e;
import p301m5.C6374b;
import p301m5.InterfaceC6369X;
import p317o5.InterfaceC6594b;

/* JADX INFO: renamed from: p5.g */
/* JADX INFO: loaded from: classes.dex */
public final class C6764g implements InterfaceC6594b {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1380a f27171a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC1380a f27172b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC1380a f27173c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC1380a f27174d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC1380a f27175e;

    public C6764g(InterfaceC1380a interfaceC1380a, InterfaceC1380a interfaceC1380a2, InterfaceC1380a interfaceC1380a3, InterfaceC1380a interfaceC1380a4, InterfaceC1380a interfaceC1380a5) {
        this.f27171a = interfaceC1380a;
        this.f27172b = interfaceC1380a2;
        this.f27173c = interfaceC1380a3;
        this.f27174d = interfaceC1380a4;
        this.f27175e = interfaceC1380a5;
    }

    /* JADX INFO: renamed from: a */
    public static C6764g m29566a(InterfaceC1380a interfaceC1380a, InterfaceC1380a interfaceC1380a2, InterfaceC1380a interfaceC1380a3, InterfaceC1380a interfaceC1380a4, InterfaceC1380a interfaceC1380a5) {
        return new C6764g(interfaceC1380a, interfaceC1380a2, interfaceC1380a3, interfaceC1380a4, interfaceC1380a5);
    }

    /* JADX INFO: renamed from: c */
    public static C6761d m29567c(InterfaceC6369X interfaceC6369X, InterfaceC3022e interfaceC3022e, C6374b c6374b, InterfaceC6758a interfaceC6758a, InterfaceC6769l interfaceC6769l) {
        return new C6761d(interfaceC6369X, interfaceC3022e, c6374b, interfaceC6758a, interfaceC6769l);
    }

    @Override // p138R5.InterfaceC1380a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C6761d get() {
        return m29567c((InterfaceC6369X) this.f27171a.get(), (InterfaceC3022e) this.f27172b.get(), (C6374b) this.f27173c.get(), (InterfaceC6758a) this.f27174d.get(), (InterfaceC6769l) this.f27175e.get());
    }
}
