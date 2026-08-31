package p350s4;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: s4.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7009c implements Iterable {

    /* JADX INFO: renamed from: s4.c$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private static final InterfaceC7722a f28022a = new InterfaceC7722a() { // from class: s4.b
            @Override // p350s4.AbstractC7009c.a.InterfaceC7722a
            /* JADX INFO: renamed from: a */
            public final Object mo30609a(Object obj) {
                return AbstractC7009c.a.m30610a(obj);
            }
        };

        /* JADX INFO: renamed from: s4.c$a$a, reason: collision with other inner class name */
        public interface InterfaceC7722a {
            /* JADX INFO: renamed from: a */
            Object mo30609a(Object obj);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ Object m30610a(Object obj) {
            return obj;
        }

        /* JADX INFO: renamed from: b */
        public static AbstractC7009c m30611b(List list, Map map, InterfaceC7722a interfaceC7722a, Comparator comparator) {
            return list.size() < 25 ? C7007a.m30595y(list, map, interfaceC7722a, comparator) : C7017k.m30646v(list, map, interfaceC7722a, comparator);
        }

        /* JADX INFO: renamed from: c */
        public static AbstractC7009c m30612c(Comparator comparator) {
            return new C7007a(comparator);
        }

        /* JADX INFO: renamed from: d */
        public static AbstractC7009c m30613d(Map map, Comparator comparator) {
            return map.size() < 25 ? C7007a.m30588B(map, comparator) : C7017k.m30647w(map, comparator);
        }

        /* JADX INFO: renamed from: e */
        public static InterfaceC7722a m30614e() {
            return f28022a;
        }
    }

    /* JADX INFO: renamed from: Q */
    public abstract Iterator mo30597Q();

    /* JADX INFO: renamed from: a */
    public abstract boolean mo30598a(Object obj);

    /* JADX INFO: renamed from: b */
    public abstract Object mo30599b(Object obj);

    /* JADX INFO: renamed from: e */
    public abstract Comparator mo30600e();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC7009c)) {
            return false;
        }
        AbstractC7009c abstractC7009c = (AbstractC7009c) obj;
        if (!mo30600e().equals(abstractC7009c.mo30600e()) || size() != abstractC7009c.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = abstractC7009c.iterator();
        while (it.hasNext()) {
            if (!((Map.Entry) it.next()).equals(it2.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public abstract Object mo30601g();

    public int hashCode() {
        int iHashCode = mo30600e().hashCode();
        Iterator it = iterator();
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + ((Map.Entry) it.next()).hashCode();
        }
        return iHashCode;
    }

    public abstract boolean isEmpty();

    @Override // java.lang.Iterable
    public abstract Iterator iterator();

    /* JADX INFO: renamed from: j */
    public abstract Object mo30602j();

    /* JADX INFO: renamed from: k */
    public abstract Object mo30603k(Object obj);

    /* JADX INFO: renamed from: m */
    public abstract void mo30604m(InterfaceC7014h.b bVar);

    /* JADX INFO: renamed from: n */
    public abstract AbstractC7009c mo30605n(Object obj, Object obj2);

    /* JADX INFO: renamed from: p */
    public abstract Iterator mo30606p(Object obj);

    /* JADX INFO: renamed from: q */
    public abstract AbstractC7009c mo30607q(Object obj);

    public abstract int size();

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("{");
        Iterator it = iterator();
        boolean z7 = true;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (z7) {
                z7 = false;
            } else {
                sb.append(", ");
            }
            sb.append("(");
            sb.append(entry.getKey());
            sb.append("=>");
            sb.append(entry.getValue());
            sb.append(")");
        }
        sb.append("};");
        return sb.toString();
    }
}
