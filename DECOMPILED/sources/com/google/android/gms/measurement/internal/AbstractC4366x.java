package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.internal.measurement.zzcn;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.x */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC4366x {

    /* JADX INFO: renamed from: d */
    private static volatile Handler f16192d;

    /* JADX INFO: renamed from: a */
    private final InterfaceC4011C3 f16193a;

    /* JADX INFO: renamed from: b */
    private final Runnable f16194b;

    /* JADX INFO: renamed from: c */
    private volatile long f16195c;

    AbstractC4366x(InterfaceC4011C3 interfaceC4011C3) {
        AbstractC3718s.m18083l(interfaceC4011C3);
        this.f16193a = interfaceC4011C3;
        this.f16194b = new RunnableC4358w(this, interfaceC4011C3);
    }

    /* JADX INFO: renamed from: f */
    private final Handler m19248f() {
        Handler handler;
        if (f16192d != null) {
            return f16192d;
        }
        synchronized (AbstractC4366x.class) {
            try {
                if (f16192d == null) {
                    f16192d = new zzcn(this.f16193a.mo18424e().getMainLooper());
                }
                handler = f16192d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo18529a();

    /* JADX INFO: renamed from: b */
    public final void m19249b(long j7) {
        m19251d();
        if (j7 >= 0) {
            InterfaceC4011C3 interfaceC4011C3 = this.f16193a;
            this.f16195c = interfaceC4011C3.mo18425f().mo18159a();
            if (m19248f().postDelayed(this.f16194b, j7)) {
                return;
            }
            interfaceC4011C3.mo18421a().m18851o().m18835b("Failed to schedule delayed post. time", Long.valueOf(j7));
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m19250c() {
        return this.f16195c != 0;
    }

    /* JADX INFO: renamed from: d */
    final void m19251d() {
        this.f16195c = 0L;
        m19248f().removeCallbacks(this.f16194b);
    }

    /* JADX INFO: renamed from: e */
    final /* synthetic */ void m19252e(long j7) {
        this.f16195c = 0L;
    }
}
