package p301m5;

import p138R5.InterfaceC1380a;
import p211b5.InterfaceC2972b;
import p317o5.InterfaceC6594b;

/* JADX INFO: renamed from: m5.i */
/* JADX INFO: loaded from: classes.dex */
public final class C6381i implements InterfaceC6594b {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1380a f24387a;

    public C6381i(InterfaceC1380a interfaceC1380a) {
        this.f24387a = interfaceC1380a;
    }

    /* JADX INFO: renamed from: a */
    public static C6381i m27496a(InterfaceC1380a interfaceC1380a) {
        return new C6381i(interfaceC1380a);
    }

    /* JADX INFO: renamed from: c */
    public static C6379g m27497c(InterfaceC2972b interfaceC2972b) {
        return new C6379g(interfaceC2972b);
    }

    @Override // p138R5.InterfaceC1380a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C6379g get() {
        return m27497c((InterfaceC2972b) this.f24387a.get());
    }
}
