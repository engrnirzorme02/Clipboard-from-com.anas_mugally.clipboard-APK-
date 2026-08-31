package p294l6;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC6118n;
import p238e6.InterfaceC5356a;
import p238e6.InterfaceC5367l;
import p246f6.InterfaceC5442a;

/* JADX INFO: renamed from: l6.d */
/* JADX INFO: loaded from: classes.dex */
final class C6303d implements InterfaceC6304e {

    /* JADX INFO: renamed from: a */
    private final InterfaceC5356a f24105a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC5367l f24106b;

    /* JADX INFO: renamed from: l6.d$a */
    public static final class a implements Iterator, InterfaceC5442a {

        /* JADX INFO: renamed from: a */
        private Object f24107a;

        /* JADX INFO: renamed from: b */
        private int f24108b = -2;

        a() {
        }

        /* JADX INFO: renamed from: a */
        private final void m27231a() {
            Object objInvoke;
            if (this.f24108b == -2) {
                objInvoke = C6303d.this.f24105a.invoke();
            } else {
                InterfaceC5367l interfaceC5367l = C6303d.this.f24106b;
                Object obj = this.f24107a;
                AbstractC6118n.m27184b(obj);
                objInvoke = interfaceC5367l.invoke(obj);
            }
            this.f24107a = objInvoke;
            this.f24108b = objInvoke == null ? 0 : 1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f24108b < 0) {
                m27231a();
            }
            return this.f24108b == 1;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f24108b < 0) {
                m27231a();
            }
            if (this.f24108b == 0) {
                throw new NoSuchElementException();
            }
            Object obj = this.f24107a;
            AbstractC6118n.m27185c(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
            this.f24108b = -1;
            return obj;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C6303d(InterfaceC5356a getInitialValue, InterfaceC5367l getNextValue) {
        AbstractC6118n.m27187e(getInitialValue, "getInitialValue");
        AbstractC6118n.m27187e(getNextValue, "getNextValue");
        this.f24105a = getInitialValue;
        this.f24106b = getNextValue;
    }

    @Override // p294l6.InterfaceC6304e
    public Iterator iterator() {
        return new a();
    }
}
