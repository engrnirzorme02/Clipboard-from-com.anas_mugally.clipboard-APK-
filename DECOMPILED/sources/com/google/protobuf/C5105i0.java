package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.protobuf.i0 */
/* JADX INFO: loaded from: classes.dex */
final class C5105i0 extends AbstractC5092c implements RandomAccess {

    /* JADX INFO: renamed from: d */
    private static final C5105i0 f19411d = new C5105i0(new Object[0], 0, false);

    /* JADX INFO: renamed from: b */
    private Object[] f19412b;

    /* JADX INFO: renamed from: c */
    private int f19413c;

    private C5105i0(Object[] objArr, int i7, boolean z7) {
        super(z7);
        this.f19412b = objArr;
        this.f19413c = i7;
    }

    /* JADX INFO: renamed from: b */
    private static Object[] m23178b(int i7) {
        return new Object[i7];
    }

    /* JADX INFO: renamed from: e */
    public static C5105i0 m23179e() {
        return f19411d;
    }

    /* JADX INFO: renamed from: g */
    private void m23180g(int i7) {
        if (i7 < 0 || i7 >= this.f19413c) {
            throw new IndexOutOfBoundsException(m23181j(i7));
        }
    }

    /* JADX INFO: renamed from: j */
    private String m23181j(int i7) {
        return "Index:" + i7 + ", Size:" + this.f19413c;
    }

    @Override // com.google.protobuf.AbstractC5092c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        m23082a();
        int i7 = this.f19413c;
        Object[] objArr = this.f19412b;
        if (i7 == objArr.length) {
            this.f19412b = Arrays.copyOf(objArr, ((i7 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f19412b;
        int i8 = this.f19413c;
        this.f19413c = i8 + 1;
        objArr2[i8] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i7) {
        m23180g(i7);
        return this.f19412b[i7];
    }

    @Override // com.google.protobuf.AbstractC5063B.e
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public C5105i0 mo22823d(int i7) {
        if (i7 >= this.f19413c) {
            return new C5105i0(Arrays.copyOf(this.f19412b, i7), this.f19413c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC5092c, java.util.AbstractList, java.util.List
    public Object remove(int i7) {
        m23082a();
        m23180g(i7);
        Object[] objArr = this.f19412b;
        Object obj = objArr[i7];
        int i8 = this.f19413c;
        if (i7 < i8 - 1) {
            System.arraycopy(objArr, i7 + 1, objArr, i7, (i8 - i7) - 1);
        }
        this.f19413c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i7, Object obj) {
        m23082a();
        m23180g(i7);
        Object[] objArr = this.f19412b;
        Object obj2 = objArr[i7];
        objArr[i7] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f19413c;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i7, Object obj) {
        int i8;
        m23082a();
        if (i7 >= 0 && i7 <= (i8 = this.f19413c)) {
            Object[] objArr = this.f19412b;
            if (i8 < objArr.length) {
                System.arraycopy(objArr, i7, objArr, i7 + 1, i8 - i7);
            } else {
                Object[] objArrM23178b = m23178b(((i8 * 3) / 2) + 1);
                System.arraycopy(this.f19412b, 0, objArrM23178b, 0, i7);
                System.arraycopy(this.f19412b, i7, objArrM23178b, i7 + 1, this.f19413c - i7);
                this.f19412b = objArrM23178b;
            }
            this.f19412b[i7] = obj;
            this.f19413c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m23181j(i7));
    }
}
