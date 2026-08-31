package p368u6;

import kotlin.coroutines.jvm.internal.AbstractC6086a;
import kotlin.coroutines.jvm.internal.AbstractC6093h;
import kotlin.jvm.internal.AbstractC6104G;
import p145S5.AbstractC1437o;
import p145S5.C1436n;
import p173W5.InterfaceC1875e;
import p173W5.InterfaceC1879i;
import p180X5.AbstractC2005b;
import p238e6.InterfaceC5371p;
import p318o6.AbstractC6609F0;
import p318o6.C6602C;
import p318o6.C6640V0;
import p360t6.AbstractC7111K;
import p360t6.C7142z;

/* JADX INFO: renamed from: u6.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7197b {
    /* JADX INFO: renamed from: a */
    public static final void m31766a(InterfaceC5371p interfaceC5371p, Object obj, InterfaceC1875e interfaceC1875e) {
        InterfaceC1875e interfaceC1875eM27133a = AbstractC6093h.m27133a(interfaceC1875e);
        try {
            InterfaceC1879i context = interfaceC1875eM27133a.getContext();
            Object objM31410i = AbstractC7111K.m31410i(context, null);
            try {
                AbstractC6093h.m27134b(interfaceC1875eM27133a);
                Object objD = !(interfaceC5371p instanceof AbstractC6086a) ? AbstractC2005b.m8368d(interfaceC5371p, obj, interfaceC1875eM27133a) : ((InterfaceC5371p) AbstractC6104G.m27161d(interfaceC5371p, 2)).invoke(obj, interfaceC1875eM27133a);
                AbstractC7111K.m31407f(context, objM31410i);
                if (objD != AbstractC2005b.m8369e()) {
                    interfaceC1875eM27133a.resumeWith(C1436n.m6073b(objD));
                }
            } catch (Throwable th) {
                AbstractC7111K.m31407f(context, objM31410i);
                throw th;
            }
        } catch (Throwable th2) {
            C1436n.a aVar = C1436n.f4958b;
            interfaceC1875eM27133a.resumeWith(C1436n.m6073b(AbstractC1437o.m6081a(th2)));
        }
    }

    /* JADX INFO: renamed from: b */
    public static final Object m31767b(C7142z c7142z, Object obj, InterfaceC5371p interfaceC5371p) {
        Object c6602c;
        Object objM28033g0;
        try {
            c6602c = !(interfaceC5371p instanceof AbstractC6086a) ? AbstractC2005b.m8368d(interfaceC5371p, obj, c7142z) : ((InterfaceC5371p) AbstractC6104G.m27161d(interfaceC5371p, 2)).invoke(obj, c7142z);
        } catch (Throwable th) {
            c6602c = new C6602C(th, false, 2, null);
        }
        if (c6602c != AbstractC2005b.m8369e() && (objM28033g0 = c7142z.m28033g0(c6602c)) != AbstractC6609F0.f24898b) {
            if (objM28033g0 instanceof C6602C) {
                throw ((C6602C) objM28033g0).f24874a;
            }
            return AbstractC6609F0.m28072h(objM28033g0);
        }
        return AbstractC2005b.m8369e();
    }

    /* JADX INFO: renamed from: c */
    public static final Object m31768c(C7142z c7142z, Object obj, InterfaceC5371p interfaceC5371p) throws Throwable {
        Object c6602c;
        Object objM28033g0;
        try {
            c6602c = !(interfaceC5371p instanceof AbstractC6086a) ? AbstractC2005b.m8368d(interfaceC5371p, obj, c7142z) : ((InterfaceC5371p) AbstractC6104G.m27161d(interfaceC5371p, 2)).invoke(obj, c7142z);
        } catch (Throwable th) {
            c6602c = new C6602C(th, false, 2, null);
        }
        if (c6602c != AbstractC2005b.m8369e() && (objM28033g0 = c7142z.m28033g0(c6602c)) != AbstractC6609F0.f24898b) {
            if (objM28033g0 instanceof C6602C) {
                Throwable th2 = ((C6602C) objM28033g0).f24874a;
                if (!(th2 instanceof C6640V0) || ((C6640V0) th2).f24929a != c7142z) {
                    throw th2;
                }
                if (c6602c instanceof C6602C) {
                    throw ((C6602C) c6602c).f24874a;
                }
            } else {
                c6602c = AbstractC6609F0.m28072h(objM28033g0);
            }
            return c6602c;
        }
        return AbstractC2005b.m8369e();
    }
}
