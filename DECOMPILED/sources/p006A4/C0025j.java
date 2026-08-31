package p006A4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p014B4.C0087b;
import p014B4.InterfaceC0089d;
import p030D4.C0203g;
import p030D4.C0205i;
import p030D4.C0209m;
import p030D4.InterfaceC0210n;
import p334q4.C6834a;
import p374v4.AbstractC7243h;
import p374v4.C7235F;
import p374v4.C7245j;
import p382w4.AbstractC7356d;
import p398y4.AbstractC7551l;

/* JADX INFO: renamed from: A4.j */
/* JADX INFO: loaded from: classes.dex */
public class C0025j {

    /* JADX INFO: renamed from: a */
    private final C0024i f134a;

    /* JADX INFO: renamed from: b */
    private final C0027l f135b;

    /* JADX INFO: renamed from: c */
    private C0026k f136c;

    /* JADX INFO: renamed from: d */
    private final List f137d;

    /* JADX INFO: renamed from: e */
    private final C0021f f138e;

    /* JADX INFO: renamed from: A4.j$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final List f139a;

        /* JADX INFO: renamed from: b */
        public final List f140b;

        public a(List list, List list2) {
            this.f139a = list;
            this.f140b = list2;
        }
    }

    public C0025j(C0024i c0024i, C0026k c0026k) {
        this.f134a = c0024i;
        C0087b c0087b = new C0087b(c0024i.m136c());
        InterfaceC0089d interfaceC0089dM124h = c0024i.m137d().m124h();
        this.f135b = new C0027l(interfaceC0089dM124h);
        C0016a c0016aM155d = c0026k.m155d();
        C0016a c0016aM154c = c0026k.m154c();
        C0205i c0205iM1062e = C0205i.m1062e(C0203g.m1050w(), c0024i.m136c());
        C0205i c0205iMo304g = c0087b.mo304g(c0205iM1062e, c0016aM155d.m84a(), null);
        C0205i c0205iMo304g2 = interfaceC0089dM124h.mo304g(c0205iM1062e, c0016aM154c.m84a(), null);
        this.f136c = new C0026k(new C0016a(c0205iMo304g2, c0016aM154c.m89f(), interfaceC0089dM124h.mo302e()), new C0016a(c0205iMo304g, c0016aM155d.m89f(), c0087b.mo302e()));
        this.f137d = new ArrayList();
        this.f138e = new C0021f(c0024i);
    }

    /* JADX INFO: renamed from: c */
    private List m141c(List list, C0205i c0205i, AbstractC7243h abstractC7243h) {
        return this.f138e.m112d(list, c0205i, abstractC7243h == null ? this.f137d : Arrays.asList(abstractC7243h));
    }

    /* JADX INFO: renamed from: a */
    public void m142a(AbstractC7243h abstractC7243h) {
        this.f137d.add(abstractC7243h);
    }

    /* JADX INFO: renamed from: b */
    public a m143b(AbstractC7356d abstractC7356d, C7235F c7235f, InterfaceC0210n interfaceC0210n) {
        if (abstractC7356d.m32385c() == AbstractC7356d.a.Merge && abstractC7356d.m32384b().m32388b() != null) {
            AbstractC7551l.m33234g(this.f136c.m153b() != null, "We should always have a full cache before handling merges");
            AbstractC7551l.m33234g(this.f136c.m152a() != null, "Missing event cache, even though we have a server cache");
        }
        C0026k c0026k = this.f136c;
        C0027l.c cVarM167b = this.f135b.m167b(c0026k, abstractC7356d, c7235f, interfaceC0210n);
        AbstractC7551l.m33234g(cVarM167b.f146a.m155d().m89f() || !c0026k.m155d().m89f(), "Once a server snap is complete, it should never go back");
        C0026k c0026k2 = cVarM167b.f146a;
        this.f136c = c0026k2;
        return new a(m141c(cVarM167b.f147b, c0026k2.m154c().m84a(), null), cVarM167b.f147b);
    }

    /* JADX INFO: renamed from: d */
    public InterfaceC0210n m144d() {
        return this.f136c.m152a();
    }

    /* JADX INFO: renamed from: e */
    public InterfaceC0210n m145e(C7245j c7245j) {
        InterfaceC0210n interfaceC0210nM153b = this.f136c.m153b();
        if (interfaceC0210nM153b == null) {
            return null;
        }
        if (this.f134a.m140g() || !(c7245j.isEmpty() || interfaceC0210nM153b.mo1008l(c7245j.m32004z()).isEmpty())) {
            return interfaceC0210nM153b.mo1013r(c7245j);
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public InterfaceC0210n m146f() {
        return this.f136c.m154c().m85b();
    }

    /* JADX INFO: renamed from: g */
    public List m147g(AbstractC7243h abstractC7243h) {
        C0016a c0016aM154c = this.f136c.m154c();
        ArrayList arrayList = new ArrayList();
        for (C0209m c0209m : c0016aM154c.m85b()) {
            arrayList.add(C0018c.m93c(c0209m.m1082c(), c0209m.m1083d()));
        }
        if (c0016aM154c.m89f()) {
            arrayList.add(C0018c.m99m(c0016aM154c.m84a()));
        }
        return m141c(arrayList, c0016aM154c.m84a(), abstractC7243h);
    }

    /* JADX INFO: renamed from: h */
    public C0024i m148h() {
        return this.f134a;
    }

    /* JADX INFO: renamed from: i */
    public InterfaceC0210n m149i() {
        return this.f136c.m155d().m85b();
    }

    /* JADX INFO: renamed from: j */
    public boolean m150j() {
        return this.f137d.isEmpty();
    }

    /* JADX INFO: renamed from: k */
    public List m151k(AbstractC7243h abstractC7243h, C6834a c6834a) {
        List arrayList;
        int i7 = 0;
        if (c6834a != null) {
            arrayList = new ArrayList();
            AbstractC7551l.m33234g(abstractC7243h == null, "A cancel should cancel all event registrations");
            C7245j c7245jM138e = this.f134a.m138e();
            Iterator it = this.f137d.iterator();
            while (it.hasNext()) {
                arrayList.add(new C0017b((AbstractC7243h) it.next(), c6834a, c7245jM138e));
            }
        } else {
            arrayList = Collections.EMPTY_LIST;
        }
        if (abstractC7243h == null) {
            Iterator it2 = this.f137d.iterator();
            while (it2.hasNext()) {
                ((AbstractC7243h) it2.next()).m31989h();
            }
            this.f137d.clear();
            return arrayList;
        }
        int i8 = -1;
        while (true) {
            if (i7 >= this.f137d.size()) {
                i7 = i8;
                break;
            }
            AbstractC7243h abstractC7243h2 = (AbstractC7243h) this.f137d.get(i7);
            if (abstractC7243h2.mo31899e(abstractC7243h)) {
                if (abstractC7243h2.m31988f()) {
                    break;
                }
                i8 = i7;
            }
            i7++;
        }
        if (i7 != -1) {
            AbstractC7243h abstractC7243h3 = (AbstractC7243h) this.f137d.get(i7);
            this.f137d.remove(i7);
            abstractC7243h3.m31989h();
        }
        return arrayList;
    }
}
