package p152T5;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p278j6.AbstractC5905g;

/* JADX INFO: renamed from: T5.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1630i extends AbstractC1627f {

    /* JADX INFO: renamed from: d */
    public static final a f5398d = new a(null);

    /* JADX INFO: renamed from: e */
    private static final Object[] f5399e = new Object[0];

    /* JADX INFO: renamed from: a */
    private int f5400a;

    /* JADX INFO: renamed from: b */
    private Object[] f5401b = f5399e;

    /* JADX INFO: renamed from: c */
    private int f5402c;

    /* JADX INFO: renamed from: T5.i$a */
    public static final class a {
        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: A */
    private final void m6675A(int i7, int i8) {
        int iM6683v = m6683v(this.f5400a + i8);
        int iM6683v2 = m6683v(this.f5400a + i7);
        int size = size();
        while (true) {
            size -= i8;
            if (size <= 0) {
                return;
            }
            Object[] objArr = this.f5401b;
            i8 = Math.min(size, Math.min(objArr.length - iM6683v, objArr.length - iM6683v2));
            Object[] objArr2 = this.f5401b;
            int i9 = iM6683v + i8;
            AbstractC1634m.m6694g(objArr2, objArr2, iM6683v2, iM6683v, i9);
            iM6683v = m6683v(i9);
            iM6683v2 = m6683v(iM6683v2 + i8);
        }
    }

    /* JADX INFO: renamed from: e */
    private final void m6676e(int i7, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f5401b.length;
        while (i7 < length && it.hasNext()) {
            this.f5401b[i7] = it.next();
            i7++;
        }
        int i8 = this.f5400a;
        for (int i9 = 0; i9 < i8 && it.hasNext(); i9++) {
            this.f5401b[i9] = it.next();
        }
        this.f5402c = size() + collection.size();
    }

    /* JADX INFO: renamed from: g */
    private final void m6677g(int i7) {
        Object[] objArr = new Object[i7];
        Object[] objArr2 = this.f5401b;
        AbstractC1634m.m6694g(objArr2, objArr, 0, this.f5400a, objArr2.length);
        Object[] objArr3 = this.f5401b;
        int length = objArr3.length;
        int i8 = this.f5400a;
        AbstractC1634m.m6694g(objArr3, objArr, length - i8, 0, i8);
        this.f5400a = 0;
        this.f5401b = objArr;
    }

    /* JADX INFO: renamed from: k */
    private final int m6678k(int i7) {
        return i7 == 0 ? AbstractC1635n.m6749v(this.f5401b) : i7 - 1;
    }

    /* JADX INFO: renamed from: m */
    private final void m6679m(int i7) {
        if (i7 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f5401b;
        if (i7 <= objArr.length) {
            return;
        }
        if (objArr == f5399e) {
            this.f5401b = new Object[AbstractC5905g.m26654b(i7, 10)];
        } else {
            m6677g(AbstractC1625d.f5389a.m6665e(objArr.length, i7));
        }
    }

    /* JADX INFO: renamed from: n */
    private final int m6680n(int i7) {
        if (i7 == AbstractC1635n.m6749v(this.f5401b)) {
            return 0;
        }
        return i7 + 1;
    }

    /* JADX INFO: renamed from: p */
    private final int m6681p(int i7) {
        return i7 < 0 ? i7 + this.f5401b.length : i7;
    }

    /* JADX INFO: renamed from: q */
    private final void m6682q(int i7, int i8) {
        if (i7 < i8) {
            AbstractC1634m.m6700m(this.f5401b, null, i7, i8);
            return;
        }
        Object[] objArr = this.f5401b;
        AbstractC1634m.m6700m(objArr, null, i7, objArr.length);
        AbstractC1634m.m6700m(this.f5401b, null, 0, i8);
    }

    /* JADX INFO: renamed from: v */
    private final int m6683v(int i7) {
        Object[] objArr = this.f5401b;
        return i7 >= objArr.length ? i7 - objArr.length : i7;
    }

    /* JADX INFO: renamed from: w */
    private final void m6684w() {
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: renamed from: z */
    private final void m6685z(int i7, int i8) {
        int iM6683v = m6683v(this.f5400a + (i7 - 1));
        int iM6683v2 = m6683v(this.f5400a + (i8 - 1));
        while (i7 > 0) {
            int i9 = iM6683v + 1;
            int iMin = Math.min(i7, Math.min(i9, iM6683v2 + 1));
            Object[] objArr = this.f5401b;
            int i10 = iM6683v2 - iMin;
            int i11 = iM6683v - iMin;
            AbstractC1634m.m6694g(objArr, objArr, i10 + 1, i11 + 1, i9);
            iM6683v = m6681p(i11);
            iM6683v2 = m6681p(i10);
            i7 -= iMin;
        }
    }

    @Override // p152T5.AbstractC1627f
    /* JADX INFO: renamed from: a */
    public int mo6671a() {
        return this.f5402c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection elements) {
        AbstractC6118n.m27187e(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        m6684w();
        m6679m(size() + elements.size());
        m6676e(m6683v(this.f5400a + size()), elements);
        return true;
    }

    public final void addFirst(Object obj) {
        m6684w();
        m6679m(size() + 1);
        int iM6678k = m6678k(this.f5400a);
        this.f5400a = iM6678k;
        this.f5401b[iM6678k] = obj;
        this.f5402c = size() + 1;
    }

    public final void addLast(Object obj) {
        m6684w();
        m6679m(size() + 1);
        this.f5401b[m6683v(this.f5400a + size())] = obj;
        this.f5402c = size() + 1;
    }

    @Override // p152T5.AbstractC1627f
    /* JADX INFO: renamed from: b */
    public Object mo6672b(int i7) {
        AbstractC1625d.f5389a.m6662b(i7, size());
        if (i7 == AbstractC1640s.m6766k(this)) {
            return removeLast();
        }
        if (i7 == 0) {
            return removeFirst();
        }
        m6684w();
        int iM6683v = m6683v(this.f5400a + i7);
        Object obj = this.f5401b[iM6683v];
        if (i7 < (size() >> 1)) {
            int i8 = this.f5400a;
            if (iM6683v >= i8) {
                Object[] objArr = this.f5401b;
                AbstractC1634m.m6694g(objArr, objArr, i8 + 1, i8, iM6683v);
            } else {
                Object[] objArr2 = this.f5401b;
                AbstractC1634m.m6694g(objArr2, objArr2, 1, 0, iM6683v);
                Object[] objArr3 = this.f5401b;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i9 = this.f5400a;
                AbstractC1634m.m6694g(objArr3, objArr3, i9 + 1, i9, objArr3.length - 1);
            }
            Object[] objArr4 = this.f5401b;
            int i10 = this.f5400a;
            objArr4[i10] = null;
            this.f5400a = m6680n(i10);
        } else {
            int iM6683v2 = m6683v(this.f5400a + AbstractC1640s.m6766k(this));
            if (iM6683v <= iM6683v2) {
                Object[] objArr5 = this.f5401b;
                AbstractC1634m.m6694g(objArr5, objArr5, iM6683v, iM6683v + 1, iM6683v2 + 1);
            } else {
                Object[] objArr6 = this.f5401b;
                AbstractC1634m.m6694g(objArr6, objArr6, iM6683v, iM6683v + 1, objArr6.length);
                Object[] objArr7 = this.f5401b;
                objArr7[objArr7.length - 1] = objArr7[0];
                AbstractC1634m.m6694g(objArr7, objArr7, 0, 1, iM6683v2 + 1);
            }
            this.f5401b[iM6683v2] = null;
        }
        this.f5402c = size() - 1;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (!isEmpty()) {
            m6684w();
            m6682q(this.f5400a, m6683v(this.f5400a + size()));
        }
        this.f5400a = 0;
        this.f5402c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i7) {
        AbstractC1625d.f5389a.m6662b(i7, size());
        return this.f5401b[m6683v(this.f5400a + i7)];
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int i7;
        int iM6683v = m6683v(this.f5400a + size());
        int length = this.f5400a;
        if (length < iM6683v) {
            while (length < iM6683v) {
                if (AbstractC6118n.m27183a(obj, this.f5401b[length])) {
                    i7 = this.f5400a;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iM6683v) {
            return -1;
        }
        int length2 = this.f5401b.length;
        while (length < length2) {
            if (AbstractC6118n.m27183a(obj, this.f5401b[length])) {
                i7 = this.f5400a;
            } else {
                length++;
            }
        }
        for (int i8 = 0; i8 < iM6683v; i8++) {
            if (AbstractC6118n.m27183a(obj, this.f5401b[i8])) {
                length = i8 + this.f5401b.length;
                i7 = this.f5400a;
            }
        }
        return -1;
        return length - i7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int iM6749v;
        int i7;
        int iM6683v = m6683v(this.f5400a + size());
        int i8 = this.f5400a;
        if (i8 < iM6683v) {
            iM6749v = iM6683v - 1;
            if (i8 <= iM6749v) {
                while (!AbstractC6118n.m27183a(obj, this.f5401b[iM6749v])) {
                    if (iM6749v != i8) {
                        iM6749v--;
                    }
                }
                i7 = this.f5400a;
                return iM6749v - i7;
            }
            return -1;
        }
        if (i8 > iM6683v) {
            for (int i9 = iM6683v - 1; -1 < i9; i9--) {
                if (AbstractC6118n.m27183a(obj, this.f5401b[i9])) {
                    iM6749v = i9 + this.f5401b.length;
                    i7 = this.f5400a;
                    return iM6749v - i7;
                }
            }
            iM6749v = AbstractC1635n.m6749v(this.f5401b);
            int i10 = this.f5400a;
            if (i10 <= iM6749v) {
                while (!AbstractC6118n.m27183a(obj, this.f5401b[iM6749v])) {
                    if (iM6749v != i10) {
                        iM6749v--;
                    }
                }
                i7 = this.f5400a;
                return iM6749v - i7;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection elements) {
        int iM6683v;
        AbstractC6118n.m27187e(elements, "elements");
        boolean z7 = false;
        z7 = false;
        z7 = false;
        if (!isEmpty() && this.f5401b.length != 0) {
            int iM6683v2 = m6683v(this.f5400a + size());
            int i7 = this.f5400a;
            if (i7 < iM6683v2) {
                iM6683v = i7;
                while (i7 < iM6683v2) {
                    Object obj = this.f5401b[i7];
                    if (elements.contains(obj)) {
                        z7 = true;
                    } else {
                        this.f5401b[iM6683v] = obj;
                        iM6683v++;
                    }
                    i7++;
                }
                AbstractC1634m.m6700m(this.f5401b, null, iM6683v, iM6683v2);
            } else {
                int length = this.f5401b.length;
                boolean z8 = false;
                int i8 = i7;
                while (i7 < length) {
                    Object[] objArr = this.f5401b;
                    Object obj2 = objArr[i7];
                    objArr[i7] = null;
                    if (elements.contains(obj2)) {
                        z8 = true;
                    } else {
                        this.f5401b[i8] = obj2;
                        i8++;
                    }
                    i7++;
                }
                iM6683v = m6683v(i8);
                for (int i9 = 0; i9 < iM6683v2; i9++) {
                    Object[] objArr2 = this.f5401b;
                    Object obj3 = objArr2[i9];
                    objArr2[i9] = null;
                    if (elements.contains(obj3)) {
                        z8 = true;
                    } else {
                        this.f5401b[iM6683v] = obj3;
                        iM6683v = m6680n(iM6683v);
                    }
                }
                z7 = z8;
            }
            if (z7) {
                m6684w();
                this.f5402c = m6681p(iM6683v - this.f5400a);
            }
        }
        return z7;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        m6684w();
        Object[] objArr = this.f5401b;
        int i7 = this.f5400a;
        Object obj = objArr[i7];
        objArr[i7] = null;
        this.f5400a = m6680n(i7);
        this.f5402c = size() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        m6684w();
        int iM6683v = m6683v(this.f5400a + AbstractC1640s.m6766k(this));
        Object[] objArr = this.f5401b;
        Object obj = objArr[iM6683v];
        objArr[iM6683v] = null;
        this.f5402c = size() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i7, int i8) {
        AbstractC1625d.f5389a.m6664d(i7, i8, size());
        int i9 = i8 - i7;
        if (i9 == 0) {
            return;
        }
        if (i9 == size()) {
            clear();
            return;
        }
        if (i9 == 1) {
            remove(i7);
            return;
        }
        m6684w();
        if (i7 < size() - i8) {
            m6685z(i7, i8);
            int iM6683v = m6683v(this.f5400a + i9);
            m6682q(this.f5400a, iM6683v);
            this.f5400a = iM6683v;
        } else {
            m6675A(i7, i8);
            int iM6683v2 = m6683v(this.f5400a + size());
            m6682q(m6681p(iM6683v2 - i9), iM6683v2);
        }
        this.f5402c = size() - i9;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection elements) {
        int iM6683v;
        AbstractC6118n.m27187e(elements, "elements");
        boolean z7 = false;
        z7 = false;
        z7 = false;
        if (!isEmpty() && this.f5401b.length != 0) {
            int iM6683v2 = m6683v(this.f5400a + size());
            int i7 = this.f5400a;
            if (i7 < iM6683v2) {
                iM6683v = i7;
                while (i7 < iM6683v2) {
                    Object obj = this.f5401b[i7];
                    if (elements.contains(obj)) {
                        this.f5401b[iM6683v] = obj;
                        iM6683v++;
                    } else {
                        z7 = true;
                    }
                    i7++;
                }
                AbstractC1634m.m6700m(this.f5401b, null, iM6683v, iM6683v2);
            } else {
                int length = this.f5401b.length;
                boolean z8 = false;
                int i8 = i7;
                while (i7 < length) {
                    Object[] objArr = this.f5401b;
                    Object obj2 = objArr[i7];
                    objArr[i7] = null;
                    if (elements.contains(obj2)) {
                        this.f5401b[i8] = obj2;
                        i8++;
                    } else {
                        z8 = true;
                    }
                    i7++;
                }
                iM6683v = m6683v(i8);
                for (int i9 = 0; i9 < iM6683v2; i9++) {
                    Object[] objArr2 = this.f5401b;
                    Object obj3 = objArr2[i9];
                    objArr2[i9] = null;
                    if (elements.contains(obj3)) {
                        this.f5401b[iM6683v] = obj3;
                        iM6683v = m6680n(iM6683v);
                    } else {
                        z8 = true;
                    }
                }
                z7 = z8;
            }
            if (z7) {
                m6684w();
                this.f5402c = m6681p(iM6683v - this.f5400a);
            }
        }
        return z7;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i7, Object obj) {
        AbstractC1625d.f5389a.m6662b(i7, size());
        int iM6683v = m6683v(this.f5400a + i7);
        Object[] objArr = this.f5401b;
        Object obj2 = objArr[iM6683v];
        objArr[iM6683v] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] array) {
        AbstractC6118n.m27187e(array, "array");
        if (array.length < size()) {
            array = AbstractC1632k.m6688a(array, size());
        }
        Object[] objArr = array;
        int iM6683v = m6683v(this.f5400a + size());
        int i7 = this.f5400a;
        if (i7 < iM6683v) {
            AbstractC1634m.m6697j(this.f5401b, objArr, 0, i7, iM6683v, 2, null);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f5401b;
            AbstractC1634m.m6694g(objArr2, objArr, 0, this.f5400a, objArr2.length);
            Object[] objArr3 = this.f5401b;
            AbstractC1634m.m6694g(objArr3, objArr, objArr3.length - this.f5400a, 0, iM6683v);
        }
        return AbstractC1639r.m6761f(size(), objArr);
    }

    /* JADX INFO: renamed from: x */
    public final Object m6686x() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    /* JADX INFO: renamed from: y */
    public final Object m6687y() {
        if (isEmpty()) {
            return null;
        }
        return removeLast();
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i7, Object obj) {
        AbstractC1625d.f5389a.m6663c(i7, size());
        if (i7 == size()) {
            addLast(obj);
            return;
        }
        if (i7 == 0) {
            addFirst(obj);
            return;
        }
        m6684w();
        m6679m(size() + 1);
        int iM6683v = m6683v(this.f5400a + i7);
        if (i7 < ((size() + 1) >> 1)) {
            int iM6678k = m6678k(iM6683v);
            int iM6678k2 = m6678k(this.f5400a);
            int i8 = this.f5400a;
            if (iM6678k >= i8) {
                Object[] objArr = this.f5401b;
                objArr[iM6678k2] = objArr[i8];
                AbstractC1634m.m6694g(objArr, objArr, i8, i8 + 1, iM6678k + 1);
            } else {
                Object[] objArr2 = this.f5401b;
                AbstractC1634m.m6694g(objArr2, objArr2, i8 - 1, i8, objArr2.length);
                Object[] objArr3 = this.f5401b;
                objArr3[objArr3.length - 1] = objArr3[0];
                AbstractC1634m.m6694g(objArr3, objArr3, 0, 1, iM6678k + 1);
            }
            this.f5401b[iM6678k] = obj;
            this.f5400a = iM6678k2;
        } else {
            int iM6683v2 = m6683v(this.f5400a + size());
            if (iM6683v < iM6683v2) {
                Object[] objArr4 = this.f5401b;
                AbstractC1634m.m6694g(objArr4, objArr4, iM6683v + 1, iM6683v, iM6683v2);
            } else {
                Object[] objArr5 = this.f5401b;
                AbstractC1634m.m6694g(objArr5, objArr5, 1, 0, iM6683v2);
                Object[] objArr6 = this.f5401b;
                objArr6[0] = objArr6[objArr6.length - 1];
                AbstractC1634m.m6694g(objArr6, objArr6, iM6683v + 1, iM6683v, objArr6.length - 1);
            }
            this.f5401b[iM6683v] = obj;
        }
        this.f5402c = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i7, Collection elements) {
        AbstractC6118n.m27187e(elements, "elements");
        AbstractC1625d.f5389a.m6663c(i7, size());
        if (elements.isEmpty()) {
            return false;
        }
        if (i7 == size()) {
            return addAll(elements);
        }
        m6684w();
        m6679m(size() + elements.size());
        int iM6683v = m6683v(this.f5400a + size());
        int iM6683v2 = m6683v(this.f5400a + i7);
        int size = elements.size();
        if (i7 < ((size() + 1) >> 1)) {
            int i8 = this.f5400a;
            int length = i8 - size;
            if (iM6683v2 < i8) {
                Object[] objArr = this.f5401b;
                AbstractC1634m.m6694g(objArr, objArr, length, i8, objArr.length);
                if (size >= iM6683v2) {
                    Object[] objArr2 = this.f5401b;
                    AbstractC1634m.m6694g(objArr2, objArr2, objArr2.length - size, 0, iM6683v2);
                } else {
                    Object[] objArr3 = this.f5401b;
                    AbstractC1634m.m6694g(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f5401b;
                    AbstractC1634m.m6694g(objArr4, objArr4, 0, size, iM6683v2);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.f5401b;
                AbstractC1634m.m6694g(objArr5, objArr5, length, i8, iM6683v2);
            } else {
                Object[] objArr6 = this.f5401b;
                length += objArr6.length;
                int i9 = iM6683v2 - i8;
                int length2 = objArr6.length - length;
                if (length2 >= i9) {
                    AbstractC1634m.m6694g(objArr6, objArr6, length, i8, iM6683v2);
                } else {
                    AbstractC1634m.m6694g(objArr6, objArr6, length, i8, i8 + length2);
                    Object[] objArr7 = this.f5401b;
                    AbstractC1634m.m6694g(objArr7, objArr7, 0, this.f5400a + length2, iM6683v2);
                }
            }
            this.f5400a = length;
            m6676e(m6681p(iM6683v2 - size), elements);
        } else {
            int i10 = iM6683v2 + size;
            if (iM6683v2 < iM6683v) {
                int i11 = size + iM6683v;
                Object[] objArr8 = this.f5401b;
                if (i11 <= objArr8.length) {
                    AbstractC1634m.m6694g(objArr8, objArr8, i10, iM6683v2, iM6683v);
                } else if (i10 >= objArr8.length) {
                    AbstractC1634m.m6694g(objArr8, objArr8, i10 - objArr8.length, iM6683v2, iM6683v);
                } else {
                    int length3 = iM6683v - (i11 - objArr8.length);
                    AbstractC1634m.m6694g(objArr8, objArr8, 0, length3, iM6683v);
                    Object[] objArr9 = this.f5401b;
                    AbstractC1634m.m6694g(objArr9, objArr9, i10, iM6683v2, length3);
                }
            } else {
                Object[] objArr10 = this.f5401b;
                AbstractC1634m.m6694g(objArr10, objArr10, size, 0, iM6683v);
                Object[] objArr11 = this.f5401b;
                if (i10 >= objArr11.length) {
                    AbstractC1634m.m6694g(objArr11, objArr11, i10 - objArr11.length, iM6683v2, objArr11.length);
                } else {
                    AbstractC1634m.m6694g(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f5401b;
                    AbstractC1634m.m6694g(objArr12, objArr12, i10, iM6683v2, objArr12.length - size);
                }
            }
            m6676e(iM6683v2, elements);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
