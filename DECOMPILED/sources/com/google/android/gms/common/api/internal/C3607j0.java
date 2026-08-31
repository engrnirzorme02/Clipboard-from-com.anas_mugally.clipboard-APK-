package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.util.Log;
import androidx.appcompat.app.AbstractC2263x;
import com.google.android.gms.common.api.AbstractC3560h;
import com.google.android.gms.common.api.AbstractC3561i;
import com.google.android.gms.common.api.AbstractC3645o;
import com.google.android.gms.common.api.AbstractC3646p;
import com.google.android.gms.common.api.InterfaceC3641k;
import com.google.android.gms.common.api.InterfaceC3643m;
import com.google.android.gms.common.api.InterfaceC3644n;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC3718s;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.j0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3607j0 extends AbstractC3646p implements InterfaceC3644n {

    /* JADX INFO: renamed from: e */
    private final WeakReference f14666e;

    /* JADX INFO: renamed from: f */
    private final HandlerC3603h0 f14667f;

    /* JADX INFO: renamed from: a */
    private C3607j0 f14662a = null;

    /* JADX INFO: renamed from: b */
    private AbstractC3561i f14663b = null;

    /* JADX INFO: renamed from: c */
    private final Object f14664c = new Object();

    /* JADX INFO: renamed from: d */
    private Status f14665d = null;

    /* JADX INFO: renamed from: g */
    private boolean f14668g = false;

    public C3607j0(WeakReference weakReference) {
        AbstractC3718s.m18084m(weakReference, "GoogleApiClient reference must not be null");
        this.f14666e = weakReference;
        AbstractC3560h abstractC3560h = (AbstractC3560h) weakReference.get();
        this.f14667f = new HandlerC3603h0(this, abstractC3560h != null ? abstractC3560h.mo17775f() : Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public final void m17915g(Status status) {
        synchronized (this.f14664c) {
            this.f14665d = status;
            m17917i(status);
        }
    }

    /* JADX INFO: renamed from: h */
    private final void m17916h() {
    }

    /* JADX INFO: renamed from: i */
    private final void m17917i(Status status) {
        synchronized (this.f14664c) {
            try {
                if (m17918j()) {
                    AbstractC2263x.m9328a(AbstractC3718s.m18083l(null));
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    private final boolean m17918j() {
        return false;
    }

    /* JADX INFO: renamed from: k */
    private static final void m17919k(InterfaceC3643m interfaceC3643m) {
        if (interfaceC3643m instanceof InterfaceC3641k) {
            try {
                ((InterfaceC3641k) interfaceC3643m).release();
            } catch (RuntimeException e7) {
                Log.w("TransformedResultImpl", "Unable to release ".concat(String.valueOf(interfaceC3643m)), e7);
            }
        }
    }

    @Override // com.google.android.gms.common.api.InterfaceC3644n
    /* JADX INFO: renamed from: a */
    public final void mo17920a(InterfaceC3643m interfaceC3643m) {
        synchronized (this.f14664c) {
            try {
                if (!interfaceC3643m.getStatus().m17747X()) {
                    m17915g(interfaceC3643m.getStatus());
                    m17919k(interfaceC3643m);
                } else if (m17918j()) {
                    AbstractC2263x.m9328a(AbstractC3718s.m18083l(null));
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC3646p m17921b(AbstractC3645o abstractC3645o) {
        C3607j0 c3607j0;
        synchronized (this.f14664c) {
            AbstractC3718s.m18087p(true, "Cannot call then() twice.");
            AbstractC3718s.m18087p(true, "Cannot call then() and andFinally() on the same TransformedResult.");
            c3607j0 = new C3607j0(this.f14666e);
            this.f14662a = c3607j0;
            m17916h();
        }
        return c3607j0;
    }

    /* JADX INFO: renamed from: f */
    public final void m17922f(AbstractC3561i abstractC3561i) {
        synchronized (this.f14664c) {
            this.f14663b = abstractC3561i;
            m17916h();
        }
    }
}
