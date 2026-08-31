package p350s4;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: s4.a */
/* JADX INFO: loaded from: classes.dex */
public class C7007a extends AbstractC7009c {

    /* JADX INFO: renamed from: a */
    private final Object[] f28015a;

    /* JADX INFO: renamed from: b */
    private final Object[] f28016b;

    /* JADX INFO: renamed from: c */
    private final Comparator f28017c;

    /* JADX INFO: renamed from: s4.a$a */
    class a implements Iterator {

        /* JADX INFO: renamed from: a */
        int f28018a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f28019b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ boolean f28020c;

        a(int i7, boolean z7) {
            this.f28019b = i7;
            this.f28020c = z7;
            this.f28018a = i7;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            Object obj = C7007a.this.f28015a[this.f28018a];
            Object[] objArr = C7007a.this.f28016b;
            int i7 = this.f28018a;
            Object obj2 = objArr[i7];
            this.f28018a = this.f28020c ? i7 - 1 : i7 + 1;
            return new AbstractMap.SimpleImmutableEntry(obj, obj2);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f28020c) {
                return this.f28018a >= 0;
            }
            return this.f28018a < C7007a.this.f28015a.length;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Can't remove elements from ImmutableSortedMap");
        }
    }

    public C7007a(Comparator comparator) {
        this.f28015a = new Object[0];
        this.f28016b = new Object[0];
        this.f28017c = comparator;
    }

    /* JADX INFO: renamed from: A */
    private int m30587A(Object obj) {
        int i7 = 0;
        while (true) {
            Object[] objArr = this.f28015a;
            if (i7 >= objArr.length || this.f28017c.compare(objArr[i7], obj) >= 0) {
                break;
            }
            i7++;
        }
        return i7;
    }

    /* JADX INFO: renamed from: B */
    public static C7007a m30588B(Map map, Comparator comparator) {
        return m30595y(new ArrayList(map.keySet()), map, AbstractC7009c.a.m30614e(), comparator);
    }

    /* JADX INFO: renamed from: C */
    private Iterator m30589C(int i7, boolean z7) {
        return new a(i7, z7);
    }

    /* JADX INFO: renamed from: D */
    private static Object[] m30590D(Object[] objArr, int i7) {
        int length = objArr.length - 1;
        Object[] objArr2 = new Object[length];
        System.arraycopy(objArr, 0, objArr2, 0, i7);
        System.arraycopy(objArr, i7 + 1, objArr2, i7, length - i7);
        return objArr2;
    }

    /* JADX INFO: renamed from: F */
    private static Object[] m30591F(Object[] objArr, int i7, Object obj) {
        int length = objArr.length;
        Object[] objArr2 = new Object[length];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        objArr2[i7] = obj;
        return objArr2;
    }

    /* JADX INFO: renamed from: x */
    private static Object[] m30594x(Object[] objArr, int i7, Object obj) {
        int length = objArr.length + 1;
        Object[] objArr2 = new Object[length];
        System.arraycopy(objArr, 0, objArr2, 0, i7);
        objArr2[i7] = obj;
        System.arraycopy(objArr, i7, objArr2, i7 + 1, (length - i7) - 1);
        return objArr2;
    }

    /* JADX INFO: renamed from: y */
    public static C7007a m30595y(List list, Map map, AbstractC7009c.a.InterfaceC7722a interfaceC7722a, Comparator comparator) {
        Collections.sort(list, comparator);
        int size = list.size();
        Object[] objArr = new Object[size];
        Object[] objArr2 = new Object[size];
        int i7 = 0;
        for (Object obj : list) {
            objArr[i7] = obj;
            objArr2[i7] = map.get(interfaceC7722a.mo30609a(obj));
            i7++;
        }
        return new C7007a(comparator, objArr, objArr2);
    }

    /* JADX INFO: renamed from: z */
    private int m30596z(Object obj) {
        int i7 = 0;
        for (Object obj2 : this.f28015a) {
            if (this.f28017c.compare(obj, obj2) == 0) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    @Override // p350s4.AbstractC7009c
    /* JADX INFO: renamed from: Q */
    public Iterator mo30597Q() {
        return m30589C(this.f28015a.length - 1, true);
    }

    @Override // p350s4.AbstractC7009c
    /* JADX INFO: renamed from: a */
    public boolean mo30598a(Object obj) {
        return m30596z(obj) != -1;
    }

    @Override // p350s4.AbstractC7009c
    /* JADX INFO: renamed from: b */
    public Object mo30599b(Object obj) {
        int iM30596z = m30596z(obj);
        if (iM30596z != -1) {
            return this.f28016b[iM30596z];
        }
        return null;
    }

    @Override // p350s4.AbstractC7009c
    /* JADX INFO: renamed from: e */
    public Comparator mo30600e() {
        return this.f28017c;
    }

    @Override // p350s4.AbstractC7009c
    /* JADX INFO: renamed from: g */
    public Object mo30601g() {
        Object[] objArr = this.f28015a;
        if (objArr.length > 0) {
            return objArr[objArr.length - 1];
        }
        return null;
    }

    @Override // p350s4.AbstractC7009c
    public boolean isEmpty() {
        return this.f28015a.length == 0;
    }

    @Override // p350s4.AbstractC7009c, java.lang.Iterable
    public Iterator iterator() {
        return m30589C(0, false);
    }

    @Override // p350s4.AbstractC7009c
    /* JADX INFO: renamed from: j */
    public Object mo30602j() {
        Object[] objArr = this.f28015a;
        if (objArr.length > 0) {
            return objArr[0];
        }
        return null;
    }

    @Override // p350s4.AbstractC7009c
    /* JADX INFO: renamed from: k */
    public Object mo30603k(Object obj) {
        int iM30596z = m30596z(obj);
        if (iM30596z == -1) {
            throw new IllegalArgumentException("Can't find predecessor of nonexistent key");
        }
        if (iM30596z > 0) {
            return this.f28015a[iM30596z - 1];
        }
        return null;
    }

    @Override // p350s4.AbstractC7009c
    /* JADX INFO: renamed from: m */
    public void mo30604m(InterfaceC7014h.b bVar) {
        int i7 = 0;
        while (true) {
            Object[] objArr = this.f28015a;
            if (i7 >= objArr.length) {
                return;
            }
            bVar.mo1017a(objArr[i7], this.f28016b[i7]);
            i7++;
        }
    }

    @Override // p350s4.AbstractC7009c
    /* JADX INFO: renamed from: n */
    public AbstractC7009c mo30605n(Object obj, Object obj2) {
        int iM30596z = m30596z(obj);
        if (iM30596z != -1) {
            Object[] objArr = this.f28015a;
            if (objArr[iM30596z] == obj && this.f28016b[iM30596z] == obj2) {
                return this;
            }
            return new C7007a(this.f28017c, m30591F(objArr, iM30596z, obj), m30591F(this.f28016b, iM30596z, obj2));
        }
        if (this.f28015a.length <= 25) {
            int iM30587A = m30587A(obj);
            return new C7007a(this.f28017c, m30594x(this.f28015a, iM30587A, obj), m30594x(this.f28016b, iM30587A, obj2));
        }
        HashMap map = new HashMap(this.f28015a.length + 1);
        int i7 = 0;
        while (true) {
            Object[] objArr2 = this.f28015a;
            if (i7 >= objArr2.length) {
                map.put(obj, obj2);
                return C7017k.m30647w(map, this.f28017c);
            }
            map.put(objArr2[i7], this.f28016b[i7]);
            i7++;
        }
    }

    @Override // p350s4.AbstractC7009c
    /* JADX INFO: renamed from: p */
    public Iterator mo30606p(Object obj) {
        return m30589C(m30587A(obj), false);
    }

    @Override // p350s4.AbstractC7009c
    /* JADX INFO: renamed from: q */
    public AbstractC7009c mo30607q(Object obj) {
        int iM30596z = m30596z(obj);
        if (iM30596z == -1) {
            return this;
        }
        return new C7007a(this.f28017c, m30590D(this.f28015a, iM30596z), m30590D(this.f28016b, iM30596z));
    }

    @Override // p350s4.AbstractC7009c
    public int size() {
        return this.f28015a.length;
    }

    private C7007a(Comparator comparator, Object[] objArr, Object[] objArr2) {
        this.f28015a = objArr;
        this.f28016b = objArr2;
        this.f28017c = comparator;
    }
}
