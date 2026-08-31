package p129Q3;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.SortedMap;

/* JADX INFO: renamed from: Q3.l */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1273l implements Map, Serializable {

    /* JADX INFO: renamed from: d */
    static final Map.Entry[] f4525d = new Map.Entry[0];

    /* JADX INFO: renamed from: a */
    private transient AbstractC1274m f4526a;

    /* JADX INFO: renamed from: b */
    private transient AbstractC1274m f4527b;

    /* JADX INFO: renamed from: c */
    private transient AbstractC1271j f4528c;

    /* JADX INFO: renamed from: Q3.l$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        Comparator f4529a;

        /* JADX INFO: renamed from: b */
        Object[] f4530b;

        /* JADX INFO: renamed from: c */
        int f4531c;

        /* JADX INFO: renamed from: d */
        boolean f4532d;

        /* JADX INFO: renamed from: e */
        C7642a f4533e;

        /* JADX INFO: renamed from: Q3.l$a$a, reason: collision with other inner class name */
        static final class C7642a {

            /* JADX INFO: renamed from: a */
            private final Object f4534a;

            /* JADX INFO: renamed from: b */
            private final Object f4535b;

            /* JADX INFO: renamed from: c */
            private final Object f4536c;

            C7642a(Object obj, Object obj2, Object obj3) {
                this.f4534a = obj;
                this.f4535b = obj2;
                this.f4536c = obj3;
            }

            /* JADX INFO: renamed from: a */
            IllegalArgumentException m5570a() {
                return new IllegalArgumentException("Multiple entries with same key: " + this.f4534a + "=" + this.f4535b + " and " + this.f4534a + "=" + this.f4536c);
            }
        }

        public a() {
            this(4);
        }

        /* JADX INFO: renamed from: b */
        private AbstractC1273l m5560b(boolean z7) {
            Object[] objArrM5562e;
            C7642a c7642a;
            C7642a c7642a2;
            if (z7 && (c7642a2 = this.f4533e) != null) {
                throw c7642a2.m5570a();
            }
            int length = this.f4531c;
            if (this.f4529a == null) {
                objArrM5562e = this.f4530b;
            } else {
                if (this.f4532d) {
                    this.f4530b = Arrays.copyOf(this.f4530b, length * 2);
                }
                objArrM5562e = this.f4530b;
                if (!z7) {
                    objArrM5562e = m5562e(objArrM5562e, this.f4531c);
                    if (objArrM5562e.length < this.f4530b.length) {
                        length = objArrM5562e.length >>> 1;
                    }
                }
                m5563j(objArrM5562e, length, this.f4529a);
            }
            this.f4532d = true;
            C1284w c1284wM5607q = C1284w.m5607q(length, objArrM5562e, this);
            if (!z7 || (c7642a = this.f4533e) == null) {
                return c1284wM5607q;
            }
            throw c7642a.m5570a();
        }

        /* JADX INFO: renamed from: d */
        private void m5561d(int i7) {
            int i8 = i7 * 2;
            Object[] objArr = this.f4530b;
            if (i8 > objArr.length) {
                this.f4530b = Arrays.copyOf(objArr, AbstractC1271j.b.m5524c(objArr.length, i8));
                this.f4532d = false;
            }
        }

        /* JADX INFO: renamed from: e */
        private Object[] m5562e(Object[] objArr, int i7) {
            HashSet hashSet = new HashSet();
            BitSet bitSet = new BitSet();
            for (int i8 = i7 - 1; i8 >= 0; i8--) {
                Object obj = objArr[i8 * 2];
                Objects.requireNonNull(obj);
                if (!hashSet.add(obj)) {
                    bitSet.set(i8);
                }
            }
            if (bitSet.isEmpty()) {
                return objArr;
            }
            Object[] objArr2 = new Object[(i7 - bitSet.cardinality()) * 2];
            int i9 = 0;
            int i10 = 0;
            while (i9 < i7 * 2) {
                if (bitSet.get(i9 >>> 1)) {
                    i9 += 2;
                } else {
                    int i11 = i10 + 1;
                    int i12 = i9 + 1;
                    Object obj2 = objArr[i9];
                    Objects.requireNonNull(obj2);
                    objArr2[i10] = obj2;
                    i10 += 2;
                    i9 += 2;
                    Object obj3 = objArr[i12];
                    Objects.requireNonNull(obj3);
                    objArr2[i11] = obj3;
                }
            }
            return objArr2;
        }

        /* JADX INFO: renamed from: j */
        static void m5563j(Object[] objArr, int i7, Comparator comparator) {
            Map.Entry[] entryArr = new Map.Entry[i7];
            for (int i8 = 0; i8 < i7; i8++) {
                int i9 = i8 * 2;
                Object obj = objArr[i9];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i9 + 1];
                Objects.requireNonNull(obj2);
                entryArr[i8] = new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
            Arrays.sort(entryArr, 0, i7, AbstractC1281t.m5602a(comparator).m5603b(AbstractC1278q.m5593c()));
            for (int i10 = 0; i10 < i7; i10++) {
                int i11 = i10 * 2;
                objArr[i11] = entryArr[i10].getKey();
                objArr[i11 + 1] = entryArr[i10].getValue();
            }
        }

        /* JADX INFO: renamed from: a */
        public AbstractC1273l m5564a() {
            return m5565c();
        }

        /* JADX INFO: renamed from: c */
        public AbstractC1273l m5565c() {
            return m5560b(true);
        }

        /* JADX INFO: renamed from: f */
        public a m5566f(Object obj, Object obj2) {
            m5561d(this.f4531c + 1);
            AbstractC1265d.m5508a(obj, obj2);
            Object[] objArr = this.f4530b;
            int i7 = this.f4531c;
            objArr[i7 * 2] = obj;
            objArr[(i7 * 2) + 1] = obj2;
            this.f4531c = i7 + 1;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public a m5567g(Map.Entry entry) {
            return m5566f(entry.getKey(), entry.getValue());
        }

        /* JADX INFO: renamed from: h */
        public a m5568h(Iterable iterable) {
            if (iterable instanceof Collection) {
                m5561d(this.f4531c + ((Collection) iterable).size());
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                m5567g((Map.Entry) it.next());
            }
            return this;
        }

        /* JADX INFO: renamed from: i */
        public a m5569i(Map map) {
            return m5568h(map.entrySet());
        }

        a(int i7) {
            this.f4530b = new Object[i7 * 2];
            this.f4531c = 0;
            this.f4532d = false;
        }
    }

    AbstractC1273l() {
    }

    /* JADX INFO: renamed from: a */
    public static a m5546a() {
        return new a();
    }

    /* JADX INFO: renamed from: b */
    public static AbstractC1273l m5547b(Iterable iterable) {
        a aVar = new a(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        aVar.m5568h(iterable);
        return aVar.m5564a();
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC1273l m5548c(Map map) {
        if ((map instanceof AbstractC1273l) && !(map instanceof SortedMap)) {
            AbstractC1273l abstractC1273l = (AbstractC1273l) map;
            if (!abstractC1273l.mo5557h()) {
                return abstractC1273l;
            }
        }
        return m5547b(map.entrySet());
    }

    /* JADX INFO: renamed from: k */
    public static AbstractC1273l m5549k() {
        return C1284w.f4546s;
    }

    /* JADX INFO: renamed from: l */
    public static AbstractC1273l m5550l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        AbstractC1265d.m5508a(obj, obj2);
        AbstractC1265d.m5508a(obj3, obj4);
        AbstractC1265d.m5508a(obj5, obj6);
        AbstractC1265d.m5508a(obj7, obj8);
        return C1284w.m5606p(4, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8});
    }

    /* JADX INFO: renamed from: m */
    public static AbstractC1273l m5551m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        AbstractC1265d.m5508a(obj, obj2);
        AbstractC1265d.m5508a(obj3, obj4);
        AbstractC1265d.m5508a(obj5, obj6);
        AbstractC1265d.m5508a(obj7, obj8);
        AbstractC1265d.m5508a(obj9, obj10);
        return C1284w.m5606p(5, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10});
    }

    /* JADX INFO: renamed from: n */
    public static AbstractC1273l m5552n(Map.Entry... entryArr) {
        return m5547b(Arrays.asList(entryArr));
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    /* JADX INFO: renamed from: d */
    abstract AbstractC1274m mo5553d();

    /* JADX INFO: renamed from: e */
    abstract AbstractC1274m mo5554e();

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return AbstractC1278q.m5591a(this, obj);
    }

    /* JADX INFO: renamed from: f */
    abstract AbstractC1271j mo5555f();

    @Override // java.util.Map
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public AbstractC1274m entrySet() {
        AbstractC1274m abstractC1274m = this.f4526a;
        if (abstractC1274m != null) {
            return abstractC1274m;
        }
        AbstractC1274m abstractC1274mMo5553d = mo5553d();
        this.f4526a = abstractC1274mMo5553d;
        return abstractC1274mMo5553d;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    /* JADX INFO: renamed from: h */
    abstract boolean mo5557h();

    @Override // java.util.Map
    public int hashCode() {
        return AbstractC1286y.m5615b(entrySet());
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public AbstractC1274m keySet() {
        AbstractC1274m abstractC1274m = this.f4527b;
        if (abstractC1274m != null) {
            return abstractC1274m;
        }
        AbstractC1274m abstractC1274mMo5554e = mo5554e();
        this.f4527b = abstractC1274mMo5554e;
        return abstractC1274mMo5554e;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public AbstractC1271j values() {
        AbstractC1271j abstractC1271j = this.f4528c;
        if (abstractC1271j != null) {
            return abstractC1271j;
        }
        AbstractC1271j abstractC1271jMo5555f = mo5555f();
        this.f4528c = abstractC1271jMo5555f;
        return abstractC1271jMo5555f;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return AbstractC1278q.m5592b(this);
    }
}
