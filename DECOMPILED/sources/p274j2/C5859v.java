package p274j2;

import java.util.Iterator;
import java.util.concurrent.Executor;
import p216c2.AbstractC3000p;
import p282k2.InterfaceC5995d;
import p290l2.InterfaceC6294b;

/* JADX INFO: renamed from: j2.v */
/* JADX INFO: loaded from: classes.dex */
public class C5859v {

    /* JADX INFO: renamed from: a */
    private final Executor f23028a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC5995d f23029b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC5861x f23030c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC6294b f23031d;

    C5859v(Executor executor, InterfaceC5995d interfaceC5995d, InterfaceC5861x interfaceC5861x, InterfaceC6294b interfaceC6294b) {
        this.f23028a = executor;
        this.f23029b = interfaceC5995d;
        this.f23030c = interfaceC5861x;
        this.f23031d = interfaceC6294b;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Object m26270a(C5859v c5859v) {
        Iterator it = c5859v.f23029b.mo26979L().iterator();
        while (it.hasNext()) {
            c5859v.f23030c.mo26239a((AbstractC3000p) it.next(), 1);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public void m26272c() {
        this.f23028a.execute(new Runnable() { // from class: j2.t
            @Override // java.lang.Runnable
            public final void run() {
                C5859v c5859v = this.f23026a;
                c5859v.f23031d.mo26984m(new InterfaceC6294b.a() { // from class: j2.u
                    @Override // p290l2.InterfaceC6294b.a
                    /* JADX INFO: renamed from: n */
                    public final Object mo25235n() {
                        return C5859v.m26270a(c5859v);
                    }
                });
            }
        });
    }
}
