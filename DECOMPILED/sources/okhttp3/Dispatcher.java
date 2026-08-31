package okhttp3;

import com.google.android.gms.common.api.C3553a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC6118n;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealCall;
import p145S5.C1444v;

/* JADX INFO: loaded from: classes.dex */
public final class Dispatcher {

    /* JADX INFO: renamed from: c */
    private Runnable f25250c;

    /* JADX INFO: renamed from: d */
    private ExecutorService f25251d;

    /* JADX INFO: renamed from: a */
    private int f25248a = 64;

    /* JADX INFO: renamed from: b */
    private int f25249b = 5;

    /* JADX INFO: renamed from: e */
    private final ArrayDeque f25252e = new ArrayDeque();

    /* JADX INFO: renamed from: f */
    private final ArrayDeque f25253f = new ArrayDeque();

    /* JADX INFO: renamed from: g */
    private final ArrayDeque f25254g = new ArrayDeque();

    /* JADX INFO: renamed from: c */
    private final void m28425c(Deque deque, Object obj) {
        Runnable runnable;
        synchronized (this) {
            if (!deque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            runnable = this.f25250c;
            C1444v c1444v = C1444v.f4971a;
        }
        if (m28426f() || runnable == null) {
            return;
        }
        runnable.run();
    }

    /* JADX INFO: renamed from: f */
    private final boolean m28426f() {
        int i7;
        boolean z7;
        if (Util.f25484h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = this.f25252e.iterator();
                AbstractC6118n.m27186d(it, "readyAsyncCalls.iterator()");
                while (it.hasNext()) {
                    RealCall.AsyncCall asyncCall = (RealCall.AsyncCall) it.next();
                    if (this.f25253f.size() >= this.f25248a) {
                        break;
                    }
                    if (asyncCall.m28983b().get() < this.f25249b) {
                        it.remove();
                        asyncCall.m28983b().incrementAndGet();
                        AbstractC6118n.m27186d(asyncCall, "asyncCall");
                        arrayList.add(asyncCall);
                        this.f25253f.add(asyncCall);
                    }
                }
                z7 = m28431g() > 0;
                C1444v c1444v = C1444v.f4971a;
            } catch (Throwable th) {
                throw th;
            }
        }
        int size = arrayList.size();
        for (i7 = 0; i7 < size; i7++) {
            ((RealCall.AsyncCall) arrayList.get(i7)).m28982a(m28428b());
        }
        return z7;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m28427a(RealCall call) {
        AbstractC6118n.m27187e(call, "call");
        this.f25254g.add(call);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized ExecutorService m28428b() {
        ExecutorService executorService;
        try {
            if (this.f25251d == null) {
                this.f25251d = new ThreadPoolExecutor(0, C3553a.e.API_PRIORITY_OTHER, 60L, TimeUnit.SECONDS, new SynchronousQueue(), Util.m28745N(Util.f25485i + " Dispatcher", false));
            }
            executorService = this.f25251d;
            AbstractC6118n.m27184b(executorService);
        } catch (Throwable th) {
            throw th;
        }
        return executorService;
    }

    /* JADX INFO: renamed from: d */
    public final void m28429d(RealCall.AsyncCall call) {
        AbstractC6118n.m27187e(call, "call");
        call.m28983b().decrementAndGet();
        m28425c(this.f25253f, call);
    }

    /* JADX INFO: renamed from: e */
    public final void m28430e(RealCall call) {
        AbstractC6118n.m27187e(call, "call");
        m28425c(this.f25254g, call);
    }

    /* JADX INFO: renamed from: g */
    public final synchronized int m28431g() {
        return this.f25253f.size() + this.f25254g.size();
    }
}
