package p129Q3;

/* JADX INFO: renamed from: Q3.x */
/* JADX INFO: loaded from: classes2.dex */
final class C1285x extends AbstractC1274m {

    /* JADX INFO: renamed from: s */
    private static final Object[] f4560s;

    /* JADX INFO: renamed from: t */
    static final C1285x f4561t;

    /* JADX INFO: renamed from: c */
    final transient Object[] f4562c;

    /* JADX INFO: renamed from: d */
    private final transient int f4563d;

    /* JADX INFO: renamed from: e */
    final transient Object[] f4564e;

    /* JADX INFO: renamed from: f */
    private final transient int f4565f;

    /* JADX INFO: renamed from: r */
    private final transient int f4566r;

    static {
        Object[] objArr = new Object[0];
        f4560s = objArr;
        f4561t = new C1285x(objArr, 0, objArr, 0, 0);
    }

    C1285x(Object[] objArr, int i7, Object[] objArr2, int i8, int i9) {
        this.f4562c = objArr;
        this.f4563d = i7;
        this.f4564e = objArr2;
        this.f4565f = i8;
        this.f4566r = i9;
    }

    @Override // p129Q3.AbstractC1271j
    /* JADX INFO: renamed from: b */
    int mo5514b(Object[] objArr, int i7) {
        System.arraycopy(this.f4562c, 0, objArr, i7, this.f4566r);
        return i7 + this.f4566r;
    }

    @Override // p129Q3.AbstractC1271j, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        Object[] objArr = this.f4564e;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int iM5512b = AbstractC1270i.m5512b(obj);
        while (true) {
            int i7 = iM5512b & this.f4565f;
            Object obj2 = objArr[i7];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iM5512b = i7 + 1;
        }
    }

    @Override // p129Q3.AbstractC1271j
    /* JADX INFO: renamed from: e */
    Object[] mo5515e() {
        return this.f4562c;
    }

    @Override // p129Q3.AbstractC1271j
    /* JADX INFO: renamed from: g */
    int mo5516g() {
        return this.f4566r;
    }

    @Override // p129Q3.AbstractC1274m, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f4563d;
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

    @Override // p129Q3.AbstractC1274m
    /* JADX INFO: renamed from: q */
    AbstractC1272k mo5579q() {
        return AbstractC1272k.m5532n(this.f4562c, this.f4566r);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f4566r;
    }

    @Override // p129Q3.AbstractC1274m
    /* JADX INFO: renamed from: v */
    boolean mo5580v() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public AbstractC1260B iterator() {
        return mo5513a().iterator();
    }
}
