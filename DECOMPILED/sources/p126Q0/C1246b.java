package p126Q0;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.C2895a;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p112O0.AbstractC1097j;
import p112O0.EnumC1106s;
import p119P0.C1182i;
import p119P0.InterfaceC1175b;
import p119P0.InterfaceC1178e;
import p140S0.C1385d;
import p140S0.InterfaceC1384c;
import p168W0.C1814p;
import p175X0.AbstractC1932j;
import p182Y0.InterfaceC2010a;

/* JADX INFO: renamed from: Q0.b */
/* JADX INFO: loaded from: classes.dex */
public class C1246b implements InterfaceC1178e, InterfaceC1384c, InterfaceC1175b {

    /* JADX INFO: renamed from: t */
    private static final String f4462t = AbstractC1097j.m4846f("GreedyScheduler");

    /* JADX INFO: renamed from: a */
    private final Context f4463a;

    /* JADX INFO: renamed from: b */
    private final C1182i f4464b;

    /* JADX INFO: renamed from: c */
    private final C1385d f4465c;

    /* JADX INFO: renamed from: e */
    private C1245a f4467e;

    /* JADX INFO: renamed from: f */
    private boolean f4468f;

    /* JADX INFO: renamed from: s */
    Boolean f4470s;

    /* JADX INFO: renamed from: d */
    private final Set f4466d = new HashSet();

    /* JADX INFO: renamed from: r */
    private final Object f4469r = new Object();

    public C1246b(Context context, C2895a c2895a, InterfaceC2010a interfaceC2010a, C1182i c1182i) {
        this.f4463a = context;
        this.f4464b = c1182i;
        this.f4465c = new C1385d(context, interfaceC2010a, this);
        this.f4467e = new C1245a(this, c2895a.m14490k());
    }

    /* JADX INFO: renamed from: g */
    private void m5491g() {
        this.f4470s = Boolean.valueOf(AbstractC1932j.m7983b(this.f4463a, this.f4464b.m5169i()));
    }

    /* JADX INFO: renamed from: h */
    private void m5492h() {
        if (this.f4468f) {
            return;
        }
        this.f4464b.m5171m().m5129c(this);
        this.f4468f = true;
    }

    /* JADX INFO: renamed from: i */
    private void m5493i(String str) {
        synchronized (this.f4469r) {
            try {
                for (C1814p c1814p : this.f4466d) {
                    if (c1814p.f5892a.equals(str)) {
                        AbstractC1097j.m4844c().mo4847a(f4462t, String.format("Stopping tracking for %s", str), new Throwable[0]);
                        this.f4466d.remove(c1814p);
                        this.f4465c.m5957d(this.f4466d);
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p119P0.InterfaceC1178e
    /* JADX INFO: renamed from: a */
    public void mo5139a(C1814p... c1814pArr) {
        if (this.f4470s == null) {
            m5491g();
        }
        if (!this.f4470s.booleanValue()) {
            AbstractC1097j.m4844c().mo4849d(f4462t, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        m5492h();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (C1814p c1814p : c1814pArr) {
            long jM7532a = c1814p.m7532a();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (c1814p.f5893b == EnumC1106s.ENQUEUED) {
                if (jCurrentTimeMillis < jM7532a) {
                    C1245a c1245a = this.f4467e;
                    if (c1245a != null) {
                        c1245a.m5489a(c1814p);
                    }
                } else if (!c1814p.m7533b()) {
                    AbstractC1097j.m4844c().mo4847a(f4462t, String.format("Starting work for %s", c1814p.f5892a), new Throwable[0]);
                    this.f4464b.m5178u(c1814p.f5892a);
                } else if (c1814p.f5901j.m4818h()) {
                    AbstractC1097j.m4844c().mo4847a(f4462t, String.format("Ignoring WorkSpec %s, Requires device idle.", c1814p), new Throwable[0]);
                } else if (c1814p.f5901j.m4815e()) {
                    AbstractC1097j.m4844c().mo4847a(f4462t, String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", c1814p), new Throwable[0]);
                } else {
                    hashSet.add(c1814p);
                    hashSet2.add(c1814p.f5892a);
                }
            }
        }
        synchronized (this.f4469r) {
            try {
                if (!hashSet.isEmpty()) {
                    AbstractC1097j.m4844c().mo4847a(f4462t, String.format("Starting tracking for [%s]", TextUtils.join(",", hashSet2)), new Throwable[0]);
                    this.f4466d.addAll(hashSet);
                    this.f4465c.m5957d(this.f4466d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p140S0.InterfaceC1384c
    /* JADX INFO: renamed from: b */
    public void mo5494b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            AbstractC1097j.m4844c().mo4847a(f4462t, String.format("Constraints not met: Cancelling work ID %s", str), new Throwable[0]);
            this.f4464b.m5181x(str);
        }
    }

    @Override // p119P0.InterfaceC1178e
    /* JADX INFO: renamed from: c */
    public boolean mo5140c() {
        return false;
    }

    @Override // p119P0.InterfaceC1175b
    /* JADX INFO: renamed from: d */
    public void mo5123d(String str, boolean z7) {
        m5493i(str);
    }

    @Override // p119P0.InterfaceC1178e
    /* JADX INFO: renamed from: e */
    public void mo5141e(String str) {
        if (this.f4470s == null) {
            m5491g();
        }
        if (!this.f4470s.booleanValue()) {
            AbstractC1097j.m4844c().mo4849d(f4462t, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        m5492h();
        AbstractC1097j.m4844c().mo4847a(f4462t, String.format("Cancelling work ID %s", str), new Throwable[0]);
        C1245a c1245a = this.f4467e;
        if (c1245a != null) {
            c1245a.m5490b(str);
        }
        this.f4464b.m5181x(str);
    }

    @Override // p140S0.InterfaceC1384c
    /* JADX INFO: renamed from: f */
    public void mo5495f(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            AbstractC1097j.m4844c().mo4847a(f4462t, String.format("Constraints met: Scheduling work ID %s", str), new Throwable[0]);
            this.f4464b.m5178u(str);
        }
    }
}
