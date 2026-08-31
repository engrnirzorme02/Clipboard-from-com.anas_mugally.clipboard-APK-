package p216c2;

import p138R5.InterfaceC1380a;
import p234e2.InterfaceC5336b;
import p266i2.InterfaceC5689e;
import p274j2.C5855r;
import p274j2.C5859v;
import p298m2.InterfaceC6328a;

/* JADX INFO: renamed from: c2.w */
/* JADX INFO: loaded from: classes.dex */
public final class C3007w implements InterfaceC5336b {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1380a f12426a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC1380a f12427b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC1380a f12428c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC1380a f12429d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC1380a f12430e;

    public C3007w(InterfaceC1380a interfaceC1380a, InterfaceC1380a interfaceC1380a2, InterfaceC1380a interfaceC1380a3, InterfaceC1380a interfaceC1380a4, InterfaceC1380a interfaceC1380a5) {
        this.f12426a = interfaceC1380a;
        this.f12427b = interfaceC1380a2;
        this.f12428c = interfaceC1380a3;
        this.f12429d = interfaceC1380a4;
        this.f12430e = interfaceC1380a5;
    }

    /* JADX INFO: renamed from: a */
    public static C3007w m14976a(InterfaceC1380a interfaceC1380a, InterfaceC1380a interfaceC1380a2, InterfaceC1380a interfaceC1380a3, InterfaceC1380a interfaceC1380a4, InterfaceC1380a interfaceC1380a5) {
        return new C3007w(interfaceC1380a, interfaceC1380a2, interfaceC1380a3, interfaceC1380a4, interfaceC1380a5);
    }

    /* JADX INFO: renamed from: c */
    public static C3005u m14977c(InterfaceC6328a interfaceC6328a, InterfaceC6328a interfaceC6328a2, InterfaceC5689e interfaceC5689e, C5855r c5855r, C5859v c5859v) {
        return new C3005u(interfaceC6328a, interfaceC6328a2, interfaceC5689e, c5855r, c5859v);
    }

    @Override // p138R5.InterfaceC1380a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3005u get() {
        return m14977c((InterfaceC6328a) this.f12426a.get(), (InterfaceC6328a) this.f12427b.get(), (InterfaceC5689e) this.f12428c.get(), (C5855r) this.f12429d.get(), (C5859v) this.f12430e.get());
    }
}
