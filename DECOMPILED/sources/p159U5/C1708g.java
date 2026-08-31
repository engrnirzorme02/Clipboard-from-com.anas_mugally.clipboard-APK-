package p159U5;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6118n;
import p152T5.AbstractC1626e;
import p246f6.InterfaceC5443b;

/* JADX INFO: renamed from: U5.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1708g extends AbstractC1626e implements Collection, InterfaceC5443b {

    /* JADX INFO: renamed from: a */
    private final C1705d f5701a;

    public C1708g(C1705d backing) {
        AbstractC6118n.m27187e(backing, "backing");
        this.f5701a = backing;
    }

    @Override // p152T5.AbstractC1626e
    /* JADX INFO: renamed from: a */
    public int mo6670a() {
        return this.f5701a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection elements) {
        AbstractC6118n.m27187e(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f5701a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f5701a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.f5701a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return this.f5701a.m7281P();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        return this.f5701a.m7280N(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection elements) {
        AbstractC6118n.m27187e(elements, "elements");
        this.f5701a.m7284m();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection elements) {
        AbstractC6118n.m27187e(elements, "elements");
        this.f5701a.m7284m();
        return super.retainAll(elements);
    }
}
