package p049G;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.CancellationSignal;
import android.os.Handler;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import p081K.C0713e;

/* JADX INFO: renamed from: G.a */
/* JADX INFO: loaded from: classes.dex */
public class C0466a {

    /* JADX INFO: renamed from: a */
    private final Context f1758a;

    /* JADX INFO: renamed from: G.a$a */
    class a extends FingerprintManager.AuthenticationCallback {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ c f1759a;

        a(c cVar) {
            this.f1759a = cVar;
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationError(int i7, CharSequence charSequence) {
            this.f1759a.mo2021a(i7, charSequence);
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationFailed() {
            this.f1759a.mo2022b();
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationHelp(int i7, CharSequence charSequence) {
            this.f1759a.mo2023c(i7, charSequence);
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
            this.f1759a.mo2024d(new d(C0466a.m2007g(b.m2015b(authenticationResult))));
        }
    }

    /* JADX INFO: renamed from: G.a$b */
    static class b {
        /* JADX INFO: renamed from: a */
        static void m2014a(Object obj, Object obj2, CancellationSignal cancellationSignal, int i7, Object obj3, Handler handler) {
            ((FingerprintManager) obj).authenticate((FingerprintManager.CryptoObject) obj2, cancellationSignal, i7, (FingerprintManager.AuthenticationCallback) obj3, handler);
        }

        /* JADX INFO: renamed from: b */
        static FingerprintManager.CryptoObject m2015b(Object obj) {
            return ((FingerprintManager.AuthenticationResult) obj).getCryptoObject();
        }

        /* JADX INFO: renamed from: c */
        public static FingerprintManager m2016c(Context context) {
            if (context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
                return (FingerprintManager) context.getSystemService(FingerprintManager.class);
            }
            return null;
        }

        /* JADX INFO: renamed from: d */
        static boolean m2017d(Object obj) {
            return ((FingerprintManager) obj).hasEnrolledFingerprints();
        }

        /* JADX INFO: renamed from: e */
        static boolean m2018e(Object obj) {
            return ((FingerprintManager) obj).isHardwareDetected();
        }

        /* JADX INFO: renamed from: f */
        public static e m2019f(Object obj) {
            FingerprintManager.CryptoObject cryptoObject = (FingerprintManager.CryptoObject) obj;
            if (cryptoObject == null) {
                return null;
            }
            if (cryptoObject.getCipher() != null) {
                return new e(cryptoObject.getCipher());
            }
            if (cryptoObject.getSignature() != null) {
                return new e(cryptoObject.getSignature());
            }
            if (cryptoObject.getMac() != null) {
                return new e(cryptoObject.getMac());
            }
            return null;
        }

        /* JADX INFO: renamed from: g */
        public static FingerprintManager.CryptoObject m2020g(e eVar) {
            if (eVar == null) {
                return null;
            }
            if (eVar.m2026a() != null) {
                return new FingerprintManager.CryptoObject(eVar.m2026a());
            }
            if (eVar.m2028c() != null) {
                return new FingerprintManager.CryptoObject(eVar.m2028c());
            }
            if (eVar.m2027b() != null) {
                return new FingerprintManager.CryptoObject(eVar.m2027b());
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: G.a$c */
    public static abstract class c {
        /* JADX INFO: renamed from: a */
        public abstract void mo2021a(int i7, CharSequence charSequence);

        /* JADX INFO: renamed from: b */
        public abstract void mo2022b();

        /* JADX INFO: renamed from: c */
        public abstract void mo2023c(int i7, CharSequence charSequence);

        /* JADX INFO: renamed from: d */
        public abstract void mo2024d(d dVar);
    }

    /* JADX INFO: renamed from: G.a$d */
    public static final class d {

        /* JADX INFO: renamed from: a */
        private final e f1760a;

        public d(e eVar) {
            this.f1760a = eVar;
        }

        /* JADX INFO: renamed from: a */
        public e m2025a() {
            return this.f1760a;
        }
    }

    private C0466a(Context context) {
        this.f1758a = context;
    }

    /* JADX INFO: renamed from: c */
    public static C0466a m2005c(Context context) {
        return new C0466a(context);
    }

    /* JADX INFO: renamed from: d */
    private static FingerprintManager m2006d(Context context) {
        return b.m2016c(context);
    }

    /* JADX INFO: renamed from: g */
    static e m2007g(FingerprintManager.CryptoObject cryptoObject) {
        return b.m2019f(cryptoObject);
    }

    /* JADX INFO: renamed from: h */
    private static FingerprintManager.AuthenticationCallback m2008h(c cVar) {
        return new a(cVar);
    }

    /* JADX INFO: renamed from: i */
    private static FingerprintManager.CryptoObject m2009i(e eVar) {
        return b.m2020g(eVar);
    }

    /* JADX INFO: renamed from: a */
    public void m2010a(e eVar, int i7, C0713e c0713e, c cVar, Handler handler) {
        m2011b(eVar, i7, c0713e != null ? (CancellationSignal) c0713e.m3461b() : null, cVar, handler);
    }

    /* JADX INFO: renamed from: b */
    public void m2011b(e eVar, int i7, CancellationSignal cancellationSignal, c cVar, Handler handler) {
        FingerprintManager fingerprintManagerM2006d = m2006d(this.f1758a);
        if (fingerprintManagerM2006d != null) {
            b.m2014a(fingerprintManagerM2006d, m2009i(eVar), cancellationSignal, i7, m2008h(cVar), handler);
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean m2012e() {
        FingerprintManager fingerprintManagerM2006d = m2006d(this.f1758a);
        return fingerprintManagerM2006d != null && b.m2017d(fingerprintManagerM2006d);
    }

    /* JADX INFO: renamed from: f */
    public boolean m2013f() {
        FingerprintManager fingerprintManagerM2006d = m2006d(this.f1758a);
        return fingerprintManagerM2006d != null && b.m2018e(fingerprintManagerM2006d);
    }

    /* JADX INFO: renamed from: G.a$e */
    public static class e {

        /* JADX INFO: renamed from: a */
        private final Signature f1761a;

        /* JADX INFO: renamed from: b */
        private final Cipher f1762b;

        /* JADX INFO: renamed from: c */
        private final Mac f1763c;

        public e(Signature signature) {
            this.f1761a = signature;
            this.f1762b = null;
            this.f1763c = null;
        }

        /* JADX INFO: renamed from: a */
        public Cipher m2026a() {
            return this.f1762b;
        }

        /* JADX INFO: renamed from: b */
        public Mac m2027b() {
            return this.f1763c;
        }

        /* JADX INFO: renamed from: c */
        public Signature m2028c() {
            return this.f1761a;
        }

        public e(Cipher cipher) {
            this.f1762b = cipher;
            this.f1761a = null;
            this.f1763c = null;
        }

        public e(Mac mac) {
            this.f1763c = mac;
            this.f1762b = null;
            this.f1761a = null;
        }
    }
}
