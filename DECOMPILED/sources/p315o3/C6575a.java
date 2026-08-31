package p315o3;

import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import androidx.appcompat.app.AbstractC2263x;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.common.util.AbstractC3765t;
import com.google.android.gms.common.util.AbstractC3767v;
import com.google.android.gms.common.util.C3753h;
import com.google.android.gms.common.util.InterfaceC3750e;
import com.google.android.gms.internal.stats.zzb;
import com.google.android.gms.internal.stats.zzh;
import com.google.android.gms.internal.stats.zzi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: o3.a */
/* JADX INFO: loaded from: classes2.dex */
public class C6575a {

    /* JADX INFO: renamed from: r */
    private static final long f24796r = TimeUnit.DAYS.toMillis(366);

    /* JADX INFO: renamed from: s */
    private static volatile ScheduledExecutorService f24797s = null;

    /* JADX INFO: renamed from: t */
    private static final Object f24798t = new Object();

    /* JADX INFO: renamed from: u */
    private static volatile InterfaceC6579e f24799u = new C6577c();

    /* JADX INFO: renamed from: a */
    private final Object f24800a;

    /* JADX INFO: renamed from: b */
    private final PowerManager.WakeLock f24801b;

    /* JADX INFO: renamed from: c */
    private int f24802c;

    /* JADX INFO: renamed from: d */
    private Future f24803d;

    /* JADX INFO: renamed from: e */
    private long f24804e;

    /* JADX INFO: renamed from: f */
    private final Set f24805f;

    /* JADX INFO: renamed from: g */
    private boolean f24806g;

    /* JADX INFO: renamed from: h */
    private int f24807h;

    /* JADX INFO: renamed from: i */
    zzb f24808i;

    /* JADX INFO: renamed from: j */
    private InterfaceC3750e f24809j;

    /* JADX INFO: renamed from: k */
    private WorkSource f24810k;

    /* JADX INFO: renamed from: l */
    private final String f24811l;

    /* JADX INFO: renamed from: m */
    private final String f24812m;

    /* JADX INFO: renamed from: n */
    private final Context f24813n;

    /* JADX INFO: renamed from: o */
    private final Map f24814o;

    /* JADX INFO: renamed from: p */
    private AtomicInteger f24815p;

    /* JADX INFO: renamed from: q */
    private final ScheduledExecutorService f24816q;

    public C6575a(Context context, int i7, String str) {
        String packageName = context.getPackageName();
        this.f24800a = new Object();
        this.f24802c = 0;
        this.f24805f = new HashSet();
        this.f24806g = true;
        this.f24809j = C3753h.m18171d();
        this.f24814o = new HashMap();
        this.f24815p = new AtomicInteger(0);
        AbstractC3718s.m18084m(context, "WakeLock: context must not be null");
        AbstractC3718s.m18078g(str, "WakeLock: wakeLockName must not be empty");
        this.f24813n = context.getApplicationContext();
        this.f24812m = str;
        this.f24808i = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.f24811l = str;
        } else {
            String strValueOf = String.valueOf(str);
            this.f24811l = strValueOf.length() != 0 ? "*gcore*:".concat(strValueOf) : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb = new StringBuilder(29);
            sb.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new zzi(sb.toString());
        }
        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(i7, str);
        this.f24801b = wakeLockNewWakeLock;
        if (AbstractC3767v.m18214c(context)) {
            WorkSource workSourceM18213b = AbstractC3767v.m18213b(context, AbstractC3765t.m18209b(packageName) ? context.getPackageName() : packageName);
            this.f24810k = workSourceM18213b;
            if (workSourceM18213b != null) {
                m27885i(wakeLockNewWakeLock, workSourceM18213b);
            }
        }
        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = f24797s;
        if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
            synchronized (f24798t) {
                try {
                    scheduledExecutorServiceUnconfigurableScheduledExecutorService = f24797s;
                    if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
                        zzh.zza();
                        scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        f24797s = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f24816q = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m27881e(C6575a c6575a) {
        synchronized (c6575a.f24800a) {
            try {
                if (c6575a.m27887b()) {
                    Log.e("WakeLock", String.valueOf(c6575a.f24811l).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                    c6575a.m27883g();
                    if (c6575a.m27887b()) {
                        c6575a.f24802c = 1;
                        c6575a.m27884h(0);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    private final String m27882f(String str) {
        if (this.f24806g) {
            TextUtils.isEmpty(null);
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    private final void m27883g() {
        if (this.f24805f.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.f24805f);
        this.f24805f.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        AbstractC2263x.m9328a(arrayList.get(0));
        throw null;
    }

    /* JADX INFO: renamed from: h */
    private final void m27884h(int i7) {
        synchronized (this.f24800a) {
            try {
                if (m27887b()) {
                    if (this.f24806g) {
                        int i8 = this.f24802c - 1;
                        this.f24802c = i8;
                        if (i8 > 0) {
                            return;
                        }
                    } else {
                        this.f24802c = 0;
                    }
                    m27883g();
                    Iterator it = this.f24814o.values().iterator();
                    while (it.hasNext()) {
                        ((C6578d) it.next()).f24818a = 0;
                    }
                    this.f24814o.clear();
                    Future future = this.f24803d;
                    if (future != null) {
                        future.cancel(false);
                        this.f24803d = null;
                        this.f24804e = 0L;
                    }
                    this.f24807h = 0;
                    if (this.f24801b.isHeld()) {
                        try {
                            try {
                                this.f24801b.release();
                                if (this.f24808i != null) {
                                    this.f24808i = null;
                                }
                            } catch (RuntimeException e7) {
                                if (!e7.getClass().equals(RuntimeException.class)) {
                                    throw e7;
                                }
                                Log.e("WakeLock", String.valueOf(this.f24811l).concat(" failed to release!"), e7);
                                if (this.f24808i != null) {
                                    this.f24808i = null;
                                }
                            }
                        } catch (Throwable th) {
                            if (this.f24808i != null) {
                                this.f24808i = null;
                            }
                            throw th;
                        }
                    } else {
                        Log.e("WakeLock", String.valueOf(this.f24811l).concat(" should be held!"));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    private static void m27885i(PowerManager.WakeLock wakeLock, WorkSource workSource) {
        try {
            wakeLock.setWorkSource(workSource);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e7) {
            Log.wtf("WakeLock", e7.toString());
        }
    }

    /* JADX INFO: renamed from: a */
    public void m27886a(long j7) {
        this.f24815p.incrementAndGet();
        long jMax = Math.max(Math.min(Long.MAX_VALUE, f24796r), 1L);
        if (j7 > 0) {
            jMax = Math.min(j7, jMax);
        }
        synchronized (this.f24800a) {
            try {
                if (!m27887b()) {
                    this.f24808i = zzb.zza(false, null);
                    this.f24801b.acquire();
                    this.f24809j.mo18161c();
                }
                this.f24802c++;
                this.f24807h++;
                m27882f(null);
                C6578d c6578d = (C6578d) this.f24814o.get(null);
                if (c6578d == null) {
                    c6578d = new C6578d(null);
                    this.f24814o.put(null, c6578d);
                }
                c6578d.f24818a++;
                long jMo18161c = this.f24809j.mo18161c();
                long j8 = Long.MAX_VALUE - jMo18161c > jMax ? jMo18161c + jMax : Long.MAX_VALUE;
                if (j8 > this.f24804e) {
                    this.f24804e = j8;
                    Future future = this.f24803d;
                    if (future != null) {
                        future.cancel(false);
                    }
                    this.f24803d = this.f24816q.schedule(new Runnable() { // from class: o3.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            C6575a.m27881e(this.f24817a);
                        }
                    }, jMax, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m27887b() {
        boolean z7;
        synchronized (this.f24800a) {
            z7 = this.f24802c > 0;
        }
        return z7;
    }

    /* JADX INFO: renamed from: c */
    public void m27888c() {
        if (this.f24815p.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f24811l).concat(" release without a matched acquire!"));
        }
        synchronized (this.f24800a) {
            try {
                m27882f(null);
                if (this.f24814o.containsKey(null)) {
                    C6578d c6578d = (C6578d) this.f24814o.get(null);
                    if (c6578d != null) {
                        int i7 = c6578d.f24818a - 1;
                        c6578d.f24818a = i7;
                        if (i7 == 0) {
                            this.f24814o.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f24811l).concat(" counter does not exist"));
                }
                m27884h(0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m27889d(boolean z7) {
        synchronized (this.f24800a) {
            this.f24806g = z7;
        }
    }
}
