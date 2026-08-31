package androidx.datastore.preferences.protobuf;

import androidx.appcompat.app.AbstractC2263x;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.b0 */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC2505b0 extends AbstractMap {

    /* JADX INFO: renamed from: a */
    private List f9486a;

    /* JADX INFO: renamed from: b */
    private Map f9487b;

    /* JADX INFO: renamed from: c */
    private boolean f9488c;

    /* JADX INFO: renamed from: d */
    private volatile f f9489d;

    /* JADX INFO: renamed from: e */
    private Map f9490e;

    /* JADX INFO: renamed from: f */
    private volatile c f9491f;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.b0$a */
    class a extends AbstractC2505b0 {
        a() {
            super(null);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.m11116s((Comparable) obj, obj2);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2505b0
        /* JADX INFO: renamed from: q */
        public void mo11115q() {
            if (!m11114p()) {
                if (m11111l() > 0) {
                    AbstractC2263x.m9328a(m11110k(0).getKey());
                    throw null;
                }
                Iterator it = m11113n().iterator();
                if (it.hasNext()) {
                    AbstractC2263x.m9328a(((Map.Entry) it.next()).getKey());
                    throw null;
                }
            }
            super.mo11115q();
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.b0$c */
    private class c extends f {
        private c() {
            super(AbstractC2505b0.this, null);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2505b0.f, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new b(AbstractC2505b0.this, null);
        }

        /* synthetic */ c(AbstractC2505b0 abstractC2505b0, a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.b0$d */
    private class d implements Map.Entry, Comparable {

        /* JADX INFO: renamed from: a */
        private final Comparable f9496a;

        /* JADX INFO: renamed from: b */
        private Object f9497b;

        d(AbstractC2505b0 abstractC2505b0, Map.Entry entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }

        /* JADX INFO: renamed from: d */
        private boolean m11119d(Object obj, Object obj2) {
            if (obj == null) {
                return obj2 == null;
            }
            return obj.equals(obj2);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return getKey().compareTo(dVar.getKey());
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
            return m11119d(this.f9496a, entry.getKey()) && m11119d(this.f9497b, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f9497b;
        }

        @Override // java.util.Map.Entry
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Comparable getKey() {
            return this.f9496a;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Comparable comparable = this.f9496a;
            int iHashCode = comparable == null ? 0 : comparable.hashCode();
            Object obj = this.f9497b;
            return iHashCode ^ (obj != null ? obj.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            AbstractC2505b0.this.m11104g();
            Object obj2 = this.f9497b;
            this.f9497b = obj;
            return obj2;
        }

        public String toString() {
            return this.f9496a + "=" + this.f9497b;
        }

        d(Comparable comparable, Object obj) {
            this.f9496a = comparable;
            this.f9497b = obj;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.b0$f */
    private class f extends AbstractSet {
        private f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry entry) {
            if (contains(entry)) {
                return false;
            }
            AbstractC2505b0.this.m11116s((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            AbstractC2505b0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = AbstractC2505b0.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new e(AbstractC2505b0.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            AbstractC2505b0.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return AbstractC2505b0.this.size();
        }

        /* synthetic */ f(AbstractC2505b0 abstractC2505b0, a aVar) {
            this();
        }
    }

    /* synthetic */ AbstractC2505b0(a aVar) {
        this();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:21:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003c A[SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    private int m11103f(Comparable comparable) {
        int i7;
        int i8;
        int i9;
        int iCompareTo;
        int size = this.f9486a.size();
        int i10 = size - 1;
        if (i10 < 0) {
            i7 = 0;
            while (i7 <= i10) {
                i9 = (i7 + i10) / 2;
                iCompareTo = comparable.compareTo(((d) this.f9486a.get(i9)).getKey());
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
            int iCompareTo2 = comparable.compareTo(((d) this.f9486a.get(i10)).getKey());
            if (iCompareTo2 > 0) {
                i8 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i10;
                }
                i7 = 0;
                while (i7 <= i10) {
                    i9 = (i7 + i10) / 2;
                    iCompareTo = comparable.compareTo(((d) this.f9486a.get(i9)).getKey());
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
    public void m11104g() {
        if (this.f9488c) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: i */
    private void m11105i() {
        m11104g();
        if (!this.f9486a.isEmpty() || (this.f9486a instanceof ArrayList)) {
            return;
        }
        this.f9486a = new ArrayList(16);
    }

    /* JADX INFO: renamed from: o */
    private SortedMap m11106o() {
        m11104g();
        if (this.f9487b.isEmpty() && !(this.f9487b instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f9487b = treeMap;
            this.f9490e = treeMap.descendingMap();
        }
        return (SortedMap) this.f9487b;
    }

    /* JADX INFO: renamed from: r */
    static AbstractC2505b0 m11107r() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public Object m11108t(int i7) {
        m11104g();
        Object value = ((d) this.f9486a.remove(i7)).getValue();
        if (!this.f9487b.isEmpty()) {
            Iterator it = m11106o().entrySet().iterator();
            this.f9486a.add(new d(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        m11104g();
        if (!this.f9486a.isEmpty()) {
            this.f9486a.clear();
        }
        if (this.f9487b.isEmpty()) {
            return;
        }
        this.f9487b.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m11103f(comparable) >= 0 || this.f9487b.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        if (this.f9489d == null) {
            this.f9489d = new f(this, null);
        }
        return this.f9489d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC2505b0)) {
            return super.equals(obj);
        }
        AbstractC2505b0 abstractC2505b0 = (AbstractC2505b0) obj;
        int size = size();
        if (size != abstractC2505b0.size()) {
            return false;
        }
        int iM11111l = m11111l();
        if (iM11111l != abstractC2505b0.m11111l()) {
            return entrySet().equals(abstractC2505b0.entrySet());
        }
        for (int i7 = 0; i7 < iM11111l; i7++) {
            if (!m11110k(i7).equals(abstractC2505b0.m11110k(i7))) {
                return false;
            }
        }
        if (iM11111l != size) {
            return this.f9487b.equals(abstractC2505b0.f9487b);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iM11103f = m11103f(comparable);
        return iM11103f >= 0 ? ((d) this.f9486a.get(iM11103f)).getValue() : this.f9487b.get(comparable);
    }

    /* JADX INFO: renamed from: h */
    Set m11109h() {
        if (this.f9491f == null) {
            this.f9491f = new c(this, null);
        }
        return this.f9491f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iM11111l = m11111l();
        int iHashCode = 0;
        for (int i7 = 0; i7 < iM11111l; i7++) {
            iHashCode += ((d) this.f9486a.get(i7)).hashCode();
        }
        return m11112m() > 0 ? iHashCode + this.f9487b.hashCode() : iHashCode;
    }

    /* JADX INFO: renamed from: k */
    public Map.Entry m11110k(int i7) {
        return (Map.Entry) this.f9486a.get(i7);
    }

    /* JADX INFO: renamed from: l */
    public int m11111l() {
        return this.f9486a.size();
    }

    /* JADX INFO: renamed from: m */
    public int m11112m() {
        return this.f9487b.size();
    }

    /* JADX INFO: renamed from: n */
    public Iterable m11113n() {
        return this.f9487b.isEmpty() ? Collections.EMPTY_SET : this.f9487b.entrySet();
    }

    /* JADX INFO: renamed from: p */
    public boolean m11114p() {
        return this.f9488c;
    }

    /* JADX INFO: renamed from: q */
    public void mo11115q() {
        if (this.f9488c) {
            return;
        }
        this.f9487b = this.f9487b.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f9487b);
        this.f9490e = this.f9490e.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f9490e);
        this.f9488c = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        m11104g();
        Comparable comparable = (Comparable) obj;
        int iM11103f = m11103f(comparable);
        if (iM11103f >= 0) {
            return m11108t(iM11103f);
        }
        if (this.f9487b.isEmpty()) {
            return null;
        }
        return this.f9487b.remove(comparable);
    }

    /* JADX INFO: renamed from: s */
    public Object m11116s(Comparable comparable, Object obj) {
        m11104g();
        int iM11103f = m11103f(comparable);
        if (iM11103f >= 0) {
            return ((d) this.f9486a.get(iM11103f)).setValue(obj);
        }
        m11105i();
        int i7 = -(iM11103f + 1);
        if (i7 >= 16) {
            return m11106o().put(comparable, obj);
        }
        if (this.f9486a.size() == 16) {
            d dVar = (d) this.f9486a.remove(15);
            m11106o().put(dVar.getKey(), dVar.getValue());
        }
        this.f9486a.add(i7, new d(comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f9486a.size() + this.f9487b.size();
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.b0$b */
    private class b implements Iterator {

        /* JADX INFO: renamed from: a */
        private int f9492a;

        /* JADX INFO: renamed from: b */
        private Iterator f9493b;

        private b() {
            this.f9492a = AbstractC2505b0.this.f9486a.size();
        }

        /* JADX INFO: renamed from: a */
        private Iterator m11117a() {
            if (this.f9493b == null) {
                this.f9493b = AbstractC2505b0.this.f9490e.entrySet().iterator();
            }
            return this.f9493b;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (m11117a().hasNext()) {
                return (Map.Entry) m11117a().next();
            }
            List list = AbstractC2505b0.this.f9486a;
            int i7 = this.f9492a - 1;
            this.f9492a = i7;
            return (Map.Entry) list.get(i7);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i7 = this.f9492a;
            return (i7 > 0 && i7 <= AbstractC2505b0.this.f9486a.size()) || m11117a().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        /* synthetic */ b(AbstractC2505b0 abstractC2505b0, a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.b0$e */
    private class e implements Iterator {

        /* JADX INFO: renamed from: a */
        private int f9499a;

        /* JADX INFO: renamed from: b */
        private boolean f9500b;

        /* JADX INFO: renamed from: c */
        private Iterator f9501c;

        private e() {
            this.f9499a = -1;
        }

        /* JADX INFO: renamed from: a */
        private Iterator m11122a() {
            if (this.f9501c == null) {
                this.f9501c = AbstractC2505b0.this.f9487b.entrySet().iterator();
            }
            return this.f9501c;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            this.f9500b = true;
            int i7 = this.f9499a + 1;
            this.f9499a = i7;
            return i7 < AbstractC2505b0.this.f9486a.size() ? (Map.Entry) AbstractC2505b0.this.f9486a.get(this.f9499a) : (Map.Entry) m11122a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f9499a + 1 < AbstractC2505b0.this.f9486a.size() || (!AbstractC2505b0.this.f9487b.isEmpty() && m11122a().hasNext());
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f9500b) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f9500b = false;
            AbstractC2505b0.this.m11104g();
            if (this.f9499a >= AbstractC2505b0.this.f9486a.size()) {
                m11122a().remove();
                return;
            }
            AbstractC2505b0 abstractC2505b0 = AbstractC2505b0.this;
            int i7 = this.f9499a;
            this.f9499a = i7 - 1;
            abstractC2505b0.m11108t(i7);
        }

        /* synthetic */ e(AbstractC2505b0 abstractC2505b0, a aVar) {
            this();
        }
    }

    private AbstractC2505b0() {
        this.f9486a = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        this.f9487b = map;
        this.f9490e = map;
    }
}
