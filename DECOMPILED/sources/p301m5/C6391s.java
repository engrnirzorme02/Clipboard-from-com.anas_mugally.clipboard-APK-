package p301m5;

import p138R5.InterfaceC1380a;
import p164V3.C1762g;
import p173W5.InterfaceC1879i;
import p317o5.InterfaceC6594b;
import p327p5.C6767j;

/* JADX INFO: renamed from: m5.s */
/* JADX INFO: loaded from: classes.dex */
public final class C6391s implements InterfaceC6594b {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1380a f24403a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC1380a f24404b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC1380a f24405c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC1380a f24406d;

    public C6391s(InterfaceC1380a interfaceC1380a, InterfaceC1380a interfaceC1380a2, InterfaceC1380a interfaceC1380a3, InterfaceC1380a interfaceC1380a4) {
        this.f24403a = interfaceC1380a;
        this.f24404b = interfaceC1380a2;
        this.f24405c = interfaceC1380a3;
        this.f24406d = interfaceC1380a4;
    }

    /* JADX INFO: renamed from: a */
    public static C6391s m27503a(InterfaceC1380a interfaceC1380a, InterfaceC1380a interfaceC1380a2, InterfaceC1380a interfaceC1380a3, InterfaceC1380a interfaceC1380a4) {
        return new C6391s(interfaceC1380a, interfaceC1380a2, interfaceC1380a3, interfaceC1380a4);
    }

    /* JADX INFO: renamed from: c */
    public static C6384l m27504c(C1762g c1762g, C6767j c6767j, InterfaceC1879i interfaceC1879i, C6363Q c6363q) {
        return new C6384l(c1762g, c6767j, interfaceC1879i, c6363q);
    }

    @Override // p138R5.InterfaceC1380a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C6384l get() {
        return m27504c((C1762g) this.f24403a.get(), (C6767j) this.f24404b.get(), (InterfaceC1879i) this.f24405c.get(), (C6363Q) this.f24406d.get());
    }
}
