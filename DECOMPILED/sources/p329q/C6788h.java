package p329q;

import android.os.CancellationSignal;
import android.util.Log;
import p081K.C0713e;

/* JADX INFO: renamed from: q.h */
/* JADX INFO: loaded from: classes.dex */
class C6788h {

    /* JADX INFO: renamed from: a */
    private final c f27323a = new a();

    /* JADX INFO: renamed from: b */
    private CancellationSignal f27324b;

    /* JADX INFO: renamed from: c */
    private C0713e f27325c;

    /* JADX INFO: renamed from: q.h$a */
    class a implements c {
        a() {
        }

        @Override // p329q.C6788h.c
        /* JADX INFO: renamed from: a */
        public C0713e mo29789a() {
            return new C0713e();
        }

        @Override // p329q.C6788h.c
        /* JADX INFO: renamed from: b */
        public CancellationSignal mo29790b() {
            return b.m29792b();
        }
    }

    /* JADX INFO: renamed from: q.h$b */
    private static class b {
        /* JADX INFO: renamed from: a */
        static void m29791a(CancellationSignal cancellationSignal) {
            cancellationSignal.cancel();
        }

        /* JADX INFO: renamed from: b */
        static CancellationSignal m29792b() {
            return new CancellationSignal();
        }
    }

    /* JADX INFO: renamed from: q.h$c */
    interface c {
        /* JADX INFO: renamed from: a */
        C0713e mo29789a();

        /* JADX INFO: renamed from: b */
        CancellationSignal mo29790b();
    }

    C6788h() {
    }

    /* JADX INFO: renamed from: a */
    void m29786a() {
        CancellationSignal cancellationSignal = this.f27324b;
        if (cancellationSignal != null) {
            try {
                b.m29791a(cancellationSignal);
            } catch (NullPointerException e7) {
                Log.e("CancelSignalProvider", "Got NPE while canceling biometric authentication.", e7);
            }
            this.f27324b = null;
        }
        C0713e c0713e = this.f27325c;
        if (c0713e != null) {
            try {
                c0713e.m3460a();
            } catch (NullPointerException e8) {
                Log.e("CancelSignalProvider", "Got NPE while canceling fingerprint authentication.", e8);
            }
            this.f27325c = null;
        }
    }

    /* JADX INFO: renamed from: b */
    CancellationSignal m29787b() {
        if (this.f27324b == null) {
            this.f27324b = this.f27323a.mo29790b();
        }
        return this.f27324b;
    }

    /* JADX INFO: renamed from: c */
    C0713e m29788c() {
        if (this.f27325c == null) {
            this.f27325c = this.f27323a.mo29789a();
        }
        return this.f27325c;
    }
}
