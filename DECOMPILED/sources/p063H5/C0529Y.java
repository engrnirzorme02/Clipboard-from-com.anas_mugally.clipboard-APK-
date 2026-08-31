package p063H5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p079J5.C0693g;
import p122P3.AbstractC1209m;

/* JADX INFO: renamed from: H5.Y */
/* JADX INFO: loaded from: classes.dex */
public final class C0529Y {

    /* JADX INFO: renamed from: c */
    private static final Logger f1973c = Logger.getLogger(C0529Y.class.getName());

    /* JADX INFO: renamed from: d */
    private static C0529Y f1974d;

    /* JADX INFO: renamed from: a */
    private final LinkedHashSet f1975a = new LinkedHashSet();

    /* JADX INFO: renamed from: b */
    private List f1976b = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: H5.Y$a */
    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(AbstractC0528X abstractC0528X, AbstractC0528X abstractC0528X2) {
            return abstractC0528X.mo2256c() - abstractC0528X2.mo2256c();
        }
    }

    /* JADX INFO: renamed from: H5.Y$b */
    private static final class b implements AbstractC0552k0.b {
        private b() {
        }

        @Override // p063H5.AbstractC0552k0.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int mo2242b(AbstractC0528X abstractC0528X) {
            return abstractC0528X.mo2256c();
        }

        @Override // p063H5.AbstractC0552k0.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean mo2241a(AbstractC0528X abstractC0528X) {
            return abstractC0528X.mo2255b();
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: a */
    private synchronized void m2257a(AbstractC0528X abstractC0528X) {
        AbstractC1209m.m5293e(abstractC0528X.mo2255b(), "isAvailable() returned false");
        this.f1975a.add(abstractC0528X);
    }

    /* JADX INFO: renamed from: b */
    public static synchronized C0529Y m2258b() {
        try {
            if (f1974d == null) {
                List<AbstractC0528X> listM2442e = AbstractC0552k0.m2442e(AbstractC0528X.class, m2259c(), AbstractC0528X.class.getClassLoader(), new b(null));
                f1974d = new C0529Y();
                for (AbstractC0528X abstractC0528X : listM2442e) {
                    f1973c.fine("Service loader found " + abstractC0528X);
                    f1974d.m2257a(abstractC0528X);
                }
                f1974d.m2260f();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f1974d;
    }

    /* JADX INFO: renamed from: c */
    static List m2259c() {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(C0693g.class);
        } catch (ClassNotFoundException e7) {
            f1973c.log(Level.FINE, "Unable to find OkHttpChannelProvider", (Throwable) e7);
        }
        try {
            arrayList.add(Class.forName("io.grpc.netty.NettyChannelProvider"));
        } catch (ClassNotFoundException e8) {
            f1973c.log(Level.FINE, "Unable to find NettyChannelProvider", (Throwable) e8);
        }
        try {
            arrayList.add(Class.forName("io.grpc.netty.UdsNettyChannelProvider"));
        } catch (ClassNotFoundException e9) {
            f1973c.log(Level.FINE, "Unable to find UdsNettyChannelProvider", (Throwable) e9);
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: f */
    private synchronized void m2260f() {
        ArrayList arrayList = new ArrayList(this.f1975a);
        Collections.sort(arrayList, Collections.reverseOrder(new a()));
        this.f1976b = Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: d */
    AbstractC0528X m2261d() {
        List listM2262e = m2262e();
        if (listM2262e.isEmpty()) {
            return null;
        }
        return (AbstractC0528X) listM2262e.get(0);
    }

    /* JADX INFO: renamed from: e */
    synchronized List m2262e() {
        return this.f1976b;
    }
}
