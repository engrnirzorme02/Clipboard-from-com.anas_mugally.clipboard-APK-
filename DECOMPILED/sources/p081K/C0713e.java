package p081K;

import android.os.CancellationSignal;

/* JADX INFO: renamed from: K.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0713e {

    /* JADX INFO: renamed from: a */
    private boolean f2883a;

    /* JADX INFO: renamed from: b */
    private a f2884b;

    /* JADX INFO: renamed from: c */
    private Object f2885c;

    /* JADX INFO: renamed from: d */
    private boolean f2886d;

    /* JADX INFO: renamed from: K.e$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo3463a();
    }

    /* JADX INFO: renamed from: d */
    private void m3459d() {
        while (this.f2886d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m3460a() {
        synchronized (this) {
            try {
                if (this.f2883a) {
                    return;
                }
                this.f2883a = true;
                this.f2886d = true;
                a aVar = this.f2884b;
                Object obj = this.f2885c;
                if (aVar != null) {
                    try {
                        aVar.mo3463a();
                    } catch (Throwable th) {
                        synchronized (this) {
                            this.f2886d = false;
                            notifyAll();
                            throw th;
                        }
                    }
                }
                if (obj != null) {
                    ((CancellationSignal) obj).cancel();
                }
                synchronized (this) {
                    this.f2886d = false;
                    notifyAll();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public Object m3461b() {
        Object obj;
        synchronized (this) {
            try {
                if (this.f2885c == null) {
                    CancellationSignal cancellationSignal = new CancellationSignal();
                    this.f2885c = cancellationSignal;
                    if (this.f2883a) {
                        cancellationSignal.cancel();
                    }
                }
                obj = this.f2885c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    /* JADX INFO: renamed from: c */
    public void m3462c(a aVar) {
        synchronized (this) {
            try {
                m3459d();
                if (this.f2884b == aVar) {
                    return;
                }
                this.f2884b = aVar;
                if (this.f2883a && aVar != null) {
                    aVar.mo3463a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
