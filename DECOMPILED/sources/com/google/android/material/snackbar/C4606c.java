package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.google.android.material.snackbar.c */
/* JADX INFO: loaded from: classes2.dex */
class C4606c {

    /* JADX INFO: renamed from: e */
    private static C4606c f17797e;

    /* JADX INFO: renamed from: a */
    private final Object f17798a = new Object();

    /* JADX INFO: renamed from: b */
    private final Handler f17799b = new Handler(Looper.getMainLooper(), new a());

    /* JADX INFO: renamed from: c */
    private c f17800c;

    /* JADX INFO: renamed from: d */
    private c f17801d;

    /* JADX INFO: renamed from: com.google.android.material.snackbar.c$a */
    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            C4606c.this.m21299d((c) message.obj);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.c$b */
    interface b {
        /* JADX INFO: renamed from: b */
        void mo21267b();

        /* JADX INFO: renamed from: c */
        void mo21268c(int i7);
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.c$c */
    private static class c {

        /* JADX INFO: renamed from: a */
        final WeakReference f17803a;

        /* JADX INFO: renamed from: b */
        int f17804b;

        /* JADX INFO: renamed from: c */
        boolean f17805c;

        c(int i7, b bVar) {
            this.f17803a = new WeakReference(bVar);
            this.f17804b = i7;
        }

        /* JADX INFO: renamed from: a */
        boolean m21306a(b bVar) {
            return bVar != null && this.f17803a.get() == bVar;
        }
    }

    private C4606c() {
    }

    /* JADX INFO: renamed from: a */
    private boolean m21292a(c cVar, int i7) {
        b bVar = (b) cVar.f17803a.get();
        if (bVar == null) {
            return false;
        }
        this.f17799b.removeCallbacksAndMessages(cVar);
        bVar.mo21268c(i7);
        return true;
    }

    /* JADX INFO: renamed from: c */
    static C4606c m21293c() {
        if (f17797e == null) {
            f17797e = new C4606c();
        }
        return f17797e;
    }

    /* JADX INFO: renamed from: f */
    private boolean m21294f(b bVar) {
        c cVar = this.f17800c;
        return cVar != null && cVar.m21306a(bVar);
    }

    /* JADX INFO: renamed from: g */
    private boolean m21295g(b bVar) {
        c cVar = this.f17801d;
        return cVar != null && cVar.m21306a(bVar);
    }

    /* JADX INFO: renamed from: l */
    private void m21296l(c cVar) {
        int i7 = cVar.f17804b;
        if (i7 == -2) {
            return;
        }
        if (i7 <= 0) {
            i7 = i7 == -1 ? 1500 : 2750;
        }
        this.f17799b.removeCallbacksAndMessages(cVar);
        Handler handler = this.f17799b;
        handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), i7);
    }

    /* JADX INFO: renamed from: n */
    private void m21297n() {
        c cVar = this.f17801d;
        if (cVar != null) {
            this.f17800c = cVar;
            this.f17801d = null;
            b bVar = (b) cVar.f17803a.get();
            if (bVar != null) {
                bVar.mo21267b();
            } else {
                this.f17800c = null;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m21298b(b bVar, int i7) {
        synchronized (this.f17798a) {
            try {
                if (m21294f(bVar)) {
                    m21292a(this.f17800c, i7);
                } else if (m21295g(bVar)) {
                    m21292a(this.f17801d, i7);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    void m21299d(c cVar) {
        synchronized (this.f17798a) {
            try {
                if (this.f17800c == cVar || this.f17801d == cVar) {
                    m21292a(cVar, 2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean m21300e(b bVar) {
        boolean z7;
        synchronized (this.f17798a) {
            try {
                z7 = m21294f(bVar) || m21295g(bVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return z7;
    }

    /* JADX INFO: renamed from: h */
    public void m21301h(b bVar) {
        synchronized (this.f17798a) {
            try {
                if (m21294f(bVar)) {
                    this.f17800c = null;
                    if (this.f17801d != null) {
                        m21297n();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public void m21302i(b bVar) {
        synchronized (this.f17798a) {
            try {
                if (m21294f(bVar)) {
                    m21296l(this.f17800c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public void m21303j(b bVar) {
        synchronized (this.f17798a) {
            try {
                if (m21294f(bVar)) {
                    c cVar = this.f17800c;
                    if (!cVar.f17805c) {
                        cVar.f17805c = true;
                        this.f17799b.removeCallbacksAndMessages(cVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m21304k(b bVar) {
        synchronized (this.f17798a) {
            try {
                if (m21294f(bVar)) {
                    c cVar = this.f17800c;
                    if (cVar.f17805c) {
                        cVar.f17805c = false;
                        m21296l(cVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public void m21305m(int i7, b bVar) {
        synchronized (this.f17798a) {
            try {
                if (m21294f(bVar)) {
                    c cVar = this.f17800c;
                    cVar.f17804b = i7;
                    this.f17799b.removeCallbacksAndMessages(cVar);
                    m21296l(this.f17800c);
                    return;
                }
                if (m21295g(bVar)) {
                    this.f17801d.f17804b = i7;
                } else {
                    this.f17801d = new c(i7, bVar);
                }
                c cVar2 = this.f17800c;
                if (cVar2 == null || !m21292a(cVar2, 4)) {
                    this.f17800c = null;
                    m21297n();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
