package p148T1;

import androidx.collection.C2390a;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import p035E1.C0288i;
import p035E1.C0299t;
import p127Q1.C1253g;
import p183Y1.C2021j;

/* JADX INFO: renamed from: T1.c */
/* JADX INFO: loaded from: classes.dex */
public class C1457c {

    /* JADX INFO: renamed from: c */
    private static final C0299t f4986c = new C0299t(Object.class, Object.class, Object.class, Collections.singletonList(new C0288i(Object.class, Object.class, Object.class, Collections.EMPTY_LIST, new C1253g(), null)), null);

    /* JADX INFO: renamed from: a */
    private final C2390a f4987a = new C2390a();

    /* JADX INFO: renamed from: b */
    private final AtomicReference f4988b = new AtomicReference();

    /* JADX INFO: renamed from: b */
    private C2021j m6108b(Class cls, Class cls2, Class cls3) {
        C2021j c2021j = (C2021j) this.f4988b.getAndSet(null);
        if (c2021j == null) {
            c2021j = new C2021j();
        }
        c2021j.m8403a(cls, cls2, cls3);
        return c2021j;
    }

    /* JADX INFO: renamed from: a */
    public C0299t m6109a(Class cls, Class cls2, Class cls3) {
        C0299t c0299t;
        C2021j c2021jM6108b = m6108b(cls, cls2, cls3);
        synchronized (this.f4987a) {
            c0299t = (C0299t) this.f4987a.get(c2021jM6108b);
        }
        this.f4988b.set(c2021jM6108b);
        return c0299t;
    }

    /* JADX INFO: renamed from: c */
    public boolean m6110c(C0299t c0299t) {
        return f4986c.equals(c0299t);
    }

    /* JADX INFO: renamed from: d */
    public void m6111d(Class cls, Class cls2, Class cls3, C0299t c0299t) {
        synchronized (this.f4987a) {
            C2390a c2390a = this.f4987a;
            C2021j c2021j = new C2021j(cls, cls2, cls3);
            if (c0299t == null) {
                c0299t = f4986c;
            }
            c2390a.put(c2021j, c0299t);
        }
    }
}
