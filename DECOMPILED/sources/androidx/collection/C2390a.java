package androidx.collection;

import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import p353t.AbstractC7065a;

/* JADX INFO: renamed from: androidx.collection.a */
/* JADX INFO: loaded from: classes.dex */
public class C2390a extends C2400k implements Map {

    /* JADX INFO: renamed from: d */
    a f8447d;

    /* JADX INFO: renamed from: e */
    c f8448e;

    /* JADX INFO: renamed from: f */
    e f8449f;

    /* JADX INFO: renamed from: androidx.collection.a$a */
    final class a extends AbstractSet {
        a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return C2390a.this.new d();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C2390a.this.size();
        }
    }

    /* JADX INFO: renamed from: androidx.collection.a$b */
    final class b extends AbstractC2396g {
        b() {
            super(C2390a.this.size());
        }

        @Override // androidx.collection.AbstractC2396g
        /* JADX INFO: renamed from: a */
        protected Object mo10258a(int i7) {
            return C2390a.this.m10300f(i7);
        }

        @Override // androidx.collection.AbstractC2396g
        /* JADX INFO: renamed from: b */
        protected void mo10259b(int i7) {
            C2390a.this.mo8381h(i7);
        }
    }

    /* JADX INFO: renamed from: androidx.collection.a$d */
    final class d implements Iterator, Map.Entry {

        /* JADX INFO: renamed from: a */
        int f8453a;

        /* JADX INFO: renamed from: b */
        int f8454b = -1;

        /* JADX INFO: renamed from: c */
        boolean f8455c;

        d() {
            this.f8453a = C2390a.this.size() - 1;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f8454b++;
            this.f8455c = true;
            return this;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!this.f8455c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return AbstractC7065a.m31156c(entry.getKey(), C2390a.this.m10300f(this.f8454b)) && AbstractC7065a.m31156c(entry.getValue(), C2390a.this.m10301k(this.f8454b));
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            if (this.f8455c) {
                return C2390a.this.m10300f(this.f8454b);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            if (this.f8455c) {
                return C2390a.this.m10301k(this.f8454b);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f8454b < this.f8453a;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (!this.f8455c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            Object objM10300f = C2390a.this.m10300f(this.f8454b);
            Object objM10301k = C2390a.this.m10301k(this.f8454b);
            return (objM10300f == null ? 0 : objM10300f.hashCode()) ^ (objM10301k != null ? objM10301k.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f8455c) {
                throw new IllegalStateException();
            }
            C2390a.this.mo8381h(this.f8454b);
            this.f8454b--;
            this.f8453a--;
            this.f8455c = false;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (this.f8455c) {
                return C2390a.this.mo8382i(this.f8454b, obj);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* JADX INFO: renamed from: androidx.collection.a$f */
    final class f extends AbstractC2396g {
        f() {
            super(C2390a.this.size());
        }

        @Override // androidx.collection.AbstractC2396g
        /* JADX INFO: renamed from: a */
        protected Object mo10258a(int i7) {
            return C2390a.this.m10301k(i7);
        }

        @Override // androidx.collection.AbstractC2396g
        /* JADX INFO: renamed from: b */
        protected void mo10259b(int i7) {
            C2390a.this.mo8381h(i7);
        }
    }

    public C2390a() {
    }

    /* JADX INFO: renamed from: m */
    static boolean m10254m(Set set, Object obj) {
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

    @Override // androidx.collection.C2400k, java.util.Map
    public boolean containsKey(Object obj) {
        return super.containsKey(obj);
    }

    @Override // androidx.collection.C2400k, java.util.Map
    public boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    @Override // java.util.Map
    public Set entrySet() {
        a aVar = this.f8447d;
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a();
        this.f8447d = aVar2;
        return aVar2;
    }

    @Override // androidx.collection.C2400k, java.util.Map
    public Object get(Object obj) {
        return super.get(obj);
    }

    @Override // java.util.Map
    public Set keySet() {
        c cVar = this.f8448e;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        this.f8448e = cVar2;
        return cVar2;
    }

    /* JADX INFO: renamed from: l */
    public boolean m10255l(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: n */
    public boolean m10256n(Collection collection) {
        int size = size();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return size != size();
    }

    /* JADX INFO: renamed from: o */
    public boolean m10257o(Collection collection) {
        int size = size();
        for (int size2 = size() - 1; size2 >= 0; size2--) {
            if (!collection.contains(m10300f(size2))) {
                mo8381h(size2);
            }
        }
        return size != size();
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        m10298b(size() + map.size());
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // androidx.collection.C2400k, java.util.Map
    public Object remove(Object obj) {
        return super.remove(obj);
    }

    @Override // java.util.Map
    public Collection values() {
        e eVar = this.f8449f;
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e();
        this.f8449f = eVar2;
        return eVar2;
    }

    public C2390a(int i7) {
        super(i7);
    }

    /* JADX INFO: renamed from: androidx.collection.a$c */
    final class c implements Set {
        c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            C2390a.this.clear();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return C2390a.this.containsKey(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection collection) {
            return C2390a.this.m10255l(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return C2390a.m10254m(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int iHashCode = 0;
            for (int size = C2390a.this.size() - 1; size >= 0; size--) {
                Object objM10300f = C2390a.this.m10300f(size);
                iHashCode += objM10300f == null ? 0 : objM10300f.hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return C2390a.this.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return C2390a.this.new b();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int iM10299d = C2390a.this.m10299d(obj);
            if (iM10299d < 0) {
                return false;
            }
            C2390a.this.mo8381h(iM10299d);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection collection) {
            return C2390a.this.m10256n(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection collection) {
            return C2390a.this.m10257o(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return C2390a.this.size();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            int size = C2390a.this.size();
            Object[] objArr = new Object[size];
            for (int i7 = 0; i7 < size; i7++) {
                objArr[i7] = C2390a.this.m10300f(i7);
            }
            return objArr;
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            int size = size();
            if (objArr.length < size) {
                objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
            }
            for (int i7 = 0; i7 < size; i7++) {
                objArr[i7] = C2390a.this.m10300f(i7);
            }
            if (objArr.length > size) {
                objArr[size] = null;
            }
            return objArr;
        }
    }

    /* JADX INFO: renamed from: androidx.collection.a$e */
    final class e implements Collection {
        e() {
        }

        @Override // java.util.Collection
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            C2390a.this.clear();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return C2390a.this.m10297a(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return C2390a.this.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return C2390a.this.new f();
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int iM10297a = C2390a.this.m10297a(obj);
            if (iM10297a < 0) {
                return false;
            }
            C2390a.this.mo8381h(iM10297a);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection collection) {
            int size = C2390a.this.size();
            int i7 = 0;
            boolean z7 = false;
            while (i7 < size) {
                if (collection.contains(C2390a.this.m10301k(i7))) {
                    C2390a.this.mo8381h(i7);
                    i7--;
                    size--;
                    z7 = true;
                }
                i7++;
            }
            return z7;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection collection) {
            int size = C2390a.this.size();
            int i7 = 0;
            boolean z7 = false;
            while (i7 < size) {
                if (!collection.contains(C2390a.this.m10301k(i7))) {
                    C2390a.this.mo8381h(i7);
                    i7--;
                    size--;
                    z7 = true;
                }
                i7++;
            }
            return z7;
        }

        @Override // java.util.Collection
        public int size() {
            return C2390a.this.size();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            int size = C2390a.this.size();
            Object[] objArr = new Object[size];
            for (int i7 = 0; i7 < size; i7++) {
                objArr[i7] = C2390a.this.m10301k(i7);
            }
            return objArr;
        }

        @Override // java.util.Collection
        public Object[] toArray(Object[] objArr) {
            int size = size();
            if (objArr.length < size) {
                objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
            }
            for (int i7 = 0; i7 < size; i7++) {
                objArr[i7] = C2390a.this.m10301k(i7);
            }
            if (objArr.length > size) {
                objArr[size] = null;
            }
            return objArr;
        }
    }

    public C2390a(C2400k c2400k) {
        super(c2400k);
    }
}
