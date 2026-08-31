package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.s0 */
/* JADX INFO: loaded from: classes.dex */
final class C3719s0 implements Handler.Callback {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C3723u0 f14839a;

    /* synthetic */ C3719s0(C3723u0 c3723u0, AbstractC3721t0 abstractC3721t0) {
        this.f14839a = c3723u0;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i7 = message.what;
        if (i7 == 0) {
            synchronized (this.f14839a.f14848g) {
                try {
                    C3715q0 c3715q0 = (C3715q0) message.obj;
                    ServiceConnectionC3717r0 serviceConnectionC3717r0 = (ServiceConnectionC3717r0) this.f14839a.f14848g.get(c3715q0);
                    if (serviceConnectionC3717r0 != null && serviceConnectionC3717r0.m18070i()) {
                        if (serviceConnectionC3717r0.m18071j()) {
                            serviceConnectionC3717r0.m18068g("GmsClientSupervisor");
                        }
                        this.f14839a.f14848g.remove(c3715q0);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
        if (i7 != 1) {
            return false;
        }
        synchronized (this.f14839a.f14848g) {
            try {
                C3715q0 c3715q1 = (C3715q0) message.obj;
                ServiceConnectionC3717r0 serviceConnectionC3717r1 = (ServiceConnectionC3717r0) this.f14839a.f14848g.get(c3715q1);
                if (serviceConnectionC3717r1 != null && serviceConnectionC3717r1.m18063a() == 3) {
                    Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback " + String.valueOf(c3715q1), new Exception());
                    ComponentName componentNameM18064b = serviceConnectionC3717r1.m18064b();
                    if (componentNameM18064b == null) {
                        componentNameM18064b = c3715q1.m18057a();
                    }
                    if (componentNameM18064b == null) {
                        String strM18059c = c3715q1.m18059c();
                        AbstractC3718s.m18083l(strM18059c);
                        componentNameM18064b = new ComponentName(strM18059c, "unknown");
                    }
                    serviceConnectionC3717r1.onServiceDisconnected(componentNameM18064b);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }
}
