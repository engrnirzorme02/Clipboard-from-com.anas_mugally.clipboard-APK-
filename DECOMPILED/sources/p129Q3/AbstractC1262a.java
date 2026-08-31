package p129Q3;

import java.util.NoSuchElementException;
import p122P3.AbstractC1209m;

/* JADX INFO: renamed from: Q3.a */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC1262a extends AbstractC1261C {

    /* JADX INFO: renamed from: a */
    private final int f4503a;

    /* JADX INFO: renamed from: b */
    private int f4504b;

    protected AbstractC1262a(int i7, int i8) {
        AbstractC1209m.m5305q(i8, i7);
        this.f4503a = i7;
        this.f4504b = i8;
    }

    /* JADX INFO: renamed from: a */
    protected abstract Object mo5503a(int i7);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f4504b < this.f4503a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f4504b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f4504b;
        this.f4504b = i7 + 1;
        return mo5503a(i7);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f4504b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f4504b - 1;
        this.f4504b = i7;
        return mo5503a(i7);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f4504b - 1;
    }
}
