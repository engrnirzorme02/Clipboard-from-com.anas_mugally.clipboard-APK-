package p179X4;

import com.google.protobuf.AbstractC5104i;
import java.util.HashMap;
import java.util.Map;
import p137R4.C1366m;
import p158U4.C1687k;
import p186Y4.AbstractC2034b;
import p350s4.C7011e;

/* JADX INFO: renamed from: X4.T */
/* JADX INFO: loaded from: classes.dex */
final class C1972T {

    /* JADX INFO: renamed from: a */
    private int f6513a = 0;

    /* JADX INFO: renamed from: b */
    private final Map f6514b = new HashMap();

    /* JADX INFO: renamed from: c */
    private boolean f6515c = true;

    /* JADX INFO: renamed from: d */
    private AbstractC5104i f6516d = AbstractC5104i.f19401b;

    /* JADX INFO: renamed from: e */
    private boolean f6517e = false;

    /* JADX INFO: renamed from: X4.T$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f6518a;

        static {
            int[] iArr = new int[C1366m.a.values().length];
            f6518a = iArr;
            try {
                iArr[C1366m.a.ADDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6518a[C1366m.a.MODIFIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6518a[C1366m.a.REMOVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    C1972T() {
    }

    /* JADX INFO: renamed from: a */
    void m8230a(C1687k c1687k, C1366m.a aVar) {
        this.f6515c = true;
        this.f6514b.put(c1687k, aVar);
    }

    /* JADX INFO: renamed from: b */
    void m8231b() {
        this.f6515c = false;
        this.f6514b.clear();
    }

    /* JADX INFO: renamed from: c */
    boolean m8232c() {
        return this.f6515c;
    }

    /* JADX INFO: renamed from: d */
    boolean m8233d() {
        return this.f6517e;
    }

    /* JADX INFO: renamed from: e */
    boolean m8234e() {
        return this.f6513a != 0;
    }

    /* JADX INFO: renamed from: f */
    void m8235f() {
        this.f6515c = true;
        this.f6517e = true;
    }

    /* JADX INFO: renamed from: g */
    void m8236g() {
        this.f6513a++;
    }

    /* JADX INFO: renamed from: h */
    void m8237h() {
        this.f6513a--;
    }

    /* JADX INFO: renamed from: i */
    void m8238i(C1687k c1687k) {
        this.f6515c = true;
        this.f6514b.remove(c1687k);
    }

    /* JADX INFO: renamed from: j */
    C1971S m8239j() {
        C7011e c7011eM7086j = C1687k.m7086j();
        C7011e c7011eM7086j2 = C1687k.m7086j();
        C7011e c7011eM7086j3 = C1687k.m7086j();
        C7011e c7011eM30620g = c7011eM7086j;
        C7011e c7011eM30620g2 = c7011eM7086j2;
        C7011e c7011eM30620g3 = c7011eM7086j3;
        for (Map.Entry entry : this.f6514b.entrySet()) {
            C1687k c1687k = (C1687k) entry.getKey();
            C1366m.a aVar = (C1366m.a) entry.getValue();
            int i7 = a.f6518a[aVar.ordinal()];
            if (i7 == 1) {
                c7011eM30620g = c7011eM30620g.m30620g(c1687k);
            } else if (i7 == 2) {
                c7011eM30620g2 = c7011eM30620g2.m30620g(c1687k);
            } else {
                if (i7 != 3) {
                    throw AbstractC2034b.m8457a("Encountered invalid change type: %s", aVar);
                }
                c7011eM30620g3 = c7011eM30620g3.m30620g(c1687k);
            }
        }
        return new C1971S(this.f6516d, this.f6517e, c7011eM30620g, c7011eM30620g2, c7011eM30620g3);
    }

    /* JADX INFO: renamed from: k */
    void m8240k(AbstractC5104i abstractC5104i) {
        if (abstractC5104i.isEmpty()) {
            return;
        }
        this.f6515c = true;
        this.f6516d = abstractC5104i;
    }
}
