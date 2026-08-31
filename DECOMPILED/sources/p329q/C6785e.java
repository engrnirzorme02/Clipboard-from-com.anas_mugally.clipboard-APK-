package p329q;

import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p049G.C0466a;

/* JADX INFO: renamed from: q.e */
/* JADX INFO: loaded from: classes.dex */
public class C6785e {

    /* JADX INFO: renamed from: a */
    private final d f27270a;

    /* JADX INFO: renamed from: b */
    private final BiometricManager f27271b;

    /* JADX INFO: renamed from: c */
    private final C0466a f27272c;

    /* JADX INFO: renamed from: q.e$a */
    private static class a {
        /* JADX INFO: renamed from: a */
        static int m29699a(BiometricManager biometricManager) {
            return biometricManager.canAuthenticate();
        }

        /* JADX INFO: renamed from: b */
        static BiometricManager m29700b(Context context) {
            return (BiometricManager) context.getSystemService(BiometricManager.class);
        }

        /* JADX INFO: renamed from: c */
        static Method m29701c() {
            try {
                return BiometricManager.class.getMethod("canAuthenticate", BiometricPrompt.CryptoObject.class);
            } catch (NoSuchMethodException unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: q.e$b */
    private static class b {
        /* JADX INFO: renamed from: a */
        static int m29702a(BiometricManager biometricManager, int i7) {
            return biometricManager.canAuthenticate(i7);
        }
    }

    /* JADX INFO: renamed from: q.e$c */
    private static class c implements d {

        /* JADX INFO: renamed from: a */
        private final Context f27273a;

        c(Context context) {
            this.f27273a = context.getApplicationContext();
        }

        @Override // p329q.C6785e.d
        /* JADX INFO: renamed from: a */
        public BiometricManager mo29703a() {
            return a.m29700b(this.f27273a);
        }

        @Override // p329q.C6785e.d
        /* JADX INFO: renamed from: b */
        public boolean mo29704b() {
            return AbstractC6793m.m29834a(this.f27273a) != null;
        }

        @Override // p329q.C6785e.d
        /* JADX INFO: renamed from: c */
        public boolean mo29705c() {
            return AbstractC6794n.m29838a(this.f27273a);
        }

        @Override // p329q.C6785e.d
        /* JADX INFO: renamed from: d */
        public boolean mo29706d() {
            return AbstractC6793m.m29835b(this.f27273a);
        }

        @Override // p329q.C6785e.d
        /* JADX INFO: renamed from: e */
        public boolean mo29707e() {
            return AbstractC6790j.m29811a(this.f27273a, Build.MODEL);
        }

        @Override // p329q.C6785e.d
        /* JADX INFO: renamed from: f */
        public C0466a mo29708f() {
            return C0466a.m2005c(this.f27273a);
        }
    }

    /* JADX INFO: renamed from: q.e$d */
    interface d {
        /* JADX INFO: renamed from: a */
        BiometricManager mo29703a();

        /* JADX INFO: renamed from: b */
        boolean mo29704b();

        /* JADX INFO: renamed from: c */
        boolean mo29705c();

        /* JADX INFO: renamed from: d */
        boolean mo29706d();

        /* JADX INFO: renamed from: e */
        boolean mo29707e();

        /* JADX INFO: renamed from: f */
        C0466a mo29708f();
    }

    C6785e(d dVar) {
        this.f27270a = dVar;
        int i7 = Build.VERSION.SDK_INT;
        this.f27271b = i7 >= 29 ? dVar.mo29703a() : null;
        this.f27272c = i7 <= 29 ? dVar.mo29708f() : null;
    }

    /* JADX INFO: renamed from: b */
    private int m29692b(int i7) {
        if (!AbstractC6782b.m29636e(i7)) {
            return -2;
        }
        if (i7 == 0 || !this.f27270a.mo29704b()) {
            return 12;
        }
        if (AbstractC6782b.m29634c(i7)) {
            return this.f27270a.mo29706d() ? 0 : 11;
        }
        int i8 = Build.VERSION.SDK_INT;
        if (i8 == 29) {
            return AbstractC6782b.m29637f(i7) ? m29696f() : m29695e();
        }
        if (i8 != 28) {
            return m29693c();
        }
        if (this.f27270a.mo29705c()) {
            return m29694d();
        }
        return 12;
    }

    /* JADX INFO: renamed from: c */
    private int m29693c() {
        C0466a c0466a = this.f27272c;
        if (c0466a == null) {
            Log.e("BiometricManager", "Failure in canAuthenticate(). FingerprintManager was null.");
            return 1;
        }
        if (c0466a.m2013f()) {
            return !this.f27272c.m2012e() ? 11 : 0;
        }
        return 12;
    }

    /* JADX INFO: renamed from: d */
    private int m29694d() {
        if (this.f27270a.mo29706d()) {
            return m29693c() == 0 ? 0 : -1;
        }
        return m29693c();
    }

    /* JADX INFO: renamed from: e */
    private int m29695e() {
        BiometricPrompt.CryptoObject cryptoObjectM29796d;
        Method methodM29701c = a.m29701c();
        if (methodM29701c != null && (cryptoObjectM29796d = AbstractC6789i.m29796d(AbstractC6789i.m29793a())) != null) {
            try {
                Object objInvoke = methodM29701c.invoke(this.f27271b, cryptoObjectM29796d);
                if (objInvoke instanceof Integer) {
                    return ((Integer) objInvoke).intValue();
                }
                Log.w("BiometricManager", "Invalid return type for canAuthenticate(CryptoObject).");
            } catch (IllegalAccessException e7) {
                e = e7;
                Log.w("BiometricManager", "Failed to invoke canAuthenticate(CryptoObject).", e);
            } catch (IllegalArgumentException e8) {
                e = e8;
                Log.w("BiometricManager", "Failed to invoke canAuthenticate(CryptoObject).", e);
            } catch (InvocationTargetException e9) {
                e = e9;
                Log.w("BiometricManager", "Failed to invoke canAuthenticate(CryptoObject).", e);
            }
        }
        int iM29696f = m29696f();
        return (this.f27270a.mo29707e() || iM29696f != 0) ? iM29696f : m29694d();
    }

    /* JADX INFO: renamed from: f */
    private int m29696f() {
        BiometricManager biometricManager = this.f27271b;
        if (biometricManager != null) {
            return a.m29699a(biometricManager);
        }
        Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
        return 1;
    }

    /* JADX INFO: renamed from: g */
    public static C6785e m29697g(Context context) {
        return new C6785e(new c(context));
    }

    /* JADX INFO: renamed from: a */
    public int m29698a(int i7) {
        if (Build.VERSION.SDK_INT < 30) {
            return m29692b(i7);
        }
        BiometricManager biometricManager = this.f27271b;
        if (biometricManager != null) {
            return b.m29702a(biometricManager, i7);
        }
        Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
        return 1;
    }
}
