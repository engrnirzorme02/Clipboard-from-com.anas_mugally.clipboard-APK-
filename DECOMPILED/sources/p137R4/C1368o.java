package p137R4;

import com.google.firebase.firestore.EnumC4934t;
import com.google.firebase.firestore.InterfaceC4925k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p063H5.C0554l0;
import p186Y4.AbstractC2032B;
import p186Y4.AbstractC2034b;

/* JADX INFO: renamed from: R4.o */
/* JADX INFO: loaded from: classes.dex */
public final class C1368o implements C1347O.c {

    /* JADX INFO: renamed from: a */
    private final C1347O f4813a;

    /* JADX INFO: renamed from: c */
    private final Set f4815c = new HashSet();

    /* JADX INFO: renamed from: d */
    private EnumC1341I f4816d = EnumC1341I.UNKNOWN;

    /* JADX INFO: renamed from: b */
    private final Map f4814b = new HashMap();

    /* JADX INFO: renamed from: R4.o$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f4817a;

        /* JADX INFO: renamed from: b */
        static final /* synthetic */ int[] f4818b;

        static {
            int[] iArr = new int[c.values().length];
            f4818b = iArr;
            try {
                iArr[c.TERMINATE_LOCAL_LISTEN_AND_REQUIRE_WATCH_DISCONNECTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4818b[c.TERMINATE_LOCAL_LISTEN_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4818b[c.REQUIRE_WATCH_DISCONNECTION_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[d.values().length];
            f4817a = iArr2;
            try {
                iArr2[d.INITIALIZE_LOCAL_LISTEN_AND_REQUIRE_WATCH_CONNECTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4817a[d.INITIALIZE_LOCAL_LISTEN_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4817a[d.REQUIRE_WATCH_CONNECTION_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: renamed from: R4.o$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public boolean f4819a;

        /* JADX INFO: renamed from: b */
        public boolean f4820b;

        /* JADX INFO: renamed from: c */
        public boolean f4821c;

        /* JADX INFO: renamed from: d */
        public EnumC4934t f4822d = EnumC4934t.DEFAULT;
    }

    /* JADX INFO: renamed from: R4.o$c */
    private enum c {
        TERMINATE_LOCAL_LISTEN_AND_REQUIRE_WATCH_DISCONNECTION,
        TERMINATE_LOCAL_LISTEN_ONLY,
        REQUIRE_WATCH_DISCONNECTION_ONLY,
        NO_ACTION_REQUIRED
    }

    /* JADX INFO: renamed from: R4.o$d */
    private enum d {
        INITIALIZE_LOCAL_LISTEN_AND_REQUIRE_WATCH_CONNECTION,
        INITIALIZE_LOCAL_LISTEN_ONLY,
        REQUIRE_WATCH_CONNECTION_ONLY,
        NO_ACTION_REQUIRED
    }

    /* JADX INFO: renamed from: R4.o$e */
    private static class e {

        /* JADX INFO: renamed from: a */
        private final List f4833a = new ArrayList();

        /* JADX INFO: renamed from: b */
        private C1353V f4834b;

        /* JADX INFO: renamed from: c */
        private int f4835c;

        e() {
        }

        /* JADX INFO: renamed from: f */
        boolean m5920f() {
            Iterator it = this.f4833a.iterator();
            while (it.hasNext()) {
                if (((C1344L) it.next()).m5775b()) {
                    return true;
                }
            }
            return false;
        }
    }

    public C1368o(C1347O c1347o) {
        this.f4813a = c1347o;
        c1347o.m5798u(this);
    }

    /* JADX INFO: renamed from: e */
    private void m5910e() {
        Iterator it = this.f4815c.iterator();
        while (it.hasNext()) {
            ((InterfaceC4925k) it.next()).mo5870a(null, null);
        }
    }

    @Override // p137R4.C1347O.c
    /* JADX INFO: renamed from: a */
    public void mo5804a(EnumC1341I enumC1341I) {
        this.f4816d = enumC1341I;
        Iterator it = this.f4814b.values().iterator();
        boolean z7 = false;
        while (it.hasNext()) {
            Iterator it2 = ((e) it.next()).f4833a.iterator();
            while (it2.hasNext()) {
                if (((C1344L) it2.next()).m5777d(enumC1341I)) {
                    z7 = true;
                }
            }
        }
        if (z7) {
            m5910e();
        }
    }

    @Override // p137R4.C1347O.c
    /* JADX INFO: renamed from: b */
    public void mo5805b(C1343K c1343k, C0554l0 c0554l0) {
        e eVar = (e) this.f4814b.get(c1343k);
        if (eVar != null) {
            Iterator it = eVar.f4833a.iterator();
            while (it.hasNext()) {
                ((C1344L) it.next()).m5776c(AbstractC2032B.m8452q(c0554l0));
            }
        }
        this.f4814b.remove(c1343k);
    }

    @Override // p137R4.C1347O.c
    /* JADX INFO: renamed from: c */
    public void mo5806c(List list) {
        Iterator it = list.iterator();
        boolean z7 = false;
        while (it.hasNext()) {
            C1353V c1353v = (C1353V) it.next();
            e eVar = (e) this.f4814b.get(c1353v.m5855h());
            if (eVar != null) {
                Iterator it2 = eVar.f4833a.iterator();
                while (it2.hasNext()) {
                    if (((C1344L) it2.next()).m5778e(c1353v)) {
                        z7 = true;
                    }
                }
                eVar.f4834b = c1353v;
            }
        }
        if (z7) {
            m5910e();
        }
    }

    /* JADX INFO: renamed from: d */
    public int m5911d(C1344L c1344l) {
        C1343K c1343kM5774a = c1344l.m5774a();
        d dVar = d.NO_ACTION_REQUIRED;
        e eVar = (e) this.f4814b.get(c1343kM5774a);
        if (eVar == null) {
            eVar = new e();
            this.f4814b.put(c1343kM5774a, eVar);
            dVar = c1344l.m5775b() ? d.INITIALIZE_LOCAL_LISTEN_AND_REQUIRE_WATCH_CONNECTION : d.INITIALIZE_LOCAL_LISTEN_ONLY;
        } else if (!eVar.m5920f() && c1344l.m5775b()) {
            dVar = d.REQUIRE_WATCH_CONNECTION_ONLY;
        }
        eVar.f4833a.add(c1344l);
        AbstractC2034b.m8460d(!c1344l.m5777d(this.f4816d), "onOnlineStateChanged() shouldn't raise an event for brand-new listeners.", new Object[0]);
        if (eVar.f4834b != null && c1344l.m5778e(eVar.f4834b)) {
            m5910e();
        }
        int i7 = a.f4817a[dVar.ordinal()];
        if (i7 == 1) {
            eVar.f4835c = this.f4813a.m5796m(c1343kM5774a, true);
        } else if (i7 == 2) {
            eVar.f4835c = this.f4813a.m5796m(c1343kM5774a, false);
        } else if (i7 == 3) {
            this.f4813a.m5797n(c1343kM5774a);
        }
        return eVar.f4835c;
    }

    /* JADX INFO: renamed from: f */
    public void m5912f(C1344L c1344l) {
        C1343K c1343kM5774a = c1344l.m5774a();
        e eVar = (e) this.f4814b.get(c1343kM5774a);
        c cVar = c.NO_ACTION_REQUIRED;
        if (eVar == null) {
            return;
        }
        eVar.f4833a.remove(c1344l);
        if (eVar.f4833a.isEmpty()) {
            cVar = c1344l.m5775b() ? c.TERMINATE_LOCAL_LISTEN_AND_REQUIRE_WATCH_DISCONNECTION : c.TERMINATE_LOCAL_LISTEN_ONLY;
        } else if (!eVar.m5920f() && c1344l.m5775b()) {
            cVar = c.REQUIRE_WATCH_DISCONNECTION_ONLY;
        }
        int i7 = a.f4818b[cVar.ordinal()];
        if (i7 == 1) {
            this.f4814b.remove(c1343kM5774a);
            this.f4813a.m5799v(c1343kM5774a, true);
        } else if (i7 == 2) {
            this.f4814b.remove(c1343kM5774a);
            this.f4813a.m5799v(c1343kM5774a, false);
        } else {
            if (i7 != 3) {
                return;
            }
            this.f4813a.m5800w(c1343kM5774a);
        }
    }
}
