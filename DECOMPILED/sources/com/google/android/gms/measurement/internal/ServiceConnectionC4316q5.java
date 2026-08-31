package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.internal.AbstractC3686c;
import com.google.android.gms.common.internal.AbstractC3718s;
import java.util.Objects;
import p170W2.C1837b;
import p209b3.C2959a;
import p283k3.InterfaceC6033d;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.q5 */
/* JADX INFO: loaded from: classes2.dex */
public final class ServiceConnectionC4316q5 implements ServiceConnection, AbstractC3686c.a, AbstractC3686c.b {

    /* JADX INFO: renamed from: a */
    private volatile boolean f15979a;

    /* JADX INFO: renamed from: b */
    private volatile C4265k2 f15980b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C4364w5 f15981c;

    protected ServiceConnectionC4316q5(C4364w5 c4364w5) {
        Objects.requireNonNull(c4364w5);
        this.f15981c = c4364w5;
    }

    /* JADX INFO: renamed from: a */
    public final void m18862a(Intent intent) {
        C4364w5 c4364w5 = this.f15981c;
        c4364w5.mo18427h();
        Context contextMo18424e = c4364w5.f15066a.mo18424e();
        C2959a c2959aM14804b = C2959a.m14804b();
        synchronized (this) {
            try {
                if (this.f15979a) {
                    this.f15981c.f15066a.mo18421a().m18859w().m18834a("Connection attempt already in progress");
                    return;
                }
                C4364w5 c4364w6 = this.f15981c;
                c4364w6.f15066a.mo18421a().m18859w().m18834a("Using local app measurement service");
                this.f15979a = true;
                c2959aM14804b.m14809a(contextMo18424e, intent, c4364w6.m19214M(), 129);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m18863b() {
        if (this.f15980b != null && (this.f15980b.isConnected() || this.f15980b.isConnecting())) {
            this.f15980b.disconnect();
        }
        this.f15980b = null;
    }

    /* JADX INFO: renamed from: c */
    public final void m18864c() {
        C4364w5 c4364w5 = this.f15981c;
        c4364w5.mo18427h();
        Context contextMo18424e = c4364w5.f15066a.mo18424e();
        synchronized (this) {
            try {
                if (this.f15979a) {
                    this.f15981c.f15066a.mo18421a().m18859w().m18834a("Connection attempt already in progress");
                    return;
                }
                if (this.f15980b != null && (this.f15980b.isConnecting() || this.f15980b.isConnected())) {
                    this.f15981c.f15066a.mo18421a().m18859w().m18834a("Already awaiting connection attempt");
                    return;
                }
                this.f15980b = new C4265k2(contextMo18424e, Looper.getMainLooper(), this, this);
                this.f15981c.f15066a.mo18421a().m18859w().m18834a("Connecting to remote service");
                this.f15979a = true;
                AbstractC3718s.m18083l(this.f15980b);
                this.f15980b.checkAvailabilityAndConnect();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    final /* synthetic */ void m18865d(boolean z7) {
        this.f15979a = false;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c.a
    public final void onConnected(Bundle bundle) {
        this.f15981c.f15066a.mo18422b().m18634o();
        synchronized (this) {
            try {
                AbstractC3718s.m18083l(this.f15980b);
                this.f15981c.f15066a.mo18422b().m18639t(new RunnableC4276l5(this, (InterfaceC6033d) this.f15980b.getService()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f15980b = null;
                this.f15979a = false;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c.b
    public final void onConnectionFailed(C1837b c1837b) {
        C4364w5 c4364w5 = this.f15981c;
        c4364w5.f15066a.mo18422b().m18634o();
        C4313q2 c4313q2M18688y = c4364w5.f15066a.m18688y();
        if (c4313q2M18688y != null) {
            c4313q2M18688y.m18859w().m18835b("Service connection failed", c1837b);
        }
        synchronized (this) {
            this.f15979a = false;
            this.f15980b = null;
        }
        this.f15981c.f15066a.mo18422b().m18639t(new RunnableC4308p5(this, c1837b));
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c.a
    public final void onConnectionSuspended(int i7) {
        C4164X2 c4164x2 = this.f15981c.f15066a;
        c4164x2.mo18422b().m18634o();
        c4164x2.mo18421a().m18858v().m18834a("Service connection suspended");
        c4164x2.mo18422b().m18639t(new RunnableC4284m5(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f15981c.f15066a.mo18422b().m18634o();
        synchronized (this) {
            if (iBinder == null) {
                this.f15979a = false;
                this.f15981c.f15066a.mo18421a().m18851o().m18834a("Service connected with null binder");
                return;
            }
            InterfaceC6033d c4217e2 = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    c4217e2 = iInterfaceQueryLocalInterface instanceof InterfaceC6033d ? (InterfaceC6033d) iInterfaceQueryLocalInterface : new C4217e2(iBinder);
                    this.f15981c.f15066a.mo18421a().m18859w().m18834a("Bound to IMeasurementService interface");
                } else {
                    this.f15981c.f15066a.mo18421a().m18851o().m18835b("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.f15981c.f15066a.mo18421a().m18851o().m18834a("Service connect failed to get IMeasurementService");
            }
            if (c4217e2 == null) {
                this.f15979a = false;
                try {
                    C2959a c2959aM14804b = C2959a.m14804b();
                    C4364w5 c4364w5 = this.f15981c;
                    c2959aM14804b.m14810c(c4364w5.f15066a.mo18424e(), c4364w5.m19214M());
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.f15981c.f15066a.mo18422b().m18639t(new RunnableC4252i5(this, c4217e2));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C4164X2 c4164x2 = this.f15981c.f15066a;
        c4164x2.mo18422b().m18634o();
        c4164x2.mo18421a().m18858v().m18834a("Service disconnected");
        c4164x2.mo18422b().m18639t(new RunnableC4260j5(this, componentName));
    }
}
