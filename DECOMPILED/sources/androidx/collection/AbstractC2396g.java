package androidx.collection;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p246f6.InterfaceC5442a;

/* JADX INFO: renamed from: androidx.collection.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2396g implements Iterator, InterfaceC5442a {

    /* JADX INFO: renamed from: a */
    private int f8468a;

    /* JADX INFO: renamed from: b */
    private int f8469b;

    /* JADX INFO: renamed from: c */
    private boolean f8470c;

    public AbstractC2396g(int i7) {
        this.f8468a = i7;
    }

    /* JADX INFO: renamed from: a */
    protected abstract Object mo10258a(int i7);

    /* JADX INFO: renamed from: b */
    protected abstract void mo10259b(int i7);

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f8469b < this.f8468a;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objMo10258a = mo10258a(this.f8469b);
        this.f8469b++;
        this.f8470c = true;
        return objMo10258a;
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.f8470c) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i7 = this.f8469b - 1;
        this.f8469b = i7;
        mo10259b(i7);
        this.f8468a--;
        this.f8470c = false;
    }
}
