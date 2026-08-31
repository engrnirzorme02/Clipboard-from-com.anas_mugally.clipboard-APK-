package p148T1;

import androidx.collection.C2390a;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p183Y1.C2021j;

/* JADX INFO: renamed from: T1.d */
/* JADX INFO: loaded from: classes.dex */
public class C1458d {

    /* JADX INFO: renamed from: a */
    private final AtomicReference f4989a = new AtomicReference();

    /* JADX INFO: renamed from: b */
    private final C2390a f4990b = new C2390a();

    /* JADX INFO: renamed from: a */
    public List m6112a(Class cls, Class cls2, Class cls3) {
        List list;
        C2021j c2021j = (C2021j) this.f4989a.getAndSet(null);
        if (c2021j == null) {
            c2021j = new C2021j(cls, cls2, cls3);
        } else {
            c2021j.m8403a(cls, cls2, cls3);
        }
        synchronized (this.f4990b) {
            list = (List) this.f4990b.get(c2021j);
        }
        this.f4989a.set(c2021j);
        return list;
    }

    /* JADX INFO: renamed from: b */
    public void m6113b(Class cls, Class cls2, Class cls3, List list) {
        synchronized (this.f4990b) {
            this.f4990b.put(new C2021j(cls, cls2, cls3), list);
        }
    }
}
