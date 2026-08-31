package p152T5;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6111g;
import kotlin.jvm.internal.AbstractC6118n;
import p238e6.InterfaceC5367l;
import p246f6.InterfaceC5442a;

/* JADX INFO: renamed from: T5.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1623b implements Collection, InterfaceC5442a {
    protected AbstractC1623b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final CharSequence m6657e(AbstractC1623b abstractC1623b, Object obj) {
        return obj == abstractC1623b ? "(this Collection)" : String.valueOf(obj);
    }

    @Override // java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: b */
    public abstract int mo3154b();

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        if (isEmpty()) {
            return false;
        }
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            if (AbstractC6118n.m27183a(it.next(), obj)) {
                return true;
            }
        }
        return false;
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
        return size() == 0;
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
        return mo3154b();
    }

    @Override // java.util.Collection, java.util.List
    public Object[] toArray() {
        return AbstractC6111g.m27180a(this);
    }

    public String toString() {
        return AbstractC1603A.m6578R(this, ", ", "[", "]", 0, null, new InterfaceC5367l() { // from class: T5.a
            @Override // p238e6.InterfaceC5367l
            public final Object invoke(Object obj) {
                return AbstractC1623b.m6657e(this.f5386a, obj);
            }
        }, 24, null);
    }

    @Override // java.util.Collection, java.util.List
    public Object[] toArray(Object[] array) {
        AbstractC6118n.m27187e(array, "array");
        return AbstractC6111g.m27181b(this, array);
    }
}
