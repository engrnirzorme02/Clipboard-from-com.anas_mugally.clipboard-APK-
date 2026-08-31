package p137R4;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import p158U4.AbstractC1692p;
import p158U4.AbstractC1701y;
import p158U4.C1687k;
import p158U4.C1693q;
import p158U4.C1696t;
import p351s5.C7039u;

/* JADX INFO: renamed from: R4.P */
/* JADX INFO: loaded from: classes.dex */
public final class C1348P {

    /* JADX INFO: renamed from: a */
    private String f4722a;

    /* JADX INFO: renamed from: b */
    private final List f4723b;

    /* JADX INFO: renamed from: c */
    private final List f4724c;

    /* JADX INFO: renamed from: d */
    private final C1696t f4725d;

    /* JADX INFO: renamed from: e */
    private final String f4726e;

    /* JADX INFO: renamed from: f */
    private final long f4727f;

    /* JADX INFO: renamed from: g */
    private final C1362i f4728g;

    /* JADX INFO: renamed from: h */
    private final C1362i f4729h;

    /* JADX INFO: renamed from: R4.P$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f4730a;

        static {
            int[] iArr = new int[C1369p.b.values().length];
            f4730a = iArr;
            try {
                iArr[C1369p.b.ARRAY_CONTAINS_ANY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4730a[C1369p.b.ARRAY_CONTAINS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4730a[C1369p.b.EQUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4730a[C1369p.b.IN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4730a[C1369p.b.NOT_IN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4730a[C1369p.b.NOT_EQUAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4730a[C1369p.b.LESS_THAN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f4730a[C1369p.b.LESS_THAN_OR_EQUAL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4730a[C1369p.b.GREATER_THAN_OR_EQUAL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f4730a[C1369p.b.GREATER_THAN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public C1348P(C1696t c1696t, String str, List list, List list2, long j7, C1362i c1362i, C1362i c1362i2) {
        this.f4725d = c1696t;
        this.f4726e = str;
        this.f4723b = list2;
        this.f4724c = list;
        this.f4727f = j7;
        this.f4728g = c1362i;
        this.f4729h = c1362i2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: b */
    private Pair m5807b(AbstractC1692p.c cVar, C1362i c1362i) {
        C7039u c7039u = AbstractC1701y.f5644c;
        Iterator it = m5809g(cVar.mo7050h()).iterator();
        boolean zM5874c = true;
        while (true) {
            boolean z7 = false;
            if (!it.hasNext()) {
                if (c1362i != null) {
                    for (int i7 = 0; i7 < this.f4723b.size(); i7++) {
                        if (((C1342J) this.f4723b.get(i7)).m5741c().equals(cVar.mo7050h())) {
                            C7039u c7039u2 = (C7039u) c1362i.m5873b().get(i7);
                            if (AbstractC1701y.m7167E(c7039u, zM5874c, c7039u2, c1362i.m5874c()) < 0) {
                                zM5874c = c1362i.m5874c();
                                c7039u = c7039u2;
                            }
                        }
                    }
                }
                return new Pair(c7039u, Boolean.valueOf(zM5874c));
            }
            C1369p c1369p = (C1369p) it.next();
            C7039u c7039uM5924h = AbstractC1701y.f5644c;
            switch (a.f4730a[c1369p.m5923g().ordinal()]) {
                case 3:
                case 4:
                case 9:
                    c7039uM5924h = c1369p.m5924h();
                    z7 = true;
                    break;
                case 5:
                case 6:
                default:
                    z7 = true;
                    break;
                case 7:
                case 8:
                    c7039uM5924h = AbstractC1701y.m7191s(c1369p.m5924h());
                    z7 = true;
                    break;
                case 10:
                    c7039uM5924h = c1369p.m5924h();
                    break;
            }
            if (AbstractC1701y.m7167E(c7039u, zM5874c, c7039uM5924h, z7) < 0) {
                zM5874c = z7;
                c7039u = c7039uM5924h;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    private Pair m5808e(AbstractC1692p.c cVar, C1362i c1362i) {
        C7039u c7039u = AbstractC1701y.f5646e;
        Iterator it = m5809g(cVar.mo7050h()).iterator();
        boolean zM5874c = true;
        while (true) {
            z = false;
            boolean z7 = false;
            if (!it.hasNext()) {
                if (c1362i != null) {
                    for (int i7 = 0; i7 < this.f4723b.size(); i7++) {
                        if (((C1342J) this.f4723b.get(i7)).m5741c().equals(cVar.mo7050h())) {
                            C7039u c7039u2 = (C7039u) c1362i.m5873b().get(i7);
                            if (AbstractC1701y.m7172J(c7039u, zM5874c, c7039u2, c1362i.m5874c()) > 0) {
                                zM5874c = c1362i.m5874c();
                                c7039u = c7039u2;
                            }
                        }
                    }
                }
                return new Pair(c7039u, Boolean.valueOf(zM5874c));
            }
            C1369p c1369p = (C1369p) it.next();
            C7039u c7039uM5924h = AbstractC1701y.f5646e;
            switch (a.f4730a[c1369p.m5923g().ordinal()]) {
                case 3:
                case 4:
                case 8:
                    c7039uM5924h = c1369p.m5924h();
                case 5:
                case 6:
                default:
                    z7 = true;
                    break;
                case 7:
                    c7039uM5924h = c1369p.m5924h();
                    break;
                case 9:
                case 10:
                    c7039uM5924h = AbstractC1701y.m7192t(c1369p.m5924h());
                    break;
            }
            if (AbstractC1701y.m7172J(c7039u, zM5874c, c7039uM5924h, z7) > 0) {
                zM5874c = z7;
                c7039u = c7039uM5924h;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    private List m5809g(C1693q c1693q) {
        ArrayList arrayList = new ArrayList();
        for (AbstractC1370q abstractC1370q : this.f4724c) {
            if (abstractC1370q instanceof C1369p) {
                C1369p c1369p = (C1369p) abstractC1370q;
                if (c1369p.m5922f().equals(c1693q)) {
                    arrayList.add(c1369p);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public List m5810a(AbstractC1692p abstractC1692p) {
        AbstractC1692p.c cVarM7106c = abstractC1692p.m7106c();
        if (cVarM7106c == null) {
            return null;
        }
        for (C1369p c1369p : m5809g(cVarM7106c.mo7050h())) {
            int i7 = a.f4730a[c1369p.m5923g().ordinal()];
            if (i7 == 1) {
                return c1369p.m5924h().m31034l0().mo30668g();
            }
            if (i7 == 2) {
                return Collections.singletonList(c1369p.m5924h());
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public String m5811c() {
        String str = this.f4722a;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(m5820n().mo7057h());
        if (this.f4726e != null) {
            sb.append("|cg:");
            sb.append(this.f4726e);
        }
        sb.append("|f:");
        Iterator it = m5814h().iterator();
        while (it.hasNext()) {
            sb.append(((AbstractC1370q) it.next()).mo5890a());
        }
        sb.append("|ob:");
        for (C1342J c1342j : m5819m()) {
            sb.append(c1342j.m5741c().mo7057h());
            sb.append(c1342j.m5740b().equals(C1342J.a.ASCENDING) ? "asc" : "desc");
        }
        if (m5824r()) {
            sb.append("|l:");
            sb.append(m5816j());
        }
        if (this.f4728g != null) {
            sb.append("|lb:");
            sb.append(this.f4728g.m5874c() ? "b:" : "a:");
            sb.append(this.f4728g.m5875d());
        }
        if (this.f4729h != null) {
            sb.append("|ub:");
            sb.append(this.f4729h.m5874c() ? "a:" : "b:");
            sb.append(this.f4729h.m5875d());
        }
        String string = sb.toString();
        this.f4722a = string;
        return string;
    }

    /* JADX INFO: renamed from: d */
    public String m5812d() {
        return this.f4726e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1348P.class == obj.getClass()) {
            C1348P c1348p = (C1348P) obj;
            String str = this.f4726e;
            if (str == null ? c1348p.f4726e != null : !str.equals(c1348p.f4726e)) {
                return false;
            }
            if (this.f4727f != c1348p.f4727f || !this.f4723b.equals(c1348p.f4723b) || !this.f4724c.equals(c1348p.f4724c) || !this.f4725d.equals(c1348p.f4725d)) {
                return false;
            }
            C1362i c1362i = this.f4728g;
            if (c1362i == null ? c1348p.f4728g != null : !c1362i.equals(c1348p.f4728g)) {
                return false;
            }
            C1362i c1362i2 = this.f4729h;
            C1362i c1362i3 = c1348p.f4729h;
            if (c1362i2 != null) {
                return c1362i2.equals(c1362i3);
            }
            if (c1362i3 == null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public C1362i m5813f() {
        return this.f4729h;
    }

    /* JADX INFO: renamed from: h */
    public List m5814h() {
        return this.f4724c;
    }

    public int hashCode() {
        int iHashCode = this.f4723b.hashCode() * 31;
        String str = this.f4726e;
        int iHashCode2 = (((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f4724c.hashCode()) * 31) + this.f4725d.hashCode()) * 31;
        long j7 = this.f4727f;
        int i7 = (iHashCode2 + ((int) (j7 ^ (j7 >>> 32)))) * 31;
        C1362i c1362i = this.f4728g;
        int iHashCode3 = (i7 + (c1362i != null ? c1362i.hashCode() : 0)) * 31;
        C1362i c1362i2 = this.f4729h;
        return iHashCode3 + (c1362i2 != null ? c1362i2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i */
    public C1342J.a m5815i() {
        List list = this.f4723b;
        return ((C1342J) list.get(list.size() - 1)).m5740b();
    }

    /* JADX INFO: renamed from: j */
    public long m5816j() {
        return this.f4727f;
    }

    /* JADX INFO: renamed from: k */
    public C1362i m5817k(AbstractC1692p abstractC1692p) {
        ArrayList arrayList = new ArrayList();
        boolean zBooleanValue = true;
        for (AbstractC1692p.c cVar : abstractC1692p.m7107e()) {
            Pair pairM5807b = cVar.mo7051j().equals(AbstractC1692p.c.a.ASCENDING) ? m5807b(cVar, this.f4728g) : m5808e(cVar, this.f4728g);
            arrayList.add((C7039u) pairM5807b.first);
            zBooleanValue &= ((Boolean) pairM5807b.second).booleanValue();
        }
        return new C1362i(arrayList, zBooleanValue);
    }

    /* JADX INFO: renamed from: l */
    public Collection m5818l(AbstractC1692p abstractC1692p) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (AbstractC1692p.c cVar : abstractC1692p.m7107e()) {
            for (C1369p c1369p : m5809g(cVar.mo7050h())) {
                int i7 = a.f4730a[c1369p.m5923g().ordinal()];
                if (i7 == 3 || i7 == 4) {
                    linkedHashMap.put(cVar.mo7050h(), c1369p.m5924h());
                } else if (i7 == 5 || i7 == 6) {
                    linkedHashMap.put(cVar.mo7050h(), c1369p.m5924h());
                    return linkedHashMap.values();
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public List m5819m() {
        return this.f4723b;
    }

    /* JADX INFO: renamed from: n */
    public C1696t m5820n() {
        return this.f4725d;
    }

    /* JADX INFO: renamed from: o */
    public int m5821o() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f4724c.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            for (C1369p c1369p : ((AbstractC1370q) it.next()).mo5892c()) {
                if (!c1369p.m5922f().m7121B()) {
                    if (c1369p.m5923g().equals(C1369p.b.ARRAY_CONTAINS) || c1369p.m5923g().equals(C1369p.b.ARRAY_CONTAINS_ANY)) {
                        i7 = 1;
                    } else {
                        hashSet.add(c1369p.m5922f());
                    }
                }
            }
        }
        for (C1342J c1342j : this.f4723b) {
            if (!c1342j.m5741c().m7121B()) {
                hashSet.add(c1342j.m5741c());
            }
        }
        return hashSet.size() + i7;
    }

    /* JADX INFO: renamed from: p */
    public C1362i m5822p() {
        return this.f4728g;
    }

    /* JADX INFO: renamed from: q */
    public C1362i m5823q(AbstractC1692p abstractC1692p) {
        ArrayList arrayList = new ArrayList();
        boolean zBooleanValue = true;
        for (AbstractC1692p.c cVar : abstractC1692p.m7107e()) {
            Pair pairM5808e = cVar.mo7051j().equals(AbstractC1692p.c.a.ASCENDING) ? m5808e(cVar, this.f4729h) : m5807b(cVar, this.f4729h);
            arrayList.add((C7039u) pairM5808e.first);
            zBooleanValue &= ((Boolean) pairM5808e.second).booleanValue();
        }
        return new C1362i(arrayList, zBooleanValue);
    }

    /* JADX INFO: renamed from: r */
    public boolean m5824r() {
        return this.f4727f != -1;
    }

    /* JADX INFO: renamed from: s */
    public boolean m5825s() {
        return C1687k.m7090w(this.f4725d) && this.f4726e == null && this.f4724c.isEmpty();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Query(");
        sb.append(this.f4725d.mo7057h());
        if (this.f4726e != null) {
            sb.append(" collectionGroup=");
            sb.append(this.f4726e);
        }
        if (!this.f4724c.isEmpty()) {
            sb.append(" where ");
            for (int i7 = 0; i7 < this.f4724c.size(); i7++) {
                if (i7 > 0) {
                    sb.append(" and ");
                }
                sb.append(this.f4724c.get(i7));
            }
        }
        if (!this.f4723b.isEmpty()) {
            sb.append(" order by ");
            for (int i8 = 0; i8 < this.f4723b.size(); i8++) {
                if (i8 > 0) {
                    sb.append(", ");
                }
                sb.append(this.f4723b.get(i8));
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
