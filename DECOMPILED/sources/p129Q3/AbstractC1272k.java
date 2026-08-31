package p129Q3;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p122P3.AbstractC1209m;

/* JADX INFO: renamed from: Q3.k */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1272k extends AbstractC1271j implements List, RandomAccess {

    /* JADX INFO: renamed from: b */
    private static final AbstractC1261C f4520b = new b(C1283v.f4543e, 0);

    /* JADX INFO: renamed from: Q3.k$a */
    public static final class a extends AbstractC1271j.a {
        public a() {
            this(4);
        }

        @Override // p129Q3.AbstractC1271j.b
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public a mo5525a(Object obj) {
            super.m5521d(obj);
            return this;
        }

        /* JADX INFO: renamed from: i */
        public a m5543i(Object... objArr) {
            super.m5522e(objArr);
            return this;
        }

        /* JADX INFO: renamed from: j */
        public a m5544j(Iterable iterable) {
            super.mo5520b(iterable);
            return this;
        }

        /* JADX INFO: renamed from: k */
        public AbstractC1272k m5545k() {
            this.f4519c = true;
            return AbstractC1272k.m5532n(this.f4517a, this.f4518b);
        }

        a(int i7) {
            super(i7);
        }
    }

    /* JADX INFO: renamed from: Q3.k$b */
    static class b extends AbstractC1262a {

        /* JADX INFO: renamed from: c */
        private final AbstractC1272k f4521c;

        b(AbstractC1272k abstractC1272k, int i7) {
            super(abstractC1272k.size(), i7);
            this.f4521c = abstractC1272k;
        }

        @Override // p129Q3.AbstractC1262a
        /* JADX INFO: renamed from: a */
        protected Object mo5503a(int i7) {
            return this.f4521c.get(i7);
        }
    }

    /* JADX INFO: renamed from: Q3.k$c */
    class c extends AbstractC1272k {

        /* JADX INFO: renamed from: c */
        final transient int f4522c;

        /* JADX INFO: renamed from: d */
        final transient int f4523d;

        c(int i7, int i8) {
            this.f4522c = i7;
            this.f4523d = i8;
        }

        @Override // p129Q3.AbstractC1272k, java.util.List
        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public AbstractC1272k subList(int i7, int i8) {
            AbstractC1209m.m5307s(i7, i8, this.f4523d);
            AbstractC1272k abstractC1272k = AbstractC1272k.this;
            int i9 = this.f4522c;
            return abstractC1272k.subList(i7 + i9, i8 + i9);
        }

        @Override // p129Q3.AbstractC1271j
        /* JADX INFO: renamed from: e */
        Object[] mo5515e() {
            return AbstractC1272k.this.mo5515e();
        }

        @Override // p129Q3.AbstractC1271j
        /* JADX INFO: renamed from: g */
        int mo5516g() {
            return AbstractC1272k.this.mo5517j() + this.f4522c + this.f4523d;
        }

        @Override // java.util.List
        public Object get(int i7) {
            AbstractC1209m.m5300l(i7, this.f4523d);
            return AbstractC1272k.this.get(i7 + this.f4522c);
        }

        @Override // p129Q3.AbstractC1272k, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // p129Q3.AbstractC1271j
        /* JADX INFO: renamed from: j */
        int mo5517j() {
            return AbstractC1272k.this.mo5517j() + this.f4522c;
        }

        @Override // p129Q3.AbstractC1271j
        /* JADX INFO: renamed from: k */
        boolean mo5518k() {
            return true;
        }

        @Override // p129Q3.AbstractC1272k, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f4523d;
        }

        @Override // p129Q3.AbstractC1272k, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i7) {
            return super.listIterator(i7);
        }
    }

    AbstractC1272k() {
    }

    /* JADX INFO: renamed from: A */
    public static AbstractC1272k m5526A(Object obj) {
        return m5534q(obj);
    }

    /* JADX INFO: renamed from: B */
    public static AbstractC1272k m5527B(Object obj, Object obj2) {
        return m5534q(obj, obj2);
    }

    /* JADX INFO: renamed from: C */
    public static AbstractC1272k m5528C(Object obj, Object obj2, Object obj3) {
        return m5534q(obj, obj2, obj3);
    }

    /* JADX INFO: renamed from: D */
    public static AbstractC1272k m5529D(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return m5534q(obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    /* JADX INFO: renamed from: F */
    public static AbstractC1272k m5530F(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object... objArr) {
        AbstractC1209m.m5293e(objArr.length <= 2147483635, "the total number of elements must fit in an int");
        Object[] objArr2 = new Object[objArr.length + 12];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        objArr2[6] = obj7;
        objArr2[7] = obj8;
        objArr2[8] = obj9;
        objArr2[9] = obj10;
        objArr2[10] = obj11;
        objArr2[11] = obj12;
        System.arraycopy(objArr, 0, objArr2, 12, objArr.length);
        return m5534q(objArr2);
    }

    /* JADX INFO: renamed from: m */
    static AbstractC1272k m5531m(Object[] objArr) {
        return m5532n(objArr, objArr.length);
    }

    /* JADX INFO: renamed from: n */
    static AbstractC1272k m5532n(Object[] objArr, int i7) {
        return i7 == 0 ? m5536z() : new C1283v(objArr, i7);
    }

    /* JADX INFO: renamed from: p */
    public static a m5533p() {
        return new a();
    }

    /* JADX INFO: renamed from: q */
    private static AbstractC1272k m5534q(Object... objArr) {
        return m5531m(AbstractC1280s.m5599b(objArr));
    }

    /* JADX INFO: renamed from: v */
    public static AbstractC1272k m5535v(Collection collection) {
        if (!(collection instanceof AbstractC1271j)) {
            return m5534q(collection.toArray());
        }
        AbstractC1272k abstractC1272kMo5513a = ((AbstractC1271j) collection).mo5513a();
        return abstractC1272kMo5513a.mo5518k() ? m5531m(abstractC1272kMo5513a.toArray()) : abstractC1272kMo5513a;
    }

    /* JADX INFO: renamed from: z */
    public static AbstractC1272k m5536z() {
        return C1283v.f4543e;
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: I */
    public AbstractC1272k subList(int i7, int i8) {
        AbstractC1209m.m5307s(i7, i8, size());
        int i9 = i8 - i7;
        if (i9 == size()) {
            return this;
        }
        return i9 == 0 ? m5536z() : m5538K(i7, i8);
    }

    /* JADX INFO: renamed from: K */
    AbstractC1272k m5538K(int i7, int i8) {
        return new c(i7, i8 - i7);
    }

    @Override // p129Q3.AbstractC1271j
    /* JADX INFO: renamed from: a */
    public final AbstractC1272k mo5513a() {
        return this;
    }

    @Override // java.util.List
    public final void add(int i7, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i7, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // p129Q3.AbstractC1271j
    /* JADX INFO: renamed from: b */
    int mo5514b(Object[] objArr, int i7) {
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            objArr[i7 + i8] = get(i8);
        }
        return i7 + size;
    }

    @Override // p129Q3.AbstractC1271j, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return AbstractC1276o.m5585b(this, obj);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i7 = 1;
        for (int i8 = 0; i8 < size; i8++) {
            i7 = ~(~((i7 * 31) + get(i8).hashCode()));
        }
        return i7;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return AbstractC1276o.m5586c(this, obj);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return AbstractC1276o.m5588e(this, obj);
    }

    @Override // java.util.List
    public final Object remove(int i7) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i7, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public AbstractC1260B iterator() {
        return listIterator();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public AbstractC1261C listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public AbstractC1261C listIterator(int i7) {
        AbstractC1209m.m5305q(i7, size());
        return isEmpty() ? f4520b : new b(this, i7);
    }
}
