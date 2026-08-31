package p374v4;

import com.google.firebase.database.AbstractC4908e;
import com.google.firebase.database.AbstractC4910g;
import com.google.firebase.database.C4904a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import p006A4.C0016a;
import p006A4.C0018c;
import p006A4.C0019d;
import p006A4.C0024i;
import p006A4.C0025j;
import p006A4.InterfaceC0020e;
import p022C4.C0144c;
import p030D4.C0198b;
import p030D4.C0200d;
import p030D4.C0203g;
import p030D4.C0205i;
import p030D4.C0209m;
import p030D4.C0215s;
import p030D4.InterfaceC0210n;
import p334q4.C6834a;
import p350s4.InterfaceC7014h;
import p358t4.C7079a;
import p358t4.InterfaceC7085g;
import p382w4.AbstractC7356d;
import p382w4.C7353a;
import p382w4.C7354b;
import p382w4.C7355c;
import p382w4.C7357e;
import p382w4.C7358f;
import p390x4.InterfaceC7410e;
import p398y4.AbstractC7544e;
import p398y4.AbstractC7551l;
import p398y4.C7543d;
import p398y4.C7546g;
import p398y4.InterfaceC7540a;

/* JADX INFO: renamed from: v4.w */
/* JADX INFO: loaded from: classes.dex */
public class C7258w {

    /* JADX INFO: renamed from: f */
    private final r f28983f;

    /* JADX INFO: renamed from: g */
    private final InterfaceC7410e f28984g;

    /* JADX INFO: renamed from: h */
    private final C0144c f28985h;

    /* JADX INFO: renamed from: i */
    private long f28986i = 1;

    /* JADX INFO: renamed from: a */
    private C7543d f28978a = C7543d.m33187b();

    /* JADX INFO: renamed from: b */
    private final C7234E f28979b = new C7234E();

    /* JADX INFO: renamed from: c */
    private final Map f28980c = new HashMap();

    /* JADX INFO: renamed from: d */
    private final Map f28981d = new HashMap();

    /* JADX INFO: renamed from: e */
    private final Set f28982e = new HashSet();

    /* JADX INFO: renamed from: v4.w$a */
    class a implements Callable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C7259x f28987a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C7245j f28988b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Map f28989c;

        a(C7259x c7259x, C7245j c7245j, Map map) {
            this.f28987a = c7259x;
            this.f28988b = c7245j;
            this.f28989c = map;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            C0024i c0024iM32123Q = C7258w.this.m32123Q(this.f28987a);
            if (c0024iM32123Q == null) {
                return Collections.EMPTY_LIST;
            }
            C7245j c7245jM31990B = C7245j.m31990B(c0024iM32123Q.m138e(), this.f28988b);
            C7236a c7236aM31931p = C7236a.m31931p(this.f28989c);
            C7258w.this.f28984g.mo32747o(this.f28988b, c7236aM31931p);
            return C7258w.this.m32118C(c0024iM32123Q, new C7355c(C7357e.m32387a(c0024iM32123Q.m137d()), c7245jM31990B, c7236aM31931p));
        }
    }

    /* JADX INFO: renamed from: v4.w$b */
    class b implements Callable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C0024i f28991a;

        b(C0024i c0024i) {
            this.f28991a = c0024i;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            C7258w.this.f28984g.mo32744l(this.f28991a);
            return null;
        }
    }

    /* JADX INFO: renamed from: v4.w$c */
    class c implements Callable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AbstractC7243h f28993a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ boolean f28994b;

        c(AbstractC7243h abstractC7243h, boolean z7) {
            this.f28993a = abstractC7243h;
            this.f28994b = z7;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            C0016a c0016aMo32743k;
            InterfaceC0210n interfaceC0210nM32109d;
            C0024i c0024iMo31898d = this.f28993a.mo31898d();
            C7245j c7245jM138e = c0024iMo31898d.m138e();
            C7543d c7543dM33198p = C7258w.this.f28978a;
            InterfaceC0210n interfaceC0210nM32109d2 = null;
            C7245j c7245jM31996C = c7245jM138e;
            boolean z7 = false;
            while (!c7543dM33198p.isEmpty()) {
                C7256u c7256u = (C7256u) c7543dM33198p.getValue();
                if (c7256u != null) {
                    if (interfaceC0210nM32109d2 == null) {
                        interfaceC0210nM32109d2 = c7256u.m32109d(c7245jM31996C);
                    }
                    z7 = z7 || c7256u.m32113h();
                }
                c7543dM33198p = c7543dM33198p.m33198p(c7245jM31996C.isEmpty() ? C0198b.m988j("") : c7245jM31996C.m32004z());
                c7245jM31996C = c7245jM31996C.m31996C();
            }
            C7256u c7256u2 = (C7256u) C7258w.this.f28978a.m33197n(c7245jM138e);
            if (c7256u2 == null) {
                c7256u2 = new C7256u(C7258w.this.f28984g);
                C7258w c7258w = C7258w.this;
                c7258w.f28978a = c7258w.f28978a.m33204z(c7245jM138e, c7256u2);
            } else {
                z7 = z7 || c7256u2.m32113h();
                if (interfaceC0210nM32109d2 == null) {
                    interfaceC0210nM32109d2 = c7256u2.m32109d(C7245j.m31994y());
                }
            }
            C7258w.this.f28984g.mo32744l(c0024iMo31898d);
            if (interfaceC0210nM32109d2 != null) {
                c0016aMo32743k = new C0016a(C0205i.m1062e(interfaceC0210nM32109d2, c0024iMo31898d.m136c()), true, false);
            } else {
                c0016aMo32743k = C7258w.this.f28984g.mo32743k(c0024iMo31898d);
                if (!c0016aMo32743k.m89f()) {
                    InterfaceC0210n interfaceC0210nM1050w = C0203g.m1050w();
                    for (Map.Entry entry : C7258w.this.f28978a.m33190B(c7245jM138e).m33199q()) {
                        C7256u c7256u3 = (C7256u) ((C7543d) entry.getValue()).getValue();
                        if (c7256u3 != null && (interfaceC0210nM32109d = c7256u3.m32109d(C7245j.m31994y())) != null) {
                            interfaceC0210nM1050w = interfaceC0210nM1050w.mo999E((C0198b) entry.getKey(), interfaceC0210nM32109d);
                        }
                    }
                    for (C0209m c0209m : c0016aMo32743k.m85b()) {
                        if (!interfaceC0210nM1050w.mo1003R(c0209m.m1082c())) {
                            interfaceC0210nM1050w = interfaceC0210nM1050w.mo999E(c0209m.m1082c(), c0209m.m1083d());
                        }
                    }
                    c0016aMo32743k = new C0016a(C0205i.m1062e(interfaceC0210nM1050w, c0024iMo31898d.m136c()), false, false);
                }
            }
            boolean zM32116k = c7256u2.m32116k(c0024iMo31898d);
            if (!zM32116k && !c0024iMo31898d.m140g()) {
                AbstractC7551l.m33234g(!C7258w.this.f28981d.containsKey(c0024iMo31898d), "View does not exist but we have a tag");
                C7259x c7259xM32121L = C7258w.this.m32121L();
                C7258w.this.f28981d.put(c0024iMo31898d, c7259xM32121L);
                C7258w.this.f28980c.put(c7259xM32121L, c0024iMo31898d);
            }
            List listM32107a = c7256u2.m32107a(this.f28993a, C7258w.this.f28979b.m31913h(c7245jM138e), c0016aMo32743k);
            if (!zM32116k && !z7 && !this.f28994b) {
                C7258w.this.m32126X(c0024iMo31898d, c7256u2.m32117l(c0024iMo31898d));
            }
            return listM32107a;
        }
    }

    /* JADX INFO: renamed from: v4.w$d */
    class d implements Callable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C0024i f28996a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ AbstractC7243h f28997b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ C6834a f28998c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ boolean f28999d;

        d(C0024i c0024i, AbstractC7243h abstractC7243h, C6834a c6834a, boolean z7) {
            this.f28996a = c0024i;
            this.f28997b = abstractC7243h;
            this.f28998c = c6834a;
            this.f28999d = z7;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            boolean z7;
            C7245j c7245jM138e = this.f28996a.m138e();
            C7256u c7256u = (C7256u) C7258w.this.f28978a.m33197n(c7245jM138e);
            List arrayList = new ArrayList();
            if (c7256u != null && (this.f28996a.m139f() || c7256u.m32116k(this.f28996a))) {
                C7546g c7546gM32115j = c7256u.m32115j(this.f28996a, this.f28997b, this.f28998c);
                if (c7256u.m32114i()) {
                    C7258w c7258w = C7258w.this;
                    c7258w.f28978a = c7258w.f28978a.m33202x(c7245jM138e);
                }
                List<C0024i> list = (List) c7546gM32115j.m33211a();
                arrayList = (List) c7546gM32115j.m33212b();
                Iterator it = list.iterator();
                loop0: while (true) {
                    while (true) {
                        if (!it.hasNext()) {
                            break loop0;
                        }
                        C0024i c0024i = (C0024i) it.next();
                        C7258w.this.f28984g.mo32742j(this.f28996a);
                        z7 = z7 || c0024i.m140g();
                    }
                }
                if (this.f28999d) {
                    return null;
                }
                C7543d c7543dM33198p = C7258w.this.f28978a;
                boolean z8 = c7543dM33198p.getValue() != null && ((C7256u) c7543dM33198p.getValue()).m32113h();
                Iterator it2 = c7245jM138e.iterator();
                while (it2.hasNext()) {
                    c7543dM33198p = c7543dM33198p.m33198p((C0198b) it2.next());
                    z8 = z8 || (c7543dM33198p.getValue() != null && ((C7256u) c7543dM33198p.getValue()).m32113h());
                    if (z8 || c7543dM33198p.isEmpty()) {
                        break;
                    }
                }
                if (z7 && !z8) {
                    C7543d c7543dM33190B = C7258w.this.f28978a.m33190B(c7245jM138e);
                    if (!c7543dM33190B.isEmpty()) {
                        for (C0025j c0025j : C7258w.this.m32119J(c7543dM33190B)) {
                            q qVar = C7258w.this.new q(c0025j);
                            C7258w.this.f28983f.mo32061a(C7258w.this.m32122P(c0025j.m148h()), qVar.f29041b, qVar, qVar);
                        }
                    }
                }
                if (!z8 && !list.isEmpty() && this.f28998c == null) {
                    if (z7) {
                        C7258w.this.f28983f.mo32062b(C7258w.this.m32122P(this.f28996a), null);
                    } else {
                        for (C0024i c0024i2 : list) {
                            C7259x c7259xM32163Y = C7258w.this.m32163Y(c0024i2);
                            AbstractC7551l.m33233f(c7259xM32163Y != null);
                            C7258w.this.f28983f.mo32062b(C7258w.this.m32122P(c0024i2), c7259xM32163Y);
                        }
                    }
                }
                C7258w.this.m32125V(list);
            }
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: v4.w$e */
    class e implements C7543d.c {
        e() {
        }

        @Override // p398y4.C7543d.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void mo30316a(C7245j c7245j, C7256u c7256u, Void r7) {
            if (!c7245j.isEmpty() && c7256u.m32113h()) {
                C0024i c0024iM148h = c7256u.m32110e().m148h();
                C7258w.this.f28983f.mo32062b(C7258w.this.m32122P(c0024iM148h), C7258w.this.m32163Y(c0024iM148h));
                return null;
            }
            Iterator it = c7256u.m32111f().iterator();
            while (it.hasNext()) {
                C0024i c0024iM148h2 = ((C0025j) it.next()).m148h();
                C7258w.this.f28983f.mo32062b(C7258w.this.m32122P(c0024iM148h2), C7258w.this.m32163Y(c0024iM148h2));
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: v4.w$f */
    class f extends InterfaceC7014h.b {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC0210n f29002a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C7235F f29003b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ AbstractC7356d f29004c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ List f29005d;

        f(InterfaceC0210n interfaceC0210n, C7235F c7235f, AbstractC7356d abstractC7356d, List list) {
            this.f29002a = interfaceC0210n;
            this.f29003b = c7235f;
            this.f29004c = abstractC7356d;
            this.f29005d = list;
        }

        @Override // p350s4.InterfaceC7014h.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo1017a(C0198b c0198b, C7543d c7543d) {
            InterfaceC0210n interfaceC0210n = this.f29002a;
            InterfaceC0210n interfaceC0210nMo1008l = interfaceC0210n != null ? interfaceC0210n.mo1008l(c0198b) : null;
            C7235F c7235fM31927h = this.f29003b.m31927h(c0198b);
            AbstractC7356d abstractC7356dMo32379d = this.f29004c.mo32379d(c0198b);
            if (abstractC7356dMo32379d != null) {
                this.f29005d.addAll(C7258w.this.m32145v(abstractC7356dMo32379d, c7543d, interfaceC0210nMo1008l, c7235fM31927h));
            }
        }
    }

    /* JADX INFO: renamed from: v4.w$g */
    class g implements Callable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ boolean f29007a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C7245j f29008b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ InterfaceC0210n f29009c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ long f29010d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ InterfaceC0210n f29011e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ boolean f29012f;

        g(boolean z7, C7245j c7245j, InterfaceC0210n interfaceC0210n, long j7, InterfaceC0210n interfaceC0210n2, boolean z8) {
            this.f29007a = z7;
            this.f29008b = c7245j;
            this.f29009c = interfaceC0210n;
            this.f29010d = j7;
            this.f29011e = interfaceC0210n2;
            this.f29012f = z8;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            if (this.f29007a) {
                C7258w.this.f28984g.mo32735b(this.f29008b, this.f29009c, this.f29010d);
            }
            C7258w.this.f28979b.m31907b(this.f29008b, this.f29011e, Long.valueOf(this.f29010d), this.f29012f);
            return !this.f29012f ? Collections.EMPTY_LIST : C7258w.this.m32147x(new C7358f(C7357e.f29313d, this.f29008b, this.f29011e));
        }
    }

    /* JADX INFO: renamed from: v4.w$h */
    class h implements Callable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ boolean f29014a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C7245j f29015b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ C7236a f29016c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ long f29017d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ C7236a f29018e;

        h(boolean z7, C7245j c7245j, C7236a c7236a, long j7, C7236a c7236a2) {
            this.f29014a = z7;
            this.f29015b = c7245j;
            this.f29016c = c7236a;
            this.f29017d = j7;
            this.f29018e = c7236a2;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            if (this.f29014a) {
                C7258w.this.f28984g.mo32736d(this.f29015b, this.f29016c, this.f29017d);
            }
            C7258w.this.f28979b.m31906a(this.f29015b, this.f29018e, Long.valueOf(this.f29017d));
            return C7258w.this.m32147x(new C7355c(C7357e.f29313d, this.f29015b, this.f29018e));
        }
    }

    /* JADX INFO: renamed from: v4.w$i */
    class i implements Callable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ boolean f29020a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ long f29021b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ boolean f29022c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ InterfaceC7540a f29023d;

        i(boolean z7, long j7, boolean z8, InterfaceC7540a interfaceC7540a) {
            this.f29020a = z7;
            this.f29021b = j7;
            this.f29022c = z8;
            this.f29023d = interfaceC7540a;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            if (this.f29020a) {
                C7258w.this.f28984g.mo32734a(this.f29021b);
            }
            C7230A c7230aM31914i = C7258w.this.f28979b.m31914i(this.f29021b);
            boolean zM31915l = C7258w.this.f28979b.m31915l(this.f29021b);
            if (c7230aM31914i.m31886f() && !this.f29022c) {
                Map mapM32092c = AbstractC7253r.m32092c(this.f29023d);
                if (c7230aM31914i.m31885e()) {
                    C7258w.this.f28984g.mo32745m(c7230aM31914i.m31883c(), AbstractC7253r.m32097h(c7230aM31914i.m31882b(), C7258w.this, c7230aM31914i.m31883c(), mapM32092c));
                } else {
                    C7258w.this.f28984g.mo32746n(c7230aM31914i.m31883c(), AbstractC7253r.m32095f(c7230aM31914i.m31881a(), C7258w.this, c7230aM31914i.m31883c(), mapM32092c));
                }
            }
            if (!zM31915l) {
                return Collections.EMPTY_LIST;
            }
            C7543d c7543dM33187b = C7543d.m33187b();
            if (c7230aM31914i.m31885e()) {
                c7543dM33187b = c7543dM33187b.m33204z(C7245j.m31994y(), Boolean.TRUE);
            } else {
                Iterator it = c7230aM31914i.m31881a().iterator();
                while (it.hasNext()) {
                    c7543dM33187b = c7543dM33187b.m33204z((C7245j) ((Map.Entry) it.next()).getKey(), Boolean.TRUE);
                }
            }
            return C7258w.this.m32147x(new C7353a(c7230aM31914i.m31883c(), c7543dM33187b, this.f29022c));
        }
    }

    /* JADX INFO: renamed from: v4.w$j */
    class j implements Callable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C7245j f29025a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC0210n f29026b;

        j(C7245j c7245j, InterfaceC0210n interfaceC0210n) {
            this.f29025a = c7245j;
            this.f29026b = interfaceC0210n;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            C7258w.this.f28984g.mo32739g(C0024i.m134a(this.f29025a), this.f29026b);
            return C7258w.this.m32147x(new C7358f(C7357e.f29314e, this.f29025a, this.f29026b));
        }
    }

    /* JADX INFO: renamed from: v4.w$k */
    class k implements Callable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Map f29028a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C7245j f29029b;

        k(Map map, C7245j c7245j) {
            this.f29028a = map;
            this.f29029b = c7245j;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            C7236a c7236aM31931p = C7236a.m31931p(this.f29028a);
            C7258w.this.f28984g.mo32747o(this.f29029b, c7236aM31931p);
            return C7258w.this.m32147x(new C7355c(C7357e.f29314e, this.f29029b, c7236aM31931p));
        }
    }

    /* JADX INFO: renamed from: v4.w$l */
    class l implements Callable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C7245j f29031a;

        l(C7245j c7245j) {
            this.f29031a = c7245j;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            C7258w.this.f28984g.mo32748p(C0024i.m134a(this.f29031a));
            return C7258w.this.m32147x(new C7354b(C7357e.f29314e, this.f29031a));
        }
    }

    /* JADX INFO: renamed from: v4.w$m */
    class m implements Callable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C7259x f29033a;

        m(C7259x c7259x) {
            this.f29033a = c7259x;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            C0024i c0024iM32123Q = C7258w.this.m32123Q(this.f29033a);
            if (c0024iM32123Q == null) {
                return Collections.EMPTY_LIST;
            }
            C7258w.this.f28984g.mo32748p(c0024iM32123Q);
            return C7258w.this.m32118C(c0024iM32123Q, new C7354b(C7357e.m32387a(c0024iM32123Q.m137d()), C7245j.m31994y()));
        }
    }

    /* JADX INFO: renamed from: v4.w$n */
    class n implements Callable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C7259x f29035a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C7245j f29036b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ InterfaceC0210n f29037c;

        n(C7259x c7259x, C7245j c7245j, InterfaceC0210n interfaceC0210n) {
            this.f29035a = c7259x;
            this.f29036b = c7245j;
            this.f29037c = interfaceC0210n;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            C0024i c0024iM32123Q = C7258w.this.m32123Q(this.f29035a);
            if (c0024iM32123Q == null) {
                return Collections.EMPTY_LIST;
            }
            C7245j c7245jM31990B = C7245j.m31990B(c0024iM32123Q.m138e(), this.f29036b);
            C7258w.this.f28984g.mo32739g(c7245jM31990B.isEmpty() ? c0024iM32123Q : C0024i.m134a(this.f29036b), this.f29037c);
            return C7258w.this.m32118C(c0024iM32123Q, new C7358f(C7357e.m32387a(c0024iM32123Q.m137d()), c7245jM31990B, this.f29037c));
        }
    }

    /* JADX INFO: renamed from: v4.w$o */
    public interface o {
        /* JADX INFO: renamed from: c */
        List mo32183c(C6834a c6834a);
    }

    /* JADX INFO: renamed from: v4.w$p */
    private static class p extends AbstractC7243h {

        /* JADX INFO: renamed from: c */
        private C0024i f29039c;

        public p(C0024i c0024i) {
            this.f29039c = c0024i;
        }

        @Override // p374v4.AbstractC7243h
        /* JADX INFO: renamed from: a */
        public C0019d mo31895a(C0018c c0018c, C0024i c0024i) {
            return null;
        }

        @Override // p374v4.AbstractC7243h
        /* JADX INFO: renamed from: b */
        public void mo31896b(C6834a c6834a) {
        }

        @Override // p374v4.AbstractC7243h
        /* JADX INFO: renamed from: c */
        public void mo31897c(C0019d c0019d) {
        }

        @Override // p374v4.AbstractC7243h
        /* JADX INFO: renamed from: d */
        public C0024i mo31898d() {
            return this.f29039c;
        }

        @Override // p374v4.AbstractC7243h
        /* JADX INFO: renamed from: e */
        public boolean mo31899e(AbstractC7243h abstractC7243h) {
            return abstractC7243h instanceof p;
        }

        public boolean equals(Object obj) {
            return (obj instanceof p) && ((p) obj).f29039c.equals(this.f29039c);
        }

        @Override // p374v4.AbstractC7243h
        /* JADX INFO: renamed from: g */
        public boolean mo31900g(InterfaceC0020e.a aVar) {
            return false;
        }

        public int hashCode() {
            return this.f29039c.hashCode();
        }
    }

    /* JADX INFO: renamed from: v4.w$q */
    private class q implements InterfaceC7085g, o {

        /* JADX INFO: renamed from: a */
        private final C0025j f29040a;

        /* JADX INFO: renamed from: b */
        private final C7259x f29041b;

        public q(C0025j c0025j) {
            this.f29040a = c0025j;
            this.f29041b = C7258w.this.m32163Y(c0025j.m148h());
        }

        @Override // p358t4.InterfaceC7085g
        /* JADX INFO: renamed from: a */
        public C7079a mo31239a() {
            C0200d c0200dM1023b = C0200d.m1023b(this.f29040a.m149i());
            List listM1027e = c0200dM1023b.m1027e();
            ArrayList arrayList = new ArrayList(listM1027e.size());
            Iterator it = listM1027e.iterator();
            while (it.hasNext()) {
                arrayList.add(((C7245j) it.next()).m31998n());
            }
            return new C7079a(arrayList, c0200dM1023b.m1026d());
        }

        @Override // p358t4.InterfaceC7085g
        /* JADX INFO: renamed from: b */
        public boolean mo31240b() {
            return AbstractC7544e.m33208b(this.f29040a.m149i()) > 1024;
        }

        @Override // p374v4.C7258w.o
        /* JADX INFO: renamed from: c */
        public List mo32183c(C6834a c6834a) {
            if (c6834a == null) {
                C0024i c0024iM148h = this.f29040a.m148h();
                C7259x c7259x = this.f29041b;
                return c7259x != null ? C7258w.this.m32149B(c7259x) : C7258w.this.m32166u(c0024iM148h.m138e());
            }
            C7258w.this.f28985h.m628i("Listen at " + this.f29040a.m148h().m138e() + " failed: " + c6834a.toString());
            return C7258w.this.m32159R(this.f29040a.m148h(), c6834a);
        }

        @Override // p358t4.InterfaceC7085g
        /* JADX INFO: renamed from: d */
        public String mo31241d() {
            return this.f29040a.m149i().mo1004S();
        }
    }

    /* JADX INFO: renamed from: v4.w$r */
    public interface r {
        /* JADX INFO: renamed from: a */
        void mo32061a(C0024i c0024i, C7259x c7259x, InterfaceC7085g interfaceC7085g, o oVar);

        /* JADX INFO: renamed from: b */
        void mo32062b(C0024i c0024i, C7259x c7259x);
    }

    public C7258w(AbstractC7241f abstractC7241f, InterfaceC7410e interfaceC7410e, r rVar) {
        this.f28983f = rVar;
        this.f28984g = interfaceC7410e;
        this.f28985h = abstractC7241f.m31972q("SyncTree");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public List m32118C(C0024i c0024i, AbstractC7356d abstractC7356d) {
        C7245j c7245jM138e = c0024i.m138e();
        C7256u c7256u = (C7256u) this.f28978a.m33197n(c7245jM138e);
        AbstractC7551l.m33234g(c7256u != null, "Missing sync point for query tag that we're tracking");
        return c7256u.m32108b(abstractC7356d, this.f28979b.m31913h(c7245jM138e), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public List m32119J(C7543d c7543d) {
        ArrayList arrayList = new ArrayList();
        m32120K(c7543d, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: K */
    private void m32120K(C7543d c7543d, List list) {
        C7256u c7256u = (C7256u) c7543d.getValue();
        if (c7256u != null && c7256u.m32113h()) {
            list.add(c7256u.m32110e());
            return;
        }
        if (c7256u != null) {
            list.addAll(c7256u.m32111f());
        }
        Iterator it = c7543d.m33199q().iterator();
        while (it.hasNext()) {
            m32120K((C7543d) ((Map.Entry) it.next()).getValue(), list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public C7259x m32121L() {
        long j7 = this.f28986i;
        this.f28986i = 1 + j7;
        return new C7259x(j7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public C0024i m32122P(C0024i c0024i) {
        return (!c0024i.m140g() || c0024i.m139f()) ? c0024i : C0024i.m134a(c0024i.m138e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public C0024i m32123Q(C7259x c7259x) {
        return (C0024i) this.f28980c.get(c7259x);
    }

    /* JADX INFO: renamed from: S */
    private List m32124S(C0024i c0024i, AbstractC7243h abstractC7243h, C6834a c6834a, boolean z7) {
        return (List) this.f28984g.mo32741i(new d(c0024i, abstractC7243h, c6834a, z7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public void m32125V(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0024i c0024i = (C0024i) it.next();
            if (!c0024i.m140g()) {
                C7259x c7259xM32163Y = m32163Y(c0024i);
                AbstractC7551l.m33233f(c7259xM32163Y != null);
                this.f28981d.remove(c0024i);
                this.f28980c.remove(c7259xM32163Y);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public void m32126X(C0024i c0024i, C0025j c0025j) {
        C7245j c7245jM138e = c0024i.m138e();
        C7259x c7259xM32163Y = m32163Y(c0024i);
        q qVar = new q(c0025j);
        this.f28983f.mo32061a(m32122P(c0024i), c7259xM32163Y, qVar, qVar);
        C7543d c7543dM33190B = this.f28978a.m33190B(c7245jM138e);
        if (c7259xM32163Y != null) {
            AbstractC7551l.m33234g(!((C7256u) c7543dM33190B.getValue()).m32113h(), "If we're adding a query, it shouldn't be shadowed");
        } else {
            c7543dM33190B.m33196m(new e());
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ InterfaceC0210n m32127a(C7258w c7258w, C0024i c0024i) {
        c7258w.getClass();
        C7245j c7245jM138e = c0024i.m138e();
        C7543d c7543dM33198p = c7258w.f28978a;
        InterfaceC0210n interfaceC0210nM32109d = null;
        C7245j c7245jM31996C = c7245jM138e;
        boolean z7 = false;
        while (true) {
            if (c7543dM33198p.isEmpty()) {
                break;
            }
            C7256u c7256u = (C7256u) c7543dM33198p.getValue();
            if (c7256u != null) {
                if (interfaceC0210nM32109d == null) {
                    interfaceC0210nM32109d = c7256u.m32109d(c7245jM31996C);
                }
                z7 = z7 || c7256u.m32113h();
            }
            c7543dM33198p = c7543dM33198p.m33198p(c7245jM31996C.isEmpty() ? C0198b.m988j("") : c7245jM31996C.m32004z());
            c7245jM31996C = c7245jM31996C.m31996C();
        }
        C7256u c7256u2 = (C7256u) c7258w.f28978a.m33197n(c7245jM138e);
        if (c7256u2 == null) {
            c7256u2 = new C7256u(c7258w.f28984g);
            c7258w.f28978a = c7258w.f28978a.m33204z(c7245jM138e, c7256u2);
        } else if (interfaceC0210nM32109d == null) {
            interfaceC0210nM32109d = c7256u2.m32109d(C7245j.m31994y());
        }
        return c7256u2.m32112g(c0024i, c7258w.f28979b.m31913h(c7245jM138e), new C0016a(C0205i.m1062e(interfaceC0210nM32109d != null ? interfaceC0210nM32109d : C0203g.m1050w(), c0024i.m136c()), interfaceC0210nM32109d != null, false)).m144d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public List m32145v(AbstractC7356d abstractC7356d, C7543d c7543d, InterfaceC0210n interfaceC0210n, C7235F c7235f) {
        C7256u c7256u = (C7256u) c7543d.getValue();
        if (interfaceC0210n == null && c7256u != null) {
            interfaceC0210n = c7256u.m32109d(C7245j.m31994y());
        }
        InterfaceC0210n interfaceC0210n2 = interfaceC0210n;
        ArrayList arrayList = new ArrayList();
        c7543d.m33199q().mo30604m(new f(interfaceC0210n2, c7235f, abstractC7356d, arrayList));
        if (c7256u != null) {
            arrayList.addAll(c7256u.m32108b(abstractC7356d, c7235f, interfaceC0210n2));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: w */
    private List m32146w(AbstractC7356d abstractC7356d, C7543d c7543d, InterfaceC0210n interfaceC0210n, C7235F c7235f) {
        if (abstractC7356d.m32383a().isEmpty()) {
            return m32145v(abstractC7356d, c7543d, interfaceC0210n, c7235f);
        }
        C7256u c7256u = (C7256u) c7543d.getValue();
        if (interfaceC0210n == null && c7256u != null) {
            interfaceC0210n = c7256u.m32109d(C7245j.m31994y());
        }
        ArrayList arrayList = new ArrayList();
        C0198b c0198bM32004z = abstractC7356d.m32383a().m32004z();
        AbstractC7356d abstractC7356dMo32379d = abstractC7356d.mo32379d(c0198bM32004z);
        C7543d c7543d2 = (C7543d) c7543d.m33199q().mo30599b(c0198bM32004z);
        if (c7543d2 != null && abstractC7356dMo32379d != null) {
            arrayList.addAll(m32146w(abstractC7356dMo32379d, c7543d2, interfaceC0210n != null ? interfaceC0210n.mo1008l(c0198bM32004z) : null, c7235f.m31927h(c0198bM32004z)));
        }
        if (c7256u != null) {
            arrayList.addAll(c7256u.m32108b(abstractC7356d, c7235f, interfaceC0210n));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public List m32147x(AbstractC7356d abstractC7356d) {
        return m32146w(abstractC7356d, this.f28978a, null, this.f28979b.m31913h(C7245j.m31994y()));
    }

    /* JADX INFO: renamed from: A */
    public List m32148A(C7245j c7245j, List list) {
        C0025j c0025jM32110e;
        C7256u c7256u = (C7256u) this.f28978a.m33197n(c7245j);
        if (c7256u != null && (c0025jM32110e = c7256u.m32110e()) != null) {
            InterfaceC0210n interfaceC0210nM149i = c0025jM32110e.m149i();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                interfaceC0210nM149i = ((C0215s) it.next()).m1096a(interfaceC0210nM149i);
            }
            return m32168z(c7245j, interfaceC0210nM149i);
        }
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: B */
    public List m32149B(C7259x c7259x) {
        return (List) this.f28984g.mo32741i(new m(c7259x));
    }

    /* JADX INFO: renamed from: D */
    public List m32150D(C7245j c7245j, Map map, C7259x c7259x) {
        return (List) this.f28984g.mo32741i(new a(c7259x, c7245j, map));
    }

    /* JADX INFO: renamed from: E */
    public List m32151E(C7245j c7245j, InterfaceC0210n interfaceC0210n, C7259x c7259x) {
        return (List) this.f28984g.mo32741i(new n(c7259x, c7245j, interfaceC0210n));
    }

    /* JADX INFO: renamed from: F */
    public List m32152F(C7245j c7245j, List list, C7259x c7259x) {
        C0024i c0024iM32123Q = m32123Q(c7259x);
        if (c0024iM32123Q == null) {
            return Collections.EMPTY_LIST;
        }
        AbstractC7551l.m33233f(c7245j.equals(c0024iM32123Q.m138e()));
        C7256u c7256u = (C7256u) this.f28978a.m33197n(c0024iM32123Q.m138e());
        AbstractC7551l.m33234g(c7256u != null, "Missing sync point for query tag that we're tracking");
        C0025j c0025jM32117l = c7256u.m32117l(c0024iM32123Q);
        AbstractC7551l.m33234g(c0025jM32117l != null, "Missing view for query tag that we're tracking");
        InterfaceC0210n interfaceC0210nM149i = c0025jM32117l.m149i();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            interfaceC0210nM149i = ((C0215s) it.next()).m1096a(interfaceC0210nM149i);
        }
        return m32151E(c7245j, interfaceC0210nM149i, c7259x);
    }

    /* JADX INFO: renamed from: G */
    public List m32153G(C7245j c7245j, C7236a c7236a, C7236a c7236a2, long j7, boolean z7) {
        return (List) this.f28984g.mo32741i(new h(z7, c7245j, c7236a, j7, c7236a2));
    }

    /* JADX INFO: renamed from: H */
    public List m32154H(C7245j c7245j, InterfaceC0210n interfaceC0210n, InterfaceC0210n interfaceC0210n2, long j7, boolean z7, boolean z8) {
        AbstractC7551l.m33234g(z7 || !z8, "We shouldn't be persisting non-visible writes.");
        return (List) this.f28984g.mo32741i(new g(z8, c7245j, interfaceC0210n, j7, interfaceC0210n2, z7));
    }

    /* JADX INFO: renamed from: I */
    public InterfaceC0210n m32155I(C7245j c7245j, List list) {
        C7543d c7543dM33198p = this.f28978a;
        C7245j c7245jM31994y = C7245j.m31994y();
        InterfaceC0210n interfaceC0210nM32109d = null;
        C7245j c7245jM31996C = c7245j;
        do {
            C0198b c0198bM32004z = c7245jM31996C.m32004z();
            c7245jM31996C = c7245jM31996C.m31996C();
            c7245jM31994y = c7245jM31994y.m31999p(c0198bM32004z);
            C7245j c7245jM31990B = C7245j.m31990B(c7245jM31994y, c7245j);
            c7543dM33198p = c0198bM32004z != null ? c7543dM33198p.m33198p(c0198bM32004z) : C7543d.m33187b();
            C7256u c7256u = (C7256u) c7543dM33198p.getValue();
            if (c7256u != null) {
                interfaceC0210nM32109d = c7256u.m32109d(c7245jM31990B);
            }
            if (c7245jM31996C.isEmpty()) {
                break;
            }
        } while (interfaceC0210nM32109d == null);
        return this.f28979b.m31909d(c7245j, interfaceC0210nM32109d, list, true);
    }

    /* JADX INFO: renamed from: M */
    public InterfaceC0210n m32156M(final C0024i c0024i) {
        return (InterfaceC0210n) this.f28984g.mo32741i(new Callable() { // from class: v4.v
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C7258w.m32127a(this.f28976a, c0024i);
            }
        });
    }

    /* JADX INFO: renamed from: N */
    public void m32157N(C0024i c0024i, boolean z7, boolean z8) {
        if (z7 && !this.f28982e.contains(c0024i)) {
            m32165t(new p(c0024i), z8);
            this.f28982e.add(c0024i);
        } else {
            if (z7 || !this.f28982e.contains(c0024i)) {
                return;
            }
            m32161U(new p(c0024i), z8);
            this.f28982e.remove(c0024i);
        }
    }

    /* JADX INFO: renamed from: O */
    public C4904a m32158O(AbstractC4910g abstractC4910g) {
        return AbstractC4908e.m22119a(abstractC4910g.m22126c(), this.f28984g.mo32743k(abstractC4910g.m22127d()).m84a());
    }

    /* JADX INFO: renamed from: R */
    public List m32159R(C0024i c0024i, C6834a c6834a) {
        return m32124S(c0024i, null, c6834a, false);
    }

    /* JADX INFO: renamed from: T */
    public List m32160T(AbstractC7243h abstractC7243h) {
        return m32124S(abstractC7243h.mo31898d(), abstractC7243h, null, false);
    }

    /* JADX INFO: renamed from: U */
    public List m32161U(AbstractC7243h abstractC7243h, boolean z7) {
        return m32124S(abstractC7243h.mo31898d(), abstractC7243h, null, z7);
    }

    /* JADX INFO: renamed from: W */
    public void m32162W(C0024i c0024i) {
        this.f28984g.mo32741i(new b(c0024i));
    }

    /* JADX INFO: renamed from: Y */
    public C7259x m32163Y(C0024i c0024i) {
        return (C7259x) this.f28981d.get(c0024i);
    }

    /* JADX INFO: renamed from: s */
    public List m32164s(long j7, boolean z7, boolean z8, InterfaceC7540a interfaceC7540a) {
        return (List) this.f28984g.mo32741i(new i(z8, j7, z7, interfaceC7540a));
    }

    /* JADX INFO: renamed from: t */
    public List m32165t(AbstractC7243h abstractC7243h, boolean z7) {
        return (List) this.f28984g.mo32741i(new c(abstractC7243h, z7));
    }

    /* JADX INFO: renamed from: u */
    public List m32166u(C7245j c7245j) {
        return (List) this.f28984g.mo32741i(new l(c7245j));
    }

    /* JADX INFO: renamed from: y */
    public List m32167y(C7245j c7245j, Map map) {
        return (List) this.f28984g.mo32741i(new k(map, c7245j));
    }

    /* JADX INFO: renamed from: z */
    public List m32168z(C7245j c7245j, InterfaceC0210n interfaceC0210n) {
        return (List) this.f28984g.mo32741i(new j(c7245j, interfaceC0210n));
    }
}
