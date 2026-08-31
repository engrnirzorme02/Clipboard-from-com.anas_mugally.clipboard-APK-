package p129Q3;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p122P3.AbstractC1205i;

/* JADX INFO: renamed from: Q3.n */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1275n {

    /* JADX INFO: renamed from: Q3.n$a */
    class a extends AbstractC1260B {

        /* JADX INFO: renamed from: a */
        boolean f4538a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Object f4539b;

        a(Object obj) {
            this.f4539b = obj;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f4538a;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f4538a) {
                throw new NoSuchElementException();
            }
            this.f4538a = true;
            return this.f4539b;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m5582a(Iterator it, Iterator it2) {
        while (it.hasNext()) {
            if (!it2.hasNext() || !AbstractC1205i.m5282a(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    /* JADX INFO: renamed from: b */
    public static AbstractC1260B m5583b(Object obj) {
        return new a(obj);
    }
}
