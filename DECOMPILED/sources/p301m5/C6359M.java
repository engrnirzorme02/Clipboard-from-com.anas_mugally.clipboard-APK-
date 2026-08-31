package p301m5;

import p138R5.InterfaceC1380a;
import p164V3.C1762g;
import p173W5.InterfaceC1879i;
import p219c5.InterfaceC3022e;
import p317o5.InterfaceC6594b;
import p327p5.C6767j;

/* JADX INFO: renamed from: m5.M */
/* JADX INFO: loaded from: classes.dex */
public final class C6359M implements InterfaceC6594b {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1380a f24251a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC1380a f24252b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC1380a f24253c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC1380a f24254d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC1380a f24255e;

    public C6359M(InterfaceC1380a interfaceC1380a, InterfaceC1380a interfaceC1380a2, InterfaceC1380a interfaceC1380a3, InterfaceC1380a interfaceC1380a4, InterfaceC1380a interfaceC1380a5) {
        this.f24251a = interfaceC1380a;
        this.f24252b = interfaceC1380a2;
        this.f24253c = interfaceC1380a3;
        this.f24254d = interfaceC1380a4;
        this.f24255e = interfaceC1380a5;
    }

    /* JADX INFO: renamed from: a */
    public static C6359M m27416a(InterfaceC1380a interfaceC1380a, InterfaceC1380a interfaceC1380a2, InterfaceC1380a interfaceC1380a3, InterfaceC1380a interfaceC1380a4, InterfaceC1380a interfaceC1380a5) {
        return new C6359M(interfaceC1380a, interfaceC1380a2, interfaceC1380a3, interfaceC1380a4, interfaceC1380a5);
    }

    /* JADX INFO: renamed from: c */
    public static C6358L m27417c(C1762g c1762g, InterfaceC3022e interfaceC3022e, C6767j c6767j, InterfaceC6380h interfaceC6380h, InterfaceC1879i interfaceC1879i) {
        return new C6358L(c1762g, interfaceC3022e, c6767j, interfaceC6380h, interfaceC1879i);
    }

    @Override // p138R5.InterfaceC1380a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C6358L get() {
        return m27417c((C1762g) this.f24251a.get(), (InterfaceC3022e) this.f24252b.get(), (C6767j) this.f24253c.get(), (InterfaceC6380h) this.f24254d.get(), (InterfaceC1879i) this.f24255e.get());
    }
}
