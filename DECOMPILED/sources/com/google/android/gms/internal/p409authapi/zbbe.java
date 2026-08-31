package com.google.android.gms.internal.p409authapi;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
abstract class zbbe extends zbbl {
    private final int zba;
    private int zbb;

    protected zbbe(int i7, int i8) {
        zbbc.zbb(i8, i7, "index");
        this.zba = i7;
        this.zbb = i8;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.zbb < this.zba;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.zbb > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i7 = this.zbb;
        this.zbb = i7 + 1;
        return zba(i7);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.zbb;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i7 = this.zbb - 1;
        this.zbb = i7;
        return zba(i7);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.zbb - 1;
    }

    protected abstract Object zba(int i7);
}
