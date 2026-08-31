package p228d4;

import android.util.Log;

/* JADX INFO: renamed from: d4.g */
/* JADX INFO: loaded from: classes.dex */
public class C5235g {

    /* JADX INFO: renamed from: c */
    static final C5235g f19966c = new C5235g("FirebaseCrashlytics");

    /* JADX INFO: renamed from: a */
    private final String f19967a;

    /* JADX INFO: renamed from: b */
    private int f19968b = 4;

    public C5235g(String str) {
        this.f19967a = str;
    }

    /* JADX INFO: renamed from: a */
    private boolean m24178a(int i7) {
        return this.f19968b <= i7 || Log.isLoggable(this.f19967a, i7);
    }

    /* JADX INFO: renamed from: f */
    public static C5235g m24179f() {
        return f19966c;
    }

    /* JADX INFO: renamed from: b */
    public void m24180b(String str) {
        m24181c(str, null);
    }

    /* JADX INFO: renamed from: c */
    public void m24181c(String str, Throwable th) {
        if (m24178a(3)) {
            Log.d(this.f19967a, str, th);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m24182d(String str) {
        m24183e(str, null);
    }

    /* JADX INFO: renamed from: e */
    public void m24183e(String str, Throwable th) {
        if (m24178a(6)) {
            Log.e(this.f19967a, str, th);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m24184g(String str) {
        m24185h(str, null);
    }

    /* JADX INFO: renamed from: h */
    public void m24185h(String str, Throwable th) {
        if (m24178a(4)) {
            Log.i(this.f19967a, str, th);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m24186i(String str) {
        m24187j(str, null);
    }

    /* JADX INFO: renamed from: j */
    public void m24187j(String str, Throwable th) {
        if (m24178a(2)) {
            Log.v(this.f19967a, str, th);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m24188k(String str) {
        m24189l(str, null);
    }

    /* JADX INFO: renamed from: l */
    public void m24189l(String str, Throwable th) {
        if (m24178a(5)) {
            Log.w(this.f19967a, str, th);
        }
    }
}
