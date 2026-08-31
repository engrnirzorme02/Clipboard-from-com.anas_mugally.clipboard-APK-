package p374v4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p006A4.C0016a;
import p006A4.C0018c;
import p006A4.C0023h;
import p006A4.C0024i;
import p006A4.C0025j;
import p006A4.C0026k;
import p006A4.InterfaceC0020e;
import p030D4.C0203g;
import p030D4.C0205i;
import p030D4.C0209m;
import p030D4.InterfaceC0210n;
import p334q4.C6834a;
import p382w4.AbstractC7356d;
import p390x4.InterfaceC7410e;
import p398y4.AbstractC7551l;
import p398y4.C7546g;

/* JADX INFO: renamed from: v4.u */
/* JADX INFO: loaded from: classes.dex */
public class C7256u {

    /* JADX INFO: renamed from: a */
    private final Map f28974a = new HashMap();

    /* JADX INFO: renamed from: b */
    private final InterfaceC7410e f28975b;

    public C7256u(InterfaceC7410e interfaceC7410e) {
        this.f28975b = interfaceC7410e;
    }

    /* JADX INFO: renamed from: c */
    private List m32106c(C0025j c0025j, AbstractC7356d abstractC7356d, C7235F c7235f, InterfaceC0210n interfaceC0210n) {
        C0025j.a aVarM143b = c0025j.m143b(abstractC7356d, c7235f, interfaceC0210n);
        if (!c0025j.m148h().m140g()) {
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            for (C0018c c0018c : aVarM143b.f140b) {
                InterfaceC0020e.a aVarM102j = c0018c.m102j();
                if (aVarM102j == InterfaceC0020e.a.CHILD_ADDED) {
                    hashSet2.add(c0018c.m101i());
                } else if (aVarM102j == InterfaceC0020e.a.CHILD_REMOVED) {
                    hashSet.add(c0018c.m101i());
                }
            }
            if (!hashSet2.isEmpty() || !hashSet.isEmpty()) {
                this.f28975b.mo32740h(c0025j.m148h(), hashSet2, hashSet);
            }
        }
        return aVarM143b.f139a;
    }

    /* JADX INFO: renamed from: a */
    public List m32107a(AbstractC7243h abstractC7243h, C7235F c7235f, C0016a c0016a) {
        C0024i c0024iMo31898d = abstractC7243h.mo31898d();
        C0025j c0025jM32112g = m32112g(c0024iMo31898d, c7235f, c0016a);
        if (!c0024iMo31898d.m140g()) {
            HashSet hashSet = new HashSet();
            Iterator it = c0025jM32112g.m146f().iterator();
            while (it.hasNext()) {
                hashSet.add(((C0209m) it.next()).m1082c());
            }
            this.f28975b.mo32738f(c0024iMo31898d, hashSet);
        }
        if (!this.f28974a.containsKey(c0024iMo31898d.m137d())) {
            this.f28974a.put(c0024iMo31898d.m137d(), c0025jM32112g);
        }
        this.f28974a.put(c0024iMo31898d.m137d(), c0025jM32112g);
        c0025jM32112g.m142a(abstractC7243h);
        return c0025jM32112g.m147g(abstractC7243h);
    }

    /* JADX INFO: renamed from: b */
    public List m32108b(AbstractC7356d abstractC7356d, C7235F c7235f, InterfaceC0210n interfaceC0210n) {
        C0023h c0023hM32388b = abstractC7356d.m32384b().m32388b();
        if (c0023hM32388b != null) {
            C0025j c0025j = (C0025j) this.f28974a.get(c0023hM32388b);
            AbstractC7551l.m33233f(c0025j != null);
            return m32106c(c0025j, abstractC7356d, c7235f, interfaceC0210n);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f28974a.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.addAll(m32106c((C0025j) ((Map.Entry) it.next()).getValue(), abstractC7356d, c7235f, interfaceC0210n));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public InterfaceC0210n m32109d(C7245j c7245j) {
        Iterator it = this.f28974a.values().iterator();
        while (it.hasNext()) {
            InterfaceC0210n interfaceC0210nM145e = ((C0025j) it.next()).m145e(c7245j);
            if (interfaceC0210nM145e != null) {
                return interfaceC0210nM145e;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public C0025j m32110e() {
        Iterator it = this.f28974a.entrySet().iterator();
        while (it.hasNext()) {
            C0025j c0025j = (C0025j) ((Map.Entry) it.next()).getValue();
            if (c0025j.m148h().m140g()) {
                return c0025j;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public List m32111f() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f28974a.entrySet().iterator();
        while (it.hasNext()) {
            C0025j c0025j = (C0025j) ((Map.Entry) it.next()).getValue();
            if (!c0025j.m148h().m140g()) {
                arrayList.add(c0025j);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public C0025j m32112g(C0024i c0024i, C7235F c7235f, C0016a c0016a) {
        boolean z7;
        C0025j c0025j = (C0025j) this.f28974a.get(c0024i.m137d());
        if (c0025j != null) {
            return c0025j;
        }
        InterfaceC0210n interfaceC0210nM31921b = c7235f.m31921b(c0016a.m89f() ? c0016a.m85b() : null);
        if (interfaceC0210nM31921b != null) {
            z7 = true;
        } else {
            interfaceC0210nM31921b = c7235f.m31924e(c0016a.m85b() != null ? c0016a.m85b() : C0203g.m1050w());
            z7 = false;
        }
        return new C0025j(c0024i, new C0026k(new C0016a(C0205i.m1062e(interfaceC0210nM31921b, c0024i.m136c()), z7, false), c0016a));
    }

    /* JADX INFO: renamed from: h */
    public boolean m32113h() {
        return m32110e() != null;
    }

    /* JADX INFO: renamed from: i */
    public boolean m32114i() {
        return this.f28974a.isEmpty();
    }

    /* JADX INFO: renamed from: j */
    public C7546g m32115j(C0024i c0024i, AbstractC7243h abstractC7243h, C6834a c6834a) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        boolean zM32113h = m32113h();
        if (c0024i.m139f()) {
            Iterator it = this.f28974a.entrySet().iterator();
            while (it.hasNext()) {
                C0025j c0025j = (C0025j) ((Map.Entry) it.next()).getValue();
                arrayList2.addAll(c0025j.m151k(abstractC7243h, c6834a));
                if (c0025j.m150j()) {
                    it.remove();
                    if (!c0025j.m148h().m140g()) {
                        arrayList.add(c0025j.m148h());
                    }
                }
            }
        } else {
            C0025j c0025j2 = (C0025j) this.f28974a.get(c0024i.m137d());
            if (c0025j2 != null) {
                arrayList2.addAll(c0025j2.m151k(abstractC7243h, c6834a));
                if (c0025j2.m150j()) {
                    this.f28974a.remove(c0024i.m137d());
                    if (!c0025j2.m148h().m140g()) {
                        arrayList.add(c0025j2.m148h());
                    }
                }
            }
        }
        if (zM32113h && !m32113h()) {
            arrayList.add(C0024i.m134a(c0024i.m138e()));
        }
        return new C7546g(arrayList, arrayList2);
    }

    /* JADX INFO: renamed from: k */
    public boolean m32116k(C0024i c0024i) {
        return m32117l(c0024i) != null;
    }

    /* JADX INFO: renamed from: l */
    public C0025j m32117l(C0024i c0024i) {
        return c0024i.m140g() ? m32110e() : (C0025j) this.f28974a.get(c0024i.m137d());
    }
}
