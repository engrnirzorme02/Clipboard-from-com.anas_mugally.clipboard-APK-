package p152T5;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.AbstractC6118n;
import p278j6.AbstractC5905g;

/* JADX INFO: renamed from: T5.N */
/* JADX INFO: loaded from: classes.dex */
final class C1616N extends AbstractC1625d implements RandomAccess {

    /* JADX INFO: renamed from: b */
    private final Object[] f5369b;

    /* JADX INFO: renamed from: c */
    private final int f5370c;

    /* JADX INFO: renamed from: d */
    private int f5371d;

    /* JADX INFO: renamed from: e */
    private int f5372e;

    /* JADX INFO: renamed from: T5.N$a */
    public static final class a extends AbstractC1624c {

        /* JADX INFO: renamed from: c */
        private int f5373c;

        /* JADX INFO: renamed from: d */
        private int f5374d;

        a() {
            this.f5373c = C1616N.this.size();
            this.f5374d = C1616N.this.f5371d;
        }

        @Override // p152T5.AbstractC1624c
        /* JADX INFO: renamed from: a */
        protected void mo6646a() {
            if (this.f5373c == 0) {
                m6659b();
                return;
            }
            m6660c(C1616N.this.f5369b[this.f5374d]);
            this.f5374d = (this.f5374d + 1) % C1616N.this.f5370c;
            this.f5373c--;
        }
    }

    public C1616N(Object[] buffer, int i7) {
        AbstractC6118n.m27187e(buffer, "buffer");
        this.f5369b = buffer;
        if (i7 < 0) {
            throw new IllegalArgumentException(("ring buffer filled size should not be negative but it is " + i7).toString());
        }
        if (i7 <= buffer.length) {
            this.f5370c = buffer.length;
            this.f5372e = i7;
            return;
        }
        throw new IllegalArgumentException(("ring buffer filled size: " + i7 + " cannot be larger than the buffer size: " + buffer.length).toString());
    }

    @Override // p152T5.AbstractC1623b
    /* JADX INFO: renamed from: b */
    public int mo3154b() {
        return this.f5372e;
    }

    @Override // p152T5.AbstractC1625d, java.util.List
    public Object get(int i7) {
        AbstractC1625d.f5389a.m6662b(i7, size());
        return this.f5369b[(this.f5371d + i7) % this.f5370c];
    }

    @Override // p152T5.AbstractC1625d, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new a();
    }

    /* JADX INFO: renamed from: n */
    public final void m6642n(Object obj) {
        if (m6644q()) {
            throw new IllegalStateException("ring buffer is full");
        }
        this.f5369b[(this.f5371d + size()) % this.f5370c] = obj;
        this.f5372e = size() + 1;
    }

    /* JADX INFO: renamed from: p */
    public final C1616N m6643p(int i7) {
        Object[] array;
        int i8 = this.f5370c;
        int iD = AbstractC5905g.m26656d(i8 + (i8 >> 1) + 1, i7);
        if (this.f5371d == 0) {
            array = Arrays.copyOf(this.f5369b, iD);
            AbstractC6118n.m27186d(array, "copyOf(...)");
        } else {
            array = toArray(new Object[iD]);
        }
        return new C1616N(array, size());
    }

    /* JADX INFO: renamed from: q */
    public final boolean m6644q() {
        return size() == this.f5370c;
    }

    @Override // p152T5.AbstractC1623b, java.util.Collection, java.util.List
    public Object[] toArray(Object[] array) {
        AbstractC6118n.m27187e(array, "array");
        if (array.length < size()) {
            array = Arrays.copyOf(array, size());
            AbstractC6118n.m27186d(array, "copyOf(...)");
        }
        int size = size();
        int i7 = 0;
        int i8 = 0;
        for (int i9 = this.f5371d; i8 < size && i9 < this.f5370c; i9++) {
            array[i8] = this.f5369b[i9];
            i8++;
        }
        while (i8 < size) {
            array[i8] = this.f5369b[i7];
            i8++;
            i7++;
        }
        return AbstractC1639r.m6761f(size, array);
    }

    /* JADX INFO: renamed from: v */
    public final void m6645v(int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException(("n shouldn't be negative but it is " + i7).toString());
        }
        if (i7 > size()) {
            throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = " + i7 + ", size = " + size()).toString());
        }
        if (i7 > 0) {
            int i8 = this.f5371d;
            int i9 = (i8 + i7) % this.f5370c;
            if (i8 > i9) {
                AbstractC1634m.m6700m(this.f5369b, null, i8, this.f5370c);
                AbstractC1634m.m6700m(this.f5369b, null, 0, i9);
            } else {
                AbstractC1634m.m6700m(this.f5369b, null, i8, i9);
            }
            this.f5371d = i9;
            this.f5372e = size() - i7;
        }
    }

    public C1616N(int i7) {
        this(new Object[i7], 0);
    }

    @Override // p152T5.AbstractC1623b, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
