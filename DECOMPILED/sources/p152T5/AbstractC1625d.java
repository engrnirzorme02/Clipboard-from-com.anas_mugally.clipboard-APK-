package p152T5;

import com.google.android.gms.common.api.C3553a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p246f6.InterfaceC5442a;

/* JADX INFO: renamed from: T5.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1625d extends AbstractC1623b implements List, InterfaceC5442a {

    /* JADX INFO: renamed from: a */
    public static final a f5389a = new a(null);

    /* JADX INFO: renamed from: T5.d$a */
    public static final class a {
        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final void m6661a(int i7, int i8, int i9) {
            if (i7 < 0 || i8 > i9) {
                throw new IndexOutOfBoundsException("startIndex: " + i7 + ", endIndex: " + i8 + ", size: " + i9);
            }
            if (i7 <= i8) {
                return;
            }
            throw new IllegalArgumentException("startIndex: " + i7 + " > endIndex: " + i8);
        }

        /* JADX INFO: renamed from: b */
        public final void m6662b(int i7, int i8) {
            if (i7 < 0 || i7 >= i8) {
                throw new IndexOutOfBoundsException("index: " + i7 + ", size: " + i8);
            }
        }

        /* JADX INFO: renamed from: c */
        public final void m6663c(int i7, int i8) {
            if (i7 < 0 || i7 > i8) {
                throw new IndexOutOfBoundsException("index: " + i7 + ", size: " + i8);
            }
        }

        /* JADX INFO: renamed from: d */
        public final void m6664d(int i7, int i8, int i9) {
            if (i7 < 0 || i8 > i9) {
                throw new IndexOutOfBoundsException("fromIndex: " + i7 + ", toIndex: " + i8 + ", size: " + i9);
            }
            if (i7 <= i8) {
                return;
            }
            throw new IllegalArgumentException("fromIndex: " + i7 + " > toIndex: " + i8);
        }

        /* JADX INFO: renamed from: e */
        public final int m6665e(int i7, int i8) {
            int i9 = i7 + (i7 >> 1);
            if (i9 - i8 < 0) {
                i9 = i8;
            }
            if (i9 - 2147483639 <= 0) {
                return i9;
            }
            if (i8 > 2147483639) {
                return C3553a.e.API_PRIORITY_OTHER;
            }
            return 2147483639;
        }

        /* JADX INFO: renamed from: f */
        public final boolean m6666f(Collection c7, Collection other) {
            AbstractC6118n.m27187e(c7, "c");
            AbstractC6118n.m27187e(other, "other");
            if (c7.size() != other.size()) {
                return false;
            }
            Iterator it = other.iterator();
            Iterator it2 = c7.iterator();
            while (it2.hasNext()) {
                if (!AbstractC6118n.m27183a(it2.next(), it.next())) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: renamed from: g */
        public final int m6667g(Collection c7) {
            AbstractC6118n.m27187e(c7, "c");
            Iterator it = c7.iterator();
            int iHashCode = 1;
            while (it.hasNext()) {
                Object next = it.next();
                iHashCode = (iHashCode * 31) + (next != null ? next.hashCode() : 0);
            }
            return iHashCode;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: T5.d$b */
    private class b implements Iterator, InterfaceC5442a {

        /* JADX INFO: renamed from: a */
        private int f5390a;

        public b() {
        }

        /* JADX INFO: renamed from: a */
        protected final int m6668a() {
            return this.f5390a;
        }

        /* JADX INFO: renamed from: b */
        protected final void m6669b(int i7) {
            this.f5390a = i7;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f5390a < AbstractC1625d.this.size();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            AbstractC1625d abstractC1625d = AbstractC1625d.this;
            int i7 = this.f5390a;
            this.f5390a = i7 + 1;
            return abstractC1625d.get(i7);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: renamed from: T5.d$c */
    private class c extends b implements ListIterator, InterfaceC5442a {
        public c(int i7) {
            super();
            AbstractC1625d.f5389a.m6663c(i7, AbstractC1625d.this.size());
            m6669b(i7);
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return m6668a() > 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return m6668a();
        }

        @Override // java.util.ListIterator
        public Object previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            AbstractC1625d abstractC1625d = AbstractC1625d.this;
            m6669b(m6668a() - 1);
            return abstractC1625d.get(m6668a());
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return m6668a() - 1;
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: renamed from: T5.d$d */
    private static final class d extends AbstractC1625d implements RandomAccess {

        /* JADX INFO: renamed from: b */
        private final AbstractC1625d f5393b;

        /* JADX INFO: renamed from: c */
        private final int f5394c;

        /* JADX INFO: renamed from: d */
        private int f5395d;

        public d(AbstractC1625d list, int i7, int i8) {
            AbstractC6118n.m27187e(list, "list");
            this.f5393b = list;
            this.f5394c = i7;
            AbstractC1625d.f5389a.m6664d(i7, i8, list.size());
            this.f5395d = i8 - i7;
        }

        @Override // p152T5.AbstractC1623b
        /* JADX INFO: renamed from: b */
        public int mo3154b() {
            return this.f5395d;
        }

        @Override // p152T5.AbstractC1625d, java.util.List
        public Object get(int i7) {
            AbstractC1625d.f5389a.m6662b(i7, this.f5395d);
            return this.f5393b.get(this.f5394c + i7);
        }
    }

    protected AbstractC1625d() {
    }

    @Override // java.util.List
    public void add(int i7, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i7, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            return f5389a.m6666f(this, (Collection) obj);
        }
        return false;
    }

    public abstract Object get(int i7);

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return f5389a.m6667g(this);
    }

    public int indexOf(Object obj) {
        Iterator it = iterator();
        int i7 = 0;
        while (it.hasNext()) {
            if (AbstractC6118n.m27183a(it.next(), obj)) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new b();
    }

    public int lastIndexOf(Object obj) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (AbstractC6118n.m27183a(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return new c(0);
    }

    @Override // java.util.List
    public Object remove(int i7) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public Object set(int i7, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List subList(int i7, int i8) {
        return new d(this, i7, i8);
    }

    @Override // java.util.List
    public ListIterator listIterator(int i7) {
        return new c(i7);
    }
}
