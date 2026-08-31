package p148T1;

import java.util.ArrayList;
import java.util.List;
import p019C1.InterfaceC0135k;

/* JADX INFO: renamed from: T1.f */
/* JADX INFO: loaded from: classes.dex */
public class C1460f {

    /* JADX INFO: renamed from: a */
    private final List f4996a = new ArrayList();

    /* JADX INFO: renamed from: T1.f$a */
    private static final class a {

        /* JADX INFO: renamed from: a */
        private final Class f4997a;

        /* JADX INFO: renamed from: b */
        final InterfaceC0135k f4998b;

        a(Class cls, InterfaceC0135k interfaceC0135k) {
            this.f4997a = cls;
            this.f4998b = interfaceC0135k;
        }

        /* JADX INFO: renamed from: a */
        boolean m6122a(Class cls) {
            return this.f4997a.isAssignableFrom(cls);
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m6120a(Class cls, InterfaceC0135k interfaceC0135k) {
        this.f4996a.add(new a(cls, interfaceC0135k));
    }

    /* JADX INFO: renamed from: b */
    public synchronized InterfaceC0135k m6121b(Class cls) {
        int size = this.f4996a.size();
        for (int i7 = 0; i7 < size; i7++) {
            a aVar = (a) this.f4996a.get(i7);
            if (aVar.m6122a(cls)) {
                return aVar.f4998b;
            }
        }
        return null;
    }
}
