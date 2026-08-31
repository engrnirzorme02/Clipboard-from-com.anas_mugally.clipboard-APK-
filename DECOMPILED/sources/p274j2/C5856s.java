package p274j2;

import android.content.Context;
import java.util.concurrent.Executor;
import p138R5.InterfaceC1380a;
import p226d2.InterfaceC5216e;
import p234e2.InterfaceC5336b;
import p282k2.InterfaceC5994c;
import p282k2.InterfaceC5995d;
import p290l2.InterfaceC6294b;
import p298m2.InterfaceC6328a;

/* JADX INFO: renamed from: j2.s */
/* JADX INFO: loaded from: classes.dex */
public final class C5856s implements InterfaceC5336b {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1380a f23017a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC1380a f23018b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC1380a f23019c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC1380a f23020d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC1380a f23021e;

    /* JADX INFO: renamed from: f */
    private final InterfaceC1380a f23022f;

    /* JADX INFO: renamed from: g */
    private final InterfaceC1380a f23023g;

    /* JADX INFO: renamed from: h */
    private final InterfaceC1380a f23024h;

    /* JADX INFO: renamed from: i */
    private final InterfaceC1380a f23025i;

    public C5856s(InterfaceC1380a interfaceC1380a, InterfaceC1380a interfaceC1380a2, InterfaceC1380a interfaceC1380a3, InterfaceC1380a interfaceC1380a4, InterfaceC1380a interfaceC1380a5, InterfaceC1380a interfaceC1380a6, InterfaceC1380a interfaceC1380a7, InterfaceC1380a interfaceC1380a8, InterfaceC1380a interfaceC1380a9) {
        this.f23017a = interfaceC1380a;
        this.f23018b = interfaceC1380a2;
        this.f23019c = interfaceC1380a3;
        this.f23020d = interfaceC1380a4;
        this.f23021e = interfaceC1380a5;
        this.f23022f = interfaceC1380a6;
        this.f23023g = interfaceC1380a7;
        this.f23024h = interfaceC1380a8;
        this.f23025i = interfaceC1380a9;
    }

    /* JADX INFO: renamed from: a */
    public static C5856s m26267a(InterfaceC1380a interfaceC1380a, InterfaceC1380a interfaceC1380a2, InterfaceC1380a interfaceC1380a3, InterfaceC1380a interfaceC1380a4, InterfaceC1380a interfaceC1380a5, InterfaceC1380a interfaceC1380a6, InterfaceC1380a interfaceC1380a7, InterfaceC1380a interfaceC1380a8, InterfaceC1380a interfaceC1380a9) {
        return new C5856s(interfaceC1380a, interfaceC1380a2, interfaceC1380a3, interfaceC1380a4, interfaceC1380a5, interfaceC1380a6, interfaceC1380a7, interfaceC1380a8, interfaceC1380a9);
    }

    /* JADX INFO: renamed from: c */
    public static C5855r m26268c(Context context, InterfaceC5216e interfaceC5216e, InterfaceC5995d interfaceC5995d, InterfaceC5861x interfaceC5861x, Executor executor, InterfaceC6294b interfaceC6294b, InterfaceC6328a interfaceC6328a, InterfaceC6328a interfaceC6328a2, InterfaceC5994c interfaceC5994c) {
        return new C5855r(context, interfaceC5216e, interfaceC5995d, interfaceC5861x, executor, interfaceC6294b, interfaceC6328a, interfaceC6328a2, interfaceC5994c);
    }

    @Override // p138R5.InterfaceC1380a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C5855r get() {
        return m26268c((Context) this.f23017a.get(), (InterfaceC5216e) this.f23018b.get(), (InterfaceC5995d) this.f23019c.get(), (InterfaceC5861x) this.f23020d.get(), (Executor) this.f23021e.get(), (InterfaceC6294b) this.f23022f.get(), (InterfaceC6328a) this.f23023g.get(), (InterfaceC6328a) this.f23024h.get(), (InterfaceC5994c) this.f23025i.get());
    }
}
