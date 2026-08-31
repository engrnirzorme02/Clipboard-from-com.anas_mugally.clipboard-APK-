package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
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
import com.google.android.gms.common.internal.InterfaceC3704l;
import com.google.android.gms.internal.base.zau;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class BasePendingResult<R extends InterfaceC3643m> extends AbstractC3561i {
    static final ThreadLocal zaa = new C3627t0();
    public static final /* synthetic */ int zad = 0;
    private C3631v0 resultGuardian;
    protected final HandlerC3564a zab;
    protected final WeakReference zac;
    private InterfaceC3644n zah;
    private InterfaceC3643m zaj;
    private Status zak;
    private volatile boolean zal;
    private boolean zam;
    private boolean zan;
    private InterfaceC3704l zao;
    private volatile C3607j0 zap;
    private final Object zae = new Object();
    private final CountDownLatch zaf = new CountDownLatch(1);
    private final ArrayList zag = new ArrayList();
    private final AtomicReference zai = new AtomicReference();
    private boolean zaq = false;

    /* JADX INFO: renamed from: com.google.android.gms.common.api.internal.BasePendingResult$a */
    public static class HandlerC3564a extends zau {
        public HandlerC3564a(Looper looper) {
            super(looper);
        }

        /* JADX INFO: renamed from: a */
        public final void m17790a(InterfaceC3644n interfaceC3644n, InterfaceC3643m interfaceC3643m) {
            int i7 = BasePendingResult.zad;
            sendMessage(obtainMessage(1, new Pair((InterfaceC3644n) AbstractC3718s.m18083l(interfaceC3644n), interfaceC3643m)));
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i7 = message.what;
            if (i7 != 1) {
                if (i7 == 2) {
                    ((BasePendingResult) message.obj).forceFailureUnlessReady(Status.f14516t);
                    return;
                }
                Log.wtf("BasePendingResult", "Don't know how to handle message: " + i7, new Exception());
                return;
            }
            Pair pair = (Pair) message.obj;
            InterfaceC3644n interfaceC3644n = (InterfaceC3644n) pair.first;
            InterfaceC3643m interfaceC3643m = (InterfaceC3643m) pair.second;
            try {
                interfaceC3644n.mo17920a(interfaceC3643m);
            } catch (RuntimeException e7) {
                BasePendingResult.zal(interfaceC3643m);
                throw e7;
            }
        }
    }

    protected BasePendingResult(AbstractC3560h abstractC3560h) {
        this.zab = new HandlerC3564a(abstractC3560h != null ? abstractC3560h.mo17775f() : Looper.getMainLooper());
        this.zac = new WeakReference(abstractC3560h);
    }

    /* JADX INFO: renamed from: a */
    private final InterfaceC3643m m17788a() {
        InterfaceC3643m interfaceC3643m;
        synchronized (this.zae) {
            AbstractC3718s.m18087p(!this.zal, "Result has already been consumed.");
            AbstractC3718s.m18087p(isReady(), "Result is not ready.");
            interfaceC3643m = this.zaj;
            this.zaj = null;
            this.zah = null;
            this.zal = true;
        }
        AbstractC2263x.m9328a(this.zai.getAndSet(null));
        return (InterfaceC3643m) AbstractC3718s.m18083l(interfaceC3643m);
    }

    /* JADX INFO: renamed from: b */
    private final void m17789b(InterfaceC3643m interfaceC3643m) {
        this.zaj = interfaceC3643m;
        this.zak = interfaceC3643m.getStatus();
        this.zaf.countDown();
        AbstractC3629u0 abstractC3629u0 = null;
        if (this.zam) {
            this.zah = null;
        } else {
            InterfaceC3644n interfaceC3644n = this.zah;
            if (interfaceC3644n != null) {
                this.zab.removeMessages(2);
                this.zab.m17790a(interfaceC3644n, m17788a());
            } else if (this.zaj instanceof InterfaceC3641k) {
                this.resultGuardian = new C3631v0(this, abstractC3629u0);
            }
        }
        ArrayList arrayList = this.zag;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((AbstractC3561i.a) arrayList.get(i7)).mo17779a(this.zak);
        }
        this.zag.clear();
    }

    public static void zal(InterfaceC3643m interfaceC3643m) {
        if (interfaceC3643m instanceof InterfaceC3641k) {
            try {
                ((InterfaceC3641k) interfaceC3643m).release();
            } catch (RuntimeException e7) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(interfaceC3643m)), e7);
            }
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC3561i
    public final void addStatusListener(AbstractC3561i.a aVar) {
        AbstractC3718s.m18073b(aVar != null, "Callback cannot be null.");
        synchronized (this.zae) {
            try {
                if (isReady()) {
                    aVar.mo17779a(this.zak);
                } else {
                    this.zag.add(aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @ResultIgnorabilityUnspecified
    public final R await() {
        AbstractC3718s.m18082k("await must not be called on the UI thread");
        AbstractC3718s.m18087p(!this.zal, "Result has already been consumed");
        AbstractC3718s.m18087p(this.zap == null, "Cannot await if then() has been called.");
        try {
            this.zaf.await();
        } catch (InterruptedException unused) {
            forceFailureUnlessReady(Status.f14514r);
        }
        AbstractC3718s.m18087p(isReady(), "Result is not ready.");
        return (R) m17788a();
    }

    public void cancel() {
        synchronized (this.zae) {
            try {
                if (!this.zam && !this.zal) {
                    zal(this.zaj);
                    this.zam = true;
                    m17789b(createFailedResult(Status.f14517u));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected abstract InterfaceC3643m createFailedResult(Status status);

    @Deprecated
    public final void forceFailureUnlessReady(Status status) {
        synchronized (this.zae) {
            try {
                if (!isReady()) {
                    setResult(createFailedResult(status));
                    this.zan = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean isCanceled() {
        boolean z7;
        synchronized (this.zae) {
            z7 = this.zam;
        }
        return z7;
    }

    public final boolean isReady() {
        return this.zaf.getCount() == 0;
    }

    protected final void setCancelToken(InterfaceC3704l interfaceC3704l) {
        synchronized (this.zae) {
        }
    }

    public final void setResult(R r7) {
        synchronized (this.zae) {
            try {
                if (this.zan || this.zam) {
                    zal(r7);
                    return;
                }
                isReady();
                AbstractC3718s.m18087p(!isReady(), "Results have already been set");
                AbstractC3718s.m18087p(!this.zal, "Result has already been consumed");
                m17789b(r7);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void setResultCallback(InterfaceC3644n interfaceC3644n) {
        synchronized (this.zae) {
            try {
                if (interfaceC3644n == null) {
                    this.zah = null;
                    return;
                }
                boolean z7 = true;
                AbstractC3718s.m18087p(!this.zal, "Result has already been consumed.");
                if (this.zap != null) {
                    z7 = false;
                }
                AbstractC3718s.m18087p(z7, "Cannot set callbacks if then() has been called.");
                if (isCanceled()) {
                    return;
                }
                if (isReady()) {
                    this.zab.m17790a(interfaceC3644n, m17788a());
                } else {
                    this.zah = interfaceC3644n;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final <S extends InterfaceC3643m> AbstractC3646p then(AbstractC3645o abstractC3645o) {
        AbstractC3646p abstractC3646pM17921b;
        AbstractC3718s.m18087p(!this.zal, "Result has already been consumed.");
        synchronized (this.zae) {
            try {
                AbstractC3718s.m18087p(this.zap == null, "Cannot call then() twice.");
                AbstractC3718s.m18087p(this.zah == null, "Cannot call then() if callbacks are set.");
                AbstractC3718s.m18087p(!this.zam, "Cannot call then() if result was canceled.");
                this.zaq = true;
                this.zap = new C3607j0(this.zac);
                abstractC3646pM17921b = this.zap.m17921b(abstractC3645o);
                if (isReady()) {
                    this.zab.m17790a(this.zap, m17788a());
                } else {
                    this.zah = this.zap;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return abstractC3646pM17921b;
    }

    public final void zak() {
        boolean z7 = true;
        if (!this.zaq && !((Boolean) zaa.get()).booleanValue()) {
            z7 = false;
        }
        this.zaq = z7;
    }

    public final boolean zam() {
        boolean zIsCanceled;
        synchronized (this.zae) {
            try {
                if (((AbstractC3560h) this.zac.get()) == null || !this.zaq) {
                    cancel();
                }
                zIsCanceled = isCanceled();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zIsCanceled;
    }

    public final void zan(AbstractC3609k0 abstractC3609k0) {
        this.zai.set(abstractC3609k0);
    }

    @Override // com.google.android.gms.common.api.AbstractC3561i
    @ResultIgnorabilityUnspecified
    public final R await(long j7, TimeUnit timeUnit) {
        if (j7 > 0) {
            AbstractC3718s.m18082k("await must not be called on the UI thread when time is greater than zero.");
        }
        AbstractC3718s.m18087p(!this.zal, "Result has already been consumed.");
        AbstractC3718s.m18087p(this.zap == null, "Cannot await if then() has been called.");
        try {
            if (!this.zaf.await(j7, timeUnit)) {
                forceFailureUnlessReady(Status.f14516t);
            }
        } catch (InterruptedException unused) {
            forceFailureUnlessReady(Status.f14514r);
        }
        AbstractC3718s.m18087p(isReady(), "Result is not ready.");
        return (R) m17788a();
    }

    public final void setResultCallback(InterfaceC3644n interfaceC3644n, long j7, TimeUnit timeUnit) {
        synchronized (this.zae) {
            try {
                if (interfaceC3644n == null) {
                    this.zah = null;
                    return;
                }
                boolean z7 = true;
                AbstractC3718s.m18087p(!this.zal, "Result has already been consumed.");
                if (this.zap != null) {
                    z7 = false;
                }
                AbstractC3718s.m18087p(z7, "Cannot set callbacks if then() has been called.");
                if (isCanceled()) {
                    return;
                }
                if (isReady()) {
                    this.zab.m17790a(interfaceC3644n, m17788a());
                } else {
                    this.zah = interfaceC3644n;
                    HandlerC3564a handlerC3564a = this.zab;
                    handlerC3564a.sendMessageDelayed(handlerC3564a.obtainMessage(2, this), timeUnit.toMillis(j7));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
