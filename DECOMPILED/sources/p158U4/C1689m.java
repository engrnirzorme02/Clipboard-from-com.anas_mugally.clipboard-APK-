package p158U4;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import p350s4.AbstractC7009c;
import p350s4.C7011e;

/* JADX INFO: renamed from: U4.m */
/* JADX INFO: loaded from: classes.dex */
public final class C1689m implements Iterable {

    /* JADX INFO: renamed from: a */
    private final AbstractC7009c f5606a;

    /* JADX INFO: renamed from: b */
    private final C7011e f5607b;

    private C1689m(AbstractC7009c abstractC7009c, C7011e c7011e) {
        this.f5606a = abstractC7009c;
        this.f5607b = c7011e;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m7097a(Comparator comparator, InterfaceC1684h interfaceC1684h, InterfaceC1684h interfaceC1684h2) {
        int iCompare = comparator.compare(interfaceC1684h, interfaceC1684h2);
        return iCompare == 0 ? InterfaceC1684h.f5600a.compare(interfaceC1684h, interfaceC1684h2) : iCompare;
    }

    /* JADX INFO: renamed from: e */
    public static C1689m m7098e(final Comparator comparator) {
        return new C1689m(AbstractC1685i.m7082a(), new C7011e(Collections.EMPTY_LIST, new Comparator() { // from class: U4.l
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C1689m.m7097a(comparator, (InterfaceC1684h) obj, (InterfaceC1684h) obj2);
            }
        }));
    }

    /* JADX INFO: renamed from: b */
    public C1689m m7099b(InterfaceC1684h interfaceC1684h) {
        C1689m c1689mM7103m = m7103m(interfaceC1684h.getKey());
        return new C1689m(c1689mM7103m.f5606a.mo30605n(interfaceC1684h.getKey(), interfaceC1684h), c1689mM7103m.f5607b.m30620g(interfaceC1684h));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1689m.class != obj.getClass()) {
            return false;
        }
        C1689m c1689m = (C1689m) obj;
        if (size() != c1689m.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = c1689m.iterator();
        while (it.hasNext()) {
            if (!((InterfaceC1684h) it.next()).equals((InterfaceC1684h) it2.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public InterfaceC1684h m7100g(C1687k c1687k) {
        return (InterfaceC1684h) this.f5606a.mo30599b(c1687k);
    }

    public int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            InterfaceC1684h interfaceC1684h = (InterfaceC1684h) it.next();
            iHashCode = (((iHashCode * 31) + interfaceC1684h.getKey().hashCode()) * 31) + interfaceC1684h.getData().hashCode();
        }
        return iHashCode;
    }

    public boolean isEmpty() {
        return this.f5606a.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.f5607b.iterator();
    }

    /* JADX INFO: renamed from: j */
    public InterfaceC1684h m7101j() {
        return (InterfaceC1684h) this.f5607b.m30618b();
    }

    /* JADX INFO: renamed from: k */
    public InterfaceC1684h m7102k() {
        return (InterfaceC1684h) this.f5607b.m30617a();
    }

    /* JADX INFO: renamed from: m */
    public C1689m m7103m(C1687k c1687k) {
        InterfaceC1684h interfaceC1684h = (InterfaceC1684h) this.f5606a.mo30599b(c1687k);
        return interfaceC1684h == null ? this : new C1689m(this.f5606a.mo30607q(c1687k), this.f5607b.m30622k(interfaceC1684h));
    }

    public int size() {
        return this.f5606a.size();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        boolean z7 = true;
        while (it.hasNext()) {
            InterfaceC1684h interfaceC1684h = (InterfaceC1684h) it.next();
            if (z7) {
                z7 = false;
            } else {
                sb.append(", ");
            }
            sb.append(interfaceC1684h);
        }
        sb.append("]");
        return sb.toString();
    }
}
