package p126Q0;

import java.util.HashMap;
import java.util.Map;
import p112O0.AbstractC1097j;
import p112O0.InterfaceC1104q;
import p168W0.C1814p;

/* JADX INFO: renamed from: Q0.a */
/* JADX INFO: loaded from: classes.dex */
public class C1245a {

    /* JADX INFO: renamed from: d */
    static final String f4456d = AbstractC1097j.m4846f("DelayedWorkTracker");

    /* JADX INFO: renamed from: a */
    final C1246b f4457a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC1104q f4458b;

    /* JADX INFO: renamed from: c */
    private final Map f4459c = new HashMap();

    /* JADX INFO: renamed from: Q0.a$a */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C1814p f4460a;

        a(C1814p c1814p) {
            this.f4460a = c1814p;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC1097j.m4844c().mo4847a(C1245a.f4456d, String.format("Scheduling work %s", this.f4460a.f5892a), new Throwable[0]);
            C1245a.this.f4457a.mo5139a(this.f4460a);
        }
    }

    public C1245a(C1246b c1246b, InterfaceC1104q interfaceC1104q) {
        this.f4457a = c1246b;
        this.f4458b = interfaceC1104q;
    }

    /* JADX INFO: renamed from: a */
    public void m5489a(C1814p c1814p) {
        Runnable runnable = (Runnable) this.f4459c.remove(c1814p.f5892a);
        if (runnable != null) {
            this.f4458b.mo4860b(runnable);
        }
        a aVar = new a(c1814p);
        this.f4459c.put(c1814p.f5892a, aVar);
        this.f4458b.mo4859a(c1814p.m7532a() - System.currentTimeMillis(), aVar);
    }

    /* JADX INFO: renamed from: b */
    public void m5490b(String str) {
        Runnable runnable = (Runnable) this.f4459c.remove(str);
        if (runnable != null) {
            this.f4458b.mo4860b(runnable);
        }
    }
}
