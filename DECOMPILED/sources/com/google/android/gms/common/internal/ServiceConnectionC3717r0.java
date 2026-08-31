package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.StrictMode;
import com.google.android.gms.common.util.AbstractC3771z;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import p170W2.C1837b;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.r0 */
/* JADX INFO: loaded from: classes.dex */
final class ServiceConnectionC3717r0 implements ServiceConnection, InterfaceC3725v0 {

    /* JADX INFO: renamed from: a */
    private final Map f14832a = new HashMap();

    /* JADX INFO: renamed from: b */
    private int f14833b = 2;

    /* JADX INFO: renamed from: c */
    private boolean f14834c;

    /* JADX INFO: renamed from: d */
    private IBinder f14835d;

    /* JADX INFO: renamed from: e */
    private final C3715q0 f14836e;

    /* JADX INFO: renamed from: f */
    private ComponentName f14837f;

    /* JADX INFO: renamed from: r */
    final /* synthetic */ C3723u0 f14838r;

    public ServiceConnectionC3717r0(C3723u0 c3723u0, C3715q0 c3715q0) {
        this.f14838r = c3723u0;
        this.f14836e = c3715q0;
    }

    /* JADX INFO: renamed from: d */
    static /* bridge */ /* synthetic */ C1837b m18062d(ServiceConnectionC3717r0 serviceConnectionC3717r0, String str, Executor executor) {
        try {
            Intent intentM18058b = serviceConnectionC3717r0.f14836e.m18058b(serviceConnectionC3717r0.f14838r.f14849h);
            serviceConnectionC3717r0.f14833b = 3;
            StrictMode.VmPolicy vmPolicyM18218a = AbstractC3771z.m18218a();
            try {
                C3723u0 c3723u0 = serviceConnectionC3717r0.f14838r;
                boolean zM14811d = c3723u0.f14852k.m14811d(c3723u0.f14849h, str, intentM18058b, serviceConnectionC3717r0, 4225, executor);
                serviceConnectionC3717r0.f14834c = zM14811d;
                if (zM14811d) {
                    serviceConnectionC3717r0.f14838r.f14850i.sendMessageDelayed(serviceConnectionC3717r0.f14838r.f14850i.obtainMessage(1, serviceConnectionC3717r0.f14836e), serviceConnectionC3717r0.f14838r.f14854m);
                    return C1837b.f5972e;
                }
                serviceConnectionC3717r0.f14833b = 2;
                try {
                    C3723u0 c3723u1 = serviceConnectionC3717r0.f14838r;
                    c3723u1.f14852k.m14810c(c3723u1.f14849h, serviceConnectionC3717r0);
                } catch (IllegalArgumentException unused) {
                }
                return new C1837b(16);
            } finally {
                StrictMode.setVmPolicy(vmPolicyM18218a);
            }
        } catch (C3691e0 e7) {
            return e7.f14765a;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m18063a() {
        return this.f14833b;
    }

    /* JADX INFO: renamed from: b */
    public final ComponentName m18064b() {
        return this.f14837f;
    }

    /* JADX INFO: renamed from: c */
    public final IBinder m18065c() {
        return this.f14835d;
    }

    /* JADX INFO: renamed from: e */
    public final void m18066e(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f14832a.put(serviceConnection, serviceConnection2);
    }

    /* JADX INFO: renamed from: f */
    public final void m18067f(ServiceConnection serviceConnection, String str) {
        this.f14832a.remove(serviceConnection);
    }

    /* JADX INFO: renamed from: g */
    public final void m18068g(String str) {
        this.f14838r.f14850i.removeMessages(1, this.f14836e);
        C3723u0 c3723u0 = this.f14838r;
        c3723u0.f14852k.m14810c(c3723u0.f14849h, this);
        this.f14834c = false;
        this.f14833b = 2;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m18069h(ServiceConnection serviceConnection) {
        return this.f14832a.containsKey(serviceConnection);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m18070i() {
        return this.f14832a.isEmpty();
    }

    /* JADX INFO: renamed from: j */
    public final boolean m18071j() {
        return this.f14834c;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f14838r.f14848g) {
            try {
                this.f14838r.f14850i.removeMessages(1, this.f14836e);
                this.f14835d = iBinder;
                this.f14837f = componentName;
                Iterator it = this.f14832a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f14833b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f14838r.f14848g) {
            try {
                this.f14838r.f14850i.removeMessages(1, this.f14836e);
                this.f14835d = null;
                this.f14837f = componentName;
                Iterator it = this.f14832a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f14833b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
