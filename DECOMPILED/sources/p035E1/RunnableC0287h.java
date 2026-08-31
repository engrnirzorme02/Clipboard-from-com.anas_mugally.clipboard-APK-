package p035E1;

import android.os.Process;
import android.util.Log;
import com.bumptech.glide.C3203c;
import com.bumptech.glide.C3204d;
import com.bumptech.glide.C3205e;
import com.bumptech.glide.C3209i;
import com.bumptech.glide.EnumC3207g;
import com.bumptech.glide.load.data.InterfaceC3219d;
import com.bumptech.glide.load.data.InterfaceC3220e;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import p019C1.C0131g;
import p019C1.C0132h;
import p019C1.EnumC0125a;
import p019C1.EnumC0127c;
import p019C1.InterfaceC0130f;
import p019C1.InterfaceC0135k;
import p019C1.InterfaceC0136l;
import p051G1.InterfaceC0470a;
import p091L1.C0824q;
import p104N.InterfaceC0907d;
import p183Y1.AbstractC2018g;
import p190Z1.AbstractC2083a;
import p190Z1.AbstractC2084b;
import p190Z1.AbstractC2085c;

/* JADX INFO: renamed from: E1.h */
/* JADX INFO: loaded from: classes.dex */
class RunnableC0287h implements InterfaceC0285f.a, Runnable, Comparable, AbstractC2083a.f {

    /* JADX INFO: renamed from: T */
    public static final C0131g f1093T = C0131g.m594e("glide_thread_priority_override");

    /* JADX INFO: renamed from: A */
    private b f1094A;

    /* JADX INFO: renamed from: B */
    private int f1095B;

    /* JADX INFO: renamed from: C */
    private h f1096C;

    /* JADX INFO: renamed from: D */
    private g f1097D;

    /* JADX INFO: renamed from: E */
    private long f1098E;

    /* JADX INFO: renamed from: F */
    private boolean f1099F;

    /* JADX INFO: renamed from: G */
    private Object f1100G;

    /* JADX INFO: renamed from: H */
    private C3205e f1101H;

    /* JADX INFO: renamed from: I */
    private Supplier f1102I;

    /* JADX INFO: renamed from: J */
    private Thread f1103J;

    /* JADX INFO: renamed from: K */
    private InterfaceC0130f f1104K;

    /* JADX INFO: renamed from: L */
    private InterfaceC0130f f1105L;

    /* JADX INFO: renamed from: M */
    private Object f1106M;

    /* JADX INFO: renamed from: N */
    private EnumC0125a f1107N;

    /* JADX INFO: renamed from: O */
    private InterfaceC3219d f1108O;

    /* JADX INFO: renamed from: P */
    private volatile InterfaceC0285f f1109P;

    /* JADX INFO: renamed from: Q */
    private volatile boolean f1110Q;

    /* JADX INFO: renamed from: R */
    private volatile boolean f1111R;

    /* JADX INFO: renamed from: S */
    private boolean f1112S;

    /* JADX INFO: renamed from: d */
    private final e f1116d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC0907d f1117e;

    /* JADX INFO: renamed from: s */
    private C3204d f1120s;

    /* JADX INFO: renamed from: t */
    private InterfaceC0130f f1121t;

    /* JADX INFO: renamed from: u */
    private EnumC3207g f1122u;

    /* JADX INFO: renamed from: v */
    private C0293n f1123v;

    /* JADX INFO: renamed from: w */
    private int f1124w;

    /* JADX INFO: renamed from: x */
    private int f1125x;

    /* JADX INFO: renamed from: y */
    private AbstractC0289j f1126y;

    /* JADX INFO: renamed from: z */
    private C0132h f1127z;

    /* JADX INFO: renamed from: a */
    private final C0286g f1113a = new C0286g();

    /* JADX INFO: renamed from: b */
    private final List f1114b = new ArrayList();

    /* JADX INFO: renamed from: c */
    private final AbstractC2085c f1115c = AbstractC2085c.m8610a();

    /* JADX INFO: renamed from: f */
    private final d f1118f = new d();

    /* JADX INFO: renamed from: r */
    private final f f1119r = new f();

    /* JADX INFO: renamed from: E1.h$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f1128a;

        /* JADX INFO: renamed from: b */
        static final /* synthetic */ int[] f1129b;

        /* JADX INFO: renamed from: c */
        static final /* synthetic */ int[] f1130c;

        static {
            int[] iArr = new int[EnumC0127c.values().length];
            f1130c = iArr;
            try {
                iArr[EnumC0127c.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1130c[EnumC0127c.TRANSFORMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[h.values().length];
            f1129b = iArr2;
            try {
                iArr2[h.RESOURCE_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1129b[h.DATA_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1129b[h.SOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1129b[h.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1129b[h.INITIALIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[g.values().length];
            f1128a = iArr3;
            try {
                iArr3[g.INITIALIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f1128a[g.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f1128a[g.DECODE_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: renamed from: E1.h$b */
    interface b {
        /* JADX INFO: renamed from: a */
        void mo1372a(InterfaceC0301v interfaceC0301v, EnumC0125a enumC0125a, boolean z7);

        /* JADX INFO: renamed from: c */
        void mo1373c(C0296q c0296q);

        /* JADX INFO: renamed from: d */
        void mo1374d(RunnableC0287h runnableC0287h);
    }

    /* JADX INFO: renamed from: E1.h$c */
    private final class c implements C0288i.a {

        /* JADX INFO: renamed from: a */
        private final EnumC0125a f1131a;

        c(EnumC0125a enumC0125a) {
            this.f1131a = enumC0125a;
        }

        @Override // p035E1.C0288i.a
        /* JADX INFO: renamed from: a */
        public InterfaceC0301v mo1375a(InterfaceC0301v interfaceC0301v) {
            return RunnableC0287h.this.m1365I(this.f1131a, interfaceC0301v);
        }
    }

    /* JADX INFO: renamed from: E1.h$d */
    private static class d {

        /* JADX INFO: renamed from: a */
        private InterfaceC0130f f1133a;

        /* JADX INFO: renamed from: b */
        private InterfaceC0135k f1134b;

        /* JADX INFO: renamed from: c */
        private C0300u f1135c;

        d() {
        }

        /* JADX INFO: renamed from: a */
        void m1376a() {
            this.f1133a = null;
            this.f1134b = null;
            this.f1135c = null;
        }

        /* JADX INFO: renamed from: b */
        void m1377b(e eVar, C0132h c0132h) {
            AbstractC2084b.m8604a("DecodeJob.encode");
            try {
                eVar.mo1380a().mo2032b(this.f1133a, new C0284e(this.f1134b, this.f1135c, c0132h));
            } finally {
                this.f1135c.m1464g();
                AbstractC2084b.m8608e();
            }
        }

        /* JADX INFO: renamed from: c */
        boolean m1378c() {
            return this.f1135c != null;
        }

        /* JADX INFO: renamed from: d */
        void m1379d(InterfaceC0130f interfaceC0130f, InterfaceC0135k interfaceC0135k, C0300u c0300u) {
            this.f1133a = interfaceC0130f;
            this.f1134b = interfaceC0135k;
            this.f1135c = c0300u;
        }
    }

    /* JADX INFO: renamed from: E1.h$e */
    interface e {
        /* JADX INFO: renamed from: a */
        InterfaceC0470a mo1380a();
    }

    /* JADX INFO: renamed from: E1.h$f */
    private static class f {

        /* JADX INFO: renamed from: a */
        private boolean f1136a;

        /* JADX INFO: renamed from: b */
        private boolean f1137b;

        /* JADX INFO: renamed from: c */
        private boolean f1138c;

        f() {
        }

        /* JADX INFO: renamed from: a */
        private boolean m1381a(boolean z7) {
            return (this.f1138c || z7 || this.f1137b) && this.f1136a;
        }

        /* JADX INFO: renamed from: b */
        synchronized boolean m1382b() {
            this.f1137b = true;
            return m1381a(false);
        }

        /* JADX INFO: renamed from: c */
        synchronized boolean m1383c() {
            this.f1138c = true;
            return m1381a(false);
        }

        /* JADX INFO: renamed from: d */
        synchronized boolean m1384d(boolean z7) {
            this.f1136a = true;
            return m1381a(z7);
        }

        /* JADX INFO: renamed from: e */
        synchronized void m1385e() {
            this.f1137b = false;
            this.f1136a = false;
            this.f1138c = false;
        }
    }

    /* JADX INFO: renamed from: E1.h$g */
    private enum g {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    /* JADX INFO: renamed from: E1.h$h */
    private enum h {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    RunnableC0287h(e eVar, InterfaceC0907d interfaceC0907d) {
        this.f1116d = eVar;
        this.f1117e = interfaceC0907d;
    }

    /* JADX INFO: renamed from: A */
    private void m1344A(InterfaceC0301v interfaceC0301v, EnumC0125a enumC0125a, boolean z7) {
        if (this.f1101H.m17020a(C3203c.d.class)) {
            m1351O();
        }
        m1355V();
        this.f1094A.mo1372a(interfaceC0301v, enumC0125a, z7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B */
    private void m1345B(InterfaceC0301v interfaceC0301v, EnumC0125a enumC0125a, boolean z7) {
        C0300u c0300u;
        AbstractC2084b.m8604a("DecodeJob.notifyEncodeAndRelease");
        try {
            if (interfaceC0301v instanceof InterfaceC0297r) {
                ((InterfaceC0297r) interfaceC0301v).mo1454a();
            }
            if (this.f1118f.m1378c()) {
                interfaceC0301v = C0300u.m1462e(interfaceC0301v);
                c0300u = interfaceC0301v;
            } else {
                c0300u = 0;
            }
            m1344A(interfaceC0301v, enumC0125a, z7);
            this.f1096C = h.ENCODE;
            try {
                if (this.f1118f.m1378c()) {
                    this.f1118f.m1377b(this.f1116d, this.f1127z);
                }
                if (c0300u != 0) {
                    c0300u.m1464g();
                }
                m1347D();
                AbstractC2084b.m8608e();
            } catch (Throwable th) {
                if (c0300u != 0) {
                    c0300u.m1464g();
                }
                throw th;
            }
        } catch (Throwable th2) {
            AbstractC2084b.m8608e();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: C */
    private void m1346C() {
        if (this.f1101H.m17020a(C3203c.d.class)) {
            m1351O();
        }
        m1355V();
        this.f1094A.mo1373c(new C0296q("Failed to load resource", new ArrayList(this.f1114b)));
        m1348F();
    }

    /* JADX INFO: renamed from: D */
    private void m1347D() {
        if (this.f1119r.m1382b()) {
            m1349K();
        }
    }

    /* JADX INFO: renamed from: F */
    private void m1348F() {
        if (this.f1119r.m1383c()) {
            m1349K();
        }
    }

    /* JADX INFO: renamed from: K */
    private void m1349K() {
        this.f1119r.m1385e();
        this.f1118f.m1376a();
        this.f1113a.m1319a();
        this.f1110Q = false;
        this.f1120s = null;
        this.f1121t = null;
        this.f1127z = null;
        this.f1122u = null;
        this.f1123v = null;
        this.f1094A = null;
        this.f1096C = null;
        this.f1109P = null;
        this.f1103J = null;
        this.f1104K = null;
        this.f1106M = null;
        this.f1107N = null;
        this.f1108O = null;
        this.f1098E = 0L;
        this.f1111R = false;
        this.f1100G = null;
        this.f1114b.clear();
        this.f1117e.mo4130a(this);
    }

    /* JADX INFO: renamed from: M */
    private void m1350M(g gVar) {
        this.f1097D = gVar;
        this.f1094A.mo1374d(this);
    }

    /* JADX INFO: renamed from: O */
    private void m1351O() {
        if (!this.f1101H.m17020a(C3203c.d.class)) {
            throw new IllegalStateException("OverrideGlideThreadPriority experiment is not enabled.");
        }
        Supplier supplier = this.f1102I;
        if (supplier == null || supplier.get() == null) {
            return;
        }
        try {
            Process.setThreadPriority(Process.myTid(), 9);
        } catch (IllegalArgumentException | SecurityException e7) {
            this.f1102I = null;
            if (Log.isLoggable("DecodeJob", 2)) {
                Log.v("DecodeJob", "Failed to set thread priority; using default priority for any subsequent jobs.", e7);
            }
        }
    }

    /* JADX INFO: renamed from: P */
    private void m1352P() {
        this.f1103J = Thread.currentThread();
        this.f1098E = AbstractC2018g.m8393b();
        boolean zMo1312a = false;
        while (!this.f1111R && this.f1109P != null && !(zMo1312a = this.f1109P.mo1312a())) {
            this.f1096C = m1360t(this.f1096C);
            this.f1109P = m1359q();
            if (this.f1096C == h.SOURCE) {
                m1350M(g.SWITCH_TO_SOURCE_SERVICE);
                return;
            }
        }
        if ((this.f1096C == h.FINISHED || this.f1111R) && !zMo1312a) {
            m1346C();
        }
    }

    /* JADX INFO: renamed from: T */
    private InterfaceC0301v m1353T(Object obj, EnumC0125a enumC0125a, C0299t c0299t) {
        C0132h c0132hM1361v = m1361v(enumC0125a);
        InterfaceC3220e interfaceC3220eM17036l = this.f1120s.m17019i().m17036l(obj);
        try {
            return c0299t.m1460a(interfaceC3220eM17036l, c0132hM1361v, this.f1124w, this.f1125x, new c(enumC0125a));
        } finally {
            interfaceC3220eM17036l.mo4041b();
        }
    }

    /* JADX INFO: renamed from: U */
    private void m1354U() {
        int i7 = a.f1128a[this.f1097D.ordinal()];
        if (i7 == 1) {
            this.f1096C = m1360t(h.INITIALIZE);
            this.f1109P = m1359q();
            m1352P();
        } else if (i7 == 2) {
            m1352P();
        } else {
            if (i7 == 3) {
                m1358p();
                return;
            }
            throw new IllegalStateException("Unrecognized run reason: " + this.f1097D);
        }
    }

    /* JADX INFO: renamed from: V */
    private void m1355V() {
        Throwable th;
        this.f1115c.mo8612c();
        if (!this.f1110Q) {
            this.f1110Q = true;
            return;
        }
        if (this.f1114b.isEmpty()) {
            th = null;
        } else {
            List list = this.f1114b;
            th = (Throwable) list.get(list.size() - 1);
        }
        throw new IllegalStateException("Already notified", th);
    }

    /* JADX INFO: renamed from: n */
    private InterfaceC0301v m1356n(InterfaceC3219d interfaceC3219d, Object obj, EnumC0125a enumC0125a) {
        if (obj == null) {
            interfaceC3219d.mo931b();
            return null;
        }
        try {
            long jM8393b = AbstractC2018g.m8393b();
            InterfaceC0301v interfaceC0301vM1357o = m1357o(obj, enumC0125a);
            if (Log.isLoggable("DecodeJob", 2)) {
                m1363y("Decoded result " + interfaceC0301vM1357o, jM8393b);
            }
            return interfaceC0301vM1357o;
        } finally {
            interfaceC3219d.mo931b();
        }
    }

    /* JADX INFO: renamed from: o */
    private InterfaceC0301v m1357o(Object obj, EnumC0125a enumC0125a) {
        return m1353T(obj, enumC0125a, this.f1113a.m1326h(obj.getClass()));
    }

    /* JADX INFO: renamed from: p */
    private void m1358p() {
        Supplier supplier;
        if (Log.isLoggable("DecodeJob", 2)) {
            m1364z("Retrieved data", this.f1098E, "data: " + this.f1106M + ", cache key: " + this.f1104K + ", fetcher: " + this.f1108O);
        }
        InterfaceC0301v interfaceC0301vM1356n = null;
        if (this.f1101H.m17020a(C3203c.d.class) && (supplier = this.f1102I) != null && supplier.get() != null) {
            try {
                Process.setThreadPriority(Process.myTid(), ((Integer) this.f1102I.get()).intValue());
            } catch (IllegalArgumentException | SecurityException e7) {
                this.f1102I = null;
                if (Log.isLoggable("DecodeJob", 2)) {
                    Log.v("DecodeJob", "Failed to set thread priority; using default priority for any subsequent jobs.", e7);
                }
            }
        }
        try {
            interfaceC0301vM1356n = m1356n(this.f1108O, this.f1106M, this.f1107N);
        } catch (C0296q e8) {
            e8.m1450i(this.f1105L, this.f1107N);
            this.f1114b.add(e8);
        }
        if (interfaceC0301vM1356n != null) {
            m1345B(interfaceC0301vM1356n, this.f1107N, this.f1112S);
        } else {
            m1352P();
        }
    }

    /* JADX INFO: renamed from: q */
    private InterfaceC0285f m1359q() {
        int i7 = a.f1129b[this.f1096C.ordinal()];
        if (i7 == 1) {
            return new C0302w(this.f1113a, this);
        }
        if (i7 == 2) {
            return new C0282c(this.f1113a, this);
        }
        if (i7 == 3) {
            return new C0305z(this.f1113a, this);
        }
        if (i7 == 4) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.f1096C);
    }

    /* JADX INFO: renamed from: t */
    private h m1360t(h hVar) {
        int i7 = a.f1129b[hVar.ordinal()];
        if (i7 == 1) {
            return this.f1126y.mo1391a() ? h.DATA_CACHE : m1360t(h.DATA_CACHE);
        }
        if (i7 == 2) {
            return this.f1099F ? h.FINISHED : h.SOURCE;
        }
        if (i7 == 3 || i7 == 4) {
            return h.FINISHED;
        }
        if (i7 == 5) {
            return this.f1126y.mo1392b() ? h.RESOURCE_CACHE : m1360t(h.RESOURCE_CACHE);
        }
        throw new IllegalArgumentException("Unrecognized stage: " + hVar);
    }

    /* JADX INFO: renamed from: v */
    private C0132h m1361v(EnumC0125a enumC0125a) {
        C0132h c0132h = this.f1127z;
        boolean z7 = enumC0125a == EnumC0125a.RESOURCE_DISK_CACHE || this.f1113a.m1342x();
        C0131g c0131g = C0824q.f3280j;
        Boolean bool = (Boolean) c0132h.m600c(c0131g);
        if (bool != null && (!bool.booleanValue() || z7)) {
            return c0132h;
        }
        C0132h c0132h2 = new C0132h();
        c0132h2.m601d(this.f1127z);
        c0132h2.m603f(c0131g, Boolean.valueOf(z7));
        return c0132h2;
    }

    /* JADX INFO: renamed from: w */
    private int m1362w() {
        return this.f1122u.ordinal();
    }

    /* JADX INFO: renamed from: y */
    private void m1363y(String str, long j7) {
        m1364z(str, j7, null);
    }

    /* JADX INFO: renamed from: z */
    private void m1364z(String str, long j7, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(AbstractC2018g.m8392a(j7));
        sb.append(", load key: ");
        sb.append(this.f1123v);
        if (str2 != null) {
            str3 = ", " + str2;
        } else {
            str3 = "";
        }
        sb.append(str3);
        sb.append(", thread: ");
        sb.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sb.toString());
    }

    /* JADX INFO: renamed from: I */
    InterfaceC0301v m1365I(EnumC0125a enumC0125a, InterfaceC0301v interfaceC0301v) {
        InterfaceC0301v interfaceC0301vMo608b;
        InterfaceC0136l interfaceC0136l;
        EnumC0127c enumC0127cMo607b;
        InterfaceC0130f c0283d;
        Class<?> cls = interfaceC0301v.get().getClass();
        InterfaceC0135k interfaceC0135kM1332n = null;
        if (enumC0125a != EnumC0125a.RESOURCE_DISK_CACHE) {
            InterfaceC0136l interfaceC0136lM1337s = this.f1113a.m1337s(cls);
            interfaceC0136l = interfaceC0136lM1337s;
            interfaceC0301vMo608b = interfaceC0136lM1337s.mo608b(this.f1120s, interfaceC0301v, this.f1124w, this.f1125x);
        } else {
            interfaceC0301vMo608b = interfaceC0301v;
            interfaceC0136l = null;
        }
        if (!interfaceC0301v.equals(interfaceC0301vMo608b)) {
            interfaceC0301v.mo1436b();
        }
        if (this.f1113a.m1341w(interfaceC0301vMo608b)) {
            interfaceC0135kM1332n = this.f1113a.m1332n(interfaceC0301vMo608b);
            enumC0127cMo607b = interfaceC0135kM1332n.mo607b(this.f1127z);
        } else {
            enumC0127cMo607b = EnumC0127c.NONE;
        }
        InterfaceC0135k interfaceC0135k = interfaceC0135kM1332n;
        if (!this.f1126y.mo1394d(!this.f1113a.m1343y(this.f1104K), enumC0125a, enumC0127cMo607b)) {
            return interfaceC0301vMo608b;
        }
        if (interfaceC0135k == null) {
            throw new C3209i.d(interfaceC0301vMo608b.get().getClass());
        }
        int i7 = a.f1130c[enumC0127cMo607b.ordinal()];
        if (i7 == 1) {
            c0283d = new C0283d(this.f1104K, this.f1121t);
        } else {
            if (i7 != 2) {
                throw new IllegalArgumentException("Unknown strategy: " + enumC0127cMo607b);
            }
            c0283d = new C0303x(this.f1113a.m1320b(), this.f1104K, this.f1121t, this.f1124w, this.f1125x, interfaceC0136l, cls, this.f1127z);
        }
        C0300u c0300uM1462e = C0300u.m1462e(interfaceC0301vMo608b);
        this.f1118f.m1379d(c0283d, interfaceC0135k, c0300uM1462e);
        return c0300uM1462e;
    }

    /* JADX INFO: renamed from: J */
    void m1366J(boolean z7) {
        if (this.f1119r.m1384d(z7)) {
            m1349K();
        }
    }

    /* JADX INFO: renamed from: W */
    boolean m1367W() {
        h hVarM1360t = m1360t(h.INITIALIZE);
        return hVarM1360t == h.RESOURCE_CACHE || hVarM1360t == h.DATA_CACHE;
    }

    @Override // p035E1.InterfaceC0285f.a
    /* JADX INFO: renamed from: c */
    public void mo1316c(InterfaceC0130f interfaceC0130f, Object obj, InterfaceC3219d interfaceC3219d, EnumC0125a enumC0125a, InterfaceC0130f interfaceC0130f2) {
        this.f1104K = interfaceC0130f;
        this.f1106M = obj;
        this.f1108O = interfaceC3219d;
        this.f1107N = enumC0125a;
        this.f1105L = interfaceC0130f2;
        this.f1112S = interfaceC0130f != this.f1113a.m1321c().get(0);
        if (Thread.currentThread() != this.f1103J) {
            m1350M(g.DECODE_DATA);
            return;
        }
        AbstractC2084b.m8604a("DecodeJob.decodeFromRetrievedData");
        try {
            m1358p();
        } finally {
            AbstractC2084b.m8608e();
        }
    }

    @Override // p035E1.InterfaceC0285f.a
    /* JADX INFO: renamed from: d */
    public void mo1317d() {
        m1350M(g.SWITCH_TO_SOURCE_SERVICE);
    }

    @Override // p035E1.InterfaceC0285f.a
    /* JADX INFO: renamed from: h */
    public void mo1318h(InterfaceC0130f interfaceC0130f, Exception exc, InterfaceC3219d interfaceC3219d, EnumC0125a enumC0125a) {
        interfaceC3219d.mo931b();
        C0296q c0296q = new C0296q("Fetching data failed", exc);
        c0296q.m1451j(interfaceC0130f, enumC0125a, interfaceC3219d.mo930a());
        this.f1114b.add(c0296q);
        if (Thread.currentThread() != this.f1103J) {
            m1350M(g.SWITCH_TO_SOURCE_SERVICE);
        } else {
            m1352P();
        }
    }

    @Override // p190Z1.AbstractC2083a.f
    /* JADX INFO: renamed from: j */
    public AbstractC2085c mo1368j() {
        return this.f1115c;
    }

    /* JADX INFO: renamed from: k */
    public void m1369k() {
        this.f1111R = true;
        InterfaceC0285f interfaceC0285f = this.f1109P;
        if (interfaceC0285f != null) {
            interfaceC0285f.cancel();
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public int compareTo(RunnableC0287h runnableC0287h) {
        int iM1362w = m1362w() - runnableC0287h.m1362w();
        return iM1362w == 0 ? this.f1095B - runnableC0287h.f1095B : iM1362w;
    }

    @Override // java.lang.Runnable
    public void run() {
        AbstractC2084b.m8606c("DecodeJob#run(reason=%s, model=%s)", this.f1097D, this.f1100G);
        InterfaceC3219d interfaceC3219d = this.f1108O;
        try {
            try {
                if (this.f1111R) {
                    m1346C();
                    if (interfaceC3219d != null) {
                        interfaceC3219d.mo931b();
                    }
                    AbstractC2084b.m8608e();
                    return;
                }
                m1354U();
                if (interfaceC3219d != null) {
                    interfaceC3219d.mo931b();
                }
                AbstractC2084b.m8608e();
            } catch (Throwable th) {
                if (interfaceC3219d != null) {
                    interfaceC3219d.mo931b();
                }
                AbstractC2084b.m8608e();
                throw th;
            }
        } catch (C0281b e7) {
            throw e7;
        } catch (Throwable th2) {
            if (Log.isLoggable("DecodeJob", 3)) {
                Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.f1111R + ", stage: " + this.f1096C, th2);
            }
            if (this.f1096C != h.ENCODE) {
                this.f1114b.add(th2);
                m1346C();
            }
            if (!this.f1111R) {
                throw th2;
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: x */
    RunnableC0287h m1371x(C3204d c3204d, Object obj, C0293n c0293n, InterfaceC0130f interfaceC0130f, int i7, int i8, Class cls, Class cls2, EnumC3207g enumC3207g, AbstractC0289j abstractC0289j, Map map, boolean z7, boolean z8, boolean z9, C0132h c0132h, b bVar, int i9) {
        this.f1113a.m1340v(c3204d, obj, interfaceC0130f, i7, i8, abstractC0289j, cls, cls2, enumC3207g, c0132h, map, z7, z8, this.f1116d);
        this.f1120s = c3204d;
        this.f1121t = interfaceC0130f;
        this.f1122u = enumC3207g;
        this.f1123v = c0293n;
        this.f1124w = i7;
        this.f1125x = i8;
        this.f1126y = abstractC0289j;
        this.f1099F = z9;
        this.f1127z = c0132h;
        this.f1094A = bVar;
        this.f1095B = i9;
        this.f1097D = g.INITIALIZE;
        this.f1100G = obj;
        this.f1101H = c3204d.m17017g();
        this.f1102I = (Supplier) c0132h.m600c(f1093T);
        return this;
    }
}
