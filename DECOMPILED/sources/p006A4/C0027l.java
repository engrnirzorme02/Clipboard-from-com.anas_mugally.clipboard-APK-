package p006A4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p014B4.C0086a;
import p014B4.InterfaceC0089d;
import p030D4.AbstractC0204h;
import p030D4.C0198b;
import p030D4.C0199c;
import p030D4.C0203g;
import p030D4.C0205i;
import p030D4.C0206j;
import p030D4.C0209m;
import p030D4.InterfaceC0210n;
import p374v4.C7235F;
import p374v4.C7236a;
import p374v4.C7245j;
import p382w4.AbstractC7356d;
import p382w4.C7353a;
import p382w4.C7355c;
import p382w4.C7358f;
import p398y4.AbstractC7551l;
import p398y4.C7543d;

/* JADX INFO: renamed from: A4.l */
/* JADX INFO: loaded from: classes.dex */
public class C0027l {

    /* JADX INFO: renamed from: b */
    private static InterfaceC0089d.a f143b = new a();

    /* JADX INFO: renamed from: a */
    private final InterfaceC0089d f144a;

    /* JADX INFO: renamed from: A4.l$a */
    class a implements InterfaceC0089d.a {
        a() {
        }

        @Override // p014B4.InterfaceC0089d.a
        /* JADX INFO: renamed from: a */
        public C0209m mo169a(AbstractC0204h abstractC0204h, C0209m c0209m, boolean z7) {
            return null;
        }

        @Override // p014B4.InterfaceC0089d.a
        /* JADX INFO: renamed from: b */
        public InterfaceC0210n mo170b(C0198b c0198b) {
            return null;
        }
    }

    /* JADX INFO: renamed from: A4.l$b */
    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f145a;

        static {
            int[] iArr = new int[AbstractC7356d.a.values().length];
            f145a = iArr;
            try {
                iArr[AbstractC7356d.a.Overwrite.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f145a[AbstractC7356d.a.Merge.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f145a[AbstractC7356d.a.AckUserWrite.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f145a[AbstractC7356d.a.ListenComplete.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: A4.l$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        public final C0026k f146a;

        /* JADX INFO: renamed from: b */
        public final List f147b;

        public c(C0026k c0026k, List list) {
            this.f146a = c0026k;
            this.f147b = list;
        }
    }

    /* JADX INFO: renamed from: A4.l$d */
    private static class d implements InterfaceC0089d.a {

        /* JADX INFO: renamed from: a */
        private final C7235F f148a;

        /* JADX INFO: renamed from: b */
        private final C0026k f149b;

        /* JADX INFO: renamed from: c */
        private final InterfaceC0210n f150c;

        public d(C7235F c7235f, C0026k c0026k, InterfaceC0210n interfaceC0210n) {
            this.f148a = c7235f;
            this.f149b = c0026k;
            this.f150c = interfaceC0210n;
        }

        @Override // p014B4.InterfaceC0089d.a
        /* JADX INFO: renamed from: a */
        public C0209m mo169a(AbstractC0204h abstractC0204h, C0209m c0209m, boolean z7) {
            InterfaceC0210n interfaceC0210nM153b = this.f150c;
            if (interfaceC0210nM153b == null) {
                interfaceC0210nM153b = this.f149b.m153b();
            }
            return this.f148a.m31926g(interfaceC0210nM153b, c0209m, z7, abstractC0204h);
        }

        @Override // p014B4.InterfaceC0089d.a
        /* JADX INFO: renamed from: b */
        public InterfaceC0210n mo170b(C0198b c0198b) {
            C0016a c0016aM154c = this.f149b.m154c();
            if (c0016aM154c.m86c(c0198b)) {
                return c0016aM154c.m85b().mo1008l(c0198b);
            }
            InterfaceC0210n interfaceC0210n = this.f150c;
            return this.f148a.m31920a(c0198b, interfaceC0210n != null ? new C0016a(C0205i.m1062e(interfaceC0210n, C0206j.m1071j()), true, false) : this.f149b.m155d());
        }
    }

    public C0027l(InterfaceC0089d interfaceC0089d) {
        this.f144a = interfaceC0089d;
    }

    /* JADX INFO: renamed from: a */
    private C0026k m158a(C0026k c0026k, C7245j c7245j, C7543d c7543d, C7235F c7235f, InterfaceC0210n interfaceC0210n, C0086a c0086a) {
        if (c7235f.m31928i(c7245j) != null) {
            return c0026k;
        }
        boolean zM88e = c0026k.m155d().m88e();
        C0016a c0016aM155d = c0026k.m155d();
        if (c7543d.getValue() == null) {
            C7236a c7236aM31930n = C7236a.m31930n();
            Iterator it = c7543d.iterator();
            while (true) {
                C7236a c7236a = c7236aM31930n;
                while (it.hasNext()) {
                    C7245j c7245j2 = (C7245j) ((Map.Entry) it.next()).getKey();
                    C7245j c7245jM32000q = c7245j.m32000q(c7245j2);
                    if (c0016aM155d.m87d(c7245jM32000q)) {
                        c7236aM31930n = c7236a.m31935b(c7245j2, c0016aM155d.m85b().mo1013r(c7245jM32000q));
                    }
                }
                return m159c(c0026k, c7245j, c7236a, c7235f, interfaceC0210n, zM88e, c0086a);
            }
        }
        if ((c7245j.isEmpty() && c0016aM155d.m89f()) || c0016aM155d.m87d(c7245j)) {
            return m160d(c0026k, c7245j, c0016aM155d.m85b().mo1013r(c7245j), c7235f, interfaceC0210n, zM88e, c0086a);
        }
        if (!c7245j.isEmpty()) {
            return c0026k;
        }
        C7236a c7236aM31930n2 = C7236a.m31930n();
        C7236a c7236aM31934a = c7236aM31930n2;
        for (C0209m c0209m : c0016aM155d.m85b()) {
            c7236aM31934a = c7236aM31934a.m31934a(c0209m.m1082c(), c0209m.m1083d());
        }
        return m159c(c0026k, c7245j, c7236aM31934a, c7235f, interfaceC0210n, zM88e, c0086a);
    }

    /* JADX INFO: renamed from: c */
    private C0026k m159c(C0026k c0026k, C7245j c7245j, C7236a c7236a, C7235F c7235f, InterfaceC0210n interfaceC0210n, boolean z7, C0086a c0086a) {
        if (c0026k.m155d().m85b().isEmpty() && !c0026k.m155d().m89f()) {
            return c0026k;
        }
        AbstractC7551l.m33234g(c7236a.m31933A() == null, "Can't have a merge that is an overwrite");
        C7236a c7236aM31936e = c7245j.isEmpty() ? c7236a : C7236a.m31930n().m31936e(c7245j, c7236a);
        InterfaceC0210n interfaceC0210nM85b = c0026k.m155d().m85b();
        Map mapM31939m = c7236aM31936e.m31939m();
        C0026k c0026kM160d = c0026k;
        for (Map.Entry entry : mapM31939m.entrySet()) {
            C0198b c0198b = (C0198b) entry.getKey();
            if (interfaceC0210nM85b.mo1003R(c0198b)) {
                c0026kM160d = m160d(c0026kM160d, new C7245j(c0198b), ((C7236a) entry.getValue()).m31937g(interfaceC0210nM85b.mo1008l(c0198b)), c7235f, interfaceC0210n, z7, c0086a);
            }
        }
        C0026k c0026kM160d2 = c0026kM160d;
        for (Map.Entry entry2 : mapM31939m.entrySet()) {
            C0198b c0198b2 = (C0198b) entry2.getKey();
            boolean z8 = !c0026k.m155d().m86c(c0198b2) && ((C7236a) entry2.getValue()).m31933A() == null;
            if (!interfaceC0210nM85b.mo1003R(c0198b2) && !z8) {
                c0026kM160d2 = m160d(c0026kM160d2, new C7245j(c0198b2), ((C7236a) entry2.getValue()).m31937g(interfaceC0210nM85b.mo1008l(c0198b2)), c7235f, interfaceC0210n, z7, c0086a);
            }
        }
        return c0026kM160d2;
    }

    /* JADX INFO: renamed from: d */
    private C0026k m160d(C0026k c0026k, C7245j c7245j, InterfaceC0210n interfaceC0210n, C7235F c7235f, InterfaceC0210n interfaceC0210n2, boolean z7, C0086a c0086a) {
        C0205i c0205iMo303f;
        C0016a c0016aM155d = c0026k.m155d();
        InterfaceC0089d interfaceC0089dMo301d = this.f144a;
        if (!z7) {
            interfaceC0089dMo301d = interfaceC0089dMo301d.mo301d();
        }
        InterfaceC0089d interfaceC0089d = interfaceC0089dMo301d;
        boolean z8 = true;
        if (c7245j.isEmpty()) {
            c0205iMo303f = interfaceC0089d.mo304g(c0016aM155d.m84a(), C0205i.m1062e(interfaceC0210n, interfaceC0089d.mo300c()), null);
        } else if (!interfaceC0089d.mo302e() || c0016aM155d.m88e()) {
            C0198b c0198bM32004z = c7245j.m32004z();
            if (!c0016aM155d.m87d(c7245j) && c7245j.size() > 1) {
                return c0026k;
            }
            C7245j c7245jM31996C = c7245j.m31996C();
            InterfaceC0210n interfaceC0210nMo1015u = c0016aM155d.m85b().mo1008l(c0198bM32004z).mo1015u(c7245jM31996C, interfaceC0210n);
            c0205iMo303f = c0198bM32004z.m996q() ? interfaceC0089d.mo303f(c0016aM155d.m84a(), interfaceC0210nMo1015u) : interfaceC0089d.mo305h(c0016aM155d.m84a(), c0198bM32004z, interfaceC0210nMo1015u, c7245jM31996C, f143b, null);
        } else {
            AbstractC7551l.m33234g(!c7245j.isEmpty(), "An empty path should have been caught in the other branch");
            C0198b c0198bM32004z2 = c7245j.m32004z();
            c0205iMo303f = interfaceC0089d.mo304g(c0016aM155d.m84a(), c0016aM155d.m84a().m1069p(c0198bM32004z2, c0016aM155d.m85b().mo1008l(c0198bM32004z2).mo1015u(c7245j.m31996C(), interfaceC0210n)), null);
        }
        if (!c0016aM155d.m89f() && !c7245j.isEmpty()) {
            z8 = false;
        }
        C0026k c0026kM157f = c0026k.m157f(c0205iMo303f, z8, interfaceC0089d.mo302e());
        return m164h(c0026kM157f, c7245j, c7235f, new d(c7235f, c0026kM157f, interfaceC0210n2), c0086a);
    }

    /* JADX INFO: renamed from: e */
    private C0026k m161e(C0026k c0026k, C7245j c7245j, C7236a c7236a, C7235F c7235f, InterfaceC0210n interfaceC0210n, C0086a c0086a) {
        AbstractC7551l.m33234g(c7236a.m31933A() == null, "Can't have a merge that is an overwrite");
        Iterator it = c7236a.iterator();
        C0026k c0026kM162f = c0026k;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            C7245j c7245jM32000q = c7245j.m32000q((C7245j) entry.getKey());
            if (m163g(c0026k, c7245jM32000q.m32004z())) {
                c0026kM162f = m162f(c0026kM162f, c7245jM32000q, (InterfaceC0210n) entry.getValue(), c7235f, interfaceC0210n, c0086a);
            }
        }
        Iterator it2 = c7236a.iterator();
        C0026k c0026kM162f2 = c0026kM162f;
        while (it2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it2.next();
            C7245j c7245jM32000q2 = c7245j.m32000q((C7245j) entry2.getKey());
            if (!m163g(c0026k, c7245jM32000q2.m32004z())) {
                c0026kM162f2 = m162f(c0026kM162f2, c7245jM32000q2, (InterfaceC0210n) entry2.getValue(), c7235f, interfaceC0210n, c0086a);
            }
        }
        return c0026kM162f2;
    }

    /* JADX INFO: renamed from: f */
    private C0026k m162f(C0026k c0026k, C7245j c7245j, InterfaceC0210n interfaceC0210n, C7235F c7235f, InterfaceC0210n interfaceC0210n2, C0086a c0086a) {
        InterfaceC0210n interfaceC0210n3;
        C0016a c0016aM154c = c0026k.m154c();
        d dVar = new d(c7235f, c0026k, interfaceC0210n2);
        if (c7245j.isEmpty()) {
            return c0026k.m156e(this.f144a.mo304g(c0026k.m154c().m84a(), C0205i.m1062e(interfaceC0210n, this.f144a.mo300c()), c0086a), true, this.f144a.mo302e());
        }
        C0198b c0198bM32004z = c7245j.m32004z();
        if (c0198bM32004z.m996q()) {
            return c0026k.m156e(this.f144a.mo303f(c0026k.m154c().m84a(), interfaceC0210n), c0016aM154c.m89f(), c0016aM154c.m88e());
        }
        C7245j c7245jM31996C = c7245j.m31996C();
        InterfaceC0210n interfaceC0210nMo1008l = c0016aM154c.m85b().mo1008l(c0198bM32004z);
        if (c7245jM31996C.isEmpty()) {
            interfaceC0210n3 = interfaceC0210n;
        } else {
            InterfaceC0210n interfaceC0210nMo170b = dVar.mo170b(c0198bM32004z);
            if (interfaceC0210nMo170b == null) {
                interfaceC0210n = C0203g.m1050w();
            } else if (c7245jM31996C.m32003x().m996q() && interfaceC0210nMo170b.mo1013r(c7245jM31996C.m31995A()).isEmpty()) {
                interfaceC0210n3 = interfaceC0210nMo170b;
            } else {
                interfaceC0210n = interfaceC0210nMo170b.mo1015u(c7245jM31996C, interfaceC0210n);
            }
            interfaceC0210n3 = interfaceC0210n;
        }
        return !interfaceC0210nMo1008l.equals(interfaceC0210n3) ? c0026k.m156e(this.f144a.mo305h(c0016aM154c.m84a(), c0198bM32004z, interfaceC0210n3, c7245jM31996C, dVar, c0086a), c0016aM154c.m89f(), this.f144a.mo302e()) : c0026k;
    }

    /* JADX INFO: renamed from: g */
    private static boolean m163g(C0026k c0026k, C0198b c0198b) {
        return c0026k.m154c().m86c(c0198b);
    }

    /* JADX INFO: renamed from: h */
    private C0026k m164h(C0026k c0026k, C7245j c7245j, C7235F c7235f, InterfaceC0089d.a aVar, C0086a c0086a) {
        InterfaceC0210n interfaceC0210nM31920a;
        C0205i c0205iMo305h;
        InterfaceC0210n interfaceC0210nM31921b;
        C0016a c0016aM154c = c0026k.m154c();
        if (c7235f.m31928i(c7245j) != null) {
            return c0026k;
        }
        if (c7245j.isEmpty()) {
            AbstractC7551l.m33234g(c0026k.m155d().m89f(), "If change path is empty, we must have complete server data");
            if (c0026k.m155d().m88e()) {
                InterfaceC0210n interfaceC0210nM153b = c0026k.m153b();
                if (!(interfaceC0210nM153b instanceof C0199c)) {
                    interfaceC0210nM153b = C0203g.m1050w();
                }
                interfaceC0210nM31921b = c7235f.m31924e(interfaceC0210nM153b);
            } else {
                interfaceC0210nM31921b = c7235f.m31921b(c0026k.m153b());
            }
            c0205iMo305h = this.f144a.mo304g(c0026k.m154c().m84a(), C0205i.m1062e(interfaceC0210nM31921b, this.f144a.mo300c()), c0086a);
        } else {
            C0198b c0198bM32004z = c7245j.m32004z();
            if (c0198bM32004z.m996q()) {
                AbstractC7551l.m33234g(c7245j.size() == 1, "Can't have a priority with additional path components");
                InterfaceC0210n interfaceC0210nM31925f = c7235f.m31925f(c7245j, c0016aM154c.m85b(), c0026k.m155d().m85b());
                c0205iMo305h = interfaceC0210nM31925f != null ? this.f144a.mo303f(c0016aM154c.m84a(), interfaceC0210nM31925f) : c0016aM154c.m84a();
            } else {
                C7245j c7245jM31996C = c7245j.m31996C();
                if (c0016aM154c.m86c(c0198bM32004z)) {
                    InterfaceC0210n interfaceC0210nM31925f2 = c7235f.m31925f(c7245j, c0016aM154c.m85b(), c0026k.m155d().m85b());
                    interfaceC0210nM31920a = interfaceC0210nM31925f2 != null ? c0016aM154c.m85b().mo1008l(c0198bM32004z).mo1015u(c7245jM31996C, interfaceC0210nM31925f2) : c0016aM154c.m85b().mo1008l(c0198bM32004z);
                } else {
                    interfaceC0210nM31920a = c7235f.m31920a(c0198bM32004z, c0026k.m155d());
                }
                InterfaceC0210n interfaceC0210n = interfaceC0210nM31920a;
                c0205iMo305h = interfaceC0210n != null ? this.f144a.mo305h(c0016aM154c.m84a(), c0198bM32004z, interfaceC0210n, c7245jM31996C, aVar, c0086a) : c0016aM154c.m84a();
            }
        }
        return c0026k.m156e(c0205iMo305h, c0016aM154c.m89f() || c7245j.isEmpty(), this.f144a.mo302e());
    }

    /* JADX INFO: renamed from: i */
    private C0026k m165i(C0026k c0026k, C7245j c7245j, C7235F c7235f, InterfaceC0210n interfaceC0210n, C0086a c0086a) {
        C0016a c0016aM155d = c0026k.m155d();
        return m164h(c0026k.m157f(c0016aM155d.m84a(), c0016aM155d.m89f() || c7245j.isEmpty(), c0016aM155d.m88e()), c7245j, c7235f, f143b, c0086a);
    }

    /* JADX INFO: renamed from: j */
    private void m166j(C0026k c0026k, C0026k c0026k2, List list) {
        C0016a c0016aM154c = c0026k2.m154c();
        if (c0016aM154c.m89f()) {
            boolean z7 = c0016aM154c.m85b().mo1000H() || c0016aM154c.m85b().isEmpty();
            if (list.isEmpty() && c0026k.m154c().m89f() && ((!z7 || c0016aM154c.m85b().equals(c0026k.m152a())) && c0016aM154c.m85b().mo1006i().equals(c0026k.m152a().mo1006i()))) {
                return;
            }
            list.add(C0018c.m99m(c0016aM154c.m84a()));
        }
    }

    /* JADX INFO: renamed from: b */
    public c m167b(C0026k c0026k, AbstractC7356d abstractC7356d, C7235F c7235f, InterfaceC0210n interfaceC0210n) {
        C0086a c0086a;
        C0026k c0026k2;
        C0026k c0026kM160d;
        C0086a c0086a2 = new C0086a();
        int i7 = b.f145a[abstractC7356d.m32385c().ordinal()];
        boolean z7 = false;
        if (i7 == 1) {
            C7358f c7358f = (C7358f) abstractC7356d;
            if (c7358f.m32384b().m32390d()) {
                c0026k2 = c0026k;
                c0026kM160d = m162f(c0026k2, c7358f.m32383a(), c7358f.m32393e(), c7235f, interfaceC0210n, c0086a2);
            } else {
                AbstractC7551l.m33233f(c7358f.m32384b().m32389c());
                if (c7358f.m32384b().m32391e() || (c0026k.m155d().m88e() && !c7358f.m32383a().isEmpty())) {
                    z7 = true;
                }
                c0086a = c0086a2;
                boolean z8 = z7;
                c0026k2 = c0026k;
                c0026kM160d = m160d(c0026k2, c7358f.m32383a(), c7358f.m32393e(), c7235f, interfaceC0210n, z8, c0086a);
                c0086a2 = c0086a;
            }
        } else if (i7 == 2) {
            C7355c c7355c = (C7355c) abstractC7356d;
            if (c7355c.m32384b().m32390d()) {
                c0026k2 = c0026k;
                c0026kM160d = m161e(c0026k2, c7355c.m32383a(), c7355c.m32382e(), c7235f, interfaceC0210n, c0086a2);
            } else {
                AbstractC7551l.m33233f(c7355c.m32384b().m32389c());
                c0086a = c0086a2;
                c0026k2 = c0026k;
                c0026kM160d = m159c(c0026k2, c7355c.m32383a(), c7355c.m32382e(), c7235f, interfaceC0210n, c7355c.m32384b().m32391e() || c0026k.m155d().m88e(), c0086a);
                c0086a2 = c0086a;
            }
        } else if (i7 == 3) {
            c0026k2 = c0026k;
            C7353a c7353a = (C7353a) abstractC7356d;
            c0026kM160d = !c7353a.m32381f() ? m158a(c0026k2, c7353a.m32383a(), c7353a.m32380e(), c7235f, interfaceC0210n, c0086a2) : m168k(c0026k2, c7353a.m32383a(), c7235f, interfaceC0210n, c0086a2);
        } else {
            if (i7 != 4) {
                throw new AssertionError("Unknown operation: " + abstractC7356d.m32385c());
            }
            c0026k2 = c0026k;
            c0026kM160d = m165i(c0026k2, abstractC7356d.m32383a(), c7235f, interfaceC0210n, c0086a2);
        }
        ArrayList arrayList = new ArrayList(c0086a2.m298a());
        m166j(c0026k2, c0026kM160d, arrayList);
        return new c(c0026kM160d, arrayList);
    }

    /* JADX INFO: renamed from: k */
    public C0026k m168k(C0026k c0026k, C7245j c7245j, C7235F c7235f, InterfaceC0210n interfaceC0210n, C0086a c0086a) {
        C0086a c0086a2;
        if (c7235f.m31928i(c7245j) != null) {
            return c0026k;
        }
        d dVar = new d(c7235f, c0026k, interfaceC0210n);
        C0205i c0205iM84a = c0026k.m154c().m84a();
        if (c7245j.isEmpty() || c7245j.m32004z().m996q()) {
            c0205iM84a = this.f144a.mo304g(c0205iM84a, C0205i.m1062e(c0026k.m155d().m89f() ? c7235f.m31921b(c0026k.m153b()) : c7235f.m31924e(c0026k.m155d().m85b()), this.f144a.mo300c()), c0086a);
        } else {
            C0198b c0198bM32004z = c7245j.m32004z();
            InterfaceC0210n interfaceC0210nM31920a = c7235f.m31920a(c0198bM32004z, c0026k.m155d());
            if (interfaceC0210nM31920a == null && c0026k.m155d().m86c(c0198bM32004z)) {
                interfaceC0210nM31920a = c0205iM84a.m1066k().mo1008l(c0198bM32004z);
            }
            InterfaceC0210n interfaceC0210n2 = interfaceC0210nM31920a;
            if (interfaceC0210n2 != null) {
                c0086a2 = c0086a;
                c0205iM84a = this.f144a.mo305h(c0205iM84a, c0198bM32004z, interfaceC0210n2, c7245j.m31996C(), dVar, c0086a2);
            } else {
                c0086a2 = c0086a;
                if (interfaceC0210n2 == null && c0026k.m154c().m85b().mo1003R(c0198bM32004z)) {
                    c0205iM84a = this.f144a.mo305h(c0205iM84a, c0198bM32004z, C0203g.m1050w(), c7245j.m31996C(), dVar, c0086a2);
                }
            }
            if (c0205iM84a.m1066k().isEmpty() && c0026k.m155d().m89f()) {
                InterfaceC0210n interfaceC0210nM31921b = c7235f.m31921b(c0026k.m153b());
                if (interfaceC0210nM31921b.mo1000H()) {
                    c0205iM84a = this.f144a.mo304g(c0205iM84a, C0205i.m1062e(interfaceC0210nM31921b, this.f144a.mo300c()), c0086a2);
                }
            }
        }
        return c0026k.m156e(c0205iM84a, c0026k.m155d().m89f() || c7235f.m31928i(C7245j.m31994y()) != null, this.f144a.mo302e());
    }
}
