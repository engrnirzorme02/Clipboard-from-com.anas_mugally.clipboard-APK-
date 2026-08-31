package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p246f6.InterfaceC5442a;

/* JADX INFO: renamed from: kotlin.jvm.internal.b */
/* JADX INFO: loaded from: classes.dex */
final class C6106b implements Iterator, InterfaceC5442a {

    /* JADX INFO: renamed from: a */
    private final Object[] f23871a;

    /* JADX INFO: renamed from: b */
    private int f23872b;

    public C6106b(Object[] array) {
        AbstractC6118n.m27187e(array, "array");
        this.f23871a = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f23872b < this.f23871a.length;
    }

    @Override // java.util.Iterator
    public Object next() {
        try {
            Object[] objArr = this.f23871a;
            int i7 = this.f23872b;
            this.f23872b = i7 + 1;
            return objArr[i7];
        } catch (ArrayIndexOutOfBoundsException e7) {
            this.f23872b--;
            throw new NoSuchElementException(e7.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
