package p129Q3;

import p122P3.AbstractC1209m;

/* JADX INFO: renamed from: Q3.z */
/* JADX INFO: loaded from: classes2.dex */
final class C1287z extends AbstractC1274m {

    /* JADX INFO: renamed from: c */
    final transient Object f4572c;

    C1287z(Object obj) {
        this.f4572c = AbstractC1209m.m5302n(obj);
    }

    @Override // p129Q3.AbstractC1274m, p129Q3.AbstractC1271j
    /* JADX INFO: renamed from: a */
    public AbstractC1272k mo5513a() {
        return AbstractC1272k.m5526A(this.f4572c);
    }

    @Override // p129Q3.AbstractC1271j
    /* JADX INFO: renamed from: b */
    int mo5514b(Object[] objArr, int i7) {
        objArr[i7] = this.f4572c;
        return i7 + 1;
    }

    @Override // p129Q3.AbstractC1271j, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f4572c.equals(obj);
    }

    @Override // p129Q3.AbstractC1274m, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f4572c.hashCode();
    }

    @Override // p129Q3.AbstractC1271j
    /* JADX INFO: renamed from: k */
    boolean mo5518k() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return '[' + this.f4572c.toString() + ']';
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: w */
    public AbstractC1260B iterator() {
        return AbstractC1275n.m5583b(this.f4572c);
    }
}
