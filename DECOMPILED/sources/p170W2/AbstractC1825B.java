package p170W2;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractBinderC3683a0;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.common.internal.InterfaceC3685b0;
import com.google.android.gms.common.util.AbstractC3746a;
import com.google.android.gms.common.util.AbstractC3755j;
import com.google.android.gms.dynamic.BinderC3773b;
import com.google.android.gms.dynamite.DynamiteModule;
import java.security.MessageDigest;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: W2.B */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1825B {

    /* JADX INFO: renamed from: e */
    private static volatile InterfaceC3685b0 f5947e;

    /* JADX INFO: renamed from: g */
    private static Context f5949g;

    /* JADX INFO: renamed from: a */
    static final AbstractBinderC1861z f5943a = new BinderC1855t(AbstractBinderC1859x.m7652M0("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));

    /* JADX INFO: renamed from: b */
    static final AbstractBinderC1861z f5944b = new BinderC1856u(AbstractBinderC1859x.m7652M0("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));

    /* JADX INFO: renamed from: c */
    static final AbstractBinderC1861z f5945c = new BinderC1857v(AbstractBinderC1859x.m7652M0("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));

    /* JADX INFO: renamed from: d */
    static final AbstractBinderC1861z f5946d = new BinderC1858w(AbstractBinderC1859x.m7652M0("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));

    /* JADX INFO: renamed from: f */
    private static final Object f5948f = new Object();

    /* JADX INFO: renamed from: a */
    static C1834K m7575a(String str, AbstractBinderC1859x abstractBinderC1859x, boolean z7, boolean z8) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return m7580f(str, abstractBinderC1859x, z7, z8);
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    /* JADX INFO: renamed from: b */
    static C1834K m7576b(String str, boolean z7, boolean z8, boolean z9) {
        return m7581g(str, z7, false, false, true);
    }

    /* JADX INFO: renamed from: c */
    static /* synthetic */ String m7577c(boolean z7, String str, AbstractBinderC1859x abstractBinderC1859x) {
        String str2 = (z7 || !m7580f(str, abstractBinderC1859x, true, false).f5966a) ? "not allowed" : "debug cert rejected";
        MessageDigest messageDigestM18143b = AbstractC3746a.m18143b("SHA-256");
        AbstractC3718s.m18083l(messageDigestM18143b);
        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", str2, str, AbstractC3755j.m18182a(messageDigestM18143b.digest(abstractBinderC1859x.mo7653N0())), Boolean.valueOf(z7), "12451000.false");
    }

    /* JADX INFO: renamed from: d */
    static synchronized void m7578d(Context context) {
        if (f5949g != null) {
            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
        } else if (context != null) {
            f5949g = context.getApplicationContext();
        }
    }

    /* JADX INFO: renamed from: e */
    static boolean m7579e() {
        boolean zZzi;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                m7582h();
                zZzi = f5947e.zzi();
            } finally {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            }
        } catch (RemoteException | DynamiteModule.C3776a e7) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e7);
            zZzi = false;
        }
        return zZzi;
    }

    /* JADX INFO: renamed from: f */
    private static C1834K m7580f(final String str, final AbstractBinderC1859x abstractBinderC1859x, final boolean z7, boolean z8) {
        try {
            m7582h();
            AbstractC3718s.m18083l(f5949g);
            try {
                return f5947e.mo17996f0(new C1830G(str, abstractBinderC1859x, z7, z8), BinderC3773b.m18221N0(f5949g.getPackageManager())) ? C1834K.m7587b() : new C1832I(new Callable() { // from class: W2.s
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return AbstractC1825B.m7577c(z7, str, abstractBinderC1859x);
                    }
                }, null);
            } catch (RemoteException e7) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e7);
                return C1834K.m7589d("module call", e7);
            }
        } catch (DynamiteModule.C3776a e8) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e8);
            return C1834K.m7589d("module init: ".concat(String.valueOf(e8.getMessage())), e8);
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [android.os.IBinder, com.google.android.gms.dynamic.a] */
    /* JADX INFO: renamed from: g */
    private static C1834K m7581g(String str, boolean z7, boolean z8, boolean z9, boolean z10) {
        C1834K c1834kM7589d;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            AbstractC3718s.m18083l(f5949g);
            try {
                m7582h();
                C1826C c1826c = new C1826C(str, z7, false, BinderC3773b.m18221N0(f5949g), false, true);
                try {
                    C1828E c1828eMo17997n0 = z10 ? f5947e.mo17997n0(c1826c) : f5947e.mo17995C(c1826c);
                    if (c1828eMo17997n0.m7583T()) {
                        c1834kM7589d = C1834K.m7590f(c1828eMo17997n0.m7584U());
                    } else {
                        String strZza = c1828eMo17997n0.zza();
                        PackageManager.NameNotFoundException nameNotFoundException = c1828eMo17997n0.m7585V() == 4 ? new PackageManager.NameNotFoundException() : null;
                        if (strZza == null) {
                            strZza = "error checking package certificate";
                        }
                        c1834kM7589d = C1834K.m7591g(c1828eMo17997n0.m7584U(), c1828eMo17997n0.m7585V(), strZza, nameNotFoundException);
                    }
                } catch (RemoteException e7) {
                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e7);
                    c1834kM7589d = C1834K.m7589d("module call", e7);
                }
            } catch (DynamiteModule.C3776a e8) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e8);
                c1834kM7589d = C1834K.m7589d("module init: ".concat(String.valueOf(e8.getMessage())), e8);
            }
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            return c1834kM7589d;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th;
        }
    }

    /* JADX INFO: renamed from: h */
    private static void m7582h() {
        if (f5947e != null) {
            return;
        }
        AbstractC3718s.m18083l(f5949g);
        synchronized (f5948f) {
            try {
                if (f5947e == null) {
                    f5947e = AbstractBinderC3683a0.m17999L0(DynamiteModule.m18224e(f5949g, DynamiteModule.f14927f, "com.google.android.gms.googlecertificates").m18233d("com.google.android.gms.common.GoogleCertificatesImpl"));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
