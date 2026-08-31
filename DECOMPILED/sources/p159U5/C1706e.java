package p159U5;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: U5.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1706e extends AbstractC1702a {

    /* JADX INFO: renamed from: a */
    private final C1705d f5699a;

    public C1706e(C1705d backing) {
        AbstractC6118n.m27187e(backing, "backing");
        this.f5699a = backing;
    }

    @Override // p152T5.AbstractC1628g
    /* JADX INFO: renamed from: a */
    public int mo6673a() {
        return this.f5699a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection elements) {
        AbstractC6118n.m27187e(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f5699a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection elements) {
        AbstractC6118n.m27187e(elements, "elements");
        return this.f5699a.m7285o(elements);
    }

    @Override // p159U5.AbstractC1702a
    /* JADX INFO: renamed from: e */
    public boolean mo7200e(Map.Entry element) {
        AbstractC6118n.m27187e(element, "element");
        return this.f5699a.m7286p(element);
    }

    @Override // p159U5.AbstractC1702a
    /* JADX INFO: renamed from: g */
    public boolean mo7201g(Map.Entry element) {
        AbstractC6118n.m27187e(element, "element");
        return this.f5699a.m7278J(element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f5699a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return this.f5699a.m7287t();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public boolean add(Map.Entry element) {
        AbstractC6118n.m27187e(element, "element");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection elements) {
        AbstractC6118n.m27187e(elements, "elements");
        this.f5699a.m7284m();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection elements) {
        AbstractC6118n.m27187e(elements, "elements");
        this.f5699a.m7284m();
        return super.retainAll(elements);
    }
}
