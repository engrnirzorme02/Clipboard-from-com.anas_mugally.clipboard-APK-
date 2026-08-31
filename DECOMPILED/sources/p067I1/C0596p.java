package p067I1;

import com.bumptech.glide.C3209i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p104N.InterfaceC0907d;

/* JADX INFO: renamed from: I1.p */
/* JADX INFO: loaded from: classes.dex */
public class C0596p {

    /* JADX INFO: renamed from: a */
    private final C0598r f2277a;

    /* JADX INFO: renamed from: b */
    private final a f2278b;

    /* JADX INFO: renamed from: I1.p$a */
    private static class a {

        /* JADX INFO: renamed from: a */
        private final Map f2279a = new HashMap();

        /* JADX INFO: renamed from: I1.p$a$a, reason: collision with other inner class name */
        private static class C7632a {

            /* JADX INFO: renamed from: a */
            final List f2280a;

            public C7632a(List list) {
                this.f2280a = list;
            }
        }

        a() {
        }

        /* JADX INFO: renamed from: a */
        public void m2620a() {
            this.f2279a.clear();
        }

        /* JADX INFO: renamed from: b */
        public List m2621b(Class cls) {
            C7632a c7632a = (C7632a) this.f2279a.get(cls);
            if (c7632a == null) {
                return null;
            }
            return c7632a.f2280a;
        }

        /* JADX INFO: renamed from: c */
        public void m2622c(Class cls, List list) {
            if (((C7632a) this.f2279a.put(cls, new C7632a(list))) == null) {
                return;
            }
            throw new IllegalStateException("Already cached loaders for model: " + cls);
        }
    }

    public C0596p(InterfaceC0907d interfaceC0907d) {
        this(new C0598r(interfaceC0907d));
    }

    /* JADX INFO: renamed from: b */
    private static Class m2615b(Object obj) {
        return obj.getClass();
    }

    /* JADX INFO: renamed from: e */
    private synchronized List m2616e(Class cls) {
        List listM2621b;
        listM2621b = this.f2278b.m2621b(cls);
        if (listM2621b == null) {
            listM2621b = Collections.unmodifiableList(this.f2277a.m2629e(cls));
            this.f2278b.m2622c(cls, listM2621b);
        }
        return listM2621b;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m2617a(Class cls, Class cls2, InterfaceC0595o interfaceC0595o) {
        this.f2277a.m2627b(cls, cls2, interfaceC0595o);
        this.f2278b.m2620a();
    }

    /* JADX INFO: renamed from: c */
    public synchronized List m2618c(Class cls) {
        return this.f2277a.m2630g(cls);
    }

    /* JADX INFO: renamed from: d */
    public List m2619d(Object obj) {
        List listM2616e = m2616e(m2615b(obj));
        if (listM2616e.isEmpty()) {
            throw new C3209i.c(obj);
        }
        int size = listM2616e.size();
        List arrayList = Collections.EMPTY_LIST;
        boolean z7 = true;
        for (int i7 = 0; i7 < size; i7++) {
            InterfaceC0594n interfaceC0594n = (InterfaceC0594n) listM2616e.get(i7);
            if (interfaceC0594n.mo2553b(obj)) {
                if (z7) {
                    arrayList = new ArrayList(size - i7);
                    z7 = false;
                }
                arrayList.add(interfaceC0594n);
            }
        }
        if (arrayList.isEmpty()) {
            throw new C3209i.c(obj, listM2616e);
        }
        return arrayList;
    }

    private C0596p(C0598r c0598r) {
        this.f2278b = new a();
        this.f2277a = c0598r;
    }
}
