package p374v4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p006A4.C0016a;
import p030D4.AbstractC0204h;
import p030D4.C0198b;
import p030D4.C0203g;
import p030D4.C0209m;
import p030D4.InterfaceC0210n;
import p398y4.AbstractC7551l;
import p398y4.InterfaceC7548i;

/* JADX INFO: renamed from: v4.E */
/* JADX INFO: loaded from: classes.dex */
public class C7234E {

    /* JADX INFO: renamed from: d */
    private static final InterfaceC7548i f28826d = new b();

    /* JADX INFO: renamed from: a */
    private C7236a f28827a = C7236a.m31930n();

    /* JADX INFO: renamed from: b */
    private List f28828b = new ArrayList();

    /* JADX INFO: renamed from: c */
    private Long f28829c = -1L;

    /* JADX INFO: renamed from: v4.E$a */
    class a implements InterfaceC7548i {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ boolean f28830b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ List f28831c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ C7245j f28832d;

        a(boolean z7, List list, C7245j c7245j) {
            this.f28830b = z7;
            this.f28831c = list;
            this.f28832d = c7245j;
        }

        @Override // p398y4.InterfaceC7548i
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean mo31917a(C7230A c7230a) {
            if ((c7230a.m31886f() || this.f28830b) && !this.f28831c.contains(Long.valueOf(c7230a.m31884d()))) {
                return c7230a.m31883c().m32002w(this.f28832d) || this.f28832d.m32002w(c7230a.m31883c());
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: v4.E$b */
    class b implements InterfaceC7548i {
        b() {
        }

        @Override // p398y4.InterfaceC7548i
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean mo31917a(C7230A c7230a) {
            return c7230a.m31886f();
        }
    }

    /* JADX INFO: renamed from: j */
    private static C7236a m31903j(List list, InterfaceC7548i interfaceC7548i, C7245j c7245j) {
        C7236a c7236aM31930n = C7236a.m31930n();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C7230A c7230a = (C7230A) it.next();
            if (interfaceC7548i.mo31917a(c7230a)) {
                C7245j c7245jM31883c = c7230a.m31883c();
                if (c7230a.m31885e()) {
                    if (c7245j.m32002w(c7245jM31883c)) {
                        c7236aM31930n = c7236aM31930n.m31935b(C7245j.m31990B(c7245j, c7245jM31883c), c7230a.m31882b());
                    } else if (c7245jM31883c.m32002w(c7245j)) {
                        c7236aM31930n = c7236aM31930n.m31935b(C7245j.m31994y(), c7230a.m31882b().mo1013r(C7245j.m31990B(c7245jM31883c, c7245j)));
                    }
                } else if (c7245j.m32002w(c7245jM31883c)) {
                    c7236aM31930n = c7236aM31930n.m31936e(C7245j.m31990B(c7245j, c7245jM31883c), c7230a.m31881a());
                } else if (c7245jM31883c.m32002w(c7245j)) {
                    C7245j c7245jM31990B = C7245j.m31990B(c7245jM31883c, c7245j);
                    if (c7245jM31990B.isEmpty()) {
                        c7236aM31930n = c7236aM31930n.m31936e(C7245j.m31994y(), c7230a.m31881a());
                    } else {
                        InterfaceC0210n interfaceC0210nM31941w = c7230a.m31881a().m31941w(c7245jM31990B);
                        if (interfaceC0210nM31941w != null) {
                            c7236aM31930n = c7236aM31930n.m31935b(C7245j.m31994y(), interfaceC0210nM31941w);
                        }
                    }
                }
            }
        }
        return c7236aM31930n;
    }

    /* JADX INFO: renamed from: k */
    private boolean m31904k(C7230A c7230a, C7245j c7245j) {
        if (c7230a.m31885e()) {
            return c7230a.m31883c().m32002w(c7245j);
        }
        Iterator it = c7230a.m31881a().iterator();
        while (it.hasNext()) {
            if (c7230a.m31883c().m32000q((C7245j) ((Map.Entry) it.next()).getKey()).m32002w(c7245j)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    private void m31905m() {
        this.f28827a = m31903j(this.f28828b, f28826d, C7245j.m31994y());
        if (this.f28828b.size() <= 0) {
            this.f28829c = -1L;
        } else {
            List list = this.f28828b;
            this.f28829c = Long.valueOf(((C7230A) list.get(list.size() - 1)).m31884d());
        }
    }

    /* JADX INFO: renamed from: a */
    public void m31906a(C7245j c7245j, C7236a c7236a, Long l7) {
        AbstractC7551l.m33233f(l7.longValue() > this.f28829c.longValue());
        this.f28828b.add(new C7230A(l7.longValue(), c7245j, c7236a));
        this.f28827a = this.f28827a.m31936e(c7245j, c7236a);
        this.f28829c = l7;
    }

    /* JADX INFO: renamed from: b */
    public void m31907b(C7245j c7245j, InterfaceC0210n interfaceC0210n, Long l7, boolean z7) {
        AbstractC7551l.m33233f(l7.longValue() > this.f28829c.longValue());
        this.f28828b.add(new C7230A(l7.longValue(), c7245j, interfaceC0210n, z7));
        if (z7) {
            this.f28827a = this.f28827a.m31935b(c7245j, interfaceC0210n);
        }
        this.f28829c = l7;
    }

    /* JADX INFO: renamed from: c */
    public InterfaceC0210n m31908c(C7245j c7245j, C0198b c0198b, C0016a c0016a) {
        C7245j c7245jM31999p = c7245j.m31999p(c0198b);
        InterfaceC0210n interfaceC0210nM31941w = this.f28827a.m31941w(c7245jM31999p);
        if (interfaceC0210nM31941w != null) {
            return interfaceC0210nM31941w;
        }
        if (c0016a.m86c(c0198b)) {
            return this.f28827a.m31938k(c7245jM31999p).m31937g(c0016a.m85b().mo1008l(c0198b));
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public InterfaceC0210n m31909d(C7245j c7245j, InterfaceC0210n interfaceC0210n, List list, boolean z7) {
        if (!list.isEmpty() || z7) {
            C7236a c7236aM31938k = this.f28827a.m31938k(c7245j);
            if (z7 || !c7236aM31938k.isEmpty()) {
                if (!z7 && interfaceC0210n == null && !c7236aM31938k.m31943y(C7245j.m31994y())) {
                    return null;
                }
                C7236a c7236aM31903j = m31903j(this.f28828b, new a(z7, list, c7245j), c7245j);
                if (interfaceC0210n == null) {
                    interfaceC0210n = C0203g.m1050w();
                }
                return c7236aM31903j.m31937g(interfaceC0210n);
            }
        } else {
            InterfaceC0210n interfaceC0210nM31941w = this.f28827a.m31941w(c7245j);
            if (interfaceC0210nM31941w != null) {
                return interfaceC0210nM31941w;
            }
            C7236a c7236aM31938k2 = this.f28827a.m31938k(c7245j);
            if (!c7236aM31938k2.isEmpty()) {
                if (interfaceC0210n == null && !c7236aM31938k2.m31943y(C7245j.m31994y())) {
                    return null;
                }
                if (interfaceC0210n == null) {
                    interfaceC0210n = C0203g.m1050w();
                }
                return c7236aM31938k2.m31937g(interfaceC0210n);
            }
        }
        return interfaceC0210n;
    }

    /* JADX INFO: renamed from: e */
    public InterfaceC0210n m31910e(C7245j c7245j, InterfaceC0210n interfaceC0210n) {
        InterfaceC0210n interfaceC0210nM1050w = C0203g.m1050w();
        InterfaceC0210n<C0209m> interfaceC0210nM31941w = this.f28827a.m31941w(c7245j);
        if (interfaceC0210nM31941w != null) {
            if (!interfaceC0210nM31941w.mo1000H()) {
                for (C0209m c0209m : interfaceC0210nM31941w) {
                    interfaceC0210nM1050w = interfaceC0210nM1050w.mo999E(c0209m.m1082c(), c0209m.m1083d());
                }
            }
            return interfaceC0210nM1050w;
        }
        C7236a c7236aM31938k = this.f28827a.m31938k(c7245j);
        Iterator it = interfaceC0210n.iterator();
        while (it.hasNext()) {
            C0209m c0209m2 = (C0209m) it.next();
            interfaceC0210nM1050w = interfaceC0210nM1050w.mo999E(c0209m2.m1082c(), c7236aM31938k.m31938k(new C7245j(c0209m2.m1082c())).m31937g(c0209m2.m1083d()));
        }
        for (C0209m c0209m3 : c7236aM31938k.m31940v()) {
            interfaceC0210nM1050w = interfaceC0210nM1050w.mo999E(c0209m3.m1082c(), c0209m3.m1083d());
        }
        return interfaceC0210nM1050w;
    }

    /* JADX INFO: renamed from: f */
    public InterfaceC0210n m31911f(C7245j c7245j, C7245j c7245j2, InterfaceC0210n interfaceC0210n, InterfaceC0210n interfaceC0210n2) {
        AbstractC7551l.m33234g((interfaceC0210n == null && interfaceC0210n2 == null) ? false : true, "Either existingEventSnap or existingServerSnap must exist");
        C7245j c7245jM32000q = c7245j.m32000q(c7245j2);
        if (this.f28827a.m31943y(c7245jM32000q)) {
            return null;
        }
        C7236a c7236aM31938k = this.f28827a.m31938k(c7245jM32000q);
        return c7236aM31938k.isEmpty() ? interfaceC0210n2.mo1013r(c7245j2) : c7236aM31938k.m31937g(interfaceC0210n2.mo1013r(c7245j2));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX INFO: renamed from: g */
    public C0209m m31912g(C7245j c7245j, InterfaceC0210n interfaceC0210n, C0209m c0209m, boolean z7, AbstractC0204h abstractC0204h) {
        C7236a c7236aM31938k = this.f28827a.m31938k(c7245j);
        InterfaceC0210n<C0209m> interfaceC0210nM31941w = c7236aM31938k.m31941w(C7245j.m31994y());
        C0209m c0209m2 = null;
        if (interfaceC0210nM31941w != null) {
            for (C0209m c0209m3 : interfaceC0210nM31941w) {
                if (abstractC0204h.m1053a(c0209m3, c0209m, z7) <= 0) {
                }
            }
        } else if (interfaceC0210n != null) {
            interfaceC0210nM31941w = c7236aM31938k.m31937g(interfaceC0210n);
            while (r3.hasNext()) {
                if (abstractC0204h.m1053a(c0209m3, c0209m, z7) <= 0 && (c0209m2 == null || abstractC0204h.m1053a(c0209m3, c0209m2, z7) < 0)) {
                    c0209m2 = c0209m3;
                }
            }
        }
        return c0209m2;
    }

    /* JADX INFO: renamed from: h */
    public C7235F m31913h(C7245j c7245j) {
        return new C7235F(c7245j, this);
    }

    /* JADX INFO: renamed from: i */
    public C7230A m31914i(long j7) {
        for (C7230A c7230a : this.f28828b) {
            if (c7230a.m31884d() == j7) {
                return c7230a;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public boolean m31915l(long j7) {
        C7230A c7230a;
        Iterator it = this.f28828b.iterator();
        int i7 = 0;
        while (true) {
            if (!it.hasNext()) {
                c7230a = null;
                break;
            }
            c7230a = (C7230A) it.next();
            if (c7230a.m31884d() == j7) {
                break;
            }
            i7++;
        }
        AbstractC7551l.m33234g(c7230a != null, "removeWrite called with nonexistent writeId");
        this.f28828b.remove(c7230a);
        boolean zM31886f = c7230a.m31886f();
        boolean z7 = false;
        for (int size = this.f28828b.size() - 1; zM31886f && size >= 0; size--) {
            C7230A c7230a2 = (C7230A) this.f28828b.get(size);
            if (c7230a2.m31886f()) {
                if (size >= i7 && m31904k(c7230a2, c7230a.m31883c())) {
                    zM31886f = false;
                } else if (c7230a.m31883c().m32002w(c7230a2.m31883c())) {
                    z7 = true;
                }
            }
        }
        if (!zM31886f) {
            return false;
        }
        if (z7) {
            m31905m();
            return true;
        }
        if (c7230a.m31885e()) {
            this.f28827a = this.f28827a.m31944z(c7230a.m31883c());
        } else {
            Iterator it2 = c7230a.m31881a().iterator();
            while (it2.hasNext()) {
                this.f28827a = this.f28827a.m31944z(c7230a.m31883c().m32000q((C7245j) ((Map.Entry) it2.next()).getKey()));
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: n */
    public InterfaceC0210n m31916n(C7245j c7245j) {
        return this.f28827a.m31941w(c7245j);
    }
}
