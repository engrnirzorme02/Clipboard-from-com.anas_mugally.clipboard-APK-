package p327p5;

import p138R5.InterfaceC1380a;
import p317o5.InterfaceC6594b;

/* JADX INFO: renamed from: p5.k */
/* JADX INFO: loaded from: classes.dex */
public final class C6768k implements InterfaceC6594b {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1380a f27191a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC1380a f27192b;

    public C6768k(InterfaceC1380a interfaceC1380a, InterfaceC1380a interfaceC1380a2) {
        this.f27191a = interfaceC1380a;
        this.f27192b = interfaceC1380a2;
    }

    /* JADX INFO: renamed from: a */
    public static C6768k m29585a(InterfaceC1380a interfaceC1380a, InterfaceC1380a interfaceC1380a2) {
        return new C6768k(interfaceC1380a, interfaceC1380a2);
    }

    /* JADX INFO: renamed from: c */
    public static C6767j m29586c(InterfaceC6772o interfaceC6772o, InterfaceC6772o interfaceC6772o2) {
        return new C6767j(interfaceC6772o, interfaceC6772o2);
    }

    @Override // p138R5.InterfaceC1380a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C6767j get() {
        return m29586c((InterfaceC6772o) this.f27191a.get(), (InterfaceC6772o) this.f27192b.get());
    }
}
