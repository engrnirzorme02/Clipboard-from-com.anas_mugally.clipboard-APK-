package p274j2;

import java.util.concurrent.Executor;
import p138R5.InterfaceC1380a;
import p234e2.InterfaceC5336b;
import p282k2.InterfaceC5995d;
import p290l2.InterfaceC6294b;

/* JADX INFO: renamed from: j2.w */
/* JADX INFO: loaded from: classes.dex */
public final class C5860w implements InterfaceC5336b {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1380a f23032a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC1380a f23033b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC1380a f23034c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC1380a f23035d;

    public C5860w(InterfaceC1380a interfaceC1380a, InterfaceC1380a interfaceC1380a2, InterfaceC1380a interfaceC1380a3, InterfaceC1380a interfaceC1380a4) {
        this.f23032a = interfaceC1380a;
        this.f23033b = interfaceC1380a2;
        this.f23034c = interfaceC1380a3;
        this.f23035d = interfaceC1380a4;
    }

    /* JADX INFO: renamed from: a */
    public static C5860w m26273a(InterfaceC1380a interfaceC1380a, InterfaceC1380a interfaceC1380a2, InterfaceC1380a interfaceC1380a3, InterfaceC1380a interfaceC1380a4) {
        return new C5860w(interfaceC1380a, interfaceC1380a2, interfaceC1380a3, interfaceC1380a4);
    }

    /* JADX INFO: renamed from: c */
    public static C5859v m26274c(Executor executor, InterfaceC5995d interfaceC5995d, InterfaceC5861x interfaceC5861x, InterfaceC6294b interfaceC6294b) {
        return new C5859v(executor, interfaceC5995d, interfaceC5861x, interfaceC6294b);
    }

    @Override // p138R5.InterfaceC1380a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C5859v get() {
        return m26274c((Executor) this.f23032a.get(), (InterfaceC5995d) this.f23033b.get(), (InterfaceC5861x) this.f23034c.get(), (InterfaceC6294b) this.f23035d.get());
    }
}
