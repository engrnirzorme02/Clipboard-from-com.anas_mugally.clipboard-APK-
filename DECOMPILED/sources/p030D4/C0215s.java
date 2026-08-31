package p030D4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p358t4.C7093o;
import p374v4.C7245j;
import p398y4.AbstractC7551l;

/* JADX INFO: renamed from: D4.s */
/* JADX INFO: loaded from: classes.dex */
public class C0215s {

    /* JADX INFO: renamed from: a */
    private final C7245j f926a;

    /* JADX INFO: renamed from: b */
    private final C7245j f927b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC0210n f928c;

    public C0215s(C7093o c7093o) {
        List listM31345a = c7093o.m31345a();
        this.f926a = listM31345a != null ? new C7245j(listM31345a) : null;
        List listM31346b = c7093o.m31346b();
        this.f927b = listM31346b != null ? new C7245j(listM31346b) : null;
        this.f928c = AbstractC0211o.m1085a(c7093o.m31347c());
    }

    /* JADX INFO: renamed from: b */
    private InterfaceC0210n m1095b(C7245j c7245j, InterfaceC0210n interfaceC0210n, InterfaceC0210n interfaceC0210n2) {
        C7245j c7245j2 = this.f926a;
        boolean z7 = true;
        int iCompareTo = c7245j2 == null ? 1 : c7245j.compareTo(c7245j2);
        C7245j c7245j3 = this.f927b;
        int iCompareTo2 = c7245j3 == null ? -1 : c7245j.compareTo(c7245j3);
        C7245j c7245j4 = this.f926a;
        boolean z8 = c7245j4 != null && c7245j.m32002w(c7245j4);
        C7245j c7245j5 = this.f927b;
        boolean z9 = c7245j5 != null && c7245j.m32002w(c7245j5);
        if (iCompareTo > 0 && iCompareTo2 < 0 && !z9) {
            return interfaceC0210n2;
        }
        if (iCompareTo > 0 && z9 && interfaceC0210n2.mo1000H()) {
            return interfaceC0210n2;
        }
        if (iCompareTo > 0 && iCompareTo2 == 0) {
            AbstractC7551l.m33233f(z9);
            AbstractC7551l.m33233f(!interfaceC0210n2.mo1000H());
            return interfaceC0210n.mo1000H() ? C0203g.m1050w() : interfaceC0210n;
        }
        if (!z8 && !z9) {
            if (iCompareTo2 <= 0 && iCompareTo > 0) {
                z7 = false;
            }
            AbstractC7551l.m33233f(z7);
            return interfaceC0210n;
        }
        HashSet hashSet = new HashSet();
        Iterator it = interfaceC0210n.iterator();
        while (it.hasNext()) {
            hashSet.add(((C0209m) it.next()).m1082c());
        }
        Iterator it2 = interfaceC0210n2.iterator();
        while (it2.hasNext()) {
            hashSet.add(((C0209m) it2.next()).m1082c());
        }
        ArrayList<C0198b> arrayList = new ArrayList(hashSet.size() + 1);
        arrayList.addAll(hashSet);
        if (!interfaceC0210n2.mo1006i().isEmpty() || !interfaceC0210n.mo1006i().isEmpty()) {
            arrayList.add(C0198b.m991n());
        }
        InterfaceC0210n interfaceC0210nMo999E = interfaceC0210n;
        for (C0198b c0198b : arrayList) {
            InterfaceC0210n interfaceC0210nMo1008l = interfaceC0210n.mo1008l(c0198b);
            InterfaceC0210n interfaceC0210nM1095b = m1095b(c7245j.m31999p(c0198b), interfaceC0210n.mo1008l(c0198b), interfaceC0210n2.mo1008l(c0198b));
            if (interfaceC0210nM1095b != interfaceC0210nMo1008l) {
                interfaceC0210nMo999E = interfaceC0210nMo999E.mo999E(c0198b, interfaceC0210nM1095b);
            }
        }
        return interfaceC0210nMo999E;
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC0210n m1096a(InterfaceC0210n interfaceC0210n) {
        return m1095b(C7245j.m31994y(), interfaceC0210n, this.f928c);
    }

    public String toString() {
        return "RangeMerge{optExclusiveStart=" + this.f926a + ", optInclusiveEnd=" + this.f927b + ", snap=" + this.f928c + '}';
    }
}
