package p368u6;

import p145S5.AbstractC1437o;
import p145S5.C1436n;
import p145S5.C1444v;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p238e6.InterfaceC5371p;
import p360t6.AbstractC7125i;

/* JADX INFO: renamed from: u6.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7196a {
    /* JADX INFO: renamed from: a */
    private static final void m31763a(InterfaceC1875e interfaceC1875e, Throwable th) throws Throwable {
        C1436n.a aVar = C1436n.f4958b;
        interfaceC1875e.resumeWith(C1436n.m6073b(AbstractC1437o.m6081a(th)));
        throw th;
    }

    /* JADX INFO: renamed from: b */
    public static final void m31764b(InterfaceC1875e interfaceC1875e, InterfaceC1875e interfaceC1875e2) throws Throwable {
        try {
            InterfaceC1875e interfaceC1875eC = AbstractC2005b.m8367c(interfaceC1875e);
            C1436n.a aVar = C1436n.f4958b;
            AbstractC7125i.m31458b(interfaceC1875eC, C1436n.m6073b(C1444v.f4971a));
        } catch (Throwable th) {
            m31763a(interfaceC1875e2, th);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m31765c(InterfaceC5371p interfaceC5371p, Object obj, InterfaceC1875e interfaceC1875e) {
        try {
            InterfaceC1875e interfaceC1875eC = AbstractC2005b.m8367c(AbstractC2005b.m8365a(interfaceC5371p, obj, interfaceC1875e));
            C1436n.a aVar = C1436n.f4958b;
            AbstractC7125i.m31458b(interfaceC1875eC, C1436n.m6073b(C1444v.f4971a));
        } catch (Throwable th) {
            m31763a(interfaceC1875e, th);
        }
    }
}
