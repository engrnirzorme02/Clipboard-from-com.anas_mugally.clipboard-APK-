package p266i2;

import java.util.concurrent.Executor;
import java.util.logging.Logger;
import p198a2.InterfaceC2195k;
import p216c2.AbstractC2993i;
import p216c2.AbstractC3000p;
import p216c2.C3005u;
import p226d2.InterfaceC5216e;
import p226d2.InterfaceC5224m;
import p274j2.InterfaceC5861x;
import p282k2.InterfaceC5995d;
import p290l2.InterfaceC6294b;

/* JADX INFO: renamed from: i2.c */
/* JADX INFO: loaded from: classes.dex */
public class C5687c implements InterfaceC5689e {

    /* JADX INFO: renamed from: f */
    private static final Logger f21720f = Logger.getLogger(C3005u.class.getName());

    /* JADX INFO: renamed from: a */
    private final InterfaceC5861x f21721a;

    /* JADX INFO: renamed from: b */
    private final Executor f21722b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC5216e f21723c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC5995d f21724d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC6294b f21725e;

    public C5687c(Executor executor, InterfaceC5216e interfaceC5216e, InterfaceC5861x interfaceC5861x, InterfaceC5995d interfaceC5995d, InterfaceC6294b interfaceC6294b) {
        this.f21722b = executor;
        this.f21723c = interfaceC5216e;
        this.f21721a = interfaceC5861x;
        this.f21724d = interfaceC5995d;
        this.f21725e = interfaceC6294b;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Object m25236b(C5687c c5687c, AbstractC3000p abstractC3000p, AbstractC2993i abstractC2993i) {
        c5687c.f21724d.mo26977G(abstractC3000p, abstractC2993i);
        c5687c.f21721a.mo26239a(abstractC3000p, 1);
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m25237c(final C5687c c5687c, final AbstractC3000p abstractC3000p, InterfaceC2195k interfaceC2195k, AbstractC2993i abstractC2993i) {
        c5687c.getClass();
        try {
            InterfaceC5224m interfaceC5224mMo24128a = c5687c.f21723c.mo24128a(abstractC3000p.mo14929b());
            if (interfaceC5224mMo24128a == null) {
                String str = String.format("Transport backend '%s' is not registered", abstractC3000p.mo14929b());
                f21720f.warning(str);
                interfaceC2195k.mo8934a(new IllegalArgumentException(str));
            } else {
                final AbstractC2993i abstractC2993iMo17160a = interfaceC5224mMo24128a.mo17160a(abstractC2993i);
                c5687c.f21725e.mo26984m(new InterfaceC6294b.a() { // from class: i2.b
                    @Override // p290l2.InterfaceC6294b.a
                    /* JADX INFO: renamed from: n */
                    public final Object mo25235n() {
                        return C5687c.m25236b(this.f21717a, abstractC3000p, abstractC2993iMo17160a);
                    }
                });
                interfaceC2195k.mo8934a(null);
            }
        } catch (Exception e7) {
            f21720f.warning("Error scheduling event " + e7.getMessage());
            interfaceC2195k.mo8934a(e7);
        }
    }

    @Override // p266i2.InterfaceC5689e
    /* JADX INFO: renamed from: a */
    public void mo25238a(final AbstractC3000p abstractC3000p, final AbstractC2993i abstractC2993i, final InterfaceC2195k interfaceC2195k) {
        this.f21722b.execute(new Runnable() { // from class: i2.a
            @Override // java.lang.Runnable
            public final void run() {
                C5687c.m25237c(this.f21713a, abstractC3000p, interfaceC2195k, abstractC2993i);
            }
        });
    }
}
