package p266i2;

import java.util.concurrent.Executor;
import p138R5.InterfaceC1380a;
import p226d2.InterfaceC5216e;
import p234e2.InterfaceC5336b;
import p274j2.InterfaceC5861x;
import p282k2.InterfaceC5995d;
import p290l2.InterfaceC6294b;

/* JADX INFO: renamed from: i2.d */
/* JADX INFO: loaded from: classes.dex */
public final class C5688d implements InterfaceC5336b {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1380a f21726a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC1380a f21727b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC1380a f21728c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC1380a f21729d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC1380a f21730e;

    public C5688d(InterfaceC1380a interfaceC1380a, InterfaceC1380a interfaceC1380a2, InterfaceC1380a interfaceC1380a3, InterfaceC1380a interfaceC1380a4, InterfaceC1380a interfaceC1380a5) {
        this.f21726a = interfaceC1380a;
        this.f21727b = interfaceC1380a2;
        this.f21728c = interfaceC1380a3;
        this.f21729d = interfaceC1380a4;
        this.f21730e = interfaceC1380a5;
    }

    /* JADX INFO: renamed from: a */
    public static C5688d m25239a(InterfaceC1380a interfaceC1380a, InterfaceC1380a interfaceC1380a2, InterfaceC1380a interfaceC1380a3, InterfaceC1380a interfaceC1380a4, InterfaceC1380a interfaceC1380a5) {
        return new C5688d(interfaceC1380a, interfaceC1380a2, interfaceC1380a3, interfaceC1380a4, interfaceC1380a5);
    }

    /* JADX INFO: renamed from: c */
    public static C5687c m25240c(Executor executor, InterfaceC5216e interfaceC5216e, InterfaceC5861x interfaceC5861x, InterfaceC5995d interfaceC5995d, InterfaceC6294b interfaceC6294b) {
        return new C5687c(executor, interfaceC5216e, interfaceC5861x, interfaceC5995d, interfaceC6294b);
    }

    @Override // p138R5.InterfaceC1380a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C5687c get() {
        return m25240c((Executor) this.f21726a.get(), (InterfaceC5216e) this.f21727b.get(), (InterfaceC5861x) this.f21728c.get(), (InterfaceC5995d) this.f21729d.get(), (InterfaceC6294b) this.f21730e.get());
    }
}
