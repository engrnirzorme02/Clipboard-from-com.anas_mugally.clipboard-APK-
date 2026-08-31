package p067I1;

import com.bumptech.glide.C3209i;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p019C1.C0132h;
import p104N.InterfaceC0907d;
import p183Y1.AbstractC2022k;

/* JADX INFO: renamed from: I1.r */
/* JADX INFO: loaded from: classes.dex */
public class C0598r {

    /* JADX INFO: renamed from: e */
    private static final c f2290e = new c();

    /* JADX INFO: renamed from: f */
    private static final InterfaceC0594n f2291f = new a();

    /* JADX INFO: renamed from: a */
    private final List f2292a;

    /* JADX INFO: renamed from: b */
    private final c f2293b;

    /* JADX INFO: renamed from: c */
    private final Set f2294c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC0907d f2295d;

    /* JADX INFO: renamed from: I1.r$a */
    private static class a implements InterfaceC0594n {
        a() {
        }

        @Override // p067I1.InterfaceC0594n
        /* JADX INFO: renamed from: a */
        public InterfaceC0594n.a mo2552a(Object obj, int i7, int i8, C0132h c0132h) {
            return null;
        }

        @Override // p067I1.InterfaceC0594n
        /* JADX INFO: renamed from: b */
        public boolean mo2553b(Object obj) {
            return false;
        }
    }

    /* JADX INFO: renamed from: I1.r$b */
    private static class b {

        /* JADX INFO: renamed from: a */
        private final Class f2296a;

        /* JADX INFO: renamed from: b */
        final Class f2297b;

        /* JADX INFO: renamed from: c */
        final InterfaceC0595o f2298c;

        public b(Class cls, Class cls2, InterfaceC0595o interfaceC0595o) {
            this.f2296a = cls;
            this.f2297b = cls2;
            this.f2298c = interfaceC0595o;
        }

        /* JADX INFO: renamed from: a */
        public boolean m2631a(Class cls) {
            return this.f2296a.isAssignableFrom(cls);
        }

        /* JADX INFO: renamed from: b */
        public boolean m2632b(Class cls, Class cls2) {
            return m2631a(cls) && this.f2297b.isAssignableFrom(cls2);
        }
    }

    /* JADX INFO: renamed from: I1.r$c */
    static class c {
        c() {
        }

        /* JADX INFO: renamed from: a */
        public C0597q m2633a(List list, InterfaceC0907d interfaceC0907d) {
            return new C0597q(list, interfaceC0907d);
        }
    }

    public C0598r(InterfaceC0907d interfaceC0907d) {
        this(interfaceC0907d, f2290e);
    }

    /* JADX INFO: renamed from: a */
    private void m2624a(Class cls, Class cls2, InterfaceC0595o interfaceC0595o, boolean z7) {
        b bVar = new b(cls, cls2, interfaceC0595o);
        List list = this.f2292a;
        list.add(z7 ? list.size() : 0, bVar);
    }

    /* JADX INFO: renamed from: c */
    private InterfaceC0594n m2625c(b bVar) {
        return (InterfaceC0594n) AbstractC2022k.m8408e(bVar.f2298c.mo2557d(this));
    }

    /* JADX INFO: renamed from: f */
    private static InterfaceC0594n m2626f() {
        return f2291f;
    }

    /* JADX INFO: renamed from: b */
    synchronized void m2627b(Class cls, Class cls2, InterfaceC0595o interfaceC0595o) {
        m2624a(cls, cls2, interfaceC0595o, true);
    }

    /* JADX INFO: renamed from: d */
    public synchronized InterfaceC0594n m2628d(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z7 = false;
            for (b bVar : this.f2292a) {
                if (this.f2294c.contains(bVar)) {
                    z7 = true;
                } else if (bVar.m2632b(cls, cls2)) {
                    this.f2294c.add(bVar);
                    arrayList.add(m2625c(bVar));
                    this.f2294c.remove(bVar);
                }
            }
            if (arrayList.size() > 1) {
                return this.f2293b.m2633a(arrayList, this.f2295d);
            }
            if (arrayList.size() == 1) {
                return (InterfaceC0594n) arrayList.get(0);
            }
            if (!z7) {
                throw new C3209i.c(cls, cls2);
            }
            return m2626f();
        } catch (Throwable th) {
            this.f2294c.clear();
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    synchronized List m2629e(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (b bVar : this.f2292a) {
                if (!this.f2294c.contains(bVar) && bVar.m2631a(cls)) {
                    this.f2294c.add(bVar);
                    arrayList.add(m2625c(bVar));
                    this.f2294c.remove(bVar);
                }
            }
        } catch (Throwable th) {
            this.f2294c.clear();
            throw th;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    synchronized List m2630g(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (b bVar : this.f2292a) {
            if (!arrayList.contains(bVar.f2297b) && bVar.m2631a(cls)) {
                arrayList.add(bVar.f2297b);
            }
        }
        return arrayList;
    }

    C0598r(InterfaceC0907d interfaceC0907d, c cVar) {
        this.f2292a = new ArrayList();
        this.f2294c = new HashSet();
        this.f2295d = interfaceC0907d;
        this.f2293b = cVar;
    }
}
