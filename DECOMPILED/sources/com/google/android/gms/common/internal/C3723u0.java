package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.common.zzh;
import java.util.HashMap;
import java.util.concurrent.Executor;
import p170W2.C1837b;
import p209b3.C2959a;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.u0 */
/* JADX INFO: loaded from: classes.dex */
final class C3723u0 extends AbstractC3698i {

    /* JADX INFO: renamed from: g */
    private final HashMap f14848g = new HashMap();

    /* JADX INFO: renamed from: h */
    private final Context f14849h;

    /* JADX INFO: renamed from: i */
    private volatile Handler f14850i;

    /* JADX INFO: renamed from: j */
    private final C3719s0 f14851j;

    /* JADX INFO: renamed from: k */
    private final C2959a f14852k;

    /* JADX INFO: renamed from: l */
    private final long f14853l;

    /* JADX INFO: renamed from: m */
    private final long f14854m;

    /* JADX INFO: renamed from: n */
    private volatile Executor f14855n;

    C3723u0(Context context, Looper looper, Executor executor) {
        C3719s0 c3719s0 = new C3719s0(this, null);
        this.f14851j = c3719s0;
        this.f14849h = context.getApplicationContext();
        this.f14850i = new zzh(looper, c3719s0);
        this.f14852k = C2959a.m14804b();
        this.f14853l = 5000L;
        this.f14854m = 300000L;
        this.f14855n = executor;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3698i
    /* JADX INFO: renamed from: c */
    protected final C1837b mo18036c(C3715q0 c3715q0, ServiceConnection serviceConnection, String str, Executor executor) {
        C1837b c1837bM18062d;
        AbstractC3718s.m18084m(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f14848g) {
            try {
                ServiceConnectionC3717r0 serviceConnectionC3717r0 = (ServiceConnectionC3717r0) this.f14848g.get(c3715q0);
                if (executor == null) {
                    executor = this.f14855n;
                }
                if (serviceConnectionC3717r0 == null) {
                    serviceConnectionC3717r0 = new ServiceConnectionC3717r0(this, c3715q0);
                    serviceConnectionC3717r0.m18066e(serviceConnection, serviceConnection, str);
                    c1837bM18062d = ServiceConnectionC3717r0.m18062d(serviceConnectionC3717r0, str, executor);
                    this.f14848g.put(c3715q0, serviceConnectionC3717r0);
                } else {
                    this.f14850i.removeMessages(0, c3715q0);
                    if (serviceConnectionC3717r0.m18069h(serviceConnection)) {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + c3715q0.toString());
                    }
                    serviceConnectionC3717r0.m18066e(serviceConnection, serviceConnection, str);
                    int iM18063a = serviceConnectionC3717r0.m18063a();
                    if (iM18063a == 1) {
                        serviceConnection.onServiceConnected(serviceConnectionC3717r0.m18064b(), serviceConnectionC3717r0.m18065c());
                    } else if (iM18063a == 2) {
                        c1837bM18062d = ServiceConnectionC3717r0.m18062d(serviceConnectionC3717r0, str, executor);
                    }
                    c1837bM18062d = null;
                }
                if (serviceConnectionC3717r0.m18071j()) {
                    return C1837b.f5972e;
                }
                if (c1837bM18062d == null) {
                    c1837bM18062d = new C1837b(-1);
                }
                return c1837bM18062d;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC3698i
    /* JADX INFO: renamed from: d */
    protected final void mo18037d(C3715q0 c3715q0, ServiceConnection serviceConnection, String str) {
        AbstractC3718s.m18084m(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f14848g) {
            try {
                ServiceConnectionC3717r0 serviceConnectionC3717r0 = (ServiceConnectionC3717r0) this.f14848g.get(c3715q0);
                if (serviceConnectionC3717r0 == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: " + c3715q0.toString());
                }
                if (!serviceConnectionC3717r0.m18069h(serviceConnection)) {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + c3715q0.toString());
                }
                serviceConnectionC3717r0.m18067f(serviceConnection, str);
                if (serviceConnectionC3717r0.m18070i()) {
                    this.f14850i.sendMessageDelayed(this.f14850i.obtainMessage(0, c3715q0), this.f14853l);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
