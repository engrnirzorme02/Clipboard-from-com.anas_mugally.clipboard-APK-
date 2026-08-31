package p294l6;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.coroutines.jvm.internal.AbstractC6093h;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.AbstractC1437o;
import p145S5.C1436n;
import p145S5.C1444v;
import p173W5.C1880j;
import p173W5.InterfaceC1875e;
import p173W5.InterfaceC1879i;
import p180X5.AbstractC2005b;
import p246f6.InterfaceC5442a;

/* JADX INFO: renamed from: l6.f */
/* JADX INFO: loaded from: classes.dex */
final class C6305f extends AbstractC6306g implements Iterator, InterfaceC1875e, InterfaceC5442a {

    /* JADX INFO: renamed from: a */
    private int f24110a;

    /* JADX INFO: renamed from: b */
    private Object f24111b;

    /* JADX INFO: renamed from: c */
    private Iterator f24112c;

    /* JADX INFO: renamed from: d */
    private InterfaceC1875e f24113d;

    /* JADX INFO: renamed from: g */
    private final Throwable m27232g() {
        int i7 = this.f24110a;
        if (i7 == 4) {
            return new NoSuchElementException();
        }
        if (i7 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f24110a);
    }

    /* JADX INFO: renamed from: i */
    private final Object m27233i() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    @Override // p294l6.AbstractC6306g
    /* JADX INFO: renamed from: b */
    public Object mo27234b(Object obj, InterfaceC1875e interfaceC1875e) {
        this.f24111b = obj;
        this.f24110a = 3;
        this.f24113d = interfaceC1875e;
        Object objE = AbstractC2005b.m8369e();
        if (objE == AbstractC2005b.m8369e()) {
            AbstractC6093h.m27135c(interfaceC1875e);
        }
        return objE == AbstractC2005b.m8369e() ? objE : C1444v.f4971a;
    }

    @Override // p173W5.InterfaceC1875e
    public InterfaceC1879i getContext() {
        return C1880j.f6044a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() throws Throwable {
        while (true) {
            int i7 = this.f24110a;
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 == 2 || i7 == 3) {
                        return true;
                    }
                    if (i7 == 4) {
                        return false;
                    }
                    throw m27232g();
                }
                Iterator it = this.f24112c;
                AbstractC6118n.m27184b(it);
                if (it.hasNext()) {
                    this.f24110a = 2;
                    return true;
                }
                this.f24112c = null;
            }
            this.f24110a = 5;
            InterfaceC1875e interfaceC1875e = this.f24113d;
            AbstractC6118n.m27184b(interfaceC1875e);
            this.f24113d = null;
            C1436n.a aVar = C1436n.f4958b;
            interfaceC1875e.resumeWith(C1436n.m6073b(C1444v.f4971a));
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m27235k(InterfaceC1875e interfaceC1875e) {
        this.f24113d = interfaceC1875e;
    }

    @Override // java.util.Iterator
    public Object next() throws Throwable {
        int i7 = this.f24110a;
        if (i7 == 0 || i7 == 1) {
            return m27233i();
        }
        if (i7 == 2) {
            this.f24110a = 1;
            Iterator it = this.f24112c;
            AbstractC6118n.m27184b(it);
            return it.next();
        }
        if (i7 != 3) {
            throw m27232g();
        }
        this.f24110a = 0;
        Object obj = this.f24111b;
        this.f24111b = null;
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // p173W5.InterfaceC1875e
    public void resumeWith(Object obj) {
        AbstractC1437o.m6082b(obj);
        this.f24110a = 4;
    }
}
