package p192Z3;

import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.common.util.C3753h;
import com.google.android.gms.internal.p411firebaseauthapi.zze;
import p164V3.C1762g;
import p191Z2.C2086a;

/* JADX INFO: renamed from: Z3.q */
/* JADX INFO: loaded from: classes.dex */
public final class C2139q {

    /* JADX INFO: renamed from: h */
    private static C2086a f6981h = new C2086a("TokenRefresher", "FirebaseAuth:");

    /* JADX INFO: renamed from: a */
    private final C1762g f6982a;

    /* JADX INFO: renamed from: b */
    volatile long f6983b;

    /* JADX INFO: renamed from: c */
    volatile long f6984c;

    /* JADX INFO: renamed from: d */
    private long f6985d;

    /* JADX INFO: renamed from: e */
    private HandlerThread f6986e;

    /* JADX INFO: renamed from: f */
    private Handler f6987f;

    /* JADX INFO: renamed from: g */
    private Runnable f6988g;

    public C2139q(C1762g c1762g) {
        f6981h.m8619g("Initializing TokenRefresher", new Object[0]);
        C1762g c1762g2 = (C1762g) AbstractC3718s.m18083l(c1762g);
        this.f6982a = c1762g2;
        HandlerThread handlerThread = new HandlerThread("TokenRefresher", 10);
        this.f6986e = handlerThread;
        handlerThread.start();
        this.f6987f = new zze(this.f6986e.getLooper());
        this.f6988g = new RunnableC2142t(this, c1762g2.m7406o());
        this.f6985d = 300000L;
    }

    /* JADX INFO: renamed from: b */
    public final void m8745b() {
        this.f6987f.removeCallbacks(this.f6988g);
    }

    /* JADX INFO: renamed from: c */
    public final void m8746c() {
        f6981h.m8619g("Scheduling refresh for " + (this.f6983b - this.f6985d), new Object[0]);
        m8745b();
        this.f6984c = Math.max((this.f6983b - C3753h.m18171d().mo18159a()) - this.f6985d, 0L) / 1000;
        this.f6987f.postDelayed(this.f6988g, this.f6984c * 1000);
    }

    /* JADX INFO: renamed from: d */
    final void m8747d() {
        long j7;
        int i7 = (int) this.f6984c;
        if (i7 == 30 || i7 == 60 || i7 == 120 || i7 == 240 || i7 == 480) {
            j7 = 2 * this.f6984c;
        } else {
            j7 = i7 != 960 ? 30L : 960L;
        }
        this.f6984c = j7;
        this.f6983b = C3753h.m18171d().mo18159a() + (this.f6984c * 1000);
        f6981h.m8619g("Scheduling refresh for " + this.f6983b, new Object[0]);
        this.f6987f.postDelayed(this.f6988g, this.f6984c * 1000);
    }
}
