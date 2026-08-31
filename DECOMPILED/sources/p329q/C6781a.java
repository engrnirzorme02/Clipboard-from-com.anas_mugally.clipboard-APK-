package p329q;

import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
import android.os.Build;
import p049G.C0466a;

/* JADX INFO: renamed from: q.a */
/* JADX INFO: loaded from: classes.dex */
class C6781a {

    /* JADX INFO: renamed from: a */
    private BiometricPrompt$AuthenticationCallback f27241a;

    /* JADX INFO: renamed from: b */
    private C0466a.c f27242b;

    /* JADX INFO: renamed from: c */
    final d f27243c;

    /* JADX INFO: renamed from: q.a$a */
    class a extends C0466a.c {
        a() {
        }

        @Override // p049G.C0466a.c
        /* JADX INFO: renamed from: a */
        public void mo2021a(int i7, CharSequence charSequence) {
            C6781a.this.f27243c.mo29628a(i7, charSequence);
        }

        @Override // p049G.C0466a.c
        /* JADX INFO: renamed from: b */
        public void mo2022b() {
            C6781a.this.f27243c.mo29629b();
        }

        @Override // p049G.C0466a.c
        /* JADX INFO: renamed from: c */
        public void mo2023c(int i7, CharSequence charSequence) {
            C6781a.this.f27243c.mo29630c(charSequence);
        }

        @Override // p049G.C0466a.c
        /* JADX INFO: renamed from: d */
        public void mo2024d(C0466a.d dVar) {
            C6781a.this.f27243c.mo29631d(new C6786f.b(dVar != null ? AbstractC6789i.m29795c(dVar.m2025a()) : null, 2));
        }
    }

    /* JADX INFO: renamed from: q.a$b */
    private static class b {

        /* JADX INFO: renamed from: q.a$b$a */
        class a extends BiometricPrompt$AuthenticationCallback {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ d f27245a;

            a(d dVar) {
                this.f27245a = dVar;
            }

            public void onAuthenticationError(int i7, CharSequence charSequence) {
                this.f27245a.mo29628a(i7, charSequence);
            }

            public void onAuthenticationFailed() {
                this.f27245a.mo29629b();
            }

            public void onAuthenticationHelp(int i7, CharSequence charSequence) {
            }

            public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
                C6786f.c cVarM29794b = authenticationResult != null ? AbstractC6789i.m29794b(authenticationResult.getCryptoObject()) : null;
                int i7 = Build.VERSION.SDK_INT;
                int iM29627a = -1;
                if (i7 >= 30) {
                    if (authenticationResult != null) {
                        iM29627a = c.m29627a(authenticationResult);
                    }
                } else if (i7 != 29) {
                    iM29627a = 2;
                }
                this.f27245a.mo29631d(new C6786f.b(cVarM29794b, iM29627a));
            }
        }

        /* JADX INFO: renamed from: a */
        static BiometricPrompt$AuthenticationCallback m29626a(d dVar) {
            return new a(dVar);
        }
    }

    /* JADX INFO: renamed from: q.a$c */
    private static class c {
        /* JADX INFO: renamed from: a */
        static int m29627a(BiometricPrompt.AuthenticationResult authenticationResult) {
            return authenticationResult.getAuthenticationType();
        }
    }

    /* JADX INFO: renamed from: q.a$d */
    static class d {
        d() {
        }

        /* JADX INFO: renamed from: a */
        abstract void mo29628a(int i7, CharSequence charSequence);

        /* JADX INFO: renamed from: b */
        abstract void mo29629b();

        /* JADX INFO: renamed from: c */
        abstract void mo29630c(CharSequence charSequence);

        /* JADX INFO: renamed from: d */
        abstract void mo29631d(C6786f.b bVar);
    }

    C6781a(d dVar) {
        this.f27243c = dVar;
    }

    /* JADX INFO: renamed from: a */
    BiometricPrompt$AuthenticationCallback m29624a() {
        if (this.f27241a == null) {
            this.f27241a = b.m29626a(this.f27243c);
        }
        return this.f27241a;
    }

    /* JADX INFO: renamed from: b */
    C0466a.c m29625b() {
        if (this.f27242b == null) {
            this.f27242b = new a();
        }
        return this.f27242b;
    }
}
