package p016B6;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6118n;
import p246f6.InterfaceC5442a;

/* JADX INFO: renamed from: B6.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0097e {

    /* JADX INFO: renamed from: B6.e$a */
    public static final class a implements Iterator, InterfaceC5442a {

        /* JADX INFO: renamed from: a */
        private int f522a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC0096d f523b;

        a(InterfaceC0096d interfaceC0096d) {
            this.f523b = interfaceC0096d;
            this.f522a = interfaceC0096d.mo375f();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public InterfaceC0096d next() {
            InterfaceC0096d interfaceC0096d = this.f523b;
            int iMo375f = interfaceC0096d.mo375f();
            int i7 = this.f522a;
            this.f522a = i7 - 1;
            return interfaceC0096d.mo378i(iMo375f - i7);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f522a > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: renamed from: B6.e$b */
    public static final class b implements Iterable, InterfaceC5442a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC0096d f524a;

        public b(InterfaceC0096d interfaceC0096d) {
            this.f524a = interfaceC0096d;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return new a(this.f524a);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final Iterable m383a(InterfaceC0096d interfaceC0096d) {
        AbstractC6118n.m27187e(interfaceC0096d, "<this>");
        return new b(interfaceC0096d);
    }
}
