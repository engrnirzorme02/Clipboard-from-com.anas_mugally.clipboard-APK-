package p035E1;

import java.util.HashMap;
import java.util.Map;
import p019C1.InterfaceC0130f;

/* JADX INFO: renamed from: E1.s */
/* JADX INFO: loaded from: classes.dex */
final class C0298s {

    /* JADX INFO: renamed from: a */
    private final Map f1244a = new HashMap();

    /* JADX INFO: renamed from: b */
    private final Map f1245b = new HashMap();

    C0298s() {
    }

    /* JADX INFO: renamed from: b */
    private Map m1455b(boolean z7) {
        return z7 ? this.f1245b : this.f1244a;
    }

    /* JADX INFO: renamed from: a */
    C0291l m1456a(InterfaceC0130f interfaceC0130f, boolean z7) {
        return (C0291l) m1455b(z7).get(interfaceC0130f);
    }

    /* JADX INFO: renamed from: c */
    void m1457c(InterfaceC0130f interfaceC0130f, C0291l c0291l) {
        m1455b(c0291l.m1425p()).put(interfaceC0130f, c0291l);
    }

    /* JADX INFO: renamed from: d */
    void m1458d(InterfaceC0130f interfaceC0130f, C0291l c0291l) {
        Map mapM1455b = m1455b(c0291l.m1425p());
        if (c0291l.equals(mapM1455b.get(interfaceC0130f))) {
            mapM1455b.remove(interfaceC0130f);
        }
    }
}
