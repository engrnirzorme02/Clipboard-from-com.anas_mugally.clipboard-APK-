package p063H5;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: H5.r */
/* JADX INFO: loaded from: classes.dex */
public class C0565r {

    /* JADX INFO: renamed from: b */
    static final Logger f2184b = Logger.getLogger(C0565r.class.getName());

    /* JADX INFO: renamed from: c */
    public static final C0565r f2185c = new C0565r();

    /* JADX INFO: renamed from: a */
    final int f2186a = 0;

    /* JADX INFO: renamed from: H5.r$a */
    public interface a {
    }

    /* JADX INFO: renamed from: H5.r$b */
    private static final class b {

        /* JADX INFO: renamed from: a */
        static final c f2187a;

        static {
            AtomicReference atomicReference = new AtomicReference();
            f2187a = m2513a(atomicReference);
            Throwable th = (Throwable) atomicReference.get();
            if (th != null) {
                C0565r.f2184b.log(Level.FINE, "Storage override doesn't exist. Using default", th);
            }
        }

        /* JADX INFO: renamed from: a */
        private static c m2513a(AtomicReference atomicReference) {
            try {
                return (c) Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(c.class).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e7) {
                atomicReference.set(e7);
                return new C0564q0();
            } catch (Exception e8) {
                throw new RuntimeException("Storage override failed to initialize", e8);
            }
        }
    }

    /* JADX INFO: renamed from: H5.r$c */
    public static abstract class c {
        /* JADX INFO: renamed from: a */
        public abstract C0565r mo2499a();

        /* JADX INFO: renamed from: b */
        public abstract void mo2500b(C0565r c0565r, C0565r c0565r2);

        /* JADX INFO: renamed from: c */
        public abstract C0565r mo2501c(C0565r c0565r);
    }

    private C0565r() {
        m2505k(0);
    }

    /* JADX INFO: renamed from: d */
    static Object m2502d(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    /* JADX INFO: renamed from: e */
    public static C0565r m2503e() {
        C0565r c0565rMo2499a = m2504j().mo2499a();
        return c0565rMo2499a == null ? f2185c : c0565rMo2499a;
    }

    /* JADX INFO: renamed from: j */
    static c m2504j() {
        return b.f2187a;
    }

    /* JADX INFO: renamed from: k */
    private static void m2505k(int i7) {
        if (i7 == 1000) {
            f2184b.log(Level.SEVERE, "Context ancestry chain length is abnormally long. This suggests an error in application code. Length exceeded: 1000", (Throwable) new Exception());
        }
    }

    /* JADX INFO: renamed from: a */
    public void m2506a(a aVar, Executor executor) {
        m2502d(aVar, "cancellationListener");
        m2502d(executor, "executor");
    }

    /* JADX INFO: renamed from: b */
    public C0565r m2507b() {
        C0565r c0565rMo2501c = m2504j().mo2501c(this);
        return c0565rMo2501c == null ? f2185c : c0565rMo2501c;
    }

    /* JADX INFO: renamed from: c */
    public Throwable m2508c() {
        return null;
    }

    /* JADX INFO: renamed from: f */
    public void m2509f(C0565r c0565r) {
        m2502d(c0565r, "toAttach");
        m2504j().mo2500b(this, c0565r);
    }

    /* JADX INFO: renamed from: g */
    public C0568t m2510g() {
        return null;
    }

    /* JADX INFO: renamed from: h */
    public boolean m2511h() {
        return false;
    }

    /* JADX INFO: renamed from: i */
    public void m2512i(a aVar) {
    }
}
