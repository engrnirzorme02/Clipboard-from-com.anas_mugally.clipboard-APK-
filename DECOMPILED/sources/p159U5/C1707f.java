package p159U5;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6118n;
import p152T5.AbstractC1628g;
import p246f6.InterfaceC5443b;

/* JADX INFO: renamed from: U5.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1707f extends AbstractC1628g implements Set, InterfaceC5443b {

    /* JADX INFO: renamed from: a */
    private final C1705d f5700a;

    public C1707f(C1705d backing) {
        AbstractC6118n.m27187e(backing, "backing");
        this.f5700a = backing;
    }

    @Override // p152T5.AbstractC1628g
    /* JADX INFO: renamed from: a */
    public int mo6673a() {
        return this.f5700a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection elements) {
        AbstractC6118n.m27187e(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f5700a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f5700a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f5700a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return this.f5700a.m7277D();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return this.f5700a.m7279M(obj);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection elements) {
        AbstractC6118n.m27187e(elements, "elements");
        this.f5700a.m7284m();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection elements) {
        AbstractC6118n.m27187e(elements, "elements");
        this.f5700a.m7284m();
        return super.retainAll(elements);
    }
}
