package p063H5;

import io.grpc.internal.C5813v0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p122P3.AbstractC1209m;
import p124P5.C1240k;

/* JADX INFO: renamed from: H5.U */
/* JADX INFO: loaded from: classes.dex */
public final class C0525U {

    /* JADX INFO: renamed from: d */
    private static C0525U f1969d;

    /* JADX INFO: renamed from: a */
    private final LinkedHashSet f1971a = new LinkedHashSet();

    /* JADX INFO: renamed from: b */
    private final LinkedHashMap f1972b = new LinkedHashMap();

    /* JADX INFO: renamed from: c */
    private static final Logger f1968c = Logger.getLogger(C0525U.class.getName());

    /* JADX INFO: renamed from: e */
    private static final Iterable f1970e = m2238c();

    /* JADX INFO: renamed from: H5.U$a */
    private static final class a implements AbstractC0552k0.b {
        a() {
        }

        @Override // p063H5.AbstractC0552k0.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int mo2242b(AbstractC0524T abstractC0524T) {
            return abstractC0524T.mo2233c();
        }

        @Override // p063H5.AbstractC0552k0.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean mo2241a(AbstractC0524T abstractC0524T) {
            return abstractC0524T.mo2234d();
        }
    }

    /* JADX INFO: renamed from: a */
    private synchronized void m2236a(AbstractC0524T abstractC0524T) {
        AbstractC1209m.m5293e(abstractC0524T.mo2234d(), "isAvailable() returned false");
        this.f1971a.add(abstractC0524T);
    }

    /* JADX INFO: renamed from: b */
    public static synchronized C0525U m2237b() {
        try {
            if (f1969d == null) {
                List<AbstractC0524T> listM2442e = AbstractC0552k0.m2442e(AbstractC0524T.class, f1970e, AbstractC0524T.class.getClassLoader(), new a());
                f1969d = new C0525U();
                for (AbstractC0524T abstractC0524T : listM2442e) {
                    f1968c.fine("Service loader found " + abstractC0524T);
                    f1969d.m2236a(abstractC0524T);
                }
                f1969d.m2239e();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f1969d;
    }

    /* JADX INFO: renamed from: c */
    static List m2238c() {
        ArrayList arrayList = new ArrayList();
        try {
            int i7 = C5813v0.f22931c;
            arrayList.add(C5813v0.class);
        } catch (ClassNotFoundException e7) {
            f1968c.log(Level.WARNING, "Unable to find pick-first LoadBalancer", (Throwable) e7);
        }
        try {
            int i8 = C1240k.f4450b;
            arrayList.add(C1240k.class);
        } catch (ClassNotFoundException e8) {
            f1968c.log(Level.FINE, "Unable to find round-robin LoadBalancer", (Throwable) e8);
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: e */
    private synchronized void m2239e() {
        try {
            this.f1972b.clear();
            for (AbstractC0524T abstractC0524T : this.f1971a) {
                String strMo2232b = abstractC0524T.mo2232b();
                AbstractC0524T abstractC0524T2 = (AbstractC0524T) this.f1972b.get(strMo2232b);
                if (abstractC0524T2 == null || abstractC0524T2.mo2233c() < abstractC0524T.mo2233c()) {
                    this.f1972b.put(strMo2232b, abstractC0524T);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public synchronized AbstractC0524T m2240d(String str) {
        return (AbstractC0524T) this.f1972b.get(AbstractC1209m.m5303o(str, "policy"));
    }
}
