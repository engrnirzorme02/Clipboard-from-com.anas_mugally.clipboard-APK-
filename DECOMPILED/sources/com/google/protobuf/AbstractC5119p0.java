package com.google.protobuf;

import androidx.appcompat.app.AbstractC2263x;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.google.protobuf.p0 */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC5119p0 extends AbstractMap {

    /* JADX INFO: renamed from: a */
    private final int f19502a;

    /* JADX INFO: renamed from: b */
    private List f19503b;

    /* JADX INFO: renamed from: c */
    private Map f19504c;

    /* JADX INFO: renamed from: d */
    private boolean f19505d;

    /* JADX INFO: renamed from: e */
    private volatile g f19506e;

    /* JADX INFO: renamed from: f */
    private Map f19507f;

    /* JADX INFO: renamed from: r */
    private volatile c f19508r;

    /* JADX INFO: renamed from: com.google.protobuf.p0$a */
    class a extends AbstractC5119p0 {
        a(int i7) {
            super(i7, null);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.m23551s((Comparable) obj, obj2);
        }

        @Override // com.google.protobuf.AbstractC5119p0
        /* JADX INFO: renamed from: q */
        public void mo23550q() {
            if (!m23549p()) {
                if (m23546l() > 0) {
                    AbstractC2263x.m9328a(m23545k(0).getKey());
                    throw null;
                }
                Iterator it = m23548n().iterator();
                if (it.hasNext()) {
                    AbstractC2263x.m9328a(((Map.Entry) it.next()).getKey());
                    throw null;
                }
            }
            super.mo23550q();
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.p0$c */
    private class c extends g {
        private c() {
            super(AbstractC5119p0.this, null);
        }

        @Override // com.google.protobuf.AbstractC5119p0.g, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new b(AbstractC5119p0.this, null);
        }

        /* synthetic */ c(AbstractC5119p0 abstractC5119p0, a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.p0$d */
    private static class d {

        /* JADX INFO: renamed from: a */
        private static final Iterator f19513a = new a();

        /* JADX INFO: renamed from: b */
        private static final Iterable f19514b = new b();

        /* JADX INFO: renamed from: com.google.protobuf.p0$d$a */
        class a implements Iterator {
            a() {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* JADX INFO: renamed from: com.google.protobuf.p0$d$b */
        class b implements Iterable {
            b() {
            }

            @Override // java.lang.Iterable
            public Iterator iterator() {
                return d.f19513a;
            }
        }

        /* JADX INFO: renamed from: b */
        static Iterable m23555b() {
            return f19514b;
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.p0$e */
    private class e implements Map.Entry, Comparable {

        /* JADX INFO: renamed from: a */
        private final Comparable f19515a;

        /* JADX INFO: renamed from: b */
        private Object f19516b;

        e(AbstractC5119p0 abstractC5119p0, Map.Entry entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }

        /* JADX INFO: renamed from: d */
        private boolean m23556d(Object obj, Object obj2) {
            if (obj == null) {
                return obj2 == null;
            }
            return obj.equals(obj2);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int compareTo(e eVar) {
            return getKey().compareTo(eVar.getKey());
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return m23556d(this.f19515a, entry.getKey()) && m23556d(this.f19516b, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f19516b;
        }

        @Override // java.util.Map.Entry
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Comparable getKey() {
            return this.f19515a;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Comparable comparable = this.f19515a;
            int iHashCode = comparable == null ? 0 : comparable.hashCode();
            Object obj = this.f19516b;
            return iHashCode ^ (obj != null ? obj.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            AbstractC5119p0.this.m23539g();
            Object obj2 = this.f19516b;
            this.f19516b = obj;
            return obj2;
        }

        public String toString() {
            return this.f19515a + "=" + this.f19516b;
        }

        e(Comparable comparable, Object obj) {
            this.f19515a = comparable;
            this.f19516b = obj;
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.p0$g */
    private class g extends AbstractSet {
        private g() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry entry) {
            if (contains(entry)) {
                return false;
            }
            AbstractC5119p0.this.m23551s((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            AbstractC5119p0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = AbstractC5119p0.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new f(AbstractC5119p0.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            AbstractC5119p0.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return AbstractC5119p0.this.size();
        }

        /* synthetic */ g(AbstractC5119p0 abstractC5119p0, a aVar) {
            this();
        }
    }

    /* synthetic */ AbstractC5119p0(int i7, a aVar) {
        this(i7);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:21:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003c A[SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    private int m23538f(Comparable comparable) {
        int i7;
        int i8;
        int i9;
        int iCompareTo;
        int size = this.f19503b.size();
        int i10 = size - 1;
        if (i10 < 0) {
            i7 = 0;
            while (i7 <= i10) {
                i9 = (i7 + i10) / 2;
                iCompareTo = comparable.compareTo(((e) this.f19503b.get(i9)).getKey());
                if (iCompareTo < 0) {
                    i10 = i9 - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i9;
                    }
                    i7 = i9 + 1;
                }
            }
            i8 = i7 + 1;
        } else {
            int iCompareTo2 = comparable.compareTo(((e) this.f19503b.get(i10)).getKey());
            if (iCompareTo2 > 0) {
                i8 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i10;
                }
                i7 = 0;
                while (i7 <= i10) {
                    i9 = (i7 + i10) / 2;
                    iCompareTo = comparable.compareTo(((e) this.f19503b.get(i9)).getKey());
                    if (iCompareTo < 0) {
                        i10 = i9 - 1;
                    } else {
                        if (iCompareTo > 0) {
                            return i9;
                        }
                        i7 = i9 + 1;
                    }
                }
                i8 = i7 + 1;
            }
        }
        return -i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public void m23539g() {
        if (this.f19505d) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: i */
    private void m23540i() {
        m23539g();
        if (!this.f19503b.isEmpty() || (this.f19503b instanceof ArrayList)) {
            return;
        }
        this.f19503b = new ArrayList(this.f19502a);
    }

    /* JADX INFO: renamed from: o */
    private SortedMap m23541o() {
        m23539g();
        if (this.f19504c.isEmpty() && !(this.f19504c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f19504c = treeMap;
            this.f19507f = treeMap.descendingMap();
        }
        return (SortedMap) this.f19504c;
    }

    /* JADX INFO: renamed from: r */
    static AbstractC5119p0 m23542r(int i7) {
        return new a(i7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public Object m23543t(int i7) {
        m23539g();
        Object value = ((e) this.f19503b.remove(i7)).getValue();
        if (!this.f19504c.isEmpty()) {
            Iterator it = m23541o().entrySet().iterator();
            this.f19503b.add(new e(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        m23539g();
        if (!this.f19503b.isEmpty()) {
            this.f19503b.clear();
        }
        if (this.f19504c.isEmpty()) {
            return;
        }
        this.f19504c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m23538f(comparable) >= 0 || this.f19504c.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        if (this.f19506e == null) {
            this.f19506e = new g(this, null);
        }
        return this.f19506e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC5119p0)) {
            return super.equals(obj);
        }
        AbstractC5119p0 abstractC5119p0 = (AbstractC5119p0) obj;
        int size = size();
        if (size != abstractC5119p0.size()) {
            return false;
        }
        int iM23546l = m23546l();
        if (iM23546l != abstractC5119p0.m23546l()) {
            return entrySet().equals(abstractC5119p0.entrySet());
        }
        for (int i7 = 0; i7 < iM23546l; i7++) {
            if (!m23545k(i7).equals(abstractC5119p0.m23545k(i7))) {
                return false;
            }
        }
        if (iM23546l != size) {
            return this.f19504c.equals(abstractC5119p0.f19504c);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iM23538f = m23538f(comparable);
        return iM23538f >= 0 ? ((e) this.f19503b.get(iM23538f)).getValue() : this.f19504c.get(comparable);
    }

    /* JADX INFO: renamed from: h */
    Set m23544h() {
        if (this.f19508r == null) {
            this.f19508r = new c(this, null);
        }
        return this.f19508r;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iM23546l = m23546l();
        int iHashCode = 0;
        for (int i7 = 0; i7 < iM23546l; i7++) {
            iHashCode += ((e) this.f19503b.get(i7)).hashCode();
        }
        return m23547m() > 0 ? iHashCode + this.f19504c.hashCode() : iHashCode;
    }

    /* JADX INFO: renamed from: k */
    public Map.Entry m23545k(int i7) {
        return (Map.Entry) this.f19503b.get(i7);
    }

    /* JADX INFO: renamed from: l */
    public int m23546l() {
        return this.f19503b.size();
    }

    /* JADX INFO: renamed from: m */
    public int m23547m() {
        return this.f19504c.size();
    }

    /* JADX INFO: renamed from: n */
    public Iterable m23548n() {
        return this.f19504c.isEmpty() ? d.m23555b() : this.f19504c.entrySet();
    }

    /* JADX INFO: renamed from: p */
    public boolean m23549p() {
        return this.f19505d;
    }

    /* JADX INFO: renamed from: q */
    public void mo23550q() {
        if (this.f19505d) {
            return;
        }
        this.f19504c = this.f19504c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f19504c);
        this.f19507f = this.f19507f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f19507f);
        this.f19505d = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        m23539g();
        Comparable comparable = (Comparable) obj;
        int iM23538f = m23538f(comparable);
        if (iM23538f >= 0) {
            return m23543t(iM23538f);
        }
        if (this.f19504c.isEmpty()) {
            return null;
        }
        return this.f19504c.remove(comparable);
    }

    /* JADX INFO: renamed from: s */
    public Object m23551s(Comparable comparable, Object obj) {
        m23539g();
        int iM23538f = m23538f(comparable);
        if (iM23538f >= 0) {
            return ((e) this.f19503b.get(iM23538f)).setValue(obj);
        }
        m23540i();
        int i7 = -(iM23538f + 1);
        if (i7 >= this.f19502a) {
            return m23541o().put(comparable, obj);
        }
        int size = this.f19503b.size();
        int i8 = this.f19502a;
        if (size == i8) {
            e eVar = (e) this.f19503b.remove(i8 - 1);
            m23541o().put(eVar.getKey(), eVar.getValue());
        }
        this.f19503b.add(i7, new e(comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f19503b.size() + this.f19504c.size();
    }

    /* JADX INFO: renamed from: com.google.protobuf.p0$b */
    private class b implements Iterator {

        /* JADX INFO: renamed from: a */
        private int f19509a;

        /* JADX INFO: renamed from: b */
        private Iterator f19510b;

        private b() {
            this.f19509a = AbstractC5119p0.this.f19503b.size();
        }

        /* JADX INFO: renamed from: a */
        private Iterator m23552a() {
            if (this.f19510b == null) {
                this.f19510b = AbstractC5119p0.this.f19507f.entrySet().iterator();
            }
            return this.f19510b;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (m23552a().hasNext()) {
                return (Map.Entry) m23552a().next();
            }
            List list = AbstractC5119p0.this.f19503b;
            int i7 = this.f19509a - 1;
            this.f19509a = i7;
            return (Map.Entry) list.get(i7);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i7 = this.f19509a;
            return (i7 > 0 && i7 <= AbstractC5119p0.this.f19503b.size()) || m23552a().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        /* synthetic */ b(AbstractC5119p0 abstractC5119p0, a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.p0$f */
    private class f implements Iterator {

        /* JADX INFO: renamed from: a */
        private int f19518a;

        /* JADX INFO: renamed from: b */
        private boolean f19519b;

        /* JADX INFO: renamed from: c */
        private Iterator f19520c;

        private f() {
            this.f19518a = -1;
        }

        /* JADX INFO: renamed from: a */
        private Iterator m23559a() {
            if (this.f19520c == null) {
                this.f19520c = AbstractC5119p0.this.f19504c.entrySet().iterator();
            }
            return this.f19520c;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            this.f19519b = true;
            int i7 = this.f19518a + 1;
            this.f19518a = i7;
            return i7 < AbstractC5119p0.this.f19503b.size() ? (Map.Entry) AbstractC5119p0.this.f19503b.get(this.f19518a) : (Map.Entry) m23559a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f19518a + 1 < AbstractC5119p0.this.f19503b.size() || (!AbstractC5119p0.this.f19504c.isEmpty() && m23559a().hasNext());
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f19519b) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f19519b = false;
            AbstractC5119p0.this.m23539g();
            if (this.f19518a >= AbstractC5119p0.this.f19503b.size()) {
                m23559a().remove();
                return;
            }
            AbstractC5119p0 abstractC5119p0 = AbstractC5119p0.this;
            int i7 = this.f19518a;
            this.f19518a = i7 - 1;
            abstractC5119p0.m23543t(i7);
        }

        /* synthetic */ f(AbstractC5119p0 abstractC5119p0, a aVar) {
            this();
        }
    }

    private AbstractC5119p0(int i7) {
        this.f19502a = i7;
        this.f19503b = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        this.f19504c = map;
        this.f19507f = map;
    }
}
