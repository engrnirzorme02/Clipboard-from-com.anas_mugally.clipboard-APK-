package p159U5;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p152T5.AbstractC1628g;
import p246f6.InterfaceC5443b;

/* JADX INFO: renamed from: U5.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1709h extends AbstractC1628g implements Set, Serializable, InterfaceC5443b {

    /* JADX INFO: renamed from: b */
    private static final a f5702b = new a(null);

    /* JADX INFO: renamed from: c */
    private static final C1709h f5703c = new C1709h(C1705d.f5677y.m7295e());

    /* JADX INFO: renamed from: a */
    private final C1705d f5704a;

    /* JADX INFO: renamed from: U5.h$a */
    private static final class a {
        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        private a() {
        }
    }

    public C1709h(C1705d backing) {
        AbstractC6118n.m27187e(backing, "backing");
        this.f5704a = backing;
    }

    @Override // p152T5.AbstractC1628g
    /* JADX INFO: renamed from: a */
    public int mo6673a() {
        return this.f5704a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        return this.f5704a.m7282i(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection elements) {
        AbstractC6118n.m27187e(elements, "elements");
        this.f5704a.m7284m();
        return super.addAll(elements);
    }

    /* JADX INFO: renamed from: b */
    public final Set m7308b() {
        this.f5704a.m7283l();
        return size() > 0 ? this : f5703c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f5704a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f5704a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f5704a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return this.f5704a.m7277D();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return this.f5704a.m7279M(obj);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection elements) {
        AbstractC6118n.m27187e(elements, "elements");
        this.f5704a.m7284m();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection elements) {
        AbstractC6118n.m27187e(elements, "elements");
        this.f5704a.m7284m();
        return super.retainAll(elements);
    }

    public C1709h() {
        this(new C1705d());
    }
}
