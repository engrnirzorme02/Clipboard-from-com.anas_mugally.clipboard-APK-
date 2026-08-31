package p291l3;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.common.zzi;
import com.google.android.gms.internal.common.zzj;
import com.google.android.gms.internal.common.zzl;
import java.lang.reflect.Method;
import p170W2.AbstractC1845j;
import p170W2.C1841f;
import p170W2.C1842g;
import p170W2.C1843h;

/* JADX INFO: renamed from: l3.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6295a {

    /* JADX INFO: renamed from: a */
    private static final C1841f f24091a = C1841f.m7623f();

    /* JADX INFO: renamed from: b */
    private static final Object f24092b = new Object();

    /* JADX INFO: renamed from: c */
    private static Method f24093c = null;

    /* JADX INFO: renamed from: d */
    private static boolean f24094d = false;

    /* JADX WARN: Code duplicated, block: B:19:0x0050  */
    /* JADX WARN: Code duplicated, block: B:20:0x0051 A[Catch: all -> 0x0027, TRY_LEAVE, TryCatch #2 {, blocks: (B:4:0x0015, B:7:0x001a, B:14:0x0041, B:15:0x0046, B:17:0x0048, B:28:0x0091, B:29:0x0096, B:31:0x0098, B:32:0x00a6, B:20:0x0051, B:22:0x0055, B:25:0x007f, B:12:0x002b), top: B:39:0x0015, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0091 A[Catch: all -> 0x0027, TryCatch #2 {, blocks: (B:4:0x0015, B:7:0x001a, B:14:0x0041, B:15:0x0046, B:17:0x0048, B:28:0x0091, B:29:0x0096, B:31:0x0098, B:32:0x00a6, B:20:0x0051, B:22:0x0055, B:25:0x007f, B:12:0x002b), top: B:39:0x0015, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0098 A[Catch: all -> 0x0027, TryCatch #2 {, blocks: (B:4:0x0015, B:7:0x001a, B:14:0x0041, B:15:0x0046, B:17:0x0048, B:28:0x0091, B:29:0x0096, B:31:0x0098, B:32:0x00a6, B:20:0x0051, B:22:0x0055, B:25:0x007f, B:12:0x002b), top: B:39:0x0015, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0055 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static void m27215a(Context context) throws C1842g, C1843h {
        Context contextM18232b;
        boolean z7;
        Context contextM7632d;
        AbstractC3718s.m18084m(context, "Context must not be null");
        f24091a.m7627k(context, 11925000);
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (f24092b) {
            Context context2 = null;
            if (f24094d) {
                z7 = f24094d;
                contextM7632d = AbstractC1845j.m7632d(context);
                if (contextM7632d == null) {
                    f24094d = true;
                    if (!z7) {
                        zzl.zzb("com.google.android.gms.common.security.ProviderInstallerImpl", "reportRequestStats2", contextM7632d.getClassLoader(), zzj.zzb(Context.class, context), zzi.zza(jUptimeMillis), zzi.zza(SystemClock.uptimeMillis()));
                    }
                    context2 = contextM7632d;
                }
                if (context2 != null) {
                    m27216b(context2, context, "com.google.android.gms.common.security.ProviderInstallerImpl");
                    return;
                } else {
                    Log.e("ProviderInstaller", "Failed to get remote context");
                    throw new C1842g(8);
                }
            }
            try {
                contextM18232b = DynamiteModule.m18224e(context, DynamiteModule.f14927f, "com.google.android.gms.providerinstaller.dynamite").m18232b();
            } catch (DynamiteModule.C3776a e7) {
                Log.w("ProviderInstaller", "Failed to load providerinstaller module: ".concat(String.valueOf(e7.getMessage())));
                contextM18232b = null;
            }
            if (contextM18232b != null) {
                m27216b(contextM18232b, context, "com.google.android.gms.providerinstaller.ProviderInstallerImpl");
                return;
            }
            z7 = f24094d;
            contextM7632d = AbstractC1845j.m7632d(context);
            if (contextM7632d == null) {
                f24094d = true;
                if (!z7) {
                    try {
                        zzl.zzb("com.google.android.gms.common.security.ProviderInstallerImpl", "reportRequestStats2", contextM7632d.getClassLoader(), zzj.zzb(Context.class, context), zzi.zza(jUptimeMillis), zzi.zza(SystemClock.uptimeMillis()));
                    } catch (Exception e8) {
                        Log.w("ProviderInstaller", "Failed to report request stats: ".concat(e8.toString()));
                    }
                }
                context2 = contextM7632d;
            }
            if (context2 != null) {
                m27216b(context2, context, "com.google.android.gms.common.security.ProviderInstallerImpl");
                return;
            } else {
                Log.e("ProviderInstaller", "Failed to get remote context");
                throw new C1842g(8);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m27216b(Context context, Context context2, String str) throws C1842g {
        try {
            if (f24093c == null) {
                f24093c = context.getClassLoader().loadClass(str).getMethod("insertProvider", Context.class);
            }
            f24093c.invoke(null, context);
        } catch (Exception e7) {
            Throwable cause = e7.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                Log.e("ProviderInstaller", "Failed to install provider: ".concat(String.valueOf(cause == null ? e7.toString() : cause.toString())));
            }
            throw new C1842g(8);
        }
    }
}
