package p301m5;

import p138R5.InterfaceC1380a;
import p317o5.InterfaceC6594b;

/* JADX INFO: renamed from: m5.S */
/* JADX INFO: loaded from: classes.dex */
public final class C6364S implements InterfaceC6594b {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1380a f24269a;

    public C6364S(InterfaceC1380a interfaceC1380a) {
        this.f24269a = interfaceC1380a;
    }

    /* JADX INFO: renamed from: a */
    public static C6364S m27431a(InterfaceC1380a interfaceC1380a) {
        return new C6364S(interfaceC1380a);
    }

    /* JADX INFO: renamed from: c */
    public static C6363Q m27432c(InterfaceC6365T interfaceC6365T) {
        return new C6363Q(interfaceC6365T);
    }

    @Override // p138R5.InterfaceC1380a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C6363Q get() {
        return m27432c((InterfaceC6365T) this.f24269a.get());
    }
}
