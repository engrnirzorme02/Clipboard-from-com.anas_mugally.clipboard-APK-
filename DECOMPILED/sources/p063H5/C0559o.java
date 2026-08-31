package p063H5;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: renamed from: H5.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0559o {

    /* JADX INFO: renamed from: b */
    private static final C0559o f2157b = new C0559o(new InterfaceC0553l.a(), InterfaceC0553l.b.f2096a);

    /* JADX INFO: renamed from: a */
    private final ConcurrentMap f2158a = new ConcurrentHashMap();

    C0559o(InterfaceC0557n... interfaceC0557nArr) {
        for (InterfaceC0557n interfaceC0557n : interfaceC0557nArr) {
            this.f2158a.put(interfaceC0557n.mo2443a(), interfaceC0557n);
        }
    }

    /* JADX INFO: renamed from: a */
    public static C0559o m2477a() {
        return f2157b;
    }

    /* JADX INFO: renamed from: b */
    public InterfaceC0557n m2478b(String str) {
        return (InterfaceC0557n) this.f2158a.get(str);
    }
}
