package p318o6;

import kotlin.coroutines.jvm.internal.AbstractC6093h;
import kotlin.jvm.internal.AbstractC6118n;
import p173W5.C1880j;
import p173W5.InterfaceC1875e;
import p173W5.InterfaceC1876f;
import p173W5.InterfaceC1879i;
import p180X5.AbstractC2005b;
import p238e6.InterfaceC5371p;
import p360t6.AbstractC7111K;
import p360t6.C7142z;
import p368u6.AbstractC7196a;
import p368u6.AbstractC7197b;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: o6.k */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC6672k {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC6639V m28224a(InterfaceC6624N interfaceC6624N, InterfaceC1879i interfaceC1879i, EnumC6628P enumC6628P, InterfaceC5371p interfaceC5371p) {
        InterfaceC1879i interfaceC1879iM28083k = AbstractC6614I.m28083k(interfaceC6624N, interfaceC1879i);
        C6641W c6611g0 = enumC6628P.m28107h() ? new C6611G0(interfaceC1879iM28083k, interfaceC5371p) : new C6641W(interfaceC1879iM28083k, true);
        c6611g0.m28148M0(enumC6628P, c6611g0, interfaceC5371p);
        return c6611g0;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ InterfaceC6639V m28225b(InterfaceC6624N interfaceC6624N, InterfaceC1879i interfaceC1879i, EnumC6628P enumC6628P, InterfaceC5371p interfaceC5371p, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            interfaceC1879i = C1880j.f6044a;
        }
        if ((i7 & 2) != 0) {
            enumC6628P = EnumC6628P.DEFAULT;
        }
        return AbstractC6668i.m28180a(interfaceC6624N, interfaceC1879i, enumC6628P, interfaceC5371p);
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC6701y0 m28226c(InterfaceC6624N interfaceC6624N, InterfaceC1879i interfaceC1879i, EnumC6628P enumC6628P, InterfaceC5371p interfaceC5371p) {
        InterfaceC1879i interfaceC1879iM28083k = AbstractC6614I.m28083k(interfaceC6624N, interfaceC1879i);
        C6631Q0 c6613h0 = enumC6628P.m28107h() ? new C6613H0(interfaceC1879iM28083k, interfaceC5371p) : new C6631Q0(interfaceC1879iM28083k, true);
        c6613h0.m28148M0(enumC6628P, c6613h0, interfaceC5371p);
        return c6613h0;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ InterfaceC6701y0 m28227d(InterfaceC6624N interfaceC6624N, InterfaceC1879i interfaceC1879i, EnumC6628P enumC6628P, InterfaceC5371p interfaceC5371p, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            interfaceC1879i = C1880j.f6044a;
        }
        if ((i7 & 2) != 0) {
            enumC6628P = EnumC6628P.DEFAULT;
        }
        return AbstractC6668i.m28182c(interfaceC6624N, interfaceC1879i, enumC6628P, interfaceC5371p);
    }

    /* JADX INFO: renamed from: e */
    public static final Object m28228e(InterfaceC1879i interfaceC1879i, InterfaceC5371p interfaceC5371p, InterfaceC1875e interfaceC1875e) {
        Object objM28143N0;
        InterfaceC1879i context = interfaceC1875e.getContext();
        InterfaceC1879i interfaceC1879iM28082j = AbstractC6614I.m28082j(context, interfaceC1879i);
        AbstractC6601B0.m27951h(interfaceC1879iM28082j);
        if (interfaceC1879iM28082j == context) {
            C7142z c7142z = new C7142z(interfaceC1879iM28082j, interfaceC1875e);
            objM28143N0 = AbstractC7197b.m31767b(c7142z, c7142z, interfaceC5371p);
        } else {
            InterfaceC1876f.b bVar = InterfaceC1876f.f6042h;
            if (AbstractC6118n.m27183a(interfaceC1879iM28082j.get(bVar), context.get(bVar))) {
                C6648Z0 c6648z0 = new C6648Z0(interfaceC1879iM28082j, interfaceC1875e);
                InterfaceC1879i context2 = c6648z0.getContext();
                Object objM31410i = AbstractC7111K.m31410i(context2, null);
                try {
                    Object objM31767b = AbstractC7197b.m31767b(c6648z0, c6648z0, interfaceC5371p);
                    AbstractC7111K.m31407f(context2, objM31410i);
                    objM28143N0 = objM31767b;
                } catch (Throwable th) {
                    AbstractC7111K.m31407f(context2, objM31410i);
                    throw th;
                }
            } else {
                C6647Z c6647z = new C6647Z(interfaceC1879iM28082j, interfaceC1875e);
                AbstractC7196a.m31765c(interfaceC5371p, c6647z, c6647z);
                objM28143N0 = c6647z.m28143N0();
            }
        }
        if (objM28143N0 == AbstractC2005b.m8369e()) {
            AbstractC6093h.m27135c(interfaceC1875e);
        }
        return objM28143N0;
    }
}
