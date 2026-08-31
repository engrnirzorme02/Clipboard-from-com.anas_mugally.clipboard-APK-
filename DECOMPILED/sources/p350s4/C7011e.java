package p350s4;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: s4.e */
/* JADX INFO: loaded from: classes.dex */
public class C7011e implements Iterable {

    /* JADX INFO: renamed from: a */
    private final AbstractC7009c f28025a;

    /* JADX INFO: renamed from: s4.e$a */
    private static class a implements Iterator {

        /* JADX INFO: renamed from: a */
        final Iterator f28026a;

        public a(Iterator it) {
            this.f28026a = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f28026a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            return ((Map.Entry) this.f28026a.next()).getKey();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f28026a.remove();
        }
    }

    public C7011e(List list, Comparator comparator) {
        this.f28025a = AbstractC7009c.a.m30611b(list, Collections.EMPTY_MAP, AbstractC7009c.a.m30614e(), comparator);
    }

    /* JADX INFO: renamed from: Q */
    public Iterator m30616Q() {
        return new a(this.f28025a.mo30597Q());
    }

    /* JADX INFO: renamed from: a */
    public Object m30617a() {
        return this.f28025a.mo30601g();
    }

    /* JADX INFO: renamed from: b */
    public Object m30618b() {
        return this.f28025a.mo30602j();
    }

    public boolean contains(Object obj) {
        return this.f28025a.mo30598a(obj);
    }

    /* JADX INFO: renamed from: e */
    public Object m30619e(Object obj) {
        return this.f28025a.mo30603k(obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7011e) {
            return this.f28025a.equals(((C7011e) obj).f28025a);
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public C7011e m30620g(Object obj) {
        return new C7011e(this.f28025a.mo30605n(obj, null));
    }

    public int hashCode() {
        return this.f28025a.hashCode();
    }

    public boolean isEmpty() {
        return this.f28025a.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new a(this.f28025a.iterator());
    }

    /* JADX INFO: renamed from: j */
    public Iterator m30621j(Object obj) {
        return new a(this.f28025a.mo30606p(obj));
    }

    /* JADX INFO: renamed from: k */
    public C7011e m30622k(Object obj) {
        AbstractC7009c abstractC7009cMo30607q = this.f28025a.mo30607q(obj);
        return abstractC7009cMo30607q == this.f28025a ? this : new C7011e(abstractC7009cMo30607q);
    }

    /* JADX INFO: renamed from: m */
    public C7011e m30623m(C7011e c7011e) {
        C7011e c7011eM30620g;
        if (size() < c7011e.size()) {
            c7011eM30620g = c7011e;
            c7011e = this;
        } else {
            c7011eM30620g = this;
        }
        Iterator it = c7011e.iterator();
        while (it.hasNext()) {
            c7011eM30620g = c7011eM30620g.m30620g(it.next());
        }
        return c7011eM30620g;
    }

    public int size() {
        return this.f28025a.size();
    }

    private C7011e(AbstractC7009c abstractC7009c) {
        this.f28025a = abstractC7009c;
    }
}
