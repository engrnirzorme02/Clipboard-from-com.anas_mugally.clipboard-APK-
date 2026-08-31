package p127Q1;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: Q1.f */
/* JADX INFO: loaded from: classes.dex */
public class C1252f {

    /* JADX INFO: renamed from: a */
    private final List f4477a = new ArrayList();

    /* JADX INFO: renamed from: Q1.f$a */
    private static final class a {

        /* JADX INFO: renamed from: a */
        final Class f4478a;

        /* JADX INFO: renamed from: b */
        final Class f4479b;

        /* JADX INFO: renamed from: c */
        final InterfaceC1251e f4480c;

        a(Class cls, Class cls2, InterfaceC1251e interfaceC1251e) {
            this.f4478a = cls;
            this.f4479b = cls2;
            this.f4480c = interfaceC1251e;
        }

        /* JADX INFO: renamed from: a */
        public boolean m5501a(Class cls, Class cls2) {
            return this.f4478a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f4479b);
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized InterfaceC1251e m5498a(Class cls, Class cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return C1253g.m5502b();
        }
        for (a aVar : this.f4477a) {
            if (aVar.m5501a(cls, cls2)) {
                return aVar.f4480c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    /* JADX INFO: renamed from: b */
    public synchronized List m5499b(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (a aVar : this.f4477a) {
            if (aVar.m5501a(cls, cls2) && !arrayList.contains(aVar.f4479b)) {
                arrayList.add(aVar.f4479b);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public synchronized void m5500c(Class cls, Class cls2, InterfaceC1251e interfaceC1251e) {
        this.f4477a.add(new a(cls, cls2, interfaceC1251e));
    }
}
