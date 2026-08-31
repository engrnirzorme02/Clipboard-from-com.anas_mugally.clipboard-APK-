package p152T5;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p246f6.InterfaceC5442a;

/* JADX INFO: renamed from: T5.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1624c implements Iterator, InterfaceC5442a {

    /* JADX INFO: renamed from: a */
    private int f5387a;

    /* JADX INFO: renamed from: b */
    private Object f5388b;

    /* JADX INFO: renamed from: e */
    private final boolean m6658e() {
        this.f5387a = 3;
        mo6646a();
        return this.f5387a == 1;
    }

    /* JADX INFO: renamed from: a */
    protected abstract void mo6646a();

    /* JADX INFO: renamed from: b */
    protected final void m6659b() {
        this.f5387a = 2;
    }

    /* JADX INFO: renamed from: c */
    protected final void m6660c(Object obj) {
        this.f5388b = obj;
        this.f5387a = 1;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i7 = this.f5387a;
        if (i7 == 0) {
            return m6658e();
        }
        if (i7 == 1) {
            return true;
        }
        if (i7 == 2) {
            return false;
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    @Override // java.util.Iterator
    public Object next() {
        int i7 = this.f5387a;
        if (i7 == 1) {
            this.f5387a = 0;
            return this.f5388b;
        }
        if (i7 == 2 || !m6658e()) {
            throw new NoSuchElementException();
        }
        this.f5387a = 0;
        return this.f5388b;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
