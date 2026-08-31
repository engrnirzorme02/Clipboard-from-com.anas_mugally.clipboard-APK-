package p301m5;

import p138R5.InterfaceC1380a;
import p173W5.InterfaceC1879i;
import p174X.InterfaceC1905i;
import p317o5.InterfaceC6594b;
import p327p5.C6767j;

/* JADX INFO: renamed from: m5.V */
/* JADX INFO: loaded from: classes.dex */
public final class C6367V implements InterfaceC6594b {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1380a f24311a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC1380a f24312b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC1380a f24313c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC1380a f24314d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC1380a f24315e;

    /* JADX INFO: renamed from: f */
    private final InterfaceC1380a f24316f;

    /* JADX INFO: renamed from: g */
    private final InterfaceC1380a f24317g;

    public C6367V(InterfaceC1380a interfaceC1380a, InterfaceC1380a interfaceC1380a2, InterfaceC1380a interfaceC1380a3, InterfaceC1380a interfaceC1380a4, InterfaceC1380a interfaceC1380a5, InterfaceC1380a interfaceC1380a6, InterfaceC1380a interfaceC1380a7) {
        this.f24311a = interfaceC1380a;
        this.f24312b = interfaceC1380a2;
        this.f24313c = interfaceC1380a3;
        this.f24314d = interfaceC1380a4;
        this.f24315e = interfaceC1380a5;
        this.f24316f = interfaceC1380a6;
        this.f24317g = interfaceC1380a7;
    }

    /* JADX INFO: renamed from: a */
    public static C6367V m27461a(InterfaceC1380a interfaceC1380a, InterfaceC1380a interfaceC1380a2, InterfaceC1380a interfaceC1380a3, InterfaceC1380a interfaceC1380a4, InterfaceC1380a interfaceC1380a5, InterfaceC1380a interfaceC1380a6, InterfaceC1380a interfaceC1380a7) {
        return new C6367V(interfaceC1380a, interfaceC1380a2, interfaceC1380a3, interfaceC1380a4, interfaceC1380a5, interfaceC1380a6, interfaceC1380a7);
    }

    /* JADX INFO: renamed from: c */
    public static C6366U m27462c(C6767j c6767j, C6360N c6360n, InterfaceC6357K interfaceC6357K, InterfaceC6369X interfaceC6369X, InterfaceC1905i interfaceC1905i, InterfaceC6395w interfaceC6395w, InterfaceC1879i interfaceC1879i) {
        return new C6366U(c6767j, c6360n, interfaceC6357K, interfaceC6369X, interfaceC1905i, interfaceC6395w, interfaceC1879i);
    }

    @Override // p138R5.InterfaceC1380a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C6366U get() {
        return m27462c((C6767j) this.f24311a.get(), (C6360N) this.f24312b.get(), (InterfaceC6357K) this.f24313c.get(), (InterfaceC6369X) this.f24314d.get(), (InterfaceC1905i) this.f24315e.get(), (InterfaceC6395w) this.f24316f.get(), (InterfaceC1879i) this.f24317g.get());
    }
}
