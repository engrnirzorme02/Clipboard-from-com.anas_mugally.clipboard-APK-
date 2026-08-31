package p152T5;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6107c;
import kotlin.jvm.internal.AbstractC6111g;
import kotlin.jvm.internal.AbstractC6118n;
import p246f6.InterfaceC5442a;

/* JADX INFO: renamed from: T5.h */
/* JADX INFO: loaded from: classes.dex */
final class C1629h implements Collection, InterfaceC5442a {

    /* JADX INFO: renamed from: a */
    private final Object[] f5396a;

    /* JADX INFO: renamed from: b */
    private final boolean f5397b;

    public C1629h(Object[] values, boolean z7) {
        AbstractC6118n.m27187e(values, "values");
        this.f5396a = values;
        this.f5397b = z7;
    }

    /* JADX INFO: renamed from: a */
    public int m6674a() {
        return this.f5396a.length;
    }

    @Override // java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return AbstractC1635n.m6744q(this.f5396a, obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection elements) {
        AbstractC6118n.m27187e(elements, "elements");
        if (elements.isEmpty()) {
            return true;
        }
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f5396a.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return AbstractC6107c.m27171a(this.f5396a);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return m6674a();
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] array) {
        AbstractC6118n.m27187e(array, "array");
        return AbstractC6111g.m27181b(this, array);
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return AbstractC1639r.m6757b(this.f5396a, this.f5397b);
    }
}
