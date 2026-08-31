package p209b3;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.common.internal.InterfaceC3725v0;
import com.google.android.gms.common.util.AbstractC3760o;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import p227d3.C5228d;

/* JADX INFO: renamed from: b3.a */
/* JADX INFO: loaded from: classes.dex */
public class C2959a {

    /* JADX INFO: renamed from: b */
    private static final Object f12250b = new Object();

    /* JADX INFO: renamed from: c */
    private static volatile C2959a f12251c;

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap f12252a = new ConcurrentHashMap();

    private C2959a() {
    }

    /* JADX INFO: renamed from: b */
    public static C2959a m14804b() {
        if (f12251c == null) {
            synchronized (f12250b) {
                try {
                    if (f12251c == null) {
                        f12251c = new C2959a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        C2959a c2959a = f12251c;
        AbstractC3718s.m18083l(c2959a);
        return c2959a;
    }

    /* JADX INFO: renamed from: e */
    private static void m14805e(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    /* JADX INFO: renamed from: f */
    private final boolean m14806f(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i7, boolean z7, Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((C5228d.m24155a(context).m24149c(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (!m14807g(serviceConnection)) {
            return m14808h(context, intent, serviceConnection, i7, executor);
        }
        ServiceConnection serviceConnection2 = (ServiceConnection) this.f12252a.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
        }
        try {
            boolean zM14808h = m14808h(context, intent, serviceConnection, i7, executor);
            if (zM14808h) {
                return zM14808h;
            }
            this.f12252a.remove(serviceConnection, serviceConnection);
            return false;
        } catch (Throwable th) {
            this.f12252a.remove(serviceConnection, serviceConnection);
            throw th;
        }
    }

    /* JADX INFO: renamed from: g */
    private static boolean m14807g(ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof InterfaceC3725v0);
    }

    /* JADX INFO: renamed from: h */
    private static final boolean m14808h(Context context, Intent intent, ServiceConnection serviceConnection, int i7, Executor executor) {
        if (executor == null) {
            executor = null;
        }
        return (!AbstractC3760o.m18201i() || executor == null) ? context.bindService(intent, serviceConnection, i7) : context.bindService(intent, i7, executor, serviceConnection);
    }

    /* JADX INFO: renamed from: a */
    public boolean m14809a(Context context, Intent intent, ServiceConnection serviceConnection, int i7) {
        return m14806f(context, context.getClass().getName(), intent, serviceConnection, i7, true, null);
    }

    /* JADX INFO: renamed from: c */
    public void m14810c(Context context, ServiceConnection serviceConnection) {
        if (!m14807g(serviceConnection) || !this.f12252a.containsKey(serviceConnection)) {
            m14805e(context, serviceConnection);
            return;
        }
        try {
            m14805e(context, (ServiceConnection) this.f12252a.get(serviceConnection));
        } finally {
            this.f12252a.remove(serviceConnection);
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m14811d(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i7, Executor executor) {
        return m14806f(context, str, intent, serviceConnection, 4225, true, executor);
    }
}
