package p394y0;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import androidx.room.C2805c;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import kotlin.jvm.internal.AbstractC6119o;
import p026D0.C0172c;
import p026D0.InterfaceC0176g;
import p026D0.InterfaceC0177h;
import p026D0.InterfaceC0179j;
import p026D0.InterfaceC0180k;
import p034E0.C0277f;
import p152T5.AbstractC1610H;
import p152T5.AbstractC1617O;
import p152T5.AbstractC1638q;
import p238e6.InterfaceC5367l;
import p303n.C6425c;
import p402z0.AbstractC7558a;

/* JADX INFO: renamed from: y0.q */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7462q {

    /* JADX INFO: renamed from: o */
    public static final c f29919o = new c(null);

    /* JADX INFO: renamed from: a */
    protected volatile InterfaceC0176g f29920a;

    /* JADX INFO: renamed from: b */
    private Executor f29921b;

    /* JADX INFO: renamed from: c */
    private Executor f29922c;

    /* JADX INFO: renamed from: d */
    private InterfaceC0177h f29923d;

    /* JADX INFO: renamed from: f */
    private boolean f29925f;

    /* JADX INFO: renamed from: g */
    private boolean f29926g;

    /* JADX INFO: renamed from: h */
    protected List f29927h;

    /* JADX INFO: renamed from: k */
    private C7448c f29930k;

    /* JADX INFO: renamed from: m */
    private final Map f29932m;

    /* JADX INFO: renamed from: n */
    private final Map f29933n;

    /* JADX INFO: renamed from: e */
    private final C2805c f29924e = mo14532g();

    /* JADX INFO: renamed from: i */
    private Map f29928i = new LinkedHashMap();

    /* JADX INFO: renamed from: j */
    private final ReentrantReadWriteLock f29929j = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: l */
    private final ThreadLocal f29931l = new ThreadLocal();

    /* JADX INFO: renamed from: y0.q$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private final Context f29934a;

        /* JADX INFO: renamed from: b */
        private final Class f29935b;

        /* JADX INFO: renamed from: c */
        private final String f29936c;

        /* JADX INFO: renamed from: d */
        private final List f29937d;

        /* JADX INFO: renamed from: e */
        private final List f29938e;

        /* JADX INFO: renamed from: f */
        private List f29939f;

        /* JADX INFO: renamed from: g */
        private Executor f29940g;

        /* JADX INFO: renamed from: h */
        private Executor f29941h;

        /* JADX INFO: renamed from: i */
        private InterfaceC0177h.c f29942i;

        /* JADX INFO: renamed from: j */
        private boolean f29943j;

        /* JADX INFO: renamed from: k */
        private d f29944k;

        /* JADX INFO: renamed from: l */
        private Intent f29945l;

        /* JADX INFO: renamed from: m */
        private boolean f29946m;

        /* JADX INFO: renamed from: n */
        private boolean f29947n;

        /* JADX INFO: renamed from: o */
        private long f29948o;

        /* JADX INFO: renamed from: p */
        private TimeUnit f29949p;

        /* JADX INFO: renamed from: q */
        private final e f29950q;

        /* JADX INFO: renamed from: r */
        private Set f29951r;

        /* JADX INFO: renamed from: s */
        private Set f29952s;

        /* JADX INFO: renamed from: t */
        private String f29953t;

        /* JADX INFO: renamed from: u */
        private File f29954u;

        /* JADX INFO: renamed from: v */
        private Callable f29955v;

        public a(Context context, Class klass, String str) {
            AbstractC6118n.m27187e(context, "context");
            AbstractC6118n.m27187e(klass, "klass");
            this.f29934a = context;
            this.f29935b = klass;
            this.f29936c = str;
            this.f29937d = new ArrayList();
            this.f29938e = new ArrayList();
            this.f29939f = new ArrayList();
            this.f29944k = d.AUTOMATIC;
            this.f29946m = true;
            this.f29948o = -1L;
            this.f29950q = new e();
            this.f29951r = new LinkedHashSet();
        }

        /* JADX INFO: renamed from: a */
        public a m33043a(b callback) {
            AbstractC6118n.m27187e(callback, "callback");
            this.f29937d.add(callback);
            return this;
        }

        /* JADX INFO: renamed from: b */
        public a m33044b(AbstractC7558a... migrations) {
            AbstractC6118n.m27187e(migrations, "migrations");
            if (this.f29952s == null) {
                this.f29952s = new HashSet();
            }
            for (AbstractC7558a abstractC7558a : migrations) {
                Set set = this.f29952s;
                AbstractC6118n.m27184b(set);
                set.add(Integer.valueOf(abstractC7558a.f30213a));
                Set set2 = this.f29952s;
                AbstractC6118n.m27184b(set2);
                set2.add(Integer.valueOf(abstractC7558a.f30214b));
            }
            this.f29950q.m33057b((AbstractC7558a[]) Arrays.copyOf(migrations, migrations.length));
            return this;
        }

        /* JADX INFO: renamed from: c */
        public a m33045c() {
            this.f29943j = true;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public AbstractC7462q m33046d() {
            Executor executor = this.f29940g;
            if (executor == null && this.f29941h == null) {
                Executor executorM27633f = C6425c.m27633f();
                this.f29941h = executorM27633f;
                this.f29940g = executorM27633f;
            } else if (executor != null && this.f29941h == null) {
                this.f29941h = executor;
            } else if (executor == null) {
                this.f29940g = this.f29941h;
            }
            Set set = this.f29952s;
            if (set != null) {
                AbstractC6118n.m27184b(set);
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    int iIntValue = ((Number) it.next()).intValue();
                    if (this.f29951r.contains(Integer.valueOf(iIntValue))) {
                        throw new IllegalArgumentException(("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: " + iIntValue).toString());
                    }
                }
            }
            InterfaceC0177h.c c7467v = this.f29942i;
            if (c7467v == null) {
                c7467v = new C0277f();
            }
            if (c7467v != null) {
                if (this.f29948o > 0) {
                    if (this.f29936c == null) {
                        throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
                    }
                    long j7 = this.f29948o;
                    TimeUnit timeUnit = this.f29949p;
                    if (timeUnit == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    Executor executor2 = this.f29940g;
                    if (executor2 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    c7467v = new C7450e(c7467v, new C7448c(j7, timeUnit, executor2));
                }
                String str = this.f29953t;
                if (str != null || this.f29954u != null || this.f29955v != null) {
                    if (this.f29936c == null) {
                        throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.");
                    }
                    int i7 = str == null ? 0 : 1;
                    File file = this.f29954u;
                    int i8 = file == null ? 0 : 1;
                    Callable callable = this.f29955v;
                    if (i7 + i8 + (callable != null ? 1 : 0) != 1) {
                        throw new IllegalArgumentException("More than one of createFromAsset(), createFromInputStream(), and createFromFile() were called on this Builder, but the database can only be created using one of the three configurations.");
                    }
                    c7467v = new C7467v(str, file, callable, c7467v);
                }
            } else {
                c7467v = null;
            }
            InterfaceC0177h.c cVar = c7467v;
            if (cVar == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Context context = this.f29934a;
            String str2 = this.f29936c;
            e eVar = this.f29950q;
            List list = this.f29937d;
            boolean z7 = this.f29943j;
            d dVarM33054h = this.f29944k.m33054h(context);
            Executor executor3 = this.f29940g;
            if (executor3 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Executor executor4 = this.f29941h;
            if (executor4 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            C7451f c7451f = new C7451f(context, str2, cVar, eVar, list, z7, dVarM33054h, executor3, executor4, this.f29945l, this.f29946m, this.f29947n, this.f29951r, this.f29953t, this.f29954u, this.f29955v, null, this.f29938e, this.f29939f);
            AbstractC7462q abstractC7462q = (AbstractC7462q) C7461p.m33019b(this.f29935b, "_Impl");
            abstractC7462q.m33037r(c7451f);
            return abstractC7462q;
        }

        /* JADX INFO: renamed from: e */
        public a m33047e() {
            this.f29946m = false;
            this.f29947n = true;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public a m33048f(InterfaceC0177h.c cVar) {
            this.f29942i = cVar;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public a m33049g(Executor executor) {
            AbstractC6118n.m27187e(executor, "executor");
            this.f29940g = executor;
            return this;
        }
    }

    /* JADX INFO: renamed from: y0.q$b */
    public static abstract class b {
        /* JADX INFO: renamed from: a */
        public void m33050a(InterfaceC0176g db) {
            AbstractC6118n.m27187e(db, "db");
        }

        /* JADX INFO: renamed from: b */
        public void m33051b(InterfaceC0176g db) {
            AbstractC6118n.m27187e(db, "db");
        }

        /* JADX INFO: renamed from: c */
        public void mo14520c(InterfaceC0176g db) {
            AbstractC6118n.m27187e(db, "db");
        }
    }

    /* JADX INFO: renamed from: y0.q$c */
    public static final class c {
        public /* synthetic */ c(AbstractC6112h abstractC6112h) {
            this();
        }

        private c() {
        }
    }

    /* JADX INFO: renamed from: y0.q$d */
    public enum d {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        /* JADX INFO: renamed from: d */
        private final boolean m33053d(ActivityManager activityManager) {
            return C0172c.m873b(activityManager);
        }

        /* JADX INFO: renamed from: h */
        public final d m33054h(Context context) {
            AbstractC6118n.m27187e(context, "context");
            if (this != AUTOMATIC) {
                return this;
            }
            Object systemService = context.getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            return (activityManager == null || m33053d(activityManager)) ? TRUNCATE : WRITE_AHEAD_LOGGING;
        }
    }

    /* JADX INFO: renamed from: y0.q$e */
    public static class e {

        /* JADX INFO: renamed from: a */
        private final Map f29960a = new LinkedHashMap();

        /* JADX INFO: renamed from: a */
        private final void m33055a(AbstractC7558a abstractC7558a) {
            int i7 = abstractC7558a.f30213a;
            int i8 = abstractC7558a.f30214b;
            Map map = this.f29960a;
            Integer numValueOf = Integer.valueOf(i7);
            Object treeMap = map.get(numValueOf);
            if (treeMap == null) {
                treeMap = new TreeMap();
                map.put(numValueOf, treeMap);
            }
            TreeMap treeMap2 = (TreeMap) treeMap;
            if (treeMap2.containsKey(Integer.valueOf(i8))) {
                Log.w("ROOM", "Overriding migration " + treeMap2.get(Integer.valueOf(i8)) + " with " + abstractC7558a);
            }
            treeMap2.put(Integer.valueOf(i8), abstractC7558a);
        }

        /* JADX INFO: renamed from: e */
        private final List m33056e(List list, boolean z7, int i7, int i8) {
            boolean z8;
            do {
                if (z7) {
                    if (i7 >= i8) {
                        return list;
                    }
                } else if (i7 <= i8) {
                    return list;
                }
                TreeMap treeMap = (TreeMap) this.f29960a.get(Integer.valueOf(i7));
                if (treeMap != null) {
                    Iterator it = (z7 ? treeMap.descendingKeySet() : treeMap.keySet()).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z8 = false;
                            break;
                        }
                        Integer targetVersion = (Integer) it.next();
                        if (!z7) {
                            AbstractC6118n.m27186d(targetVersion, "targetVersion");
                            int iIntValue = targetVersion.intValue();
                            if (i8 <= iIntValue && iIntValue < i7) {
                                Object obj = treeMap.get(targetVersion);
                                AbstractC6118n.m27184b(obj);
                                list.add(obj);
                                i7 = targetVersion.intValue();
                                z8 = true;
                                break;
                                break;
                            }
                        } else {
                            int i9 = i7 + 1;
                            AbstractC6118n.m27186d(targetVersion, "targetVersion");
                            int iIntValue2 = targetVersion.intValue();
                            if (i9 <= iIntValue2 && iIntValue2 <= i8) {
                                Object obj2 = treeMap.get(targetVersion);
                                AbstractC6118n.m27184b(obj2);
                                list.add(obj2);
                                i7 = targetVersion.intValue();
                                z8 = true;
                                break;
                            }
                        }
                    }
                } else {
                    return null;
                }
            } while (z8);
            return null;
        }

        /* JADX INFO: renamed from: b */
        public void m33057b(AbstractC7558a... migrations) {
            AbstractC6118n.m27187e(migrations, "migrations");
            for (AbstractC7558a abstractC7558a : migrations) {
                m33055a(abstractC7558a);
            }
        }

        /* JADX INFO: renamed from: c */
        public final boolean m33058c(int i7, int i8) {
            Map mapM33060f = m33060f();
            if (!mapM33060f.containsKey(Integer.valueOf(i7))) {
                return false;
            }
            Map mapH = (Map) mapM33060f.get(Integer.valueOf(i7));
            if (mapH == null) {
                mapH = AbstractC1610H.m6626h();
            }
            return mapH.containsKey(Integer.valueOf(i8));
        }

        /* JADX INFO: renamed from: d */
        public List m33059d(int i7, int i8) {
            if (i7 == i8) {
                return AbstractC1638q.m6765j();
            }
            return m33056e(new ArrayList(), i8 > i7, i7, i8);
        }

        /* JADX INFO: renamed from: f */
        public Map m33060f() {
            return this.f29960a;
        }
    }

    /* JADX INFO: renamed from: y0.q$f */
    public static abstract class f {
    }

    /* JADX INFO: renamed from: y0.q$g */
    static final class g extends AbstractC6119o implements InterfaceC5367l {
        g() {
            super(1);
        }

        @Override // p238e6.InterfaceC5367l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC0176g it) {
            AbstractC6118n.m27187e(it, "it");
            AbstractC7462q.this.m33024s();
            return null;
        }
    }

    /* JADX INFO: renamed from: y0.q$h */
    static final class h extends AbstractC6119o implements InterfaceC5367l {
        h() {
            super(1);
        }

        @Override // p238e6.InterfaceC5367l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC0176g it) {
            AbstractC6118n.m27187e(it, "it");
            AbstractC7462q.this.m33025t();
            return null;
        }
    }

    public AbstractC7462q() {
        Map mapSynchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        AbstractC6118n.m27186d(mapSynchronizedMap, "synchronizedMap(mutableMapOf())");
        this.f29932m = mapSynchronizedMap;
        this.f29933n = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: A */
    private final Object m33021A(Class cls, InterfaceC0177h interfaceC0177h) {
        if (cls.isInstance(interfaceC0177h)) {
            return interfaceC0177h;
        }
        if (interfaceC0177h instanceof InterfaceC7452g) {
            return m33021A(cls, ((InterfaceC7452g) interfaceC0177h).mo32994d());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public final void m33024s() {
        m33027c();
        InterfaceC0176g interfaceC0176gMo892Y = m33034m().mo892Y();
        m33033l().m13957u(interfaceC0176gMo892Y);
        if (interfaceC0176gMo892Y.mo890y0()) {
            interfaceC0176gMo892Y.mo880T();
        } else {
            interfaceC0176gMo892Y.mo882c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public final void m33025t() {
        m33034m().mo892Y().mo885j();
        if (m33036q()) {
            return;
        }
        m33033l().m13952m();
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ Cursor m33026y(AbstractC7462q abstractC7462q, InterfaceC0179j interfaceC0179j, CancellationSignal cancellationSignal, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
        }
        if ((i7 & 2) != 0) {
            cancellationSignal = null;
        }
        return abstractC7462q.m33041x(interfaceC0179j, cancellationSignal);
    }

    /* JADX INFO: renamed from: c */
    public void m33027c() {
        if (!this.f29925f && m33039v()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    /* JADX INFO: renamed from: d */
    public void m33028d() {
        if (!m33036q() && this.f29931l.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    /* JADX INFO: renamed from: e */
    public void m33029e() {
        m33027c();
        C7448c c7448c = this.f29930k;
        if (c7448c == null) {
            m33024s();
        } else {
            c7448c.m32987g(new g());
        }
    }

    /* JADX INFO: renamed from: f */
    public InterfaceC0180k m33030f(String sql) {
        AbstractC6118n.m27187e(sql, "sql");
        m33027c();
        m33028d();
        return m33034m().mo892Y().mo891z(sql);
    }

    /* JADX INFO: renamed from: g */
    protected abstract C2805c mo14532g();

    /* JADX INFO: renamed from: h */
    protected abstract InterfaceC0177h mo14533h(C7451f c7451f);

    /* JADX INFO: renamed from: i */
    public void m33031i() {
        C7448c c7448c = this.f29930k;
        if (c7448c == null) {
            m33025t();
        } else {
            c7448c.m32987g(new h());
        }
    }

    /* JADX INFO: renamed from: j */
    public List mo15154j(Map autoMigrationSpecs) {
        AbstractC6118n.m27187e(autoMigrationSpecs, "autoMigrationSpecs");
        return AbstractC1638q.m6765j();
    }

    /* JADX INFO: renamed from: k */
    public final Lock m33032k() {
        ReentrantReadWriteLock.ReadLock lock = this.f29929j.readLock();
        AbstractC6118n.m27186d(lock, "readWriteLock.readLock()");
        return lock;
    }

    /* JADX INFO: renamed from: l */
    public C2805c m33033l() {
        return this.f29924e;
    }

    /* JADX INFO: renamed from: m */
    public InterfaceC0177h m33034m() {
        InterfaceC0177h interfaceC0177h = this.f29923d;
        if (interfaceC0177h != null) {
            return interfaceC0177h;
        }
        AbstractC6118n.m27197o("internalOpenHelper");
        return null;
    }

    /* JADX INFO: renamed from: n */
    public Executor m33035n() {
        Executor executor = this.f29921b;
        if (executor != null) {
            return executor;
        }
        AbstractC6118n.m27197o("internalQueryExecutor");
        return null;
    }

    /* JADX INFO: renamed from: o */
    public Set mo15155o() {
        return AbstractC1617O.m6650d();
    }

    /* JADX INFO: renamed from: p */
    protected Map mo15156p() {
        return AbstractC1610H.m6626h();
    }

    /* JADX INFO: renamed from: q */
    public boolean m33036q() {
        return m33034m().mo892Y().mo889t0();
    }

    /* JADX INFO: renamed from: r */
    public void m33037r(C7451f configuration) {
        AbstractC6118n.m27187e(configuration, "configuration");
        this.f29923d = mo14533h(configuration);
        Set setMo15155o = mo15155o();
        BitSet bitSet = new BitSet();
        Iterator it = setMo15155o.iterator();
        while (true) {
            int i7 = -1;
            if (it.hasNext()) {
                Class cls = (Class) it.next();
                int size = configuration.f29906r.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i8 = size - 1;
                        if (cls.isAssignableFrom(configuration.f29906r.get(size).getClass())) {
                            bitSet.set(size);
                            i7 = size;
                            break;
                        } else if (i8 < 0) {
                            break;
                        } else {
                            size = i8;
                        }
                    }
                }
                if (i7 < 0) {
                    throw new IllegalArgumentException(("A required auto migration spec (" + cls.getCanonicalName() + ") is missing in the database configuration.").toString());
                }
                this.f29928i.put(cls, configuration.f29906r.get(i7));
            } else {
                int size2 = configuration.f29906r.size() - 1;
                if (size2 >= 0) {
                    while (true) {
                        int i9 = size2 - 1;
                        if (!bitSet.get(size2)) {
                            throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                        }
                        if (i9 < 0) {
                            break;
                        } else {
                            size2 = i9;
                        }
                    }
                }
                for (AbstractC7558a abstractC7558a : mo15154j(this.f29928i)) {
                    if (!configuration.f29892d.m33058c(abstractC7558a.f30213a, abstractC7558a.f30214b)) {
                        configuration.f29892d.m33057b(abstractC7558a);
                    }
                }
                C7466u c7466u = (C7466u) m33021A(C7466u.class, m33034m());
                if (c7466u != null) {
                    c7466u.m33078x(configuration);
                }
                C7449d c7449d = (C7449d) m33021A(C7449d.class, m33034m());
                if (c7449d != null) {
                    this.f29930k = c7449d.f29867b;
                    m33033l().m13954p(c7449d.f29867b);
                }
                boolean z7 = configuration.f29895g == d.WRITE_AHEAD_LOGGING;
                m33034m().setWriteAheadLoggingEnabled(z7);
                this.f29927h = configuration.f29893e;
                this.f29921b = configuration.f29896h;
                this.f29922c = new ExecutorC7470y(configuration.f29897i);
                this.f29925f = configuration.f29894f;
                this.f29926g = z7;
                if (configuration.f29898j != null) {
                    if (configuration.f29890b == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    m33033l().m13955q(configuration.f29889a, configuration.f29890b, configuration.f29898j);
                }
                Map mapMo15156p = mo15156p();
                BitSet bitSet2 = new BitSet();
                for (Map.Entry entry : mapMo15156p.entrySet()) {
                    Class cls2 = (Class) entry.getKey();
                    for (Class cls3 : (List) entry.getValue()) {
                        int size3 = configuration.f29905q.size() - 1;
                        if (size3 < 0) {
                            size3 = -1;
                            break;
                        }
                        while (true) {
                            int i10 = size3 - 1;
                            if (cls3.isAssignableFrom(configuration.f29905q.get(size3).getClass())) {
                                bitSet2.set(size3);
                                break;
                            } else {
                                if (i10 < 0) {
                                    size3 = -1;
                                    break;
                                }
                                size3 = i10;
                            }
                        }
                        if (size3 < 0) {
                            throw new IllegalArgumentException(("A required type converter (" + cls3 + ") for " + cls2.getCanonicalName() + " is missing in the database configuration.").toString());
                        }
                        this.f29933n.put(cls3, configuration.f29905q.get(size3));
                    }
                }
                int size4 = configuration.f29905q.size() - 1;
                if (size4 < 0) {
                    return;
                }
                while (true) {
                    int i11 = size4 - 1;
                    if (!bitSet2.get(size4)) {
                        throw new IllegalArgumentException("Unexpected type converter " + configuration.f29905q.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                    }
                    if (i11 < 0) {
                        return;
                    } else {
                        size4 = i11;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: u */
    protected void m33038u(InterfaceC0176g db) {
        AbstractC6118n.m27187e(db, "db");
        m33033l().m13950j(db);
    }

    /* JADX INFO: renamed from: v */
    public final boolean m33039v() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* JADX INFO: renamed from: w */
    public final boolean m33040w() {
        InterfaceC0176g interfaceC0176g = this.f29920a;
        return interfaceC0176g != null && interfaceC0176g.isOpen();
    }

    /* JADX INFO: renamed from: x */
    public Cursor m33041x(InterfaceC0179j query, CancellationSignal cancellationSignal) {
        AbstractC6118n.m27187e(query, "query");
        m33027c();
        m33028d();
        return cancellationSignal != null ? m33034m().mo892Y().mo878A0(query, cancellationSignal) : m33034m().mo892Y().mo884i0(query);
    }

    /* JADX INFO: renamed from: z */
    public void m33042z() {
        m33034m().mo892Y().mo883h();
    }
}
