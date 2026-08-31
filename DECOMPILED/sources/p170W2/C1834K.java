package p170W2;

import android.util.Log;

/* JADX INFO: renamed from: W2.K */
/* JADX INFO: loaded from: classes.dex */
class C1834K {

    /* JADX INFO: renamed from: e */
    private static final C1834K f5965e = new C1834K(true, 3, 1, null, null);

    /* JADX INFO: renamed from: a */
    final boolean f5966a;

    /* JADX INFO: renamed from: b */
    final String f5967b;

    /* JADX INFO: renamed from: c */
    final Throwable f5968c;

    /* JADX INFO: renamed from: d */
    final int f5969d;

    private C1834K(boolean z7, int i7, int i8, String str, Throwable th) {
        this.f5966a = z7;
        this.f5969d = i7;
        this.f5967b = str;
        this.f5968c = th;
    }

    /* JADX INFO: renamed from: b */
    static C1834K m7587b() {
        return f5965e;
    }

    /* JADX INFO: renamed from: c */
    static C1834K m7588c(String str) {
        return new C1834K(false, 1, 5, str, null);
    }

    /* JADX INFO: renamed from: d */
    static C1834K m7589d(String str, Throwable th) {
        return new C1834K(false, 1, 5, str, th);
    }

    /* JADX INFO: renamed from: f */
    static C1834K m7590f(int i7) {
        return new C1834K(true, i7, 1, null, null);
    }

    /* JADX INFO: renamed from: g */
    static C1834K m7591g(int i7, int i8, String str, Throwable th) {
        return new C1834K(false, i7, i8, str, th);
    }

    /* JADX INFO: renamed from: a */
    String mo7586a() {
        return this.f5967b;
    }

    /* JADX INFO: renamed from: e */
    final void m7592e() {
        if (this.f5966a || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        if (this.f5968c != null) {
            Log.d("GoogleCertificatesRslt", mo7586a(), this.f5968c);
        } else {
            Log.d("GoogleCertificatesRslt", mo7586a());
        }
    }
}
