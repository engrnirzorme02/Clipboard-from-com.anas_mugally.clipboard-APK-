package p356t2;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.internal.ads_identifier.zze;
import com.google.android.gms.internal.ads_identifier.zzf;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import p170W2.C1841f;
import p170W2.C1842g;
import p170W2.ServiceConnectionC1836a;
import p209b3.C2959a;

/* JADX INFO: renamed from: t2.a */
/* JADX INFO: loaded from: classes.dex */
public class C7073a {

    /* JADX INFO: renamed from: a */
    ServiceConnectionC1836a f28241a;

    /* JADX INFO: renamed from: b */
    zzf f28242b;

    /* JADX INFO: renamed from: c */
    boolean f28243c;

    /* JADX INFO: renamed from: d */
    final Object f28244d;

    /* JADX INFO: renamed from: e */
    C7075c f28245e;

    /* JADX INFO: renamed from: f */
    private final Context f28246f;

    /* JADX INFO: renamed from: g */
    final long f28247g;

    /* JADX INFO: renamed from: t2.a$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private final String f28248a;

        /* JADX INFO: renamed from: b */
        private final boolean f28249b;

        public a(String str, boolean z7) {
            this.f28248a = str;
            this.f28249b = z7;
        }

        /* JADX INFO: renamed from: a */
        public String m31190a() {
            return this.f28248a;
        }

        /* JADX INFO: renamed from: b */
        public boolean m31191b() {
            return this.f28249b;
        }

        public String toString() {
            String str = this.f28248a;
            boolean z7 = this.f28249b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z7);
            return sb.toString();
        }
    }

    public C7073a(Context context) {
        this(context, 30000L, false, false);
    }

    /* JADX INFO: renamed from: a */
    public static a m31181a(Context context) {
        C7073a c7073a = new C7073a(context, -1L, true, false);
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            c7073a.m31188f(false);
            a aVarM31184h = c7073a.m31184h(-1);
            c7073a.m31189g(aVarM31184h, true, 0.0f, SystemClock.elapsedRealtime() - jElapsedRealtime, "", null);
            c7073a.m31187e();
            return aVarM31184h;
        } catch (Throwable th) {
            try {
                c7073a.m31189g(null, true, 0.0f, -1L, "", th);
                throw th;
            } catch (Throwable th2) {
                c7073a.m31187e();
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m31182b(Context context) {
        boolean zZzd;
        C7073a c7073a = new C7073a(context, -1L, false, false);
        try {
            c7073a.m31188f(false);
            AbstractC3718s.m18082k("Calling this from your main thread can lead to deadlock");
            synchronized (c7073a) {
                try {
                    if (!c7073a.f28243c) {
                        synchronized (c7073a.f28244d) {
                            C7075c c7075c = c7073a.f28245e;
                            if (c7075c == null || !c7075c.f28254d) {
                                throw new IOException("AdvertisingIdClient is not connected.");
                            }
                        }
                        try {
                            c7073a.m31188f(false);
                            if (!c7073a.f28243c) {
                                throw new IOException("AdvertisingIdClient cannot reconnect.");
                            }
                        } catch (Exception e7) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.", e7);
                        }
                    }
                    AbstractC3718s.m18083l(c7073a.f28241a);
                    AbstractC3718s.m18083l(c7073a.f28242b);
                    try {
                        zZzd = c7073a.f28242b.zzd();
                    } catch (RemoteException e8) {
                        Log.i("AdvertisingIdClient", "GMS remote exception ", e8);
                        throw new IOException("Remote exception");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            c7073a.m31185i();
            c7073a.m31187e();
            return zZzd;
        } catch (Throwable th2) {
            c7073a.m31187e();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m31183c(boolean z7) {
    }

    /* JADX INFO: renamed from: h */
    private final a m31184h(int i7) {
        a aVar;
        AbstractC3718s.m18082k("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.f28243c) {
                    synchronized (this.f28244d) {
                        C7075c c7075c = this.f28245e;
                        if (c7075c == null || !c7075c.f28254d) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        m31188f(false);
                        if (!this.f28243c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e7) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e7);
                    }
                }
                AbstractC3718s.m18083l(this.f28241a);
                AbstractC3718s.m18083l(this.f28242b);
                try {
                    aVar = new a(this.f28242b.zzc(), this.f28242b.zze(true));
                } catch (RemoteException e8) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e8);
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        m31185i();
        return aVar;
    }

    /* JADX INFO: renamed from: i */
    private final void m31185i() {
        synchronized (this.f28244d) {
            C7075c c7075c = this.f28245e;
            if (c7075c != null) {
                c7075c.f28253c.countDown();
                try {
                    this.f28245e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j7 = this.f28247g;
            if (j7 > 0) {
                this.f28245e = new C7075c(this, j7);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m31186d() {
        m31188f(true);
    }

    /* JADX INFO: renamed from: e */
    public final void m31187e() {
        AbstractC3718s.m18082k("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f28246f == null || this.f28241a == null) {
                    return;
                }
                try {
                    if (this.f28243c) {
                        C2959a.m14804b().m14810c(this.f28246f, this.f28241a);
                    }
                } catch (Throwable th) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
                }
                this.f28243c = false;
                this.f28242b = null;
                this.f28241a = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    protected final void m31188f(boolean z7) {
        AbstractC3718s.m18082k("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f28243c) {
                    m31187e();
                }
                Context context = this.f28246f;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int iMo7609h = C1841f.m7623f().mo7609h(context, 12451000);
                    if (iMo7609h != 0 && iMo7609h != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    ServiceConnectionC1836a serviceConnectionC1836a = new ServiceConnectionC1836a();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!C2959a.m14804b().m14809a(context, intent, serviceConnectionC1836a, 1)) {
                            throw new IOException("Connection failure");
                        }
                        this.f28241a = serviceConnectionC1836a;
                        try {
                            this.f28242b = zze.zza(serviceConnectionC1836a.m7594a(10000L, TimeUnit.MILLISECONDS));
                            this.f28243c = true;
                            if (z7) {
                                m31185i();
                            }
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th) {
                            throw new IOException(th);
                        }
                    } catch (Throwable th2) {
                        throw new IOException(th2);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new C1842g(9);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    protected final void finalize() throws Throwable {
        m31187e();
        super.finalize();
    }

    /* JADX INFO: renamed from: g */
    final boolean m31189g(a aVar, boolean z7, float f7, long j7, String str, Throwable th) {
        if (Math.random() > 0.0d) {
            return false;
        }
        HashMap map = new HashMap();
        map.put("app_context", "1");
        if (aVar != null) {
            map.put("limit_ad_tracking", true != aVar.m31191b() ? "0" : "1");
            String strM31190a = aVar.m31190a();
            if (strM31190a != null) {
                map.put("ad_id_size", Integer.toString(strM31190a.length()));
            }
        }
        if (th != null) {
            map.put("error", th.getClass().getName());
        }
        map.put("tag", "AdvertisingIdClient");
        map.put("time_spent", Long.toString(j7));
        new C7074b(this, map).start();
        return true;
    }

    public C7073a(Context context, long j7, boolean z7, boolean z8) {
        Context applicationContext;
        this.f28244d = new Object();
        AbstractC3718s.m18083l(context);
        if (z7 && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f28246f = context;
        this.f28243c = false;
        this.f28247g = j7;
    }
}
