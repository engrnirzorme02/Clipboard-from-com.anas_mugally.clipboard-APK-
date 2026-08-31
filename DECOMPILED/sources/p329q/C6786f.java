package p329q;

import android.os.Build;
import android.security.identity.IdentityCredential;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.AbstractActivityC2592j;
import androidx.fragment.app.AbstractC2599q;
import androidx.lifecycle.C2635a0;
import java.security.Signature;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* JADX INFO: renamed from: q.f */
/* JADX INFO: loaded from: classes.dex */
public class C6786f {

    /* JADX INFO: renamed from: a */
    private AbstractC2599q f27274a;

    /* JADX INFO: renamed from: q.f$a */
    public static abstract class a {
        /* JADX INFO: renamed from: a */
        public void mo29715a(int i7, CharSequence charSequence) {
        }

        /* JADX INFO: renamed from: b */
        public void mo29716b() {
        }

        /* JADX INFO: renamed from: c */
        public void mo29717c(b bVar) {
        }
    }

    /* JADX INFO: renamed from: q.f$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        private final c f27275a;

        /* JADX INFO: renamed from: b */
        private final int f27276b;

        b(c cVar, int i7) {
            this.f27275a = cVar;
            this.f27276b = i7;
        }

        /* JADX INFO: renamed from: a */
        public int m29718a() {
            return this.f27276b;
        }

        /* JADX INFO: renamed from: b */
        public c m29719b() {
            return this.f27275a;
        }
    }

    /* JADX INFO: renamed from: q.f$d */
    public static class d {

        /* JADX INFO: renamed from: a */
        private final CharSequence f27281a;

        /* JADX INFO: renamed from: b */
        private final CharSequence f27282b;

        /* JADX INFO: renamed from: c */
        private final CharSequence f27283c;

        /* JADX INFO: renamed from: d */
        private final CharSequence f27284d;

        /* JADX INFO: renamed from: e */
        private final boolean f27285e;

        /* JADX INFO: renamed from: f */
        private final boolean f27286f;

        /* JADX INFO: renamed from: g */
        private final int f27287g;

        /* JADX INFO: renamed from: q.f$d$a */
        public static class a {

            /* JADX INFO: renamed from: a */
            private CharSequence f27288a = null;

            /* JADX INFO: renamed from: b */
            private CharSequence f27289b = null;

            /* JADX INFO: renamed from: c */
            private CharSequence f27290c = null;

            /* JADX INFO: renamed from: d */
            private CharSequence f27291d = null;

            /* JADX INFO: renamed from: e */
            private boolean f27292e = true;

            /* JADX INFO: renamed from: f */
            private boolean f27293f = false;

            /* JADX INFO: renamed from: g */
            private int f27294g = 0;

            /* JADX INFO: renamed from: a */
            public d m29731a() {
                if (TextUtils.isEmpty(this.f27288a)) {
                    throw new IllegalArgumentException("Title must be set and non-empty.");
                }
                if (!AbstractC6782b.m29636e(this.f27294g)) {
                    throw new IllegalArgumentException("Authenticator combination is unsupported on API " + Build.VERSION.SDK_INT + ": " + AbstractC6782b.m29632a(this.f27294g));
                }
                int i7 = this.f27294g;
                boolean zM29634c = i7 != 0 ? AbstractC6782b.m29634c(i7) : this.f27293f;
                if (TextUtils.isEmpty(this.f27291d) && !zM29634c) {
                    throw new IllegalArgumentException("Negative text must be set and non-empty.");
                }
                if (TextUtils.isEmpty(this.f27291d) || !zM29634c) {
                    return new d(this.f27288a, this.f27289b, this.f27290c, this.f27291d, this.f27292e, this.f27293f, this.f27294g);
                }
                throw new IllegalArgumentException("Negative text must not be set if device credential authentication is allowed.");
            }

            /* JADX INFO: renamed from: b */
            public a m29732b(CharSequence charSequence) {
                this.f27291d = charSequence;
                return this;
            }

            /* JADX INFO: renamed from: c */
            public a m29733c(CharSequence charSequence) {
                this.f27289b = charSequence;
                return this;
            }

            /* JADX INFO: renamed from: d */
            public a m29734d(CharSequence charSequence) {
                this.f27288a = charSequence;
                return this;
            }
        }

        d(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, boolean z7, boolean z8, int i7) {
            this.f27281a = charSequence;
            this.f27282b = charSequence2;
            this.f27283c = charSequence3;
            this.f27284d = charSequence4;
            this.f27285e = z7;
            this.f27286f = z8;
            this.f27287g = i7;
        }

        /* JADX INFO: renamed from: a */
        public int m29724a() {
            return this.f27287g;
        }

        /* JADX INFO: renamed from: b */
        public CharSequence m29725b() {
            return this.f27283c;
        }

        /* JADX INFO: renamed from: c */
        public CharSequence m29726c() {
            CharSequence charSequence = this.f27284d;
            return charSequence != null ? charSequence : "";
        }

        /* JADX INFO: renamed from: d */
        public CharSequence m29727d() {
            return this.f27282b;
        }

        /* JADX INFO: renamed from: e */
        public CharSequence m29728e() {
            return this.f27281a;
        }

        /* JADX INFO: renamed from: f */
        public boolean m29729f() {
            return this.f27285e;
        }

        /* JADX INFO: renamed from: g */
        public boolean m29730g() {
            return this.f27286f;
        }
    }

    public C6786f(AbstractActivityC2592j abstractActivityC2592j, Executor executor, a aVar) {
        if (abstractActivityC2592j == null) {
            throw new IllegalArgumentException("FragmentActivity must not be null.");
        }
        if (executor == null) {
            throw new IllegalArgumentException("Executor must not be null.");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("AuthenticationCallback must not be null.");
        }
        m29713f(abstractActivityC2592j.m12232H0(), m29712e(abstractActivityC2592j), executor, aVar);
    }

    /* JADX INFO: renamed from: b */
    private void m29709b(d dVar, c cVar) {
        AbstractC2599q abstractC2599q = this.f27274a;
        if (abstractC2599q == null) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
        } else if (abstractC2599q.m12352P0()) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Called after onSaveInstanceState().");
        } else {
            m29711d(this.f27274a).m29660Q1(dVar, cVar);
        }
    }

    /* JADX INFO: renamed from: c */
    private static C6784d m29710c(AbstractC2599q abstractC2599q) {
        return (C6784d) abstractC2599q.m12379h0("androidx.biometric.BiometricFragment");
    }

    /* JADX INFO: renamed from: d */
    private static C6784d m29711d(AbstractC2599q abstractC2599q) {
        C6784d c6784dM29710c = m29710c(abstractC2599q);
        if (c6784dM29710c != null) {
            return c6784dM29710c;
        }
        C6784d c6784dM29652g2 = C6784d.m29652g2();
        abstractC2599q.m12391n().m12507d(c6784dM29652g2, "androidx.biometric.BiometricFragment").mo12017h();
        abstractC2599q.m12372d0();
        return c6784dM29652g2;
    }

    /* JADX INFO: renamed from: e */
    private static C6787g m29712e(AbstractActivityC2592j abstractActivityC2592j) {
        if (abstractActivityC2592j != null) {
            return (C6787g) new C2635a0(abstractActivityC2592j).m12591a(C6787g.class);
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    private void m29713f(AbstractC2599q abstractC2599q, C6787g c6787g, Executor executor, a aVar) {
        this.f27274a = abstractC2599q;
        if (c6787g != null) {
            if (executor != null) {
                c6787g.m29750O(executor);
            }
            c6787g.m29749N(aVar);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m29714a(d dVar) {
        if (dVar == null) {
            throw new IllegalArgumentException("PromptInfo cannot be null.");
        }
        m29709b(dVar, null);
    }

    /* JADX INFO: renamed from: q.f$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        private final Signature f27277a;

        /* JADX INFO: renamed from: b */
        private final Cipher f27278b;

        /* JADX INFO: renamed from: c */
        private final Mac f27279c;

        /* JADX INFO: renamed from: d */
        private final IdentityCredential f27280d;

        public c(Signature signature) {
            this.f27277a = signature;
            this.f27278b = null;
            this.f27279c = null;
            this.f27280d = null;
        }

        /* JADX INFO: renamed from: a */
        public Cipher m29720a() {
            return this.f27278b;
        }

        /* JADX INFO: renamed from: b */
        public IdentityCredential m29721b() {
            return this.f27280d;
        }

        /* JADX INFO: renamed from: c */
        public Mac m29722c() {
            return this.f27279c;
        }

        /* JADX INFO: renamed from: d */
        public Signature m29723d() {
            return this.f27277a;
        }

        public c(Cipher cipher) {
            this.f27277a = null;
            this.f27278b = cipher;
            this.f27279c = null;
            this.f27280d = null;
        }

        public c(Mac mac) {
            this.f27277a = null;
            this.f27278b = null;
            this.f27279c = mac;
            this.f27280d = null;
        }

        public c(IdentityCredential identityCredential) {
            this.f27277a = null;
            this.f27278b = null;
            this.f27279c = null;
            this.f27280d = identityCredential;
        }
    }
}
