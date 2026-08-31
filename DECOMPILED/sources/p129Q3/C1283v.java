package p129Q3;

import java.util.Objects;
import p122P3.AbstractC1209m;

/* JADX INFO: renamed from: Q3.v */
/* JADX INFO: loaded from: classes2.dex */
class C1283v extends AbstractC1272k {

    /* JADX INFO: renamed from: e */
    static final AbstractC1272k f4543e = new C1283v(new Object[0], 0);

    /* JADX INFO: renamed from: c */
    final transient Object[] f4544c;

    /* JADX INFO: renamed from: d */
    private final transient int f4545d;

    C1283v(Object[] objArr, int i7) {
        this.f4544c = objArr;
        this.f4545d = i7;
    }

    @Override // p129Q3.AbstractC1272k, p129Q3.AbstractC1271j
    /* JADX INFO: renamed from: b */
    int mo5514b(Object[] objArr, int i7) {
        System.arraycopy(this.f4544c, 0, objArr, i7, this.f4545d);
        return i7 + this.f4545d;
    }

    @Override // p129Q3.AbstractC1271j
    /* JADX INFO: renamed from: e */
    Object[] mo5515e() {
        return this.f4544c;
    }

    @Override // p129Q3.AbstractC1271j
    /* JADX INFO: renamed from: g */
    int mo5516g() {
        return this.f4545d;
    }

    @Override // java.util.List
    public Object get(int i7) {
        AbstractC1209m.m5300l(i7, this.f4545d);
        Object obj = this.f4544c[i7];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // p129Q3.AbstractC1271j
    /* JADX INFO: renamed from: j */
    int mo5517j() {
        return 0;
    }

    @Override // p129Q3.AbstractC1271j
    /* JADX INFO: renamed from: k */
    boolean mo5518k() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f4545d;
    }
}
