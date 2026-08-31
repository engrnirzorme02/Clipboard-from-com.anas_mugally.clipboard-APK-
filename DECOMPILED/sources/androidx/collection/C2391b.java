package androidx.collection;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p152T5.AbstractC1631j;
import p152T5.AbstractC1638q;
import p246f6.InterfaceC5443b;
import p353t.AbstractC7065a;

/* JADX INFO: renamed from: androidx.collection.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2391b implements Collection, Set, InterfaceC5443b {

    /* JADX INFO: renamed from: a */
    private int[] f8459a;

    /* JADX INFO: renamed from: b */
    private Object[] f8460b;

    /* JADX INFO: renamed from: c */
    private int f8461c;

    /* JADX INFO: renamed from: androidx.collection.b$a */
    private final class a extends AbstractC2396g {
        public a() {
            super(C2391b.this.m10265k());
        }

        @Override // androidx.collection.AbstractC2396g
        /* JADX INFO: renamed from: a */
        protected Object mo10258a(int i7) {
            return C2391b.this.m10270v(i7);
        }

        @Override // androidx.collection.AbstractC2396g
        /* JADX INFO: renamed from: b */
        protected void mo10259b(int i7) {
            C2391b.this.m10266m(i7);
        }
    }

    public C2391b() {
        this(0, 1, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m10261a(int i7) {
        int iM10265k = m10265k();
        if (m10263e().length < i7) {
            int[] iArrM10263e = m10263e();
            Object[] objArrM10262b = m10262b();
            AbstractC2393d.m10272a(this, i7);
            if (m10265k() > 0) {
                AbstractC1631j.m6696i(iArrM10263e, m10263e(), 0, 0, m10265k(), 6, null);
                AbstractC1631j.m6697j(objArrM10262b, m10262b(), 0, 0, m10265k(), 6, null);
            }
        }
        if (m10265k() != iM10265k) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        int i7;
        int iM10274c;
        int iM10265k = m10265k();
        if (obj == null) {
            iM10274c = AbstractC2393d.m10275d(this);
            i7 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i7 = iHashCode;
            iM10274c = AbstractC2393d.m10274c(this, obj, iHashCode);
        }
        if (iM10274c >= 0) {
            return false;
        }
        int i8 = ~iM10274c;
        if (iM10265k >= m10263e().length) {
            int i9 = 8;
            if (iM10265k >= 8) {
                i9 = (iM10265k >> 1) + iM10265k;
            } else if (iM10265k < 4) {
                i9 = 4;
            }
            int[] iArrM10263e = m10263e();
            Object[] objArrM10262b = m10262b();
            AbstractC2393d.m10272a(this, i9);
            if (iM10265k != m10265k()) {
                throw new ConcurrentModificationException();
            }
            if (!(m10263e().length == 0)) {
                AbstractC1631j.m6696i(iArrM10263e, m10263e(), 0, 0, iArrM10263e.length, 6, null);
                AbstractC1631j.m6697j(objArrM10262b, m10262b(), 0, 0, objArrM10262b.length, 6, null);
            }
        }
        if (i8 < iM10265k) {
            int i10 = i8 + 1;
            AbstractC1631j.m6692e(m10263e(), m10263e(), i10, i8, iM10265k);
            AbstractC1631j.m6694g(m10262b(), m10262b(), i10, i8, iM10265k);
        }
        if (iM10265k != m10265k() || i8 >= m10263e().length) {
            throw new ConcurrentModificationException();
        }
        m10263e()[i8] = i7;
        m10262b()[i8] = obj;
        m10269q(m10265k() + 1);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection elements) {
        AbstractC6118n.m27187e(elements, "elements");
        m10261a(m10265k() + elements.size());
        Iterator it = elements.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    /* JADX INFO: renamed from: b */
    public final Object[] m10262b() {
        return this.f8460b;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        if (m10265k() != 0) {
            m10268p(AbstractC7065a.f28224a);
            m10267n(AbstractC7065a.f28226c);
            m10269q(0);
        }
        if (m10265k() != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection elements) {
        AbstractC6118n.m27187e(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final int[] m10263e() {
        return this.f8459a;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || size() != ((Set) obj).size()) {
            return false;
        }
        try {
            int iM10265k = m10265k();
            for (int i7 = 0; i7 < iM10265k; i7++) {
                if (!((Set) obj).contains(m10270v(i7))) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: g */
    public int m10264g() {
        return this.f8461c;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArrM10263e = m10263e();
        int iM10265k = m10265k();
        int i7 = 0;
        for (int i8 = 0; i8 < iM10265k; i8++) {
            i7 += iArrM10263e[i8];
        }
        return i7;
    }

    public final int indexOf(Object obj) {
        return obj == null ? AbstractC2393d.m10275d(this) : AbstractC2393d.m10274c(this, obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return m10265k() <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new a();
    }

    /* JADX INFO: renamed from: k */
    public final int m10265k() {
        return this.f8461c;
    }

    /* JADX INFO: renamed from: m */
    public final Object m10266m(int i7) {
        int i8;
        Object[] objArr;
        int iM10265k = m10265k();
        Object obj = m10262b()[i7];
        if (iM10265k <= 1) {
            clear();
            return obj;
        }
        int i9 = iM10265k - 1;
        if (m10263e().length <= 8 || m10265k() >= m10263e().length / 3) {
            if (i7 < i9) {
                int i10 = i7 + 1;
                AbstractC1631j.m6692e(m10263e(), m10263e(), i7, i10, iM10265k);
                AbstractC1631j.m6694g(m10262b(), m10262b(), i7, i10, iM10265k);
            }
            m10262b()[i9] = null;
        } else {
            int iM10265k2 = m10265k() > 8 ? m10265k() + (m10265k() >> 1) : 8;
            int[] iArrM10263e = m10263e();
            Object[] objArrM10262b = m10262b();
            AbstractC2393d.m10272a(this, iM10265k2);
            if (i7 > 0) {
                AbstractC1631j.m6696i(iArrM10263e, m10263e(), 0, 0, i7, 6, null);
                objArr = objArrM10262b;
                AbstractC1631j.m6697j(objArr, m10262b(), 0, 0, i7, 6, null);
                i8 = i7;
            } else {
                i8 = i7;
                objArr = objArrM10262b;
            }
            if (i8 < i9) {
                int i11 = i8 + 1;
                AbstractC1631j.m6692e(iArrM10263e, m10263e(), i8, i11, iM10265k);
                AbstractC1631j.m6694g(objArr, m10262b(), i8, i11, iM10265k);
            }
        }
        if (iM10265k != m10265k()) {
            throw new ConcurrentModificationException();
        }
        m10269q(i9);
        return obj;
    }

    /* JADX INFO: renamed from: n */
    public final void m10267n(Object[] objArr) {
        AbstractC6118n.m27187e(objArr, "<set-?>");
        this.f8460b = objArr;
    }

    /* JADX INFO: renamed from: p */
    public final void m10268p(int[] iArr) {
        AbstractC6118n.m27187e(iArr, "<set-?>");
        this.f8459a = iArr;
    }

    /* JADX INFO: renamed from: q */
    public final void m10269q(int i7) {
        this.f8461c = i7;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        m10266m(iIndexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection elements) {
        AbstractC6118n.m27187e(elements, "elements");
        Iterator it = elements.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection elements) {
        AbstractC6118n.m27187e(elements, "elements");
        boolean z7 = false;
        for (int iM10265k = m10265k() - 1; -1 < iM10265k; iM10265k--) {
            if (!AbstractC1638q.m6564D(elements, m10262b()[iM10265k])) {
                m10266m(iM10265k);
                z7 = true;
            }
        }
        return z7;
    }

    @Override // java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return m10264g();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return AbstractC1631j.m6699l(this.f8460b, 0, this.f8461c);
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(m10265k() * 14);
        sb.append('{');
        int iM10265k = m10265k();
        for (int i7 = 0; i7 < iM10265k; i7++) {
            if (i7 > 0) {
                sb.append(", ");
            }
            Object objM10270v = m10270v(i7);
            if (objM10270v != this) {
                sb.append(objM10270v);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        AbstractC6118n.m27186d(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    /* JADX INFO: renamed from: v */
    public final Object m10270v(int i7) {
        return m10262b()[i7];
    }

    public C2391b(int i7) {
        this.f8459a = AbstractC7065a.f28224a;
        this.f8460b = AbstractC7065a.f28226c;
        if (i7 > 0) {
            AbstractC2393d.m10272a(this, i7);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] array) {
        AbstractC6118n.m27187e(array, "array");
        Object[] result = AbstractC2392c.m10271a(array, this.f8461c);
        AbstractC1631j.m6694g(this.f8460b, result, 0, 0, this.f8461c);
        AbstractC6118n.m27186d(result, "result");
        return result;
    }

    public /* synthetic */ C2391b(int i7, int i8, AbstractC6112h abstractC6112h) {
        this((i8 & 1) != 0 ? 0 : i7);
    }
}
