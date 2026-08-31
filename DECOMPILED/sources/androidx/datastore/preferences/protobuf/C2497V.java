package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.V */
/* JADX INFO: loaded from: classes.dex */
final class C2497V extends AbstractC2506c implements RandomAccess {

    /* JADX INFO: renamed from: d */
    private static final C2497V f9475d = new C2497V(new Object[0], 0, false);

    /* JADX INFO: renamed from: b */
    private Object[] f9476b;

    /* JADX INFO: renamed from: c */
    private int f9477c;

    private C2497V(Object[] objArr, int i7, boolean z7) {
        super(z7);
        this.f9476b = objArr;
        this.f9477c = i7;
    }

    /* JADX INFO: renamed from: b */
    private static Object[] m10988b(int i7) {
        return new Object[i7];
    }

    /* JADX INFO: renamed from: e */
    public static C2497V m10989e() {
        return f9475d;
    }

    /* JADX INFO: renamed from: g */
    private void m10990g(int i7) {
        if (i7 < 0 || i7 >= this.f9477c) {
            throw new IndexOutOfBoundsException(m10991j(i7));
        }
    }

    /* JADX INFO: renamed from: j */
    private String m10991j(int i7) {
        return "Index:" + i7 + ", Size:" + this.f9477c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        m11125a();
        int i7 = this.f9477c;
        Object[] objArr = this.f9476b;
        if (i7 == objArr.length) {
            this.f9476b = Arrays.copyOf(objArr, ((i7 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f9476b;
        int i8 = this.f9477c;
        this.f9477c = i8 + 1;
        objArr2[i8] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i7) {
        m10990g(i7);
        return this.f9476b[i7];
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2534u.b
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public C2497V mo10992d(int i7) {
        if (i7 >= this.f9477c) {
            return new C2497V(Arrays.copyOf(this.f9476b, i7), this.f9477c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2506c, java.util.AbstractList, java.util.List
    public Object remove(int i7) {
        m11125a();
        m10990g(i7);
        Object[] objArr = this.f9476b;
        Object obj = objArr[i7];
        int i8 = this.f9477c;
        if (i7 < i8 - 1) {
            System.arraycopy(objArr, i7 + 1, objArr, i7, (i8 - i7) - 1);
        }
        this.f9477c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i7, Object obj) {
        m11125a();
        m10990g(i7);
        Object[] objArr = this.f9476b;
        Object obj2 = objArr[i7];
        objArr[i7] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f9477c;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i7, Object obj) {
        int i8;
        m11125a();
        if (i7 >= 0 && i7 <= (i8 = this.f9477c)) {
            Object[] objArr = this.f9476b;
            if (i8 < objArr.length) {
                System.arraycopy(objArr, i7, objArr, i7 + 1, i8 - i7);
            } else {
                Object[] objArrM10988b = m10988b(((i8 * 3) / 2) + 1);
                System.arraycopy(this.f9476b, 0, objArrM10988b, 0, i7);
                System.arraycopy(this.f9476b, i7, objArrM10988b, i7 + 1, this.f9477c - i7);
                this.f9476b = objArrM10988b;
            }
            this.f9476b[i7] = obj;
            this.f9477c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m10991j(i7));
    }
}
