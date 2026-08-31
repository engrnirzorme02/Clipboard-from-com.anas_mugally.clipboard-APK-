package com.google.protobuf;

import com.google.android.gms.common.api.C3553a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.protobuf.A */
/* JADX INFO: loaded from: classes.dex */
final class C5061A extends AbstractC5092c implements AbstractC5063B.d, RandomAccess, InterfaceC5099f0 {

    /* JADX INFO: renamed from: d */
    private static final C5061A f19254d = new C5061A(new int[0], 0, false);

    /* JADX INFO: renamed from: b */
    private int[] f19255b;

    /* JADX INFO: renamed from: c */
    private int f19256c;

    private C5061A(int[] iArr, int i7, boolean z7) {
        super(z7);
        this.f19255b = iArr;
        this.f19256c = i7;
    }

    /* JADX INFO: renamed from: j */
    private void m22818j(int i7, int i8) {
        int i9;
        m23082a();
        if (i7 < 0 || i7 > (i9 = this.f19256c)) {
            throw new IndexOutOfBoundsException(m22821q(i7));
        }
        int[] iArr = this.f19255b;
        if (i9 < iArr.length) {
            System.arraycopy(iArr, i7, iArr, i7 + 1, i9 - i7);
        } else {
            int[] iArr2 = new int[((i9 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i7);
            System.arraycopy(this.f19255b, i7, iArr2, i7 + 1, this.f19256c - i7);
            this.f19255b = iArr2;
        }
        this.f19255b[i7] = i8;
        this.f19256c++;
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: renamed from: k */
    public static C5061A m22819k() {
        return f19254d;
    }

    /* JADX INFO: renamed from: m */
    private void m22820m(int i7) {
        if (i7 < 0 || i7 >= this.f19256c) {
            throw new IndexOutOfBoundsException(m22821q(i7));
        }
    }

    /* JADX INFO: renamed from: q */
    private String m22821q(int i7) {
        return "Index:" + i7 + ", Size:" + this.f19256c;
    }

    @Override // com.google.protobuf.AbstractC5092c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        m23082a();
        AbstractC5063B.m22837a(collection);
        if (!(collection instanceof C5061A)) {
            return super.addAll(collection);
        }
        C5061A c5061a = (C5061A) collection;
        int i7 = c5061a.f19256c;
        if (i7 == 0) {
            return false;
        }
        int i8 = this.f19256c;
        if (C3553a.e.API_PRIORITY_OTHER - i8 < i7) {
            throw new OutOfMemoryError();
        }
        int i9 = i8 + i7;
        int[] iArr = this.f19255b;
        if (i9 > iArr.length) {
            this.f19255b = Arrays.copyOf(iArr, i9);
        }
        System.arraycopy(c5061a.f19255b, 0, this.f19255b, this.f19256c, c5061a.f19256c);
        this.f19256c = i9;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void add(int i7, Integer num) {
        m22818j(i7, num.intValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.protobuf.AbstractC5092c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean add(Integer num) {
        m22825g(num.intValue());
        return true;
    }

    @Override // com.google.protobuf.AbstractC5092c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5061A)) {
            return super.equals(obj);
        }
        C5061A c5061a = (C5061A) obj;
        if (this.f19256c != c5061a.f19256c) {
            return false;
        }
        int[] iArr = c5061a.f19255b;
        for (int i7 = 0; i7 < this.f19256c; i7++) {
            if (this.f19255b[i7] != iArr[i7]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public void m22825g(int i7) {
        m23082a();
        int i8 = this.f19256c;
        int[] iArr = this.f19255b;
        if (i8 == iArr.length) {
            int[] iArr2 = new int[((i8 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i8);
            this.f19255b = iArr2;
        }
        int[] iArr3 = this.f19255b;
        int i9 = this.f19256c;
        this.f19256c = i9 + 1;
        iArr3[i9] = i7;
    }

    @Override // com.google.protobuf.AbstractC5092c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i7 = 1;
        for (int i8 = 0; i8 < this.f19256c; i8++) {
            i7 = (i7 * 31) + this.f19255b[i8];
        }
        return i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int size = size();
        for (int i7 = 0; i7 < size; i7++) {
            if (this.f19255b[i7] == iIntValue) {
                return i7;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public Integer get(int i7) {
        return Integer.valueOf(m22827p(i7));
    }

    /* JADX INFO: renamed from: p */
    public int m22827p(int i7) {
        m22820m(i7);
        return this.f19255b[i7];
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i7, int i8) {
        m23082a();
        if (i8 < i7) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f19255b;
        System.arraycopy(iArr, i8, iArr, i7, this.f19256c - i8);
        this.f19256c -= i8 - i7;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f19256c;
    }

    @Override // com.google.protobuf.AbstractC5063B.e
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public AbstractC5063B.d mo22823d(int i7) {
        if (i7 >= this.f19256c) {
            return new C5061A(Arrays.copyOf(this.f19255b, i7), this.f19256c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC5092c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public Integer remove(int i7) {
        m23082a();
        m22820m(i7);
        int[] iArr = this.f19255b;
        int i8 = iArr[i7];
        int i9 = this.f19256c;
        if (i7 < i9 - 1) {
            System.arraycopy(iArr, i7 + 1, iArr, i7, (i9 - i7) - 1);
        }
        this.f19256c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i8);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public Integer set(int i7, Integer num) {
        return Integer.valueOf(m22831y(i7, num.intValue()));
    }

    /* JADX INFO: renamed from: y */
    public int m22831y(int i7, int i8) {
        m23082a();
        m22820m(i7);
        int[] iArr = this.f19255b;
        int i9 = iArr[i7];
        iArr[i7] = i8;
        return i9;
    }
}
