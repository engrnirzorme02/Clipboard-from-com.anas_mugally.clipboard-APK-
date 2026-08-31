package p367u5;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: u5.z */
/* JADX INFO: loaded from: classes.dex */
public final class C7195z extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: t */
    private static final Comparator f28680t = new a();

    /* JADX INFO: renamed from: a */
    private final Comparator f28681a;

    /* JADX INFO: renamed from: b */
    private final boolean f28682b;

    /* JADX INFO: renamed from: c */
    e f28683c;

    /* JADX INFO: renamed from: d */
    int f28684d;

    /* JADX INFO: renamed from: e */
    int f28685e;

    /* JADX INFO: renamed from: f */
    final e f28686f;

    /* JADX INFO: renamed from: r */
    private b f28687r;

    /* JADX INFO: renamed from: s */
    private c f28688s;

    /* JADX INFO: renamed from: u5.z$a */
    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* JADX INFO: renamed from: u5.z$b */
    class b extends AbstractSet {

        /* JADX INFO: renamed from: u5.z$b$a */
        class a extends d {
            a() {
                super();
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry next() {
                return m31760a();
            }
        }

        b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C7195z.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && C7195z.this.m31754c((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            e eVarM31754c;
            if (!(obj instanceof Map.Entry) || (eVarM31754c = C7195z.this.m31754c((Map.Entry) obj)) == null) {
                return false;
            }
            C7195z.this.m31756f(eVarM31754c, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C7195z.this.f28684d;
        }
    }

    /* JADX INFO: renamed from: u5.z$c */
    final class c extends AbstractSet {

        /* JADX INFO: renamed from: u5.z$c$a */
        class a extends d {
            a() {
                super();
            }

            @Override // java.util.Iterator
            public Object next() {
                return m31760a().f28702f;
            }
        }

        c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C7195z.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return C7195z.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return C7195z.this.m31757g(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C7195z.this.f28684d;
        }
    }

    /* JADX INFO: renamed from: u5.z$d */
    private abstract class d implements Iterator {

        /* JADX INFO: renamed from: a */
        e f28693a;

        /* JADX INFO: renamed from: b */
        e f28694b = null;

        /* JADX INFO: renamed from: c */
        int f28695c;

        d() {
            this.f28693a = C7195z.this.f28686f.f28700d;
            this.f28695c = C7195z.this.f28685e;
        }

        /* JADX INFO: renamed from: a */
        final e m31760a() {
            e eVar = this.f28693a;
            C7195z c7195z = C7195z.this;
            if (eVar == c7195z.f28686f) {
                throw new NoSuchElementException();
            }
            if (c7195z.f28685e != this.f28695c) {
                throw new ConcurrentModificationException();
            }
            this.f28693a = eVar.f28700d;
            this.f28694b = eVar;
            return eVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f28693a != C7195z.this.f28686f;
        }

        @Override // java.util.Iterator
        public final void remove() {
            e eVar = this.f28694b;
            if (eVar == null) {
                throw new IllegalStateException();
            }
            C7195z.this.m31756f(eVar, true);
            this.f28694b = null;
            this.f28695c = C7195z.this.f28685e;
        }
    }

    public C7195z() {
        this(f28680t, true);
    }

    /* JADX INFO: renamed from: a */
    private static boolean m31748a(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    /* JADX INFO: renamed from: e */
    private void m31749e(e eVar, boolean z7) {
        while (eVar != null) {
            e eVar2 = eVar.f28698b;
            e eVar3 = eVar.f28699c;
            int i7 = eVar2 != null ? eVar2.f28705t : 0;
            int i8 = eVar3 != null ? eVar3.f28705t : 0;
            int i9 = i7 - i8;
            if (i9 == -2) {
                e eVar4 = eVar3.f28698b;
                e eVar5 = eVar3.f28699c;
                int i10 = (eVar4 != null ? eVar4.f28705t : 0) - (eVar5 != null ? eVar5.f28705t : 0);
                if (i10 == -1 || (i10 == 0 && !z7)) {
                    m31751i(eVar);
                } else {
                    m31752k(eVar3);
                    m31751i(eVar);
                }
                if (z7) {
                    return;
                }
            } else if (i9 == 2) {
                e eVar6 = eVar2.f28698b;
                e eVar7 = eVar2.f28699c;
                int i11 = (eVar6 != null ? eVar6.f28705t : 0) - (eVar7 != null ? eVar7.f28705t : 0);
                if (i11 == 1 || (i11 == 0 && !z7)) {
                    m31752k(eVar);
                } else {
                    m31751i(eVar2);
                    m31752k(eVar);
                }
                if (z7) {
                    return;
                }
            } else if (i9 == 0) {
                eVar.f28705t = i7 + 1;
                if (z7) {
                    return;
                }
            } else {
                eVar.f28705t = Math.max(i7, i8) + 1;
                if (!z7) {
                    return;
                }
            }
            eVar = eVar.f28697a;
        }
    }

    /* JADX INFO: renamed from: h */
    private void m31750h(e eVar, e eVar2) {
        e eVar3 = eVar.f28697a;
        eVar.f28697a = null;
        if (eVar2 != null) {
            eVar2.f28697a = eVar3;
        }
        if (eVar3 == null) {
            this.f28683c = eVar2;
        } else if (eVar3.f28698b == eVar) {
            eVar3.f28698b = eVar2;
        } else {
            eVar3.f28699c = eVar2;
        }
    }

    /* JADX INFO: renamed from: i */
    private void m31751i(e eVar) {
        e eVar2 = eVar.f28698b;
        e eVar3 = eVar.f28699c;
        e eVar4 = eVar3.f28698b;
        e eVar5 = eVar3.f28699c;
        eVar.f28699c = eVar4;
        if (eVar4 != null) {
            eVar4.f28697a = eVar;
        }
        m31750h(eVar, eVar3);
        eVar3.f28698b = eVar;
        eVar.f28697a = eVar3;
        int iMax = Math.max(eVar2 != null ? eVar2.f28705t : 0, eVar4 != null ? eVar4.f28705t : 0) + 1;
        eVar.f28705t = iMax;
        eVar3.f28705t = Math.max(iMax, eVar5 != null ? eVar5.f28705t : 0) + 1;
    }

    /* JADX INFO: renamed from: k */
    private void m31752k(e eVar) {
        e eVar2 = eVar.f28698b;
        e eVar3 = eVar.f28699c;
        e eVar4 = eVar2.f28698b;
        e eVar5 = eVar2.f28699c;
        eVar.f28698b = eVar5;
        if (eVar5 != null) {
            eVar5.f28697a = eVar;
        }
        m31750h(eVar, eVar2);
        eVar2.f28699c = eVar;
        eVar.f28697a = eVar2;
        int iMax = Math.max(eVar3 != null ? eVar3.f28705t : 0, eVar5 != null ? eVar5.f28705t : 0) + 1;
        eVar.f28705t = iMax;
        eVar2.f28705t = Math.max(iMax, eVar4 != null ? eVar4.f28705t : 0) + 1;
    }

    /* JADX INFO: renamed from: b */
    e m31753b(Object obj, boolean z7) {
        int iCompareTo;
        e eVar;
        Comparator comparator = this.f28681a;
        e eVar2 = this.f28683c;
        if (eVar2 != null) {
            Comparable comparable = comparator == f28680t ? (Comparable) obj : null;
            while (true) {
                iCompareTo = comparable != null ? comparable.compareTo(eVar2.f28702f) : comparator.compare(obj, eVar2.f28702f);
                if (iCompareTo == 0) {
                    return eVar2;
                }
                e eVar3 = iCompareTo < 0 ? eVar2.f28698b : eVar2.f28699c;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            iCompareTo = 0;
        }
        e eVar4 = eVar2;
        if (!z7) {
            return null;
        }
        e eVar5 = this.f28686f;
        if (eVar4 != null) {
            eVar = new e(this.f28682b, eVar4, obj, eVar5, eVar5.f28701e);
            if (iCompareTo < 0) {
                eVar4.f28698b = eVar;
            } else {
                eVar4.f28699c = eVar;
            }
            m31749e(eVar4, true);
        } else {
            if (comparator == f28680t && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName() + " is not Comparable");
            }
            eVar = new e(this.f28682b, eVar4, obj, eVar5, eVar5.f28701e);
            this.f28683c = eVar;
        }
        this.f28684d++;
        this.f28685e++;
        return eVar;
    }

    /* JADX INFO: renamed from: c */
    e m31754c(Map.Entry entry) {
        e eVarM31755d = m31755d(entry.getKey());
        if (eVarM31755d == null || !m31748a(eVarM31755d.f28704s, entry.getValue())) {
            return null;
        }
        return eVarM31755d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f28683c = null;
        this.f28684d = 0;
        this.f28685e++;
        e eVar = this.f28686f;
        eVar.f28701e = eVar;
        eVar.f28700d = eVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return m31755d(obj) != null;
    }

    /* JADX INFO: renamed from: d */
    e m31755d(Object obj) {
        if (obj != null) {
            try {
                return m31753b(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        b bVar = this.f28687r;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b();
        this.f28687r = bVar2;
        return bVar2;
    }

    /* JADX INFO: renamed from: f */
    void m31756f(e eVar, boolean z7) {
        int i7;
        if (z7) {
            e eVar2 = eVar.f28701e;
            eVar2.f28700d = eVar.f28700d;
            eVar.f28700d.f28701e = eVar2;
        }
        e eVar3 = eVar.f28698b;
        e eVar4 = eVar.f28699c;
        e eVar5 = eVar.f28697a;
        int i8 = 0;
        if (eVar3 == null || eVar4 == null) {
            if (eVar3 != null) {
                m31750h(eVar, eVar3);
                eVar.f28698b = null;
            } else if (eVar4 != null) {
                m31750h(eVar, eVar4);
                eVar.f28699c = null;
            } else {
                m31750h(eVar, null);
            }
            m31749e(eVar5, false);
            this.f28684d--;
            this.f28685e++;
            return;
        }
        e eVarM31762b = eVar3.f28705t > eVar4.f28705t ? eVar3.m31762b() : eVar4.m31761a();
        m31756f(eVarM31762b, false);
        e eVar6 = eVar.f28698b;
        if (eVar6 != null) {
            i7 = eVar6.f28705t;
            eVarM31762b.f28698b = eVar6;
            eVar6.f28697a = eVarM31762b;
            eVar.f28698b = null;
        } else {
            i7 = 0;
        }
        e eVar7 = eVar.f28699c;
        if (eVar7 != null) {
            i8 = eVar7.f28705t;
            eVarM31762b.f28699c = eVar7;
            eVar7.f28697a = eVarM31762b;
            eVar.f28699c = null;
        }
        eVarM31762b.f28705t = Math.max(i7, i8) + 1;
        m31750h(eVar, eVarM31762b);
    }

    /* JADX INFO: renamed from: g */
    e m31757g(Object obj) {
        e eVarM31755d = m31755d(obj);
        if (eVarM31755d != null) {
            m31756f(eVarM31755d, true);
        }
        return eVarM31755d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        e eVarM31755d = m31755d(obj);
        if (eVarM31755d != null) {
            return eVarM31755d.f28704s;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        c cVar = this.f28688s;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        this.f28688s = cVar2;
        return cVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.f28682b) {
            throw new NullPointerException("value == null");
        }
        e eVarM31753b = m31753b(obj, true);
        Object obj3 = eVarM31753b.f28704s;
        eVarM31753b.f28704s = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        e eVarM31757g = m31757g(obj);
        if (eVarM31757g != null) {
            return eVarM31757g.f28704s;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f28684d;
    }

    public C7195z(boolean z7) {
        this(f28680t, z7);
    }

    public C7195z(Comparator comparator, boolean z7) {
        this.f28684d = 0;
        this.f28685e = 0;
        this.f28681a = comparator == null ? f28680t : comparator;
        this.f28682b = z7;
        this.f28686f = new e(z7);
    }

    /* JADX INFO: renamed from: u5.z$e */
    static final class e implements Map.Entry {

        /* JADX INFO: renamed from: a */
        e f28697a;

        /* JADX INFO: renamed from: b */
        e f28698b;

        /* JADX INFO: renamed from: c */
        e f28699c;

        /* JADX INFO: renamed from: d */
        e f28700d;

        /* JADX INFO: renamed from: e */
        e f28701e;

        /* JADX INFO: renamed from: f */
        final Object f28702f;

        /* JADX INFO: renamed from: r */
        final boolean f28703r;

        /* JADX INFO: renamed from: s */
        Object f28704s;

        /* JADX INFO: renamed from: t */
        int f28705t;

        e(boolean z7) {
            this.f28702f = null;
            this.f28703r = z7;
            this.f28701e = this;
            this.f28700d = this;
        }

        /* JADX INFO: renamed from: a */
        public e m31761a() {
            e eVar = this;
            for (e eVar2 = this.f28698b; eVar2 != null; eVar2 = eVar2.f28698b) {
                eVar = eVar2;
            }
            return eVar;
        }

        /* JADX INFO: renamed from: b */
        public e m31762b() {
            e eVar = this;
            for (e eVar2 = this.f28699c; eVar2 != null; eVar2 = eVar2.f28699c) {
                eVar = eVar2;
            }
            return eVar;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = this.f28702f;
                if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                    Object obj3 = this.f28704s;
                    if (obj3 == null) {
                        if (entry.getValue() == null) {
                            return true;
                        }
                    } else if (obj3.equals(entry.getValue())) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f28702f;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f28704s;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Object obj = this.f28702f;
            int iHashCode = obj == null ? 0 : obj.hashCode();
            Object obj2 = this.f28704s;
            return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj == null && !this.f28703r) {
                throw new NullPointerException("value == null");
            }
            Object obj2 = this.f28704s;
            this.f28704s = obj;
            return obj2;
        }

        public String toString() {
            return this.f28702f + "=" + this.f28704s;
        }

        e(boolean z7, e eVar, Object obj, e eVar2, e eVar3) {
            this.f28697a = eVar;
            this.f28702f = obj;
            this.f28703r = z7;
            this.f28705t = 1;
            this.f28700d = eVar2;
            this.f28701e = eVar3;
            eVar3.f28700d = this;
            eVar2.f28701e = this;
        }
    }
}
