package io.grpc.internal;

import java.text.MessageFormat;
import java.util.logging.Level;
import p063H5.AbstractC0541f;
import p063H5.C0511F;
import p063H5.C0516K;
import p122P3.AbstractC1209m;

/* JADX INFO: renamed from: io.grpc.internal.o */
/* JADX INFO: loaded from: classes.dex */
final class C5798o extends AbstractC0541f {

    /* JADX INFO: renamed from: a */
    private final C5800p f22800a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC5756R0 f22801b;

    /* JADX INFO: renamed from: io.grpc.internal.o$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f22802a;

        static {
            int[] iArr = new int[AbstractC0541f.a.values().length];
            f22802a = iArr;
            try {
                iArr[AbstractC0541f.a.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22802a[AbstractC0541f.a.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22802a[AbstractC0541f.a.INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    C5798o(C5800p c5800p, InterfaceC5756R0 interfaceC5756R0) {
        this.f22800a = (C5800p) AbstractC1209m.m5303o(c5800p, "tracer");
        this.f22801b = (InterfaceC5756R0) AbstractC1209m.m5303o(interfaceC5756R0, "time");
    }

    /* JADX INFO: renamed from: c */
    private boolean m26094c(AbstractC0541f.a aVar) {
        return aVar != AbstractC0541f.a.DEBUG && this.f22800a.m26105c();
    }

    /* JADX INFO: renamed from: d */
    static void m26095d(C0516K c0516k, AbstractC0541f.a aVar, String str) {
        Level levelM26097f = m26097f(aVar);
        if (C5800p.f22814f.isLoggable(levelM26097f)) {
            C5800p.m26103d(c0516k, levelM26097f, str);
        }
    }

    /* JADX INFO: renamed from: e */
    static void m26096e(C0516K c0516k, AbstractC0541f.a aVar, String str, Object... objArr) {
        Level levelM26097f = m26097f(aVar);
        if (C5800p.f22814f.isLoggable(levelM26097f)) {
            C5800p.m26103d(c0516k, levelM26097f, MessageFormat.format(str, objArr));
        }
    }

    /* JADX INFO: renamed from: f */
    private static Level m26097f(AbstractC0541f.a aVar) {
        int i7 = a.f22802a[aVar.ordinal()];
        if (i7 == 1 || i7 == 2) {
            return Level.FINE;
        }
        return i7 != 3 ? Level.FINEST : Level.FINER;
    }

    /* JADX INFO: renamed from: g */
    private static C0511F.b m26098g(AbstractC0541f.a aVar) {
        int i7 = a.f22802a[aVar.ordinal()];
        if (i7 != 1) {
            return i7 != 2 ? C0511F.b.CT_INFO : C0511F.b.CT_WARNING;
        }
        return C0511F.b.CT_ERROR;
    }

    /* JADX INFO: renamed from: h */
    private void m26099h(AbstractC0541f.a aVar, String str) {
        if (aVar == AbstractC0541f.a.DEBUG) {
            return;
        }
        this.f22800a.m26107f(new C0511F.a().m2147b(str).m2148c(m26098g(aVar)).m2150e(this.f22801b.mo25662a()).m2146a());
    }

    @Override // p063H5.AbstractC0541f
    /* JADX INFO: renamed from: a */
    public void mo2419a(AbstractC0541f.a aVar, String str) {
        m26095d(this.f22800a.m26104b(), aVar, str);
        if (m26094c(aVar)) {
            m26099h(aVar, str);
        }
    }

    @Override // p063H5.AbstractC0541f
    /* JADX INFO: renamed from: b */
    public void mo2420b(AbstractC0541f.a aVar, String str, Object... objArr) {
        mo2419a(aVar, (m26094c(aVar) || C5800p.f22814f.isLoggable(m26097f(aVar))) ? MessageFormat.format(str, objArr) : null);
    }
}
