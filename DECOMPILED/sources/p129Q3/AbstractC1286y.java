package p129Q3;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p122P3.AbstractC1209m;

/* JADX INFO: renamed from: Q3.y */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1286y {

    /* JADX INFO: renamed from: Q3.y$a */
    class a extends b {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Set f4567a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Set f4568b;

        /* JADX INFO: renamed from: Q3.y$a$a, reason: collision with other inner class name */
        class C7645a extends AbstractC1263b {

            /* JADX INFO: renamed from: c */
            final Iterator f4569c;

            /* JADX INFO: renamed from: d */
            final Iterator f4570d;

            C7645a() {
                this.f4569c = a.this.f4567a.iterator();
                this.f4570d = a.this.f4568b.iterator();
            }

            @Override // p129Q3.AbstractC1263b
            /* JADX INFO: renamed from: a */
            protected Object mo5505a() {
                if (this.f4569c.hasNext()) {
                    return this.f4569c.next();
                }
                while (this.f4570d.hasNext()) {
                    Object next = this.f4570d.next();
                    if (!a.this.f4567a.contains(next)) {
                        return next;
                    }
                }
                return m5506b();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Set set, Set set2) {
            super(null);
            this.f4567a = set;
            this.f4568b = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC1260B iterator() {
            return new C7645a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f4567a.contains(obj) || this.f4568b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return this.f4567a.isEmpty() && this.f4568b.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            int size = this.f4567a.size();
            Iterator it = this.f4568b.iterator();
            while (it.hasNext()) {
                if (!this.f4567a.contains(it.next())) {
                    size++;
                }
            }
            return size;
        }
    }

    /* JADX INFO: renamed from: Q3.y$b */
    public static abstract class b extends AbstractSet {
        /* synthetic */ b(a aVar) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public abstract AbstractC1260B iterator();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean removeAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean retainAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: a */
    static boolean m5614a(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size() && set.containsAll(set2)) {
                    return true;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    static int m5615b(Set set) {
        Iterator it = set.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i7 = ~(~(i7 + (next != null ? next.hashCode() : 0)));
        }
        return i7;
    }

    /* JADX INFO: renamed from: c */
    public static b m5616c(Set set, Set set2) {
        AbstractC1209m.m5303o(set, "set1");
        AbstractC1209m.m5303o(set2, "set2");
        return new a(set, set2);
    }
}
