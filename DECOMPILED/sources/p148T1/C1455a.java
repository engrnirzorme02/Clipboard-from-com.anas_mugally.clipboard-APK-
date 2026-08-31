package p148T1;

import java.util.ArrayList;
import java.util.List;
import p019C1.InterfaceC0128d;

/* JADX INFO: renamed from: T1.a */
/* JADX INFO: loaded from: classes.dex */
public class C1455a {

    /* JADX INFO: renamed from: a */
    private final List f4982a = new ArrayList();

    /* JADX INFO: renamed from: T1.a$a */
    private static final class a {

        /* JADX INFO: renamed from: a */
        private final Class f4983a;

        /* JADX INFO: renamed from: b */
        final InterfaceC0128d f4984b;

        a(Class cls, InterfaceC0128d interfaceC0128d) {
            this.f4983a = cls;
            this.f4984b = interfaceC0128d;
        }

        /* JADX INFO: renamed from: a */
        boolean m6105a(Class cls) {
            return this.f4983a.isAssignableFrom(cls);
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m6103a(Class cls, InterfaceC0128d interfaceC0128d) {
        this.f4982a.add(new a(cls, interfaceC0128d));
    }

    /* JADX INFO: renamed from: b */
    public synchronized InterfaceC0128d m6104b(Class cls) {
        for (a aVar : this.f4982a) {
            if (aVar.m6105a(cls)) {
                return aVar.f4984b;
            }
        }
        return null;
    }
}
