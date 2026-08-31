package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import java.util.Collections;
import java.util.List;
import p112O0.AbstractC1097j;
import p119P0.InterfaceC1175b;
import p140S0.C1385d;
import p140S0.InterfaceC1384c;
import p168W0.C1814p;
import p175X0.AbstractC1936n;
import p175X0.C1940r;

/* JADX INFO: renamed from: androidx.work.impl.background.systemalarm.d */
/* JADX INFO: loaded from: classes.dex */
public class C2905d implements InterfaceC1384c, InterfaceC1175b, C1940r.b {

    /* JADX INFO: renamed from: u */
    private static final String f11926u = AbstractC1097j.m4846f("DelayMetCommandHandler");

    /* JADX INFO: renamed from: a */
    private final Context f11927a;

    /* JADX INFO: renamed from: b */
    private final int f11928b;

    /* JADX INFO: renamed from: c */
    private final String f11929c;

    /* JADX INFO: renamed from: d */
    private final C2906e f11930d;

    /* JADX INFO: renamed from: e */
    private final C1385d f11931e;

    /* JADX INFO: renamed from: s */
    private PowerManager.WakeLock f11934s;

    /* JADX INFO: renamed from: t */
    private boolean f11935t = false;

    /* JADX INFO: renamed from: r */
    private int f11933r = 0;

    /* JADX INFO: renamed from: f */
    private final Object f11932f = new Object();

    C2905d(Context context, int i7, String str, C2906e c2906e) {
        this.f11927a = context;
        this.f11928b = i7;
        this.f11930d = c2906e;
        this.f11929c = str;
        this.f11931e = new C1385d(context, c2906e.m14574f(), this);
    }

    /* JADX INFO: renamed from: c */
    private void m14565c() {
        synchronized (this.f11932f) {
            try {
                this.f11931e.m5958e();
                this.f11930d.m14576h().m7991c(this.f11929c);
                PowerManager.WakeLock wakeLock = this.f11934s;
                if (wakeLock != null && wakeLock.isHeld()) {
                    AbstractC1097j.m4844c().mo4847a(f11926u, String.format("Releasing wakelock %s for WorkSpec %s", this.f11934s, this.f11929c), new Throwable[0]);
                    this.f11934s.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    private void m14566g() {
        synchronized (this.f11932f) {
            try {
                if (this.f11933r < 2) {
                    this.f11933r = 2;
                    AbstractC1097j abstractC1097jM4844c = AbstractC1097j.m4844c();
                    String str = f11926u;
                    abstractC1097jM4844c.mo4847a(str, String.format("Stopping work for WorkSpec %s", this.f11929c), new Throwable[0]);
                    Intent intentM14554f = C2903b.m14554f(this.f11927a, this.f11929c);
                    C2906e c2906e = this.f11930d;
                    c2906e.m14578k(new C2906e.b(c2906e, intentM14554f, this.f11928b));
                    if (this.f11930d.m14573e().m5131g(this.f11929c)) {
                        AbstractC1097j.m4844c().mo4847a(str, String.format("WorkSpec %s needs to be rescheduled", this.f11929c), new Throwable[0]);
                        Intent intentM14553e = C2903b.m14553e(this.f11927a, this.f11929c);
                        C2906e c2906e2 = this.f11930d;
                        c2906e2.m14578k(new C2906e.b(c2906e2, intentM14553e, this.f11928b));
                    } else {
                        AbstractC1097j.m4844c().mo4847a(str, String.format("Processor does not have WorkSpec %s. No need to reschedule ", this.f11929c), new Throwable[0]);
                    }
                } else {
                    AbstractC1097j.m4844c().mo4847a(f11926u, String.format("Already stopped work for %s", this.f11929c), new Throwable[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p175X0.C1940r.b
    /* JADX INFO: renamed from: a */
    public void mo7992a(String str) {
        AbstractC1097j.m4844c().mo4847a(f11926u, String.format("Exceeded time limits on execution for %s", str), new Throwable[0]);
        m14566g();
    }

    @Override // p140S0.InterfaceC1384c
    /* JADX INFO: renamed from: b */
    public void mo5494b(List list) {
        m14566g();
    }

    @Override // p119P0.InterfaceC1175b
    /* JADX INFO: renamed from: d */
    public void mo5123d(String str, boolean z7) {
        AbstractC1097j.m4844c().mo4847a(f11926u, String.format("onExecuted %s, %s", str, Boolean.valueOf(z7)), new Throwable[0]);
        m14565c();
        if (z7) {
            Intent intentM14553e = C2903b.m14553e(this.f11927a, this.f11929c);
            C2906e c2906e = this.f11930d;
            c2906e.m14578k(new C2906e.b(c2906e, intentM14553e, this.f11928b));
        }
        if (this.f11935t) {
            Intent intentM14550a = C2903b.m14550a(this.f11927a);
            C2906e c2906e2 = this.f11930d;
            c2906e2.m14578k(new C2906e.b(c2906e2, intentM14550a, this.f11928b));
        }
    }

    /* JADX INFO: renamed from: e */
    void m14567e() {
        this.f11934s = AbstractC1936n.m7987b(this.f11927a, String.format("%s (%s)", this.f11929c, Integer.valueOf(this.f11928b)));
        AbstractC1097j abstractC1097jM4844c = AbstractC1097j.m4844c();
        String str = f11926u;
        abstractC1097jM4844c.mo4847a(str, String.format("Acquiring wakelock %s for WorkSpec %s", this.f11934s, this.f11929c), new Throwable[0]);
        this.f11934s.acquire();
        C1814p c1814pMo7550n = this.f11930d.m14575g().m5173o().mo14518K().mo7550n(this.f11929c);
        if (c1814pMo7550n == null) {
            m14566g();
            return;
        }
        boolean zM7533b = c1814pMo7550n.m7533b();
        this.f11935t = zM7533b;
        if (zM7533b) {
            this.f11931e.m5957d(Collections.singletonList(c1814pMo7550n));
        } else {
            AbstractC1097j.m4844c().mo4847a(str, String.format("No constraints for %s", this.f11929c), new Throwable[0]);
            mo5495f(Collections.singletonList(this.f11929c));
        }
    }

    @Override // p140S0.InterfaceC1384c
    /* JADX INFO: renamed from: f */
    public void mo5495f(List list) {
        if (list.contains(this.f11929c)) {
            synchronized (this.f11932f) {
                try {
                    if (this.f11933r == 0) {
                        this.f11933r = 1;
                        AbstractC1097j.m4844c().mo4847a(f11926u, String.format("onAllConstraintsMet for %s", this.f11929c), new Throwable[0]);
                        if (this.f11930d.m14573e().m5134j(this.f11929c)) {
                            this.f11930d.m14576h().m7990b(this.f11929c, 600000L, this);
                        } else {
                            m14565c();
                        }
                    } else {
                        AbstractC1097j.m4844c().mo4847a(f11926u, String.format("Already started work for %s", this.f11929c), new Throwable[0]);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
