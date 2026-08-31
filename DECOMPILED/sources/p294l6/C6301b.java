package p294l6;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6118n;
import p246f6.InterfaceC5442a;

/* JADX INFO: renamed from: l6.b */
/* JADX INFO: loaded from: classes.dex */
public final class C6301b implements InterfaceC6304e, InterfaceC6302c {

    /* JADX INFO: renamed from: a */
    private final InterfaceC6304e f24101a;

    /* JADX INFO: renamed from: b */
    private final int f24102b;

    /* JADX INFO: renamed from: l6.b$a */
    public static final class a implements Iterator, InterfaceC5442a {

        /* JADX INFO: renamed from: a */
        private final Iterator f24103a;

        /* JADX INFO: renamed from: b */
        private int f24104b;

        a(C6301b c6301b) {
            this.f24103a = c6301b.f24101a.iterator();
            this.f24104b = c6301b.f24102b;
        }

        /* JADX INFO: renamed from: a */
        private final void m27228a() {
            while (this.f24104b > 0 && this.f24103a.hasNext()) {
                this.f24103a.next();
                this.f24104b--;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            m27228a();
            return this.f24103a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            m27228a();
            return this.f24103a.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C6301b(InterfaceC6304e sequence, int i7) {
        AbstractC6118n.m27187e(sequence, "sequence");
        this.f24101a = sequence;
        this.f24102b = i7;
        if (i7 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i7 + '.').toString());
    }

    @Override // p294l6.InterfaceC6302c
    /* JADX INFO: renamed from: a */
    public InterfaceC6304e mo27227a(int i7) {
        int i8 = this.f24102b + i7;
        return i8 < 0 ? new C6301b(this, i7) : new C6301b(this.f24101a, i8);
    }

    @Override // p294l6.InterfaceC6304e
    public Iterator iterator() {
        return new a(this);
    }
}
