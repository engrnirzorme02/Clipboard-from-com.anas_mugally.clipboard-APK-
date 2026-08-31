package p063H5;

import io.grpc.internal.C5730E;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import p122P3.AbstractC1209m;
import p129Q3.AbstractC1273l;

/* JADX INFO: renamed from: H5.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0540e0 {

    /* JADX INFO: renamed from: e */
    private static final Logger f2070e = Logger.getLogger(C0540e0.class.getName());

    /* JADX INFO: renamed from: f */
    private static C0540e0 f2071f;

    /* JADX INFO: renamed from: a */
    private final AbstractC0536c0.c f2072a = new b();

    /* JADX INFO: renamed from: b */
    private String f2073b = "unknown";

    /* JADX INFO: renamed from: c */
    private final LinkedHashSet f2074c = new LinkedHashSet();

    /* JADX INFO: renamed from: d */
    private AbstractC1273l f2075d = AbstractC1273l.m5549k();

    /* JADX INFO: renamed from: H5.e0$b */
    private final class b extends AbstractC0536c0.c {
        private b() {
        }
    }

    /* JADX INFO: renamed from: H5.e0$c */
    private static final class c implements AbstractC0552k0.b {
        private c() {
        }

        @Override // p063H5.AbstractC0552k0.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int mo2242b(AbstractC0538d0 abstractC0538d0) {
            return abstractC0538d0.mo2409f();
        }

        @Override // p063H5.AbstractC0552k0.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean mo2241a(AbstractC0538d0 abstractC0538d0) {
            return abstractC0538d0.mo2408e();
        }
    }

    /* JADX INFO: renamed from: a */
    private synchronized void m2410a(AbstractC0538d0 abstractC0538d0) {
        AbstractC1209m.m5293e(abstractC0538d0.mo2408e(), "isAvailable() returned false");
        this.f2074c.add(abstractC0538d0);
    }

    /* JADX INFO: renamed from: b */
    public static synchronized C0540e0 m2411b() {
        try {
            if (f2071f == null) {
                List<AbstractC0538d0> listM2442e = AbstractC0552k0.m2442e(AbstractC0538d0.class, m2412d(), AbstractC0538d0.class.getClassLoader(), new c());
                if (listM2442e.isEmpty()) {
                    f2070e.warning("No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration");
                }
                f2071f = new C0540e0();
                for (AbstractC0538d0 abstractC0538d0 : listM2442e) {
                    f2070e.fine("Service loader found " + abstractC0538d0);
                    f2071f.m2410a(abstractC0538d0);
                }
                f2071f.m2413g();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f2071f;
    }

    /* JADX INFO: renamed from: d */
    static List m2412d() {
        ArrayList arrayList = new ArrayList();
        try {
            int i7 = C5730E.f22163b;
            arrayList.add(C5730E.class);
        } catch (ClassNotFoundException e7) {
            f2070e.log(Level.FINE, "Unable to find DNS NameResolver", (Throwable) e7);
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: g */
    private synchronized void m2413g() {
        try {
            HashMap map = new HashMap();
            String strM2407d = "unknown";
            int iMo2409f = Integer.MIN_VALUE;
            for (AbstractC0538d0 abstractC0538d0 : this.f2074c) {
                String strM2407d2 = abstractC0538d0.m2407d();
                AbstractC0538d0 abstractC0538d1 = (AbstractC0538d0) map.get(strM2407d2);
                if (abstractC0538d1 == null || abstractC0538d1.mo2409f() < abstractC0538d0.mo2409f()) {
                    map.put(strM2407d2, abstractC0538d0);
                }
                if (iMo2409f < abstractC0538d0.mo2409f()) {
                    iMo2409f = abstractC0538d0.mo2409f();
                    strM2407d = abstractC0538d0.m2407d();
                }
            }
            this.f2075d = AbstractC1273l.m5548c(map);
            this.f2073b = strM2407d;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public synchronized String m2414c() {
        return this.f2073b;
    }

    /* JADX INFO: renamed from: e */
    public AbstractC0538d0 m2415e(String str) {
        if (str == null) {
            return null;
        }
        return (AbstractC0538d0) m2416f().get(str.toLowerCase(Locale.US));
    }

    /* JADX INFO: renamed from: f */
    synchronized Map m2416f() {
        return this.f2075d;
    }
}
