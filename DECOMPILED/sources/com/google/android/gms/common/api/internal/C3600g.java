package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.appcompat.app.AbstractC2263x;
import androidx.collection.C2391b;
import com.google.android.gms.common.api.AbstractC3559g;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC3698i;
import com.google.android.gms.common.internal.AbstractC3728x;
import com.google.android.gms.common.internal.C3667K;
import com.google.android.gms.common.internal.C3712p;
import com.google.android.gms.common.internal.C3720t;
import com.google.android.gms.common.internal.C3722u;
import com.google.android.gms.common.internal.C3726w;
import com.google.android.gms.common.internal.InterfaceC3730y;
import com.google.android.gms.common.util.AbstractC3754i;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p170W2.C1837b;
import p170W2.C1840e;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.g */
/* JADX INFO: loaded from: classes.dex */
public class C3600g implements Handler.Callback {

    /* JADX INFO: renamed from: A */
    public static final Status f14640A = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* JADX INFO: renamed from: B */
    private static final Status f14641B = new Status(4, "The user must be signed in to make this API call.");

    /* JADX INFO: renamed from: C */
    private static final Object f14642C = new Object();

    /* JADX INFO: renamed from: D */
    private static C3600g f14643D;

    /* JADX INFO: renamed from: c */
    private C3726w f14646c;

    /* JADX INFO: renamed from: d */
    private InterfaceC3730y f14647d;

    /* JADX INFO: renamed from: e */
    private final Context f14648e;

    /* JADX INFO: renamed from: f */
    private final C1840e f14649f;

    /* JADX INFO: renamed from: r */
    private final C3667K f14650r;

    /* JADX INFO: renamed from: y */
    private final Handler f14657y;

    /* JADX INFO: renamed from: z */
    private volatile boolean f14658z;

    /* JADX INFO: renamed from: a */
    private long f14644a = 10000;

    /* JADX INFO: renamed from: b */
    private boolean f14645b = false;

    /* JADX INFO: renamed from: s */
    private final AtomicInteger f14651s = new AtomicInteger(1);

    /* JADX INFO: renamed from: t */
    private final AtomicInteger f14652t = new AtomicInteger(0);

    /* JADX INFO: renamed from: u */
    private final Map f14653u = new ConcurrentHashMap(5, 0.75f, 1);

    /* JADX INFO: renamed from: v */
    private C3565C f14654v = null;

    /* JADX INFO: renamed from: w */
    private final Set f14655w = new C2391b();

    /* JADX INFO: renamed from: x */
    private final Set f14656x = new C2391b();

    private C3600g(Context context, Looper looper, C1840e c1840e) {
        this.f14658z = true;
        this.f14648e = context;
        zau zauVar = new zau(looper, this);
        this.f14657y = zauVar;
        this.f14649f = c1840e;
        this.f14650r = new C3667K(c1840e);
        if (AbstractC3754i.m18172a(context)) {
            this.f14658z = false;
        }
        zauVar.sendMessage(zauVar.obtainMessage(6));
    }

    /* JADX INFO: renamed from: a */
    public static void m17872a() {
        synchronized (f14642C) {
            try {
                C3600g c3600g = f14643D;
                if (c3600g != null) {
                    c3600g.f14652t.incrementAndGet();
                    Handler handler = c3600g.f14657y;
                    handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static Status m17874g(C3590b c3590b, C1837b c1837b) {
        return new Status(c1837b, "API: " + c3590b.m17856b() + " is not available on this device. Connection failed with: " + String.valueOf(c1837b));
    }

    /* JADX INFO: renamed from: h */
    private final C3574L m17875h(AbstractC3559g abstractC3559g) {
        Map map = this.f14653u;
        C3590b apiKey = abstractC3559g.getApiKey();
        C3574L c3574l = (C3574L) map.get(apiKey);
        if (c3574l == null) {
            c3574l = new C3574L(this, abstractC3559g);
            this.f14653u.put(apiKey, c3574l);
        }
        if (c3574l.m17830a()) {
            this.f14656x.add(apiKey);
        }
        c3574l.m17822B();
        return c3574l;
    }

    /* JADX INFO: renamed from: i */
    private final InterfaceC3730y m17876i() {
        if (this.f14647d == null) {
            this.f14647d = AbstractC3728x.m18106a(this.f14648e);
        }
        return this.f14647d;
    }

    /* JADX INFO: renamed from: j */
    private final void m17877j() {
        C3726w c3726w = this.f14646c;
        if (c3726w != null) {
            if (c3726w.m18103T() > 0 || m17898e()) {
                m17876i().mo8435a(c3726w);
            }
            this.f14646c = null;
        }
    }

    /* JADX INFO: renamed from: k */
    private final void m17878k(TaskCompletionSource taskCompletionSource, int i7, AbstractC3559g abstractC3559g) {
        C3585X c3585xM17852a;
        if (i7 == 0 || (c3585xM17852a = C3585X.m17852a(this, i7, abstractC3559g.getApiKey())) == null) {
            return;
        }
        Task task = taskCompletionSource.getTask();
        final Handler handler = this.f14657y;
        handler.getClass();
        task.addOnCompleteListener(new Executor() { // from class: com.google.android.gms.common.api.internal.F
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        }, c3585xM17852a);
    }

    /* JADX INFO: renamed from: u */
    public static C3600g m17886u(Context context) {
        C3600g c3600g;
        synchronized (f14642C) {
            try {
                if (f14643D == null) {
                    f14643D = new C3600g(context.getApplicationContext(), AbstractC3698i.m18035b().getLooper(), C1840e.m7604n());
                }
                c3600g = f14643D;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3600g;
    }

    /* JADX INFO: renamed from: C */
    public final void m17890C(AbstractC3559g abstractC3559g, int i7, AbstractC3594d abstractC3594d) {
        this.f14657y.sendMessage(this.f14657y.obtainMessage(4, new C3587Z(new C3611l0(i7, abstractC3594d), this.f14652t.get(), abstractC3559g)));
    }

    /* JADX INFO: renamed from: D */
    public final void m17891D(AbstractC3559g abstractC3559g, int i7, AbstractC3632w abstractC3632w, TaskCompletionSource taskCompletionSource, InterfaceC3628u interfaceC3628u) {
        m17878k(taskCompletionSource, abstractC3632w.m17944d(), abstractC3559g);
        this.f14657y.sendMessage(this.f14657y.obtainMessage(4, new C3587Z(new C3613m0(i7, abstractC3632w, taskCompletionSource, interfaceC3628u), this.f14652t.get(), abstractC3559g)));
    }

    /* JADX INFO: renamed from: E */
    final void m17892E(C3712p c3712p, int i7, long j7, int i8) {
        this.f14657y.sendMessage(this.f14657y.obtainMessage(18, new C3586Y(c3712p, i7, j7, i8)));
    }

    /* JADX INFO: renamed from: F */
    public final void m17893F(C1837b c1837b, int i7) {
        if (m17899f(c1837b, i7)) {
            return;
        }
        Handler handler = this.f14657y;
        handler.sendMessage(handler.obtainMessage(5, i7, 0, c1837b));
    }

    /* JADX INFO: renamed from: G */
    public final void m17894G() {
        Handler handler = this.f14657y;
        handler.sendMessage(handler.obtainMessage(3));
    }

    /* JADX INFO: renamed from: H */
    public final void m17895H(AbstractC3559g abstractC3559g) {
        Handler handler = this.f14657y;
        handler.sendMessage(handler.obtainMessage(7, abstractC3559g));
    }

    /* JADX INFO: renamed from: b */
    public final void m17896b(C3565C c3565c) {
        synchronized (f14642C) {
            try {
                if (this.f14654v != c3565c) {
                    this.f14654v = c3565c;
                    this.f14655w.clear();
                }
                this.f14655w.addAll(c3565c.m17795i());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    final void m17897c(C3565C c3565c) {
        synchronized (f14642C) {
            try {
                if (this.f14654v == c3565c) {
                    this.f14654v = null;
                    this.f14655w.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    final boolean m17898e() {
        if (this.f14645b) {
            return false;
        }
        C3722u c3722uM18090a = C3720t.m18089b().m18090a();
        if (c3722uM18090a != null && !c3722uM18090a.m18094V()) {
            return false;
        }
        int iM17985a = this.f14650r.m17985a(this.f14648e, 203400000);
        return iM17985a == -1 || iM17985a == 0;
    }

    /* JADX INFO: renamed from: f */
    final boolean m17899f(C1837b c1837b, int i7) {
        return this.f14649f.m7622x(this.f14648e, c1837b, i7);
    }

    /* JADX WARN: Code duplicated, block: B:63:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:65:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:66:0x0220  */
    /* JADX WARN: Code duplicated, block: B:67:0x022d  */
    /* JADX WARN: Instruction removed from duplicated block: B:65:0x01ef, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:67:0x022d, please report this as an issue */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i7 = message.what;
        C3574L c3574l = null;
        switch (i7) {
            case 1:
                this.f14644a = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                this.f14657y.removeMessages(12);
                for (C3590b c3590b : this.f14653u.keySet()) {
                    Handler handler = this.f14657y;
                    handler.sendMessageDelayed(handler.obtainMessage(12, c3590b), this.f14644a);
                }
                return true;
            case 2:
                AbstractC2263x.m9328a(message.obj);
                throw null;
            case 3:
                for (C3574L c3574l2 : this.f14653u.values()) {
                    c3574l2.m17821A();
                    c3574l2.m17822B();
                }
                return true;
            case 4:
            case 8:
            case 13:
                C3587Z c3587z = (C3587Z) message.obj;
                C3574L c3574lM17875h = (C3574L) this.f14653u.get(c3587z.f14617c.getApiKey());
                if (c3574lM17875h == null) {
                    c3574lM17875h = m17875h(c3587z.f14617c);
                }
                if (!c3574lM17875h.m17830a() || this.f14652t.get() == c3587z.f14616b) {
                    c3574lM17875h.m17823C(c3587z.f14615a);
                } else {
                    c3587z.f14615a.mo17908a(f14640A);
                    c3574lM17875h.m17828H();
                }
                return true;
            case 5:
                int i8 = message.arg1;
                C1837b c1837b = (C1837b) message.obj;
                for (C3574L c3574l3 : this.f14653u.values()) {
                    if (c3574l3.m17832p() == i8) {
                        c3574l = c3574l3;
                        if (c3574l != null) {
                            Log.wtf("GoogleApiManager", "Could not find API instance " + i8 + " while trying to fail enqueued calls.", new Exception());
                        } else if (c1837b.m7596T() == 13) {
                            c3574l.m17803e(new Status(17, "Error resolution was canceled by the user, original error message: " + this.f14649f.mo7607e(c1837b.m7596T()) + ": " + c1837b.m7597U()));
                        } else {
                            c3574l.m17803e(m17874g(c3574l.f14580c, c1837b));
                        }
                        return true;
                    }
                }
                if (c3574l != null) {
                    Log.wtf("GoogleApiManager", "Could not find API instance " + i8 + " while trying to fail enqueued calls.", new Exception());
                } else if (c1837b.m7596T() == 13) {
                    c3574l.m17803e(new Status(17, "Error resolution was canceled by the user, original error message: " + this.f14649f.mo7607e(c1837b.m7596T()) + ": " + c1837b.m7597U()));
                } else {
                    c3574l.m17803e(m17874g(c3574l.f14580c, c1837b));
                }
                return true;
            case 6:
                if (this.f14648e.getApplicationContext() instanceof Application) {
                    ComponentCallbacks2C3592c.m17858c((Application) this.f14648e.getApplicationContext());
                    ComponentCallbacks2C3592c.m17857b().m17860a(new C3569G(this));
                    if (!ComponentCallbacks2C3592c.m17857b().m17862e(true)) {
                        this.f14644a = 300000L;
                    }
                }
                return true;
            case 7:
                m17875h((AbstractC3559g) message.obj);
                return true;
            case 9:
                if (this.f14653u.containsKey(message.obj)) {
                    ((C3574L) this.f14653u.get(message.obj)).m17827G();
                }
                return true;
            case 10:
                Iterator it = this.f14656x.iterator();
                while (it.hasNext()) {
                    C3574L c3574l4 = (C3574L) this.f14653u.remove((C3590b) it.next());
                    if (c3574l4 != null) {
                        c3574l4.m17828H();
                    }
                }
                this.f14656x.clear();
                return true;
            case 11:
                if (this.f14653u.containsKey(message.obj)) {
                    ((C3574L) this.f14653u.get(message.obj)).m17829I();
                }
                return true;
            case 12:
                if (this.f14653u.containsKey(message.obj)) {
                    ((C3574L) this.f14653u.get(message.obj)).m17831b();
                }
                return true;
            case 14:
                C3566D c3566d = (C3566D) message.obj;
                C3590b c3590bM17796a = c3566d.m17796a();
                if (this.f14653u.containsKey(c3590bM17796a)) {
                    c3566d.m17797b().setResult(Boolean.valueOf(((C3574L) this.f14653u.get(c3590bM17796a)).m17813o(false)));
                } else {
                    c3566d.m17797b().setResult(Boolean.FALSE);
                }
                return true;
            case 15:
                C3576N c3576n = (C3576N) message.obj;
                if (this.f14653u.containsKey(c3576n.f14591a)) {
                    C3574L.m17819y((C3574L) this.f14653u.get(c3576n.f14591a), c3576n);
                }
                return true;
            case 16:
                C3576N c3576n2 = (C3576N) message.obj;
                if (this.f14653u.containsKey(c3576n2.f14591a)) {
                    C3574L.m17820z((C3574L) this.f14653u.get(c3576n2.f14591a), c3576n2);
                }
                return true;
            case 17:
                m17877j();
                return true;
            case 18:
                C3586Y c3586y = (C3586Y) message.obj;
                if (c3586y.f14613c == 0) {
                    m17876i().mo8435a(new C3726w(c3586y.f14612b, Arrays.asList(c3586y.f14611a)));
                } else {
                    C3726w c3726w = this.f14646c;
                    if (c3726w != null) {
                        List listM18104U = c3726w.m18104U();
                        if (c3726w.m18103T() != c3586y.f14612b || (listM18104U != null && listM18104U.size() >= c3586y.f14614d)) {
                            this.f14657y.removeMessages(17);
                            m17877j();
                        } else {
                            this.f14646c.m18105V(c3586y.f14611a);
                        }
                    }
                    if (this.f14646c == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(c3586y.f14611a);
                        this.f14646c = new C3726w(c3586y.f14612b, arrayList);
                        Handler handler2 = this.f14657y;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), c3586y.f14613c);
                    }
                }
                return true;
            case 19:
                this.f14645b = false;
                return true;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + i7);
                return false;
        }
    }

    /* JADX INFO: renamed from: l */
    public final int m17900l() {
        return this.f14651s.getAndIncrement();
    }

    /* JADX INFO: renamed from: t */
    final C3574L m17901t(C3590b c3590b) {
        return (C3574L) this.f14653u.get(c3590b);
    }

    /* JADX INFO: renamed from: w */
    public final Task m17902w(AbstractC3559g abstractC3559g) {
        C3566D c3566d = new C3566D(abstractC3559g.getApiKey());
        this.f14657y.sendMessage(this.f14657y.obtainMessage(14, c3566d));
        return c3566d.m17797b().getTask();
    }

    /* JADX INFO: renamed from: x */
    public final Task m17903x(AbstractC3559g abstractC3559g, C3610l.a aVar, int i7) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        m17878k(taskCompletionSource, i7, abstractC3559g);
        this.f14657y.sendMessage(this.f14657y.obtainMessage(13, new C3587Z(new C3615n0(aVar, taskCompletionSource), this.f14652t.get(), abstractC3559g)));
        return taskCompletionSource.getTask();
    }
}
