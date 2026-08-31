package p358t4;

import androidx.appcompat.app.AbstractC2263x;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p022C4.C0144c;
import p046F4.C0431a;
import p366u4.C7160a;

/* JADX INFO: renamed from: t4.n */
/* JADX INFO: loaded from: classes.dex */
public class C7092n implements C7080b.a, InterfaceC7086h {

    /* JADX INFO: renamed from: H */
    private static long f28294H;

    /* JADX INFO: renamed from: A */
    private String f28295A;

    /* JADX INFO: renamed from: F */
    private long f28300F;

    /* JADX INFO: renamed from: G */
    private boolean f28301G;

    /* JADX INFO: renamed from: a */
    private final InterfaceC7086h.a f28302a;

    /* JADX INFO: renamed from: b */
    private final C7084f f28303b;

    /* JADX INFO: renamed from: c */
    private String f28304c;

    /* JADX INFO: renamed from: f */
    private long f28307f;

    /* JADX INFO: renamed from: g */
    private C7080b f28308g;

    /* JADX INFO: renamed from: l */
    private Map f28313l;

    /* JADX INFO: renamed from: m */
    private List f28314m;

    /* JADX INFO: renamed from: n */
    private Map f28315n;

    /* JADX INFO: renamed from: o */
    private Map f28316o;

    /* JADX INFO: renamed from: p */
    private Map f28317p;

    /* JADX INFO: renamed from: q */
    private String f28318q;

    /* JADX INFO: renamed from: r */
    private boolean f28319r;

    /* JADX INFO: renamed from: s */
    private String f28320s;

    /* JADX INFO: renamed from: t */
    private boolean f28321t;

    /* JADX INFO: renamed from: u */
    private final C7081c f28322u;

    /* JADX INFO: renamed from: v */
    private final InterfaceC7082d f28323v;

    /* JADX INFO: renamed from: w */
    private final InterfaceC7082d f28324w;

    /* JADX INFO: renamed from: x */
    private final ScheduledExecutorService f28325x;

    /* JADX INFO: renamed from: y */
    private final C0144c f28326y;

    /* JADX INFO: renamed from: z */
    private final C7160a f28327z;

    /* JADX INFO: renamed from: d */
    private HashSet f28305d = new HashSet();

    /* JADX INFO: renamed from: e */
    private boolean f28306e = true;

    /* JADX INFO: renamed from: h */
    private j f28309h = j.Disconnected;

    /* JADX INFO: renamed from: i */
    private long f28310i = 0;

    /* JADX INFO: renamed from: j */
    private long f28311j = 0;

    /* JADX INFO: renamed from: k */
    private long f28312k = 0;

    /* JADX INFO: renamed from: B */
    private long f28296B = 0;

    /* JADX INFO: renamed from: C */
    private int f28297C = 0;

    /* JADX INFO: renamed from: D */
    private int f28298D = 0;

    /* JADX INFO: renamed from: E */
    private ScheduledFuture f28299E = null;

    /* JADX INFO: renamed from: t4.n$a */
    class a implements InterfaceC7082d.a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ TaskCompletionSource f28328a;

        a(TaskCompletionSource taskCompletionSource) {
            this.f28328a = taskCompletionSource;
        }

        @Override // p358t4.InterfaceC7082d.a
        /* JADX INFO: renamed from: a */
        public void mo31228a(String str) {
            this.f28328a.setException(new Exception(str));
        }

        @Override // p358t4.InterfaceC7082d.a
        /* JADX INFO: renamed from: b */
        public void mo31229b(String str) {
            this.f28328a.setResult(str);
        }
    }

    /* JADX INFO: renamed from: t4.n$b */
    class b implements InterfaceC7082d.a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ TaskCompletionSource f28330a;

        b(TaskCompletionSource taskCompletionSource) {
            this.f28330a = taskCompletionSource;
        }

        @Override // p358t4.InterfaceC7082d.a
        /* JADX INFO: renamed from: a */
        public void mo31228a(String str) {
            this.f28330a.setException(new Exception(str));
        }

        @Override // p358t4.InterfaceC7082d.a
        /* JADX INFO: renamed from: b */
        public void mo31229b(String str) {
            this.f28330a.setResult(str);
        }
    }

    /* JADX INFO: renamed from: t4.n$c */
    class c implements i {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ boolean f28332a;

        c(boolean z7) {
            this.f28332a = z7;
        }

        @Override // p358t4.C7092n.i
        /* JADX INFO: renamed from: a */
        public void mo31259a(Map map) {
            String str = (String) map.get("s");
            if (str.equals("ok")) {
                C7092n.this.f28309h = j.Connected;
                C7092n.this.f28297C = 0;
                C7092n.this.m31301n0(this.f28332a);
                return;
            }
            C7092n.this.f28318q = null;
            C7092n.this.f28319r = true;
            C7092n.this.f28302a.mo31254b(false);
            String str2 = (String) map.get("d");
            C7092n.this.f28326y.m624b("Authentication failed: " + str + " (" + str2 + ")", new Object[0]);
            C7092n.this.f28308g.m31207c();
            if (str.equals("invalid_token")) {
                C7092n.m31318x(C7092n.this);
                if (C7092n.this.f28297C >= 3) {
                    C7092n.this.f28327z.m31650d();
                    C7092n.this.f28326y.m628i("Provided authentication credentials are invalid. This usually indicates your FirebaseApp instance was not initialized correctly. Make sure your google-services.json file has the correct firebase_url and api_key. You can re-download google-services.json from https://console.firebase.google.com/.");
                }
            }
        }
    }

    /* JADX INFO: renamed from: t4.n$d */
    class d implements i {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f28334a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ long f28335b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ m f28336c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ InterfaceC7094p f28337d;

        d(String str, long j7, m mVar, InterfaceC7094p interfaceC7094p) {
            this.f28334a = str;
            this.f28335b = j7;
            this.f28336c = mVar;
            this.f28337d = interfaceC7094p;
        }

        @Override // p358t4.C7092n.i
        /* JADX INFO: renamed from: a */
        public void mo31259a(Map map) {
            if (C7092n.this.f28326y.m627f()) {
                C7092n.this.f28326y.m624b(this.f28334a + " response: " + map, new Object[0]);
            }
            if (((m) C7092n.this.f28315n.get(Long.valueOf(this.f28335b))) == this.f28336c) {
                C7092n.this.f28315n.remove(Long.valueOf(this.f28335b));
                if (this.f28337d != null) {
                    String str = (String) map.get("s");
                    if (str.equals("ok")) {
                        this.f28337d.mo31348a(null, null);
                    } else {
                        this.f28337d.mo31348a(str, (String) map.get("d"));
                    }
                }
            } else if (C7092n.this.f28326y.m627f()) {
                C7092n.this.f28326y.m624b("Ignoring on complete for put " + this.f28335b + " because it was removed already.", new Object[0]);
            }
            C7092n.this.m31282S();
        }
    }

    /* JADX INFO: renamed from: t4.n$e */
    class e implements i {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Long f28339a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ k f28340b;

        e(Long l7, k kVar) {
            this.f28339a = l7;
            this.f28340b = kVar;
        }

        @Override // p358t4.C7092n.i
        /* JADX INFO: renamed from: a */
        public void mo31259a(Map map) {
            if (((k) C7092n.this.f28316o.get(this.f28339a)) == this.f28340b) {
                C7092n.this.f28316o.remove(this.f28339a);
                this.f28340b.m31330d().mo31259a(map);
            } else if (C7092n.this.f28326y.m627f()) {
                C7092n.this.f28326y.m624b("Ignoring on complete for get " + this.f28339a + " because it was removed already.", new Object[0]);
            }
        }
    }

    /* JADX INFO: renamed from: t4.n$f */
    class f implements i {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ l f28342a;

        f(l lVar) {
            this.f28342a = lVar;
        }

        @Override // p358t4.C7092n.i
        /* JADX INFO: renamed from: a */
        public void mo31259a(Map map) {
            String str = (String) map.get("s");
            if (str.equals("ok")) {
                Map map2 = (Map) map.get("d");
                if (map2.containsKey("w")) {
                    C7092n.this.m31267D0((List) map2.get("w"), this.f28342a.f28356b);
                }
            }
            if (((l) C7092n.this.f28317p.get(this.f28342a.m31336d())) == this.f28342a) {
                if (str.equals("ok")) {
                    this.f28342a.f28355a.mo31348a(null, null);
                    return;
                }
                C7092n.this.m31296i0(this.f28342a.m31336d());
                this.f28342a.f28355a.mo31348a(str, (String) map.get("d"));
            }
        }
    }

    /* JADX INFO: renamed from: t4.n$g */
    class g implements i {
        g() {
        }

        @Override // p358t4.C7092n.i
        /* JADX INFO: renamed from: a */
        public void mo31259a(Map map) {
            String str = (String) map.get("s");
            if (str.equals("ok")) {
                return;
            }
            String str2 = (String) map.get("d");
            if (C7092n.this.f28326y.m627f()) {
                C7092n.this.f28326y.m624b("Failed to send stats: " + str + " (message: " + str2 + ")", new Object[0]);
            }
        }
    }

    /* JADX INFO: renamed from: t4.n$h */
    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C7092n.this.f28299E = null;
            if (C7092n.this.m31287X()) {
                C7092n.this.mo31245d("connection_idle");
            } else {
                C7092n.this.m31282S();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t4.n$i */
    interface i {
        /* JADX INFO: renamed from: a */
        void mo31259a(Map map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t4.n$j */
    enum j {
        Disconnected,
        GettingToken,
        Connecting,
        Authenticating,
        Connected
    }

    /* JADX INFO: renamed from: t4.n$k */
    private static class k {

        /* JADX INFO: renamed from: a */
        private final Map f28352a;

        /* JADX INFO: renamed from: b */
        private final i f28353b;

        /* JADX INFO: renamed from: c */
        private boolean f28354c;

        /* synthetic */ k(String str, Map map, i iVar, a aVar) {
            this(str, map, iVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: d */
        public i m31330d() {
            return this.f28353b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: e */
        public Map m31331e() {
            return this.f28352a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: f */
        public boolean m31332f() {
            if (this.f28354c) {
                return false;
            }
            this.f28354c = true;
            return true;
        }

        private k(String str, Map map, i iVar) {
            this.f28352a = map;
            this.f28353b = iVar;
            this.f28354c = false;
        }
    }

    /* JADX INFO: renamed from: t4.n$l */
    private static class l {

        /* JADX INFO: renamed from: a */
        private final InterfaceC7094p f28355a;

        /* JADX INFO: renamed from: b */
        private final n f28356b;

        /* JADX INFO: renamed from: c */
        private final InterfaceC7085g f28357c;

        /* JADX INFO: renamed from: d */
        private final Long f28358d;

        /* synthetic */ l(InterfaceC7094p interfaceC7094p, n nVar, Long l7, InterfaceC7085g interfaceC7085g, a aVar) {
            this(interfaceC7094p, nVar, l7, interfaceC7085g);
        }

        /* JADX INFO: renamed from: c */
        public InterfaceC7085g m31335c() {
            return this.f28357c;
        }

        /* JADX INFO: renamed from: d */
        public n m31336d() {
            return this.f28356b;
        }

        /* JADX INFO: renamed from: e */
        public Long m31337e() {
            return this.f28358d;
        }

        public String toString() {
            return this.f28356b.toString() + " (Tag: " + this.f28358d + ")";
        }

        private l(InterfaceC7094p interfaceC7094p, n nVar, Long l7, InterfaceC7085g interfaceC7085g) {
            this.f28355a = interfaceC7094p;
            this.f28356b = nVar;
            this.f28357c = interfaceC7085g;
            this.f28358d = l7;
        }
    }

    /* JADX INFO: renamed from: t4.n$m */
    private static class m {

        /* JADX INFO: renamed from: a */
        private String f28359a;

        /* JADX INFO: renamed from: b */
        private Map f28360b;

        /* JADX INFO: renamed from: c */
        private InterfaceC7094p f28361c;

        /* JADX INFO: renamed from: d */
        private boolean f28362d;

        /* synthetic */ m(String str, Map map, InterfaceC7094p interfaceC7094p, a aVar) {
            this(str, map, interfaceC7094p);
        }

        /* JADX INFO: renamed from: a */
        public String m31338a() {
            return this.f28359a;
        }

        /* JADX INFO: renamed from: b */
        public InterfaceC7094p m31339b() {
            return this.f28361c;
        }

        /* JADX INFO: renamed from: c */
        public Map m31340c() {
            return this.f28360b;
        }

        /* JADX INFO: renamed from: d */
        public void m31341d() {
            this.f28362d = true;
        }

        /* JADX INFO: renamed from: e */
        public boolean m31342e() {
            return this.f28362d;
        }

        private m(String str, Map map, InterfaceC7094p interfaceC7094p) {
            this.f28359a = str;
            this.f28360b = map;
            this.f28361c = interfaceC7094p;
        }
    }

    /* JADX INFO: renamed from: t4.n$n */
    private static class n {

        /* JADX INFO: renamed from: a */
        private final List f28363a;

        /* JADX INFO: renamed from: b */
        private final Map f28364b;

        public n(List list, Map map) {
            this.f28363a = list;
            this.f28364b = map;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            if (this.f28363a.equals(nVar.f28363a)) {
                return this.f28364b.equals(nVar.f28364b);
            }
            return false;
        }

        public int hashCode() {
            return (this.f28363a.hashCode() * 31) + this.f28364b.hashCode();
        }

        public String toString() {
            return AbstractC7083e.m31233d(this.f28363a) + " (params: " + this.f28364b + ")";
        }
    }

    public C7092n(C7081c c7081c, C7084f c7084f, InterfaceC7086h.a aVar) {
        this.f28302a = aVar;
        this.f28322u = c7081c;
        ScheduledExecutorService scheduledExecutorServiceM31222e = c7081c.m31222e();
        this.f28325x = scheduledExecutorServiceM31222e;
        this.f28323v = c7081c.m31220c();
        this.f28324w = c7081c.m31218a();
        this.f28303b = c7084f;
        this.f28317p = new HashMap();
        this.f28313l = new HashMap();
        this.f28315n = new HashMap();
        this.f28316o = new ConcurrentHashMap();
        this.f28314m = new ArrayList();
        this.f28327z = new C7160a.b(scheduledExecutorServiceM31222e, c7081c.m31223f(), "ConnectionRetryHelper").m31655d(1000L).m31656e(1.3d).m31654c(30000L).m31653b(0.7d).m31652a();
        long j7 = f28294H;
        f28294H = 1 + j7;
        this.f28326y = new C0144c(c7081c.m31223f(), "PersistentConnection", "pc_" + j7);
        this.f28295A = null;
        m31282S();
    }

    /* JADX INFO: renamed from: A0 */
    private void m31261A0() {
        if (m31325z0()) {
            j jVar = this.f28309h;
            AbstractC7083e.m31231b(jVar == j.Disconnected, "Not in disconnected state: %s", jVar);
            final boolean z7 = this.f28319r;
            final boolean z8 = this.f28321t;
            this.f28326y.m624b("Scheduling connection attempt", new Object[0]);
            this.f28319r = false;
            this.f28321t = false;
            this.f28327z.m31649c(new Runnable() { // from class: t4.i
                @Override // java.lang.Runnable
                public final void run() {
                    C7092n.m31310t(this.f28282a, z7, z8);
                }
            });
        }
    }

    /* JADX INFO: renamed from: B0 */
    private void m31263B0() {
        m31301n0(false);
    }

    /* JADX INFO: renamed from: C0 */
    private void m31265C0() {
        m31303p0(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public void m31267D0(List list, n nVar) {
        if (list.contains("no_index")) {
            String str = "\".indexOn\": \"" + nVar.f28364b.get("i") + '\"';
            this.f28326y.m628i("Using an unspecified index. Your data will be downloaded and filtered on the client. Consider adding '" + str + "' at " + AbstractC7083e.m31233d(nVar.f28363a) + " to your security and Firebase Database rules for better performance");
        }
    }

    /* JADX INFO: renamed from: O */
    private boolean m31278O() {
        return this.f28309h == j.Connected;
    }

    /* JADX INFO: renamed from: P */
    private boolean m31279P() {
        return this.f28309h == j.Connected;
    }

    /* JADX INFO: renamed from: Q */
    private void m31280Q() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f28315n.entrySet().iterator();
        while (it.hasNext()) {
            m mVar = (m) ((Map.Entry) it.next()).getValue();
            if (mVar.m31340c().containsKey("h") && mVar.m31342e()) {
                arrayList.add(mVar);
                it.remove();
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((m) it2.next()).m31339b().mo31348a("disconnected", null);
        }
    }

    /* JADX INFO: renamed from: R */
    private boolean m31281R() {
        j jVar = this.f28309h;
        return jVar == j.Authenticating || jVar == j.Connected;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public void m31282S() {
        if (m31288Y()) {
            ScheduledFuture scheduledFuture = this.f28299E;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.f28299E = this.f28325x.schedule(new h(), 60000L, TimeUnit.MILLISECONDS);
            return;
        }
        if (m31323Z("connection_idle")) {
            AbstractC7083e.m31230a(!m31288Y());
            mo31247g("connection_idle");
        }
    }

    /* JADX INFO: renamed from: T */
    private Task m31283T(boolean z7) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f28326y.m624b("Trying to fetch app check token", new Object[0]);
        this.f28324w.mo31227a(z7, new b(taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: renamed from: U */
    private Task m31284U(boolean z7) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f28326y.m624b("Trying to fetch auth token", new Object[0]);
        this.f28323v.mo31227a(z7, new a(taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: renamed from: V */
    private Map m31285V(List list, Object obj, String str) {
        HashMap map = new HashMap();
        map.put("p", AbstractC7083e.m31233d(list));
        map.put("d", obj);
        if (str != null) {
            map.put("h", str);
        }
        return map;
    }

    /* JADX INFO: renamed from: W */
    private void m31286W(long j7) {
        if (this.f28326y.m627f()) {
            this.f28326y.m624b("handling timestamp", new Object[0]);
        }
        long jCurrentTimeMillis = j7 - System.currentTimeMillis();
        HashMap map = new HashMap();
        map.put("serverTimeOffset", Long.valueOf(jCurrentTimeMillis));
        this.f28302a.mo31256d(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public boolean m31287X() {
        return m31288Y() && System.currentTimeMillis() > this.f28300F + 60000;
    }

    /* JADX INFO: renamed from: Y */
    private boolean m31288Y() {
        return this.f28317p.isEmpty() && this.f28316o.isEmpty() && this.f28313l.isEmpty() && !this.f28301G && this.f28315n.isEmpty();
    }

    /* JADX INFO: renamed from: a0 */
    private long m31289a0() {
        long j7 = this.f28312k;
        this.f28312k = 1 + j7;
        return j7;
    }

    /* JADX INFO: renamed from: b0 */
    private void m31290b0(String str, String str2) {
        this.f28326y.m624b("App check token revoked: " + str + " (" + str2 + ")", new Object[0]);
        this.f28320s = null;
        this.f28321t = true;
    }

    /* JADX INFO: renamed from: c0 */
    private void m31291c0(String str, String str2) {
        this.f28326y.m624b("Auth token revoked: " + str + " (" + str2 + ")", new Object[0]);
        this.f28318q = null;
        this.f28319r = true;
        this.f28302a.mo31254b(false);
        this.f28308g.m31207c();
    }

    /* JADX INFO: renamed from: d0 */
    private void m31292d0(String str, Map map) {
        if (this.f28326y.m627f()) {
            this.f28326y.m624b("handleServerMessage: " + str + " " + map, new Object[0]);
        }
        if (str.equals("d") || str.equals("m")) {
            boolean zEquals = str.equals("m");
            String str2 = (String) map.get("p");
            Object obj = map.get("d");
            Long lM31232c = AbstractC7083e.m31232c(map.get("t"));
            if (!zEquals || !(obj instanceof Map) || ((Map) obj).size() != 0) {
                this.f28302a.mo31253a(AbstractC7083e.m31234e(str2), obj, zEquals, lM31232c);
                return;
            }
            if (this.f28326y.m627f()) {
                this.f28326y.m624b("ignoring empty merge for path " + str2, new Object[0]);
                return;
            }
            return;
        }
        if (!str.equals("rm")) {
            if (str.equals("c")) {
                m31293e0(AbstractC7083e.m31234e((String) map.get("p")));
                return;
            }
            if (str.equals("ac")) {
                m31291c0((String) map.get("s"), (String) map.get("d"));
                return;
            }
            if (str.equals("apc")) {
                m31290b0((String) map.get("s"), (String) map.get("d"));
                return;
            }
            if (str.equals("sd")) {
                m31294f0(map);
                return;
            }
            if (this.f28326y.m627f()) {
                this.f28326y.m624b("Unrecognized action from server: " + str, new Object[0]);
                return;
            }
            return;
        }
        String str3 = (String) map.get("p");
        List listM31234e = AbstractC7083e.m31234e(str3);
        Object obj2 = map.get("d");
        Long lM31232c2 = AbstractC7083e.m31232c(map.get("t"));
        ArrayList arrayList = new ArrayList();
        for (Map map2 : (List) obj2) {
            String str4 = (String) map2.get("s");
            String str5 = (String) map2.get("e");
            List listM31234e2 = null;
            List listM31234e3 = str4 != null ? AbstractC7083e.m31234e(str4) : null;
            if (str5 != null) {
                listM31234e2 = AbstractC7083e.m31234e(str5);
            }
            arrayList.add(new C7093o(listM31234e3, listM31234e2, map2.get("m")));
        }
        if (!arrayList.isEmpty()) {
            this.f28302a.mo31258f(listM31234e, arrayList, lM31232c2);
            return;
        }
        if (this.f28326y.m627f()) {
            this.f28326y.m624b("Ignoring empty range merge for path " + str3, new Object[0]);
        }
    }

    /* JADX INFO: renamed from: e0 */
    private void m31293e0(List list) {
        Collection collectionM31297j0 = m31297j0(list);
        if (collectionM31297j0 != null) {
            Iterator it = collectionM31297j0.iterator();
            while (it.hasNext()) {
                ((l) it.next()).f28355a.mo31348a("permission_denied", null);
            }
        }
    }

    /* JADX INFO: renamed from: f0 */
    private void m31294f0(Map map) {
        this.f28326y.m626e((String) map.get("msg"));
    }

    /* JADX INFO: renamed from: h0 */
    private void m31295h0(String str, List list, Object obj, String str2, InterfaceC7094p interfaceC7094p) {
        Map mapM31285V = m31285V(list, obj, str2);
        long j7 = this.f28310i;
        this.f28310i = 1 + j7;
        this.f28315n.put(Long.valueOf(j7), new m(str, mapM31285V, interfaceC7094p, null));
        if (m31279P()) {
            m31311t0(j7);
        }
        this.f28300F = System.currentTimeMillis();
        m31282S();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public l m31296i0(n nVar) {
        if (this.f28326y.m627f()) {
            this.f28326y.m624b("removing query " + nVar, new Object[0]);
        }
        if (this.f28317p.containsKey(nVar)) {
            l lVar = (l) this.f28317p.get(nVar);
            this.f28317p.remove(nVar);
            m31282S();
            return lVar;
        }
        if (!this.f28326y.m627f()) {
            return null;
        }
        this.f28326y.m624b("Trying to remove listener for QuerySpec " + nVar + " but no listener exists.", new Object[0]);
        return null;
    }

    /* JADX INFO: renamed from: j0 */
    private Collection m31297j0(List list) {
        if (this.f28326y.m627f()) {
            this.f28326y.m624b("removing all listens at path " + list, new Object[0]);
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f28317p.entrySet()) {
            n nVar = (n) entry.getKey();
            l lVar = (l) entry.getValue();
            if (nVar.f28363a.equals(list)) {
                arrayList.add(lVar);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f28317p.remove(((l) it.next()).m31336d());
        }
        m31282S();
        return arrayList;
    }

    /* JADX INFO: renamed from: k0 */
    private void m31298k0() {
        j jVar = this.f28309h;
        AbstractC7083e.m31231b(jVar == j.Connected, "Should be connected if we're restoring state, but we are: %s", jVar);
        if (this.f28326y.m627f()) {
            this.f28326y.m624b("Restoring outstanding listens", new Object[0]);
        }
        for (l lVar : this.f28317p.values()) {
            if (this.f28326y.m627f()) {
                this.f28326y.m624b("Restoring listen " + lVar.m31336d(), new Object[0]);
            }
            m31309s0(lVar);
        }
        if (this.f28326y.m627f()) {
            this.f28326y.m624b("Restoring writes.", new Object[0]);
        }
        ArrayList arrayList = new ArrayList(this.f28315n.keySet());
        Collections.sort(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m31311t0(((Long) it.next()).longValue());
        }
        Iterator it2 = this.f28314m.iterator();
        if (it2.hasNext()) {
            AbstractC2263x.m9328a(it2.next());
            throw null;
        }
        this.f28314m.clear();
        if (this.f28326y.m627f()) {
            this.f28326y.m624b("Restoring reads.", new Object[0]);
        }
        ArrayList arrayList2 = new ArrayList(this.f28316o.keySet());
        Collections.sort(arrayList2);
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            m31307r0((Long) it3.next());
        }
    }

    /* JADX INFO: renamed from: l0 */
    private void m31299l0() {
        if (this.f28326y.m627f()) {
            this.f28326y.m624b("calling restore tokens", new Object[0]);
        }
        j jVar = this.f28309h;
        AbstractC7083e.m31231b(jVar == j.Connecting, "Wanted to restore tokens, but was in wrong state: %s", jVar);
        if (this.f28318q != null) {
            if (this.f28326y.m627f()) {
                this.f28326y.m624b("Restoring auth.", new Object[0]);
            }
            this.f28309h = j.Authenticating;
            m31302o0();
            return;
        }
        if (this.f28326y.m627f()) {
            this.f28326y.m624b("Not restoring auth because auth token is null.", new Object[0]);
        }
        this.f28309h = j.Connected;
        m31301n0(true);
    }

    /* JADX INFO: renamed from: m0 */
    private void m31300m0(String str, Map map, i iVar) {
        m31313u0(str, false, map, iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public void m31301n0(final boolean z7) {
        if (this.f28320s == null) {
            m31298k0();
            return;
        }
        AbstractC7083e.m31231b(m31281R(), "Must be connected to send auth, but was: %s", this.f28309h);
        if (this.f28326y.m627f()) {
            this.f28326y.m624b("Sending app check.", new Object[0]);
        }
        i iVar = new i() { // from class: t4.m
            @Override // p358t4.C7092n.i
            /* JADX INFO: renamed from: a */
            public final void mo31259a(Map map) {
                C7092n.m31304q(this.f28292a, z7, map);
            }
        };
        HashMap map = new HashMap();
        AbstractC7083e.m31231b(this.f28320s != null, "App check token must be set!", new Object[0]);
        map.put("token", this.f28320s);
        m31313u0("appcheck", true, map, iVar);
    }

    /* JADX INFO: renamed from: o0 */
    private void m31302o0() {
        m31303p0(true);
    }

    /* JADX INFO: renamed from: p0 */
    private void m31303p0(boolean z7) {
        AbstractC7083e.m31231b(m31281R(), "Must be connected to send auth, but was: %s", this.f28309h);
        if (this.f28326y.m627f()) {
            this.f28326y.m624b("Sending auth.", new Object[0]);
        }
        c cVar = new c(z7);
        HashMap map = new HashMap();
        C0431a c0431aM1858c = C0431a.m1858c(this.f28318q);
        if (c0431aM1858c == null) {
            map.put("cred", this.f28318q);
            m31313u0("auth", true, map, cVar);
        } else {
            map.put("cred", c0431aM1858c.m1860b());
            if (c0431aM1858c.m1859a() != null) {
                map.put("authvar", c0431aM1858c.m1859a());
            }
            m31313u0("gauth", true, map, cVar);
        }
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m31304q(C7092n c7092n, boolean z7, Map map) {
        c7092n.getClass();
        String str = (String) map.get("s");
        if (str.equals("ok")) {
            c7092n.f28298D = 0;
        } else {
            c7092n.f28320s = null;
            c7092n.f28321t = true;
            String str2 = (String) map.get("d");
            c7092n.f28326y.m624b("App check failed: " + str + " (" + str2 + ")", new Object[0]);
        }
        if (z7) {
            c7092n.m31298k0();
        }
    }

    /* JADX INFO: renamed from: q0 */
    private void m31305q0() {
        HashMap map = new HashMap();
        if (this.f28322u.m31226i()) {
            map.put("persistence.android.enabled", 1);
        }
        map.put("sdk.android." + this.f28322u.m31221d().replace('.', '-'), 1);
        if (this.f28326y.m627f()) {
            this.f28326y.m624b("Sending first connection stats", new Object[0]);
        }
        m31315v0(map);
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m31306r(C7092n c7092n, long j7, Task task, Task task2, Void r7) {
        if (j7 != c7092n.f28296B) {
            c7092n.f28326y.m624b("Ignoring getToken result, because this was not the latest attempt.", new Object[0]);
            return;
        }
        j jVar = c7092n.f28309h;
        if (jVar == j.GettingToken) {
            c7092n.f28326y.m624b("Successfully fetched token, opening connection", new Object[0]);
            c7092n.m31324g0((String) task.getResult(), (String) task2.getResult());
        } else if (jVar == j.Disconnected) {
            c7092n.f28326y.m624b("Not opening connection after token refresh, because connection was set to disconnected", new Object[0]);
        }
    }

    /* JADX INFO: renamed from: r0 */
    private void m31307r0(Long l7) {
        AbstractC7083e.m31231b(m31278O(), "sendGet called when we can't send gets", new Object[0]);
        k kVar = (k) this.f28316o.get(l7);
        if (kVar.m31332f() || !this.f28326y.m627f()) {
            m31300m0("g", kVar.m31331e(), new e(l7, kVar));
            return;
        }
        this.f28326y.m624b("get" + l7 + " cancelled, ignoring.", new Object[0]);
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m31308s(TaskCompletionSource taskCompletionSource, Map map) {
        if (((String) map.get("s")).equals("ok")) {
            taskCompletionSource.setResult(map.get("d"));
        } else {
            taskCompletionSource.setException(new Exception((String) map.get("d")));
        }
    }

    /* JADX INFO: renamed from: s0 */
    private void m31309s0(l lVar) {
        HashMap map = new HashMap();
        map.put("p", AbstractC7083e.m31233d(lVar.m31336d().f28363a));
        Long lM31337e = lVar.m31337e();
        if (lM31337e != null) {
            map.put("q", lVar.f28356b.f28364b);
            map.put("t", lM31337e);
        }
        InterfaceC7085g interfaceC7085gM31335c = lVar.m31335c();
        map.put("h", interfaceC7085gM31335c.mo31241d());
        if (interfaceC7085gM31335c.mo31240b()) {
            C7079a c7079aMo31239a = interfaceC7085gM31335c.mo31239a();
            ArrayList arrayList = new ArrayList();
            Iterator it = c7079aMo31239a.m31197b().iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC7083e.m31233d((List) it.next()));
            }
            HashMap map2 = new HashMap();
            map2.put("hs", c7079aMo31239a.m31196a());
            map2.put("ps", arrayList);
            map.put("ch", map2);
        }
        m31300m0("q", map, new f(lVar));
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m31310t(final C7092n c7092n, boolean z7, boolean z8) {
        j jVar = c7092n.f28309h;
        AbstractC7083e.m31231b(jVar == j.Disconnected, "Not in disconnected state: %s", jVar);
        c7092n.f28309h = j.GettingToken;
        final long j7 = c7092n.f28296B + 1;
        c7092n.f28296B = j7;
        final Task taskM31284U = c7092n.m31284U(z7);
        final Task taskM31283T = c7092n.m31283T(z8);
        Tasks.whenAll((Task<?>[]) new Task[]{taskM31284U, taskM31283T}).addOnSuccessListener(c7092n.f28325x, new OnSuccessListener() { // from class: t4.k
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                C7092n.m31306r(this.f28286a, j7, taskM31284U, taskM31283T, (Void) obj);
            }
        }).addOnFailureListener(c7092n.f28325x, new OnFailureListener() { // from class: t4.l
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                C7092n.m31312u(this.f28290a, j7, exc);
            }
        });
    }

    /* JADX INFO: renamed from: t0 */
    private void m31311t0(long j7) {
        AbstractC7083e.m31231b(m31279P(), "sendPut called when we can't send writes (we're disconnected or writes are paused).", new Object[0]);
        m mVar = (m) this.f28315n.get(Long.valueOf(j7));
        InterfaceC7094p interfaceC7094pM31339b = mVar.m31339b();
        String strM31338a = mVar.m31338a();
        mVar.m31341d();
        m31300m0(strM31338a, mVar.m31340c(), new d(strM31338a, j7, mVar, interfaceC7094pM31339b));
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m31312u(C7092n c7092n, long j7, Exception exc) {
        if (j7 != c7092n.f28296B) {
            c7092n.f28326y.m624b("Ignoring getToken error, because this was not the latest attempt.", new Object[0]);
            return;
        }
        c7092n.f28309h = j.Disconnected;
        c7092n.f28326y.m624b("Error fetching token: " + exc, new Object[0]);
        c7092n.m31261A0();
    }

    /* JADX INFO: renamed from: u0 */
    private void m31313u0(String str, boolean z7, Map map, i iVar) {
        long jM31289a0 = m31289a0();
        HashMap map2 = new HashMap();
        map2.put("r", Long.valueOf(jM31289a0));
        map2.put("a", str);
        map2.put("b", map);
        this.f28308g.m31210m(map2, z7);
        this.f28313l.put(Long.valueOf(jM31289a0), iVar);
    }

    /* JADX INFO: renamed from: v0 */
    private void m31315v0(Map map) {
        if (map.isEmpty()) {
            if (this.f28326y.m627f()) {
                this.f28326y.m624b("Not sending stats because stats are empty", new Object[0]);
            }
        } else {
            HashMap map2 = new HashMap();
            map2.put("c", map);
            m31300m0("s", map2, new g());
        }
    }

    /* JADX INFO: renamed from: w0 */
    private void m31317w0() {
        AbstractC7083e.m31231b(m31281R(), "Must be connected to send unauth.", new Object[0]);
        AbstractC7083e.m31231b(this.f28320s == null, "App check token must not be set.", new Object[0]);
        m31300m0("unappcheck", Collections.EMPTY_MAP, null);
    }

    /* JADX INFO: renamed from: x */
    static /* synthetic */ int m31318x(C7092n c7092n) {
        int i7 = c7092n.f28297C;
        c7092n.f28297C = i7 + 1;
        return i7;
    }

    /* JADX INFO: renamed from: x0 */
    private void m31319x0() {
        AbstractC7083e.m31231b(m31281R(), "Must be connected to send unauth.", new Object[0]);
        AbstractC7083e.m31231b(this.f28318q == null, "Auth token must not be set.", new Object[0]);
        m31300m0("unauth", Collections.EMPTY_MAP, null);
    }

    /* JADX INFO: renamed from: y0 */
    private void m31321y0(l lVar) {
        HashMap map = new HashMap();
        map.put("p", AbstractC7083e.m31233d(lVar.f28356b.f28363a));
        Long lM31337e = lVar.m31337e();
        if (lM31337e != null) {
            map.put("q", lVar.m31336d().f28364b);
            map.put("t", lM31337e);
        }
        m31300m0("n", map, null);
    }

    /* JADX INFO: renamed from: Z */
    public boolean m31323Z(String str) {
        return this.f28305d.contains(str);
    }

    @Override // p358t4.InterfaceC7086h
    /* JADX INFO: renamed from: a */
    public void mo31242a() {
        m31261A0();
    }

    @Override // p358t4.InterfaceC7086h
    /* JADX INFO: renamed from: b */
    public Task mo31243b(List list, Map map) {
        n nVar = new n(list, map);
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        long j7 = this.f28311j;
        this.f28311j = 1 + j7;
        HashMap map2 = new HashMap();
        map2.put("p", AbstractC7083e.m31233d(nVar.f28363a));
        map2.put("q", nVar.f28364b);
        this.f28316o.put(Long.valueOf(j7), new k("g", map2, new i() { // from class: t4.j
            @Override // p358t4.C7092n.i
            /* JADX INFO: renamed from: a */
            public final void mo31259a(Map map3) {
                C7092n.m31308s(taskCompletionSource, map3);
            }
        }, null));
        if (m31278O()) {
            m31307r0(Long.valueOf(j7));
        }
        m31282S();
        return taskCompletionSource.getTask();
    }

    @Override // p358t4.InterfaceC7086h
    /* JADX INFO: renamed from: c */
    public void mo31244c(List list, Map map, InterfaceC7094p interfaceC7094p) {
        m31295h0("m", list, map, null, interfaceC7094p);
    }

    @Override // p358t4.InterfaceC7086h
    /* JADX INFO: renamed from: d */
    public void mo31245d(String str) {
        if (this.f28326y.m627f()) {
            this.f28326y.m624b("Connection interrupted for: " + str, new Object[0]);
        }
        this.f28305d.add(str);
        C7080b c7080b = this.f28308g;
        if (c7080b != null) {
            c7080b.m31207c();
            this.f28308g = null;
        } else {
            this.f28327z.m31648b();
            this.f28309h = j.Disconnected;
        }
        this.f28327z.m31651e();
    }

    @Override // p358t4.InterfaceC7086h
    /* JADX INFO: renamed from: e */
    public void mo31246e(List list, Object obj, String str, InterfaceC7094p interfaceC7094p) {
        m31295h0("p", list, obj, str, interfaceC7094p);
    }

    @Override // p358t4.C7080b.a
    /* JADX INFO: renamed from: f */
    public void mo31211f(String str) {
        this.f28304c = str;
    }

    @Override // p358t4.InterfaceC7086h
    /* JADX INFO: renamed from: g */
    public void mo31247g(String str) {
        if (this.f28326y.m627f()) {
            this.f28326y.m624b("Connection no longer interrupted for: " + str, new Object[0]);
        }
        this.f28305d.remove(str);
        if (m31325z0() && this.f28309h == j.Disconnected) {
            m31261A0();
        }
    }

    /* JADX INFO: renamed from: g0 */
    public void m31324g0(String str, String str2) {
        j jVar = this.f28309h;
        AbstractC7083e.m31231b(jVar == j.GettingToken, "Trying to open network connection while in the wrong state: %s", jVar);
        if (str == null) {
            this.f28302a.mo31254b(false);
        }
        this.f28318q = str;
        this.f28320s = str2;
        this.f28309h = j.Connecting;
        C7080b c7080b = new C7080b(this.f28322u, this.f28303b, this.f28304c, this, this.f28295A, str2);
        this.f28308g = c7080b;
        c7080b.m31209k();
    }

    @Override // p358t4.C7080b.a
    /* JADX INFO: renamed from: h */
    public void mo31212h(String str) {
        if (str.equals("Invalid appcheck token")) {
            int i7 = this.f28298D;
            if (i7 < 3) {
                this.f28298D = i7 + 1;
                this.f28326y.m628i("Detected invalid AppCheck token. Reconnecting (" + (3 - ((long) this.f28298D)) + " attempts remaining)");
                return;
            }
        }
        this.f28326y.m628i("Firebase Database connection was forcefully killed by the server. Will not attempt reconnect. Reason: " + str);
        mo31245d("server_kill");
    }

    @Override // p358t4.InterfaceC7086h
    /* JADX INFO: renamed from: i */
    public void mo31248i(List list, Object obj, InterfaceC7094p interfaceC7094p) {
        m31295h0("p", list, obj, null, interfaceC7094p);
    }

    @Override // p358t4.C7080b.a
    /* JADX INFO: renamed from: j */
    public void mo31213j(long j7, String str) {
        if (this.f28326y.m627f()) {
            this.f28326y.m624b("onReady", new Object[0]);
        }
        this.f28307f = System.currentTimeMillis();
        m31286W(j7);
        if (this.f28306e) {
            m31305q0();
        }
        m31299l0();
        this.f28306e = false;
        this.f28295A = str;
        this.f28302a.mo31255c();
    }

    @Override // p358t4.InterfaceC7086h
    /* JADX INFO: renamed from: k */
    public void mo31249k(String str) {
        this.f28326y.m624b("Auth token refreshed.", new Object[0]);
        this.f28318q = str;
        if (m31281R()) {
            if (str != null) {
                m31265C0();
            } else {
                m31319x0();
            }
        }
    }

    @Override // p358t4.C7080b.a
    /* JADX INFO: renamed from: l */
    public void mo31214l(C7080b.b bVar) {
        boolean z7 = false;
        if (this.f28326y.m627f()) {
            this.f28326y.m624b("Got on disconnect due to " + bVar.name(), new Object[0]);
        }
        this.f28309h = j.Disconnected;
        this.f28308g = null;
        this.f28301G = false;
        this.f28313l.clear();
        m31280Q();
        if (m31325z0()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j7 = this.f28307f;
            long j8 = jCurrentTimeMillis - j7;
            if (j7 > 0 && j8 > 30000) {
                z7 = true;
            }
            if (bVar == C7080b.b.SERVER_RESET || z7) {
                this.f28327z.m31651e();
            }
            m31261A0();
        }
        this.f28307f = 0L;
        this.f28302a.mo31257e();
    }

    @Override // p358t4.InterfaceC7086h
    /* JADX INFO: renamed from: m */
    public void mo31250m(String str) {
        this.f28326y.m624b("App check token refreshed.", new Object[0]);
        this.f28320s = str;
        if (m31281R()) {
            if (str != null) {
                m31263B0();
            } else {
                m31317w0();
            }
        }
    }

    @Override // p358t4.C7080b.a
    /* JADX INFO: renamed from: n */
    public void mo31215n(Map map) {
        if (map.containsKey("r")) {
            i iVar = (i) this.f28313l.remove(Long.valueOf(((Integer) map.get("r")).intValue()));
            if (iVar != null) {
                iVar.mo31259a((Map) map.get("b"));
                return;
            }
            return;
        }
        if (map.containsKey("error")) {
            return;
        }
        if (map.containsKey("a")) {
            m31292d0((String) map.get("a"), (Map) map.get("b"));
            return;
        }
        if (this.f28326y.m627f()) {
            this.f28326y.m624b("Ignoring unknown message: " + map, new Object[0]);
        }
    }

    @Override // p358t4.InterfaceC7086h
    /* JADX INFO: renamed from: o */
    public void mo31251o(List list, Map map) {
        n nVar = new n(list, map);
        if (this.f28326y.m627f()) {
            this.f28326y.m624b("unlistening on " + nVar, new Object[0]);
        }
        l lVarM31296i0 = m31296i0(nVar);
        if (lVarM31296i0 != null && m31281R()) {
            m31321y0(lVarM31296i0);
        }
        m31282S();
    }

    @Override // p358t4.InterfaceC7086h
    /* JADX INFO: renamed from: p */
    public void mo31252p(List list, Map map, InterfaceC7085g interfaceC7085g, Long l7, InterfaceC7094p interfaceC7094p) {
        n nVar = new n(list, map);
        if (this.f28326y.m627f()) {
            this.f28326y.m624b("Listening on " + nVar, new Object[0]);
        }
        AbstractC7083e.m31231b(!this.f28317p.containsKey(nVar), "listen() called twice for same QuerySpec.", new Object[0]);
        if (this.f28326y.m627f()) {
            this.f28326y.m624b("Adding listen query: " + nVar, new Object[0]);
        }
        l lVar = new l(interfaceC7094p, nVar, l7, interfaceC7085g, null);
        this.f28317p.put(nVar, lVar);
        if (m31281R()) {
            m31309s0(lVar);
        }
        m31282S();
    }

    /* JADX INFO: renamed from: z0 */
    boolean m31325z0() {
        return this.f28305d.size() == 0;
    }
}
