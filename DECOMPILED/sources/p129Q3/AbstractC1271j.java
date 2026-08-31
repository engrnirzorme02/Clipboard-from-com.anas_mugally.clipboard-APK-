package p129Q3;

import com.google.android.gms.common.api.C3553a;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import p122P3.AbstractC1209m;

/* JADX INFO: renamed from: Q3.j */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1271j extends AbstractCollection implements Serializable {

    /* JADX INFO: renamed from: a */
    private static final Object[] f4516a = new Object[0];

    /* JADX INFO: renamed from: Q3.j$a */
    static abstract class a extends b {

        /* JADX INFO: renamed from: a */
        Object[] f4517a;

        /* JADX INFO: renamed from: b */
        int f4518b;

        /* JADX INFO: renamed from: c */
        boolean f4519c;

        a(int i7) {
            AbstractC1265d.m5509b(i7, "initialCapacity");
            this.f4517a = new Object[i7];
            this.f4518b = 0;
        }

        /* JADX INFO: renamed from: g */
        private void m5519g(int i7) {
            Object[] objArr = this.f4517a;
            if (objArr.length < i7) {
                this.f4517a = Arrays.copyOf(objArr, b.m5524c(objArr.length, i7));
                this.f4519c = false;
            } else if (this.f4519c) {
                this.f4517a = (Object[]) objArr.clone();
                this.f4519c = false;
            }
        }

        @Override // p129Q3.AbstractC1271j.b
        /* JADX INFO: renamed from: b */
        public b mo5520b(Iterable iterable) {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                m5519g(this.f4518b + collection.size());
                if (collection instanceof AbstractC1271j) {
                    this.f4518b = ((AbstractC1271j) collection).mo5514b(this.f4517a, this.f4518b);
                    return this;
                }
            }
            super.mo5520b(iterable);
            return this;
        }

        /* JADX INFO: renamed from: d */
        public a m5521d(Object obj) {
            AbstractC1209m.m5302n(obj);
            m5519g(this.f4518b + 1);
            Object[] objArr = this.f4517a;
            int i7 = this.f4518b;
            this.f4518b = i7 + 1;
            objArr[i7] = obj;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public b m5522e(Object... objArr) {
            m5523f(objArr, objArr.length);
            return this;
        }

        /* JADX INFO: renamed from: f */
        final void m5523f(Object[] objArr, int i7) {
            AbstractC1280s.m5600c(objArr, i7);
            m5519g(this.f4518b + i7);
            System.arraycopy(objArr, 0, this.f4517a, this.f4518b, i7);
            this.f4518b += i7;
        }
    }

    /* JADX INFO: renamed from: Q3.j$b */
    public static abstract class b {
        b() {
        }

        /* JADX INFO: renamed from: c */
        static int m5524c(int i7, int i8) {
            if (i8 < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int iHighestOneBit = i7 + (i7 >> 1) + 1;
            if (iHighestOneBit < i8) {
                iHighestOneBit = Integer.highestOneBit(i8 - 1) << 1;
            }
            return iHighestOneBit < 0 ? C3553a.e.API_PRIORITY_OTHER : iHighestOneBit;
        }

        /* JADX INFO: renamed from: a */
        public abstract b mo5525a(Object obj);

        /* JADX INFO: renamed from: b */
        public b mo5520b(Iterable iterable) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                mo5525a(it.next());
            }
            return this;
        }
    }

    AbstractC1271j() {
    }

    /* JADX INFO: renamed from: a */
    public abstract AbstractC1272k mo5513a();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: b */
    abstract int mo5514b(Object[] objArr, int i7);

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean contains(Object obj);

    /* JADX INFO: renamed from: e */
    Object[] mo5515e() {
        return null;
    }

    /* JADX INFO: renamed from: g */
    int mo5516g() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: j */
    int mo5517j() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: k */
    abstract boolean mo5518k();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f4516a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        AbstractC1209m.m5302n(objArr);
        int size = size();
        if (objArr.length < size) {
            Object[] objArrMo5515e = mo5515e();
            if (objArrMo5515e != null) {
                return AbstractC1282u.m5604a(objArrMo5515e, mo5517j(), mo5516g(), objArr);
            }
            objArr = AbstractC1280s.m5601d(objArr, size);
        } else if (objArr.length > size) {
            objArr[size] = null;
        }
        mo5514b(objArr, 0);
        return objArr;
    }
}
