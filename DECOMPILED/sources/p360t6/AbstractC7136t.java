package p360t6;

import java.util.List;
import p145S5.C1426d;
import p318o6.AbstractC6615I0;

/* JADX INFO: renamed from: t6.t */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7136t {
    /* JADX INFO: renamed from: a */
    private static final AbstractC7137u m31510a(Throwable th, String str) throws Throwable {
        if (th != null) {
            throw th;
        }
        m31513d();
        throw new C1426d();
    }

    /* JADX INFO: renamed from: b */
    static /* synthetic */ AbstractC7137u m31511b(Throwable th, String str, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            th = null;
        }
        if ((i7 & 2) != 0) {
            str = null;
        }
        return m31510a(th, str);
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m31512c(AbstractC6615I0 abstractC6615I0) {
        return abstractC6615I0.mo28087U0() instanceof AbstractC7137u;
    }

    /* JADX INFO: renamed from: d */
    public static final Void m31513d() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    /* JADX INFO: renamed from: e */
    public static final AbstractC6615I0 m31514e(InterfaceC7134r interfaceC7134r, List list) {
        try {
            return interfaceC7134r.mo29607b(list);
        } catch (Throwable th) {
            return m31510a(th, interfaceC7134r.mo29606a());
        }
    }
}
