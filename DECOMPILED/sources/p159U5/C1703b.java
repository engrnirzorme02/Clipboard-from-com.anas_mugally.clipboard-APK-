package p159U5;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p152T5.AbstractC1625d;
import p152T5.AbstractC1627f;
import p152T5.AbstractC1631j;
import p152T5.AbstractC1638q;
import p246f6.InterfaceC5442a;
import p246f6.InterfaceC5444c;

/* JADX INFO: renamed from: U5.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1703b extends AbstractC1627f implements List, RandomAccess, Serializable, InterfaceC5444c {

    /* JADX INFO: renamed from: d */
    private static final b f5659d = new b(null);

    /* JADX INFO: renamed from: e */
    private static final C1703b f5660e;

    /* JADX INFO: renamed from: a */
    private Object[] f5661a;

    /* JADX INFO: renamed from: b */
    private int f5662b;

    /* JADX INFO: renamed from: c */
    private boolean f5663c;

    /* JADX INFO: renamed from: U5.b$a */
    public static final class a extends AbstractC1627f implements List, RandomAccess, Serializable, InterfaceC5444c {

        /* JADX INFO: renamed from: a */
        private Object[] f5664a;

        /* JADX INFO: renamed from: b */
        private final int f5665b;

        /* JADX INFO: renamed from: c */
        private int f5666c;

        /* JADX INFO: renamed from: d */
        private final a f5667d;

        /* JADX INFO: renamed from: e */
        private final C1703b f5668e;

        /* JADX INFO: renamed from: U5.b$a$a, reason: collision with other inner class name */
        private static final class C7648a implements ListIterator, InterfaceC5442a {

            /* JADX INFO: renamed from: a */
            private final a f5669a;

            /* JADX INFO: renamed from: b */
            private int f5670b;

            /* JADX INFO: renamed from: c */
            private int f5671c;

            /* JADX INFO: renamed from: d */
            private int f5672d;

            public C7648a(a list, int i7) {
                AbstractC6118n.m27187e(list, "list");
                this.f5669a = list;
                this.f5670b = i7;
                this.f5671c = -1;
                this.f5672d = ((AbstractList) list).modCount;
            }

            /* JADX INFO: renamed from: a */
            private final void m7238a() {
                if (((AbstractList) this.f5669a.f5668e).modCount != this.f5672d) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.ListIterator
            public void add(Object obj) {
                m7238a();
                a aVar = this.f5669a;
                int i7 = this.f5670b;
                this.f5670b = i7 + 1;
                aVar.add(i7, obj);
                this.f5671c = -1;
                this.f5672d = ((AbstractList) this.f5669a).modCount;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
                return this.f5670b < this.f5669a.f5666c;
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return this.f5670b > 0;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public Object next() {
                m7238a();
                if (this.f5670b >= this.f5669a.f5666c) {
                    throw new NoSuchElementException();
                }
                int i7 = this.f5670b;
                this.f5670b = i7 + 1;
                this.f5671c = i7;
                return this.f5669a.f5664a[this.f5669a.f5665b + this.f5671c];
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return this.f5670b;
            }

            @Override // java.util.ListIterator
            public Object previous() {
                m7238a();
                int i7 = this.f5670b;
                if (i7 <= 0) {
                    throw new NoSuchElementException();
                }
                int i8 = i7 - 1;
                this.f5670b = i8;
                this.f5671c = i8;
                return this.f5669a.f5664a[this.f5669a.f5665b + this.f5671c];
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return this.f5670b - 1;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
                m7238a();
                int i7 = this.f5671c;
                if (i7 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                this.f5669a.remove(i7);
                this.f5670b = this.f5671c;
                this.f5671c = -1;
                this.f5672d = ((AbstractList) this.f5669a).modCount;
            }

            @Override // java.util.ListIterator
            public void set(Object obj) {
                m7238a();
                int i7 = this.f5671c;
                if (i7 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                this.f5669a.set(i7, obj);
            }
        }

        public a(Object[] backing, int i7, int i8, a aVar, C1703b root) {
            AbstractC6118n.m27187e(backing, "backing");
            AbstractC6118n.m27187e(root, "root");
            this.f5664a = backing;
            this.f5665b = i7;
            this.f5666c = i8;
            this.f5667d = aVar;
            this.f5668e = root;
            ((AbstractList) this).modCount = ((AbstractList) root).modCount;
        }

        /* JADX INFO: renamed from: A */
        private final Object m7223A(int i7) {
            m7237z();
            a aVar = this.f5667d;
            Object objM7223A = aVar != null ? aVar.m7223A(i7) : this.f5668e.m7208K(i7);
            this.f5666c--;
            return objM7223A;
        }

        /* JADX INFO: renamed from: B */
        private final void m7224B(int i7, int i8) {
            if (i8 > 0) {
                m7237z();
            }
            a aVar = this.f5667d;
            if (aVar != null) {
                aVar.m7224B(i7, i8);
            } else {
                this.f5668e.m7209O(i7, i8);
            }
            this.f5666c -= i8;
        }

        /* JADX INFO: renamed from: C */
        private final int m7225C(int i7, int i8, Collection collection, boolean z7) {
            a aVar = this.f5667d;
            int iM7225C = aVar != null ? aVar.m7225C(i7, i8, collection, z7) : this.f5668e.m7210P(i7, i8, collection, z7);
            if (iM7225C > 0) {
                m7237z();
            }
            this.f5666c -= iM7225C;
            return iM7225C;
        }

        /* JADX INFO: renamed from: p */
        private final void m7231p(int i7, Collection collection, int i8) {
            m7237z();
            a aVar = this.f5667d;
            if (aVar != null) {
                aVar.m7231p(i7, collection, i8);
            } else {
                this.f5668e.m7220x(i7, collection, i8);
            }
            this.f5664a = this.f5668e.f5661a;
            this.f5666c += i8;
        }

        /* JADX INFO: renamed from: q */
        private final void m7232q(int i7, Object obj) {
            m7237z();
            a aVar = this.f5667d;
            if (aVar != null) {
                aVar.m7232q(i7, obj);
            } else {
                this.f5668e.m7221y(i7, obj);
            }
            this.f5664a = this.f5668e.f5661a;
            this.f5666c++;
        }

        /* JADX INFO: renamed from: v */
        private final void m7233v() {
            if (((AbstractList) this.f5668e).modCount != ((AbstractList) this).modCount) {
                throw new ConcurrentModificationException();
            }
        }

        /* JADX INFO: renamed from: w */
        private final void m7234w() {
            if (m7236y()) {
                throw new UnsupportedOperationException();
            }
        }

        /* JADX INFO: renamed from: x */
        private final boolean m7235x(List list) {
            return AbstractC1704c.m7247h(this.f5664a, this.f5665b, this.f5666c, list);
        }

        /* JADX INFO: renamed from: y */
        private final boolean m7236y() {
            return this.f5668e.f5663c;
        }

        /* JADX INFO: renamed from: z */
        private final void m7237z() {
            ((AbstractList) this).modCount++;
        }

        @Override // p152T5.AbstractC1627f
        /* JADX INFO: renamed from: a */
        public int mo6671a() {
            m7233v();
            return this.f5666c;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean add(Object obj) {
            m7234w();
            m7233v();
            m7232q(this.f5665b + this.f5666c, obj);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean addAll(Collection elements) {
            AbstractC6118n.m27187e(elements, "elements");
            m7234w();
            m7233v();
            int size = elements.size();
            m7231p(this.f5665b + this.f5666c, elements, size);
            return size > 0;
        }

        @Override // p152T5.AbstractC1627f
        /* JADX INFO: renamed from: b */
        public Object mo6672b(int i7) {
            m7234w();
            m7233v();
            AbstractC1625d.f5389a.m6662b(i7, this.f5666c);
            return m7223A(this.f5665b + i7);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            m7234w();
            m7233v();
            m7224B(this.f5665b, this.f5666c);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            m7233v();
            if (obj != this) {
                return (obj instanceof List) && m7235x((List) obj);
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public Object get(int i7) {
            m7233v();
            AbstractC1625d.f5389a.m6662b(i7, this.f5666c);
            return this.f5664a[this.f5665b + i7];
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            m7233v();
            return AbstractC1704c.m7248i(this.f5664a, this.f5665b, this.f5666c);
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            m7233v();
            for (int i7 = 0; i7 < this.f5666c; i7++) {
                if (AbstractC6118n.m27183a(this.f5664a[this.f5665b + i7], obj)) {
                    return i7;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            m7233v();
            return this.f5666c == 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator iterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            m7233v();
            for (int i7 = this.f5666c - 1; i7 >= 0; i7--) {
                if (AbstractC6118n.m27183a(this.f5664a[this.f5665b + i7], obj)) {
                    return i7;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator listIterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean remove(Object obj) {
            m7234w();
            m7233v();
            int iIndexOf = indexOf(obj);
            if (iIndexOf >= 0) {
                remove(iIndexOf);
            }
            return iIndexOf >= 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean removeAll(Collection elements) {
            AbstractC6118n.m27187e(elements, "elements");
            m7234w();
            m7233v();
            return m7225C(this.f5665b, this.f5666c, elements, false) > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean retainAll(Collection elements) {
            AbstractC6118n.m27187e(elements, "elements");
            m7234w();
            m7233v();
            return m7225C(this.f5665b, this.f5666c, elements, true) > 0;
        }

        @Override // java.util.AbstractList, java.util.List
        public Object set(int i7, Object obj) {
            m7234w();
            m7233v();
            AbstractC1625d.f5389a.m6662b(i7, this.f5666c);
            Object[] objArr = this.f5664a;
            int i8 = this.f5665b;
            Object obj2 = objArr[i8 + i7];
            objArr[i8 + i7] = obj;
            return obj2;
        }

        @Override // java.util.AbstractList, java.util.List
        public List subList(int i7, int i8) {
            AbstractC1625d.f5389a.m6664d(i7, i8, this.f5666c);
            return new a(this.f5664a, this.f5665b + i7, i8 - i7, this, this.f5668e);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public Object[] toArray(Object[] array) {
            AbstractC6118n.m27187e(array, "array");
            m7233v();
            int length = array.length;
            int i7 = this.f5666c;
            if (length >= i7) {
                Object[] objArr = this.f5664a;
                int i8 = this.f5665b;
                AbstractC1631j.m6694g(objArr, array, 0, i8, i7 + i8);
                return AbstractC1638q.m6761f(this.f5666c, array);
            }
            Object[] objArr2 = this.f5664a;
            int i9 = this.f5665b;
            Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr2, i9, i7 + i9, array.getClass());
            AbstractC6118n.m27186d(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            m7233v();
            return AbstractC1704c.m7249j(this.f5664a, this.f5665b, this.f5666c, this);
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator listIterator(int i7) {
            m7233v();
            AbstractC1625d.f5389a.m6663c(i7, this.f5666c);
            return new C7648a(this, i7);
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int i7, Object obj) {
            m7234w();
            m7233v();
            AbstractC1625d.f5389a.m6663c(i7, this.f5666c);
            m7232q(this.f5665b + i7, obj);
        }

        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int i7, Collection elements) {
            AbstractC6118n.m27187e(elements, "elements");
            m7234w();
            m7233v();
            AbstractC1625d.f5389a.m6663c(i7, this.f5666c);
            int size = elements.size();
            m7231p(this.f5665b + i7, elements, size);
            return size > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public Object[] toArray() {
            m7233v();
            Object[] objArr = this.f5664a;
            int i7 = this.f5665b;
            return AbstractC1631j.m6699l(objArr, i7, this.f5666c + i7);
        }
    }

    /* JADX INFO: renamed from: U5.b$b */
    private static final class b {
        public /* synthetic */ b(AbstractC6112h abstractC6112h) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: U5.b$c */
    private static final class c implements ListIterator, InterfaceC5442a {

        /* JADX INFO: renamed from: a */
        private final C1703b f5673a;

        /* JADX INFO: renamed from: b */
        private int f5674b;

        /* JADX INFO: renamed from: c */
        private int f5675c;

        /* JADX INFO: renamed from: d */
        private int f5676d;

        public c(C1703b list, int i7) {
            AbstractC6118n.m27187e(list, "list");
            this.f5673a = list;
            this.f5674b = i7;
            this.f5675c = -1;
            this.f5676d = ((AbstractList) list).modCount;
        }

        /* JADX INFO: renamed from: a */
        private final void m7239a() {
            if (((AbstractList) this.f5673a).modCount != this.f5676d) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            m7239a();
            C1703b c1703b = this.f5673a;
            int i7 = this.f5674b;
            this.f5674b = i7 + 1;
            c1703b.add(i7, obj);
            this.f5675c = -1;
            this.f5676d = ((AbstractList) this.f5673a).modCount;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f5674b < this.f5673a.f5662b;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f5674b > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            m7239a();
            if (this.f5674b >= this.f5673a.f5662b) {
                throw new NoSuchElementException();
            }
            int i7 = this.f5674b;
            this.f5674b = i7 + 1;
            this.f5675c = i7;
            return this.f5673a.f5661a[this.f5675c];
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f5674b;
        }

        @Override // java.util.ListIterator
        public Object previous() {
            m7239a();
            int i7 = this.f5674b;
            if (i7 <= 0) {
                throw new NoSuchElementException();
            }
            int i8 = i7 - 1;
            this.f5674b = i8;
            this.f5675c = i8;
            return this.f5673a.f5661a[this.f5675c];
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f5674b - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            m7239a();
            int i7 = this.f5675c;
            if (i7 == -1) {
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
            }
            this.f5673a.remove(i7);
            this.f5674b = this.f5675c;
            this.f5675c = -1;
            this.f5676d = ((AbstractList) this.f5673a).modCount;
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            m7239a();
            int i7 = this.f5675c;
            if (i7 == -1) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
            }
            this.f5673a.set(i7, obj);
        }
    }

    static {
        C1703b c1703b = new C1703b(0);
        c1703b.f5663c = true;
        f5660e = c1703b;
    }

    public C1703b(int i7) {
        this.f5661a = AbstractC1704c.m7243d(i7);
    }

    /* JADX INFO: renamed from: A */
    private final void m7202A() {
        if (this.f5663c) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: B */
    private final boolean m7203B(List list) {
        return AbstractC1704c.m7247h(this.f5661a, 0, this.f5662b, list);
    }

    /* JADX INFO: renamed from: C */
    private final void m7204C(int i7) {
        if (i7 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f5661a;
        if (i7 > objArr.length) {
            this.f5661a = AbstractC1704c.m7244e(this.f5661a, AbstractC1625d.f5389a.m6665e(objArr.length, i7));
        }
    }

    /* JADX INFO: renamed from: D */
    private final void m7205D(int i7) {
        m7204C(this.f5662b + i7);
    }

    /* JADX INFO: renamed from: F */
    private final void m7206F(int i7, int i8) {
        m7205D(i8);
        Object[] objArr = this.f5661a;
        AbstractC1631j.m6694g(objArr, objArr, i7 + i8, i7, this.f5662b);
        this.f5662b += i8;
    }

    /* JADX INFO: renamed from: I */
    private final void m7207I() {
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public final Object m7208K(int i7) {
        m7207I();
        Object[] objArr = this.f5661a;
        Object obj = objArr[i7];
        AbstractC1631j.m6694g(objArr, objArr, i7, i7 + 1, this.f5662b);
        AbstractC1704c.m7245f(this.f5661a, this.f5662b - 1);
        this.f5662b--;
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public final void m7209O(int i7, int i8) {
        if (i8 > 0) {
            m7207I();
        }
        Object[] objArr = this.f5661a;
        AbstractC1631j.m6694g(objArr, objArr, i7, i7 + i8, this.f5662b);
        Object[] objArr2 = this.f5661a;
        int i9 = this.f5662b;
        AbstractC1704c.m7246g(objArr2, i9 - i8, i9);
        this.f5662b -= i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public final int m7210P(int i7, int i8, Collection collection, boolean z7) {
        int i9 = 0;
        int i10 = 0;
        while (i9 < i8) {
            int i11 = i7 + i9;
            if (collection.contains(this.f5661a[i11]) == z7) {
                Object[] objArr = this.f5661a;
                i9++;
                objArr[i10 + i7] = objArr[i11];
                i10++;
            } else {
                i9++;
            }
        }
        int i12 = i8 - i10;
        Object[] objArr2 = this.f5661a;
        AbstractC1631j.m6694g(objArr2, objArr2, i7 + i10, i8 + i7, this.f5662b);
        Object[] objArr3 = this.f5661a;
        int i13 = this.f5662b;
        AbstractC1704c.m7246g(objArr3, i13 - i12, i13);
        if (i12 > 0) {
            m7207I();
        }
        this.f5662b -= i12;
        return i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public final void m7220x(int i7, Collection collection, int i8) {
        m7207I();
        m7206F(i7, i8);
        Iterator it = collection.iterator();
        for (int i9 = 0; i9 < i8; i9++) {
            this.f5661a[i7 + i9] = it.next();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public final void m7221y(int i7, Object obj) {
        m7207I();
        m7206F(i7, 1);
        this.f5661a[i7] = obj;
    }

    @Override // p152T5.AbstractC1627f
    /* JADX INFO: renamed from: a */
    public int mo6671a() {
        return this.f5662b;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        m7202A();
        m7221y(this.f5662b, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection elements) {
        AbstractC6118n.m27187e(elements, "elements");
        m7202A();
        int size = elements.size();
        m7220x(this.f5662b, elements, size);
        return size > 0;
    }

    @Override // p152T5.AbstractC1627f
    /* JADX INFO: renamed from: b */
    public Object mo6672b(int i7) {
        m7202A();
        AbstractC1625d.f5389a.m6662b(i7, this.f5662b);
        return m7208K(i7);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        m7202A();
        m7209O(0, this.f5662b);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof List) && m7203B((List) obj);
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i7) {
        AbstractC1625d.f5389a.m6662b(i7, this.f5662b);
        return this.f5661a[i7];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        return AbstractC1704c.m7248i(this.f5661a, 0, this.f5662b);
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        for (int i7 = 0; i7 < this.f5662b; i7++) {
            if (AbstractC6118n.m27183a(this.f5661a[i7], obj)) {
                return i7;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.f5662b == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        for (int i7 = this.f5662b - 1; i7 >= 0; i7--) {
            if (AbstractC6118n.m27183a(this.f5661a[i7], obj)) {
                return i7;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        m7202A();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            remove(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection elements) {
        AbstractC6118n.m27187e(elements, "elements");
        m7202A();
        return m7210P(0, this.f5662b, elements, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection elements) {
        AbstractC6118n.m27187e(elements, "elements");
        m7202A();
        return m7210P(0, this.f5662b, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i7, Object obj) {
        m7202A();
        AbstractC1625d.f5389a.m6662b(i7, this.f5662b);
        Object[] objArr = this.f5661a;
        Object obj2 = objArr[i7];
        objArr[i7] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public List subList(int i7, int i8) {
        AbstractC1625d.f5389a.m6664d(i7, i8, this.f5662b);
        return new a(this.f5661a, i7, i8 - i7, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] array) {
        AbstractC6118n.m27187e(array, "array");
        int length = array.length;
        int i7 = this.f5662b;
        if (length >= i7) {
            AbstractC1631j.m6694g(this.f5661a, array, 0, 0, i7);
            return AbstractC1638q.m6761f(this.f5662b, array);
        }
        Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f5661a, 0, i7, array.getClass());
        AbstractC6118n.m27186d(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return AbstractC1704c.m7249j(this.f5661a, 0, this.f5662b, this);
    }

    /* JADX INFO: renamed from: z */
    public final List m7222z() {
        m7202A();
        this.f5663c = true;
        return this.f5662b > 0 ? this : f5660e;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i7) {
        AbstractC1625d.f5389a.m6663c(i7, this.f5662b);
        return new c(this, i7);
    }

    public /* synthetic */ C1703b(int i7, int i8, AbstractC6112h abstractC6112h) {
        this((i8 & 1) != 0 ? 10 : i7);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i7, Object obj) {
        m7202A();
        AbstractC1625d.f5389a.m6663c(i7, this.f5662b);
        m7221y(i7, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i7, Collection elements) {
        AbstractC6118n.m27187e(elements, "elements");
        m7202A();
        AbstractC1625d.f5389a.m6663c(i7, this.f5662b);
        int size = elements.size();
        m7220x(i7, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return AbstractC1631j.m6699l(this.f5661a, 0, this.f5662b);
    }
}
